package com.xiaomi.hm.health.lab.model;

/* JADX INFO: loaded from: classes21.dex */
public class GSensorRecord {
    private long a = -1;
    private short b = -1;
    private short c = -1;
    private short d = -1;

    public short getAccX() {
        return this.b;
    }

    public short getAccY() {
        return this.c;
    }

    public short getAccZ() {
        return this.d;
    }

    public long getTimeStamp() {
        return this.a;
    }

    public void setAccX(short s) {
        this.b = s;
    }

    public void setAccY(short s) {
        this.c = s;
    }

    public void setAccZ(short s) {
        this.d = s;
    }

    public void setTimeStamp(long j) {
        this.a = j;
    }
}
