package com.xiaomi.hm.health.bt.profile.sport;

/* JADX INFO: loaded from: classes18.dex */
public class SportTemperature {
    public static final int C = 0;
    public static final int F = 1;
    public static final int HIGH = 1;
    public static final int LOW = 2;
    public static final int UNKNOWN = 0;
    private int a;
    private int b;
    private int c;

    public SportTemperature(int type, int unit, int value) {
        this.a = 0;
        this.b = 0;
        this.c = 0;
        this.a = type;
        this.b = unit;
        this.c = value;
    }

    public byte[] getBytes() {
        return new byte[]{(byte) this.a, (byte) this.b, (byte) this.c};
    }

    public String toString() {
        return "SportTemperature{type=" + this.a + ", unit=" + this.b + ", value=" + this.c + '}';
    }
}
