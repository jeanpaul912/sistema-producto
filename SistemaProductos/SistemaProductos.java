package SistemaProductos;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemaProductos {
    private static ArrayList<Producto> listaProductos = new ArrayList<>();
    private static Scanner lector = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion;
        do {
            mostrarMenu();
            opcion = lector.nextInt();
            
            switch (opcion) {
                case 1:
                    crearProducto();
                    break;
                case 2:
                    mostrarProductos();
                    break;
                case 3:
                    System.out.println("¡Gracias por usar el sistema!");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, intente nuevamente.");
            }
        } while (opcion != 3);
    }
    
    private static void mostrarMenu() {
        System.out.println("\n=== SISTEMA DE GESTIÓN DE PRODUCTOS ===");
        System.out.println("1. Crear nuevo producto");
        System.out.println("2. Mostrar productos");
        System.out.println("3. Salir");
        System.out.print("Seleccione una opción: ");
    }
    
    private static void crearProducto() {
        System.out.println("\n=== CREAR NUEVO PRODUCTO ===");
        
        System.out.print("Código: ");
        int codigo = lector.nextInt();
        lector.nextLine(); // Consumir el salto de línea
        
        System.out.print("Nombre: ");
        String nombre = lector.nextLine();
        
        System.out.print("Precio: ");
        double precio = lector.nextDouble();
        
        System.out.print("Existencias: ");
        int existencias = lector.nextInt();
        lector.nextLine(); // Consumir el salto de línea
        
        System.out.print("Categoría: ");
        String categoria = lector.nextLine();
        
        Producto producto = new Producto(codigo, nombre, precio, existencias, categoria);
        listaProductos.add(producto);
        
        System.out.println("\n¡Producto creado exitosamente!");
    }
    
    private static void mostrarProductos() {
        if (listaProductos.isEmpty()) {
            System.out.println("\nNo hay productos registrados en el sistema.");
            return;
        }
        
        System.out.println("\n=== LISTA DE PRODUCTOS ===");
        for (Producto producto : listaProductos) {
            System.out.println(producto.toString());
            System.out.println("-----------------");
        }
    }
}
