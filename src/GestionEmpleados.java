import java.util.ArrayList;
import java.util.Scanner;

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

// Clase principal
public class GestionEmpleados {
    // Contador estático para el ID (memoria estática)
    private static int contadorId = 1;

    // Lista dinámica para almacenar empleados (memoria dinámica)
    private static ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    // Método para agregar un empleado
    public static void agregarEmpleado(Scanner scanner) {
        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el cargo del empleado: ");
        String cargo = scanner.nextLine();

        System.out.print("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();
        scanner.nextLine(); // Limpiar el buffer

        // Crear el empleado y agregarlo a la lista
        Empleado empleado = new Empleado(contadorId++, nombre, cargo, salario);
        listaEmpleados.add(empleado);

        System.out.println("Empleado agregado con ID: " + empleado.getId());
    }

    // Método para listar todos los empleados
    public static void listarEmpleados() {
        if (listaEmpleados.isEmpty()) {
            System.out.println("No hay empleados registrados.");
        } else {
            System.out.println("=== Lista de Empleados ===");
            for (Empleado empleado : listaEmpleados) {
                System.out.println(empleado);
            }
        }
    }

    // Método para buscar un empleado por ID
    public static void buscarEmpleadoPorId(Scanner scanner) {
        System.out.print("Ingrese el ID del empleado: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        boolean encontrado = false;
        for (Empleado empleado : listaEmpleados) {
            if (empleado.getId() == id) {
                System.out.println("=== Detalles del Empleado ===");
                System.out.println(empleado);
                encontrado = true;
                break;
            }
        }

        if (!encontrado) {
            System.out.println("Empleado con ID " + id + " no encontrado.");
        }
    }

    // Método para eliminar un empleado por ID
    public static void eliminarEmpleado(Scanner scanner) {
        System.out.print("Ingrese el ID del empleado a eliminar: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        boolean eliminado = listaEmpleados.removeIf(empleado -> empleado.getId() == id);

        if (eliminado) {
            System.out.println("Empleado con ID " + id + " eliminado correctamente.");
        } else {
            System.out.println("Empleado con ID " + id + " no encontrado.");
        }
    }

    // Método principal
    public static void main(String[] args) {

    }
}