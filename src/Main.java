import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double way, total =10, kmTotal = 2.2;

        System.out.print("Kaç kilometre gitmek istiyorsunuz : ");
        way = input.nextDouble();

        total += (way * kmTotal);

        total = total >= 20 ? total: 20;
        System.out.print("Taksimetre tutarınız " + total + " TL 'dir.");
    }
}
