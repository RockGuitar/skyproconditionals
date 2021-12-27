package ru.skypro;

public class Main {

    public static void main(String[] args) {
        //Задание 1
        int clientOS = 1;
        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задание 2
        // Использовал два варианта реализации условного оператора, в первом случае (Android) if-else if конструкция,
        // во втором (iOS) - через одно вложение
        int operationalSystem = 1;
        int clientDeviceYear = 2014;
        if (operationalSystem == 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        else if (operationalSystem == 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
        else if(operationalSystem == 0){
            if(clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
            else{
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            }

        }

        //Задание 3
        int year = 700;
        var yearCheck1 = year % 4;
        var yearCheck2 = year % 100;
        var yearCheck3 = year % 400;
        if(yearCheck1 == 0){ // Сначала проверяем кратен ли год числу 4.
            if(yearCheck2 ==0 && yearCheck3 != 0){ // Если делится, проверим кратен ли он 100 И не кратен 400
                // При выполнении обоих условий год не високосен, о чем выводится уведомление:
                System.out.println("Введенный год не является високосным");
            }
            else{// При невыполнении хотя бы одного из условий нет причин этому году быть невисокосным, поскольку уже
                // известно изначально что он кратен 4:
                System.out.println("Введенный год является високосным");
            }
        }
        else{ // Если год изначально не кратен 4, то он не будет кратен ни 100, ни 400, следовательно, он изначально
            // не является високосным:
            System.out.println("Введенный год не является високосным");
        }



        //Задание 4
        double deliveryDistance = 96;
        int deliveryDays = 1;
        if(deliveryDistance <=20){
            System.out.println("Срок доставки составит: " + deliveryDays);
        }
        else if(deliveryDistance >20 && deliveryDistance <= 60){
            deliveryDays += 1;
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        else if(deliveryDistance >60){
            deliveryDays += 2;
            System.out.println("Потребуется дней: " + deliveryDays);
        }
        //Задание 5

        int monthNumber = 12;
        switch(monthNumber){
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
