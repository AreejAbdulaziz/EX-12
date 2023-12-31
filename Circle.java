public class Circle extends Shape{
    private double radius=1.0;
    public Circle(String color, boolean filled,double radius) {
        super(color, filled);
        this.radius=radius;
    }
    public Circle(){

    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius,String color,boolean filled) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
