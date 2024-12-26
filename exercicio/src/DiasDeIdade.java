import java.util.Scanner;

public class DiasDeIdade {
    public static void main(String[] args) {
    //declaração de variaveis
    int anos;
    int dias;
    //saida para usuario
    System.out.println("Digite sua idade");
    //entrada de usuario
    Scanner scanner = new Scanner(System.in);

    anos = scanner.nextInt();
    scanner.close();

    dias = anos * 365;
    
    System.out.printf("Sua idade em dias é: %d dias", dias);




    }
    
    
}