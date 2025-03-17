// Clase Empleado
class Empleado {
    // Atributos
    private int id;
    private String nombre;
    private String cargo;
    private double salario;

    // Constructor
    public Empleado(int id, String nombre, String cargo, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    // Método para mostrar detalles del empleado
    @Override
    public String toString() {
        return "ID: " + id + ", Nombre: " + nombre + ", Cargo: " + cargo + ", Salario: " + salario;
    }
}


public class GestionEmpleados {

    public static void main(String[] args) {

    }
}