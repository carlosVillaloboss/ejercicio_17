package com.mycompany.ejercicio_17;
import java.util.Scanner;

public class Ejercicio_17 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el radio de un circulo: ");
        double radio= scanner.nextDouble();
        double area= Math.PI * radio;
        double longitud= 2 * Math.PI * radio;
        
        System.out.println("El area del circulo es: "+ area);
        System.out.println("La longitud del circulo es: "+ longitud);
        
        scanner.close();
    }
}
