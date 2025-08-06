/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package belajar_java_pamujib_p1;
import javax.swing.JOptionPane;


/**
 *
 * @author LENOVO
 */
public class Bab6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //        String temp = JOptionPane.showInputDialog(null,
//        "Masukan Angka", "Menentukan Ganjil Genap",
//        JOptionPane.QUESTION_MESSAGE);
//        int input =
//        Integer.parseInt(temp);
//        System.out.println((input %
//        2)); if ((input % 2) == 0) {
//           JOptionPane.showMessageDialog(null, "Angka : "
//           + input + " "
//                                    
//                 + "adalah bilangan GENAP", "Informasi",
//               JOptionPane.INFORMATION_MESSAGE);
//       } else if ((input % 2) == 1) {
//          JOptionPane.showMessageDialog(null, "Angka : "
//          + input + " "
//          + "adalah bilangan GANJIL", "Informasi",
//          JOptionPane.INFORMATION_MESSAGE);

//          String umur = JOptionPane.showInputDialog(null, "Kamu umur berapa ?");
//          if (Integer.parseInt(umur) <= 5) {
//          JOptionPane.showMessageDialog(null, "Balita");
//          } else if (Integer.parseInt(umur) >= 6 && Integer.parseInt(umur) <= 11)
//          { JOptionPane.showMessageDialog(null, "Anak - anak");
//          } else if (Integer.parseInt(umur) >= 12 && Integer.parseInt(umur) <= 25)
//          { JOptionPane.showMessageDialog(null, "Remaja");
//          } else {
//          JOptionPane.showMessageDialog(null, "Dewasa");

String nilai = JOptionPane.showInputDialog
(null, "Masukan nilai :");
switch (nilai.toUpperCase()) {
case "A":
JOptionPane.showMessageDialog(null, "Sangat baik.");
break;
case "B":
JOptionPane.showMessageDialog(null, "Baik.");
break;
case "C":
JOptionPane.showMessageDialog(null, "Cukup.");
case "D":
JOptionPane.showMessageDialog(null, "Jelek.");
break;
default :
JOptionPane.showMessageDialog(null,
"Salah memasukan nilai !");

    }
    }
}
