import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    void challenge1_whileCountdownThenLaunch() {
        String out = runMain().toLowerCase(Locale.ROOT);
        assertTrue(out.contains("5") && out.contains("1") && out.contains("launch"),
            "Challenge 1: while countdown 5..1 then print Launch.");
    }

    @Test
    void challenge2_forPracticeLaps() {
        String out = runMain().toLowerCase(Locale.ROOT);
        assertTrue(out.contains("practice lap 1") && out.contains("practice lap 4"),
            "Challenge 2: print Practice lap 1 through Practice lap 4.");
    }

    @Test
    void challenge3_sumWithLoop() {
        assertTrue(runMain().contains("10"),
            "Challenge 3: sum 1..4 and print 10.");
    }

    @Test
    void challenge4_loopWithEvenOdd() {
        String out = runMain().toLowerCase(Locale.ROOT);
        assertTrue(out.contains("even") && out.contains("odd"),
            "Challenge 4: print even:/odd: lines for i = 0..5.");
    }

    private static String runMain() {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        try {
            System.setOut(new PrintStream(outputStream));
            Main.main(new String[] {});
            return outputStream.toString();
        } finally {
            System.setOut(originalOut);
        }
    }
}
