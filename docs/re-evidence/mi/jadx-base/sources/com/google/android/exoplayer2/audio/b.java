package com.google.android.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;
import defpackage.bp1;
import defpackage.g83;
import defpackage.rk1;
import defpackage.wlq;
import java.lang.reflect.Method;
import miuix.animation.internal.FolmeCore;

/* JADX INFO: loaded from: classes4.dex */
public final class b {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f7847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f7848b;
    public AudioTrack c;
    public int d;
    public int e;
    public bp1 f;
    public int g;
    public boolean h;
    public long i;
    public float j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f7849k;
    public long l;
    public long m;
    public Method n;
    public long o;
    public boolean p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f7850r;
    public long s;
    public long t;
    public long u;
    public int v;
    public int w;
    public long x;
    public long y;
    public long z;

    public interface a {
        void a(long j);

        void b(long j, long j2, long j3, long j4);

        void c(long j, long j2, long j3, long j4);

        void d(int i, long j);

        void e(long j);
    }

    public b(a aVar) {
        this.f7847a = (a) rk1.e(aVar);
        if (wlq.f38110a >= 18) {
            try {
                this.n = AudioTrack.class.getMethod("getLatency", null);
            } catch (NoSuchMethodException unused) {
            }
        }
        this.f7848b = new long[10];
    }

    public static boolean p(int i) {
        return wlq.f38110a < 23 && (i == 5 || i == 6);
    }

    public final boolean a() {
        return this.h && ((AudioTrack) rk1.e(this.c)).getPlayState() == 2 && f() == 0;
    }

    public final long b(long j) {
        return (j * FolmeCore.NANOS_TO_MS) / ((long) this.g);
    }

    public int c(long j) {
        return this.e - ((int) (j - (f() * ((long) this.d))));
    }

    public long d(boolean z) {
        long jG;
        if (((AudioTrack) rk1.e(this.c)).getPlayState() == 3) {
            n();
        }
        long jNanoTime = System.nanoTime() / 1000;
        bp1 bp1Var = (bp1) rk1.e(this.f);
        boolean zD = bp1Var.d();
        if (zD) {
            jG = b(bp1Var.b()) + wlq.V(jNanoTime - bp1Var.c(), this.j);
        } else {
            jG = this.w == 0 ? g() : this.l + jNanoTime;
            if (!z) {
                jG = Math.max(0L, jG - this.o);
            }
        }
        if (this.D != zD) {
            this.F = this.C;
            this.E = this.B;
        }
        long j = jNanoTime - this.F;
        if (j < FolmeCore.NANOS_TO_MS) {
            long jV = this.E + wlq.V(j, this.j);
            long j2 = (j * 1000) / FolmeCore.NANOS_TO_MS;
            jG = ((jG * j2) + ((1000 - j2) * jV)) / 1000;
        }
        if (!this.f7849k) {
            long j3 = this.B;
            if (jG > j3) {
                this.f7849k = true;
                this.f7847a.a(System.currentTimeMillis() - g83.d(wlq.a0(g83.d(jG - j3), this.j)));
            }
        }
        this.C = jNanoTime;
        this.B = jG;
        this.D = zD;
        return jG;
    }

    public long e(long j) {
        return g83.d(b(j - f()));
    }

    public final long f() {
        AudioTrack audioTrack = (AudioTrack) rk1.e(this.c);
        if (this.x != -9223372036854775807L) {
            return Math.min(this.A, this.z + ((((SystemClock.elapsedRealtime() * 1000) - this.x) * ((long) this.g)) / FolmeCore.NANOS_TO_MS));
        }
        int playState = audioTrack.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) audioTrack.getPlaybackHeadPosition()) & 4294967295L;
        if (this.h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.u = this.s;
            }
            playbackHeadPosition += this.u;
        }
        if (wlq.f38110a <= 29) {
            if (playbackHeadPosition == 0 && this.s > 0 && playState == 3) {
                if (this.y == -9223372036854775807L) {
                    this.y = SystemClock.elapsedRealtime();
                }
                return this.s;
            }
            this.y = -9223372036854775807L;
        }
        if (this.s > playbackHeadPosition) {
            this.t++;
        }
        this.s = playbackHeadPosition;
        return playbackHeadPosition + (this.t << 32);
    }

    public final long g() {
        return b(f());
    }

    public void h(long j) {
        this.z = f();
        this.x = SystemClock.elapsedRealtime() * 1000;
        this.A = j;
    }

    public boolean i(long j) {
        return j > f() || a();
    }

    public boolean j() {
        return ((AudioTrack) rk1.e(this.c)).getPlayState() == 3;
    }

    public boolean k(long j) {
        return this.y != -9223372036854775807L && j > 0 && SystemClock.elapsedRealtime() - this.y >= 200;
    }

    public boolean l(long j) {
        int playState = ((AudioTrack) rk1.e(this.c)).getPlayState();
        if (this.h) {
            if (playState == 2) {
                this.p = false;
                return false;
            }
            if (playState == 1 && f() == 0) {
                return false;
            }
        }
        boolean z = this.p;
        boolean zI = i(j);
        this.p = zI;
        if (z && !zI && playState != 1) {
            this.f7847a.d(this.e, g83.d(this.i));
        }
        return true;
    }

    public final void m(long j, long j2) {
        bp1 bp1Var = (bp1) rk1.e(this.f);
        if (bp1Var.e(j)) {
            long jC = bp1Var.c();
            long jB = bp1Var.b();
            if (Math.abs(jC - j) > 5000000) {
                this.f7847a.c(jB, jC, j, j2);
                bp1Var.f();
            } else if (Math.abs(b(jB) - j2) <= 5000000) {
                bp1Var.a();
            } else {
                this.f7847a.b(jB, jC, j, j2);
                bp1Var.f();
            }
        }
    }

    public final void n() {
        long jG = g();
        if (jG == 0) {
            return;
        }
        long jNanoTime = System.nanoTime() / 1000;
        if (jNanoTime - this.m >= 30000) {
            long[] jArr = this.f7848b;
            int i = this.v;
            jArr[i] = jG - jNanoTime;
            this.v = (i + 1) % 10;
            int i2 = this.w;
            if (i2 < 10) {
                this.w = i2 + 1;
            }
            this.m = jNanoTime;
            this.l = 0L;
            int i3 = 0;
            while (true) {
                int i4 = this.w;
                if (i3 >= i4) {
                    break;
                }
                this.l += this.f7848b[i3] / ((long) i4);
                i3++;
            }
        }
        if (this.h) {
            return;
        }
        m(jNanoTime, jG);
        o(jNanoTime);
    }

    public final void o(long j) {
        Method method;
        if (!this.q || (method = this.n) == null || j - this.f7850r < 500000) {
            return;
        }
        try {
            long jIntValue = (((long) ((Integer) wlq.j((Integer) method.invoke(rk1.e(this.c), new Object[0]))).intValue()) * 1000) - this.i;
            this.o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.o = jMax;
            if (jMax > 5000000) {
                this.f7847a.e(jMax);
                this.o = 0L;
            }
        } catch (Exception unused) {
            this.n = null;
        }
        this.f7850r = j;
    }

    public boolean q() {
        s();
        if (this.x != -9223372036854775807L) {
            return false;
        }
        ((bp1) rk1.e(this.f)).g();
        return true;
    }

    public void r() {
        s();
        this.c = null;
        this.f = null;
    }

    public final void s() {
        this.l = 0L;
        this.w = 0;
        this.v = 0;
        this.m = 0L;
        this.C = 0L;
        this.F = 0L;
        this.f7849k = false;
    }

    public void t(AudioTrack audioTrack, boolean z, int i, int i2, int i3) {
        this.c = audioTrack;
        this.d = i2;
        this.e = i3;
        this.f = new bp1(audioTrack);
        this.g = audioTrack.getSampleRate();
        this.h = z && p(i);
        boolean zO0 = wlq.o0(i);
        this.q = zO0;
        this.i = zO0 ? b(i3 / i2) : -9223372036854775807L;
        this.s = 0L;
        this.t = 0L;
        this.u = 0L;
        this.p = false;
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.f7850r = 0L;
        this.o = 0L;
        this.j = 1.0f;
    }

    public void u(float f) {
        this.j = f;
        bp1 bp1Var = this.f;
        if (bp1Var != null) {
            bp1Var.g();
        }
    }

    public void v() {
        ((bp1) rk1.e(this.f)).g();
    }
}
