package Person;

public class Person {
    private String nama;
    private String jenisKelamin;
    private int umur;

    // Constructor
    public Person(String nama, String jenisKelamin, int umur) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    // Getters and Setters
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public static void main(String[] args) {
        // Create two objects from the Person class
        Person Anton = new Person("Anton", "Laki-laki", 25);
        Person Riko = new Person("Riko", "Laki-laki", 30);

        // Print the attributes of each object
        System.out.println("Anton's details:");
        System.out.println("Nama: " + Anton.getNama());
        System.out.println("Jenis Kelamin: " + Anton.getJenisKelamin());
        System.out.println("Umur: " + Anton.getUmur());

        System.out.println("\nRiko's details:");
        System.out.println("Nama: " + Riko.getNama());
        System.out.println("Jenis Kelamin: " + Riko.getJenisKelamin());
        System.out.println("Umur: " + Riko.getUmur());
    }

    @Override
    public String toString() {
        return "Main []";
    }
}