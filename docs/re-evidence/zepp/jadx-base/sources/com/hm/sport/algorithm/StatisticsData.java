package com.hm.sport.algorithm;

/* JADX INFO: loaded from: classes4.dex */
public class StatisticsData {
    private float mAltitude;
    private float mDistance;
    private float mKcal;
    private long mMillisecond;
    private RidingInfo mRidingInfo;
    private int mRtHr;
    private float mRtSpeed;
    private float mRtStepFreq;
    private int mStep;
    private float mSteplength;

    public StatisticsData() {
        this.mMillisecond = -1L;
        this.mKcal = -1.0f;
        this.mDistance = -1.0f;
        this.mSteplength = -1.0f;
        this.mStep = -1;
        this.mRtSpeed = -1.0f;
        this.mRtStepFreq = -1.0f;
        this.mRtHr = -1;
        this.mAltitude = -1.0f;
        this.mRidingInfo = null;
    }

    public float getAltitude() {
        return this.mAltitude;
    }

    public float getDistance() {
        return this.mDistance;
    }

    public float getKcal() {
        return this.mKcal;
    }

    public RidingInfo getRidingInfo() {
        return this.mRidingInfo;
    }

    public int getRtHr() {
        return this.mRtHr;
    }

    public float getRtSpeed() {
        return this.mRtSpeed;
    }

    public float getRtStepFreq() {
        return this.mRtStepFreq;
    }

    public int getStep() {
        return this.mStep;
    }

    public float getSteplength() {
        return this.mSteplength;
    }

    public long getTime() {
        return this.mMillisecond;
    }

    public boolean isValid() {
        return this.mMillisecond > 0;
    }

    public String toString() {
        return "mMillisecond:" + this.mMillisecond + ",mDistance:" + this.mDistance + ",mKcal:" + this.mKcal + ",mStep:" + this.mStep + ",mSteplength:" + this.mSteplength + ",mRtStepFreq:" + this.mRtStepFreq + ",mRtSpeed:" + this.mRtSpeed + ",mRtHr:" + this.mRtHr + ",mAltitude:" + this.mAltitude + ",RidingInfo" + this.mRidingInfo;
    }

    public StatisticsData(long j, float f, float f2, int i, float f3, float f4, float f5, int i2, float f6) {
        this(j, f, f2, i, f3, f4, f5, i2, f6, null);
    }

    public StatisticsData(long j, float f, float f2, int i, float f3, float f4, float f5, int i2, float f6, RidingInfo ridingInfo) {
        this.mMillisecond = -1L;
        this.mKcal = -1.0f;
        this.mDistance = -1.0f;
        this.mSteplength = -1.0f;
        this.mStep = -1;
        this.mRtSpeed = -1.0f;
        this.mRtStepFreq = -1.0f;
        this.mRtHr = -1;
        this.mAltitude = -1.0f;
        this.mRidingInfo = null;
        this.mMillisecond = j;
        this.mDistance = f;
        this.mKcal = f2;
        this.mStep = i;
        this.mSteplength = f3;
        this.mRtSpeed = f4;
        this.mRtStepFreq = f5;
        this.mRtHr = i2;
        this.mAltitude = f6;
        this.mRidingInfo = ridingInfo;
    }
}
