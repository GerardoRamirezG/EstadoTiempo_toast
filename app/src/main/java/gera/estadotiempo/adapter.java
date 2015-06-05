package gera.estadotiempo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by gera on 02/06/2015.
 */
public class adapter extends BaseAdapter{

    private ArrayList<ListClass> ListClass;
    private LayoutInflater inflater;
    private Context contexto;

    public adapter(ArrayList<ListClass> list, Context cont)
    {
        this.ListClass = list;
        this.inflater = LayoutInflater.from(cont);
        this.contexto = cont;

    }

    @Override
    public int getCount() {
        return ListClass.size();
    }

    @Override
    public Object getItem(int position) {
        return ListClass.get(position);

    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView= inflater.inflate(R.layout.layout_tiempo, null);
        ListClass list=ListClass.get(position);
        ImageView img = (ImageView) convertView.findViewById(R.id.imagen);
        TextView dia = (TextView) convertView.findViewById(R.id.dia);
        TextView estado = (TextView) convertView.findViewById(R.id.estado);
        TextView temperatura = (TextView) convertView.findViewById(R.id.temperatura);

        img.setImageDrawable(contexto.getResources().getDrawable(list.getImagen()));
        dia.setText(list.getDia());
        estado.setText(list.getEstado());
        temperatura.setText(list.getTemperatura());

        return convertView;
    }
}
