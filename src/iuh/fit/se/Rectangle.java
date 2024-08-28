/*
 * Rectangle.java     1.0     Wed, 28/08/2024
 *
 * Copyright (c) 2024 IUH. All rights reserved.
 */

package iuh.fit.se;


/*
 * @desc:
 * @author:     Tue Minh
 * @date:       Wed, 28/08/2024
 * @version:    1.0
 */

/**
 * This is representation of a rectangle
 */

public class Rectangle {
    //Attributes
    private double length;
    private double width;

    /**
     * Default constructor
     */
    //Constructors
    public Rectangle() {
        length = 0.0;
        width = 0.0;
    }

    /**
     * Constructor with parameters
     * @param l The length of the rectangle
     * @param w The width of the rectangle
     */
    public Rectangle(double l, double w) {
        if(l < 0 || w < 0)
            throw new IllegalArgumentException("Length and width must be greater than 0");

        length = l;
        width = w;
    }

    //Setters / Getters

    /**
     * Get the length of the rectangle
     * @return The length of the rectangle
     */
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    /**
     * Set the length of the rectangle
     * @param length The length of the rectangle
     * @throws IllegalArgumentException if the length is less than 0
     */
    public void setLength(double length) {
        if(length < 0)
            throw new IllegalArgumentException("Length must be greater than 0");
        this.length = length;
    }

    public void setWidth(double width) {
        if(width < 0)
            throw new IllegalArgumentException("Width must be greater than 0");
        this.width = width;
    }

    //Methods
    public double getArea() {
        return length * width;
    }

    public double getPerimeter() {
        return 2 * (length + width);
    }

}
