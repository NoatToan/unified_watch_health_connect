package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes10.dex */
public class lyb {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41105b;
    private int d;
    private long e;

    public long a() {
        return this.e;
    }

    public void c(long j) {
        this.e = (j / 60) * 60;
    }

    public int b() {
        return this.f41105b;
    }

    public void c(int i) {
        this.f41105b = i;
    }

    public int d() {
        return this.d;
    }

    public void d(int i) {
        this.d = i;
    }

    public String toString() {
        return "DataRawSleepData{startTime=" + new Date(this.e * 1000) + ", currentStatus=" + this.d + ", totalCalorie=" + this.f41105b + '}';
    }
}
