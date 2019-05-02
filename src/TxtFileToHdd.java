import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TxtFileToHdd {

    private static File file;


    public static void txtFromMainToFile(String content) throws FileNotFoundException {

        file = new File("TextFileFromJava");

        PrintWriter printWriter = new PrintWriter(file);
        printWriter.print(content);
        printWriter.close();
    }
}
