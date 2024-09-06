package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;

public class Renderer {
    private Shape _shape;
    
    Renderer(Shape shape) {
        this._shape = shape;
    }

    void draw() {
        double area = _shape.getArea();
        // assume implementation
        System.out.println("Shape printed\n" + "Its area is " + area);
    }
}
