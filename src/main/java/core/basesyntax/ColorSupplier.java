package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    public Color getRandomColor() {
        Random random = new Random();
        int index = random.nextInt(Color.values().length);
        Color color = Color.values()[index];
        return color;
    }

    public int getRandomInt() {
        Random random = new Random();
        int randomNumber = random.nextInt(101);
        return randomNumber;
    }
}
