package com.xiaomi.mitv.airkan.sdk.impl;

/* JADX INFO: loaded from: classes22.dex */
final class j {
    private static int i = 4;
    private static int j = 85;
    private static int k = 16;
    private int f;
    private int g;
    private int h;
    private int a = 85;
    private int c = 10;
    private int d = 0;
    private int e = 16;
    private int b = 4;

    public j(int i2, int i3, int i4) {
        this.h = i2;
        this.g = i3;
        this.f = i4;
    }

    public final byte[] a() {
        int i2 = this.f;
        int i3 = this.g;
        int i4 = this.h;
        return new byte[]{(byte) this.a, (byte) ((this.b << 4) & 240), (byte) this.c, 0, 0, 0, 0, (byte) (this.e & 31), i2 >> 24, (byte) (i2 >> 16), (byte) (i2 >> 8), (byte) i2, (byte) (i3 >> 8), (byte) i3, (byte) (i4 >> 8), (byte) i4};
    }

    public final String toString() {
        return "UDTPacket{flag=" + this.a + ", version=" + this.b + ", command=" + this.c + ", param=0, headLen=" + this.e + ", dataLen=" + this.f + ", localId=" + this.g + ", remoteId=" + this.h + '}';
    }
}
