package Polymorphism;

import java.util.Objects;

public class Driver<B extends Transport> {
    private final String fullName; // ФИО водителя
    private final String driversLicense; // наличие водительских прав
    private double experience; // стаж
    private B vehicle;

    public Driver(String fullName, String driversLicense, double experience, B vehicle) {
        this.fullName = fullName;
        this.driversLicense = driversLicense;
        this.experience = experience;
        this.vehicle = vehicle;
    }

    public void start() {
        System.out.println(getFullName() + " начать движение на " + Transport.getBrand() + " " + Transport.getModel());
    }

    public void stop() {
        System.out.println(getFullName() + " остановиться на " + Transport.getBrand() + " " + Transport.getModel());
    }

    public void refuelTheCar() {
        System.out.println(getFullName() + " заправить авто " + Transport.getBrand() + " " + Transport.getModel());
    }

    public void drivingTruck() {
        System.out.println("Водитель " + getFullName() +
                " управляет автомобилем " +
                Transport.getBrand() + " " +
                Transport.getModel() + " и будет участвовать в заезде.");
    }

    public String getDriversLicense() {
        return driversLicense;
    }

    public B getVehicle() {
        return vehicle;
    }

    public void setVehicle(B vehicle) {
        this.vehicle = vehicle;
    }

    public String getFullName() {
        return fullName;
    }

    public String getDriver() {
        return driversLicense;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        this.experience = experience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<Transport> driver = (Driver<Transport>) o;
        return Double.compare(driver.experience, experience) == 0 &&
                Objects.equals(fullName, driver.fullName) &&
                Objects.equals(driversLicense, driver.driversLicense);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, driversLicense, experience);
    }
}



