import java.util.Scanner;

public class TestShape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side 1:");
        double side1 = sc.nextDouble();
        System.out.println("Enter side 2:");
        double side2 = sc.nextDouble();
        System.out.println("Enter side 3:");
        double side3 = sc.nextDouble();
        System.out.println("Enter color:");
        String color = sc.next();
        Shape shape = new Shape(side1, side2, side3);
        shape.setColor(color);
        System.out.println(shape.toString());
    }
}
