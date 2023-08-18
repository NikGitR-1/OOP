public class Simple {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry");
        Vehicle bus = new Bus("Mercedes", 40);

        car.start();
        car.stop();

        bus.start();
        bus.stop();
        bus.announceCapacity();
    }
}




