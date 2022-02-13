package test.pak;
import java.util.Scanner;

public class Main {

    public static native int add(int a, int b);

    static {
        System.loadLibrary("extraadd");
    }

    public static void main(String[] args) {
        //int num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter two numbers (space separated) : ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        System.out.println("Add result = " + Main.add(num1,num2));
    }
}
