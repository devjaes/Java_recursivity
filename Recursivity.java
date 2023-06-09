import java.util.ArrayList;

public class Recursivity {
    public static Long factorial(int n) {
        if (n == 0 || n == 1) {
            return Long.valueOf(1);
        } else if (n < 0) {
            return Long.valueOf(-1);
        } else {
            return n * factorial(n - 1);
        }

    }

    public static Long fibonnacci(Long n) {
        if (n == 0 || n == 1) {
            return Long.valueOf(1);
        } else if (n < 0) {
            return Long.valueOf(-1);
        } else {
            return fibonnacci(n - 2) + fibonnacci(n - 1);
        }
    }

    public static int sum(int n) {
        if (n < 0) {
            return -1;
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return n + sum(n - 1);
        }
    }

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

    private static int sumPairN(int n) {
        if (n == 2) {
            return 2;
        } else {
            return n + sumPairNumbers(n - 2);
        }
    }

    public static int sumPairNumbers(int n) {
        if (n < 0 || n % 2 != 0 || n == 0) {
            return -1;
        } else {
            return sumPairN(n);
        }
    }

    private static int doMcd(int m, int n) {
        if (n == 0) {
            return m;
        } else {
            return doMcd(n, m % n);
        }
    }

    public static int MCD(int m, int n) {
        if (m < 0 || n < 0) {
            return -1;
        } else if (m < n) {
            return doMcd(n, m);
        } else {
            return doMcd(m, n);
        }
    }

    private static int doToDec(int n, int pow) {
        if (n / 10 <= 0)
            return 0;
        if ((n % 10) == 0) {
            return 0 + doToDec(n / 10, pow + 1);
        } else {
            return (int) Math.pow(2, pow) + doToDec(n / 10, pow + 1);
        }
    }

    public static int toDec(int n) {

        if (n == 0 || n == 1)
            return n;

        int dec = 0;

        if ((n % 10) == 1) {
            dec = 1;
            return dec + doToDec(n, 0);

        } else {
            return dec + doToDec(n, 0);
        }
    }

}