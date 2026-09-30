import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Locale;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MainTest {

    @Test
    @DisplayName("Challenge 1: while countdown then Launch")
    void challenge1_whileCountdownThenLaunch() {
        String out = runMain().toLowerCase(Locale.ROOT);
        assertTrue(out.contains("5") && out.contains("1") && out.contains("launch"),
            "challenge1 failed - while-loop countdown should print 5..1 and then Launch.");
    }

    @Test
    @DisplayName("Challenge 2: for practice laps")
    void challenge2_forPracticeLaps() {
        String out = runMain().toLowerCase(Locale.ROOT);
        assertTrue(out.contains("practice lap 1") && out.contains("practice lap 4"),
            "challenge2 failed - print Practice lap 1 through Practice lap 4 (for loop).");
    }

    @Test
    @DisplayName("Challenge 3: sum with a loop")
    void challenge3_sumWithLoop() {
        assertTrue(runMain().contains("10"),
            "challenge3 failed - sum 1..4 with a loop and print 10.");
    }

    @Test
    @DisplayName("Challenge 4: even/odd in a loop")
    void challenge4_loopWithEvenOdd() {
        String out = runMain().toLowerCase(Locale.ROOT);
        assertTrue(out.contains("even") && out.contains("odd"),
            "challenge4 failed - loop i = 0..5 and print even:/odd: lines.");
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
