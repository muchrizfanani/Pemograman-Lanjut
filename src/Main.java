import java.util.Scanner; // Digunakan untuk menerima input dari pengguna

public class Main {

    public static void main(String[] args) {

        // 1. Membuat objek Scanner untuk membaca input
        Scanner scanner = new Scanner(System.in);

        // 2. Meminta pengguna memasukkan bilangan
        System.out.print("Masukkan sebuah bilangan bulat: ");

        // 3. Membaca bilangan yang dimasukkan
        int bilangan = scanner.nextInt();

        // 4. Logika penentuan Genap/Ganjil
        //    Bilangan genap adalah bilangan yang habis dibagi 2 (sisa baginya 0)
        //    Operator '%' adalah operator modulus (menghitung sisa bagi)
        if (bilangan % 2 == 0) {
            // Jika sisa baginya 0, maka genap
            System.out.println("Bilangan " + bilangan + " adalah GENAP.");
        } else {
            // Jika sisa baginya bukan 0 (pasti 1), maka ganjil
            System.out.println("Bilangan " + bilangan + " adalah GANJIL.");
        }

        // 5. Menutup objek Scanner setelah selesai
        scanner.close();
    }
}