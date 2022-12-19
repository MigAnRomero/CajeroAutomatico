import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        double digitarEuro, valorEnDolar;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digitar la cantidad de euros obtenidos: ");
        digitarEuro = scanner.nextDouble();
        valorEnDolar = (digitarEuro * 1.06);

        System.out.println("Tus " + digitarEuro + " euros equivalen a " + valorEnDolar + " US dolares.");
    }
}
