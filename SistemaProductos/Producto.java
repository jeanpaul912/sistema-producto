package SistemaProductos;

public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int existencias;
    private String categoria;
    
    // Constructor por defecto
    public Producto() {
        this.codigo = 0;
        this.nombre = "Sin nombre";
        this.precio = 0.0;
        this.existencias = 0;
        this.categoria = "Sin categoría";
    }
    
    // Constructor con parámetros
    public Producto(int codigo, String nombre, double precio, int existencias, String categoria) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.existencias = existencias;
        this.categoria = categoria;
    }
    
    // Métodos getter y setter
    public int getCodigo() { return codigo; }
    public void setCodigo(int codigo) { this.codigo = codigo; }
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }
    
    public int getExistencias() { return existencias; }
    public void setExistencias(int existencias) { this.existencias = existencias; }
    
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    
    @Override
    public String toString() {
        return "Código: " + codigo + 
               "\nNombre: " + nombre + 
               "\nPrecio: $" + precio + 
               "\nExistencias: " + existencias + 
               "\nCategoría: " + categoria + "\n";
    }
}
