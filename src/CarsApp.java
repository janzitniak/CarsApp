import sk.tmconsulting.entity.Car;
import sk.tmconsulting.entity.Cars;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;

public class CarsApp {
    public static void main(String[] args) {
        Car car = new Car();
        Cars cars = new Cars();

        ArrayList<Car> carTestList = cars.getTestList();
        //cars.showAllInformation(carTestList); // show all information of all cars

        Car searchedCarByPlateNumber = car.getByPlateNumber("BB-001AK", carTestList);
        if (searchedCarByPlateNumber != null) {
            System.out.println();
            System.out.println("Nájdené vozidlo");
            System.out.println("------------");
            System.out.println(searchedCarByPlateNumber);
            System.out.println();
            System.out.println("Informácie ohľadom VIN");
            System.out.println("----------------------");
            searchedCarByPlateNumber.getAllVinInformation();
        }

    }
}
