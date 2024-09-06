package edu.cmu.cs.cs214.lab02.shapes;

public class Rectangle implements Shape {
    private double _height;
    private double _width;
    
    public Rectangle(double height, double width){
        this._height = height;
        this._width = width;
    }

    public double getArea() {
        return _height * _width;
    }
}
