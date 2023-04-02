public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int age = 16;
        if (age >= 18) {
            System.out.println("Человеку 18 или больше лет");
        }
        else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного подождать");
        }

    }

    public static void task2 () {
        System.out.println("Задача 2");
        int temp = 5;
        if (temp < 5) {
            System.out.println("На улице холодно, нужно надеть шапку");
        }
        else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }

    }

    public static void task3 () {
        System.out.println("Задача 3");
        int speed = 90;
        if (speed > 60) {
            System.out.println("Cкорость превышена");
        }
        else {
            System.out.println("Превышения скорости нет");
        }

    }

    public static void task4 () {
        System.out.println("Задача 4");
        int age = 20;
        if (age >= 2 && age < 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад");
        } else if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу");
        } else if (age >= 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в университет");
        } else if (age >= 24) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить на работу");
        }

    }

    public static void task5 () {
        System.out.println("Задача 5");
        int age = 7;
        boolean parents = false;
        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционе");
        } else if (age > 5 && age < 14 && parents) {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься на аттракционе в сопровождении родителей");
        } else if (age > 5 && age < 14 && !parents) {
            System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционе без сопровождения родителей");
        } else if (age > 14) {
            System.out.println("Если возраст ребенка равен " + age + " то ему можно кататься на аттракционе без сопровождения родителей");
        }

    }

    public static void task6 () {
        System.out.println("Задача 6");
        int passangers = 101;

        if (passangers < 60) {
            System.out.println("В вагоне есть сидячие места");
        } else if (passangers >= 60 && passangers <102) {
            System.out.println("В вагоне есть стоячие места");
        } else if (passangers >= 102) {
            System.out.println("Вагон полностью забит");
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int one = 1;
        int two = 2;
        int three = 3;

        if (one > two && one > three) {
            System.out.println(one + " cамое большее число");
        } else if (two > one && two > three) {
            System.out.println(two + " cамое большее число");
        } else {
            System.out.println(three + " cамое большее число");
        }

    }

}