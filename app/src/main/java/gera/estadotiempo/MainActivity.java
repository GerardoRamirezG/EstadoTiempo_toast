package gera.estadotiempo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    ListView listado;

    ArrayList<ListClass> elementos;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listado= (ListView) findViewById(R.id.listado);

        elementos = new ArrayList<ListClass>();

        elementos.add(new ListClass("Lunes","Soleado","33/22",R.drawable.ic_launcher));
        elementos.add(new ListClass("Martes","Soleado","36/25",R.drawable.ic_launcher));
        elementos.add(new ListClass("Miercoles","Soleado","33/28",R.drawable.ic_launcher));
        elementos.add(new ListClass("Jueves","Soleado","35/29",R.drawable.ic_launcher));
        elementos.add(new ListClass("Viernes","Soleado","38/29",R.drawable.ic_launcher));
        elementos.add(new ListClass("Sabado","Soleado","30/28",R.drawable.ic_launcher));
        elementos.add(new ListClass("Domingo","Soleado","29/25",R.drawable.ic_launcher));

        adapter adapterElements = new adapter(elementos,MainActivity.this.getApplicationContext());

        listado.setAdapter(adapterElements);


            listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> pariente, View view, int posicion, long id) {
                ListClass seleccionado = (ListClass) pariente.getItemAtPosition(posicion);

                CharSequence texto = "El dia seleccionado es: " + seleccionado.getDia()+ "\nEl estado es: " + seleccionado.getEstado()+ "\nLa temperatura es de: " + seleccionado.getTemperatura();
                Toast toast = Toast.makeText(MainActivity.this, texto, Toast.LENGTH_LONG);
                toast.show();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
