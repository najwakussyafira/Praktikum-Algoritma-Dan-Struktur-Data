public class DosenMain14 {
    public static void main(String[] args) {
        // Menggunakan konstruktor default
        Dosen14 dosen1 = new Dosen14();
        dosen1.tampilInformasi();  // Menampilkan informasi dosen1

        // Menggunakan konstruktor berparameter
        Dosen14 dosen2 = new Dosen14("D123", "Dr. Ahmad", true, 2010, "Matematika");
        dosen2.tampilInformasi();  // Menampilkan informasi dosen2

        // Memanggil method setStatusAktif
        dosen2.setStatusAktif(false);
        dosen2.tampilInformasi();  // Menampilkan informasi dosen2 setelah mengubah status

        // Memanggil method hitungMasaKerja
        int masaKerja = dosen2.hitungMasaKerja(2025);
        System.out.println("Masa Kerja Dosen: " + masaKerja + " tahun");

        // Memanggil method ubahKeahlian
        dosen2.ubahKeahlian("Fisika");
        dosen2.tampilInformasi();  // Menampilkan informasi dosen2 setelah mengubah bidang keahlian
    }
}
