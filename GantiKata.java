public class GantiKata {

    public static void main(String[] args) {
        // Kalimat awal
        String kalimatAwal = "aku ya aku. Ga ada yang sama seperti aku. aku itu unik. aku itu langka. dan aku itu berkarakter.";

        // Kata yang akan diganti dan penggantinya
        String kataYangDiganti = "aku";
        String kataPengganti = "rizki";

        // Mendapatkan kalimat baru setelah penggantian
        String kalimatBaru = gantiKata(kalimatAwal, kataYangDiganti, kataPengganti);

        // Menampilkan hasil
        System.out.println("Kalimat awal: " + kalimatAwal);
        System.out.println("Kalimat baru: " + kalimatBaru);
    }

    // Fungsi untuk mengganti kata dalam kalimat
    public static String gantiKata(String kalimat, String kataYangDiganti, String kataPengganti) {
        // Mengganti semua kemunculan kata
        return kalimat.replaceAll(kataYangDiganti, kataPengganti);
    }
}