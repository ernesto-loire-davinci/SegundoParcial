package Ejercicios;
import java.util.ArrayList;
public class Profesor extends Usuario {
    //Cree una tercera clase llamada Profesor que herede de Usuario, y adicional tenga los siguientes
    //atributos: comisiones (ArrayList<String>). Sugerencia: recuerde inicializar los ArrayList en la
    //declaración. Defina un constructor que reciba como parámetros todos los atributos de la clase padre.
    //Agregue un getter y setter al atributo comisiones. Cree un método llamado imprimirComisiones, la
    //invocación del método debe mostrar por pantalla un título (“Comisiones”) seguido del nombre de
    //cada comisión en el ArrayList a imprimir.


    //ATRIBUTOS
    private ArrayList<String> comisiones = new ArrayList<String>();

    //CONTRUCTOR

    public Profesor(int dni, String nombre, String apellido) {
        super(dni, nombre, apellido);
    }


    //Getter y setters

    public ArrayList<String> getComisiones() {
        return comisiones;
    }

    public void setComisiones(ArrayList<String> comisiones) {
        this.comisiones = comisiones;
    }
    //METODOS

    public void imprimirComisiones(){
        for (int i = 0; i < this.comisiones.size(); i++) {
            System.out.println("Comisiones"+this.comisiones);
        }
    }
}
