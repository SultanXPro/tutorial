import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int [] a;
        int b;
        System.out.println("please enter array num");
        b = scan.nextInt();
        a = new int[b];
        for (int i = 0; i < b; i++){
            System.out.println("Only Discipline");
            b = scan.nextInt();
        }
    }
}