public class Triangle extends Shape{
    public Triangle(){

    }
    public Triangle(double side1, double side2, double side3){
        super(side1, side2, side3);
    }

    @Override
    public String toString() {
        return "Shape {color: " + super.getColor()
                + ", area: " + super.getArea()
                + ", perimeter: " + super.getPerimeter()
                + "}";
    }
}
