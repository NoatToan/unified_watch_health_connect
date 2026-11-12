package com.xiaomi.hm.health.bt.model;

/* JADX INFO: loaded from: classes19.dex */
public class HMHrReminder {
    private boolean a;
    private int b = 150;

    public HMHrReminder(boolean enable) {
        this.a = false;
        this.a = enable;
    }

    public int getHr() {
        return this.b;
    }

    public boolean isEnable() {
        return this.a;
    }

    public void setEnable(boolean enable) {
        this.a = enable;
    }

    public void setHr(int hr) {
        this.b = hr;
    }

    public byte[] toBytes() {
        return new byte[]{isEnable() ? (byte) 1 : (byte) 0, (byte) getHr()};
    }

    public String toString() {
        return "HMHrReminder{mEnable=" + this.a + ", mHr=" + this.b + '}';
    }
}
