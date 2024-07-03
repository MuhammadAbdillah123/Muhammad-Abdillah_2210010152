
package uas;

import java.util.ArrayList;
import java.util.List;

public class Produk {
    private String nama;
    private double harga;

    public Produk(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Akses (getter)
    public String getNama() {
        return nama;
    }

    // Mutator (setter)
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Akses (getter)
    public double getHarga() {
        return harga;
    }

    // Mutator (setter)
    public void setHarga(double harga) {
        this.harga = harga;
    }

    @Override
    public String toString() {
        return nama + " - Rp" + harga;
    }
}

class Kopi extends Produk {
    private String ukuran; // kecil, sedang, besar

    public Kopi(String nama, double harga, String ukuran) {
        super(nama, harga);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    @Override
    public String toString() {
        return super.toString() + " (" + ukuran + ")";
    }
}

class Kue extends Produk {
    private String rasa;

    public Kue(String nama, double harga, String rasa) {
        super(nama, harga);
        this.rasa = rasa;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    @Override
    public String toString() {
        return super.toString() + " [" + rasa + "]";
    }
}

class Pesanan {
    private List<Produk> produk;
    private double total;

    public Pesanan() {
        produk = new ArrayList<>();
        total = 0.0;
    }

    public void tambahProduk(Produk produk) {
        this.produk.add(produk);
        total += produk.getHarga();
    }

    public double getTotal() {
        return total;
    }

    public void cetakPesanan() {
        System.out.println("Detail Pesanan:");
        for (Produk produk : produk) {
            System.out.println(produk);
        }
        System.out.println("Total: Rp" + total);
    }
}

