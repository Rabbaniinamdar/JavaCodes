class Sorting {

    ///////////////////////////////////////////////////////////////////////////////////////////////////

    // NORMAL BUBBLE SORT
    public static void bubbleSort(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////////////
    // OPTIMIZE BUBBLE SORT

    public static void opBubbleSort(int arr[], int n) {
        int swap = 0;
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    flag = true;
                    swap++;
                }
            }
            if (flag == false) {
                return;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Swaps: " + swap);
    }///////////////////////////////////////////////////////////////////////////////////////////////////
     // NORMAL BUBBLE SORT

    public static void selectionSort(int arr[], int n) {

        for (int i = 0; i < n; i++) {
            int smallestElement = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[smallestElement] < arr[j]) {
                    smallestElement = j;
                }
                    int temp = arr[smallestElement];
                    arr[smallestElement] = arr[j];
                    arr[j] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 4, 3, 2, 1 };
        int n = arr.length;
        // Sorting.opBubbleSort(arr, n);
        Sorting.selectionSort(arr, n);
    }
}