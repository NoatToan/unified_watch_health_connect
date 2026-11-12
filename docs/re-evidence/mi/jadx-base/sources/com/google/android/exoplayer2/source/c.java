package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.v;
import defpackage.fxp;
import defpackage.ljf;
import defpackage.mie;
import defpackage.rk1;
import defpackage.wlq;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c<T> extends com.google.android.exoplayer2.source.a {
    public final HashMap<T, b<T>> g = new HashMap<>();
    public Handler h;
    public fxp i;

    public final class a implements l, com.google.android.exoplayer2.drm.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T f8086a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public l.a f8087b;
        public com.google.android.exoplayer2.drm.b.a c;

        public a(T t) {
            this.f8087b = c.this.w(null);
            this.c = c.this.u(null);
            this.f8086a = t;
        }

        private boolean b(int i, k.a aVar) {
            k.a aVarH;
            if (aVar != null) {
                aVarH = c.this.H(this.f8086a, aVar);
                if (aVarH == null) {
                    return false;
                }
            } else {
                aVarH = null;
            }
            int iJ = c.this.J(this.f8086a, i);
            l.a aVar2 = this.f8087b;
            if (aVar2.f8173a != iJ || !wlq.c(aVar2.f8174b, aVarH)) {
                this.f8087b = c.this.v(iJ, aVarH, 0L);
            }
            com.google.android.exoplayer2.drm.b.a aVar3 = this.c;
            if (aVar3.f7892a == iJ && wlq.c(aVar3.f7893b, aVarH)) {
                return true;
            }
            this.c = c.this.t(iJ, aVarH);
            return true;
        }

        @Override // com.google.android.exoplayer2.source.l
        public void A(int i, k.a aVar, mie mieVar, ljf ljfVar) {
            if (b(i, aVar)) {
                this.f8087b.s(mieVar, c(ljfVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.l
        public void B(int i, k.a aVar, mie mieVar, ljf ljfVar) {
            if (b(i, aVar)) {
                this.f8087b.B(mieVar, c(ljfVar));
            }
        }

        @Override // com.google.android.exoplayer2.source.l
        public void E(int i, k.a aVar, mie mieVar, ljf ljfVar, IOException iOException, boolean z) {
            if (b(i, aVar)) {
                this.f8087b.y(mieVar, c(ljfVar), iOException, z);
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void G(int i, k.a aVar) {
            if (b(i, aVar)) {
                this.c.m();
            }
        }

        @Override // com.google.android.exoplayer2.source.l
        public void a(int i, k.a aVar, ljf ljfVar) {
            if (b(i, aVar)) {
                this.f8087b.j(c(ljfVar));
            }
        }

        public final ljf c(ljf ljfVar) {
            long jI = c.this.I(this.f8086a, ljfVar.f);
            long jI2 = c.this.I(this.f8086a, ljfVar.g);
            return (jI == ljfVar.f && jI2 == ljfVar.g) ? ljfVar : new ljf(ljfVar.f25130a, ljfVar.f25131b, ljfVar.c, ljfVar.d, ljfVar.e, jI, jI2);
        }

        @Override // com.google.android.exoplayer2.source.l
        public void h(int i, k.a aVar, mie mieVar, ljf ljfVar) {
            if (b(i, aVar)) {
                this.f8087b.v(mieVar, c(ljfVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void l(int i, k.a aVar) {
            if (b(i, aVar)) {
                this.c.h();
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void n(int i, k.a aVar, int i2) {
            if (b(i, aVar)) {
                this.c.k(i2);
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void q(int i, k.a aVar) {
            if (b(i, aVar)) {
                this.c.j();
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void s(int i, k.a aVar) {
            if (b(i, aVar)) {
                this.c.i();
            }
        }

        @Override // com.google.android.exoplayer2.source.l
        public void x(int i, k.a aVar, ljf ljfVar) {
            if (b(i, aVar)) {
                this.f8087b.E(c(ljfVar));
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void z(int i, k.a aVar, Exception exc) {
            if (b(i, aVar)) {
                this.c.l(exc);
            }
        }
    }

    public static final class b<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final k f8088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final k.b f8089b;
        public final c<T>.a c;

        public b(k kVar, k.b bVar, c<T>.a aVar) {
            this.f8088a = kVar;
            this.f8089b = bVar;
            this.c = aVar;
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    public void B(fxp fxpVar) {
        this.i = fxpVar;
        this.h = wlq.x();
    }

    @Override // com.google.android.exoplayer2.source.a
    public void D() {
        for (b<T> bVar : this.g.values()) {
            bVar.f8088a.a(bVar.f8089b);
            bVar.f8088a.b(bVar.c);
            bVar.f8088a.p(bVar.c);
        }
        this.g.clear();
    }

    public final void F(T t) {
        b bVar = (b) rk1.e(this.g.get(t));
        bVar.f8088a.l(bVar.f8089b);
    }

    public final void G(T t) {
        b bVar = (b) rk1.e(this.g.get(t));
        bVar.f8088a.k(bVar.f8089b);
    }

    public k.a H(T t, k.a aVar) {
        return aVar;
    }

    public long I(T t, long j) {
        return j;
    }

    public int J(T t, int i) {
        return i;
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public abstract void K(T t, k kVar, com.google.android.exoplayer2.v vVar);

    public final void M(final T t, k kVar) {
        rk1.a(!this.g.containsKey(t));
        k.b bVar = new k.b() { // from class: pa4
            @Override // com.google.android.exoplayer2.source.k.b
            public final void a(k kVar2, v vVar) {
                this.f30159a.K(t, kVar2, vVar);
            }
        };
        a aVar = new a(t);
        this.g.put(t, new b<>(kVar, bVar, aVar));
        kVar.i((Handler) rk1.e(this.h), aVar);
        kVar.n((Handler) rk1.e(this.h), aVar);
        kVar.e(bVar, this.i);
        if (A()) {
            return;
        }
        kVar.l(bVar);
    }

    public final void N(T t) {
        b bVar = (b) rk1.e(this.g.remove(t));
        bVar.f8088a.a(bVar.f8089b);
        bVar.f8088a.b(bVar.c);
        bVar.f8088a.p(bVar.c);
    }

    @Override // com.google.android.exoplayer2.source.k
    public void f() throws IOException {
        Iterator<b<T>> it = this.g.values().iterator();
        while (it.hasNext()) {
            it.next().f8088a.f();
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    public void y() {
        for (b<T> bVar : this.g.values()) {
            bVar.f8088a.l(bVar.f8089b);
        }
    }

    @Override // com.google.android.exoplayer2.source.a
    public void z() {
        for (b<T> bVar : this.g.values()) {
            bVar.f8088a.k(bVar.f8089b);
        }
    }
}
