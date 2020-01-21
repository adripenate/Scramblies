import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScrambliesShould {
    @Test
    public void not_rearrange_when_there_are_no_letter() {
        assertThat(Scramblies.scramble("", "hello")).isFalse();
    }

    private static class Scramblies {
        public static boolean scramble(String pieces, String goal) {
            return false;
        }
    }
}
