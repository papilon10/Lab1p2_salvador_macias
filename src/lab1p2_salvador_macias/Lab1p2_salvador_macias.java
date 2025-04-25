/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_salvador_macias;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Apple
 */
public class Lab1p2_salvador_macias {

    public static Scanner lea = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean salida = false;
        do {
            System.out.println("---menu principal---");
            System.out.println("1.jugar numberle");
            System.out.println("2.verificar palindromo");
            System.out.println("3.salir");
            System.out.println("elija una opcion: ");
            int opc = lea.nextInt();
            switch (opc) {
                case 1:{}
                    
                    break;
                case 2:{}
                
                break;
                
                case 3:{}
                
                break;
                default:
                    System.out.println("la opcion ingresada es invalida");
            }
            
            
        } while (salida != true);

    }

}
