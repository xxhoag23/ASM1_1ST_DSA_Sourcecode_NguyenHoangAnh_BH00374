public class SelectionSortALU {
    public static void selectionSort(int[] arr){
        int count = arr.length;
        for (int i = 0; i <count; i++){
            // thuat toan nay - mau chot la can tim đc min hoac max
            int minIdx = i;
            for (int j = i+1; j<count; j++){
                if(arr[j]<arr[minIdx]){
                    minIdx =j;
                    // tim dc vi tri cua phan tu nho nhat(tim dc phan tu nho nhat)
                }

            }
            // hoan doi vi tri giua cac cap so
            // dua thằng nhỏ nhất về đầu
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printResult(int[] arr){
        System.out.println("Mang sau khi dc sap xep với thuật toán Selection Sort");
        for (int i : arr){
            System.out.println(i);
        }
    }

}
