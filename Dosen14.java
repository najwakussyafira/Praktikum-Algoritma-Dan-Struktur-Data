public class Dosen14 {
     // Atribut
     String idDosen;
     String nama;
     int tahunBergabung;
     int masaKerja;
     String bidangKeahlian;
     String bidangKeahlianBaru;
     boolean statusAktif;


 public void tampilInformasi() {
         System.out.println("Nama Dosen: " + nama);
         System.out.println("ID Dosen: " + idDosen);
         System.out.println("Tahun Bergabung: " + tahunBergabung);
         System.out.println("Bidang Keahlian: " + bidangKeahlian);
         System.out.println("Status Aktif: " + statusAktif);
         System.out.println("Masa Kerja: " + nama + ":" + masaKerja);

     // Konstruktor default
     public Dosen14() {
         this.idDosen = "Unknown";
         this.nama = "Unknown";
         this.statusAktif = false;
         this.tahunBergabung = 0;
         this.bidangKeahlian = "Unknown";
     }
 
     // Konstruktor berparameter
     public Dosen14(String idDosen, String nama, boolean statusAktif, int tahunBergabung, String bidangKeahlian) {
         this.idDosen = idDosen;
         this.nama = nama;
         this.statusAktif = statusAktif;
         this.tahunBergabung = tahunBergabung;
         this.bidangKeahlian = bidangKeahlian;
     }
 
    
     }
 
     // Method setStatusAktif(status: boolean)
     public void setStatusAktif(boolean status) {
         this.statusAktif = status;
     }
 
     // Method hitungMasaKerja(thnSkrg: int): int
     public int hitungMasaKerja(int thnSkrg) {
         return thnSkrg - this.tahunBergabung;
     }
 
     // Method ubahKeahlian(bidang: String)
     public void ubahKeahlian(String bidang) {
         this.bidangKeahlian = bidang;
     }
}
