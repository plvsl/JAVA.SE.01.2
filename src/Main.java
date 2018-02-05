public class Main {
    public static void main(String[] args) {

        double param = 0.0008;//Double.parseDouble(args[0]);
        double a;

        for (int i = 1;; i++) {

            a = 1 / Math.pow((1 + i), 2);
            System.out.println(a);

            if (a < param) {
                System.out.println(i);
                break;
            }

        }
    }
}
