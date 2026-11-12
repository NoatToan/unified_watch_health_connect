package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;
import java.util.Date;

/* JADX INFO: loaded from: classes18.dex */
public class SkipRope implements Serializable {
    private static final long serialVersionUID = 1;
    private long a;
    private int b;

    public SkipRope(long time, int skipRopeFreq) {
        this.a = time;
        this.b = skipRopeFreq;
    }

    public int getSkipRopeFreq() {
        return this.b;
    }

    public long getTime() {
        return this.a;
    }

    public void setSkipRopeFreq(int skipRopeFreq) {
        this.b = skipRopeFreq;
    }

    public void setTime(long time) {
        this.a = time;
    }

    public String toString() {
        return "{time=" + new Date(this.a).toString() + ", skipRopeFreq=" + this.b + '}';
    }
}
