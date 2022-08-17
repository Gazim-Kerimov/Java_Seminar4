public class MergeSortDemonstration {
    public static void start(){
        System.out.println("Входной массив: ");
        int[] testList = new int[]{10, 2, 5, 11, 1, 0, 9};
        for(int i : testList){
            System.out.print(i + ", ");
        }
        mergeSort(testList, testList.length);
        System.out.println();
        System.out.println("Массив после сортировки слиянием: ");
        for(int i : testList){
            System.out.print(i + ", ");
        }
    }
    public static void mergeSort(int[] list, int length){
        if (length < 2){
            return;
        }
        int middleIndex = length/2;
        int[] firstHalf = new int[middleIndex];
        int[] secondHalf = new int[length - middleIndex];
        for(int i = 0; i < middleIndex; i++){
            firstHalf[i] = list[i];
        }
        for(int i = middleIndex; i < length; i++){
            secondHalf[i - middleIndex] = list[i];
        }
        mergeSort(firstHalf, middleIndex);
        mergeSort(secondHalf, length - middleIndex);

        merge(list, firstHalf, secondHalf, middleIndex, length - middleIndex);
    }

    private static void merge(int[] list, int[] firstHalf, int[] secondHalf, int leftValue, int rightValue) {
        int i = 0, j = 0, k = 0;
        while (i < leftValue && j < rightValue){
            if(firstHalf[i] <= secondHalf[j]){
                list[k] = firstHalf[i];
                k++;
                i++;
            }
            else{
                list[k] = secondHalf[j];
                k++;
                j++;
            }
        }
        while(i < leftValue){
            list[k] = firstHalf[i];
            k++;
            i++;
        }
        while (j < rightValue){
            list[k] = secondHalf[j];
            k++;
            j++;
        }

    }
}
