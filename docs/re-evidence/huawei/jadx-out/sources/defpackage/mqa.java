package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class mqa {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f42163c;
    private int d;
    private int e;

    public long d() {
        return this.f42163c;
    }

    public void e(long j) {
        this.f42163c = (j / 60) * 60;
    }

    public int c() {
        return this.d;
    }

    public void b(int i) {
        this.d = i;
    }

    public int b() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    public String toString() {
        return "DataRawSleepData{startTime=" + new Date(this.f42163c * 1000) + ", currentStatus=" + this.e + ", totalCalorie=" + this.d + '}';
    }
}
