package Ejercicios;
import java.util.ArrayList;
public class Estudiante extends Usuario {
    //Cree una segunda clase llamada Estudiante que herede de Usuario, y adicional tenga los siguientes
    //atributos: carrera (String), materiasAprobadas (ArrayList<String>) y materiasInscriptas
    //(ArrayList<String>). Sugerencia: recuerde inicializar los ArrayList en la declaración. Defina un
    //constructor que reciba como parámetros todos los atributos de la clase padre y el atributo carrera.
    //Agregue getters y setters por cada atributo. Cree dos métodos, uno llamado
    //imprimirMateriasAprobadas y otro llamado imprimirMateriasInscriptas, en ambos casos la
    //invocación del método debe mostrar por pantalla un título (“Materias Aprobadas” o “Materias
    //Inscriptas”) seguido del nombre de cada materia en el ArrayList a imprimir.

    //ATRIBUTOS
    private  String carrera;
    private     ArrayList<String> materiasAprovadas = new ArrayList<String>();
    private     ArrayList<String> materiasInscriptas = new ArrayList<String>();



    //CONTRUCTOR

    public Estudiante(int dni, String nombre, String apellido, String carrera) {
        super(dni, nombre, apellido);
        this.carrera = carrera;
    }


    //Getter y setters

    public String getCarrera() {
        return carrera;
    }

    public ArrayList<String> getMateriasAprovadas() {
        return materiasAprovadas;
    }

    public ArrayList<String> getMateriasInscriptas() {
        return materiasInscriptas;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setMateriasAprovadas(ArrayList<String> materiasAprovadas) {
        this.materiasAprovadas = materiasAprovadas;
    }

    public void setMateriasInscriptas(ArrayList<String> materiasInscriptas) {
        this.materiasInscriptas = materiasInscriptas;
    }

    //METODOS
    public void imprimirMateriasAprovadas(){
        for (int i = 0; i < this.materiasAprovadas.size(); i++) {
            System.out.println("Materias aprovadas"+this.materiasAprovadas);
        }
    }
    public void imprimirMateriasInscriptas(){
        for (int i = 0; i < this.materiasInscriptas.size(); i++) {
            System.out.println("Materias inscriptas"+this.materiasInscriptas);
        }
    }





}
