package com.google.android.exoplayer2.source;

import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import defpackage.bp0;
import defpackage.fxp;
import defpackage.r61;
import defpackage.rk1;
import defpackage.wlq;
import defpackage.z1a;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends c<Void> {
    public final k j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f8171k;
    public final com.google.android.exoplayer2.v.c l;
    public final com.google.android.exoplayer2.v.b m;
    public a n;
    public h o;
    public boolean p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f8172r;

    public static final class a extends z1a {
        public static final Object f = new Object();
        public final Object d;
        public final Object e;

        public a(com.google.android.exoplayer2.v vVar, Object obj, Object obj2) {
            super(vVar);
            this.d = obj;
            this.e = obj2;
        }

        public static a u(com.google.android.exoplayer2.m mVar) {
            return new a(new b(mVar), com.google.android.exoplayer2.v.c.f8448r, f);
        }

        public static a v(com.google.android.exoplayer2.v vVar, Object obj, Object obj2) {
            return new a(vVar, obj, obj2);
        }

        @Override // defpackage.z1a, com.google.android.exoplayer2.v
        public int b(Object obj) {
            Object obj2;
            com.google.android.exoplayer2.v vVar = this.c;
            if (f.equals(obj) && (obj2 = this.e) != null) {
                obj = obj2;
            }
            return vVar.b(obj);
        }

        @Override // defpackage.z1a, com.google.android.exoplayer2.v
        public com.google.android.exoplayer2.v.b g(int i, com.google.android.exoplayer2.v.b bVar, boolean z) {
            this.c.g(i, bVar, z);
            if (wlq.c(bVar.f8447b, this.e) && z) {
                bVar.f8447b = f;
            }
            return bVar;
        }

        @Override // defpackage.z1a, com.google.android.exoplayer2.v
        public Object m(int i) {
            Object objM = this.c.m(i);
            return wlq.c(objM, this.e) ? f : objM;
        }

        @Override // defpackage.z1a, com.google.android.exoplayer2.v
        public com.google.android.exoplayer2.v.c o(int i, com.google.android.exoplayer2.v.c cVar, long j) {
            this.c.o(i, cVar, j);
            if (wlq.c(cVar.f8449a, this.d)) {
                cVar.f8449a = com.google.android.exoplayer2.v.c.f8448r;
            }
            return cVar;
        }

        public a t(com.google.android.exoplayer2.v vVar) {
            return new a(vVar, this.d, this.e);
        }
    }

    @VisibleForTesting
    public static final class b extends com.google.android.exoplayer2.v {
        public final com.google.android.exoplayer2.m c;

        public b(com.google.android.exoplayer2.m mVar) {
            this.c = mVar;
        }

        @Override // com.google.android.exoplayer2.v
        public int b(Object obj) {
            return obj == a.f ? 0 : -1;
        }

        @Override // com.google.android.exoplayer2.v
        public com.google.android.exoplayer2.v.b g(int i, com.google.android.exoplayer2.v.b bVar, boolean z) {
            bVar.o(z ? 0 : null, z ? a.f : null, 0, -9223372036854775807L, 0L, bp0.g, true);
            return bVar;
        }

        @Override // com.google.android.exoplayer2.v
        public int i() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.v
        public Object m(int i) {
            return a.f;
        }

        @Override // com.google.android.exoplayer2.v
        public com.google.android.exoplayer2.v.c o(int i, com.google.android.exoplayer2.v.c cVar, long j) {
            cVar.g(com.google.android.exoplayer2.v.c.f8448r, this.c, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.l = true;
            return cVar;
        }

        @Override // com.google.android.exoplayer2.v
        public int p() {
            return 1;
        }
    }

    public i(k kVar, boolean z) {
        this.j = kVar;
        this.f8171k = z && kVar.r();
        this.l = new com.google.android.exoplayer2.v.c();
        this.m = new com.google.android.exoplayer2.v.b();
        com.google.android.exoplayer2.v vVarG = kVar.g();
        if (vVarG == null) {
            this.n = a.u(kVar.c());
        } else {
            this.n = a.v(vVarG, null, null);
            this.f8172r = true;
        }
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public void B(fxp fxpVar) {
        super.B(fxpVar);
        if (this.f8171k) {
            return;
        }
        this.p = true;
        M(null, this.j);
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public void D() {
        this.q = false;
        this.p = false;
        super.D();
    }

    @Override // com.google.android.exoplayer2.source.k
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public h d(k.a aVar, r61 r61Var, long j) {
        h hVar = new h(aVar, r61Var, j);
        hVar.y(this.j);
        if (this.q) {
            hVar.d(aVar.c(Q(aVar.f27977a)));
        } else {
            this.o = hVar;
            if (!this.p) {
                this.p = true;
                M(null, this.j);
            }
        }
        return hVar;
    }

    public final Object P(Object obj) {
        return (this.n.e == null || !this.n.e.equals(obj)) ? obj : a.f;
    }

    public final Object Q(Object obj) {
        return (this.n.e == null || !obj.equals(a.f)) ? obj : this.n.e;
    }

    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public k.a H(Void r1, k.a aVar) {
        return aVar.c(P(aVar.f27977a));
    }

    public com.google.android.exoplayer2.v S() {
        return this.n;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: T, reason: merged with bridge method [inline-methods] */
    public void K(Void r13, k kVar, com.google.android.exoplayer2.v vVar) {
        long j;
        k.a aVarC;
        if (this.q) {
            this.n = this.n.t(vVar);
            h hVar = this.o;
            if (hVar != null) {
                U(hVar.l());
            }
        } else {
            if (!vVar.q()) {
                vVar.n(0, this.l);
                long jC = this.l.c();
                Object obj = this.l.f8449a;
                h hVar2 = this.o;
                if (hVar2 != null) {
                    long jQ = hVar2.q();
                    this.n.h(this.o.f8134a.f27977a, this.m);
                    long jL = this.m.l() + jQ;
                    if (jL != this.n.n(0, this.l).c()) {
                        j = jL;
                    } else {
                        j = jC;
                    }
                } else {
                    j = jC;
                }
                Pair<Object, Long> pairJ = vVar.j(this.l, this.m, 0, j);
                Object obj2 = pairJ.first;
                long jLongValue = ((Long) pairJ.second).longValue();
                this.n = this.f8172r ? this.n.t(vVar) : a.v(vVar, obj, obj2);
                h hVar3 = this.o;
                if (hVar3 != null) {
                    U(jLongValue);
                    k.a aVar = hVar3.f8134a;
                    aVarC = aVar.c(Q(aVar.f27977a));
                }
                this.f8172r = true;
                this.q = true;
                C(this.n);
                if (aVarC != null) {
                    ((h) rk1.e(this.o)).d(aVarC);
                }
            }
            this.n = this.f8172r ? this.n.t(vVar) : a.v(vVar, com.google.android.exoplayer2.v.c.f8448r, a.f);
        }
        aVarC = null;
        this.f8172r = true;
        this.q = true;
        C(this.n);
        if (aVarC != null) {
            ((h) rk1.e(this.o)).d(aVarC);
        }
    }

    public final void U(long j) {
        h hVar = this.o;
        int iB = this.n.b(hVar.f8134a.f27977a);
        if (iB == -1) {
            return;
        }
        long j2 = this.n.f(iB, this.m).d;
        if (j2 != -9223372036854775807L && j >= j2) {
            j = Math.max(0L, j2 - 1);
        }
        hVar.w(j);
    }

    @Override // com.google.android.exoplayer2.source.k
    public com.google.android.exoplayer2.m c() {
        return this.j.c();
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.k
    public void f() {
    }

    @Override // com.google.android.exoplayer2.source.k
    public void j(j jVar) {
        ((h) jVar).x();
        if (jVar == this.o) {
            this.o = null;
        }
    }
}
