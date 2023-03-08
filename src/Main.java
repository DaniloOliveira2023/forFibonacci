import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;
        int num3;
        Scanner s = new Scanner(System.in);
        System.out.println("Digite o número");
        num1 = s.nextInt();
        int i;
        for (i = 1; i <= 30; i++) {
            num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
            System.out.println(num3);
        }
        while (i <= 30) ;
    }
}