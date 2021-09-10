/**
 * Clase productos...
 * Actividad 8, Comparadores de boolean
 */
package Actividad_8;

/**
 *
 * @author pedro
 */

public class Producto {
    private int id;
    private String nombre;
    private double precio;

    public Producto() {
    }

    public Producto(int id, String nombre, double precio) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }
    
    public boolean igualQue(Producto e){
        return this.precio == e.getPrecio();
    }
    
    public boolean menorQue(Producto e){
        return this.precio < e.getPrecio();
    }
    
    public boolean menorIgualQue(Producto e){
        return this.precio <= e.getPrecio();
    }
    
    public boolean mayorQue(Producto e){
        return this.precio > e.getPrecio();
    }
    
    public boolean mayotIgualQue(Producto e){
        return this.precio >= e.getPrecio();
    }
}
