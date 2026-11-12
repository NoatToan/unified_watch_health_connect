package com.google.android.exoplayer2;

import android.os.Looper;
import defpackage.f14;
import defpackage.rk1;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f8068a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f8069b;
    public final f14 c;
    public final v d;
    public int e;
    public Object f;
    public Looper g;
    public int h;
    public long i = -9223372036854775807L;
    public boolean j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f8070k;
    public boolean l;
    public boolean m;
    public boolean n;

    public interface a {
        void d(r rVar);
    }

    public interface b {
        void h(int i, Object obj) throws ExoPlaybackException;
    }

    public r(a aVar, b bVar, v vVar, int i, f14 f14Var, Looper looper) {
        this.f8069b = aVar;
        this.f8068a = bVar;
        this.d = vVar;
        this.g = looper;
        this.c = f14Var;
        this.h = i;
    }

    public synchronized boolean a(long j) throws InterruptedException, TimeoutException {
        boolean z;
        try {
            rk1.g(this.f8070k);
            rk1.g(this.g.getThread() != Thread.currentThread());
            long jElapsedRealtime = this.c.elapsedRealtime() + j;
            while (true) {
                z = this.m;
                if (z || j <= 0) {
                    break;
                }
                this.c.b();
                wait(j);
                j = jElapsedRealtime - this.c.elapsedRealtime();
            }
            if (!z) {
                throw new TimeoutException("Message delivery timed out.");
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.l;
    }

    public boolean b() {
        return this.j;
    }

    public Looper c() {
        return this.g;
    }

    public Object d() {
        return this.f;
    }

    public long e() {
        return this.i;
    }

    public b f() {
        return this.f8068a;
    }

    public v g() {
        return this.d;
    }

    public int h() {
        return this.e;
    }

    public int i() {
        return this.h;
    }

    public synchronized boolean j() {
        return this.n;
    }

    public synchronized void k(boolean z) {
        this.l = z | this.l;
        this.m = true;
        notifyAll();
    }

    public r l() {
        rk1.g(!this.f8070k);
        if (this.i == -9223372036854775807L) {
            rk1.a(this.j);
        }
        this.f8070k = true;
        this.f8069b.d(this);
        return this;
    }

    public r m(Object obj) {
        rk1.g(!this.f8070k);
        this.f = obj;
        return this;
    }

    public r n(int i) {
        rk1.g(!this.f8070k);
        this.e = i;
        return this;
    }
}
