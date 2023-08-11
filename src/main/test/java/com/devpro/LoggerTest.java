import org.testng.annotations.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.testng.Assert.assertTrue;

public class LoggerTest {
    private static final String LOG_FILE = "test.log";

    @Test
    public void testLogMessageInfo() throws IOException {
        Logger.log_message(LOG_FILE, "User logged in", "INFO");
        String expected = "[INFO] User logged in";

        List<String> loggedMessages = getLoggedMessages(LOG_FILE);

        assertTrue(loggedMessages.contains(expected));
    }

    @Test
    public void testLogMessageWarning() throws IOException {
        Logger.log_message(LOG_FILE, "Failed login attempt", "WARNING");
        String expected = "[WARNING] Failed login attempt";

        List<String> loggedMessages = getLoggedMessages(LOG_FILE);

        assertTrue(loggedMessages.contains(expected));
    }

    private List<String> getLoggedMessages(String filename) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(filename));
        List<String> loggedMessages = new ArrayList<>();
        String line;

        while ((line = reader.readLine()) != null) {
            loggedMessages.add(line);
        }

        reader.close();
        return loggedMessages;
    }
}
