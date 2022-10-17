/**
 * 2021071012
 * rizky mahendra
 */
package penjumlahan10nilai;

import java.util.Arrays;
import java.util.Scanner;

public class Penjumlahan10Nilai {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        // maksimal input adalah 10 nilai
        int MAX_INPUT = 10;
        
        // variabel untuk menampung list nilai
        int nilai[] = new int[MAX_INPUT];
        
        // total penjumlahan semua nilai yang dimasukan
        int total = 0;
        
        // memasukan 10 nilai
        for(int i = 0; i < MAX_INPUT; i++) {
            System.out.print("Masukan nilai ke-"+ (i+1) +": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }
        
        System.out.println("\n\n");
        System.out.println("Total penjumlahan "+ Arrays.toString(nilai) +" adalah "+ total);
    }
    
}
