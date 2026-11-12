package com.hm.sport.algorithm;

/* JADX INFO: loaded from: classes4.dex */
public class TimestampData {
    private long mMillisecond;
    private float mValue;

    public TimestampData() {
        this.mMillisecond = -1L;
        this.mValue = -1.0f;
    }

    public boolean equals(Object obj) {
        return obj != null && (obj instanceof TimestampData) && this.mMillisecond == ((TimestampData) obj).mMillisecond;
    }

    public int getIntValue() {
        return (int) this.mValue;
    }

    public long getTime() {
        return this.mMillisecond;
    }

    public float getValue() {
        return this.mValue;
    }

    public int hashCode() {
        return (int) this.mMillisecond;
    }

    public boolean isValid() {
        return this.mMillisecond > 0 && this.mValue >= 0.0f;
    }

    public void setValue(float f) {
        this.mValue = f;
    }

    public String toString() {
        return "mMillisecond:" + this.mMillisecond + ",mValue:" + this.mValue;
    }

    public TimestampData(long j, float f) {
        this.mMillisecond = -1L;
        this.mValue = -1.0f;
        this.mMillisecond = j;
        this.mValue = f;
    }

    public TimestampData(long j, int i) {
        this.mMillisecond = -1L;
        this.mValue = -1.0f;
        this.mMillisecond = j;
        this.mValue = i;
    }
}
