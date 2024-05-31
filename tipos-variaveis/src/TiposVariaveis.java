public class TiposVariaveis { 
    public static void main(String[] args) {
        // Definindo o salário mínimo
        double salarioMinimo = 2500;

        // Exemplos de tipos de dados numéricos
        short numeroCurto = 1; // Variável do tipo short
        int numeroNormal = numeroCurto; // Conversão implícita de short para int
        short numeroCurto2 = (short) numeroNormal; // Conversão explícita de int para short

        // Definindo e alterando valor de uma variável
        int numero = 5;
        numero = 10; // Alterando o valor da variável

        // Imprimindo o valor da variável no console
        System.out.print(numero);

        // Constante para o valor de PI
        final double VALOR_DE_PI = 3.14;
    }
}