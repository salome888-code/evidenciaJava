import java.util.Scanner;

class numeroPositivo {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Ingrese un número: ");
    int numeroPositivo = sc.nextInt();
    if (numeroPositivo > 0) {
        System.out.println("El número es positivo.");
    }
    sc.close();
}
}