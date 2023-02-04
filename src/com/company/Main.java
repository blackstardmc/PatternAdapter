package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    LegacyPrinter legacyPrinter=new LegacyPrinter();
    Printer printer= new PrinterAdapter(legacyPrinter);
    printer.print("ink","Hello World!");
    }
}
