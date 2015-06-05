package gera.estadotiempo;

/**
 * Created by gera on 02/06/2015.
 */
public class ListClass {

    private String dia;
    private String estado;
    private String temperatura;
    private int imagen;


    public ListClass(String dia, String estado, String temperatura, int imagen) {
        this.dia = dia;
        this.estado = estado;
        this.temperatura = temperatura;
        this.imagen = imagen;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }




}

