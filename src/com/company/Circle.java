package com.company;

public abstract class Circle extends Shape
{
  private int radius;
    public Circle(int radius) {
        super("Circle");
        this.radius = radius;
    }
    @Override
    public double getArea()
    {
        return 3.14*Math.pow(radius, 2);
    }

    @Override
    public double getPerimeter()
    {
        return 2*3.14*radius;
    }
}
