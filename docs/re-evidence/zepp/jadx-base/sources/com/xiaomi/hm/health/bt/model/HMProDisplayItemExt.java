package com.xiaomi.hm.health.bt.model;

/* JADX INFO: loaded from: classes19.dex */
public class HMProDisplayItemExt {
    public static final short BATTERY = 32;
    public static final short CALORIE = 8;
    public static final short HR = 16;
    public static final short MILE = 4;
    public static final short STEP = 2;
    public static final short TIME = 1;
    private short a;
    private byte b;
    private byte c;
    private byte d;
    private byte e;
    private byte f;
    private byte g;

    public HMProDisplayItemExt() {
        this.a = (short) 63;
        this.b = (byte) 0;
        this.c = (byte) 1;
        this.d = (byte) 2;
        this.e = (byte) 3;
        this.f = (byte) 4;
        this.g = (byte) 5;
    }

    public byte[] getValue() {
        short s = this.a;
        return new byte[]{(byte) (s & 255), (byte) ((s >> 8) & 255), this.b, this.c, this.d, this.e, this.f, this.g};
    }

    public HMProDisplayItemExt(HMProDisplayItem item) {
        this.a = (short) 63;
        this.b = (byte) 0;
        this.c = (byte) 1;
        this.d = (byte) 2;
        this.e = (byte) 3;
        this.f = (byte) 4;
        this.g = (byte) 5;
        this.a = (short) ((item.getValue() << 1) | 1);
    }
}
