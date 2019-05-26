import java.util.Scanner;

public class operation {

    public static char getOperation(){
        System.out.println("Введите операцию:");
        Scanner str = new Scanner(System.in);
        char fun= str.next().charAt(0);
        return fun;

        }
    }

