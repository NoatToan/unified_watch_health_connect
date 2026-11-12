package com.google.android.exoplayer2;

import android.os.SystemClock;
import defpackage.dse;
import defpackage.g83;
import defpackage.wlq;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f7918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f7919b;
    public final long c;
    public final float d;
    public final long e;
    public final long f;
    public final float g;
    public long h;
    public long i;
    public long j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f7920k;
    public long l;
    public long m;
    public float n;
    public float o;
    public float p;
    public long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f7921r;
    public long s;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f7922a = 0.97f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f7923b = 1.03f;
        public long c = 1000;
        public float d = 1.0E-7f;
        public long e = g83.c(20);
        public long f = g83.c(500);
        public float g = 0.999f;

        public g a() {
            return new g(this.f7922a, this.f7923b, this.c, this.d, this.e, this.f, this.g);
        }
    }

    public static long h(long j, long j2, float f) {
        return (long) ((j * f) + ((1.0f - f) * j2));
    }

    @Override // com.google.android.exoplayer2.l
    public void a(m.f fVar) {
        this.h = g83.c(fVar.f7960a);
        this.f7920k = g83.c(fVar.f7961b);
        this.l = g83.c(fVar.c);
        float f = fVar.d;
        if (f == -3.4028235E38f) {
            f = this.f7918a;
        }
        this.o = f;
        float f2 = fVar.e;
        if (f2 == -3.4028235E38f) {
            f2 = this.f7919b;
        }
        this.n = f2;
        g();
    }

    @Override // com.google.android.exoplayer2.l
    public float b(long j, long j2) {
        if (this.h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j, j2);
        if (this.q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.q < this.c) {
            return this.p;
        }
        this.q = SystemClock.elapsedRealtime();
        f(j);
        long j3 = j - this.m;
        if (Math.abs(j3) < this.e) {
            this.p = 1.0f;
        } else {
            this.p = wlq.q((this.d * j3) + 1.0f, this.o, this.n);
        }
        return this.p;
    }

    @Override // com.google.android.exoplayer2.l
    public long c() {
        return this.m;
    }

    @Override // com.google.android.exoplayer2.l
    public void d() {
        long j = this.m;
        if (j == -9223372036854775807L) {
            return;
        }
        long j2 = j + this.f;
        this.m = j2;
        long j3 = this.l;
        if (j3 != -9223372036854775807L && j2 > j3) {
            this.m = j3;
        }
        this.q = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.l
    public void e(long j) {
        this.i = j;
        g();
    }

    public final void f(long j) {
        long j2 = this.f7921r + (this.s * 3);
        if (this.m > j2) {
            float fC = g83.c(this.c);
            this.m = dse.h(j2, this.j, this.m - (((long) ((this.p - 1.0f) * fC)) + ((long) ((this.n - 1.0f) * fC))));
            return;
        }
        long jS = wlq.s(j - ((long) (Math.max(0.0f, this.p - 1.0f) / this.d)), this.m, j2);
        this.m = jS;
        long j3 = this.l;
        if (j3 == -9223372036854775807L || jS <= j3) {
            return;
        }
        this.m = j3;
    }

    public final void g() {
        long j = this.h;
        if (j != -9223372036854775807L) {
            long j2 = this.i;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.f7920k;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.l;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.j == j) {
            return;
        }
        this.j = j;
        this.m = j;
        this.f7921r = -9223372036854775807L;
        this.s = -9223372036854775807L;
        this.q = -9223372036854775807L;
    }

    public final void i(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.f7921r;
        if (j4 == -9223372036854775807L) {
            this.f7921r = j3;
            this.s = 0L;
        } else {
            long jMax = Math.max(j3, h(j4, j3, this.g));
            this.f7921r = jMax;
            this.s = h(this.s, Math.abs(j3 - jMax), this.g);
        }
    }

    public g(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.f7918a = f;
        this.f7919b = f2;
        this.c = j;
        this.d = f3;
        this.e = j2;
        this.f = j3;
        this.g = f4;
        this.h = -9223372036854775807L;
        this.i = -9223372036854775807L;
        this.f7920k = -9223372036854775807L;
        this.l = -9223372036854775807L;
        this.o = f;
        this.n = f2;
        this.p = 1.0f;
        this.q = -9223372036854775807L;
        this.j = -9223372036854775807L;
        this.m = -9223372036854775807L;
        this.f7921r = -9223372036854775807L;
        this.s = -9223372036854775807L;
    }
}
