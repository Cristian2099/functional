package static_example;

public class Employee {
    private final String nombre;
    private int edad;
    private final int id;

    private static int idCounter = 1;

    public Employee(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        id = idCounter;
        idCounter++;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }


    @Override
    public String toString(){
        return String.format("nombre: %s, edad: %s, id: %s", this.nombre, this.edad, id);
    }
}
