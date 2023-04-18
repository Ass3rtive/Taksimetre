import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int Km;
        double KmB = 2.20, Baslangic = 10, Tutar;
        System.out.print("Km Giriniz : ");
        Km = input.nextInt();

        Tutar = KmB * Km + Baslangic;
        System.out.println(Tutar);


    }
}
