package PrimitivevsReferenceTypes;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        Point pointOne = new Point(1,1);
        Point pointTwo = pointOne;
        pointOne.x = 2;
        System.out.println(pointTwo);
    }
}
