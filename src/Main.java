import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Given string:");
        int num = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        System.out.println("fibnocci series:\n" + n1 + "\n" + n2);
        for (int i = 2; i < num; i++) {
            int n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;

        }
    }
}