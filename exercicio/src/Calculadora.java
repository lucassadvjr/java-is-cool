import java.util.Scanner;

public class Calculadora {
    public static float calcularDivisao(float n1, float n2) {
        if (n2 == 0) {
            throw new IllegalArgumentException("Divisor não pode ser zero.");
            
        }
        return n1 / n2;
    }
    public static int multiplayer(int n1 , int n2) {
        return n1 * n2;
        
    }
    public static int adicao(int n1 , int n2) {
        return n1 + n2;
        
    }

    public static int subtracao (int n1, int n2) {
        return n1 - n2;
        
    }

    public static void main(String[] args) {
        //saida para usuario
        System.out.println("digite dois numeros");


        //declaração de variaveis

        // variavel para definir qual função sera usada
        String chamada;
        // variaveis de valores a serem calculados
        int numero1;
        int numero2;

        //variavel do scanner entrada
        Scanner scanner = new Scanner(System.in);
        numero1 = scanner.nextInt();

        numero2 = scanner.nextInt();

        //saida para definição de operação
        System.out.println("digite uma operação:%n - + / * ");
        chamada = scanner.next();
        scanner.close();
        // realização de operação de acordo com a função chamada (case)
        switch (chamada) {
            case  "+" :
                System.out.println("Resultado da Adição: " + adicao(numero1, numero2));
                
                break;
            case "-":
                System.out.println("Resultado da Subtração: " + subtracao(numero1, numero2));
                break;
            case "*":
                System.out.println("Resultado da multiplicação: " + multiplayer(numero1, numero2));  
                break;  
            case "/":
                // Conversão explícita para `float`
                System.out.println("Resultado da Divisão: " + calcularDivisao((float) numero1, (float) numero2));
                break;
            default:
                System.out.println("operação invalida");
                break;
        }

        }
    
}
        


