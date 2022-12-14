import java.util.Scanner;

public class Interfaz {
    public static void main(String[] args) {
        System.out.println("Elija una de las siguientes opciones:\n" +
                "   Escriba 1 para consultar tu saldo.\n" +
                "   Escriba 2 para ingresar dinero.\n" +
                "   Escriba 3 para sacar dinero.\n" +
                "   Escriba 4 para consultar sus últimos movimientos.");

        Scanner scanner = new Scanner(System.in);

        int opcionSleccionada = scanner.nextInt();

        System.out.println("La opción elegida es: " + opcionSleccionada);
    }
}
