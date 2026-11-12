package com.google.android.exoplayer2.source.smoothstreaming;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.upstream.h;
import com.google.android.exoplayer2.upstream.i;
import defpackage.bn9;
import defpackage.bu5;
import defpackage.fxp;
import defpackage.g83;
import defpackage.ljf;
import defpackage.mem;
import defpackage.mie;
import defpackage.pi8;
import defpackage.r61;
import defpackage.ra4;
import defpackage.rk1;
import defpackage.sie;
import defpackage.wlf;
import defpackage.wlq;
import defpackage.y57;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class SsMediaSource extends com.google.android.exoplayer2.source.a implements Loader.b<i<com.google.android.exoplayer2.source.smoothstreaming.manifest.a>> {
    public final boolean g;
    public final Uri h;
    public final m.g i;
    public final m j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a.InterfaceC0205a f8251k;
    public final b.a l;
    public final ra4 m;
    public final com.google.android.exoplayer2.drm.c n;
    public final h o;
    public final long p;
    public final l.a q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final i.a<? extends com.google.android.exoplayer2.source.smoothstreaming.manifest.a> f8252r;
    public final ArrayList<c> s;
    public com.google.android.exoplayer2.upstream.a t;
    public Loader u;
    public sie v;
    public fxp w;
    public long x;
    public com.google.android.exoplayer2.source.smoothstreaming.manifest.a y;
    public Handler z;

    public static final class Factory implements wlf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b.a f8253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.a.InterfaceC0205a f8254b;
        public ra4 c;
        public y57 d;
        public h e;
        public long f;
        public i.a<? extends com.google.android.exoplayer2.source.smoothstreaming.manifest.a> g;
        public List<StreamKey> h;
        public Object i;

        public Factory(com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a) {
            this(new com.google.android.exoplayer2.source.smoothstreaming.a.C0200a(interfaceC0205a), interfaceC0205a);
        }

        @Override // defpackage.wlf
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SsMediaSource a(m mVar) {
            m mVarA = mVar;
            rk1.e(mVarA.f7949b);
            i.a ssManifestParser = this.g;
            if (ssManifestParser == null) {
                ssManifestParser = new SsManifestParser();
            }
            List<StreamKey> list = !mVarA.f7949b.e.isEmpty() ? mVarA.f7949b.e : this.h;
            i.a bn9Var = !list.isEmpty() ? new bn9(ssManifestParser, list) : ssManifestParser;
            m.g gVar = mVarA.f7949b;
            boolean z = false;
            boolean z2 = gVar.h == null && this.i != null;
            if (gVar.e.isEmpty() && !list.isEmpty()) {
                z = true;
            }
            if (z2 && z) {
                mVarA = mVar.a().l(this.i).j(list).a();
            } else if (z2) {
                mVarA = mVar.a().l(this.i).a();
            } else if (z) {
                mVarA = mVar.a().j(list).a();
            }
            m mVar2 = mVarA;
            return new SsMediaSource(mVar2, null, this.f8254b, bn9Var, this.f8253a, this.c, this.d.a(mVar2), this.e, this.f);
        }

        public Factory c(long j) {
            this.f = j;
            return this;
        }

        public Factory d(h hVar) {
            if (hVar == null) {
                hVar = new f();
            }
            this.e = hVar;
            return this;
        }

        public Factory(b.a aVar, com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a) {
            this.f8253a = (b.a) rk1.e(aVar);
            this.f8254b = interfaceC0205a;
            this.d = new com.google.android.exoplayer2.drm.a();
            this.e = new f();
            this.f = 30000L;
            this.c = new bu5();
            this.h = Collections.emptyList();
        }
    }

    static {
        pi8.a("goog.exo.smoothstreaming");
    }

    @Override // com.google.android.exoplayer2.source.a
    public void B(fxp fxpVar) {
        this.w = fxpVar;
        this.n.prepare();
        if (this.g) {
            this.v = new sie.a();
            I();
            return;
        }
        this.t = this.f8251k.a();
        Loader loader = new Loader("SsMediaSource");
        this.u = loader;
        this.v = loader;
        this.z = wlq.x();
        K();
    }

    @Override // com.google.android.exoplayer2.source.a
    public void D() {
        this.y = this.g ? this.y : null;
        this.t = null;
        this.x = 0L;
        Loader loader = this.u;
        if (loader != null) {
            loader.l();
            this.u = null;
        }
        Handler handler = this.z;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.z = null;
        }
        this.n.release();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void o(i<com.google.android.exoplayer2.source.smoothstreaming.manifest.a> iVar, long j, long j2, boolean z) {
        mie mieVar = new mie(iVar.f8438a, iVar.f8439b, iVar.e(), iVar.c(), j, j2, iVar.a());
        this.o.d(iVar.f8438a);
        this.q.q(mieVar, iVar.c);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void q(i<com.google.android.exoplayer2.source.smoothstreaming.manifest.a> iVar, long j, long j2) {
        mie mieVar = new mie(iVar.f8438a, iVar.f8439b, iVar.e(), iVar.c(), j, j2, iVar.a());
        this.o.d(iVar.f8438a);
        this.q.t(mieVar, iVar.c);
        this.y = iVar.d();
        this.x = j - j2;
        I();
        J();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public Loader.c s(i<com.google.android.exoplayer2.source.smoothstreaming.manifest.a> iVar, long j, long j2, IOException iOException, int i) {
        mie mieVar = new mie(iVar.f8438a, iVar.f8439b, iVar.e(), iVar.c(), j, j2, iVar.a());
        long jA = this.o.a(new h.a(mieVar, new ljf(iVar.c), iOException, i));
        Loader.c cVarH = jA == -9223372036854775807L ? Loader.g : Loader.h(false, jA);
        boolean z = !cVarH.c();
        this.q.x(mieVar, iVar.c, iOException, z);
        if (z) {
            this.o.d(iVar.f8438a);
        }
        return cVarH;
    }

    public final void I() {
        mem memVar;
        for (int i = 0; i < this.s.size(); i++) {
            this.s.get(i).w(this.y);
        }
        long jMax = Long.MIN_VALUE;
        long jMax2 = Long.MAX_VALUE;
        for (com.google.android.exoplayer2.source.smoothstreaming.manifest.a.b bVar : this.y.f) {
            if (bVar.f8273k > 0) {
                jMax2 = Math.min(jMax2, bVar.e(0));
                jMax = Math.max(jMax, bVar.e(bVar.f8273k - 1) + bVar.c(bVar.f8273k - 1));
            }
        }
        if (jMax2 == Long.MAX_VALUE) {
            long j = this.y.d ? -9223372036854775807L : 0L;
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar = this.y;
            boolean z = aVar.d;
            memVar = new mem(j, 0L, 0L, 0L, true, z, z, aVar, this.j);
        } else {
            com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar2 = this.y;
            if (aVar2.d) {
                long j2 = aVar2.h;
                if (j2 != -9223372036854775807L && j2 > 0) {
                    jMax2 = Math.max(jMax2, jMax - j2);
                }
                long j3 = jMax2;
                long j4 = jMax - j3;
                long jC = j4 - g83.c(this.p);
                if (jC < 5000000) {
                    jC = Math.min(5000000L, j4 / 2);
                }
                memVar = new mem(-9223372036854775807L, j4, j3, jC, true, true, true, this.y, this.j);
            } else {
                long j5 = aVar2.g;
                long j6 = j5 != -9223372036854775807L ? j5 : jMax - jMax2;
                memVar = new mem(jMax2 + j6, j6, jMax2, 0L, true, false, false, this.y, this.j);
            }
        }
        C(memVar);
    }

    public final void J() {
        if (this.y.d) {
            this.z.postDelayed(new Runnable() { // from class: h8o
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19808a.K();
                }
            }, Math.max(0L, (this.x + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    public final void K() {
        if (this.u.i()) {
            return;
        }
        i iVar = new i(this.t, this.h, 4, this.f8252r);
        this.q.z(new mie(iVar.f8438a, iVar.f8439b, this.u.n(iVar, this, this.o.e(iVar.c))), iVar.c);
    }

    @Override // com.google.android.exoplayer2.source.k
    public m c() {
        return this.j;
    }

    @Override // com.google.android.exoplayer2.source.k
    public j d(k.a aVar, r61 r61Var, long j) {
        l.a aVarW = w(aVar);
        c cVar = new c(this.y, this.l, this.w, this.m, this.n, u(aVar), this.o, aVarW, this.v, r61Var);
        this.s.add(cVar);
        return cVar;
    }

    @Override // com.google.android.exoplayer2.source.k
    public void f() throws IOException {
        this.v.a();
    }

    @Override // com.google.android.exoplayer2.source.k
    public void j(j jVar) {
        ((c) jVar).v();
        this.s.remove(jVar);
    }

    public SsMediaSource(m mVar, com.google.android.exoplayer2.source.smoothstreaming.manifest.a aVar, com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a, i.a<? extends com.google.android.exoplayer2.source.smoothstreaming.manifest.a> aVar2, b.a aVar3, ra4 ra4Var, com.google.android.exoplayer2.drm.c cVar, h hVar, long j) {
        rk1.g(aVar == null || !aVar.d);
        this.j = mVar;
        m.g gVar = (m.g) rk1.e(mVar.f7949b);
        this.i = gVar;
        this.y = aVar;
        this.h = gVar.f7962a.equals(Uri.EMPTY) ? null : wlq.C(gVar.f7962a);
        this.f8251k = interfaceC0205a;
        this.f8252r = aVar2;
        this.l = aVar3;
        this.m = ra4Var;
        this.n = cVar;
        this.o = hVar;
        this.p = j;
        this.q = w(null);
        this.g = aVar != null;
        this.s = new ArrayList<>();
    }
}
