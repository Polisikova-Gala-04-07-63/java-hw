
/*Дан массив целых чисел. Реализовать метод, который
 возвращает минимальное значение в данном массиве.
 Например: {1,3,6,-1,4,-5,9} -> -5
 */



public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 6, -5, 4, -1, 9};

        System.out.println(minNumber(array));
    }


    public static int minNumber(int[] arr) {

        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i] < min){
               min = arr[i];
            }
        }


        return min;
    }
}