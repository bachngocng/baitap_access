package com.codegym;

public class Circle {
    double radius = 1.0;
    String color = "red";

    public Circle() {

    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double getArea(double radius) {
        double area;
        return area = radius * radius * Math.PI;
    }
}
