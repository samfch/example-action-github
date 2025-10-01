public class Mahasiswa {

    private String nama;
    private int nim;
    private String jurusan;


    // Konstruktor
    public Mahasiswa() { // tidak memiliki tipe kembalian & parameter
        System.out.println("Konstruktor Mahasiswa dipanggil.");
        this.nama = "John Doe";
        this.nim = 1234567;
        this.jurusan = "Informatika";
        System.out.println("Nama: " + nama);
    }

    // Parameterized Constructor
    public Mahasiswa(String nama, int nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        System.out.println("Konstruktor dengan parameter dipanggil.");
        System.out.println("Nama: " + nama);
    }

    public Mahasiswa(double IPK) {
        System.out.println("Konstruktor dengan parameter IPK dipanggil.");
        System.out.println("IPK: " + IPK);
    }

    public void Mahasiswa() { // ini adalah method biasa, bukan konstruktor
        System.out.println("Ini adalah method biasa, bukan konstruktor.");
    }

    public void tampilkanInfo(String nama) {
        System.out.println("Ini adalah method dari kelas Mahasiswa." + nama);
    }

    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa("Alice", 7654321, "Sistem Informasi");

        mhs.Mahasiswa(); // memanggil method biasa
    }
}
