package hitungNilai;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Layout extends JFrame {
   //deklarasi isi dr layout
    JLabel Lnim, Lnama, Lmatkul1, Lnilai1, Lmatkul2, Lnilai2;
    JTextField TFnim, TFnama, TFmatkul1, TFnilai1, TFmatkul2,TFnilai2;
    JButton JBconvert;

    public void displayLayout() {
        //penamaan
        setTitle("Hitung Nilai");
        Lnim = new JLabel("NIM");
        TFnim = new JTextField();
        Lnama = new JLabel("Nama");
        TFnama = new JTextField();
        Lmatkul1 = new JLabel("Mata Kuliah 1");
        TFmatkul1 = new JTextField();
        Lnilai1 = new JLabel("Nilai 1");
        TFnilai1 = new JTextField();
        Lmatkul2 = new JLabel("Mata Kuliah 2");
        TFmatkul2 = new JTextField();
        Lnilai2 = new JLabel("Nilai 2");
        TFnilai2 = new JTextField();
        JBconvert = new JButton("CONVERT");

        //mengosongkan layout
        setLayout(null);

        //menambahkan ke dalam layout
        add(Lnim);
        add(TFnim);
        add(Lnama);
        add(TFnama);
        add(Lmatkul1);
        add(TFmatkul1);
        add(Lnilai1);
        add(TFnilai1);
        add(Lmatkul2);
        add(TFmatkul2);
        add(Lnilai2);
        add(TFnilai2);
        add(JBconvert);

        //penempatan dan posisi di dalam layout
        Lnim.setBounds(80, 70, 120, 20);
        TFnim.setBounds(260, 70, 200, 30);
        Lnama.setBounds(80, 120, 120, 20);
        TFnama.setBounds(260, 120, 200, 30);
        Lmatkul1.setBounds(80, 170, 120, 20);
        TFmatkul1.setBounds(260, 170, 200, 30);
        Lnilai1.setBounds(80, 220, 120, 20);
        TFnilai1.setBounds(260, 220, 200, 30);
        Lmatkul2.setBounds(80, 270, 120, 20);
        TFmatkul2.setBounds(260, 270, 200, 30);
        Lnilai2.setBounds(80, 320, 120, 20);
        TFnilai2.setBounds(260, 320, 200, 30);
        JBconvert.setBounds(260, 370, 100, 30);

        //ukuran layout
        setSize(600, 500);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //membuat action listener
        JBconvert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //exception
                try {

                //mengambil variabel dari gui
                Long nim = Long.parseLong(TFnim.getText());
                String nama = TFnama.getText();
                String matkul1 = TFmatkul1.getText();
                Float nilai1 = Float.parseFloat(TFnilai1.getText());
                String matkul2 = TFmatkul2.getText();
                Float nilai2 = Float.parseFloat(TFnilai2.getText());
                Float mean = (nilai1 + nilai2) / 2;

                //Menampilkan beberapa data ke console
                System.out.println("NIM  :" + nim);
                System.out.println("Nama :" + nama);
                System.out.println("Mata Kuliah 1 :" + matkul1);
                System.out.println("Mata Kuliah 2 :" + matkul2);


                //membuat objek Average
                    Average average = new Average();
                    average.rata(nilai1, nilai2);

                //membuat objek Score
                Score score = new Score();
                score.konversi(mean);

                //error handling
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(rootPane, "Silahkan dicek Kembali");
                } finally {
                    JOptionPane.showMessageDialog(rootPane, "Terima Kasih" );
                }

            }
        }  );

    }

}
