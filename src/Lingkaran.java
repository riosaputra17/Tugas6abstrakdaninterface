public class Lingkaran extends BangunDatar {
    private int r;

    public Lingkaran(int r) {
        this.r = r;
    }

    @Override
    public void gambar() {
        System.out.println("Menggambar Lingkaran");
    }

    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }
}
