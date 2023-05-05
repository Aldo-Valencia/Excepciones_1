package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese un valor para el divisor: ");
        Scanner Teclado = new Scanner(System.in);


        try {
            int a = 10;
            int b = Integer.parseInt(Teclado.nextLine());
            System.out.println("Division: " + (a/b));
        } catch (ArithmeticException e){
            System.out.println("No se puede dividir entre 0 ");
        } catch (NumberFormatException nfe) {
            System.out.println("No capturaste el dato correctamente");
        } finally {
            System.out.println("Siempre se ejecuta");
        }


        System.out.println("Fin del programa");
    }
}