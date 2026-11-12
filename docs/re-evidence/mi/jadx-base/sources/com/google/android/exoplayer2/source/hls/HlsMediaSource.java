package com.google.android.exoplayer2.source.hls;

import android.net.Uri;
import com.google.android.exoplayer2.drm.c;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.b;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.upstream.f;
import com.google.android.exoplayer2.upstream.h;
import defpackage.an9;
import defpackage.bu5;
import defpackage.e9c;
import defpackage.f9c;
import defpackage.fxp;
import defpackage.g83;
import defpackage.g9c;
import defpackage.hv5;
import defpackage.j9c;
import defpackage.jv5;
import defpackage.l9c;
import defpackage.mem;
import defpackage.pi8;
import defpackage.r61;
import defpackage.ra4;
import defpackage.rk1;
import defpackage.wlf;
import defpackage.wlq;
import defpackage.y57;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class HlsMediaSource extends com.google.android.exoplayer2.source.a implements HlsPlaylistTracker.c {
    public final f9c g;
    public final m.g h;
    public final e9c i;
    public final ra4 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final c f8136k;
    public final h l;
    public final boolean m;
    public final int n;
    public final boolean o;
    public final HlsPlaylistTracker p;
    public final long q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final m f8137r;
    public m.f s;
    public fxp t;

    public static final class Factory implements wlf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e9c f8138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public f9c f8139b;
        public l9c c;
        public HlsPlaylistTracker.a d;
        public ra4 e;
        public y57 f;
        public h g;
        public boolean h;
        public int i;
        public boolean j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public List<StreamKey> f8140k;
        public Object l;
        public long m;

        public Factory(com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a) {
            this(new hv5(interfaceC0205a));
        }

        @Deprecated
        public HlsMediaSource b(Uri uri) {
            return a(new m.c().m(uri).i("application/x-mpegURL").a());
        }

        @Override // defpackage.wlf
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public HlsMediaSource a(m mVar) {
            m mVarA = mVar;
            rk1.e(mVarA.f7949b);
            l9c an9Var = this.c;
            List<StreamKey> list = mVarA.f7949b.e.isEmpty() ? this.f8140k : mVarA.f7949b.e;
            if (!list.isEmpty()) {
                an9Var = new an9(an9Var, list);
            }
            m.g gVar = mVarA.f7949b;
            boolean z = false;
            boolean z2 = gVar.h == null && this.l != null;
            if (gVar.e.isEmpty() && !list.isEmpty()) {
                z = true;
            }
            if (z2 && z) {
                mVarA = mVar.a().l(this.l).j(list).a();
            } else if (z2) {
                mVarA = mVar.a().l(this.l).a();
            } else if (z) {
                mVarA = mVar.a().j(list).a();
            }
            m mVar2 = mVarA;
            e9c e9cVar = this.f8138a;
            f9c f9cVar = this.f8139b;
            ra4 ra4Var = this.e;
            c cVarA = this.f.a(mVar2);
            h hVar = this.g;
            return new HlsMediaSource(mVar2, e9cVar, f9cVar, ra4Var, cVarA, hVar, this.d.a(this.f8138a, hVar, an9Var), this.m, this.h, this.i, this.j);
        }

        public Factory d(h hVar) {
            if (hVar == null) {
                hVar = new f();
            }
            this.g = hVar;
            return this;
        }

        public Factory(e9c e9cVar) {
            this.f8138a = (e9c) rk1.e(e9cVar);
            this.f = new com.google.android.exoplayer2.drm.a();
            this.c = new jv5();
            this.d = com.google.android.exoplayer2.source.hls.playlist.a.p;
            this.f8139b = f9c.f17553a;
            this.g = new f();
            this.e = new bu5();
            this.i = 1;
            this.f8140k = Collections.emptyList();
            this.m = -9223372036854775807L;
        }
    }

    static {
        pi8.a("goog.exo.hls");
    }

    public static long F(com.google.android.exoplayer2.source.hls.playlist.c cVar, long j) {
        long j2;
        com.google.android.exoplayer2.source.hls.playlist.c.f fVar = cVar.t;
        long j3 = cVar.e;
        if (j3 != -9223372036854775807L) {
            j2 = cVar.s - j3;
        } else {
            long j4 = fVar.d;
            if (j4 == -9223372036854775807L || cVar.l == -9223372036854775807L) {
                long j5 = fVar.c;
                j2 = j5 != -9223372036854775807L ? j5 : cVar.f8162k * 3;
            } else {
                j2 = j4;
            }
        }
        return j2 + j;
    }

    @Override // com.google.android.exoplayer2.source.a
    public void B(fxp fxpVar) {
        this.t = fxpVar;
        this.f8136k.prepare();
        this.p.d(this.h.f7962a, w(null), this);
    }

    @Override // com.google.android.exoplayer2.source.a
    public void D() {
        this.p.stop();
        this.f8136k.release();
    }

    public final long E(com.google.android.exoplayer2.source.hls.playlist.c cVar) {
        if (cVar.n) {
            return g83.c(wlq.W(this.q)) - cVar.e();
        }
        return 0L;
    }

    public final long G(com.google.android.exoplayer2.source.hls.playlist.c cVar, long j) {
        List<com.google.android.exoplayer2.source.hls.playlist.c.d> list = cVar.p;
        int size = list.size() - 1;
        long jC = (cVar.s + j) - g83.c(this.s.f7960a);
        while (size > 0 && list.get(size).e > jC) {
            size--;
        }
        return list.get(size).e;
    }

    public final void H(long j) {
        long jD = g83.d(j);
        if (jD != this.s.f7960a) {
            this.s = this.f8137r.a().g(jD).a().c;
        }
    }

    @Override // com.google.android.exoplayer2.source.k
    public m c() {
        return this.f8137r;
    }

    @Override // com.google.android.exoplayer2.source.k
    public j d(k.a aVar, r61 r61Var, long j) {
        l.a aVarW = w(aVar);
        return new j9c(this.g, this.p, this.i, this.t, this.f8136k, u(aVar), this.l, aVarW, r61Var, this.j, this.m, this.n, this.o);
    }

    @Override // com.google.android.exoplayer2.source.k
    public void f() throws IOException {
        this.p.j();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.c
    public void h(com.google.android.exoplayer2.source.hls.playlist.c cVar) {
        mem memVar;
        long jG;
        long jD = cVar.n ? g83.d(cVar.f) : -9223372036854775807L;
        int i = cVar.d;
        long j = (i == 2 || i == 1) ? jD : -9223372036854775807L;
        long j2 = cVar.e;
        g9c g9cVar = new g9c((b) rk1.e(this.p.c()), cVar);
        if (this.p.i()) {
            long jE = E(cVar);
            long j3 = this.s.f7960a;
            H(wlq.s(j3 != -9223372036854775807L ? g83.c(j3) : F(cVar, jE), jE, cVar.s + jE));
            long jB = cVar.f - this.p.b();
            long j4 = cVar.m ? jB + cVar.s : -9223372036854775807L;
            if (cVar.p.isEmpty()) {
                jG = j2 == -9223372036854775807L ? 0L : j2;
            } else {
                jG = G(cVar, jE);
            }
            memVar = new mem(j, jD, -9223372036854775807L, j4, cVar.s, jB, jG, true, !cVar.m, g9cVar, this.f8137r, this.s);
        } else {
            long j5 = j2 == -9223372036854775807L ? 0L : j2;
            long j6 = cVar.s;
            memVar = new mem(j, jD, -9223372036854775807L, j6, j6, 0L, j5, true, false, g9cVar, this.f8137r, null);
        }
        C(memVar);
    }

    @Override // com.google.android.exoplayer2.source.k
    public void j(j jVar) {
        ((j9c) jVar).B();
    }

    public HlsMediaSource(m mVar, e9c e9cVar, f9c f9cVar, ra4 ra4Var, c cVar, h hVar, HlsPlaylistTracker hlsPlaylistTracker, long j, boolean z, int i, boolean z2) {
        this.h = (m.g) rk1.e(mVar.f7949b);
        this.f8137r = mVar;
        this.s = mVar.c;
        this.i = e9cVar;
        this.g = f9cVar;
        this.j = ra4Var;
        this.f8136k = cVar;
        this.l = hVar;
        this.p = hlsPlaylistTracker;
        this.q = j;
        this.m = z;
        this.n = i;
        this.o = z2;
    }
}
