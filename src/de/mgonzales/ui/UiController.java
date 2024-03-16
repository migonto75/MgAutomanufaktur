package de.mgonzales.ui;

import de.mgonzales.model.Car;
import de.rhistel.logic.ConsoleReader;

public class UiController {
    //region Konstanten
    public static final String FOLLOW_INSTRUCTIONS = "Folgen Sie einfach den Anweisungen im Hauptmenü.";
    public static final String MAIN_MENU = "\n--> Hauptmenü: <--";
    public static final String TXT_MENU_BUILD_CAR = "1. Automaßanfertigung";
    public static final String TXT_MENU_HELP = "2. Hilfe";
    public static final String TXT_MENU_EXIT_PROGRAM = "3. Programm beenden";
    public static final String SELECT_OPTIONS = "\nWählen Sie eine Option: \n";
    public static final String INVALID_CHOICE = "\nUngültige Auswahl. Bitte versuchen Sie es erneut.";
    public static final String NUMBERS_OF_DOORS = "Geben Sie die Anzahl der Türen des Autos ein (z.B. 4): ";
    public static final String PRICE_OF_CAR = "Geben Sie den Preis des Autos ein (z.B. 12500): ";
    public static final String COLOR_OF_CAR = "Geben Sie die Farbe des Autos ein (z.B. Schwarz): ";
    public static final String NUMBER_OF_WHEELS = "Geben Sie die Anzahl der Räder des Autos ein (z.B. 5): ";
    public static final String HELP = "\nHilfe:";
    public static final String TXT_INFO = "Dieses Programm ermöglicht es Ihnen, ein Auto nach Maß anzufertigen.";
    public static final String NEW_CAR = "\nIhr neues Auto:\n";
    public static final String TXT_OUTPUT_DOORS = "Türen: ";
    public static final String TXT_OUTPUT_COLOR = "Farbe: ";
    public static final String TXT_OUTPUT_PRICE = "Preis: ";
    public static final String TXT_OUTPUT_WHEELS = "Räder: ";
    public static final String EXIT_PROGRAM = "\nProgram beenden.\n";
    public static final String APP_NAME = """
            = Mg Automanufaktur = 
            """;
    //endregion Konstanten

    //region Methoden

    public static void startApplication() {
        System.out.println(printAppName());
        boolean selectOption = true;

        while (selectOption) {
            System.out.println(MAIN_MENU);
            System.out.println(TXT_MENU_BUILD_CAR);
            System.out.println(TXT_MENU_HELP);
            System.out.println(TXT_MENU_EXIT_PROGRAM);
            System.out.print(SELECT_OPTIONS);

            int usersChoice = ConsoleReader.in.readInt();

            switch (usersChoice) {
                case 1:
                    autoAnfertigen();
                    break;
                case 2:
                    hilfeAnzeigen();
                    break;
                case 3:
                    selectOption = false;
                    break;
                default:
                    System.out.println(INVALID_CHOICE);
            }
        }
        System.out.println(EXIT_PROGRAM);
    }

    private static String printAppName() {
        return APP_NAME;
    }

    private static void autoAnfertigen() {
        System.out.print(NUMBERS_OF_DOORS);
        int doors = ConsoleReader.in.readInt();

        System.out.print(COLOR_OF_CAR);
        String color = ConsoleReader.in.readString();

        System.out.print(PRICE_OF_CAR);
        double price = ConsoleReader.in.readDouble();

        System.out.print(NUMBER_OF_WHEELS);
        int wheels = ConsoleReader.in.readInt();

        // Überprüfen Sie die Gültigkeit der Werte
        if (doors > 0 && price > 0 && wheels > 0) {
            // Erstellen Sie ein neues Auto-Objekt und setzen Sie die Werte
            Car car = new Car();
            car.setDoors(doors);
            car.setColor(color);
            car.setPrice(price);
            car.setWheels(wheels);

            // Geben Sie die Werte mit den Gettern aus
            System.out.println(NEW_CAR);
            System.out.println(TXT_OUTPUT_DOORS + car.getDoors());
            System.out.println(TXT_OUTPUT_COLOR + car.getColor());
            System.out.println(TXT_OUTPUT_PRICE + car.getPrice());
            System.out.println(TXT_OUTPUT_WHEELS + car.getWheels());
        } else {
            System.out.println(INVALID_CHOICE);
        }
    }

    private static void hilfeAnzeigen() {
        System.out.println(HELP);
        System.out.println(TXT_INFO);
        System.out.println(FOLLOW_INSTRUCTIONS);
    }
    //endregion Methoden
}
