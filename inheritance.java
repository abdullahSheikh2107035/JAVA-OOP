class Shape{
    String color;
    Shape(){}
    Shape(String color){
        this.color = color;
    }
}
class Triangle extends Shape{
    float base, height;
    Triangle(String color, float base, float height){
        super(color);
        this.base = base;
        this.height = height;
    }
    void area(){
        float area = 0.5f * base * height;
        System.out.println("Area of Triangle: " + area);
    }
}
class EquilateralTriangle extends Triangle{
    void area(){
        float area = (float)(Math.sqrt(3) / 4 * base * base);
        System.out.println("Area of Equilateral Triangle: " + area);
    }
}
class Circle extends Shape{
    float radius;
    Circle(String color, float radius){
        super(color);
        this.radius = radius;
    }
    void area(){
        float area = (float)(Math.PI * radius * radius);
        System.out.println("Area of Circle: " + area);
    }
}
public class inheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle("Red", 5.0f, 10.0f);
        t1.area();
        System.out.println("Color of Triangle: " + t1.color);
        EquilateralTriangle et1 = new EquilateralTriangle("Blue", 6.0f, 0);
        et1.area();
        System.out.println("Color of Equilateral Triangle: " + et1.color);
        Circle c1 = new Circle("Green", 7.0f);
        c1.area();

    }
}