/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Actividad_8;

/**
 *
 * @author pedro
 */

public class Test {
    public static void main(String[] arg){
    /**
     * Parte del ejercicio con alumnos
     */
    Alumno x00 = new Alumno("0000-00-00", "Juan", 21);
    Alumno x01 = new Alumno("0000-00-00", "Enrique", 22);
    Alumno x02 = new Alumno("0000-00-00", "Luis", 21);
    Alumno x03 = new Alumno("0000-00-00", "Martin", 20);
    
    if(x00.igualQue(x02) != true){
        System.out.println("No son iguales"); 
    }else{
        System.out.println("Son iguales, "+x00.getNombre()+" y "+x02.getNombre()+" tiene la misma edad");
    }
    
    if(x00.menorQue(x01) != true){
        System.out.println(x00.getNombre()+" no es menor"+" que "+x01.getNombre()); 
    }else{
        System.out.println(x00.getNombre()+" es menor"+" que "+x01.getNombre());
    }
    
    if(x00.mayorQue(x03) != true){
        System.out.println(x00.getNombre()+" no es mayor"+" que "+x03.getNombre()); 
    }else{
        System.out.println(x00.getNombre()+" es mayor"+" que "+x03.getNombre());
    }
    /**
     * Parte del ejercicio con comproductos
     */
    Producto y00 = new Producto(1, "Manzanas", 2.50);
    Producto y01 = new Producto(2, "Zandia", 4.50);
    Producto y02 = new Producto(3, "Naranjas", 2.50);
    Producto y03 = new Producto(4, "Lechuga", 1.50);
    
    if(y00.igualQue(y02) != true){
        System.out.println("\nNo son iguales"); 
    }else{
        System.out.println("\nSon iguales, "+y00.getNombre()+" y "+y02.getNombre()+" tiene el mismo precio");
    }
    
    if(y00.menorQue(y01) != true){
        System.out.println(y00.getNombre()+" no tiene menor precio"+" que "+y01.getNombre()); 
    }else{
        System.out.println(y00.getNombre()+" tiene menor precio"+" que "+y01.getNombre());
    }
    
    if(y00.mayorQue(y03) != true){
        System.out.println(y00.getNombre()+" no tiene mayor precio"+" que "+y03.getNombre()); 
    }else{
        System.out.println(y00.getNombre()+" tiene mayor precio"+" que "+y03.getNombre());
    }
    }
}
