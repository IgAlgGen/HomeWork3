public class Main {
    public static void main(String[] args) {
        //Задача 1.
        System.out.println("Задача 1");
        byte small = 5;
        short medium = 15;
        int big = 150;
        long huge = 1500;
        float fractionalSmall = 0.1F; // Задаю float и выводит ошибку Incompatible types. Found: 'double', required: 'float'
        double fractionalBig = 25.9585;
        System.out.println("Значение переменной small с типом byte равно " + small);
        System.out.println("Значение переменной medium с типом short равно " + medium);
        System.out.println("Значение переменной big с типом int равно " + big);
        System.out.println("Значение переменной huge с типом long равно " + huge);
        System.out.println("Значение переменной fractionalSmall с типом float равно " + fractionalSmall);
        System.out.println("Значение переменной fractionalBig с типом double равно " + fractionalBig);

        //Задача 2
        System.out.println("Задача 2");
        float a = 27.12F;   // float постоянно заменяется на double
        // решается cast to 'float'
        // или добавление 'F' в конце переменной ???
        long g = 987_678_965_549L;  // long так-же воспринимается как integer
        // 'L' в конце и все ???
        double i = 2.786;   // подозреваю ошибку в задании
        boolean b = false;
        short c = 569;
        int e = -159;
        char d = 27897;
        byte f = 67;
        System.out.println(a + " " + g + " " + i + " " + b + " " + c + " " + e + " " + d + " " + f);

        //задача 3
        System.out.println("Задача 3");
        short studentsLP = 23;
        short studentsAS = 27;
        short studentsEA = 30;
        short paper = 480;
        System.out.println("На каждого ученика рассчитано " + paper / (studentsAS + studentsLP + studentsEA) + " листов бумаги");

        //Задача 4
        System.out.println("Задача 4");
        int prodPerMin = 16 / 2;
        int prodTime;
        prodTime = 20;
        String amountTime = "минут";
        System.out.println("За " + prodTime + " " + amountTime + " машина произвела бутылок: " + (prodPerMin * prodTime) + " штук");
        prodTime = 60 * 24;
        amountTime = "сутки";
        System.out.println("За " + (prodTime / 1440) + " " + amountTime + " машина произвела бутылок: " + (prodPerMin * prodTime) + " штук");
        prodTime = 60 * 24 * 3;
        amountTime = "дня";
        System.out.println("За " + (prodTime / 1440) + " " + amountTime + " машина произвела бутылок: " + (prodPerMin * prodTime) + " штук");
        prodTime = 60 * 24 * 30;
        amountTime = "месяц";
        System.out.println("За " + (prodTime / 43200) + " " + amountTime + " машина произвела бутылок: " + (prodPerMin * prodTime) + " штук");

        //Задача 5
        System.out.println("Задача 5"); // like "Beer Song"
        int whiteColor = 2;
        int brownColor = 4;
        int wholeCansOfPaint = 120;
        int room = 0;
        while (wholeCansOfPaint > 0) {
            wholeCansOfPaint = wholeCansOfPaint - (whiteColor + brownColor);
            room = room + 1;
            if (wholeCansOfPaint == 0) {
                System.out.println("В школе, где " + room + " классов, нужно " + (room * whiteColor) + " банок белой краски и " + (room * brownColor) + " банок коричневой краски");
            }
        }

        // Задача 6
        System.out.println("Задача 6");
        int bananas = 5;
        double weight1Banana = 0.080;
        int milk100Ml = 2;
        double weight100MlMilk = 0.105;
        int iceCream = 2;
        double weight1IceCream = 0.100;
        int eggs = 4;
        double weight1egg = 0.070;
        double allInBlender = (bananas * weight1Banana) + (milk100Ml * weight100MlMilk) + (iceCream * weight1IceCream) + (eggs * weight1egg);
        System.out.println("Вес завтрака = " + (int)(allInBlender * 1000) + " грамм.");
        System.out.println("Вес завтрака = " + allInBlender + " килограмм.");

        //Задача 7
        System.out.println("Задача 7");
        int necessaryWeight = 7000;
        int loose250 = 250;
        int loose500 = 500;
        System.out.println((necessaryWeight/loose250)+ " дней необходимо при потере " +loose250+ " грамм в день.");
        System.out.println((necessaryWeight/loose500)+ " дней необходимо при потере " +loose500+ " грамм в день.");
        System.out.println((((necessaryWeight/loose250)+(necessaryWeight/loose500))/2)+ " дней в среднем.");
        System.out.println("Остаток от деления " + ((double)((necessaryWeight/loose250)%(necessaryWeight/loose500))));

        //Второй вариант решения
        System.out.println("Второй вариант решения. Задача 7");
        double necessaryWeight250 = -7;
        double loose250G = 0.250;
        int day250 = 0;
        while (necessaryWeight250 < 0) {
            necessaryWeight250 = necessaryWeight250 + loose250G;
            day250++;
            if (necessaryWeight250 == 0) {
                System.out.println("При потере " +(int)(loose250G * 1000) + " грамм необходимо " + day250 + " дней.");
            }
        }

        double necessaryWeight500 = -7;
        double loose500G = 0.500;
        int day500 = 0;
        while (necessaryWeight500 < 0) {
            necessaryWeight500 = necessaryWeight500 + loose500G;
            day500++;
            if (necessaryWeight500 == 0) {
                System.out.println("При потере " + (int)(loose500G * 1000) + " грамм необходимо " + day500 + " дней.");
            }
        }
        int mediumAverageOfDays = (day500 + day250)/2;
        System.out.println(mediumAverageOfDays + " дней в среднем, чтобы добиться результата похудения");

        //Задача 8
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        System.out.println("Маша теперь получает " + (mashaSalary+(mashaSalary*0.1)) + "рублей. Годовой доход вырос на " + ((mashaSalary*0.1)*12) + " рублей");
        System.out.println("Денис теперь получает " + (denisSalary+(denisSalary*0.1)) + "рублей. Годовой доход вырос на " + ((denisSalary*0.1)*12) + " рублей");
        System.out.println("Кристина теперь получает " + (kristinaSalary+(kristinaSalary*0.1)) + "рублей. Годовой доход вырос на " + ((kristinaSalary*0.1)*12) + " рублей");

    }
}