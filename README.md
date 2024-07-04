# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi coffe shop menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa nama pembeli dan jenis kopi atau kue yang di beli, dan memberikan output berupa informasi detail seperti nama pembeli, jenis kopi atau kue, harga, dan ukuran kopi atau rasa kue.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overloading, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** Class adalah cetak biru untuk menciptakan objek. Dalam proyek ini, kita memiliki beberapa kelas: Produk, Kopi, Kue, Pesanan, dan KedaiKopi.
```bash
public class Produk { ... }
public class Kopi extends Produk { ... }
public class Kue extends Produk { ... }
public class Pesanan { ... }
public class KedaiKopi { ... }
```



2. **Object** adalah instance dari kelas. Objek dibentuk dari kelas Kopi, Kue, dan Pesanan dalam kode di atas.

```bash
Pesanan pesanan = new Pesanan();
Kopi kopi = new Kopi(namaKopi, hargaKopi, ukuranKopi);
Kue kue = new Kue(namaKue, hargaKue, rasaKue);
```

3. **Atribut** adalah variabel yang ada di dalam kelas untuk menyimpan data. Pada kelas Produk, atributnya adalah nama dan harga. Pada kelas Kopi, ada atribut tambahan ukuran, dan pada kelas Kue, ada atribut rasa.

```bash
private String nama;
private double harga;
private String ukuran;
private String rasa;
```

4. **Constructor** adalah metode khusus yang digunakan untuk menginisialisasi objek. Dalam kelas Produk, Kopi, dan Kue, kita memiliki konstruktor untuk mengatur nilai awal atribut.

```bash
public Produk(String nama, double harga) {
    this.nama = nama;
    this.harga = harga;
}

public Kopi(String nama, double harga, String ukuran) {
    super(nama, harga);
    this.ukuran = ukuran;
}

public Kue(String nama, double harga, String rasa) {
    super(nama, harga);
    this.rasa = rasa;
}
```

5. **Mutator** adalah metode yang digunakan untuk mengubah nilai atribut. Dalam kelas Produk, Kopi, dan Kue, kita memiliki setter untuk setiap atribut.

```bash
public void setNama(String nama) {
    this.nama = nama;
}

public void setHarga(double harga) {
    this.harga = harga;
}

public void setUkuran(String ukuran) {
    this.ukuran = ukuran;
}

public void setRasa(String rasa) {
    this.rasa = rasa;
}
```

6. **Accessor** adalah metode yang digunakan untuk mengambil nilai atribut. Dalam kelas Produk, Kopi, dan Kue, kita memiliki getter untuk setiap atribut.

```bash
public String getNama() {
    return nama;
}

public double getHarga() {
    return harga;
}

public String getUkuran() {
    return ukuran;
}

public String getRasa() {
    return rasa;
}
```

7. **Encapsulation** adalah konsep OOP di mana atribut kelas disembunyikan dari luar dan hanya bisa diakses melalui metode getter dan setter. Ini diterapkan dengan menjadikan atribut private dan menyediakan metode public untuk mengaksesnya.
```bash
private String nama;
private double harga;
private String ukuran;
private String rasa;

public String getNama() { ... }
public void setNama(String nama) { ... }
```

8. **Inheritance** adalah mekanisme di mana sebuah kelas dapat mewarisi properti dan metode dari kelas lain. Kopi dan Kue mewarisi dari Produk.

```bash
public class Kopi extends Produk { ... }
public class Kue extends Produk { ... }
```

9. **Polymorphism** adalah kemampuan objek untuk mengambil banyak bentuk. Dalam contoh ini, kita menggunakan metode toString() yang di-override di kelas Kopi dan Kue untuk memberikan representasi string yang berbeda.

```bash
@Override
public String toString() {
    return super.toString() + " (" + ukuran + ")";
}

@Override
public String toString() {
    return super.toString() + " [" + rasa + "]";
}
```

10. **Seleksi** adalah penggunaan struktur kontrol seperti if, else, dan switch untuk membuat keputusan dalam kode. Pada kelas KedaiKopi, kita menggunakan switch untuk menangani berbagai opsi menu.

```bash
switch (opsi) {
    case 1:
        // kode untuk menambah kopi
        break;
    case 2:
        // kode untuk menambah kue
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
```

11. **Perulangan** adalah penggunaan struktur kontrol seperti for, while, atau do-while untuk mengulangi eksekusi kode. Pada kelas KedaiKopi, kita menggunakan while untuk terus menjalankan menu sampai pengguna memilih keluar.

```bash
while (true) {
    // opsi menu dan pemrosesan
}

```

12. **Input Output Sederhana** adalah penggunaan input dan output dasar untuk berinteraksi dengan pengguna. Pada kelas KedaiKopi, kita menggunakan Scanner untuk membaca input dari pengguna.

```bash
Scanner scanner = new Scanner(System.in);
System.out.print("Masukkan nama kopi: ");
String namaKopi = scanner.nextLine();
```

13. **Array** adalah struktur data yang menyimpan sejumlah elemen dalam satu variabel. Dalam contoh ini, kita menggunakan ArrayList untuk menyimpan daftar produk dalam pesanan.

```bash
private List<Produk> produk;

public Pesanan() {
    produk = new ArrayList<>();
}
```

14. **Error Handling** adalah penanganan situasi error dalam kode. Dalam kelas KedaiKopi, kita menangani opsi yang tidak valid menggunakan blok default dalam switch.
```bash
default:
    System.out.println("Opsi tidak valid, silakan coba lagi.");
    break;
```

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Pembuat

Nama: Muhammad Abdillah
NPM: 2210010152
