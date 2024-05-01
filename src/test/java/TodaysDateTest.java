import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class TodaysDateTest {

    @Test
    public void testPrintDateAndTime() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        TodaysDate todaysDate = new TodaysDate();

        todaysDate.printDateAndTime();


