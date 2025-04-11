// QUESTÃO 1
 import java.util.Scanner;
public class Main{
public static void main (String[] args) {
    Scanner teclado = new
Scanner(System.in);
    System.out.print("Digite a aultura do triângulo:");
    double altura = teclado.nextDouble();
    System.out.print("Digite a base do triângulo:");
    double base = teclado.nextDouble();
    double area = (altura * base) / 2;
    System.out.println("Área = " + area);
}

}
