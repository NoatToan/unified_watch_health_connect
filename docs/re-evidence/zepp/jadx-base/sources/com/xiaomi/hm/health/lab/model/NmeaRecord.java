package com.xiaomi.hm.health.lab.model;

/* JADX INFO: loaded from: classes21.dex */
public class NmeaRecord {
    private long a = -1;
    private String b;

    public String getLog() {
        return this.b;
    }

    public long getTimeStamp() {
        return this.a;
    }

    public void setLog(String str) {
        this.b = str;
    }

    public void setTimeStamp(long j) {
        this.a = j;
    }
}
