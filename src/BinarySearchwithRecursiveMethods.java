public class BinarySearchwithRecursiveMethods {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        int numberToFind = 10;
        int result = binarySearch(arr, numberToFind);
        if (result == -1)
            System.out.println("not Found number");
        else
            System.out.println("Number " + result + ". found in position.");
    }
            public static int binarySearch(int[] arr, int number) {
                return binarySearchRecursive(arr, number, 0, arr.length - 1);
            }

            private static int binarySearchRecursive(int[] arr, int number, int left, int right) {
                if (left <= right) {
                    int mid = left + (right - left) / 2;

                    if (arr[mid] == number)
                        return mid;

                    if (arr[mid] < number)
                        return binarySearchRecursive(arr, number, mid + 1, right);

                    return binarySearchRecursive(arr, number, left, mid - 1);
                }

                return -1;
            }


    }

