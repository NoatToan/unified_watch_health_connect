package com.huami.mifit.sportlib.core.model;

/* JADX INFO: loaded from: classes11.dex */
public class GPSActiveHr {
    private static int d;
    private static int e;
    private long a;
    private long b = -1;
    private int c = -1;

    public GPSActiveHr(long j) {
        this.a = -1L;
        this.a = j;
    }

    public int aveHr() {
        int i;
        int i2 = d;
        if (i2 == 0 || (i = e) == 0) {
            return -1;
        }
        return i2 / i;
    }

    public boolean checkImmediately() {
        return System.currentTimeMillis() - this.b <= 10000;
    }

    public boolean checkTimely() {
        return System.currentTimeMillis() - this.b <= 30000;
    }

    public int getHr() {
        return this.c;
    }

    public long getTimestamp() {
        return this.b;
    }

    public long getTrackId() {
        return this.a;
    }

    public void newHr(long j, int i) {
        this.b = j;
        this.c = i;
        e++;
        d += i;
    }

    public void setHr(int i) {
        this.c = i;
    }

    public void setTimestamp(long j) {
        this.b = j;
    }

    public void setTrackId(long j) {
        this.a = j;
    }

    public String toString() {
        return "GPSActiveHr{trackId=" + this.a + ", timestamp=" + this.b + ", hr=" + this.c + '}';
    }
}
