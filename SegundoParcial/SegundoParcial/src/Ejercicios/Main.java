package Ejercicios;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
//profesor(dni:100, nombre: “John”, apellido: “Doe”)
//estudiante(dni: suDni, nombre: suNombre, apellido: suApellido, carrera: “Analista”)
//Adicional mediante el método add agregue tres materiasAprobadas y dos materiasInscriptas al
//objeto estudiante. Imprima ambos objetos, e invoque a los métodos imprimirMateriasAprobadas e
//imprimirMateriasInscriptas del objeto estudiante.

        Profesor primerProfesor = new Profesor(100,"John","Doe");
        Estudiante primerEstudiante = new Estudiante(41587049,"Ernesto","Loire","Analista de sistemas ");

        System.out.println(primerProfesor.toString());
        System.out.println(primerEstudiante.toString());

        primerEstudiante.getMateriasAprovadas().add("POO");
        primerEstudiante.getMateriasAprovadas().add("User Experience");

        primerEstudiante.getMateriasInscriptas().add("Prog. web");
        primerEstudiante.getMateriasInscriptas().add("Sist. empresariales");
        primerEstudiante.getMateriasInscriptas().add("Base de datos");

        primerEstudiante.imprimirMateriasAprovadas();
        primerEstudiante.imprimirMateriasInscriptas();


    }
}
