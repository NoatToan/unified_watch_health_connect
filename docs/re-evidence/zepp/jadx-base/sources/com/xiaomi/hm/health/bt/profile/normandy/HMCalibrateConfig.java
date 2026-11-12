package com.xiaomi.hm.health.bt.profile.normandy;

/* JADX INFO: loaded from: classes18.dex */
public class HMCalibrateConfig {
    private Foot a;
    private boolean b = true;

    public enum Foot {
        LEFT,
        RIGHT
    }

    public HMCalibrateConfig(Foot foot) {
        this.a = Foot.LEFT;
        this.a = foot;
    }

    public byte[] getBytes() {
        byte[] bArr = new byte[2];
        bArr[0] = this.b ? (byte) 7 : (byte) 8;
        bArr[1] = this.a != Foot.LEFT ? (byte) 1 : (byte) 0;
        return bArr;
    }

    public Foot getFoot() {
        return this.a;
    }

    public boolean isStart() {
        return this.b;
    }

    public String toString() {
        return "HMCalibrateConfig{mFoot=" + this.a + ", mIsStart=" + this.b + '}';
    }
}
