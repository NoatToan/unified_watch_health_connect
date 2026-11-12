package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes10.dex */
public class lye {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f41108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f41109c;
    private long d;
    private int e;

    public long e() {
        return this.d;
    }

    public void c(long j) {
        this.d = (j / 60) * 60;
    }

    public int c() {
        return this.f41108b;
    }

    public void d(int i) {
        this.f41108b = i;
    }

    public int b() {
        return this.f41109c;
    }

    public void b(int i) {
        this.f41109c = i;
    }

    public int d() {
        return this.e;
    }

    public void e(int i) {
        this.e = i;
    }

    public int a() {
        return this.f41107a;
    }

    public void a(int i) {
        this.f41107a = i;
    }

    public String toString() {
        return "DataRawSportData{startTime=" + new Date(this.d * 1000) + ", currentStatus=" + this.f41108b + ", totalSteps=" + this.f41109c + ", totalCalorie=" + this.e + ", totalDistance=" + this.f41107a + '}';
    }
}
