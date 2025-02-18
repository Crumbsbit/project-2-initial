package com.csc205.project2;

public class Cone extends Shape
{

    private double height;
    private double radius;

    public Cone()
    {
        super();
        this.height = 0.0;
        this.radius = 0.0;
    }

    public Cone(double height, double radius)
    {
        super();
        this.height = height;
        this.radius = radius;
    }

    public double getHeight()
    {
        return height;
    }

    public double getRadius()
    {
        return radius;
    }

    public void setHeight(double height)
    {
        this.height = height;
    }

    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    @Override
    public String toString()
    {
        final StringBuilder sb = new StringBuilder("Cone {");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double surfaceArea()
    {
        return Math.PI * radius * (radius + Math.sqrt(Math.pow(height, 2) + Math.pow(radius, 2)));
    }

    @Override
    public double volume()
    {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }
}
