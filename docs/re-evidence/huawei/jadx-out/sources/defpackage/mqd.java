package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class mqd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42165a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f42166b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f42167c;
    private long d;
    private int e;

    public long c() {
        return this.d;
    }

    public void e(long j) {
        this.d = (j / 60) * 60;
    }

    public int e() {
        return this.f42167c;
    }

    public void c(int i) {
        this.f42167c = i;
    }

    public int a() {
        return this.f42165a;
    }

    public void d(int i) {
        this.f42165a = i;
    }

    public int b() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public int d() {
        return this.f42166b;
    }

    public void a(int i) {
        this.f42166b = i;
    }

    public String toString() {
        return "DataRawSportData{startTime=" + new Date(this.d * 1000) + ", currentStatus=" + this.f42167c + ", totalSteps=" + this.f42165a + ", totalCalorie=" + this.e + ", totalDistance=" + this.f42166b + '}';
    }
}
