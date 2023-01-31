package main.java.ru.fixgroup.calculator;


public class CostCalculator {

    private double kg1Cost;
    private double km1Cost;

    public CostCalculator(double kg1Cost, double km1Cost) {
        this.kg1Cost = kg1Cost;
        this.km1Cost = km1Cost;
    }

    public double calcCost(ru.fixgroup.interfaces.iGruz gruz, int km) {
        return gruz.getWeght() * kg1Cost + km * km1Cost;
    }


}
