public class Homework {
    public static void main(String[] args){
        //Part one
        printNTimes(5);


        //Part two
        System.out.println(recursiveSumMultiplesOf7(10, 30));


        //Part three
        int[] sortedArray = {5, 10, 15, 20, 25, 30, 35, 40};
        int target1 = 25;
        int target2 = 12;

        int index1 = binarySearch(sortedArray, 0, sortedArray.length - 1, target1);
        if (index1 != -1) {
            System.out.println("Target " + target1 + " found at index: " + index1);
        } else {
            System.out.println("Target " + target1 + " not found.");
        }

        int index2 = binarySearch(sortedArray, 0, sortedArray.length - 1, target2);
        if (index2 != -1) {
            System.out.println("Target " + target2 + " found at index: " + index2);
        } else {
            System.out.println("Target " + target2 + " not found.");
        }
    }


    public static void printNTimes(int n){
        for(int i = 1; i<=n; i++){
            System.out.println("Hello World");
        }
    }



    public static int recursiveSumMultiplesOf7(int n1, int n2) {

        if (n1 > n2) {
            return recursiveSumMultiplesOf7(n2, n1);
        }

        if (n1 > n2) {
            return 0;
        }

        if (n1 % 7 == 0) {
            return n1 + recursiveSumMultiplesOf7(n1 + 1, n2);
        } else {

            return recursiveSumMultiplesOf7(n1 + 1, n2);
        }
    }



    public static int binarySearch(int[] arr, int left, int right, int target) {

        if (left > right) {
            return -1;
        }

        int mid = left + (right - left) / 2;


        if (arr[mid] == target) {
            return mid;
        }

        else if (arr[mid] > target) {
            return binarySearch(arr, left, mid - 1, target);
        }

        else {
            return binarySearch(arr, mid + 1, right, target);
        }
    }
}
