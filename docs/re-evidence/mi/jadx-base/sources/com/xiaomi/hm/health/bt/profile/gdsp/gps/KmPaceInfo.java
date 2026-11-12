package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class KmPaceInfo extends PaceInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private int dailyPerformance;
    private float speed;
    private int te;

    public KmPaceInfo(int i, int i2, GpsPoint gpsPoint, int i3) {
        super(i, i2, 0, gpsPoint, i3);
        this.dailyPerformance = 127;
    }

    public int getDailyPerformance() {
        return this.dailyPerformance;
    }

    public float getSpeed() {
        return this.speed;
    }

    public int getTe() {
        return this.te;
    }

    public void setDailyPerformance(int i) {
        this.dailyPerformance = i;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public void setTe(int i) {
        this.te = i;
    }
}
