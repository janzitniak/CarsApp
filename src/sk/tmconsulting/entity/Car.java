package sk.tmconsulting.entity;

import java.util.ArrayList;
import java.util.HashMap;

public class Car {
    private String vendor;
    private String name;
    private String vin;
    private String color;
    private String plateNumber;
    private int year;

    public Car() {
    }

    public Car(String vendor, String name, String vin, String color, String plateNumber, int year) {
        this.vendor = vendor;
        this.name = name;
        this.vin = vin;
        this.color = color;
        this.plateNumber = plateNumber;
        this.year = year;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString()
    {
        return "Výrobca: " + this.vendor + "\nNázov: " + this.name + "\nVIN: " + this.vin + "\nFarba: " + this.color + "\nŠPZ: " + this.plateNumber;
    }

   public String countryName(String countryCode) {
       HashMap<String, String> countryCodes = new HashMap<String, String>();
       countryCodes.put("U5", "Slovensko");
       countryCodes.put("U7", "Slovensko");
       countryCodes.put("TJ", "Česká republika");
       countryCodes.put("TP", "Česká republika");
       return countryCodes.get(countryCode);
    }

    public Car getByPlateNumber(String plateNumber, ArrayList<Car> carList) {
        for (Car car:carList) {
            if (car.getPlateNumber().equals(plateNumber)) {
                return car;
            }
        }
        return null;
    }

    public void getAllVinInformation() {
        String countryCode = this.vin.substring(0, 3);
        //countryName(countryCode);
        String characteristicsCarCode = this.vin.substring(3,8);
        System.out.println("Kód krajiny (znaky 1 až 3): " + countryCode);
        System.out.println("Charakteristika vozidla (znaky 4 až 9): " + characteristicsCarCode);
    }
}
