package TugasPBOGallon;

import java.util.Scanner;

public class Gallontgs1 {

    public static void main(String[] args) {
        Scanner ambil = new Scanner(System.in);

        double Gallons;
        double count;

        System.out.println("Konversi Satuan Liter Galon");
        System.out.println("\nMasukkan Jumlah Galon : ");

        Gallons=ambil.nextDouble();
        count=Gallons*3.785f;

        System.out.printf("%.0f Galon = %.2f Liter \n\n",Gallons,count);
    }
}
