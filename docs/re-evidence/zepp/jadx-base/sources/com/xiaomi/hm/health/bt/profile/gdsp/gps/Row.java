package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes18.dex */
public class Row implements Serializable {
    private static final long serialVersionUID = 1;
    private long a;
    private int b;

    public Row(long time, int strokeFreq) {
        this.a = time;
        this.b = strokeFreq;
    }

    public int getStrokeFreq() {
        return this.b;
    }

    public long getTime() {
        return this.a;
    }

    public void setStrokeFreq(int strokeFreq) {
        this.b = strokeFreq;
    }

    public void setTime(long time) {
        this.a = time;
    }

    public String toString() {
        return "{time=" + new Date(this.a).toString() + ", strokeFreq=" + this.b + '}';
    }
}
