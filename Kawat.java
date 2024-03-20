class Kawat {
    protected double hargaPerMeter;

    public Kawat(double hargaPerMeter) {
        this.hargaPerMeter = hargaPerMeter;
    }

    public double hitungHarga(int panjang) {
        return hargaPerMeter * panjang;
    }
}

class KawatBiasa extends Kawat {
    public KawatBiasa(double hargaPerMeter) {
        super(hargaPerMeter);
    }

    @Override
    public double hitungHarga(int panjang) {
        return super.hitungHarga(panjang); // Harga kawat biasa sesuai panjang
    }
}

class KawatGalvanis extends Kawat {
    private double biayaGalvanisasi;

    public KawatGalvanis(double hargaPerMeter, double biayaGalvanisasi) {
        super(hargaPerMeter);
        this.biayaGalvanisasi = biayaGalvanisasi;
    }

    @Override
    public double hitungHarga(int panjang) {
        return super.hitungHarga(panjang) + biayaGalvanisasi; // Harga kawat galvanis ditambah biaya galvanisasi
    }
}

public class Main {
    public static void main(String[] args) {
        KawatBiasa kawatBiasa = new KawatBiasa(10); // Harga per meter kawat biasa = 10
        KawatGalvanis kawatGalvanis = new KawatGalvanis(15, 20); // Harga per meter kawat galvanis = 15, biaya galvanisasi = 20

        int panjangKawat = 50; // Panjang kawat dalam meter

        // Menghitung harga kawat biasa
        double hargaBiasa = kawatBiasa.hitungHarga(panjangKawat);
        System.out.println("Harga kawat biasa (" + panjangKawat + " meter): $" + hargaBiasa);

        // Menghitung harga kawat galvanis
        double hargaGalvanis = kawatGalvanis.hitungHarga(panjangKawat);
        System.out.println("Harga kawat galvanis (" + panjangKawat + " meter): $" + hargaGalvanis);
    }
}