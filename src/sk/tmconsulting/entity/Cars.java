package sk.tmconsulting.entity;

import java.util.ArrayList;

public class Cars {

    // Getting the list of some cars
    public ArrayList<Car> getTestList() {
        ArrayList<Car> list = new ArrayList<Car>();
        Car car1 = new Car("Honda", "Civic", "AFDFJKJ0909909", "red", "BB-001AK", 2000);
        Car car2 = new Car("Audi", "RS7", "IV67868766786", "black", "BA-999XL", 2022);
        list.add(car1);
        list.add(car2);
        return list;
    }

    public void showAllInformation(ArrayList<Car> carList) {
        for(Car car:carList) {
            System.out.println(car.getName());
            System.out.println(car.getVendor());
            System.out.println(car.getVin());
            System.out.println(car.getColor());
            System.out.println(car.getPlateNumber());
            System.out.println(car.getYear());
            System.out.println();
        }
    }
}
