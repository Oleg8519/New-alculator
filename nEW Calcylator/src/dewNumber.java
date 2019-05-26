import java.util.Scanner;

public class dewNumber extends RomanNumber{

    public static int dewNumber() {
        System.out.println("Введите число:");
        Scanner str = new Scanner(System.in);
        int num = str.nextInt();
        System.out.println("Число римскими цифрами:" + RomanNumber.toRoman(num));
        return num;
        }
}
