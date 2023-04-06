/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia5ejercicioextra7;

import java.util.Scanner;

/**
 *
 * @author ernes
 */
public class Guia5ejercicioextra7 {

    /**
     * @param args the command line arguments
     */
   {public static void main(String[] args) {
       
   
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de números de Fibonacci que desea generar: ");
        int n = sc.nextInt();

        int[] fib = new int[n]; // creamos el vector para almacenar los números de Fibonacci
        fib[0] = 0; // el primer número es 0
        if (n > 1) {
            fib[1] = 1; // el segundo número es 1
        }
        for (int i = 2; i < n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2]; // el siguiente número es la suma de los dos anteriores
        }

        System.out.println("Los primeros " + n + " números de Fibonacci son:");
        for (int i = 0; i < n; i++) {
            System.out.print(fib[i] + " ");
        }
    }
        // TODO code application logic here
    }
    

