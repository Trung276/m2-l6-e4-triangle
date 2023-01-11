import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side:");
        double side = sc.nextDouble();
        System.out.println("Enter color:");
        String color = sc.next();
        Triangle triangle = new Triangle(side, side, side);
        triangle.setColor(color);
        System.out.println(triangle.toString());
    }
}