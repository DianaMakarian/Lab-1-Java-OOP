package numberoperations;

import java.util.ArrayList;

public class NumberOperations {

    public static void main(String[] arg) {
        //треба попробувати перетворити в рядок, і потім конвертувати постійно
        ArrayList<Float> nums = new ArrayList<>();

        nums.add(10f, 20.5f, 30f, 40.7f, 50f, 60.3f, 70f, 80.1f, 90f, 100.9f);

        nums.add(10f);
        nums.add(20.5f);
        nums.add(30f);
        nums.add(40.7f);
        nums.add(50f);
        nums.add(60.3f);
        nums.add(70f);
        nums.add(80.1f);
        nums.add(90f);
        nums.add(100.9f);

        System.out.println("1. Всі числа: "+ nums);
        System.out.println("2. Сума всіх чисел: " + arrSum(nums));
//        System.out.println("3. Добуток перших п'яти елементів списка: " + productFifeArr(nums));
        System.out.println("4. Середнє значення списка: "+ arrAvarage(nums));
        System.out.println("5. Максимальне значення списка: "+ arrMax(nums));
        System.out.println("6. ");
    }

    public static float arrSum(ArrayList<Float> arr) {
        float sum = 0;
        for (float el : arr) {
            sum += el;
        }
        return sum;
    }

//    public static float productFifeArr(ArrayList<Float> arr){
//        float product = 1;
//        for (int i = 0; i < 5; i++) {
//
//            product *= arr.get(i);
//            System.out.print((i+1) + " - "+ product+ " | ");
//        }
//        System.out.print( "\nres - " + product);
//        return product;
//    }

    public static float arrAvarage(ArrayList<Float> arr) {
        float sum = arrSum(arr);
        int arrSize = arr.size();
        return sum/arrSize;
    }

    public static float arrMax (ArrayList<Float> arr) {
        float max = arr.getFirst();
        float value;
        for (float el : arr) {
            value = el;
            if (value > max) {
                max = el;
            }
        }
        return max;
    }
}


//    public static void printArrTwoDig(@org.jetbrains.annotations.NotNull ArrayList<Float> arr) {
//        for (float el: arr) {
//            String res = String.format("%.2f", el);
//            System.out.print(res+ " ");
//        }
//
//    }
//}
