class Bus extends Vehicle {
    private int capacity;

    public Bus(String brand, int capacity) {
        super(brand);

        this.capacity = capacity;
    }

    @Override
    public void announceCapacity() {
        System.out.println(brand +
                " bus can carry up to " + capacity + " passengers.");
    }
}
