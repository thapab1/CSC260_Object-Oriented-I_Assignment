public class MyIntegerTest {
    public static void main(String[] args) {
        MyInteger n1 = new MyInteger(5);
        System.out.println("n1 is even? " + n1.isEven());
        System.out.println("n1 is prime? " + n1.isPrime());
        System.out.println("15 is prime? " + MyInteger.isPrime(15));

        char[] chars = {'3', '5', '3', '9'};
        System.out.println(MyInteger.parseInt(chars));

        String s = "3539";
        System.out.println(MyInteger.parseInt(s));

        MyInteger n2 = new MyInteger(24);
        System.out.println("n2 is odd? " + n2.isOdd());
        System.out.println("45 is odd? " + MyInteger.isOdd(45));
        System.out.println("n1 is equal to n2? " + n1.equals(n2));
        System.out.println("n1 is equal to 5? " + n1.equals(5));
    }
}

class MyInteger {
    int value;

    MyInteger(int value) {
        this.value = value;
    }

    public int getValue() {
        return this.value;
    }

    public boolean isEven() {
        return isEven(this.value);
    }


    public boolean isOdd() {
       return isOdd(this.value);
    }

    public boolean isPrime() {
        return isPrime(this.value);
    }

    public static boolean isPrime(int num) {
        if ((num == 1) || (num == 2)) {
            return true;
        }

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
    public static boolean isEven(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isOdd(int num) {
        if (num % 2 != 0) {
            return true;
        } else {
            return false;
        }
    }


    public static boolean isEven(MyInteger a) {
        return isEven(a.value);
    }

    public static boolean isOdd(MyInteger a){
        return isOdd(a.value);
    }

    public static boolean isPrime(MyInteger a){
        return isPrime(a.value);
    }

    public boolean equals(int num){
        if (this.value == num){
            return true;
        }
        else {
            return false;
        }
    }
    public boolean equals(MyInteger a){
        return equals(a.value);
    }
    public static int parseInt(char[] c){
        int number = Integer.parseInt(new String(c));
        return number;

        }


    public static int parseInt(String s){
        int num = Integer.parseInt(s);
        return num;
    }
}

/** Output
 * n1 is even? false
 * n1 is prime? true
 * 15 is prime? false
 * 3539
 * 3539
 * n2 is odd? false
 * 45 is odd? true
 * n1 is equal to n2? false
 * n1 is equal to 5? true
 */










