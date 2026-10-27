package modulo01;

import java.util.Random;
import java.util.Scanner;

public class AdivinaElNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random azar = new Random();
        int numeroSecreto = azar.nextInt(100) + 1;
        final int MAX_INTENTOS = 7;
        final int PUNTAJE_INICIAL = 100;

        int intentos = MAX_INTENTOS, puntaje = PUNTAJE_INICIAL;
        int numeroIngresado;
        String reinicio = "s";

        System.out.println("Bienvenido al juego de adivinar un numero!");
        do {
            System.out.println("Ingrese el numero que crees que sea. Intentos " + intentos);
            numeroIngresado = teclado.nextInt();

            if (numeroIngresado > numeroSecreto) {
                intentos--;
                System.out.println("Mas bajo!");
                System.out.println("Intentos: " + intentos);
                puntaje = puntaje - 10;

            } else if (numeroIngresado < numeroSecreto) {
                intentos--;
                System.out.println("Mas alto!");
                System.out.println("Intentos: " + intentos);
                puntaje = puntaje - 10;
            } else {
                System.out.println("Acertaste!!");
                System.out.println("Tu puntaje es: " + puntaje);
                System.out.println("¿Desea reiniciar el juego?. s = si, n = no");
                reinicio = teclado.next();
                if (reinicio.equalsIgnoreCase("s")) {
                    numeroSecreto = azar.nextInt(100) + 1;
                    intentos = MAX_INTENTOS;
                    puntaje = PUNTAJE_INICIAL;
                }
            }

            if (intentos == 0) {
                System.out.println("El numero secreto era: " + numeroSecreto);
                numeroIngresado = numeroSecreto;
                System.out.println("¿Desea reiniciar el juego?. s = si, n = no");
                reinicio = teclado.next();
                if (reinicio.equalsIgnoreCase("s")) {
                    numeroSecreto = azar.nextInt(100) + 1;
                    intentos = MAX_INTENTOS;
                    puntaje = PUNTAJE_INICIAL;
                }
            }


        } while (numeroIngresado != numeroSecreto && reinicio.equals("s"));
    }
}
