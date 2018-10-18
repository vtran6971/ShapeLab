package com.company;

public class Rectangle extends Shape {
    //fields
    private int height;
    private int width;

    //constructor
    public Rectangle(int height, int width)
    {
        super("Rectangle");
        this.height = height;
        this.width = width;
    }

    //methods

    @Override
    public double getArea() {
        return width*height;
    }

    @Override
    public double getPerimeter()
    {
        return 2*(height+width);
    }
}
