package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private final Random random = new Random();
    private static final int MAX_NUMBER = 101;

    public Color getRandomColor() {
        Color[] colors = Color.values();
        int index = random.nextInt(colors.length);
        return colors[index];
    }

    public int getRandomInt() {
        return random.nextInt(MAX_NUMBER);
    }
}
