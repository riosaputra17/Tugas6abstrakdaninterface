public class Segitiga extends BangunDatar{
    private int alas, tinggi ;

    public Segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void gambar() {
        System.out.println("menggambar segitiga");
    }

    @Override
    public float luas() {
        return (float) (0.5 * alas * tinggi);
    }
}
