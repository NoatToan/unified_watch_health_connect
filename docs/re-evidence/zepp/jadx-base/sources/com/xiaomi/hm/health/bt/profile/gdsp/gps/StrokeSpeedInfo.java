package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class StrokeSpeedInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private long a;
    private float b;

    public StrokeSpeedInfo(long time, float speed) {
        this.b = 0.0f;
        this.a = time;
        this.b = speed;
    }

    public float getSpeed() {
        return this.b;
    }

    public long getTime() {
        return this.a;
    }

    public void setSpeed(float speed) {
        this.b = speed;
    }

    public void setTime(long time) {
        this.a = time;
    }

    public String toString() {
        return "StrokeSpeedInfo{time=" + this.a + ", speed=" + this.b + '}';
    }
}
