//import library 
import java.util.Scanner;

public class bbIdeal {
    public static void main(String[] args){
        //deklarasi variable
        float bmi, berat, tinggi;
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\t BMI KALKULATOR");
        System.out.println("--------------------------");
        
        //Input Berat dan tinggi badan
        System.out.print("Berat Badan (kg): ");
        berat = scan.nextFloat();
        System.out.print("Tinggi Badan (m) : ");
        tinggi = scan.nextFloat();
        System.out.println("--------------------------");
        
        //perhitungan bmi
        bmi = berat / (tinggi*tinggi);
        System.out.println("BMI anda adalah: " + bmi);
        
        //jika bmi diantara 18.5 sampai 22.9
        if (18.5 <= bmi){
            if (22.9 >= bmi){
                System.out.println("Anda Termasuk Ideal");
            }
        }
        //jika bmi diatas 22.9
        else if(22.9 < bmi){
            System.out.println("Anda Termasuk Overweight");
        }
        //jika bmi dibawah 18.5
        else{
            System.out.println("Anda Termasuk Underweight");
        }
        
        System.out.println("--------------------------");
        System.out.println("\t Terima Kasih");
    }
}
