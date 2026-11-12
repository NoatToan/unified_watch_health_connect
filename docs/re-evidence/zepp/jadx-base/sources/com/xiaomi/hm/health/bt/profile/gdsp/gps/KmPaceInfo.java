package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class KmPaceInfo extends PaceInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private int f;
    private int g;
    private float h;

    public KmPaceInfo(int index, int pace, GpsPoint point, int gpsIndex) {
        super(index, pace, 0, point, gpsIndex);
        this.g = 127;
    }

    public int getDailyPerformance() {
        return this.g;
    }

    public float getSpeed() {
        return this.h;
    }

    public int getTe() {
        return this.f;
    }

    public void setDailyPerformance(int dailyPerformance) {
        this.g = dailyPerformance;
    }

    public void setSpeed(float speed) {
        this.h = speed;
    }

    public void setTe(int te) {
        this.f = te;
    }
}
