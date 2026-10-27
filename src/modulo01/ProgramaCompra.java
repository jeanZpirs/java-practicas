package modulo01;

import java.util.Scanner;

public class ProgramaCompra {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreProducto;
        double precio, subtotal, total;
        final double IGV = 0.18;
        double igvCalculado;


        System.out.print("Ingrese el nombre del producto: ");
        nombreProducto = teclado.nextLine();

        System.out.print("Ingrese el precio del producto: ");
        precio = teclado.nextDouble();

        System.out.print("Ingrese la cantidad a comprar: ");
        int cantidad = teclado.nextInt();

        subtotal = cantidad * precio;
        igvCalculado = subtotal * IGV;
        total = subtotal + igvCalculado;

        System.out.println("Nombre del producto: " + nombreProducto);
        System.out.println("Precio: " + precio);
        System.out.println("Cantidad: " + cantidad);

        System.out.println();

        System.out.printf("Subtotal: %.2f%n",subtotal);
        System.out.printf("IGV (18%%): %.2f%n",igvCalculado);
        System.out.printf("Total: %.2f%n",total);

    }

}
