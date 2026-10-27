package modulo01;

import java.util.Scanner;

public class CalculadoraMenu {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese dos numeros:");
        int n1 = teclado.nextInt();
        int n2 = teclado.nextInt();
        int opcion;
        do {
            System.out.println("1 sumar, 2 restar, 3 multiplicar, 4 dividir, 0 salir");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1 -> System.out.println("La suma es: " + (n1 + n2));
                case 2 -> System.out.println("La resta es: " + (n1 - n2));
                case 3 -> System.out.println("La multiplicación es: " + (n1 * n2));
                case 4 -> {
                    if (n2 == 0) System.out.println("No se puede dividir.");
                    else System.out.printf("La division es: %.2f%n", (n1 / (double) n2));

                }
                case 0 -> {
                    System.out.println("Buen dia!");
                }
                default -> System.out.println("Opción incorrecta.");
            }

        } while (opcion != 0);

    }

}
