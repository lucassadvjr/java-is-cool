import java.util.Scanner;

public class Tabuada{
    public static void main(String[] args) {
          
        // delcaração de variaveis
        int numero;
        //saida para usuario
        System.out.println("digite um numero: ");
        //declaração do scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);
        //variavei que armazeda dados de entrada
        numero = scanner.nextInt();

        
        //laço de repetição para calculo ate 10
        for(int i = 1; i <= 10 ; i++){
            System.out.printf("%d x %d = %d%n",numero,i,numero * i);
        }
        //fechamento do scanner
        scanner.close();
    }
}