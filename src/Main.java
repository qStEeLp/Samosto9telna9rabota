import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число от 1 до 11");
        int ifka = in.nextInt();
        if (ifka == 1) {
            System.out.println("ЗАДАЧА № " + ifka);
            int a = (101 + 0) / 3;
            System.out.println("Ответ: " + a);
            double b = 3.0e-6 * 10000000.1;
            System.out.println("Ответ: " + b);
            boolean c = true && true;
            System.out.println("Ответ: " + c);
            boolean d = false && true;
            System.out.println("Ответ: " + d);
            boolean e = (false && false) || (true && true);
            System.out.println("Ответ: " + e);
            boolean f = (false || false) && (true && true);
            System.out.println("Ответ: " + f);
        }
        else if (ifka == 2) {
            System.out.println("ЗАДАЧА № " + ifka);
            System.out.println("Введите 4 числа: \n");
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            if (a == b && b == c && c == d) {
                System.out.println("Равны \n");
            }
            else {
                System.out.println("Не равны \n");
            }
        }
        else if (ifka == 3) {
            System.out.println("ЗАДАЧА № " + ifka);
            int[] Massive = {34, 666, 345, 236, 3634, 2};
            int max = Massive[0];
            for (int i : Massive) {
                if (i > max)
                    max = i;
            }
            System.out.println("Max 4islo = " + max);
        }
        else if (ifka == 4) {
            System.out.println("ЗАДАЧА № " + ifka);
            int[] Massive = {34, 666, 345, 236, 3634, 2};
            int min = Massive[0];
            for (int i : Massive) {
                if (i < min)
                    min = i;
            }
            System.out.println("Min 4islo = " + min);
        }
        else if (ifka == 5) {
            System.out.println("ЗАДАЧА № " + ifka);
            int[] Massive = {34, 666, 345, 236, 3634, 2};
            double sum = 0;
            for (int x : Massive) {
                sum += x;
            }
            sum = sum / Massive.length;
            System.out.println("Ср. арифм: " + sum );
            for (int i = 0; i < 6; i++) {
                System.out.println(Massive[i]);
                if (Massive[i]>sum) {
                    System.out.println("числа, которые больше среднего значения: " + Massive[i]);
                }
            }

        }
        else if (ifka == 6) {
            System.out.println("ЗАДАЧА № " + ifka);
            System.out.println("Введите 2 числа (a*b) \n");
            int a = in.nextInt();
            int b = in.nextInt();
            int d = a;
            for (int i = 1;  i < b; i++) {
                a = a + d;
                System.out.println(a);
            }
            }
        else if (ifka == 7) {
            System.out.println("ЗАДАЧА № " + ifka);
            System.out.println("Coming soon... \n");
            }
        else if (ifka == 9) {
            System.out.println("ЗАДАЧА № " + ifka);
            System.out.println("Введите рост (В метрах!!) \n");
            double rost = in.nextDouble();
            System.out.println("Введите вес \n");
            double ves = in.nextDouble();
            double IMT = ves/Math.pow(rost, 2);
            System.out.println(IMT);
        }
        else if (ifka == 8) {
            System.out.println("Введите Фаренгейты");
            int a = in.nextInt();
            double C = (a-32)/1.8;
            System.out.println(C);

        }
        else if (ifka == 10) {
            System.out.println("ЗАДАЧА № " + ifka);
            System.out.println("Введите число ");
            double a = in.nextDouble();
            double b;
            double c;
            double d;
           b = a*a;
           c = a*a*a;
           d = a*a*a*a;
            System.out.println(b + "\n" + c + "\n" + d + "\n");
            }
        else if (ifka == 11 ) {
            System.out.println("ЗАДАЧА № " + ifka);
            System.out.println("Введите 1 сторону");
           int a = in.nextInt();
            System.out.println("Введите 2 сторону");
           int b = in.nextInt();
            System.out.println("Введите 3    сторону");
           int c = in.nextInt();
           if (((a + b) > c) && ((a + c) > b) && ((b + c) > a))
           { System.out.println("три заданные длины сторон могут образовать треугольник"); }
           else { System.out.println("три заданные длины сторон не могут образовать треугольник"); }
        }
        }
    }
