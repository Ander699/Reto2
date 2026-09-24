package Reto;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Pala", "Herramienta", 100.2));
        productos.add(new Producto("Pico", "Herramienta", 143535.2));
        productos.add(new Producto("Azada", "Herramienta", 1455.2));
        productos.add(new Producto("Cemento", "Material", 453.2));
        productos.add(new Producto("Ladrillos", "Material", 10345.2));
        productos.add(new Producto("Arena", "Material", 14.6));

        productos.sort((a, b) -> a.categoria.compareTo(b.categoria));
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
}
