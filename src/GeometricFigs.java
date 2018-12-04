import static java.lang.Math.PI;

public class GeometricFigs {
    public static void main(String[] args) {
        area [] figures = {new Rectangle(2,3),new Circle(4),new Triangle(3,5)};
    
        for (area f:figures) {
            System.out.println("Pole powierzchni obiektu "+f.getClass().getName()+" wynosi "+ f.areaOfFigure());
        }
    }
    
    
}

 interface area{
    double areaOfFigure();
 }
 
 class Rectangle implements area{
    double x;
    double y;
    Rectangle(){};
    Rectangle(double x, double y){
        this.x = x;
        this.y = y;
    }
    
     @Override
     public double areaOfFigure() {
         return x*y;
     }
 }
 
 class Circle implements area{
    double radius;
    Circle(){};
    Circle(double r){
        radius = r;
    }
    
     @Override
     public double areaOfFigure() {
         return Math.round(PI*radius*radius*10000d)/10000d; //sztuczka wymuszająca zaokrąglenie bez używania BigDecimal
     }
 }
 
 class Triangle implements area{
    double a;
    double height;
    Triangle(){};
    Triangle(double a, double h){
        this.a = a;
        height = h;
    }
    
     @Override
     public double areaOfFigure() {
         return 0.5*a*height;
     }
 }
