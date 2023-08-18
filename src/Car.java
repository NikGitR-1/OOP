class Car extends Vehicle {

    private String model;

    public Car(String brand, String model) {
        super(brand);
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println(brand +
                " " + model + " is starting.");
    }


    @Override
    public void stop() {
        System.out.println(brand +
                " " + model + " is stopping.");
    }

    @Override
    public void announceCapacity() {
        // Cars don't have a passenger capacity announcement
    }
}
