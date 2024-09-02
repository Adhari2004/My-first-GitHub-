/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class Circle {
    private Point center;
    private double radius;

    public Circle() {
        this.center = new Point();
        this.radius = 0;
    }

    public Circle(Point center, double radius) {
        this.center = new Point(center.getX(), center.getY());  // Deep copy
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Point getCenter() {
        return new Point(center.getX(), center.getY()); // Deep copy
    }

    public void setCenter(Point center) {
        this.center = new Point(center.getX(), center.getY()); // Deep copy
    }

    public double circumference() {
        return 2 * Math.PI * radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public void display() {
        center.display();
        System.out.println("Circle radius: " + radius);
    }
}
