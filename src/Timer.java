public class Timer {
    private ClockHand hundSeconds;
    private ClockHand seconds;

    public Timer() {
        this.hundSeconds = new ClockHand(100);
        this.seconds = new ClockHand(60);
    }
    // In this constructor we can pass the instance variables as new ClockHand objects!
    // This is because we want our Timer class to use the ClockHand and methods within it.

    public void advance() {
        this.hundSeconds.advance();
        if (this.hundSeconds.value() == 0) {
            this.seconds.advance();
        }
    }

    public String toString() {
        return this.seconds + ":" + this.hundSeconds;
    }
}

