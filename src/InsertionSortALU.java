public class InsertionSortALU {
    public static void insertionSort(int[] arrNumber){
        // so luong phan tu trong mang
        int count = arrNumber.length;
        for (int i = 1; i <count; i++){
            // cac phan tu dc duyet
            int key = arrNumber[i];
            // vì i =1 : bat dau tu phần tử sau phần tử đầu tiên
            // j : vị trí của các phần tử đứng trước các phần tử đang được duyệt
            int j = i-1;
            while (j>=0 && arrNumber[j] >key){
                // neu nhu phan dung dang truoc cac phan tu dang duoc duyet ma lon hơn thì thực hiện hoán đổi vị trí

                arrNumber[j+1] = arrNumber[j];
                j--;
            }
            arrNumber[j+1]= key;

        }

    }
    public static void  printResult(int[] arr){
        System.out.println("Mang sau khi duoc sap xep theo thuat toan Insertion Sort");
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
