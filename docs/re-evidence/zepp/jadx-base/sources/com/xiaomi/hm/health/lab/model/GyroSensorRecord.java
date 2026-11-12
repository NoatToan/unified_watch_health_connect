package com.xiaomi.hm.health.lab.model;

/* JADX INFO: loaded from: classes21.dex */
public class GyroSensorRecord {
    private long a = -1;
    private short b = -1;
    private short c = -1;
    private short d = -1;

    public long getTimeStamp() {
        return this.a;
    }

    public short getX() {
        return this.b;
    }

    public short getY() {
        return this.c;
    }

    public short getZ() {
        return this.d;
    }

    public void setTimeStamp(long j) {
        this.a = j;
    }

    public void setX(short s) {
        this.b = s;
    }

    public void setY(short s) {
        this.c = s;
    }

    public void setZ(short s) {
        this.d = s;
    }
}
