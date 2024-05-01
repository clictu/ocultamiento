import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class TodaysDateTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    void printDateAndTime() {
        TodaysDate todaysDate = new TodaysDate();

        todaysDate.printDateAndTime();

        String output = outContent.toString().trim();
        assertNotNull(output);
        assertTrue(output.contains("Time:"));
        assertTrue(output.contains("Date:"));
    }
}
