public class PyramidSortDemonstration {

    public static void start(){
        int[] testList = new int[]{4, 8, 10, 1, 23, 0, 5, 2};
        System.out.println("Входной массив: ");
        printList(testList);
        sort(testList);
        System.out.println("Массив после пирамидальной сортировки: ");
        printList(testList);

    }
    private static void sort(int[] list){
        int length = list.length;
        for(int i = length/2 - 1; i >= 0; i--){
            heap(list, length, i);
        }
        for(int i = length-1; i >= 0; i--){
            int temp = list[0];
            list[0] = list[i];
            list[i] = temp;
            heap(list, i, 0);
        }
    }
    private static void heap(int[]list, int size, int root){
        int max = root;
        int left = 2 * root + 1;
        int right = 2 * root + 2;
        if(left < size && list[left] > list[max]){
            max = left;
        }
        if(right < size && list[right] > list[max]){
            max = right;
        }
        if(max != root){
            int temp = list[root];
            list[root] = list[max];
            list[max] = temp;
            heap(list, size, max);
        }
    }
    private static void printList(int[]list){
        for(int i : list){
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
