package com.beaglebuddy.id3.pojo.v23;

/* JADX INFO: loaded from: classes2.dex */
public class Level {
    private Direction a;
    private short b;
    private int c;

    public enum Direction {
        DECREMENT,
        INCREMENT;

        public static Direction getDirection(int i) throws IllegalArgumentException {
            for (Direction direction : values()) {
                if (i == direction.ordinal()) {
                    return direction;
                }
            }
            throw new IllegalArgumentException("Invalid direction " + i + ".  It must be either 0 or 1.");
        }
    }

    public Level() {
        this(Direction.INCREMENT, 0, 1);
    }

    public int getAdjustment() {
        return this.c;
    }

    public Direction getDirection() {
        return this.a;
    }

    public short getFrequency() {
        return this.b;
    }

    public void setAdjustment(int i) {
        if (i > 0) {
            this.c = i;
            return;
        }
        throw new IllegalArgumentException("Invalid adjustment, " + i + ".  It must be > 0.");
    }

    public void setDirection(Direction direction) {
        this.a = direction;
    }

    public void setFrequency(int i) {
        if (i >= 0 && i < 32768) {
            this.b = (short) i;
            return;
        }
        throw new IllegalArgumentException("Invalid frequency, " + i + ".  It must be 0 hz <= frequency < 32768 hz.");
    }

    public String toString() {
        return ((int) this.b) + " hz: " + this.a + " " + this.c;
    }

    public Level(Direction direction, int i, int i2) {
        setDirection(direction);
        setFrequency(i);
        setAdjustment(i2);
    }
}
