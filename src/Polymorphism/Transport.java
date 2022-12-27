package Polymorphism;

public abstract class Transport {

    private static String brand; // марка автомобиля
    private static String model; // модель автомобиля

    private double engineVolume; // объем двигателя в литрах

    // конструктор
    public Transport(String brand,
                     String model,
                     double engineVolume) {

       if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        this.engineVolume = engineVolume;
    }

    public static String getBrand() {
        return brand;
    }

    public static void setBrand(String brand) {
        Transport.brand = brand;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Transport.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    // методы
    public abstract void gas();  // начать движение

    public  abstract void brake();  // закончить движение

}
