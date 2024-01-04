package carproject;

public class Araba {


    private String model;
    private String renk;
    private int motor;
    private int yil;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {

        if (motor < 1000 ) {
            System.out.println("Motor hacmi 1000' nin altında olmaz!");
        } else this.motor = motor;

    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        if (yil >= 1885 && yil <= 2023) {
            this.yil = yil;
        } else this.yil = 2023;

    }
    public Araba(String model, String renk, int motor, int yil) {
        this.model = model;
        this.renk = renk;
        this.setMotor(motor);
        this.setYil(yil);

    }

    @Override
    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}';
    }
}