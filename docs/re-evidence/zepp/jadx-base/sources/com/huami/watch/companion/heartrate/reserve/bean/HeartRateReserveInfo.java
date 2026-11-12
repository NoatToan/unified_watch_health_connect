package com.huami.watch.companion.heartrate.reserve.bean;

import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
public class HeartRateReserveInfo implements Serializable {
    public static final int TYPE_MAX = 1;
    public static final int TYPE_RESERVE = 0;
    private int heartRateType = 1;
    private float[] percent;
    private int restingHeartRate;
    private int[] section;

    public int getHeartRateType() {
        return this.heartRateType;
    }

    public float[] getPercent() {
        return this.percent;
    }

    public int getRestingHeartRate() {
        return this.restingHeartRate;
    }

    public int[] getSection() {
        return this.section;
    }

    public void setHeartRateType(int i) {
        this.heartRateType = i;
    }

    public void setPercent(float[] fArr) {
        this.percent = fArr;
    }

    public void setRestingHeartRate(int i) {
        this.restingHeartRate = i;
    }

    public void setSection(int[] iArr) {
        this.section = iArr;
    }
}
