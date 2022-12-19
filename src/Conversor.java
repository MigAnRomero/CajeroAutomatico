import java.math.BigDecimal;
import java.util.Scanner;

public class Conversor {
    public static void main(String[] args) {
        double digitarEuro, valorEnDolar;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digitar la cantidad de euros obtenidos: ");
        digitarEuro = scanner.nextDouble();
        valorEnDolar = (digitarEuro * 1.06);

        System.out.println("Tus " + digitarEuro + " euros equivalen a " + valorEnDolar + " US dolares.");

        // Se usa metodos de BigDecimal
        String eurosString = Double.toString(digitarEuro);
        BigDecimal eurosBigDecimal = new BigDecimal(eurosString);
        double tasaDeCambio = 1.06;
        String tasaDeCambioString = Double.toString(tasaDeCambio);
        BigDecimal tasaDeCambioBigDecimal = new BigDecimal(tasaDeCambioString);
        // Haciendo operaciones aritmeticas usando un metodo de la clase BigDecimal
        BigDecimal dolaresBigDecimal = eurosBigDecimal.multiply(tasaDeCambioBigDecimal);

        System.out.println(digitarEuro + " euros equivalen a " + dolaresBigDecimal.toString() +
                " US dólares americanos.");
    }
}
