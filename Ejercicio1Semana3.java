package ejerciciossemana3;

import javax.swing.JOptionPane;

public class EjerciciosSemana3 {

    public static void main(String[] args) {
        /*
        int i;
        for (i = 0; i < 5; i++) { // ojo <5 imprime 5 veces xq empieza en cero
            System.out.println("@@@@@@@@@@");
        }*/

        
        
     
        /* ---EJERCICIO 1-------
        for (int i = 10; i > 0; i--){ // osea cuando i sea 1 ya se cumple la condicion
            System.out.println(i);

            System.out.println("Feliz ano nuevo");
        } //for
         */
        
        
        
         /*
        int i = 11; //11 pq al principio le resta 1 en la primera ejecucion del while
        while (i > 1) {
            i = i - 1;
            System.out.println(i);
            if (i == 1) {
                System.out.println("Feliz ano nuevo");
            } // if 
            
        } //while
        */
         
         
         
        /*-------EJERCICIO 2-------
        
        int multiplicador = 1;
        String numeroUsuario = JOptionPane.showInputDialog("Ingrese su número para multiplicar:");
        int numeroUsuarioEntero = Integer.parseInt(numeroUsuario);
        while (multiplicador < 11){
            
            System.out.println(numeroUsuarioEntero + "*" + multiplicador + "=" + numeroUsuarioEntero*multiplicador);
            multiplicador += 1;
        }
        */


        /*-------EJERCICIO 3-------
 
        String filas = JOptionPane.showInputDialog("Ingrese el número de filas para el triangulo: ");
        int filasInt = Integer.parseInt(filas);

        for (int i = 1; i <= filasInt; i++) {
            //System.out.println("For externo");
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
                //System.out.println("For interno");

            }
            System.out.println();

        }
        */
        
        
        
        

        
        
        
        
        

    }//ARGS

}// PUBLIC CLASS

