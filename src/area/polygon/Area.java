package src.area.polygon;

public interface Polygon {
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
