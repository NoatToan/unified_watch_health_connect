package defpackage;

import android.os.SystemClock;
import androidx.annotation.GuardedBy;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class uzk implements il8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a0l f36324a;
    public final int d;
    public kl8 g;
    public boolean h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("lock")
    public boolean f36326k;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final okh f36325b = new okh(65507);
    public final okh c = new okh();
    public final Object e = new Object();
    public final yzk f = new yzk();
    public volatile long i = -9223372036854775807L;
    public volatile int j = -1;

    @GuardedBy("lock")
    public long l = -9223372036854775807L;

    @GuardedBy("lock")
    public long m = -9223372036854775807L;

    public uzk(zzk zzkVar, int i) {
        this.d = i;
        this.f36324a = (a0l) rk1.e(new rw5().a(zzkVar));
    }

    public static long c(long j) {
        return j - 30;
    }

    @Override // defpackage.il8
    public void a(long j, long j2) {
        synchronized (this.e) {
            this.l = j;
            this.m = j2;
        }
    }

    @Override // defpackage.il8
    public void b(kl8 kl8Var) {
        this.f36324a.d(kl8Var, this.d);
        kl8Var.m();
        kl8Var.k(new arl.b(-9223372036854775807L));
        this.g = kl8Var;
    }

    public boolean d() {
        return this.h;
    }

    public void e() {
        synchronized (this.e) {
            this.f36326k = true;
        }
    }

    @Override // defpackage.il8
    public int f(jl8 jl8Var, r4i r4iVar) throws IOException {
        rk1.e(this.g);
        int i = jl8Var.read(this.f36325b.d(), 0, 65507);
        if (i == -1) {
            return -1;
        }
        if (i == 0) {
            return 0;
        }
        this.f36325b.P(0);
        this.f36325b.O(i);
        wzk wzkVarB = wzk.b(this.f36325b);
        if (wzkVarB == null) {
            return 0;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long jC = c(jElapsedRealtime);
        this.f.f(wzkVarB, jElapsedRealtime);
        wzk wzkVarG = this.f.g(jC);
        if (wzkVarG == null) {
            return 0;
        }
        if (!this.h) {
            if (this.i == -9223372036854775807L) {
                this.i = wzkVarG.h;
            }
            if (this.j == -1) {
                this.j = wzkVarG.g;
            }
            this.f36324a.b(this.i, this.j);
            this.h = true;
        }
        synchronized (this.e) {
            try {
                if (!this.f36326k) {
                    do {
                        this.c.M(wzkVarG.f38520k);
                        this.f36324a.c(this.c, wzkVarG.h, wzkVarG.g, wzkVarG.e);
                        wzkVarG = this.f.g(jC);
                    } while (wzkVarG != null);
                } else if (this.l != -9223372036854775807L && this.m != -9223372036854775807L) {
                    this.f.i();
                    this.f36324a.a(this.l, this.m);
                    this.f36326k = false;
                    this.l = -9223372036854775807L;
                    this.m = -9223372036854775807L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return 0;
    }

    @Override // defpackage.il8
    public boolean g(jl8 jl8Var) {
        return false;
    }

    public void h(int i) {
        this.j = i;
    }

    public void i(long j) {
        this.i = j;
    }

    @Override // defpackage.il8
    public void release() {
    }
}
