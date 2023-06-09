import java.util.ArrayList;

public class Recursivity {
    // Exercise 0
    public static Long factorial(int n) {
        if (n == 0 || n == 1) {
            return Long.valueOf(1);
        } else if (n < 0) {
            return Long.valueOf(-1);
        } else {
            return n * factorial(n - 1);
        }

    }

    // Exercise 1
    public static Long fibonnacci(Long n) {
        if (n == 0 || n == 1) {
            return Long.valueOf(1);
        } else if (n < 0) {
            return Long.valueOf(-1);
        } else {
            return fibonnacci(n - 2) + fibonnacci(n - 1);
        }
    }

    // Exercise 3
    public static ArrayList<Integer> orderNumbers(ArrayList<Integer> numbers) {
        if (numbers.size() == 0 || numbers.size() <= 0)
            return null;

        if (numbers.size() == 1) {
            return numbers;
        } else {
            int min = numbers.get(0);
            int index = 0;
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) < min) {
                    min = numbers.get(i);
                    index = i;
                }
            }
            numbers.remove(index);
            ArrayList<Integer> newNumbers = orderNumbers(numbers);
            newNumbers.add(0, min);
            return newNumbers;
        }
    }

    // Exercise 4
    public static int sum(int n) {
        if (n < 0)
            return -1;

        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        return n + sum(n - 1);

    }

    // Exercise 5
    private static int sumPairN(int n) {
        if (n == 2)
            return 2;

        return n + sumPairNumbers(n - 2);
    }

    public static int sumPairNumbers(int n) {
        if (n < 0 || n % 2 != 0 || n == 0)
            return -1;

        return sumPairN(n);
    }

    // Exercise 6
    private static int doMcd(int m, int n) {
        if (n == 0)
            return m;

        return doMcd(n, m % n);
    }

    public static int MCD(int m, int n) {
        if (m < 0 || n < 0)
            return -1;

        if (m < n)
            return doMcd(n, m);

        return doMcd(m, n);
    }

    // Exercise 7
    private static String doIntToBin(int n) {
        if (n / 2 == 1)
            return "1" + String.valueOf(n % 2);

        return doIntToBin(n / 2) + String.valueOf(n % 2);
    }

    public static String intToBin(int n) {
        if (n < 0)
            return "Negative Number";

        if (n == 0 || n == 1)
            return String.valueOf(n);

        return doIntToBin(n);
    }

    private static Long doIntToBinLong(Long n, Long count) {
        if (n / 2 == 1)
            return Long.valueOf((Long.valueOf(n % 2) * count) + (1 * count * 10));

        return Long.valueOf((Long.valueOf(n % 2) * count) + doIntToBinLong(Long.valueOf(n / 2), count * 10));
    }

    public static Long intToBinInt(int n) {
        if (n < 0)
            return Long.valueOf(-1);

        if (n == 0 || n == 1)
            return Long.valueOf(n);

        return doIntToBinLong(Long.valueOf(n), Long.valueOf(1));
    }

    // Exercise 8
    private static int doToDec(int n, int pow) {
        if (n == 1)
            return (int) Math.pow(2, pow);
        if ((n % 10) == 0) {
            return doToDec(n / 10, pow + 1);
        } else {
            return (int) Math.pow(2, pow) + doToDec(n / 10, pow + 1);
        }
    }

    public static int toDec(int n) {
        if (n < 0)
            return -1;

        if (n == 0 || n == 1)
            return n;

        return doToDec(n, 0);
    }

    // Exercise 9
    private static int doArraySum(int[] numbers, int index) {
        if (index == numbers.length - 1)
            return numbers[numbers.length - 1];

        return numbers[index] + doArraySum(numbers, index + 1);
    }

    public static int arraySum(int[] numbers) {
        if (numbers == null)
            return -1;

        if (numbers.length == 0)
            return 0;

        return doArraySum(numbers, 0);
    }

    // Exercise 10
    private static int[] doInvertArray(int[] numbers, int index, int aux) {
        if (index == (numbers.length / 2)) {
            numbers[index] = numbers[numbers.length - index - 1];
            numbers[numbers.length - index - 1] = aux;
            return numbers;
        }

        numbers[index] = numbers[numbers.length - 1 - index];
        numbers[numbers.length - 1 - index] = aux;

        return doInvertArray(numbers, index + 1, numbers[index + 1]);
    }

    public static int[] invertArray(int[] numbers) {
        if (numbers == null)
            return null;

        if (numbers.length == 1)
            return numbers;

        return doInvertArray(numbers, 0, numbers[0]);
    }

    // Exercise 11 / result = x > 100? x-10 : 91
    /*
     * Cuál es el resultado de esta función para distintos valores de X?
     * Static int f(int x)
     * {
     * if (x >100)
     * {
     * return (x-10);
     * }
     * else
     * {
     * return(f(f(x+11)));
     * }
     * }
     * 
     * / result = x > 100? x-10 : 91
     * al restarse 10 y sumarse 11 es como si sumara 1, hasta llegar a 101 que
     * cumple la condicion y retorna 91
     */

    // Exercise 12
    private static boolean doIsPalindrome(String text, int index) {
        if (index == (text.length() / 2)) {
            return text.charAt(index) == text.charAt(text.length() - 1 - index);
        }

        return text.charAt(index) == text.charAt(text.length() - 1 - index) && doIsPalindrome(text, index + 1);
    }

    public static boolean isPalindrome(String text) {
        if (text == null)
            return false;

        text = text.trim().replaceAll("[^a-zA-Z0-9]", "").toUpperCase();

        if (text.length() == 0 || text.length() == 1)
            return true;

        return doIsPalindrome(text, 0);
    }

    // Exercise 13
    /*
     * Diseñe e implemente un algoritmo que imprima todas las posibles
     * descomposiciones de
     * un número natural como suma de números menores que él.
     * 1= 1
     * 2 = 1+1
     * 3= 2 + 1
     * 3= 1+1+1
     * 4= 3+1
     * 4= 2+1+1
     * 4 = 1+1+1+1
     * 4=2+2
     * 4=2+1+1
     * 4=1+1+1+1
     * N = (n-1) +1
     * N = (n-2) + 2 = (n-2) + 1 + 1
     */
    private static void doPrintDescNumber(int n) {
        if (n == 1) {
            System.out.println("1");
            return;
        }

        if (n == 2) {
            System.out.println("1+1");
            return;
        }

        System.out.println(n + " = " + (n - 1) + " + 1");
        doPrintDescNumber(n - 1);

    }

    public static void printDescNumber(int n) {
        if (n < 0)
            return;

        doPrintDescNumber(n);
    }
}