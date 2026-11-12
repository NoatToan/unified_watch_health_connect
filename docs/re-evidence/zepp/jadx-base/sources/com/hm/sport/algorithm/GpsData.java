package com.hm.sport.algorithm;

/* JADX INFO: loaded from: classes4.dex */
public class GpsData {
    private int mAccuracy;
    private float mAltitude;
    private double mLatitude;
    private double mLongitude;
    private long mMillisecond;
    private int mStatus;

    public GpsData() {
        this.mMillisecond = -1L;
        this.mLatitude = 181.0d;
        this.mLongitude = 181.0d;
        this.mAltitude = 0.0f;
        this.mAccuracy = 0;
        this.mStatus = -1;
    }

    public int getAccuracy() {
        return this.mAccuracy;
    }

    public float getAltitude() {
        return this.mAltitude;
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

    public long getTime() {
        return this.mMillisecond;
    }

    public boolean isValid() {
        return this.mMillisecond > 0;
    }

    public void reset() {
        this.mMillisecond = -1L;
        this.mLatitude = 181.0d;
        this.mLongitude = 181.0d;
        this.mAltitude = 0.0f;
        this.mAccuracy = 0;
        this.mStatus = -1;
    }

    public String toString() {
        return "mMillisecond:" + this.mMillisecond + ",mLatitude:" + this.mLatitude + ",mLongitude:" + this.mLongitude + ",mAltitude:" + this.mAltitude + ",mAccuracy:" + this.mAccuracy;
    }

    public GpsData(long j, double d, double d2, float f, int i, int i2) {
        this.mMillisecond = -1L;
        this.mLatitude = 181.0d;
        this.mLongitude = 181.0d;
        this.mAltitude = 0.0f;
        this.mAccuracy = 0;
        this.mStatus = -1;
        this.mMillisecond = j;
        this.mLatitude = d;
        this.mLongitude = d2;
        this.mAltitude = f;
        this.mAccuracy = i;
        this.mStatus = i2;
    }
}
