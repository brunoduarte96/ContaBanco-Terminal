import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Digite o número da conta: ");
        int conta = scanner.nextInt();

        System.out.printf("Digite a agência: ");
        String agencia = scanner.next();
        scanner.nextLine();

        System.out.printf("Digite o nome cadastrado na conta: ");
        String nomeCadastrado = scanner.nextLine();

        System.out.printf("Digite o saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCadastrado + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + " conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque");

        scanner.close();

    }
}