
package hitungNilai;

public class Score extends Average {
    private String grade;

    //method konversi untuk mencari nilai huruf yang akan ditampilkan di console
    public void konversi(Float mean) {
        mean = Float.parseFloat(String.valueOf(mean));
        grade = nilaihuruf(mean);

        System.out.println("Nilai huruf   :" + grade);
    }

    // method nilai huruf untuk menentukan nilai huruf
    private String nilaihuruf(float mean) {
        if (mean > 80 && mean <= 100) return  "A";
        else if (mean >= 75 && mean < 80) return  "B+";
        else if (mean >= 65 && mean < 75) return "B";
        else if (mean >= 60 && mean < 65) return  "C+";
        else if (mean >= 50 && mean < 60) return  "C";
        else if (mean >= 20 && mean < 50) return  "D";
        else if (mean >= 0 && mean < 20) return  "E";
        else return  "Error";
    }


}

