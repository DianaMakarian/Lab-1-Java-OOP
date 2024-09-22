package numberoperations;

import java.util.ArrayList;

public class NumberOperations {
    public static void main(String[] arg) {
        // Завдання 3 Створила новий об'єкт, який буде списком, Тип списку Number ГОТОВО
        ArrayList<Number> arr = new ArrayList<>();

        // Завдання 1 Створити числа різних типів ГОТОВО
        int a = 10, c = 30, e = 50, g = 70, i = 90;
        float b = 20.5f, d = 40.7f, f = 60.3f, h = 80.1f, j = 100.9f;

        // Завдання 2 Долучити їх до списку ГОТОВО
        arr.add(a);
        arr.add(b);
        arr.add(c);
        arr.add(d);
        arr.add(e);
        arr.add(f);
        arr.add(g);
        arr.add(h);
        arr.add(i);
        arr.add(j);

        // Завдання 4 Вивести числа на екран ГОТОВО
        System.out.println("4. Всі числа: " + arr);

        //Завдання 5 Вивести числа у форматі цілих чисел
        System.out.print("5. Вивід : ");
        for (Number num: arr) {
            System.out.print(num.intValue() + " ");
        }
        System.out.print("\n");

        //Завдання 6 Виведіть числа у форматі дробних чисел з 2ма знаками після коми (точки).
        System.out.print("6. Вивід : ");
        for (Number num: arr) {
            String res = String.format("%.2f", num.floatValue());
            System.out.print(res + " ");
        }
        System.out.print("\n");

//      Завдання 7 Придумайте та реалізуйте рішення, щоб зберігати числа в різних списках в залежності від їх типу.
        ArrayList<Integer> intArr = new ArrayList<>();
        ArrayList<Float> floatArr = new ArrayList<>();

        for (Number num: arr) {
            if (num instanceof Integer){
                intArr.add(num.intValue());
            }
            else if (num instanceof Float) {
                floatArr.add(num.floatValue());
            }
        }

        // ну і вивела
        System.out.println("7. Вивід :");
        System.out.println("\tСписок цілих чисел :" + intArr);
        System.out.println("\tСписок дробних чисел :" + floatArr);

        // Викоання задвання варіанта 10
        System.out.print("Варіант 10. Виконання формули: " + formule(arr));
    }

    //метод
    public static ArrayList<Float> formule(ArrayList<Number> arr) {
        ArrayList<Float> resArr = new ArrayList<>();
        for (Number num: arr) {
            Float res = (num.floatValue() + 10) / 2 ;
            resArr.add(res);
        }
        return resArr;
    }
}
