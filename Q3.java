import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner teclado = new
Scanner(System.in);
    System.out.print("Digite o raio do circulo:");
    double raio = teclado.nextDouble();
    double pi = 3.14;
    double area = pi* raio*raio;
    double comprimento = 2 * pi * raio;
    System.out.println("Area ="+ area);
    System.out.println("comrpimento =" + comprimento);
    }
}
