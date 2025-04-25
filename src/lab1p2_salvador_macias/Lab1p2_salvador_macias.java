/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p2_salvador_macias;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Apple
 */
public class Lab1p2_salvador_macias {

    public static Scanner lea = new Scanner(System.in);
    public static Scanner str = new Scanner(System.in);
    public static ArrayList historial_intento = new ArrayList();
    public static ArrayList historial_retroAlimentacion = new ArrayList();

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
                    System.out.println("\nelija la dificultad: ");
                    int dificultad = lea.nextInt();
                    switch (dificultad) {
                        case 1: {
                            while (acierto != true) {
                                Random aleatorio = new Random();
                                StringBuilder sb = new StringBuilder();

                                for (int y = 0; y < 3; y++) {
                                    int digito = aleatorio.nextInt(6) + 1;
                                    sb.append(digito);
                                }

                                String numeroAleatorio = sb.toString();
                                System.out.println(numeroAleatorio);
                                for (int i = 1; i < 9; i++) {
                                    System.out.println("intento numero :" + i);
                                    String numero_ingresado = str.nextLine();
                                    if (numero_ingresado.matches("[1-6]{1,3}")) {
                                        historial_intento.add(numero_ingresado);

                                        if (numeroAleatorio.contentEquals(numero_ingresado)) {
                                            acierto = true;
                                            System.out.println("historial: ");
                                            for (int j = 0; j < historial_intento.size(); j++) {
                                                System.out.println(historial_intento.get(j));

                                            }

                                        }

                                    } else {
                                        System.out.println("la longitud o el rango son invalidos");
                                    }

                                }

                            }

                        }// fin facil
                        break;
                        case 2: {
                           while (acierto != true) {
                                Random aleatorio = new Random();
                                StringBuilder sb = new StringBuilder();

                                for (int y = 0; y < 4; y++) {
                                    int digito = aleatorio.nextInt(8) + 1;
                                    sb.append(digito);
                                }

                                String numeroAleatorio = sb.toString();
                                System.out.println(numeroAleatorio);
                                for (int i = 1; i < 7; i++) {
                                    System.out.println("intento numero :" + i);
                                    String numero_ingresado = str.nextLine();
                                    if (numero_ingresado.matches("[1-8]{1,4}")) {
                                        historial_intento.add(numero_ingresado);

                                        if (numeroAleatorio.contentEquals(numero_ingresado)) {
                                            acierto = true;
                                            System.out.println("historial: ");
                                            for (int j = 0; j < historial_intento.size(); j++) {
                                                System.out.println(historial_intento.get(j));

                                            }

                                        }

                                    } else {
                                        System.out.println("la longitud o el rango son invalidos");
                                    }

                                }

                            }

                        }//fin media
                        break;
                        case 3: {
                           while (acierto != true) {
                                Random aleatorio = new Random();
                                StringBuilder sb = new StringBuilder();

                                for (int y = 0; y < 5; y++) {
                                    int digito = aleatorio.nextInt(9) + 1;
                                    sb.append(digito);
                                }

                                String numeroAleatorio = sb.toString();
                                System.out.println(numeroAleatorio);
                                for (int i = 1; i < 6; i++) {
                                    System.out.println("intento numero :" + i);
                                    String numero_ingresado = str.nextLine();
                                    if (numero_ingresado.matches("[1-9]{1,5}")) {
                                        historial_intento.add(numero_ingresado);

                                        if (numeroAleatorio.contentEquals(numero_ingresado)) {
                                            acierto = true;
                                            System.out.println("historial: ");
                                            for (int j = 0; j < historial_intento.size(); j++) {
                                                System.out.println(historial_intento.get(j));

                                            }

                                        }

                                    } else {
                                        System.out.println("la longitud o el rango son invalidos");
                                    }

                                }

                            }
                        }//fin dificil
                    }
                    break;

                }//fin case 1
                case 2: {

                }//fin case 2

                break;

                case 3: {
                    salida = true;
                    System.out.println("se abandonara el programa");
                }//fina case 2

                break;
                default: {
                    System.out.println("la opcion ingresada es invalida");
                }
            }//fin switch

            break;

        } while (salida
                != true);

    }//fin main

}//fin clase
