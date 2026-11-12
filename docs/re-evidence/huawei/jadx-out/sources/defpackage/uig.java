package defpackage;

import java.io.Serializable;

/* JADX INFO: loaded from: classes19.dex */
public class uig implements Serializable {
    public long d;
    public long e;
    public long f;
    public long g;
    public long l;
    public int n = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f50129a = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f50131c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f50130b = -1;

    public long d() {
        return ((Long) wuy.c(Long.valueOf(this.l))).longValue();
    }

    public void e(long j) {
        this.l = ((Long) wuy.c(Long.valueOf(j))).longValue();
    }

    public long a() {
        return ((Long) wuy.c(Long.valueOf(this.f))).longValue();
    }

    public void a(long j) {
        this.f = ((Long) wuy.c(Long.valueOf(j))).longValue();
    }

    public void b(int i) {
        this.n = ((Integer) wuy.c(Integer.valueOf(i))).intValue();
    }

    public int b() {
        return ((Integer) wuy.c(Integer.valueOf(this.n))).intValue();
    }

    public void e(int i) {
        this.f50129a = ((Integer) wuy.c(Integer.valueOf(i))).intValue();
    }

    public int c() {
        return ((Integer) wuy.c(Integer.valueOf(this.f50129a))).intValue();
    }

    public void a(int i) {
        this.h = ((Integer) wuy.c(Integer.valueOf(i))).intValue();
    }

    public int e() {
        return ((Integer) wuy.c(Integer.valueOf(this.h))).intValue();
    }

    public void c(long j) {
        this.g = ((Long) wuy.c(Long.valueOf(j))).longValue();
    }

    public void d(long j) {
        this.e = ((Long) wuy.c(Long.valueOf(j))).longValue();
    }

    public void b(long j) {
        this.d = ((Long) wuy.c(Long.valueOf(j))).longValue();
    }

    public String toString() {
        return " FitnessHistogramData mHistogramHeight = " + this.h + "  mStartPoint = " + this.n + "  mEndPoint = " + this.f50129a;
    }
}
