package transport;

public class Car {
    String brand;
    String model;
    double engineVolume;
    String color;
    int productionYear;
    String productionCountry;
    String transmissionType;
    String bodyType;
    String licencePlate;
    int seats;
    boolean tires;

    public String toString() {
        return "Марка: " + getBrand() + "\nСтрана производитель: " + getProductionCountry() + "\nГод выпуска: " + getProductionYear() + "\nМодель: " + getModel() +
                "\nТип кузова: " + getBodyType() + "\nЦвет: " + getColor() + "\nТрансмиссия: " + getTransmissionType() + "\nМотор: " + getEngineVolume() + "\nМест: " + getSeats();
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry,
               String transmissionType, String bodyType, String licencePlate, int seats, boolean tires) {
        this.brand = brand;
        this.model = model;
        this.engineVolume = engineVolume;
        this.color = color;
        this.productionYear = productionYear;
        this.productionCountry = productionCountry;
        this.transmissionType = transmissionType;
        this.bodyType = bodyType;
        this.licencePlate = licencePlate;
        this.seats = seats;
        this.tires = tires;

        if (this.brand == null || this.brand.isEmpty())
            this.brand = "Default";

        if (this.model == null || this.model.isEmpty())
            this.model = "Default";

        if (this.productionCountry == null || this.productionCountry.isEmpty())
            this.productionCountry = "Default";

        if (this.engineVolume <= 0)
            this.engineVolume = 1.5;

        if (this.color == null || this.color.isEmpty())
            this.color = "Белый";

        if (this.productionYear <= 0)
            this.productionYear = 2000;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public void setProductionCountry(String productionCountry) {
        this.productionCountry = productionCountry;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setTires(boolean tires) {
        this.tires = tires;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public String getColor() {
        return color;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isTires() {
        return tires;
    }
}
