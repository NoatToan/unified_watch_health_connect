package com.beaglebuddy.id3.pojo.v24;

/* JADX INFO: loaded from: classes2.dex */
public class Level {
    private short a;
    private short b;

    public Level() {
        this((short) 0, 0.0d);
    }

    public short getFrequency() {
        return (short) (this.a / 2);
    }

    public double getVolume() {
        return this.b / 512;
    }

    public void setFrequency(short s) {
        if (s >= 0 && s <= Short.MAX_VALUE) {
            this.a = (short) (s * 2);
            return;
        }
        throw new IllegalArgumentException("Invalid frequency, " + ((int) s) + ".  It must be 0 hz <= frequency <= 32767 hz.");
    }

    public void setVolume(double d) {
        if (d >= -64.0d && d <= 64.0d) {
            this.b = (short) Math.round(d * 512.0d);
            return;
        }
        throw new IllegalArgumentException("Invalid volume " + d + ".  It must be in the range of ±64 db.");
    }

    public String toString() {
        return (this.a / 2) + " hz: " + (this.b / 512) + " db";
    }

    public Level(short s, double d) {
        setFrequency(s);
        setVolume(d);
    }
}
