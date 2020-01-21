import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ScrambliesShould {
    @Test
    public void rearrange_when_there_are_letters() {
        assertThat(Scramblies.scramble("holle", "hello")).isTrue();
    }

    @Test
    public void not_rearrange_when_there_not_enough_letters() {
        assertThat(Scramblies.scramble("hol", "hello")).isFalse();
    }

    @Test
    public void not_rearrange_when_there_are_not_needed_letters() {
        assertThat(Scramblies.scramble("holua", "hello")).isFalse();
    }

    private static class Scramblies {
        public static boolean scramble(String pieces, String goal) {
            if (areNotEnoughPieces(pieces, goal)) return false;
            return true;
        }

        private static boolean areNotEnoughPieces(String pieces, String goal) {
            return pieces.length() < goal.length();
        }
    }
}
