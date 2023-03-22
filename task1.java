import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами),
// результат после каждой итерации запишите в лог-файл.

/**
 * task1
 */
public class task1 {

    public static void main(String[] args) throws IOException{
        Logger ll = Logger.getLogger(task1.class.getName());
        String logsPath = "log.txt";
        FileHandler fh = new FileHandler(logsPath, false);
        ll.addHandler(fh);
        SimpleFormatter formatter = new SimpleFormatter();
        // XMLFormatter form = new XMLFormatter();
        fh.setFormatter(formatter);
    
        int[] array = { 2, 69, 32, 0, 17, 89, 42, 5, 9, 11 };
        ll.log(Level.INFO,Arrays.toString(array));
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
            ll.log(Level.INFO,Arrays.toString(array));
        }
    }
}
