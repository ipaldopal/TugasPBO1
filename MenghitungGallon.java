package TugasPBOGallon;

import java.util.Scanner;

public class Gallontgs1 {

    public static void main(String[] args) {
        Scanner ambil = new Scanner(System.in);

        double Gallons;
        double rms;

        System.out.println("==== Konversi Satuan Liter Galon ===\t");
        System.out.print("\n\t   Masukkan Jumlah Galon : ");

        Gallons=ambil.nextDouble();
        rms=Gallons*3.785f;

        System.out.printf("\t\t%.0f Galon = %.3f Liter \n\n",Gallons,rms);
    }
}
