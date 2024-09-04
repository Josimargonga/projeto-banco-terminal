import java.util.*;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numeroConta;
        String agencia, nomeCliente;
        double saldo;

        System.out.println ("Por fovor, Digite o numero da conta");
        numeroConta = leitor.nextInt();
        leitor.nextLine();

        System.out.println ("Por fovor, Digite o nome da Agencia");
        agencia = leitor.nextLine();

        System.out.println ("Por fovor, Digite o nome seu nome");
        nomeCliente = leitor.nextLine();

        System.out.println ("Por fovor, Digite o saldo a depositar");
        saldo = leitor.nextDouble();
        leitor.close();
        String mensagem = "Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numeroConta+"1 e seu saldo "+ saldo + "já está disponível para saque";
        System.out.println(mensagem);
    }
}
