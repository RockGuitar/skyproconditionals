package ru.skypro;

public class Main {

    public static void main ( String[] args ) {
        //Задание 1
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2
        int operationalSystem = 1;
        int clientDeviceYear = 2014;
        boolean yearCheck = clientDeviceYear >= 2015;
        if (operationalSystem == 1 && yearCheck) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (operationalSystem == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        if (operationalSystem == 0 && yearCheck) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (operationalSystem == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }


        //Задание 3
        int year = 1900;
        boolean leapYearCheck = (year % 4 == 0) && ((year % 100 != 0) || year % 400 == 0);
        //True когда кратен 4 И (не кратен 100 ИЛИ кратен 400)
        if (leapYearCheck) {
            System.out.println("Введенный год является високосным");
        } else {
            System.out.println("Введенный год не является високосным");
        }


        //Задание 4
        double deliveryDistance = 96;
        int deliveryDays = 1;
        if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays += 1;
        } else if (deliveryDistance > 60) {
            deliveryDays += 2;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
        //Задание 5

        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Сезон месяца: Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Сезон месяца: Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Сезон месяца: Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Сезон месяца: Осень");
                break;
            default:
                System.out.println("Такого месяца не существует!");
        }
    }
}
