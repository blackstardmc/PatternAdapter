package com.company;

public class LegacyPrinter {
    public void printInk(String content) {
        System.out.println("Printing with ink: \n" + content);
    }

    public void printLaser(String content) {
        System.out.println("Printing with laser: \n" + content);
    }
}

interface Printer{
    void print(String type,String content);
}

class PrinterAdapter implements Printer{

    private  LegacyPrinter legacyPrinter;

    PrinterAdapter(LegacyPrinter legacyPrinter) {
        this.legacyPrinter = legacyPrinter;
    }

    @Override
    public void print(String type, String content) {
        switch (type){
            case "laser":
                legacyPrinter.printLaser(content);
                break;
            case "ink":
                legacyPrinter.printInk(content);
                break;
            default:
                legacyPrinter.printLaser(content);

        }
    }
}