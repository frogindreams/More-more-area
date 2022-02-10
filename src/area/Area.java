package area;

import java.lang.Math;

interface Polygon {
    /*
     * an interface is used to help to create new figure-classes
     */

    void getArea();

    default void getPerimeter(int... sides) {
        int perimeter = 0;
        for (int side: sides) {
            perimeter += side;
        }

        System.out.println("The perimeter is " + perimeter);
    }
}

public class Triangle implements Polygon {
    private int a, b, c;
    private double s, area;

    Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        s = 0;
    }

    public void getArea() {
        s = (double) (a + b + c) / 2;
        area = Math.sqrt( s * (s - a) * (s - b) * (s - c) );

        System.out.println("The area is " + area);
    }
}
