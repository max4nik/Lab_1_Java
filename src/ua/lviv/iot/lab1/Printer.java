package ua.lviv.iot.lab1;

public class Printer {
    private String name;
    private double performancePagePerMinute;
    private int priceInUAH;
    private double wageInKg;
    private String mark;
    private static double powerConsumptionInWatt = 1.2;
    protected Boolean isColor;
    protected String wayToConnect;

    public Printer() {
    }

    public Printer(String name, double performancePagePerMinute, int priceInUAH, double wageInKg, String mark, Boolean isColor, String wayToConnect) {
        this.name = name;
        this.performancePagePerMinute = performancePagePerMinute;
        this.priceInUAH = priceInUAH;
        this.wageInKg = wageInKg;
        this.mark = mark;
        this.isColor = isColor;
        this.wayToConnect = wayToConnect;
    }

    public Printer(String name, double performancePagePerMinute, int priceInUAH, double wageInKg) {
        this(name, performancePagePerMinute, priceInUAH, wageInKg, null, null, null);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPerformancePagePerMinute() {
        return performancePagePerMinute;
    }

    public void setPerformancePagePerMinute(int performancePagePerMinute) {
        this.performancePagePerMinute = performancePagePerMinute;
    }

    public int getPriceInUAH() {
        return priceInUAH;
    }

    public void setPriceInUAH(int priceInUAH) {
        this.priceInUAH = priceInUAH;
    }

    public double getWageInKg() {
        return wageInKg;
    }

    public void setWageInKg(int wageInKg) {
        this.wageInKg = wageInKg;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }


    public static void setPowerConsumptionInWatt(double powerConsumptionInWatt) {
        Printer.powerConsumptionInWatt = powerConsumptionInWatt;
    }

    public static double getPowerConsumptionInWatt() {
        return powerConsumptionInWatt;
    }

    public Boolean getIsColor() {
        return isColor;
    }

    public void setIsColor(Boolean color) {
        isColor = color;
    }

    public String getWayToConnect() {
        return wayToConnect;
    }

    public void setWayToConnect(String wayToConnect) {
        this.wayToConnect = wayToConnect;
    }

    @Override
    public String toString() {
        return "Printer{" +
                "name='" + name + '\'' +
                ", performance_page_per_sec=" + performancePagePerMinute +
                ", priceInUSDDollars=" + priceInUAH +
                ", wageInKG=" + wageInKg +
                ", mark='" + mark + '\'' +
                ", isColor=" + isColor +
                ", wayToConnect='" + wayToConnect + '\'' +
                '}';
    }

    public static void printStaticField() {
        System.out.println("From static method: " + Printer.powerConsumptionInWatt);

    }

    public void printField() {
        System.out.println("From non-static method: " + Printer.powerConsumptionInWatt);
    }

    public void resetValues(String name, double performance_page_per_sec, int priceInUSDDollars, double wageInKG, String mark, Boolean isColor, String wayToConnect) {
        this.name = name;
        this.performancePagePerMinute = performance_page_per_sec;
        this.priceInUAH = priceInUSDDollars;
        this.wageInKg = wageInKG;
        this.mark = mark;
        this.isColor = isColor;
        this.wayToConnect = wayToConnect;
    }
}