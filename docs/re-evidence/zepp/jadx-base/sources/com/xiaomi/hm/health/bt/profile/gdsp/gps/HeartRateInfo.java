package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes18.dex */
public class HeartRateInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private long a;
    private int b;

    public HeartRateInfo(long time, int hr) {
        this.a = time;
        this.b = hr;
    }

    public int getHr() {
        return this.b;
    }

    public long getTime() {
        return this.a;
    }

    public void setHr(int hr) {
        this.b = hr;
    }

    public void setTime(long time) {
        this.a = time;
    }

    public String toString() {
        return "{time=" + new Date(this.a).toString() + ", hr=" + this.b + '}';
    }
}
