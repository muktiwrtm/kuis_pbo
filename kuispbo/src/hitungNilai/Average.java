package hitungNilai;

public class Average extends Layout {
    private float mean;

    public void rata(Float nilai1, Float nilai2) {
        //mengambil nilai
        nilai1 = Float.parseFloat(String.valueOf(nilai1));
        nilai2 = Float.parseFloat(String.valueOf(nilai2));
        mean = (nilai1 + nilai2)/2;

        System.out.println("Rata - rata   :" + mean);

    }
}
