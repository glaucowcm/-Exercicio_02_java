import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        double numero;

        try (Scanner teclado = new Scanner(System.in)) {
            System.out.println("Informe um número:");

            numero = teclado.nextDouble();

            System.out.printf("O número informado foi: %.1f", numero);
        }

    }

}