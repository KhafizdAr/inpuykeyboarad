/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inputkeyboard1;
import java.util.Scanner;
import java.io.IOException;

/**
 *
 * @author Nahdilan
 */
public class Inputkeyboard1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
        int no1,no2,no3;
        double rata;
        try{
            System.out.print("Masukkan Angka 1 = ");
            no1 = input.nextInt();
            System.out.print("Masukkan Angka 2 = ");
            no2 = input.nextInt();
            System.out.print("Masukkan Angka 3 = ");
            no3 = input.nextInt();
            rata = (no1+no2+no3)/3;
            System.out.println("Rata-rata = " + rata);
        } catch (Exception e) {
            System.out.println("Error!");
        }

        // TODO code application logic here
    }
    
}
