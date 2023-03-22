import java.util.Arrays;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) {
        int[] array = { 2, 69, 32, 0, 17, 89, 42, 5, 9, 11 };
        System.out.println(Arrays.toString(array));
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
