import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleTest extends Triangle {

    @Test
    void classifyTriangle1() {
        double a=2;
        double b=2;
        double c=2;
        String expected="Equilateral Triangle";
        String result=classifyTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void classifyTriangle2() {
        double a=2;
        double b=2;
        double c=3;
        String expected="Isosceles Triangle";
        String result=classifyTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void classifyTriangle3() {
        double a=3;
        double b=4;
        double c=5;
        String expected="Normal Triangle";
        String result=classifyTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void classifyTriangle4() {
        double a=8;
        double b=2;
        double c=3;
        String expected="Not A Triangle";
        String result=classifyTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void classifyTriangle5() {
        double a=-1;
        double b=2;
        double c=1;
        String expected="Not A Triangle";
        String result=classifyTriangle(a,b,c);
        assertEquals(expected,result);
    }
    @Test
    void classifyTriangle6() {
        double a=0;
        double b=1;
        double c=1;
        String expected="Not A Triangle";
        String result=classifyTriangle(a,b,c);
        assertEquals(expected,result);
    }
}