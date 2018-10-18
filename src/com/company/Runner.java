package com.company;

public class Runner {
    public static void main(String args[])
    {
        Shape shape1 = new Rectangle(10,5);
        Shape shape2 = new ETriangle(5);
        Shape shape3 = new Circle(10);
        Shape shape4 = new RPentagon(2);

        Shape[] shapes = {shape1, shape2, shape3, shape4};

        for (Shape cur : shapes)
        {
            System.out.println(cur);
            System.out.println("My area is: " + cur.getArea());
            System.out.println("My Perimeter is: " + cur.getPerimeter());
        }
    }
}
