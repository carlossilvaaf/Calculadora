import java.util.Scanner;

public class Calculadora {

    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Escolha a operação (+, -, *, /)");
        char operador = scanner.next().charAt(0);

        double resultado;
        switch (operador) {
            case '+':
            resultado = num1 + num2;
            System.out.print("Res;ultado: " + resultado);
            break;
            case '/':
                resultado = num1 / num2;
                System.out.print("Resultado: " + resultado);


                scanner.close();
        }
    }
}
