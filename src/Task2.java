public class Task2 {
    public static void main(String[] args){
        System.out.println("GCD: " + gcd(50, 6));
        System.out.println("GCD by subtraction: " + gcdBySubtraction(50, 6));
    }
    public static int gcd(int x, int y) {

        if (x % y == 0) //base case

            return y;

        else

            return gcd(y, x % y);

    }
    public static int gcdBySubtraction(int x, int y) {
        // Handle edge cases where one of the numbers is 0
        if (x == 0) {
            return y;
        }
        if (y == 0) {
            return x;
        }

        // Continue subtracting until both numbers are equal
        while (x != y) {
            if (x > y) {
                x = x - y;
            } else {
                y = y - x;
            }
        }
        // When a and b are equal, that value is the GCD
        return x;
    }
}
