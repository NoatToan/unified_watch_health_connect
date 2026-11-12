package com.google.android.exoplayer2;

import android.os.Handler;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.v;
import defpackage.fxp;
import defpackage.j1i;
import defpackage.ljf;
import defpackage.mie;
import defpackage.o91;
import defpackage.r61;
import defpackage.rk1;
import defpackage.toe;
import defpackage.wlq;
import defpackage.xlf;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class p {
    public final d d;
    public final com.google.android.exoplayer2.source.l.a e;
    public final com.google.android.exoplayer2.drm.b.a f;
    public final HashMap<c, b> g;
    public final Set<c> h;
    public boolean j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public fxp f8055k;
    public com.google.android.exoplayer2.source.t i = new com.google.android.exoplayer2.source.t.a(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final IdentityHashMap<com.google.android.exoplayer2.source.j, c> f8054b = new IdentityHashMap<>();
    public final Map<Object, c> c = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<c> f8053a = new ArrayList();

    public final class a implements com.google.android.exoplayer2.source.l, com.google.android.exoplayer2.drm.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f8056a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public com.google.android.exoplayer2.source.l.a f8057b;
        public com.google.android.exoplayer2.drm.b.a c;

        public a(c cVar) {
            this.f8057b = p.this.e;
            this.c = p.this.f;
            this.f8056a = cVar;
        }

        @Override // com.google.android.exoplayer2.source.l
        public void A(int i, com.google.android.exoplayer2.source.k.a aVar, mie mieVar, ljf ljfVar) {
            if (b(i, aVar)) {
                this.f8057b.s(mieVar, ljfVar);
            }
        }

        @Override // com.google.android.exoplayer2.source.l
        public void B(int i, com.google.android.exoplayer2.source.k.a aVar, mie mieVar, ljf ljfVar) {
            if (b(i, aVar)) {
                this.f8057b.B(mieVar, ljfVar);
            }
        }

        @Override // com.google.android.exoplayer2.source.l
        public void E(int i, com.google.android.exoplayer2.source.k.a aVar, mie mieVar, ljf ljfVar, IOException iOException, boolean z) {
            if (b(i, aVar)) {
                this.f8057b.y(mieVar, ljfVar, iOException, z);
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void G(int i, com.google.android.exoplayer2.source.k.a aVar) {
            if (b(i, aVar)) {
                this.c.m();
            }
        }

        @Override // com.google.android.exoplayer2.source.l
        public void a(int i, com.google.android.exoplayer2.source.k.a aVar, ljf ljfVar) {
            if (b(i, aVar)) {
                this.f8057b.j(ljfVar);
            }
        }

        public final boolean b(int i, com.google.android.exoplayer2.source.k.a aVar) {
            com.google.android.exoplayer2.source.k.a aVarN;
            if (aVar != null) {
                aVarN = p.n(this.f8056a, aVar);
                if (aVarN == null) {
                    return false;
                }
            } else {
                aVarN = null;
            }
            int iR = p.r(this.f8056a, i);
            com.google.android.exoplayer2.source.l.a aVar2 = this.f8057b;
            if (aVar2.f8173a != iR || !wlq.c(aVar2.f8174b, aVarN)) {
                this.f8057b = p.this.e.F(iR, aVarN, 0L);
            }
            com.google.android.exoplayer2.drm.b.a aVar3 = this.c;
            if (aVar3.f7892a == iR && wlq.c(aVar3.f7893b, aVarN)) {
                return true;
            }
            this.c = p.this.f.u(iR, aVarN);
            return true;
        }

        @Override // com.google.android.exoplayer2.source.l
        public void h(int i, com.google.android.exoplayer2.source.k.a aVar, mie mieVar, ljf ljfVar) {
            if (b(i, aVar)) {
                this.f8057b.v(mieVar, ljfVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void l(int i, com.google.android.exoplayer2.source.k.a aVar) {
            if (b(i, aVar)) {
                this.c.h();
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void n(int i, com.google.android.exoplayer2.source.k.a aVar, int i2) {
            if (b(i, aVar)) {
                this.c.k(i2);
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void q(int i, com.google.android.exoplayer2.source.k.a aVar) {
            if (b(i, aVar)) {
                this.c.j();
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void s(int i, com.google.android.exoplayer2.source.k.a aVar) {
            if (b(i, aVar)) {
                this.c.i();
            }
        }

        @Override // com.google.android.exoplayer2.source.l
        public void x(int i, com.google.android.exoplayer2.source.k.a aVar, ljf ljfVar) {
            if (b(i, aVar)) {
                this.f8057b.E(ljfVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.b
        public void z(int i, com.google.android.exoplayer2.source.k.a aVar, Exception exc) {
            if (b(i, aVar)) {
                this.c.l(exc);
            }
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.k f8058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.k.b f8059b;
        public final a c;

        public b(com.google.android.exoplayer2.source.k kVar, com.google.android.exoplayer2.source.k.b bVar, a aVar) {
            this.f8058a = kVar;
            this.f8059b = bVar;
            this.c = aVar;
        }
    }

    public static final class c implements xlf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.i f8060a;
        public int d;
        public boolean e;
        public final List<com.google.android.exoplayer2.source.k.a> c = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f8061b = new Object();

        public c(com.google.android.exoplayer2.source.k kVar, boolean z) {
            this.f8060a = new com.google.android.exoplayer2.source.i(kVar, z);
        }

        @Override // defpackage.xlf
        public v a() {
            return this.f8060a.S();
        }

        public void b(int i) {
            this.d = i;
            this.e = false;
            this.c.clear();
        }

        @Override // defpackage.xlf
        public Object getUid() {
            return this.f8061b;
        }
    }

    public interface d {
        void c();
    }

    public p(d dVar, o91 o91Var, Handler handler) {
        this.d = dVar;
        com.google.android.exoplayer2.source.l.a aVar = new com.google.android.exoplayer2.source.l.a();
        this.e = aVar;
        com.google.android.exoplayer2.drm.b.a aVar2 = new com.google.android.exoplayer2.drm.b.a();
        this.f = aVar2;
        this.g = new HashMap<>();
        this.h = new HashSet();
        if (o91Var != null) {
            aVar.g(handler, o91Var);
            aVar2.g(handler, o91Var);
        }
    }

    public static Object m(Object obj) {
        return com.google.android.exoplayer2.a.v(obj);
    }

    public static com.google.android.exoplayer2.source.k.a n(c cVar, com.google.android.exoplayer2.source.k.a aVar) {
        for (int i = 0; i < cVar.c.size(); i++) {
            if (cVar.c.get(i).d == aVar.d) {
                return aVar.c(p(cVar, aVar.f27977a));
            }
        }
        return null;
    }

    public static Object o(Object obj) {
        return com.google.android.exoplayer2.a.w(obj);
    }

    public static Object p(c cVar, Object obj) {
        return com.google.android.exoplayer2.a.y(cVar.f8061b, obj);
    }

    public static int r(c cVar, int i) {
        return i + cVar.d;
    }

    public v A(int i, int i2, com.google.android.exoplayer2.source.t tVar) {
        rk1.a(i >= 0 && i <= i2 && i2 <= q());
        this.i = tVar;
        B(i, i2);
        return i();
    }

    public final void B(int i, int i2) {
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            c cVarRemove = this.f8053a.remove(i3);
            this.c.remove(cVarRemove.f8061b);
            g(i3, -cVarRemove.f8060a.S().p());
            cVarRemove.e = true;
            if (this.j) {
                u(cVarRemove);
            }
        }
    }

    public v C(List<c> list, com.google.android.exoplayer2.source.t tVar) {
        B(0, this.f8053a.size());
        return f(this.f8053a.size(), list, tVar);
    }

    public v D(com.google.android.exoplayer2.source.t tVar) {
        int iQ = q();
        if (tVar.getLength() != iQ) {
            tVar = tVar.d().g(0, iQ);
        }
        this.i = tVar;
        return i();
    }

    public v f(int i, List<c> list, com.google.android.exoplayer2.source.t tVar) {
        if (!list.isEmpty()) {
            this.i = tVar;
            for (int i2 = i; i2 < list.size() + i; i2++) {
                c cVar = list.get(i2 - i);
                if (i2 > 0) {
                    c cVar2 = this.f8053a.get(i2 - 1);
                    cVar.b(cVar2.d + cVar2.f8060a.S().p());
                } else {
                    cVar.b(0);
                }
                g(i2, cVar.f8060a.S().p());
                this.f8053a.add(i2, cVar);
                this.c.put(cVar.f8061b, cVar);
                if (this.j) {
                    x(cVar);
                    if (this.f8054b.isEmpty()) {
                        this.h.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public final void g(int i, int i2) {
        while (i < this.f8053a.size()) {
            this.f8053a.get(i).d += i2;
            i++;
        }
    }

    public com.google.android.exoplayer2.source.j h(com.google.android.exoplayer2.source.k.a aVar, r61 r61Var, long j) {
        Object objO = o(aVar.f27977a);
        com.google.android.exoplayer2.source.k.a aVarC = aVar.c(m(aVar.f27977a));
        c cVar = (c) rk1.e(this.c.get(objO));
        l(cVar);
        cVar.c.add(aVarC);
        com.google.android.exoplayer2.source.h hVarD = cVar.f8060a.d(aVarC, r61Var, j);
        this.f8054b.put(hVarD, cVar);
        k();
        return hVarD;
    }

    public v i() {
        if (this.f8053a.isEmpty()) {
            return v.f8444a;
        }
        int iP = 0;
        for (int i = 0; i < this.f8053a.size(); i++) {
            c cVar = this.f8053a.get(i);
            cVar.d = iP;
            iP += cVar.f8060a.S().p();
        }
        return new j1i(this.f8053a, this.i);
    }

    public final void j(c cVar) {
        b bVar = this.g.get(cVar);
        if (bVar != null) {
            bVar.f8058a.l(bVar.f8059b);
        }
    }

    public final void k() {
        Iterator<c> it = this.h.iterator();
        while (it.hasNext()) {
            c next = it.next();
            if (next.c.isEmpty()) {
                j(next);
                it.remove();
            }
        }
    }

    public final void l(c cVar) {
        this.h.add(cVar);
        b bVar = this.g.get(cVar);
        if (bVar != null) {
            bVar.f8058a.k(bVar.f8059b);
        }
    }

    public int q() {
        return this.f8053a.size();
    }

    public boolean s() {
        return this.j;
    }

    public final /* synthetic */ void t(com.google.android.exoplayer2.source.k kVar, v vVar) {
        this.d.c();
    }

    public final void u(c cVar) {
        if (cVar.e && cVar.c.isEmpty()) {
            b bVar = (b) rk1.e(this.g.remove(cVar));
            bVar.f8058a.a(bVar.f8059b);
            bVar.f8058a.b(bVar.c);
            bVar.f8058a.p(bVar.c);
            this.h.remove(cVar);
        }
    }

    public v v(int i, int i2, int i3, com.google.android.exoplayer2.source.t tVar) {
        rk1.a(i >= 0 && i <= i2 && i2 <= q() && i3 >= 0);
        this.i = tVar;
        if (i == i2 || i == i3) {
            return i();
        }
        int iMin = Math.min(i, i3);
        int iMax = Math.max(((i2 - i) + i3) - 1, i2 - 1);
        int iP = this.f8053a.get(iMin).d;
        wlq.v0(this.f8053a, i, i2, i3);
        while (iMin <= iMax) {
            c cVar = this.f8053a.get(iMin);
            cVar.d = iP;
            iP += cVar.f8060a.S().p();
            iMin++;
        }
        return i();
    }

    public void w(fxp fxpVar) {
        rk1.g(!this.j);
        this.f8055k = fxpVar;
        for (int i = 0; i < this.f8053a.size(); i++) {
            c cVar = this.f8053a.get(i);
            x(cVar);
            this.h.add(cVar);
        }
        this.j = true;
    }

    public final void x(c cVar) {
        com.google.android.exoplayer2.source.i iVar = cVar.f8060a;
        com.google.android.exoplayer2.source.k.b bVar = new com.google.android.exoplayer2.source.k.b() { // from class: ylf
            @Override // com.google.android.exoplayer2.source.k.b
            public final void a(k kVar, v vVar) {
                this.f40300a.t(kVar, vVar);
            }
        };
        a aVar = new a(cVar);
        this.g.put(cVar, new b(iVar, bVar, aVar));
        iVar.i(wlq.z(), aVar);
        iVar.n(wlq.z(), aVar);
        iVar.e(bVar, this.f8055k);
    }

    public void y() {
        for (b bVar : this.g.values()) {
            try {
                bVar.f8058a.a(bVar.f8059b);
            } catch (RuntimeException e) {
                toe.d("MediaSourceList", "Failed to release child source.", e);
            }
            bVar.f8058a.b(bVar.c);
            bVar.f8058a.p(bVar.c);
        }
        this.g.clear();
        this.h.clear();
        this.j = false;
    }

    public void z(com.google.android.exoplayer2.source.j jVar) {
        c cVar = (c) rk1.e(this.f8054b.remove(jVar));
        cVar.f8060a.j(jVar);
        cVar.c.remove(((com.google.android.exoplayer2.source.h) jVar).f8134a);
        if (!this.f8054b.isEmpty()) {
            k();
        }
        u(cVar);
    }
}
