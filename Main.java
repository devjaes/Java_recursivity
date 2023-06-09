import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(Recursivity.factorial(4));
        System.out.println(Recursivity.factorial(30));
        System.out.println(Recursivity.factorial(300));

        System.out.println(Recursivity.fibonnacci(Long.valueOf(5)));
        System.out.println(Recursivity.fibonnacci(Long.valueOf(11)));

        System.out.println(Recursivity.sum(4));

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(1);
        numbers.add(4);

        System.out.println(Recursivity.orderNumbers(numbers));

        System.out.println(Recursivity.sumPairNumbers(6));

        System.out.println(Recursivity.MCD(2, 5));

        System.out.println(Recursivity.toDec(101));

        System.out.println(Recursivity.intToBin(5000000));
        System.out.println(Recursivity.intToBinInt(524000));

        int[] num = { 1, 2, 3, 4 };

        System.out.println(Recursivity.arraySum(num));

        System.out.println(Arrays.stream(num).boxed().toList());

        System.out.println(Arrays.stream(Recursivity.invertArray(num.clone())).boxed().toList());

        System.out.println(Recursivity.isPalindrome("A man, a plan, a canal – Panama"));

        Recursivity.printDescNumber(4);
    }

}
