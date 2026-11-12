package com.xiaomi.hm.health.bt.profile.normandy;

/* JADX INFO: loaded from: classes18.dex */
public class HMCalibrateResult {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;

    public HMCalibrateResult(int type, int result, int cmd, int offsetX, int offsetZ) {
        this.a = -1;
        this.b = -1;
        this.c = -1;
        this.d = -1;
        this.e = -1;
        this.a = type;
        this.b = result;
        this.c = cmd;
        this.d = offsetX;
        this.e = offsetZ;
    }

    public int getOffsetX() {
        return this.d;
    }

    public int getOffsetZ() {
        return this.e;
    }

    public int getResult() {
        return this.b;
    }

    public int getType() {
        return this.a;
    }

    public boolean isSuccess() {
        return this.b == 1;
    }

    public String toSimpleString() {
        return "{type=" + this.a + ", result=" + this.b + ", cmd=" + this.c + ", offsetX=" + this.d + ", offsetZ=" + this.e + '}';
    }

    public String toString() {
        return "HMCalibrateResult{mType=" + this.a + ", mResult=" + this.b + ", cmd=" + this.c + ", mOffsetX=" + this.d + ", mOffsetZ=" + this.e + '}';
    }
}
