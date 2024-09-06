package edu.cmu.cs.cs214.lab02.shapes;

public class Square implements Shape {
    private double _sideLen;

    public Square(double sideLen) {
        this._sideLen = sideLen;
    }
    
    public double getArea() {
        return _sideLen * _sideLen;
    }
}
