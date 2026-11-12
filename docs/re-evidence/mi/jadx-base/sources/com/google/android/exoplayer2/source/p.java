package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.source.n;
import com.google.android.exoplayer2.source.p;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import defpackage.fxp;
import defpackage.m63;
import defpackage.mem;
import defpackage.nl8;
import defpackage.r61;
import defpackage.rk1;
import defpackage.wlf;
import defpackage.y57;
import defpackage.yu5;
import defpackage.z1a;

/* JADX INFO: loaded from: classes4.dex */
public final class p extends com.google.android.exoplayer2.source.a implements o.b {
    public final com.google.android.exoplayer2.m g;
    public final com.google.android.exoplayer2.m.g h;
    public final com.google.android.exoplayer2.upstream.a.InterfaceC0205a i;
    public final n.a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.exoplayer2.drm.c f8196k;
    public final com.google.android.exoplayer2.upstream.h l;
    public final int m;
    public boolean n;
    public long o;
    public boolean p;
    public boolean q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public fxp f8197r;

    public class a extends z1a {
        public a(p pVar, com.google.android.exoplayer2.v vVar) {
            super(vVar);
        }

        @Override // defpackage.z1a, com.google.android.exoplayer2.v
        public com.google.android.exoplayer2.v.b g(int i, com.google.android.exoplayer2.v.b bVar, boolean z) {
            super.g(i, bVar, z);
            bVar.f = true;
            return bVar;
        }

        @Override // defpackage.z1a, com.google.android.exoplayer2.v
        public com.google.android.exoplayer2.v.c o(int i, com.google.android.exoplayer2.v.c cVar, long j) {
            super.o(i, cVar, j);
            cVar.l = true;
            return cVar;
        }
    }

    public static final class b implements wlf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.a.InterfaceC0205a f8198a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public n.a f8199b;
        public y57 c;
        public com.google.android.exoplayer2.upstream.h d;
        public int e;
        public String f;
        public Object g;

        public b(com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a) {
            this(interfaceC0205a, new yu5());
        }

        public static /* synthetic */ n d(nl8 nl8Var) {
            return new m63(nl8Var);
        }

        @Override // defpackage.wlf
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public p a(com.google.android.exoplayer2.m mVar) {
            rk1.e(mVar.f7949b);
            com.google.android.exoplayer2.m.g gVar = mVar.f7949b;
            boolean z = false;
            boolean z2 = gVar.h == null && this.g != null;
            if (gVar.f == null && this.f != null) {
                z = true;
            }
            if (z2 && z) {
                mVar = mVar.a().l(this.g).b(this.f).a();
            } else if (z2) {
                mVar = mVar.a().l(this.g).a();
            } else if (z) {
                mVar = mVar.a().b(this.f).a();
            }
            com.google.android.exoplayer2.m mVar2 = mVar;
            return new p(mVar2, this.f8198a, this.f8199b, this.c.a(mVar2), this.d, this.e, null);
        }

        public b(com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a, final nl8 nl8Var) {
            this(interfaceC0205a, new n.a() { // from class: pci
                @Override // com.google.android.exoplayer2.source.n.a
                public final n a() {
                    return p.b.d(nl8Var);
                }
            });
        }

        public b(com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a, n.a aVar) {
            this.f8198a = interfaceC0205a;
            this.f8199b = aVar;
            this.c = new com.google.android.exoplayer2.drm.a();
            this.d = new com.google.android.exoplayer2.upstream.f();
            this.e = EventRecurrence.TH;
        }
    }

    public /* synthetic */ p(com.google.android.exoplayer2.m mVar, com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a, n.a aVar, com.google.android.exoplayer2.drm.c cVar, com.google.android.exoplayer2.upstream.h hVar, int i, a aVar2) {
        this(mVar, interfaceC0205a, aVar, cVar, hVar, i);
    }

    @Override // com.google.android.exoplayer2.source.a
    public void B(fxp fxpVar) {
        this.f8197r = fxpVar;
        this.f8196k.prepare();
        E();
    }

    @Override // com.google.android.exoplayer2.source.a
    public void D() {
        this.f8196k.release();
    }

    public final void E() {
        com.google.android.exoplayer2.v memVar = new mem(this.o, this.p, false, this.q, null, this.g);
        if (this.n) {
            memVar = new a(this, memVar);
        }
        C(memVar);
    }

    @Override // com.google.android.exoplayer2.source.k
    public com.google.android.exoplayer2.m c() {
        return this.g;
    }

    @Override // com.google.android.exoplayer2.source.k
    public j d(k.a aVar, r61 r61Var, long j) {
        com.google.android.exoplayer2.upstream.a aVarA = this.i.a();
        fxp fxpVar = this.f8197r;
        if (fxpVar != null) {
            aVarA.f(fxpVar);
        }
        return new o(this.h.f7962a, aVarA, this.j.a(), this.f8196k, u(aVar), this.l, w(aVar), this, r61Var, this.h.f, this.m);
    }

    @Override // com.google.android.exoplayer2.source.k
    public void f() {
    }

    @Override // com.google.android.exoplayer2.source.k
    public void j(j jVar) {
        ((o) jVar).c0();
    }

    @Override // com.google.android.exoplayer2.source.o.b
    public void m(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.o;
        }
        if (!this.n && this.o == j && this.p == z && this.q == z2) {
            return;
        }
        this.o = j;
        this.p = z;
        this.q = z2;
        this.n = false;
        E();
    }

    public p(com.google.android.exoplayer2.m mVar, com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a, n.a aVar, com.google.android.exoplayer2.drm.c cVar, com.google.android.exoplayer2.upstream.h hVar, int i) {
        this.h = (com.google.android.exoplayer2.m.g) rk1.e(mVar.f7949b);
        this.g = mVar;
        this.i = interfaceC0205a;
        this.j = aVar;
        this.f8196k = cVar;
        this.l = hVar;
        this.m = i;
        this.n = true;
        this.o = -9223372036854775807L;
    }
}
