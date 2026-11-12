package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes10.dex */
public class lyj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f41119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f41120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f41121c;
    private long d;
    private int e;

    public void d(long j) {
        this.f41120b = j;
    }

    public void b(int i) {
        long j = i;
        this.d = j;
        this.f41121c = this.f41120b + j;
    }

    public void c(int i) {
        this.e = i;
    }

    public void d(int i) {
        this.f41119a = i;
    }

    public long c() {
        return this.f41120b;
    }

    public long b() {
        return this.f41121c;
    }

    public int a() {
        return this.e;
    }

    public int e() {
        return this.f41119a;
    }

    public void e(int i) {
        long j = i;
        this.d += j;
        this.f41121c += j;
    }

    public String toString() {
        return "StatusPoint{startTime=" + new Date(this.f41120b * 1000) + "endTime=" + new Date(this.f41121c * 1000) + ", duration=" + this.d + ", type=" + this.e + '}';
    }
}
