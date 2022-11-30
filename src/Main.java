public class Main {
    public static void main(String[] args) {
        System.out.println("Tugas Abstrack dan Interface");

        // membuat objek lingkaran dari bangundatar
        BangunDatar lingkaran = new Lingkaran(20);

        //membuat objek segitiga dari bangundatar
        BangunDatar segitiga = new Segitiga(25, 30);

        // membuat objek persegi dari bangundatar
        BangunDatar persegi = new Persegi(10F, 10F);

        // memanggil method draw //
        lingkaran.gambar();
        segitiga.gambar();
        persegi.gambar();

        System.out.println(" Luas Lingkaran:" + lingkaran.luas());
        System.out.println(" Luas Segitiga :" + segitiga.luas());
        System.out.println(" Luas Persegi:" + persegi.luas());
    }



}