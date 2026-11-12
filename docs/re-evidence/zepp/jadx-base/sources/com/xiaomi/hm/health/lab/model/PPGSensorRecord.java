package com.xiaomi.hm.health.lab.model;

/* JADX INFO: loaded from: classes21.dex */
public class PPGSensorRecord {
    private long a = -1;
    private long b = -1;

    public long getPpg() {
        return this.b;
    }

    public long getTimeStamp() {
        return this.a;
    }

    public void setPpg(long j) {
        this.b = j;
    }

    public void setTimeStamp(long j) {
        this.a = j;
    }
}
