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
    public static ArrayList lista = new ArrayList();

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
                case 1: {

                    System.out.println("1. facil (intentos 8,longitud 3, rango 1-6)");
                    System.out.println("2. media (intentos 6,longitud 4, rango 1-8)");
                    System.out.println("3. dificil (intentos 5,longitud 5, rango 1-9)");
                    boolean acierto = false;
                    System.out.println("elija la dificultad: ");
                    int dificultad = lea.nextInt();
                    switch (dificultad) {
                        case 1: {
                            while (acierto != true) {
                                for (int i = 0; i < 8; i++) {
                                    System.out.println("intento numero :" + i);

                                }

                            }

                        }// fin facil
                        break;
                        case 2: {
                            while (acierto != true) {
                                for (int i = 0; i < 6; i++) {
                                    System.out.println("intento numero :" + i);

                                }

                            }

                        }//fin media
                        break;
                        case 3: {
                            while (acierto != true) {
                                for (int i = 0; i < 5; i++) {
                                    System.out.println("intento numero :" + i);
                                }

                            }

                        }

                    }//fin dificil

                    break;

                }

            }

            break;
          case 2: {
                }

                break;

                case 3: {
                    salida = true;
                    System.out.println("se abandonara el programa");
                }

                break;
                default:
                    System.out.println("la opcion ingresada es invalida");
            }

        
    }
    while (salida 
!= true);

    }

}
