package com.google.android.exoplayer2.source;

import defpackage.fxp;
import defpackage.r61;
import defpackage.rk1;
import defpackage.z1a;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class g extends c<Void> {
    public final i j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f8133k;
    public final Map<k.a, k.a> l;
    public final Map<j, k.a> m;

    public static final class a extends z1a {
        public a(com.google.android.exoplayer2.v vVar) {
            super(vVar);
        }

        @Override // defpackage.z1a, com.google.android.exoplayer2.v
        public int e(int i, int i2, boolean z) {
            int iE = this.c.e(i, i2, z);
            return iE == -1 ? a(z) : iE;
        }

        @Override // defpackage.z1a, com.google.android.exoplayer2.v
        public int l(int i, int i2, boolean z) {
            int iL = this.c.l(i, i2, z);
            return iL == -1 ? c(z) : iL;
        }
    }

    public static final class b extends com.google.android.exoplayer2.a {
        public final com.google.android.exoplayer2.v f;
        public final int g;
        public final int h;
        public final int i;

        public b(com.google.android.exoplayer2.v vVar, int i) {
            super(false, new t.b(i));
            this.f = vVar;
            int i2 = vVar.i();
            this.g = i2;
            this.h = vVar.p();
            this.i = i;
            if (i2 > 0) {
                rk1.h(i <= Integer.MAX_VALUE / i2, "LoopingMediaSource contains too many periods");
            }
        }

        @Override // com.google.android.exoplayer2.a
        public int A(int i) {
            return i * this.h;
        }

        @Override // com.google.android.exoplayer2.a
        public com.google.android.exoplayer2.v D(int i) {
            return this.f;
        }

        @Override // com.google.android.exoplayer2.v
        public int i() {
            return this.g * this.i;
        }

        @Override // com.google.android.exoplayer2.v
        public int p() {
            return this.h * this.i;
        }

        @Override // com.google.android.exoplayer2.a
        public int s(Object obj) {
            if (obj instanceof Integer) {
                return ((Integer) obj).intValue();
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.a
        public int t(int i) {
            return i / this.g;
        }

        @Override // com.google.android.exoplayer2.a
        public int u(int i) {
            return i / this.h;
        }

        @Override // com.google.android.exoplayer2.a
        public Object x(int i) {
            return Integer.valueOf(i);
        }

        @Override // com.google.android.exoplayer2.a
        public int z(int i) {
            return i * this.g;
        }
    }

    public g(k kVar) {
        this(kVar, Integer.MAX_VALUE);
    }

    @Override // com.google.android.exoplayer2.source.c, com.google.android.exoplayer2.source.a
    public void B(fxp fxpVar) {
        super.B(fxpVar);
        M(null, this.j);
    }

    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public k.a H(Void r2, k.a aVar) {
        return this.f8133k != Integer.MAX_VALUE ? this.l.get(aVar) : aVar;
    }

    @Override // com.google.android.exoplayer2.source.c
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public void K(Void r1, k kVar, com.google.android.exoplayer2.v vVar) {
        C(this.f8133k != Integer.MAX_VALUE ? new b(vVar, this.f8133k) : new a(vVar));
    }

    @Override // com.google.android.exoplayer2.source.k
    public com.google.android.exoplayer2.m c() {
        return this.j.c();
    }

    @Override // com.google.android.exoplayer2.source.k
    public j d(k.a aVar, r61 r61Var, long j) {
        if (this.f8133k == Integer.MAX_VALUE) {
            return this.j.d(aVar, r61Var, j);
        }
        k.a aVarC = aVar.c(com.google.android.exoplayer2.a.v(aVar.f27977a));
        this.l.put(aVarC, aVar);
        h hVarO = this.j.d(aVarC, r61Var, j);
        this.m.put(hVarO, aVarC);
        return hVarO;
    }

    @Override // com.google.android.exoplayer2.source.k
    public com.google.android.exoplayer2.v g() {
        return this.f8133k != Integer.MAX_VALUE ? new b(this.j.S(), this.f8133k) : new a(this.j.S());
    }

    @Override // com.google.android.exoplayer2.source.k
    public void j(j jVar) {
        this.j.j(jVar);
        k.a aVarRemove = this.m.remove(jVar);
        if (aVarRemove != null) {
            this.l.remove(aVarRemove);
        }
    }

    @Override // com.google.android.exoplayer2.source.k
    public boolean r() {
        return false;
    }

    public g(k kVar, int i) {
        rk1.a(i > 0);
        this.j = new i(kVar, false);
        this.f8133k = i;
        this.l = new HashMap();
        this.m = new HashMap();
    }
}
