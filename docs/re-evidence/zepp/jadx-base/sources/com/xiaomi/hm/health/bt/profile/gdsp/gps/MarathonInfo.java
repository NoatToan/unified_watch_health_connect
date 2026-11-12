package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;

/* JADX INFO: loaded from: classes18.dex */
public class MarathonInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private int a;
    private long b = -1;
    private long c = -1;

    public MarathonInfo(int type) {
        this.a = -1;
        this.a = type;
    }

    public long getDistance() {
        return this.b;
    }

    public long getTimeUsage() {
        return this.c;
    }

    public int getType() {
        return this.a;
    }

    public void setDistance(long distance) {
        this.b = distance;
    }

    public void setTimeUsage(long timeUsage) {
        this.c = timeUsage;
    }

    public void setType(int type) {
        this.a = type;
    }
}
