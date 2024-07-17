import java.util.Scanner;

public class CalculadoraApp {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        while (true){
            mostrarMenu();

            try {
                var operacion = Integer.parseInt(consola.nextLine());
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, consola);

                } else if (operacion == 5) {
                    System.out.println("Hasta pronto...");
                    break;
                } else {
                    System.out.println("Opción erronea: " + operacion);
                }
                System.out.println();
            } catch (Exception e){
                System.out.println("Ocurrió un error: " + e.getMessage());
            }
        }

    }

    private static void mostrarMenu(){
        System.out.println("**** Aplicación Calculadora ****");

        System.out.println("¿Qué operación desea realizar?");

        // Triple comilla para hacer saltos de linea
        System.out.println("""
                1. Suma
                2. Resta
                3. Multiplicaión
                4. División
                5. Salir
                """);
    }

    private static void ejecutarOperacion (int operacion, Scanner consola){
        System.out.println("Proporciona el valor de operando 1: ");
        var operando1 = Double.parseDouble(consola.nextLine());

        System.out.println("Proporciona el valor de operando 2: ");
        var operando2 = Double.parseDouble(consola.nextLine());

        switch (operacion) {
            case 1 -> {
                var result = operando1 + operando2;
                System.out.println("Resultado Suma: " + result);
            }

            case 2 -> {
                var result = operando1 - operando2;
                System.out.println("Resultado Resta: " + result);
            }

            case 3 -> {
                var result = operando1 * operando2;
                System.out.println("Resultado Multiplicación: " + result);
            }

            case 4 -> {
                var result = operando1 / operando2;
                System.out.println("Resultado División: " + result);
            }

            default -> {
                System.out.println("Opción erronea: " + operacion);
            }
        }
    }

}
