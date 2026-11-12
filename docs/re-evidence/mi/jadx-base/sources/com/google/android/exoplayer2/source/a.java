package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import defpackage.fxp;
import defpackage.rk1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList<k.b> f8080a = new ArrayList<>(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashSet<k.b> f8081b = new HashSet<>(1);
    public final l.a c = new l.a();
    public final com.google.android.exoplayer2.drm.b.a d = new com.google.android.exoplayer2.drm.b.a();
    public Looper e;
    public com.google.android.exoplayer2.v f;

    public final boolean A() {
        return !this.f8081b.isEmpty();
    }

    public abstract void B(fxp fxpVar);

    public final void C(com.google.android.exoplayer2.v vVar) {
        this.f = vVar;
        Iterator<k.b> it = this.f8080a.iterator();
        while (it.hasNext()) {
            it.next().a(this, vVar);
        }
    }

    public abstract void D();

    @Override // com.google.android.exoplayer2.source.k
    public final void a(k.b bVar) {
        this.f8080a.remove(bVar);
        if (!this.f8080a.isEmpty()) {
            l(bVar);
            return;
        }
        this.e = null;
        this.f = null;
        this.f8081b.clear();
        D();
    }

    @Override // com.google.android.exoplayer2.source.k
    public final void b(l lVar) {
        this.c.C(lVar);
    }

    @Override // com.google.android.exoplayer2.source.k
    public final void e(k.b bVar, fxp fxpVar) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.e;
        rk1.a(looper == null || looper == looperMyLooper);
        com.google.android.exoplayer2.v vVar = this.f;
        this.f8080a.add(bVar);
        if (this.e == null) {
            this.e = looperMyLooper;
            this.f8081b.add(bVar);
            B(fxpVar);
        } else if (vVar != null) {
            k(bVar);
            bVar.a(this, vVar);
        }
    }

    @Override // com.google.android.exoplayer2.source.k
    public final void i(Handler handler, l lVar) {
        rk1.e(handler);
        rk1.e(lVar);
        this.c.g(handler, lVar);
    }

    @Override // com.google.android.exoplayer2.source.k
    public final void k(k.b bVar) {
        rk1.e(this.e);
        boolean zIsEmpty = this.f8081b.isEmpty();
        this.f8081b.add(bVar);
        if (zIsEmpty) {
            z();
        }
    }

    @Override // com.google.android.exoplayer2.source.k
    public final void l(k.b bVar) {
        boolean z = !this.f8081b.isEmpty();
        this.f8081b.remove(bVar);
        if (z && this.f8081b.isEmpty()) {
            y();
        }
    }

    @Override // com.google.android.exoplayer2.source.k
    public final void n(Handler handler, com.google.android.exoplayer2.drm.b bVar) {
        rk1.e(handler);
        rk1.e(bVar);
        this.d.g(handler, bVar);
    }

    @Override // com.google.android.exoplayer2.source.k
    public final void p(com.google.android.exoplayer2.drm.b bVar) {
        this.d.t(bVar);
    }

    public final com.google.android.exoplayer2.drm.b.a t(int i, k.a aVar) {
        return this.d.u(i, aVar);
    }

    public final com.google.android.exoplayer2.drm.b.a u(k.a aVar) {
        return this.d.u(0, aVar);
    }

    public final l.a v(int i, k.a aVar, long j) {
        return this.c.F(i, aVar, j);
    }

    public final l.a w(k.a aVar) {
        return this.c.F(0, aVar, 0L);
    }

    public final l.a x(k.a aVar, long j) {
        rk1.e(aVar);
        return this.c.F(0, aVar, j);
    }

    public void y() {
    }

    public void z() {
    }
}
