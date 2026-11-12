package com.hm.sport.algorithm;

/* JADX INFO: loaded from: classes4.dex */
public class AlignData {
    private int mAccuracy;
    private float mAltitude;
    private int mBar;
    private int mHr;
    private double mLatitude;
    private double mLongitude;
    private long mMillisecond;
    private int mStatus;
    private int mStep;

    public AlignData() {
        this.mMillisecond = -1L;
        this.mLatitude = 181.0d;
        this.mLongitude = 181.0d;
        this.mAltitude = -1.0f;
        this.mAccuracy = -1;
        this.mStep = -1;
        this.mHr = -1;
        this.mStatus = -1;
        this.mBar = -1;
    }

    public boolean equals(AlignData alignData) {
        return alignData != null && this.mMillisecond == alignData.getTime();
    }

    public int getAccuracy() {
        return this.mAccuracy;
    }

    public float getAltitude() {
        return this.mAltitude;
    }

    public int getBar() {
        return this.mBar;
    }

    public int getHr() {
        return this.mHr;
    }

    public double getLatitude() {
        return this.mLatitude;
    }

    public double getLongitude() {
        return this.mLongitude;
    }

    public int getStatus() {
        return this.mStatus;
    }

    public int getStep() {
        return this.mStep;
    }

    public long getTime() {
        return this.mMillisecond;
    }

    public int hashCode() {
        return (int) this.mMillisecond;
    }

    public boolean isValid() {
        return this.mMillisecond > 0;
    }

    public String toString() {
        return "mMillisecond:" + this.mMillisecond + ",mLatitude:" + this.mLatitude + ",mLongitude:" + this.mLongitude + ",mAltitude:" + this.mAltitude + ",mAccuracy:" + this.mAccuracy + ",mStep:" + this.mStep + ",mHr:" + this.mHr + ",mBar:" + this.mBar + ",mStatus:" + this.mStatus;
    }

    public AlignData(long j, double d, double d2, float f, int i, int i2, int i3) {
        this(j, d, d2, f, i, i2, i3, -1, -1);
    }

    public AlignData(long j, double d, double d2, float f, int i, int i2, int i3, int i4) {
        this(j, d, d2, f, i, i2, i3, -1, i4);
    }

    public AlignData(long j, double d, double d2, float f, int i, int i2, int i3, int i4, int i5) {
        this.mMillisecond = -1L;
        this.mLatitude = 181.0d;
        this.mLongitude = 181.0d;
        this.mAltitude = -1.0f;
        this.mAccuracy = -1;
        this.mStep = -1;
        this.mHr = -1;
        this.mStatus = -1;
        this.mBar = -1;
        this.mMillisecond = j;
        this.mLatitude = d;
        this.mLongitude = d2;
        this.mAltitude = f;
        this.mAccuracy = i;
        this.mStep = i2;
        this.mHr = i3;
        this.mStatus = i4;
        this.mBar = i5;
    }
}
