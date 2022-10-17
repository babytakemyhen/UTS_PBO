import java.util.Scanner;

// class utama
public class InheritanceLingkaran {

    static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        double r;
        System.out.print("Masukan nilai jari jari (r): ");
        r = sc.nextDouble(); // input nilai jari jari
        
        // membuat object keliling, dan memasukan nilai jari jari
        Keliling keliling = new Keliling(r);
        // membuat object luas, dan memasukan nilai jari jari
        Luas luas = new Luas(r);
        
        System.out.println("Keliling lingkaran dari r = "+ r +" adalah "+ keliling.getKeliling());
        System.out.println("Luas lingkaran dari r = "+ r +" adalah "+ luas.getLuas());
    }
    
}

// class parent
class Lingkaran {
    double phi = 3.14;
    double r;
    
    public Lingkaran(double r) {
        this.r = r;
    }
}

// class child
class Keliling extends Lingkaran {

    public Keliling(double r) {
        super(r);
    }
    
    // mengembalikan nilai hasil perhitungan menggunakan rumus keliling lingkaran
    double getKeliling() {
        return 2 * phi * r;
    }
    
}

// class child
class Luas extends Lingkaran {
    
    public Luas(double r) {
        super(r);
    }
    
    // mengembalikan nilai hasil perhitungan menggunakan rumus luas lingkaran
    double getLuas() {
        return phi * r * r;
    }
    
}
