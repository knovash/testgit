public class SortArray {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Array from Args of " + args.length +" elements:");
            printArray(args);   // Print String array
            System.out.println("Sorted array: CHANGE IN FILE ");
            printArray(sortIntArray(strArrayToIntArray(args)));
        }
        else{
            System.out.println("Default array.CHANGE IN FILE ");
            int[] array = {3, 7, 1, 9, 2};
            printArray(array);  // Print int array
            System.out.println("Sorted array:");
            printArray(sortIntArray(array));
        }
    }

// CHANGE FOR NEW BRANCH
    public static void printArray(int[] array) {
        for (int item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] array) {
        for (String item : array) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static int[] strArrayToIntArray(String[] strArray) {
        int[] intArray = new int[strArray.length];
        for (int i = 0; i < strArray.length; i++) {
            intArray[i] = Integer.parseInt(strArray[i]);
        }
        return intArray;
    }

    public static int[] sortIntArray(int[] array) {
        //System.out.println("Start sorting...");
        int max = 0;
        int maxIndex = 0;
        for (int j =  array.length-1; j  >= 1; j--) {
            for (int i = 0; i <= j; i++) {
                if (array[i] > max) {
                    max = array[i];
                    maxIndex = i;
                }
            //    System.out.print(array[i]  + "(" + max +") ");
            }
            //System.out.println();
            //System.out.println("maxval(" + max + ") index(" + maxIndex + ") vs val(" + array[j] + ") index(" + j +")");
            array[maxIndex] = array[j];
            array[j] = max;
            //System.out.println("Array after change:");
            //printArray(array);
            //System.out.println();
            max = 0;
        }
        return array;
    }
}
