import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Qual o seu nome? ");
        nomeCliente = scan.next();

        System.out.println("Digite o numero da sua conta: ");
        numeroConta = scan.nextInt();

        System.out.println("Digite o numero da agência!: ");
        agencia = scan.next();

        System.out.println("Qual seu saldo bancario? ");
        saldo = scan.nextDouble();

        System.out.println("Olá, " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia +
                ", conta " + numeroConta + "e saldo de R$" + saldo + " já está disponível para saque");
    }
}
