/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class Cylinder {
    private Circle base;
    private double height;

    public Cylinder() {
        this.base = new Circle();
        this.height = 0;
    }

    public Cylinder(Point center, double radius, double height) {
        this.base = new Circle(center, radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Circle getBase() {
        return new Circle(base.getCenter(), base.getRadius()); // Deep copy
    }

    public void setBase(Circle base) {
        this.base = new Circle(base.getCenter(), base.getRadius()); // Deep copy
    }

    public double area() {
        return 2 * base.area() + base.circumference() * height;
    }

    public double volume() {
        return base.area() * height;
    }

    public void display() {
        base.display();
        System.out.println("Cylinder height: " + height);
    }

    public boolean isEquivalent(Cylinder other) {
        return this.volume() == other.volume();
    }

    public boolean isIdentical(Cylinder other) {
        return this.volume() == other.volume() && this.area() == other.area();
    }

    public boolean isSame(Cylinder other) {
        return this.isIdentical(other) &&
               this.base.getCenter().getX() == other.base.getCenter().getX() &&
               this.base.getCenter().getY() == other.base.getCenter().getY();
    }
}
