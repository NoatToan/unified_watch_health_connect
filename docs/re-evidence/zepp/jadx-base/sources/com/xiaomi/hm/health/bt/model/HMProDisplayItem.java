package com.xiaomi.hm.health.bt.model;

/* JADX INFO: loaded from: classes19.dex */
public class HMProDisplayItem {
    public static final byte ALL_MASK = 31;
    public static final byte DEFAULT = 9;
    private static final byte b = 1;
    private static final byte c = 2;
    private static final byte d = 4;
    private static final byte e = 8;
    private static final byte f = 16;
    private byte a;

    public HMProDisplayItem() {
        this.a = (byte) 31;
    }

    public void clear() {
        this.a = (byte) 0;
    }

    public byte getValue() {
        return this.a;
    }

    public boolean isShow(int idx) {
        return ((1 << idx) & this.a) != 0;
    }

    public boolean isShowBattery() {
        return (this.a & 16) != 0;
    }

    public boolean isShowCal() {
        return (this.a & 4) != 0;
    }

    public boolean isShowHr() {
        return (this.a & 8) != 0;
    }

    public boolean isShowMileage() {
        return (this.a & 2) != 0;
    }

    public boolean isShowStep() {
        return (this.a & 1) != 0;
    }

    public void show(int idx, boolean enable) {
        if (enable) {
            this.a = (byte) ((1 << idx) | this.a);
        } else {
            this.a = (byte) ((~(1 << idx)) & this.a);
        }
    }

    public void showCal(boolean enable) {
        if (enable) {
            this.a = (byte) (this.a | 4);
        } else {
            this.a = (byte) (this.a & (-5));
        }
    }

    public void showHr(boolean enable) {
        if (enable) {
            this.a = (byte) (this.a | 8);
        } else {
            this.a = (byte) (this.a & (-9));
        }
    }

    public void showMileage(boolean enable) {
        if (enable) {
            this.a = (byte) (this.a | 2);
        } else {
            this.a = (byte) (this.a & (-3));
        }
    }

    public void showStep(boolean enable) {
        if (enable) {
            this.a = (byte) (this.a | 1);
        } else {
            this.a = (byte) (this.a & (-2));
        }
    }

    public String toString() {
        return "show item:" + ((int) this.a);
    }

    public HMProDisplayItem(byte value) {
        this.a = (byte) 31;
        this.a = value;
    }
}
