package com.xiaomi.hm.health.bt.model;

import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class HMAutoBacklightInfo implements Serializable {
    public static final int MODE_DISABLE = 0;
    public static final int MODE_SUNRISE_SUNSET = 2;
    public static final int MODE_TIMER = 1;
    private static final long serialVersionUID = 1;
    private int a = 0;
    private int b = -1;
    private int c = -1;
    private int d = -1;
    private int e = -1;

    public int getMode() {
        return this.a;
    }

    public int getStartHour() {
        return this.b;
    }

    public int getStartMinute() {
        return this.c;
    }

    public int getStopHour() {
        return this.d;
    }

    public int getStopMinute() {
        return this.e;
    }

    public void setMode(int mode) {
        this.a = mode;
    }

    public void setStartHour(int startHour) {
        this.b = startHour;
    }

    public void setStartMinute(int startMinute) {
        this.c = startMinute;
    }

    public void setStopHour(int stopHour) {
        this.d = stopHour;
    }

    public void setStopMinute(int stopMinute) {
        this.e = stopMinute;
    }

    public String toString() {
        return "HMAutoBacklightInfo{mode=" + this.a + ", startHour=" + this.b + ", startMinute=" + this.c + ", stopHour=" + this.d + ", stopMinute=" + this.e + '}';
    }
}
