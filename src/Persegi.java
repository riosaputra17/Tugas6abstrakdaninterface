public class Persegi extends BangunDatar{
    private float panjang, lebar ;

    public Persegi(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }



    @Override
    public void gambar() {
        System.out.println("Menggambar persegi");

    }

    @Override
    public float luas() {
        return panjang * lebar ;
    }
}
