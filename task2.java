import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода в консоль:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

public class task2 {
    public static void main(String[] args) {
        File file = new File("file.txt");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            
            String line = reader.readLine();
           
            while (line != null) {
                String[] arr = line.split(",");
                StringBuilder sB1 = new StringBuilder(arr[0]);
                sB1.delete(arr[0].length()-1, arr[0].length());
                sB1.replace(0,11,"Студент ");
                StringBuilder sB2 = new StringBuilder(arr[1]);
                sB2.delete(arr[1].length()-1, arr[1].length());
                sB2.replace(0,10," получил ");
                StringBuilder sB3 = new StringBuilder(arr[2]);
                sB3.delete(arr[2].length()-1, arr[2].length());
                sB3.replace(0,11," по предмету ");
                String sB = sB1.toString() + sB2.toString() + sB3.toString();
                System.out.println(sB);
                line = reader.readLine();
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
