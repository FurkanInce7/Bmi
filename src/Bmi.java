import java.util.Scanner;
public class Bmi {
    public static void main(String[] args) {
        double boy, kilo;
        double bmi;

        Scanner input= new Scanner(System.in);
        System.out.println("Lutfen Boynuzu Metre Cinsinde Giriniz: ");
        boy= input.nextDouble();
        System.out.println(" Lutfen Kilonuzu Giriniz" );
        kilo= input.nextDouble();

        bmi= kilo/(boy*boy);
        System.out.println(" Vucut Kitle Indeksiniz: " + bmi);

    }
}
