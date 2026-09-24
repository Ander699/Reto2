package Reto;

public class Producto {

    public String nombre_Producto   ;
    public String categoria   ;
    public double precio   ;

    public Producto(String nombre_Producto, String categoria, double precio) {
        this.nombre_Producto = nombre_Producto;
        this.categoria = categoria;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Productos{" +
                "nombre_Producto='" + nombre_Producto + '\'' +
                ", categoria='" + categoria + '\'' +
                ", precio='" + precio + '\'' +
                '}';
    }
}
