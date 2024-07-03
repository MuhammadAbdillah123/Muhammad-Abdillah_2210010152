
package uas;

import java.util.Scanner;

public class KedaiKopi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pesanan pesanan = new Pesanan();

        while (true) {
            System.out.println("1. Tambah Kopi");
            System.out.println("2. Tambah Kue");
            System.out.println("3. Cetak Pesanan");
            System.out.println("4. Keluar");

            System.out.print("Pilih opsi: ");
            int opsi = scanner.nextInt();
            scanner.nextLine(); // konsumsi newline

            switch (opsi) {
                case 1:
                    System.out.print("Masukkan nama kopi: ");
                    String namaKopi = scanner.nextLine();
                    System.out.print("Masukkan harga kopi: ");
                    double hargaKopi = scanner.nextDouble();
                    scanner.nextLine(); // konsumsi newline
                    System.out.print("Masukkan ukuran kopi (kecil, sedang, besar): ");
                    String ukuranKopi = scanner.nextLine();

                    Kopi kopi = new Kopi(namaKopi, hargaKopi, ukuranKopi);
                    pesanan.tambahProduk(kopi);
                    break;

                case 2:
                    System.out.print("Masukkan nama kue: ");
                    String namaKue = scanner.nextLine();
                    System.out.print("Masukkan harga kue: ");
                    double hargaKue = scanner.nextDouble();
                    scanner.nextLine(); // konsumsi newline
                    System.out.print("Masukkan rasa kue: ");
                    String rasaKue = scanner.nextLine();

                    Kue kue = new Kue(namaKue, hargaKue, rasaKue);
                    pesanan.tambahProduk(kue);
                    break;

                case 3:
                    pesanan.cetakPesanan();
                    break;

                case 4:
                    System.out.println("Terima kasih telah berkunjung ke Kedai Kopi!");
                    return;

                default:
                    System.out.println("Opsi tidak valid, silakan coba lagi.");
                    break;
            }
        }
    }
}

