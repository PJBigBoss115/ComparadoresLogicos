/**
 * Clase alumnos...
 * Actividad 8, Comparadores de boolean
 */
package Actividad_8;

/**
 *
 * @author pedro
 */

public class Alumno {
    private String carnet;
    private String nombre;
    private int edad;

    public Alumno() {
    }

    public Alumno(String carnet, String nombre, int edad) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public boolean igualQue(Alumno e){
        return this.edad == e.getEdad();
    }
    
    public boolean menorQue(Alumno e){
        return this.edad < e.getEdad();
    }
    
    public boolean menorIgualQue(Alumno e){
        return this.edad <= e.getEdad();
    }
    
    public boolean mayorQue(Alumno e){
        return this.edad > e.getEdad();
    }
    
    public boolean mayotIgualQue(Alumno e){
        return this.edad >= e.getEdad();
    }
}
