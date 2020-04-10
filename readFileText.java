package readFileText;

import java.io.*;
import java.util.Scanner;

public class readFileText {
    public static void readFile(String path) throws IOException {
        File file = new File(path);
        if (!file.exists()) {
            file.createNewFile();
        }
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        int sum = 0;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.print(line);
            sum += Integer.parseInt(line);
            System.out.println();
        }
        System.out.print("\nSUM = " + sum);
        bufferedReader.close();
    }

    public static void main(String[] args) throws IOException {
        System.out.print("nhap duong dan can doc:  ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();
        try {
            readFile(path);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
