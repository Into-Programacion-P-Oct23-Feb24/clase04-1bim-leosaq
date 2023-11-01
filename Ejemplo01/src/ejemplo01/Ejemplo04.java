/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo04 {
    public static void main(String[] args) {
        /*
        println vs print
        La diferencia es que printl sirve para separar en diferentes lineas su contenido 
        mientras que print ejecuta todo en una sola linea y se puede escribir en diferentes lineas 
        en las cuales como resultado final se va a juntar todo en una sola linea
        */
        String nombreEstudiante = "René Rolando";
        String apellidoEstudiante = "Elizalde Solano";
        int nacimiento = 1983;
        System.out.println(nombreEstudiante + " ");
        System.out.print(apellidoEstudiante + " ");
        System.out.print(nacimiento + " ");
        System.out.print(nombreEstudiante + " ");
    }
}
