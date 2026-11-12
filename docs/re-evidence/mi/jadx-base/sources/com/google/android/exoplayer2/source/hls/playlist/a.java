package com.google.android.exoplayer2.source.hls.playlist;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.a;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.h;
import com.google.android.exoplayer2.upstream.i;
import defpackage.cpd;
import defpackage.e9c;
import defpackage.g83;
import defpackage.k9c;
import defpackage.l9c;
import defpackage.ljf;
import defpackage.mie;
import defpackage.rk1;
import defpackage.wlq;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements HlsPlaylistTracker, Loader.b<i<k9c>> {
    public static final HlsPlaylistTracker.a p = new HlsPlaylistTracker.a() { // from class: kv5
        @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.a
        public final HlsPlaylistTracker a(e9c e9cVar, h hVar, l9c l9cVar) {
            return new a(e9cVar, hVar, l9cVar);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e9c f8151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l9c f8152b;
    public final h c;
    public final HashMap<Uri, C0192a> d;
    public final List<HlsPlaylistTracker.b> e;
    public final double f;
    public l.a g;
    public Loader h;
    public Handler i;
    public HlsPlaylistTracker.c j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public b f8153k;
    public Uri l;
    public c m;
    public boolean n;
    public long o;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.hls.playlist.a$a, reason: collision with other inner class name */
    public final class C0192a implements Loader.b<i<k9c>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f8154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Loader f8155b = new Loader("DefaultHlsPlaylistTracker:MediaPlaylist");
        public final com.google.android.exoplayer2.upstream.a c;
        public c d;
        public long e;
        public long f;
        public long g;
        public long h;
        public boolean i;
        public IOException j;

        public C0192a(Uri uri) {
            this.f8154a = uri;
            this.c = a.this.f8151a.a(4);
        }

        public final boolean f(long j) {
            this.h = SystemClock.elapsedRealtime() + j;
            return this.f8154a.equals(a.this.l) && !a.this.H();
        }

        public final Uri g() {
            c cVar = this.d;
            if (cVar != null) {
                c.f fVar = cVar.t;
                if (fVar.f8169a != -9223372036854775807L || fVar.e) {
                    Uri.Builder builderBuildUpon = this.f8154a.buildUpon();
                    c cVar2 = this.d;
                    if (cVar2.t.e) {
                        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(cVar2.i + ((long) cVar2.p.size())));
                        c cVar3 = this.d;
                        if (cVar3.l != -9223372036854775807L) {
                            List<c.b> list = cVar3.q;
                            int size = list.size();
                            if (!list.isEmpty() && ((c.b) cpd.f(list)).m) {
                                size--;
                            }
                            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(size));
                        }
                    }
                    c.f fVar2 = this.d.t;
                    if (fVar2.f8169a != -9223372036854775807L) {
                        builderBuildUpon.appendQueryParameter("_HLS_skip", fVar2.f8170b ? "v2" : "YES");
                    }
                    return builderBuildUpon.build();
                }
            }
            return this.f8154a;
        }

        public c h() {
            return this.d;
        }

        public boolean i() {
            int i;
            if (this.d == null) {
                return false;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jMax = Math.max(30000L, g83.d(this.d.s));
            c cVar = this.d;
            return cVar.m || (i = cVar.d) == 2 || i == 1 || this.e + jMax > jElapsedRealtime;
        }

        public final /* synthetic */ void j(Uri uri) {
            this.i = false;
            l(uri);
        }

        public void k() {
            m(this.f8154a);
        }

        public final void l(Uri uri) {
            i iVar = new i(this.c, uri, 4, a.this.f8152b.a(a.this.f8153k, this.d));
            a.this.g.z(new mie(iVar.f8438a, iVar.f8439b, this.f8155b.n(iVar, this, a.this.c.e(iVar.c))), iVar.c);
        }

        public final void m(final Uri uri) {
            this.h = 0L;
            if (this.i || this.f8155b.j() || this.f8155b.i()) {
                return;
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (jElapsedRealtime >= this.g) {
                l(uri);
            } else {
                this.i = true;
                a.this.i.postDelayed(new Runnable() { // from class: lv5
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25459a.j(uri);
                    }
                }, this.g - jElapsedRealtime);
            }
        }

        public void n() throws IOException {
            this.f8155b.a();
            IOException iOException = this.j;
            if (iOException != null) {
                throw iOException;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public void o(i<k9c> iVar, long j, long j2, boolean z) {
            mie mieVar = new mie(iVar.f8438a, iVar.f8439b, iVar.e(), iVar.c(), j, j2, iVar.a());
            a.this.c.d(iVar.f8438a);
            a.this.g.q(mieVar, 4);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
        public void q(i<k9c> iVar, long j, long j2) {
            k9c k9cVarD = iVar.d();
            mie mieVar = new mie(iVar.f8438a, iVar.f8439b, iVar.e(), iVar.c(), j, j2, iVar.a());
            if (k9cVarD instanceof c) {
                u((c) k9cVarD, mieVar);
                a.this.g.t(mieVar, 4);
            } else {
                this.j = new ParserException("Loaded playlist has unexpected type.");
                a.this.g.x(mieVar, 4, this.j, true);
            }
            a.this.c.d(iVar.f8438a);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public Loader.c s(i<k9c> iVar, long j, long j2, IOException iOException, int i) {
            Loader.c cVarH;
            mie mieVar = new mie(iVar.f8438a, iVar.f8439b, iVar.e(), iVar.c(), j, j2, iVar.a());
            boolean z = iOException instanceof HlsPlaylistParser.DeltaUpdateException;
            if ((iVar.e().getQueryParameter("_HLS_msn") != null) || z) {
                int i2 = iOException instanceof HttpDataSource.InvalidResponseCodeException ? ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode : Integer.MAX_VALUE;
                if (z || i2 == 400 || i2 == 503) {
                    this.g = SystemClock.elapsedRealtime();
                    k();
                    ((l.a) wlq.j(a.this.g)).x(mieVar, iVar.c, iOException, true);
                    return Loader.f;
                }
            }
            h.a aVar = new h.a(mieVar, new ljf(iVar.c), iOException, i);
            long jC = a.this.c.c(aVar);
            boolean z2 = jC != -9223372036854775807L;
            boolean zF = a.this.J(this.f8154a, jC) || !z2;
            if (z2) {
                zF |= f(jC);
            }
            if (zF) {
                long jA = a.this.c.a(aVar);
                cVarH = jA != -9223372036854775807L ? Loader.h(false, jA) : Loader.g;
            } else {
                cVarH = Loader.f;
            }
            boolean z3 = !cVarH.c();
            a.this.g.x(mieVar, iVar.c, iOException, z3);
            if (z3) {
                a.this.c.d(iVar.f8438a);
            }
            return cVarH;
        }

        public final void u(c cVar, mie mieVar) {
            long j;
            c cVar2 = this.d;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.e = jElapsedRealtime;
            c cVarC = a.this.C(cVar2, cVar);
            this.d = cVarC;
            if (cVarC != cVar2) {
                this.j = null;
                this.f = jElapsedRealtime;
                a.this.N(this.f8154a, cVarC);
            } else if (!cVarC.m) {
                long size = cVar.i + ((long) cVar.p.size());
                c cVar3 = this.d;
                if (size < cVar3.i) {
                    this.j = new HlsPlaylistTracker.PlaylistResetException(this.f8154a);
                    a.this.J(this.f8154a, -9223372036854775807L);
                } else if (jElapsedRealtime - this.f > g83.d(cVar3.f8162k) * a.this.f) {
                    this.j = new HlsPlaylistTracker.PlaylistStuckException(this.f8154a);
                    long jC = a.this.c.c(new h.a(mieVar, new ljf(4), this.j, 1));
                    a.this.J(this.f8154a, jC);
                    if (jC != -9223372036854775807L) {
                        f(jC);
                    }
                }
            }
            c cVar4 = this.d;
            if (cVar4.t.e) {
                j = 0;
            } else {
                j = cVar4 != cVar2 ? cVar4.f8162k : cVar4.f8162k / 2;
            }
            this.g = jElapsedRealtime + g83.d(j);
            if ((this.d.l != -9223372036854775807L || this.f8154a.equals(a.this.l)) && !this.d.m) {
                m(g());
            }
        }

        public void v() {
            this.f8155b.l();
        }
    }

    public a(e9c e9cVar, h hVar, l9c l9cVar) {
        this(e9cVar, hVar, l9cVar, 3.5d);
    }

    public static c.d B(c cVar, c cVar2) {
        int i = (int) (cVar2.i - cVar.i);
        List<c.d> list = cVar.p;
        if (i < list.size()) {
            return list.get(i);
        }
        return null;
    }

    public final void A(List<Uri> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Uri uri = list.get(i);
            this.d.put(uri, new C0192a(uri));
        }
    }

    public final c C(c cVar, c cVar2) {
        if (cVar2.f(cVar)) {
            return cVar2.c(E(cVar, cVar2), D(cVar, cVar2));
        }
        return cVar2.m ? cVar.d() : cVar;
    }

    public final int D(c cVar, c cVar2) {
        c.d dVarB;
        if (cVar2.g) {
            return cVar2.h;
        }
        c cVar3 = this.m;
        int i = cVar3 != null ? cVar3.h : 0;
        return (cVar == null || (dVarB = B(cVar, cVar2)) == null) ? i : (cVar.h + dVarB.d) - cVar2.p.get(0).d;
    }

    public final long E(c cVar, c cVar2) {
        if (cVar2.n) {
            return cVar2.f;
        }
        c cVar3 = this.m;
        long j = cVar3 != null ? cVar3.f : 0L;
        if (cVar == null) {
            return j;
        }
        int size = cVar.p.size();
        c.d dVarB = B(cVar, cVar2);
        if (dVarB != null) {
            return cVar.f + dVarB.e;
        }
        return ((long) size) == cVar2.i - cVar.i ? cVar.e() : j;
    }

    public final Uri F(Uri uri) {
        c.C0194c c0194c;
        c cVar = this.m;
        if (cVar == null || !cVar.t.e || (c0194c = cVar.f8163r.get(uri)) == null) {
            return uri;
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.appendQueryParameter("_HLS_msn", String.valueOf(c0194c.f8165b));
        int i = c0194c.c;
        if (i != -1) {
            builderBuildUpon.appendQueryParameter("_HLS_part", String.valueOf(i));
        }
        return builderBuildUpon.build();
    }

    public final boolean G(Uri uri) {
        List<b.C0193b> list = this.f8153k.e;
        for (int i = 0; i < list.size(); i++) {
            if (uri.equals(list.get(i).f8160a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean H() {
        List<b.C0193b> list = this.f8153k.e;
        int size = list.size();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        for (int i = 0; i < size; i++) {
            C0192a c0192a = (C0192a) rk1.e(this.d.get(list.get(i).f8160a));
            if (jElapsedRealtime > c0192a.h) {
                Uri uri = c0192a.f8154a;
                this.l = uri;
                c0192a.m(F(uri));
                return true;
            }
        }
        return false;
    }

    public final void I(Uri uri) {
        if (uri.equals(this.l) || !G(uri)) {
            return;
        }
        c cVar = this.m;
        if (cVar == null || !cVar.m) {
            this.l = uri;
            this.d.get(uri).m(F(uri));
        }
    }

    public final boolean J(Uri uri, long j) {
        int size = this.e.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            z |= !this.e.get(i).l(uri, j);
        }
        return z;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void o(i<k9c> iVar, long j, long j2, boolean z) {
        mie mieVar = new mie(iVar.f8438a, iVar.f8439b, iVar.e(), iVar.c(), j, j2, iVar.a());
        this.c.d(iVar.f8438a);
        this.g.q(mieVar, 4);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public void q(i<k9c> iVar, long j, long j2) {
        k9c k9cVarD = iVar.d();
        boolean z = k9cVarD instanceof c;
        b bVarE = z ? b.e(k9cVarD.f23628a) : (b) k9cVarD;
        this.f8153k = bVarE;
        this.l = bVarE.e.get(0).f8160a;
        A(bVarE.d);
        mie mieVar = new mie(iVar.f8438a, iVar.f8439b, iVar.e(), iVar.c(), j, j2, iVar.a());
        C0192a c0192a = this.d.get(this.l);
        if (z) {
            c0192a.u((c) k9cVarD, mieVar);
        } else {
            c0192a.k();
        }
        this.c.d(iVar.f8438a);
        this.g.t(mieVar, 4);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public Loader.c s(i<k9c> iVar, long j, long j2, IOException iOException, int i) {
        mie mieVar = new mie(iVar.f8438a, iVar.f8439b, iVar.e(), iVar.c(), j, j2, iVar.a());
        long jA = this.c.a(new h.a(mieVar, new ljf(iVar.c), iOException, i));
        boolean z = jA == -9223372036854775807L;
        this.g.x(mieVar, iVar.c, iOException, z);
        if (z) {
            this.c.d(iVar.f8438a);
        }
        return z ? Loader.g : Loader.h(false, jA);
    }

    public final void N(Uri uri, c cVar) {
        if (uri.equals(this.l)) {
            if (this.m == null) {
                this.n = !cVar.m;
                this.o = cVar.f;
            }
            this.m = cVar;
            this.j.h(cVar);
        }
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            this.e.get(i).d();
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void a(HlsPlaylistTracker.b bVar) {
        this.e.remove(bVar);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public long b() {
        return this.o;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public b c() {
        return this.f8153k;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void d(Uri uri, l.a aVar, HlsPlaylistTracker.c cVar) {
        this.i = wlq.x();
        this.g = aVar;
        this.j = cVar;
        i iVar = new i(this.f8151a.a(4), uri, 4, this.f8152b.b());
        rk1.g(this.h == null);
        Loader loader = new Loader("DefaultHlsPlaylistTracker:MasterPlaylist");
        this.h = loader;
        aVar.z(new mie(iVar.f8438a, iVar.f8439b, loader.n(iVar, this, this.c.e(iVar.c))), iVar.c);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void e(Uri uri) throws IOException {
        this.d.get(uri).n();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void f(Uri uri) {
        this.d.get(uri).k();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void g(HlsPlaylistTracker.b bVar) {
        rk1.e(bVar);
        this.e.add(bVar);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean h(Uri uri) {
        return this.d.get(uri).i();
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public boolean i() {
        return this.n;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void j() throws IOException {
        Loader loader = this.h;
        if (loader != null) {
            loader.a();
        }
        Uri uri = this.l;
        if (uri != null) {
            e(uri);
        }
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public c k(Uri uri, boolean z) {
        c cVarH = this.d.get(uri).h();
        if (cVarH != null && z) {
            I(uri);
        }
        return cVarH;
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker
    public void stop() {
        this.l = null;
        this.m = null;
        this.f8153k = null;
        this.o = -9223372036854775807L;
        this.h.l();
        this.h = null;
        Iterator<C0192a> it = this.d.values().iterator();
        while (it.hasNext()) {
            it.next().v();
        }
        this.i.removeCallbacksAndMessages(null);
        this.i = null;
        this.d.clear();
    }

    public a(e9c e9cVar, h hVar, l9c l9cVar, double d) {
        this.f8151a = e9cVar;
        this.f8152b = l9cVar;
        this.c = hVar;
        this.f = d;
        this.e = new ArrayList();
        this.d = new HashMap<>();
        this.o = -9223372036854775807L;
    }
}
