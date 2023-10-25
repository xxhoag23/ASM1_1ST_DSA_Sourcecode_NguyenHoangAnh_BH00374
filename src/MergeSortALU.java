public class MergeSortALU {
    private static void mergeSort(int [] arr, int l, int m, int r){
//        // l : left - m:middle -r : right
//        // cần tìm kích thước của 2 mảng ban đâầu được tách
//        int n1 = m - l+1;
//        int n2 = r-m;
//        // mảng con thứ nhất : arr[l...m]
//        // mảng con thứ 2: arr[m+1..r]
//        // tạo các mảng con bên trái và bên phải
//        int [] Left = new int [n1];
//        int [] Right = new int[n2];
//        // copy dữ liệu vào 2 mảng con trai-phai vừa tạo
//        for (int i = 0; i< n1; i++){
//            Left[i] = arr[l+i];
//        }
//        for (int j = 0; j<n2; j++){
//            Right[j] = arr[m+1+j];
//        }
//
//        int i=0, j=0;
//        int k =1;
//        while (i <n1 && j <n2){
//            if (Left[i] <=Right[j]){
//                arr[k] = Left[i];
//                i++;
//            }else {
//                arr[k] = Right[j];
//                j++;
//            }
//            k++;
//        }
//        while (i<n1){
//            arr[k] = Left[i];
//            i++;
//            k++;
//        }
//        while (j<n2){
//            arr[k] = Right[j];
//            j++;
//            k++;
//        }
        // Find sizes of two subarrays to be merged
        int n1 = m - l + 1;
        int n2 = r - m;

        // Create temp arrays
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Copy data to temp arrays
        for (int i = 0; i < n1; ++i)
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[m + 1 + j];

        // Merge the temp arrays

        // Initial indices of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of L[] if any
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Copy remaining elements of R[] if any
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    public static void sort(int[] arr, int l, int r){
        if(l<r){
            int m = l+(r-l)/2;
            // de quy lai
            MergeSortALU.sort(arr,l,m);
            MergeSortALU.sort(arr,m+1,r);

            //goi ham merge da viet
            MergeSortALU.mergeSort(arr,l,m,r);
        }
    }
    public static void printResult(int[] arr){
        System.out.println("Mang sau khi dc sap xep voi thuat toan Merge Sort");
        for (int i : arr){
            System.out.println(i);
        }

    }
}
