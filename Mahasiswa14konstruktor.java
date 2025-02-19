public class Mahasiswa14konstruktor {
        String nim;
        String nama;
        String kelas;
        double ipk;
    
        // Konstruktor default
        public Mahasiswa14konstruktor() {
            this.nim = "";
            this.nama = "";
            this.kelas = "";
            this.ipk = 0.0;
        }
    
        // Konstruktor berparameter
        public Mahasiswa14konstruktor(String nm, String nim, double ipk, String kls) {
            this.nama = nm;
            this.nim = nim;
            this.ipk = ipk;
            this.kelas = kls;
        }
    
        // Method untuk menampilkan informasi mahasiswa
        void tampilkanInformasi() {
            System.out.println("Nama: " + nama);
            System.out.println("NIM: " + nim);
            System.out.println("IPK: " + ipk);
            System.out.println("Kelas: " + kelas);
        }
    
        // Method untuk mengubah kelas mahasiswa
        void ubahKelas(String kelasBaru) {
            kelas = kelasBaru;
        }
    
        // Method untuk memperbarui IPK
        void updateIpk(double ipkBaru) {
            if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
                ipk = ipkBaru;
            } else {
                System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
            }
        }
    
        // Method untuk menentukan nilai kinerja berdasarkan IPK
        String nilaiKinerja() {
            if (ipk >= 3.5) {
                return "Kinerja sangat baik";
            } else if (ipk >= 3.0) {
                return "Kinerja Baik";
            } else if (ipk >= 2.0) {
                return "Kinerja cukup";
            } else {
                return "Kinerja Kurang";
            }
        }
    }
    

