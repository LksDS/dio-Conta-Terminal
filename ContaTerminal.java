import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o seu nome:");
        String nome = scan.nextLine();
        System.out.println("Digite o número da agência:");
        int numeroAgencia = scan.nextInt();
        scan.nextLine();
        System.out.println("Informe o nome da agência:");
        String nomeAgencia = scan.nextLine();
        System.out.println("Informe seu saldo:");
        float saldo = scan.nextFloat();
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para resgate",nome,nomeAgencia,numeroAgencia,saldo);
    }
}