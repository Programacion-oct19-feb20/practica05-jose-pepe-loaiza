/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos2;

/**
 *
 * @author reroes
 */
public class OperadoresLogicos {

    public static void main(String[] args) {
        boolean valorA = true;
        boolean valorB = false;

        System.out.printf("Negacion: !%s = %s\n", valorA, !valorA);
        // para negar utilizo la exclamacion !.
        
        System.out.printf("Negacion: !%s = %s\n", valorB, !valorB);
        System.out.printf("And: %s & %s = %s\n", valorA, valorB, 
                valorA & valorB);
        // para el and y or siempre se necesita que una variable sea verdadera
        // por ejemplo v and v = v, v and f = v; f and f = f; y asi mismo con 
        System.out.printf("And: %s | %s = %s\n", valorA, valorB, 
                valorA | valorB);
       
        
    }

}
