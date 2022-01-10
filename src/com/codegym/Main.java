package com.codegym;

public class Main {

    public static void main(String[] args) {
        Circle circle1 = new Circle(1,"red");
        Circle circle2 = new Circle(2,"blue");
        System.out.println(circle1.getRadius());
        System.out.println(circle2.getArea(circle2.radius));
    }
}
