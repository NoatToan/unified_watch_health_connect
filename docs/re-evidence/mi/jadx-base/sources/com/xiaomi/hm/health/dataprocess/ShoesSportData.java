package com.xiaomi.hm.health.dataprocess;

/* JADX INFO: loaded from: classes11.dex */
public class ShoesSportData {
    private int frontSteps;
    private int mode;
    private int percent;
    private int time;
    private int totalSteps;

    public ShoesSportData() {
        this.time = 0;
        this.percent = 0;
        this.frontSteps = 0;
        this.totalSteps = 0;
        this.mode = -1;
    }

    public int getFrontSteps() {
        return this.frontSteps * 2;
    }

    public int getMode() {
        return this.mode;
    }

    public float getPercent() {
        return this.percent / 15.0f;
    }

    public int getTime() {
        return this.time * 10;
    }

    public int getTotalSteps() {
        return this.totalSteps * 2;
    }

    public void setFrontSteps(int i) {
        this.frontSteps = i;
    }

    public void setPercent(int i) {
        this.percent = i;
    }

    public void setTime(int i) {
        this.time = i;
    }

    public void setTotalSteps(int i) {
        this.totalSteps = i;
    }

    public byte[] toBytes() {
        return new byte[]{(byte) (((this.time & 15) << 4) | (this.percent & 15)), (byte) this.frontSteps, (byte) this.totalSteps};
    }

    public String toString() {
        return "{time:" + this.time + ",percent:" + this.percent + ",frontSteps:" + this.frontSteps + ",totalSteps:" + this.totalSteps + "}";
    }

    public ShoesSportData(int i, int i2, int i3, int i4) {
        this.mode = -1;
        this.time = i;
        this.percent = i2;
        this.frontSteps = i3;
        this.totalSteps = i4;
    }

    public ShoesSportData(byte b2, byte b3, byte b4) {
        this.mode = b2;
        this.time = (b2 >> 4) & 15;
        this.percent = b2 & 15;
        this.frontSteps = b3 & 255;
        this.totalSteps = b4 & 255;
    }
}
