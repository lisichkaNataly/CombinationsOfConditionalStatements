public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");

    int clientOs =  1;
    if (clientOs== 0) {
        System.out.println("Установите версию приложения для iOS по ссылке");
    } else if (clientOs == 1) {
        System.out.println("Установите версию приложения для Android по ссылке");
    }

    // Задание 2
        System.out.println("Задание 2");

    int clientDeviceYear = 2019;
    if (clientOs == 0 && clientDeviceYear >=2015) {
        System.out.println("Приложение для iOS будет работать корректно");
    } else if (clientOs == 0 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для iOS по ссылке");
    } else if (clientOs == 1 && clientDeviceYear >= 2015) {
        System.out.println("Приложение для Android будет работать корректно");
    } else if (clientOs == 1 && clientDeviceYear < 2015) {
        System.out.println("Установите облегченную версию приложения для Android по ссылке");
    }

    // Задание 3
        System.out.println("Задание 3");

    int year = 2020;
    int yearCheck4 = year % 4;
    int yearCheck100 = year % 100;
    int yearCheck400 = year % 400;
    if ((yearCheck4 != 0 || yearCheck100 == 0) && yearCheck400 != 0) {
        System.out.println(year + " не является високосным");
    } else {
        System.out.println(year + " является високосным");
    }


    // Задание 4
        System.out.println("Задание 4");

    int deliveryDistance = 67;
    int deliveryDays = 1;
    if (deliveryDistance > 20) {
        deliveryDays++;
    }
    if (deliveryDistance > 60) {
        deliveryDays++;
    }
        System.out.println("Потребуется дней:" + deliveryDays);


    // Задание 5
        System.out.println("Задание 5");

    int monthNumber = 20;

    switch (monthNumber) {
        case 12:
        case 1:
        case 2:
            System.out.println("Зима");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("Весна");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("Лето");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("Осень");
            break;
        default:
            System.out.println("Такого месяца не существует. Некорректный месяц: " + monthNumber);
    }



    }
}