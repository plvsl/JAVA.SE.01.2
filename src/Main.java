import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter parameter:");
        Scanner sc = new Scanner(System.in);
        double param = sc.nextDouble();

        double a;
        int i = 1;

        System.out.println(String.format("Element    | Index "));
        System.out.println(String.format("-------------------"));

        do {
            a = 1 / Math.pow((1 + i), 2);
            i += 1;
            System.out.println(String.format("%-10f | %-7d", a, i));
        } while (a >= param);
    }
}
