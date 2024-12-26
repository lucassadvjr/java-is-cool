import java.util.Scanner;

public class MediaAritimetica {
    // Função cálculo de média
    public float MediaCalc(float n1, float n2, float n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {
        // Declaração de variáveis
        float n1, n2, n3;

        // Entrada de dados
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite as 3 notas para o cálculo:");

        n1 = scanner.nextFloat();
        n2 = scanner.nextFloat();
        n3 = scanner.nextFloat();

        // Instância da classe para chamar o método
        MediaAritimetica mediaAritimetica = new MediaAritimetica();
        float media = mediaAritimetica.MediaCalc(n1, n2, n3);

        // Exibição da média
        System.out.printf("A sua média foi: %.2f%n", media);
        scanner.close();
    }
}
