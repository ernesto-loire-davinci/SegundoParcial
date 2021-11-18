package Ejercicios;

public abstract class Usuario {
    //Cree una clase abstracta llamada Usuario con los siguientes atributos: dni (int), nombre(String) y
    //apellido (String). Un constructor que reciba como parámetro todos los atributos mencionados.
    //Getters y Setters por cada atributo. Además redefina el método toString para que muestre el
    //siguiente mensaje:  ̈El dni del  ̈ + NombreClase +  ̈ es  ̈ + dniUsuario.


    //ATRIBUTOS
    private int dni;
    private String nombre;
      private String apellido;

    //CONTRUCTOR


    public Usuario(int dni, String nombre, String apellido) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    //Getter y setters

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    //METODOS


    @Override
    public String toString() {
        return  "El dni del "  + nombre + "es  " + dni;
    }
}
