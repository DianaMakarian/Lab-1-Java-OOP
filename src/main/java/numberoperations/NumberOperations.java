package numberoperations;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class NumberOperations {

    public static void main(String[] arg) {
        ArrayList<Float> nums = new ArrayList<>();
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

        System.out.println("ArrayList: "+ nums);
        System.out.println("the sum of");
    }

    public static float arrSum(ArrayList<Float> nums) {
        float Sum = 0;
        for (float el : nums) {
            Sum += el;
        }
        return Sum;
    }
}
