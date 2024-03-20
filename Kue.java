class Kue {
    protected double hargaPerKue;

    public Kue(double hargaPerKue) {
        this.hargaPerKue = hargaPerKue;
    }

    public double hitungHarga(int jumlah) {
        return hargaPerKue * jumlah;
    }
}

class KueBiasa extends Kue {
    public KueBiasa(double hargaPerKue) {
        super(hargaPerKue);
    }

    @Override
    public double hitungHarga(int jumlah) {
        return super.hitungHarga(jumlah); // Harga kue biasa sesuai jumlah
    }
}

class KuePremium extends Kue {
    private double tambahanHarga;

    public KuePremium(double hargaPerKue, double tambahanHarga) {
        super(hargaPerKue);
        this.tambahanHarga = tambahanHarga;
    }

    @Override
    public double hitungHarga(int jumlah) {
        return (super.hitungHarga(jumlah) + tambahanHarga * jumlah); // Harga kue premium ditambah tambahan harga
    }
}

public class Main {
    public static void main(String[] args) {
        KueBiasa kueBiasa = new KueBiasa(1.5); // Harga per kue biasa = 1.5
        KuePremium kuePremium = new KuePremium(2.0, 1.0); // Harga per kue premium = 2.0, tambahan harga = 1.0

        int jumlahKue = 20; // Jumlah kue yang dibeli

        // Menghitung harga kue biasa
        double hargaBiasa = kueBiasa.hitungHarga(jumlahKue);
        System.out.println("Harga kue biasa (" + jumlahKue + " buah): $" + hargaBiasa);

        // Menghitung harga kue premium
        double hargaPremium = kuePremium.hitungHarga(jumlahKue);
        System.out.println("Harga kue premium (" + jumlahKue + " buah): $" + hargaPremium);
    }
}