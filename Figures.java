class Figure {
    int x, y;
    Figure(int xc, int yc){
        x = xc;
        y = yc;
    }
    void display() {
        System.out.println(x, y);
    }
    void returnError()
    {
        throw new RuntimeException("There is no figure with such parameters.");
    }
} 

class Rectangle extends Figure{
    int a, b;
    
    Rectangle(int xc, int yc, int ac, int bc){
        super(xc, yc);
        a = ac;
        b = bc;
        if (a <= 0 || b <=0)
        {
           returnError();
        }
    }

    void display(){
        System.out.print(x); 
        System.out.print(y); 
        System.out.print(a);
        System.out.println(b);
    }
    void display_square()
    {
        System.out.println(a*b);
    }
    void display_perimeter(){
        System.out.println(2*(a+b));
    }
}

class Circle extends Figure{
    int r;
    
    Circle(int xc, int yc, int rc){
        super(xc, yc);
        r = rc;
        if (r <=0)
        {
           returnError();
        }
    }

    void display(){
        
        System.out.print(x); 
        System.out.print(y); 
        System.out.println(r);
    }
    void display_square()
    {
        System.out.println(3.14*r*r);
    }
    void display_perimeter(){
        System.out.println(2*3.14*r);
    }
}

class Triangle extends Figure{
    int a;
    
    Triangle(int xc, int yc, int ac){
        super(xc, yc);
        a = ac;
        if (a <= 0)
        {
           returnError();
        }
    }

    void display(){
        
        System.out.print(x); 
        System.out.print(y); 
        System.out.println(a);
    }
    void display_square()
    {
        System.out.println(a*a*sqrt(3)/4);
    }
    void display_perimeter(){
        System.out.println(3*a);
    }
}

public class Figures {

    public static void main(String[] args){
        Rectangle r = new Rectangle(0, 0, -10, 5);
        Triangle t = new Triangle(0, 0, 15);
        Circle c = new Circle(0, 0, 45);
        r.display();
        r.display_perimeter();
        r.display_square();
    }
}