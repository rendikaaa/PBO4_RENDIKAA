// Kelas utama untuk menghitung luas kolam
class Kolam {
    // Metode untuk menghitung luas kolam persegi panjang
    public double hitungLuas(double panjang, double lebar) {
        return panjang * lebar;
    }
}

// Kelas turunan untuk menghitung luas kolam lingkaran
class KolamLingkaran extends Kolam {
    // Override metode untuk menghitung luas kolam lingkaran
    public double hitungLuas(double jariJari) {
        return Math.PI * jariJari * jariJari;
    }
}

public class Main {
    public static void main(String[] args) {
        Kolam kolam = new Kolam(); // Membuat objek kolam

        double panjang = 10;
        double lebar = 5;
        double jariJari = 7;

        // Menghitung luas kolam persegi panjang
        double luasPersegiPanjang = kolam.hitungLuas(panjang, lebar);
        System.out.println("Luas kolam persegi panjang: " + luasPersegiPanjang);

        KolamLingkaran kolamLingkaran = new KolamLingkaran(); // Membuat objek kolam lingkaran

        // Menghitung luas kolam lingkaran
        double luasLingkaran = kolamLingkaran.hitungLuas(jariJari);
        System.out.println("Luas kolam lingkaran: " + luasLingkaran);
    }
}