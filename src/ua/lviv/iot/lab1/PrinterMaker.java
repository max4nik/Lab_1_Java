package ua.lviv.iot.lab1;

public class PrinterMaker {
    public static void main(String[] args) {
        Printer myPrinter = new Printer();
        Printer momsPrinter = new Printer("HP", 4.0, 99, 1.5);
        Printer dadsPrinter = new Printer("Canon", 7.7, 179, 2.5, "PIXMA", true, "USB");
        System.out.println();

        System.out.println(myPrinter);
        System.out.println(momsPrinter);
        System.out.println(dadsPrinter);
        System.out.println();

        Printer.printStaticField();
        myPrinter.printField();
        System.out.println();

        int amountOfObjectsForArray = 4;
        Printer[] printers = new Printer[amountOfObjectsForArray];
        for (int iterator = 0; iterator < amountOfObjectsForArray; iterator++) {
            printers[iterator] = new Printer();
        }

        for (Printer printer : printers) {
            System.out.println(printer);
        }
    }
}
