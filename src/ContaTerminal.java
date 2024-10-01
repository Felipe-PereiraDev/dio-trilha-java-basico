import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;
        System.out.println("Digite seu nome:");
        nomeCliente = scanner.nextLine();
        System.out.println("Digite o numero da agência:");
        agencia = scanner.nextLine();
        System.out.println("Numero da conta:");
        numero = scanner.nextInt();
        System.out.println("Saldo:");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta no nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível"
        ,nomeCliente, agencia, numero, saldo);
    }
}
