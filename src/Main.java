import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double area, pi = 3.14159, raio;
        Scanner scan = new Scanner(System.in);
        System.out.println("Entre com o valor do raio, para o cálculo da área do círculo");
        raio = scan.nextDouble();
        
        area = pi*raio*raio;
        
        System.out.println(area);
        scan.close();
    }
}
