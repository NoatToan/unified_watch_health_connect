package com.huawei.hms.findnetwork.comm.request.bean;

/* JADX INFO: loaded from: classes33.dex */
public class UltrasoundSettings {
    private int mTagStatus = 0;
    private long mUltrasoundTxTime = -1;
    private float mTemperature = -100.0f;
    private float mTimeBias = 0.0f;
    private long mStartUltrasoundMeasuringTime = -1;
    private int mAlpha = 2;

    public String toString() {
        return "UltrasoundSettings{mTagStatus=" + this.mTagStatus + ", mUltrasoundTxTime=" + this.mUltrasoundTxTime + ", mTemperature=" + this.mTemperature + ", mTimeBias=" + this.mTimeBias + ", mStartUltrasoundMeasuringTime=" + this.mStartUltrasoundMeasuringTime + ", mAlpha=" + this.mAlpha + '}';
    }

    public void setUltrasoundTxTime(long j) {
        this.mUltrasoundTxTime = j;
    }

    public void setTimeBias(float f) {
        this.mTimeBias = f;
    }

    public void setTemperature(float f) {
        this.mTemperature = f;
    }

    public void setTagStatus(int i) {
        this.mTagStatus = i;
    }

    public void setStartUltrasoundMeasuringTime(long j) {
        this.mStartUltrasoundMeasuringTime = j;
    }

    public void setAlpha(int i) {
        this.mAlpha = i;
    }

    public long getUltrasoundTxTime() {
        return this.mUltrasoundTxTime;
    }

    public float getTimeBias() {
        return this.mTimeBias;
    }

    public float getTemperature() {
        return this.mTemperature;
    }

    public int getTagStatus() {
        return this.mTagStatus;
    }

    public long getStartUltrasoundMeasuringTime() {
        return this.mStartUltrasoundMeasuringTime;
    }

    public int getAlpha() {
        return this.mAlpha;
    }
}
