package main.java.ru.fixgroup.gruz;



public class Gruz implements ru.fixgroup.interfaces.iGruz {

    private int weight;                      // масса в кг
    private int volume;                     // объем в м3

    public Gruz(int weight, int volume) {
        this.weight = weight;
        this.volume = volume;
    }

    @Override
    public double getWeght() {
        return weight;
    }
}
