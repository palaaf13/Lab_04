public class Task1 {
    public static void main(String[] args) {
        countDown(5);
        evenCountDown(10);
    }

    public static void countDown(int num) {

        if (num == 0) {

            System.out.println("Blastoff!");

        }else {

            System.out.println(num);

            countDown(num-1);

        }

    }
    public static void evenCountDown(int num) {

        if (num == 0) {

            System.out.println("Blastoff!");

        }else {

            if(num % 2 == 0) { //num % 2 checks that a number is even, which triggers the program to include said number.
                System.out.println(num);
            }

            evenCountDown(num-1);

        }

    }
}