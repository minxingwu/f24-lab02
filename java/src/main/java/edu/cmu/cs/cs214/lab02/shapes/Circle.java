package edu.cmu.cs.cs214.lab02.shapes;

public class Circle implements Shape {
    private double _radius;

    public Circle(double radius) {
        this._radius = radius;
    }

    public double getArea() {
        return Math.PI * _radius * _radius;
    }
}
