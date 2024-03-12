package com.cruzurc.lab3;

import android.content.res.AssetManager;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Showroom {
    private ArrayList<Car> cars = new ArrayList<Car>();

    public Showroom(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public ArrayList<Car> getCars() {
        return cars;
    }

    public void setCars(ArrayList<Car> cars) {
        this.cars = cars;
    }

    public void loadCars(MainActivity activity){
        AssetManager manager = activity.getAssets();
        Scanner scan = null;

        Car car;
        String make;
        String model;
        int year;
        String color;
        int price;
        int i = 0;
        try {
            InputStream file = manager.open("SampleData/cars.csv");
            scan = new Scanner(file);
            scan.useDelimiter(",|\\n");
            scan.nextLine();

            while(scan.hasNext()){
                make = scan.next();
                model = scan.next();
                year = Integer.parseInt(scan.next());
                color = scan.next();
                price = Integer.parseInt(scan.next());

                car = new Car(make, model, year, color, price);
                cars.add(car);


        }}
        catch (IOException e){
            System.out.println("No file is found");
        }
        finally{
            if( scan != null){
                scan.close();
            }
        }

    }

    public Car getCar(int index) {
        if (index >= 0 && index < cars.size()) {
            return getCars().get(index);
        }
        return null;
    }

    @Override
    public String toString() {
        return "";
    }
}
