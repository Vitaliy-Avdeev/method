public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int year = 2024;
        calculateLeapYear(year);
        if (year < 1584) {
            System.out.println("Високосный год ввели после этого года");
        } else {
            System.out.println(calculateLeapYear(year));

        }

        int osType = 1;
        int deviceYear = 2015;
        calculateDeviceVersion(osType, deviceYear);
        if (osType > 1) {
            System.out.println(" ");
        } else {
            System.out.println(calculateDeviceVersion(osType, deviceYear));
        }

        int deliveryDistance = 95;
        int days = distanceTime(deliveryDistance);
        if (days > 0) {
            System.out.println("Потребуется дней: " + days + " срок доставки.");
        } else {
            System.out.println("Доставки нет.");
        }

    }

    public static String calculateLeapYear(int year) {
        if (year > 1584 && (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)) {
            return year + " год - високосный";
        } else {
            return year + " год - невисокосный";
        }
    }

    public static String calculateDeviceVersion(int osType, int deviceYear) {
        if (osType == 1) {
            if (deviceYear <= 2015) {
                return "Установите облегченную версию приложения для Android по ссылке";
            } else {
                return "Установите версию приложения для Android по ссылке";
            }
        } else {
            if (deviceYear <= 2015) {
                return "Установите облегченную версию приложения для iOS по ссылке";
            } else {
                return "Установите версию приложения для iOS по ссылке";
            }
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
}