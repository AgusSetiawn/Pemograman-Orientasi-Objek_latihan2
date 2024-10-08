public class AkunBank {
    private String nomorRekening;
    private String namaPemilik;
    private double saldo;

    // Constructor
    public AkunBank(String nomorRekening, String namaPemilik, double saldo) {
        this.nomorRekening = nomorRekening;
        this.namaPemilik = namaPemilik;
        this.saldo = saldo;
    }

    // Instance methods
    public void simpanUang(double jumlah) {
        this.saldo += jumlah;
        System.out.println("Rp. " + jumlah + " telah disimpan. Saldo sekarang: Rp. " + this.saldo);
    }

    public void ambilUang(double jumlah) {
        if (jumlah > this.saldo) {
            System.out.println("Saldo tidak cukup untuk mengambil Rp. " + jumlah);
        } else {
            this.saldo -= jumlah;
            System.out.println("Rp. " + jumlah + " telah diambil. Saldo sekarang: Rp. " + this.saldo);
        }
    }

    public double cekSaldo() {
        return this.saldo;
    }

    public static void main(String[] args) {
        // Create an AkunBank object with initial balance of Rp. 100000
        AkunBank akun = new AkunBank("1234567890", "Antor", 100000);

        System.out.println("Saldo awal: Rp. " + akun.cekSaldo());

        // Call the instance methods
        akun.simpanUang(50000);
        akun.ambilUang(20000);
        akun.simpanUang(30000);
        akun.ambilUang(40000);

        System.out.println("Saldo akhir: Rp. " + akun.cekSaldo());
    }
}