import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> daftarNama = new ArrayList<>();
        int count = 1;

        while (true) {
            System.out.print("Masukkan nama ke-" + count + " : ");
            String nama = scanner.nextLine().trim();

            if (nama.isEmpty()) {
                System.out.println("Nama tidak boleh kosong!!.");
                continue;
            }
            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }
            daftarNama.add(count + ". " + nama);
            count++;
        }
        if (daftarNama.isEmpty()) {
            System.out.println("Tidak ada nama yang dimasukkan!!.");
        } else {
            System.out.println("\nDaftar nama:");
            for (String nama : daftarNama) {
                System.out.println(nama);
            }
        }
    }
}