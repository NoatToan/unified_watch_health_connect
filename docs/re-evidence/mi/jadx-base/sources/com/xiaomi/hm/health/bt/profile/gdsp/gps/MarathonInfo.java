package com.xiaomi.hm.health.bt.profile.gdsp.gps;

import java.io.Serializable;

/* JADX INFO: loaded from: classes11.dex */
public class MarathonInfo implements Serializable {
    private static final long serialVersionUID = 1;
    private long distance = -1;
    private long timeUsage = -1;
    private int type;

    public MarathonInfo(int i) {
        this.type = i;
    }

    public long getDistance() {
        return this.distance;
    }

    public long getTimeUsage() {
        return this.timeUsage;
    }

    public int getType() {
        return this.type;
    }

    public void setDistance(long j) {
        this.distance = j;
    }

    public void setTimeUsage(long j) {
        this.timeUsage = j;
    }

    public void setType(int i) {
        this.type = i;
    }
}
