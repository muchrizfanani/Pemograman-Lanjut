import java.util.Scanner; // Digunakan untuk menerima input dari pengguna

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.print("Masukkan sebuah bilangan bulat: ");

        int bilangan = scanner.nextInt();

        if (bilangan % 2 == 0) {

            System.out.println("Bilangan " + bilangan + " adalah GENAP.");
        } else {

            System.out.println("Bilangan " + bilangan + " adalah GANJIL.");
        }


        scanner.close();
    }
}