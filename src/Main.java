//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();
        double r = 2.6;
        Circle c2 = new Circle(r);
        System.out.println(c.getPeremitor());
        System.out.println(c2.getSquare());
        IShape c3 = new Circle();
        c.setRadius(5);
        System.out.println(c.getRadius());
        Triangle t = new Triangle(3,4,5);
        System.out.println(t.getPeremitor());
        System.out.println(t.getSquare());
        Quad q = new Quad(5);
        Rectangle q2 = new Quad(6);
        IShape q3 = new Quad(7);
        ShapeName.print(q2);
    }
}
interface IShape {
    double getPeremitor ();
    double getSquare();
}
class Circle implements IShape{

    private double radius;
    @Override
    public double getPeremitor() {
        return 2*Math.PI*radius;
    }

    @Override
    public double getSquare() {
        return Math.PI*Math.pow(radius,2);
    }

    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(){
        this.radius=1;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }}
class Rectangle implements IShape{
    public double getAside() {
        return aside;
    }

    public void setAside(double aside) {
        this.aside = aside;
    }

    private double aside;

    public double getBside() {
        return bside;
    }

    public void setBside(double bside) {
        this.bside = bside;
    }

    private double bside;

    @Override
    public double getPeremitor() {
        return (aside+bside)*2;
    }

    @Override
    public double getSquare() {
        return aside*bside;
    }
    public Rectangle (double aside,double bside){
        this.bside = bside;
        this.aside = aside;
    }
}
class Triangle implements IShape{
    private double a;
    private double b;
    private double c;
    public double getA(){
        return a;
    }
    public void setA(double a){
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }
    public double getB(){
        return b;
    }
    public double getC(){
        return c;
    }
    public void setC(double c){
        this.c = c;
    }
    public Triangle (double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getPeremitor() {
        return a+b+c;
    }

    @Override
    public double getSquare() {
        double p = (a+b+c)/2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }
}
class Quad extends Rectangle{
    public Quad(double a){
        super(a,a);
    }
}
class ETriangle extends Triangle{
    public  ETriangle(double a){
        super(a,a,a);
    }
}
class ShapeName{
    public static void print(IShape shape){
        System.out.println(shape.getClass().getSimpleName());
    }
}