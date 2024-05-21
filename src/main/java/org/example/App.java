package org.example;

public class App {
    public static void main(String[] args) {
        int size1 = 10;
        int size2 = 25;
        int size3 = 5;
        int size4 = 20;
        int sum1 = size1 + size2;
        int sum2 = size3 + size4;
        System.out.println("Сума першої пари:" + " " + sum1);
        System.out.println("Cума другої пари:" + " " + sum2);
        int summ1 = 35;
        int summ2 = 25;
        if (summ1 > summ2)
            System.out.println("True, якщо перша сума більша");
        System.out.println("Збільшує першу суму на 1:" + " " + (++summ1));
        System.out.println("Другу суму зменшує на 2:" + " " + (23 % summ2));
        int summm1 = 36;
        int summm2 = 23;
        if (summm1 >= summm2)
            System.out.println("True, якщо перша сума більша");
        if (summm1 % 2 == 0) {
            System.out.println("True");
           if (summm2 % 2 == 1) {
                System.out.println("False");
            }
        }
    }
}