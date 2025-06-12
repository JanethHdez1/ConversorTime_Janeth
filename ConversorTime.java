package mx.edu.utez.examen;

import java.util.Scanner;

/**
 *
 * @author Jan
 */
public class ConversorTime {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Bienvenido, selecciona la opción para la conversión del tiempo: \n1.Horas a minutos \n2.Minutos a segundos \n3.Días a horas \n4.Semanas a días \n5.Salir");
        int opc;
        int horas;
        int minutos;
        int segundos;
        int dias;
        int semanas;
        do {
            System.out.print("Opción: ");
            opc = sc.nextInt();
            switch (opc) {
                case 1:
                    System.out.print("Ingresa las horas: ");
                    horas = sc.nextInt();
                    minutos = horas * 60;
                    System.out.println(horas + " horas = " + minutos + " minutos");
                    break;

                case 2:
                    System.out.print("Ingresa los minutos: ");
                    minutos = sc.nextInt();
                    segundos = minutos * 60;
                    System.out.println(minutos + " minutos = " + segundos + " segundos");
                    break;

                case 3:
                    System.out.print("Ingresa los días: ");
                    dias = sc.nextInt();
                    horas = dias * 24;
                    System.out.println(dias + " días = " + horas + " horas");
                    break;

                case 4:
                    System.out.print("Ingresa las semanas: ");
                    semanas = sc.nextInt();
                    dias = semanas * 7;
                    System.out.println(semanas + " semanas = " + dias + " días");
                    break;
            
                default:
                    System.out.println("Hasta luego :)");
                    break;
            }
        } while (opc != 5);
    }
}
