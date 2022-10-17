//import library
import java.util.Scanner;

public class Pulsa {
    public static void main(String[] args){
    
    //deklarasi variable
    int jm1,jm2, jm3, mn1, mn2, mn3, dt1, dt2, 
        dt3, waktu_awal, waktu_akhir, jml_waktu, pulsa, harga;
    
    //input waktu awal dan akhir
    Scanner scan = new Scanner(System.in);
    System.out.println("Format Waktu Percakapan 24 jam");
    System.out.println("----------------------------------------------");
    System.out.println("Waktu Awal");
    System.out.print("Jam: ");jm1 = scan.nextInt();
    System.out.print("Menit: ");mn1 = scan.nextInt();
    System.out.print("Detik: ");dt1 = scan.nextInt();
    System.out.println(" ");
    System.out.println("Waktu Akhir");
    System.out.print("Jam: ");jm2 = scan.nextInt();
    System.out.print("Menit: ");mn2 = scan.nextInt();
    System.out.print("Detik: ");dt2 = scan.nextInt();
    System.out.println("----------------------------------------------");
    
    //perhitungan waktu
    waktu_awal = (jm1*3600)+(mn1*60)+dt1;
    waktu_akhir = (jm2*3600)+(mn2*60)+dt2;
    
    jml_waktu = waktu_akhir - waktu_awal;
    
    //menghitung waktu percakapan
    jm3     = jml_waktu/3600;
    mn3   = (jml_waktu%3600)/60;
    dt3   = (jml_waktu%3600)%60;

    System.out.println("Panjang percakapan : "+jm3+" jam "+mn3+" menit "+dt3+" detik");
    System.out.println("----------------------------------------------");
    
    //perhitungan biaya pulsa
    pulsa = jml_waktu / 5;
    harga = pulsa *150;
    
    System.out.println("Total biaya pulsanya adalah "+harga+" rupiah");
    }
}
