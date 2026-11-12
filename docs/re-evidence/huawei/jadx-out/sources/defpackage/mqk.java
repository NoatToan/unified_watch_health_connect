package defpackage;

import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class mqk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f42181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f42182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f42183c;
    private int d;
    private long e;

    public void e(long j) {
        this.f42183c = j;
    }

    public void a(int i) {
        long j = i;
        this.e = j;
        this.f42182b = this.f42183c + j;
    }

    public void d(int i) {
        this.d = i;
    }

    public void b(int i) {
        this.f42181a = i;
    }

    public long b() {
        return this.f42183c;
    }

    public long a() {
        return this.f42182b;
    }

    public int e() {
        return this.d;
    }

    public int c() {
        return this.f42181a;
    }

    public void e(int i) {
        long j = i;
        this.e += j;
        this.f42182b += j;
    }

    public String toString() {
        return "StatusPoint{startTime=" + new Date(this.f42183c * 1000) + "endTime=" + new Date(this.f42182b * 1000) + ", duration=" + this.e + ", type=" + this.d + '}';
    }
}
