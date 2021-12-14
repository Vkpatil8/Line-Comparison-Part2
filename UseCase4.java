import java.util.Scanner;

public class UseCase4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter co-ordinates for a line 1: ");
        System.out.println("Enter the value of x1 and y1:");
        double x1 = scanner.nextInt();
        double y1 = scanner.nextInt();

        System.out.println("Enter the value of x2 and y2");
        double x2 = scanner.nextInt();
        double y2 = scanner.nextInt();

        System.out.println("Enter co-ordinates for a line 2: ");
        System.out.println("Enter the value of x3 and y3:");
        double x3 = scanner.nextInt();
        double y3 = scanner.nextInt();

        System.out.println("Enter the value of x4 and y4");
        double x4 = scanner.nextInt();
        double y4 = scanner.nextInt();

        UseCase1 useCase1 = new UseCase1();
        double a = useCase1.UseCase1(x1, y1, x2, y2); // Calculating length 1
        double b = useCase1.UseCase1(x3, y3, x4, y4); // Calculating length 2

        new UseCase2(a,b); // calling equal method
        new UseCase3(a,b); // calling compare method
    }
}
