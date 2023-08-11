import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    public static void log_message(String filename, String message, String level) {
        try {
            FileWriter fileWriter = new FileWriter(filename, true);
            PrintWriter printWriter = new PrintWriter(fileWriter);

            SimpleDateFormat dateFormat = new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss]");
            String timestamp = dateFormat.format(new Date());

            printWriter.println(timestamp + " [" + level + "] " + message);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
