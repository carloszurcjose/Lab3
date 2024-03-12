package com.cruzurc.lab3;

public class Car implements Drivable{

    private String make;
    private String model;
    private int year;
    private String color;
    private int price;

    public Car(String make, String model,
               int year, String color, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.price = price;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void drive() {

    }

    @Override
    public String toString() {
        return getMake() + " " + getModel() + " " + getYear()
                + " " + getColor() + " " + getPrice();
    }
}
