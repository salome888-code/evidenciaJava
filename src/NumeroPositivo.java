import java.util.Scanner;

public class NumeroPositivo {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese un número: ");
    int numero = sc.nextInt();
    if (numero > 0) {
        System.out.println("El número es positivo.");
    }
    sc.close();
}
}