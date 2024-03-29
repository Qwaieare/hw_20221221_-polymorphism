package Polymorphism;

public class Main {

    public static void main(String[] args) {

    Car car1 = new Car("Toyota", "Land Cruiser", 4.5);
    Car car2 = new Car("Mitsubishi", "Pajero", 3.0);
    Car car3 = new Car("Land Rover", "Range Rover P530 Long", 4.4);
    Car car4 = new Car("Jeep", "Grand Cherokee", 3.6);

    Truck truck1 = new Truck("DAF", "LF 45", 4.0);
    Truck truck2 = new Truck("MAN", "TGL", 4.6);
    Truck truck3 = new Truck("Daewoo", "Novus SE Medium Cargo", 5.9);
    Truck truck4 = new Truck("ISUZU", "ELF", 5.2);

    Bus bus1 = new Bus("ЛиАЗ", "5256", 10.85);
    Bus bus2 = new Bus("ПАЗ", "3206", 4.25);
    Bus bus3 = new Bus("КАВЗ", "4235 АВРОРА", 10.3);
    Bus bus4 = new Bus("ГАЗ", "Вектор Next", 10.0);

        car1.gas(); car2.gas(); car3.gas(); car4.gas();
        truck1.gas(); truck2.gas(); truck3.gas(); truck4.gas();
        bus1.gas(); bus2.gas(); bus3.gas(); bus4.gas();

        System.out.println();
        car1.brake(); car2.brake(); car3.brake(); car4.brake();
        truck1.brake(); truck2.brake(); truck3.brake(); truck4.brake();
        bus1.brake(); bus2.brake(); bus3.brake(); bus4.brake();

        System.out.println();
        car1.pitStop(); car2.pitStop(); car3.pitStop(); car4.pitStop();
        car1.bestLapTime(); car2.bestLapTime(); car3.bestLapTime(); car4.bestLapTime();
        car1.maxSpeed(); car2.maxSpeed(); car3.maxSpeed(); car4.maxSpeed();

        System.out.println();
        truck1.pitStop(); truck2.pitStop(); truck3.pitStop(); truck4.pitStop();
        truck1.bestLapTime(); truck2.bestLapTime(); truck3.bestLapTime(); truck4.bestLapTime();
        truck1.maxSpeed(); truck2.maxSpeed(); truck3.maxSpeed(); truck4.maxSpeed();

        System.out.println();
        bus1.pitStop(); bus2.pitStop(); bus3.pitStop(); bus4.pitStop();
        bus1.bestLapTime(); bus2.bestLapTime(); bus3.bestLapTime(); bus4.bestLapTime();
        bus1.maxSpeed(); bus2.maxSpeed(); bus3.maxSpeed(); bus4.maxSpeed();

        System.out.println();
        Driver<Car> driver1 = new Driver<>("Иванов Иван Иванович", "B", 10.5, car1);
        Driver<Car> driver2 = new Driver<>("Петров Петр Петрович", "B", 11.0, car2);

        driver1.start();
        driver2.start();
        driver1.stop();
        driver2.stop();
        driver1.refuelTheCar();
        driver2.refuelTheCar();

        System.out.println();
        Driver<Truck> driver3 = new Driver<>("Сидоров Сидор Сидорович", "C", 12.5, truck1);
        Driver<Truck> driver4 = new Driver<>("Андреев Андрей Андреевич", "C", 19.5, truck2);

        driver3.start();
        driver4.start();
        driver3.stop();
        driver4.stop();
        driver3.refuelTheCar();
        driver4.refuelTheCar();

        System.out.println();
        Driver<Bus> driver5 = new Driver<>("Васильев Василий Васильевич", "D", 17.5, bus1);
        Driver<Bus> driver6 = new Driver<>("Михайлов Михаил Михайлович", "D", 18.5, bus2);

        driver5.start();
        driver6.start();
        driver5.stop();
        driver6.stop();
        driver5.refuelTheCar();
        driver6.refuelTheCar();

        System.out.println();
        driver1.drivingTruck();
        driver2.drivingTruck();

}
}