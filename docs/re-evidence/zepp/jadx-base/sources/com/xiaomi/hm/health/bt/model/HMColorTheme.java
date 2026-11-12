package com.xiaomi.hm.health.bt.model;

/* JADX INFO: loaded from: classes19.dex */
public class HMColorTheme {
    public static final byte FLAG_SLASH_NONE = 0;
    public static final byte FLAG_SLASH_NOW = 1;
    private int a;
    private byte b;

    public enum Color {
        BLUE(1542),
        ORANGE(393728),
        GREEN(263424),
        RED(393474);

        public int mValue;

        Color(int value) {
            this.mValue = 1542;
            this.mValue = value;
        }

        public int getValue() {
            return this.mValue;
        }
    }

    public HMColorTheme(Color color, boolean z) {
        this.a = color.getValue();
        this.b = z ? (byte) 1 : (byte) 0;
    }

    public byte getB() {
        return (byte) (this.a & 255);
    }

    public byte getG() {
        return (byte) ((this.a >> 8) & 255);
    }

    public byte getR() {
        return (byte) ((this.a >> 16) & 255);
    }

    public void setColor(Color color) {
        this.a = color.getValue();
    }

    public byte slash() {
        return this.b;
    }

    public String toString() {
        return "HMColorTheme{getR=" + ((int) getR()) + " getG=" + ((int) getG()) + " getB=" + ((int) getB()) + " slash=" + ((int) slash()) + '}';
    }

    public HMColorTheme(boolean z) {
        this.b = z ? (byte) 1 : (byte) 0;
    }

    public HMColorTheme(Color color) {
        this.a = color.getValue();
    }
}
