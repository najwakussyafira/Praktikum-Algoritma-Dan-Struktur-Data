public class MataKuliahMain {
    public static void main(String[] args) {
        // Membuat objek mk1 menggunakan konstruktor default
        MataKuliahMain mk1 = new MataKuliahMain();
        mk1.kodeMK = "IF101";
        mk1.nama = "Algoritma";
        mk1.sks = 3;
        mk1.jumlahJam = 5;

        // Memanggil semua method untuk mk1
        System.out.println("Informasi Mata Kuliah mk1:");
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(1);
        mk1.tampilInformasi();

        // Membuat objek mk2 menggunakan konstruktor berparameter
        MataKuliah mk2 = new MataKuliah("IF102", "Struktur Data", 4, 6);

        // Memanggil semua method untuk mk2
        System.out.println("\nInformasi Mata Kuliah mk2:");
        mk2.tampilInformasi();
        mk2.ubahSKS(5);
        mk2.tambahJam(3);
        mk2.kurangiJam(2);
        mk2.tampilInformasi();
    }
}
