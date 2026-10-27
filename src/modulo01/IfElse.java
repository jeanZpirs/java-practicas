package modulo01;

public class IfElse {

    public static void main(String[] args) {
        int nota = 20;
        // IF - ELSE
        if (nota >= 18) {
            System.out.println("Excelente");
        } else if (nota >= 14) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Desaprobado");
        }


        // SWITCH
        int opcion = 1;
        switch (opcion) {
            case 1:
                System.out.println("Sumar");
                break;
            case 2:
                System.out.println("Restar");
                break;
            default:
                System.out.println("Opción inválida");
        }

        // SWITCH NEW VERSION
        switch (opcion) {
            case 1 -> System.out.println("Sumar");
            case 2 -> System.out.println("Restar");
            default -> System.out.println("Opción inválida");
        }


    }


}
