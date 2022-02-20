public class Triangle {
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
    }

    public String classifyTriangle(double a,double b,double c){
        String text ="";
        if(a<=0||b<=0||c<=0){
            text="Not A Triangle";
        }
        else if(a+b<=c||a+c<=b||b+c<=a){
            text="Not A Triangle";
        }
        else if (a==b||b==c||c==a){
            if (a==b&&a==c){
                text="Equilateral Triangle";
            }
            else text="Isosceles Triangle";
        }
        else text="Normal Triangle";
        return text;
    }
}
