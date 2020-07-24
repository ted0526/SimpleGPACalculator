import java.util.*;
import java.io.*;

public class GPA {
    public static void main(String args[]) throws FileNotFoundException, IOException {
        File fileIn = new File("GPA.in");
        Scanner scan = new Scanner(fileIn);
        ArrayList<Double> grades = new ArrayList<>();
        while (scan.hasNextInt()) {
            grades.add(scan.nextDouble());
            scan.nextLine();
        }
        scan.close();
        double average = 0;
        for (int i = 0; i < grades.size(); i++) {
            average = average + grades.get(i);
        }
        System.out.print("GPA: " + average / grades.size());
        File fileOut = new File("GPA.out");
        FileWriter writer = new FileWriter(fileOut);
        writer.write("GPA: " + average / grades.size());
        writer.close();
    }
}