package core.basesyntax;

public class Lottery {
    public Ball getRandomBall() {
        ColorSupplier colorSupplier = new ColorSupplier();
        Color color = colorSupplier.getRandomColor();
        int number = colorSupplier.getRandomInt();
        Ball ball = new Ball(color, number);
        return ball;
    }
}
