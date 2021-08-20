import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kmucret=2.20 ,acilis =10.00,min=20.00;

        System.out.println("Katedilen Mesafeyi Giriniz(km): ");
        Scanner inp = new Scanner(System.in);
        double km = inp.nextInt();

        double tutar = acilis + (km* kmucret);
        double odenecek = (tutar>20) ? tutar:min;
        System.out.println("Taksi Ücretiniz: " + odenecek +"TL'dir");


    }
}
