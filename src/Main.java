public class Main {
    public static void checkYears(int year) {
        if (year < 1584) {
            System.out.println("Високосный год ввели после этого года");
        } else if (year % 400 == 0 || year % 4 == 0) {
            System.out.println(year + " год високосный");
        } else if (year % 100 != 0) {
            System.out.println(year + " год невисокосный");
        }
    }

    public static void checkerDeviceClient(int clientDeviceOs, int currentYear) {
        boolean clientOsIos = clientDeviceOs == 0;
        boolean clientOsAndroid = clientDeviceOs == 1;
        boolean year = currentYear < 2015;
        switch (clientDeviceOs) {
            case 0:
                System.out.println("Установите приложение для IOS");
                break;
            case 1:
                System.out.println("Установите приложение для Android");
                break;
            default:
                System.out.println("Некорректность введенного значения");
        }
        if (clientOsIos && year) {
            System.out.println("Установите облегченную версию приложения для iOS");
        } else if (clientOsAndroid && year) {
            System.out.println("Установите облегченную версию приложения для Android");
        }
    }

    public static int distanceTime(int km) {
        if (km <= 20) {
            return 1;
        } else if (km > 20 && km < 60) {
            return 2;
        } else if (km >= 60 && km < 100) {
            return 3;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello world!");
        int year = 2024;
        checkYears(year);
        int clientDeviceOs = 0;
        int currentYear = 2015;
        checkerDeviceClient(clientDeviceOs, currentYear);
        int deliveryDistance = 95;
        int days = distanceTime(deliveryDistance);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days + " срок доставки.");
        } else {
            System.out.println("Доставки нет.");
        }

    }
}