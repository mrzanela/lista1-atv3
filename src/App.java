import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que peça dois números
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        double num1 = sc.nextDouble();
        System.out.println("Digite o segundo número: ");
        double num2 = sc.nextDouble();
        sc.close();
        //imprima a soma.
        double result = num1+num2;
        System.out.println("A soma dos dois números é: " +result);

    }
}
