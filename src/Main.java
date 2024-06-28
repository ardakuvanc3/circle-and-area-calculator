import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final int pi = 3;
        int acı;

        int cevre, alan;

        System.out.println("Yarıçap Değeri: ");
        int yarıcap = scan.nextInt();

        System.out.println("Açı: ");
        acı = scan.nextInt();


        cevre = 2 * 3 * yarıcap;
        alan = (pi * yarıcap * yarıcap * acı) / 360;

        System.out.println("Çevre: " + cevre + "br");
        System.out.println("Alan: " + alan + "br");
    }
}