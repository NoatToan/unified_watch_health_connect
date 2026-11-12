package com.huawei.hms.findnetwork.bean;

/* JADX INFO: loaded from: classes33.dex */
public class BtMeasureResult {
    private String extData;
    private int flag;
    private float percentage;
    private int rssi;
    private String sn;

    public String toString() {
        return "BtMeasureResult{rssi=" + this.rssi + ", flag=" + this.flag + ", percentage=" + this.percentage + '}';
    }

    public void setSn(String str) {
        this.sn = str;
    }

    public void setRssi(int i) {
        this.rssi = i;
    }

    public void setPercentage(float f) {
        this.percentage = f;
    }

    public void setFlag(int i) {
        this.flag = i;
    }

    public void setExtData(String str) {
        this.extData = str;
    }

    public String getSn() {
        return this.sn;
    }

    public int getRssi() {
        return this.rssi;
    }

    public float getPercentage() {
        return this.percentage;
    }

    public int getFlag() {
        return this.flag;
    }

    public String getExtData() {
        return this.extData;
    }
}
