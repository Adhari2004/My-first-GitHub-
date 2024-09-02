/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class TestCylinder {

    public static void main(String[] args) {
        Cylinder cylinder1 = new Cylinder(new Point(6, -2), 2.5, 5);
        Cylinder cylinder2 = new Cylinder();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x, y, radius and height for cylinder2: ");
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        double radius = scanner.nextDouble();
        double height = scanner.nextDouble();

        cylinder2.setBase(new Circle(new Point(x, y), radius));
        cylinder2.setHeight(height);

        System.out.println("Details of Cylinder 1: ");
        cylinder1.display();

        System.out.println("Details of Cylinder 2: ");
        cylinder2.display();

        System.out.println("Cylinder 1 and Cylinder 2 are equivalent: " + cylinder1.isEquivalent(cylinder2));
        System.out.println("Cylinder 1 and Cylinder 2 are identical: " + cylinder1.isIdentical(cylinder2));
        System.out.println("Cylinder 1 and Cylinder 2 are same: " + cylinder1.isSame(cylinder2));
    }
}
