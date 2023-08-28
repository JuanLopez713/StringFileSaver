import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileUtilities {

    public static void main(String[] args) throws IOException {
        File file = new File("demo.txt");
        String x = FileUtilities.readFile(file);
        System.out.println(x);

        String y = "Goodbye Moon";
        // FileUtilities.writeFile(y, "\\StringFileSaver");
    }

    public static String readFile(File fileName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        StringBuilder string = new StringBuilder();
        while (reader.ready()) {
            string.append((char) reader.read());
        }
        reader.close();
        return string.toString();
    }

    public static void writeFile(String str, String path) throws FileNotFoundException {
        // creates a file from file path parameter
        File file = new File(path);
        PrintWriter pw = new PrintWriter(file);
        pw.write(str);
        pw.close();

    }
}