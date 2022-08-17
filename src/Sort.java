public class Sort implements UserInput {
    public static void main(String[] args) throws Exception {
        System.out.println("Для демонстрации сортировки слиянием введите 1");
        System.out.println("Для демонстрации пирамидальной сортировки введите 2");
        int userNum = Integer.parseInt(reader.readLine());
        if(userNum == 1) {
            MergeSortDemonstration.start();
        }
        else if(userNum == 2){
            PyramidSortDemonstration.start();
        }
        else System.out.println("Введено некорректное значение");

    }




}
