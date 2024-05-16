import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar e ler o número da agência
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();
        
        // Solicitar e ler o número da conta
        System.out.println("Por favor, digite o número da Conta:");
        String numero = scanner.nextLine();
        
        // Solicitar e ler o nome do cliente
        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();
        
        // Solicitar e ler o saldo
        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();
        
        // Exibir a mensagem com os dados fornecidos
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco,");
        System.out.println("sua agência é " + agencia + ",");
        System.out.println("conta " + formatarNumeroConta(numero) + ",");
        System.out.println("e seu saldo " + saldo + " já está disponível para saque.");
        
    
        scanner.close();
    }
    
    // Método para formatar o número da conta
    public static String formatarNumeroConta(String numero) {

        if (numero.contains("-") && numero.length() == 5) {
            return numero;
        } else {
            return numero.substring(0, 3) + "-" + numero.substring(3);
        }
    }
}