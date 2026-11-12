package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.TrackGroupArray;
import com.google.android.exoplayer2.source.r;
import com.google.android.exoplayer2.source.rtsp.a;
import com.google.android.exoplayer2.source.rtsp.e;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.common.collect.ImmutableList;
import defpackage.a1a;
import defpackage.arl;
import defpackage.brl;
import defpackage.f0l;
import defpackage.k9l;
import defpackage.kl8;
import defpackage.q0l;
import defpackage.r61;
import defpackage.rk1;
import defpackage.snp;
import defpackage.wlq;
import java.io.IOException;
import java.net.BindException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class e implements com.google.android.exoplayer2.source.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r61 f8226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f8227b = wlq.x();
    public final b c;
    public final com.google.android.exoplayer2.source.rtsp.c d;
    public final List<d> e;
    public final List<c> f;
    public com.google.android.exoplayer2.source.j.a g;
    public ImmutableList<TrackGroup> h;
    public IOException i;
    public RtspMediaSource.RtspPlaybackException j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f8228k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean o;
    public int p;
    public boolean q;

    public final class b implements kl8, Loader.b<com.google.android.exoplayer2.source.rtsp.b>, r.d, com.google.android.exoplayer2.source.rtsp.c.e {
        public b() {
        }

        @Override // com.google.android.exoplayer2.source.r.d
        public void a(Format format) {
            Handler handler = e.this.f8227b;
            final e eVar = e.this;
            handler.post(new Runnable() { // from class: d0l
                @Override // java.lang.Runnable
                public final void run() {
                    e.v(eVar);
                }
            });
        }

        @Override // com.google.android.exoplayer2.source.rtsp.c.e
        public void b() {
            e.this.d.g0(0L);
        }

        @Override // com.google.android.exoplayer2.source.rtsp.c.e
        public void c(long j, ImmutableList<q0l> immutableList) {
            ArrayList arrayList = new ArrayList(immutableList.size());
            for (int i = 0; i < immutableList.size(); i++) {
                arrayList.add(immutableList.get(i).c);
            }
            for (int i2 = 0; i2 < e.this.f.size(); i2++) {
                c cVar = (c) e.this.f.get(i2);
                if (!arrayList.contains(cVar.c())) {
                    e eVar = e.this;
                    String strValueOf = String.valueOf(cVar.c());
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 40);
                    sb.append("Server did not provide timing for track ");
                    sb.append(strValueOf);
                    eVar.j = new RtspMediaSource.RtspPlaybackException(sb.toString());
                    return;
                }
            }
            for (int i3 = 0; i3 < immutableList.size(); i3++) {
                q0l q0lVar = immutableList.get(i3);
                com.google.android.exoplayer2.source.rtsp.b bVarI = e.this.I(q0lVar.c);
                if (bVarI != null) {
                    bVarI.g(q0lVar.f30963a);
                    bVarI.f(q0lVar.f30964b);
                    if (e.this.K()) {
                        bVarI.e(j, q0lVar.f30963a);
                    }
                }
            }
            if (e.this.K()) {
                e.this.f8228k = -9223372036854775807L;
            }
        }

        @Override // defpackage.kl8
        public snp d(int i, int i2) {
            return ((d) rk1.e((d) e.this.e.get(i))).c;
        }

        @Override // com.google.android.exoplayer2.source.rtsp.c.e
        public void e(RtspMediaSource.RtspPlaybackException rtspPlaybackException) {
            e.this.j = rtspPlaybackException;
        }

        public final Loader.c g(com.google.android.exoplayer2.source.rtsp.b bVar) {
            if (e.this.e() == Long.MIN_VALUE) {
                if (!e.this.q) {
                    e.this.P();
                    e.this.q = true;
                }
                return Loader.f;
            }
            for (int i = 0; i < e.this.e.size(); i++) {
                d dVar = (d) e.this.e.get(i);
                if (dVar.f8232a.f8231b == bVar) {
                    dVar.c();
                    break;
                }
            }
            e.this.j = new RtspMediaSource.RtspPlaybackException("Unknown loadable timed out.");
            return Loader.f;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void o(com.google.android.exoplayer2.source.rtsp.b bVar, long j, long j2, boolean z) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public void q(com.google.android.exoplayer2.source.rtsp.b bVar, long j, long j2) {
        }

        @Override // defpackage.kl8
        public void k(arl arlVar) {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public Loader.c s(com.google.android.exoplayer2.source.rtsp.b bVar, long j, long j2, IOException iOException, int i) {
            if (!e.this.n) {
                e.this.i = iOException;
            } else {
                if (iOException.getCause() instanceof SocketTimeoutException) {
                    return g(bVar);
                }
                if (!(iOException.getCause() instanceof BindException)) {
                    e.this.j = new RtspMediaSource.RtspPlaybackException(bVar.f8215b.f17265b.toString(), iOException);
                } else if (e.D(e.this) < 3) {
                    return Loader.d;
                }
            }
            return Loader.f;
        }

        @Override // defpackage.kl8
        public void m() {
        }
    }

    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f0l f8230a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.rtsp.b f8231b;
        public String c;

        public c(f0l f0lVar, int i, com.google.android.exoplayer2.source.rtsp.a.InterfaceC0196a interfaceC0196a) {
            this.f8230a = f0lVar;
            this.f8231b = new com.google.android.exoplayer2.source.rtsp.b(i, f0lVar, new com.google.android.exoplayer2.source.rtsp.b.a() { // from class: e0l
                @Override // com.google.android.exoplayer2.source.rtsp.b.a
                public final void a(String str, a aVar) {
                    this.f16130a.f(str, aVar);
                }
            }, e.this.c, interfaceC0196a);
        }

        public Uri c() {
            return this.f8231b.f8215b.f17265b;
        }

        public String d() {
            rk1.i(this.c);
            return this.c;
        }

        public boolean e() {
            return this.c != null;
        }

        public final /* synthetic */ void f(String str, com.google.android.exoplayer2.source.rtsp.a aVar) {
            this.c = str;
            if (aVar.m()) {
                e.this.d.T(aVar);
            }
            e.this.M();
        }
    }

    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f8232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Loader f8233b;
        public final r c;
        public boolean d;
        public boolean e;

        public d(f0l f0lVar, int i, com.google.android.exoplayer2.source.rtsp.a.InterfaceC0196a interfaceC0196a) {
            this.f8232a = e.this.new c(f0lVar, i, interfaceC0196a);
            StringBuilder sb = new StringBuilder(55);
            sb.append("ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper ");
            sb.append(i);
            this.f8233b = new Loader(sb.toString());
            r rVarL = r.l(e.this.f8226a);
            this.c = rVarL;
            rVarL.d0(e.this.c);
        }

        public void c() {
            if (this.d) {
                return;
            }
            this.f8232a.f8231b.b();
            this.d = true;
            e.this.R();
        }

        public boolean d() {
            return this.c.K(this.d);
        }

        public int e(a1a a1aVar, DecoderInputBuffer decoderInputBuffer, int i) {
            return this.c.S(a1aVar, decoderInputBuffer, i, this.d);
        }

        public void f() {
            if (this.e) {
                return;
            }
            this.f8233b.l();
            this.c.T();
            this.e = true;
        }

        public void g(long j) {
            this.f8232a.f8231b.d();
            this.c.V();
            this.c.b0(j);
        }

        public void h() {
            this.f8233b.n(this.f8232a.f8231b, e.this.c, 0);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.e$e, reason: collision with other inner class name */
    public final class C0198e implements k9l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8234a;

        public C0198e(int i) {
            this.f8234a = i;
        }

        @Override // defpackage.k9l
        public void a() throws RtspMediaSource.RtspPlaybackException {
            if (e.this.j != null) {
                throw e.this.j;
            }
        }

        @Override // defpackage.k9l
        public int d(a1a a1aVar, DecoderInputBuffer decoderInputBuffer, int i) {
            return e.this.N(this.f8234a, a1aVar, decoderInputBuffer, i);
        }

        @Override // defpackage.k9l
        public boolean isReady() {
            return e.this.J(this.f8234a);
        }

        @Override // defpackage.k9l
        public int k(long j) {
            return 0;
        }
    }

    public e(r61 r61Var, List<f0l> list, com.google.android.exoplayer2.source.rtsp.c cVar, com.google.android.exoplayer2.source.rtsp.a.InterfaceC0196a interfaceC0196a) {
        this.f8226a = r61Var;
        b bVar = new b();
        this.c = bVar;
        this.e = new ArrayList(list.size());
        this.d = cVar;
        cVar.c0(bVar);
        for (int i = 0; i < list.size(); i++) {
            this.e.add(new d(list.get(i), i, interfaceC0196a));
        }
        this.f = new ArrayList(list.size());
        this.f8228k = -9223372036854775807L;
    }

    public static /* synthetic */ int D(e eVar) {
        int i = eVar.p;
        eVar.p = i + 1;
        return i;
    }

    public static ImmutableList<TrackGroup> H(ImmutableList<d> immutableList) {
        ImmutableList.a aVar = new ImmutableList.a();
        for (int i = 0; i < immutableList.size(); i++) {
            aVar.a(new TrackGroup((Format) rk1.e(immutableList.get(i).c.F())));
        }
        return aVar.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void L() {
        if (this.m || this.n) {
            return;
        }
        for (int i = 0; i < this.e.size(); i++) {
            if (this.e.get(i).c.F() == null) {
                return;
            }
        }
        this.n = true;
        this.h = H(ImmutableList.copyOf((Collection) this.e));
        ((com.google.android.exoplayer2.source.j.a) rk1.e(this.g)).o(this);
    }

    private boolean Q(long j) {
        for (int i = 0; i < this.e.size(); i++) {
            if (!this.e.get(i).c.Z(j, false)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ void v(e eVar) {
        eVar.L();
    }

    public final com.google.android.exoplayer2.source.rtsp.b I(Uri uri) {
        for (int i = 0; i < this.e.size(); i++) {
            c cVar = this.e.get(i).f8232a;
            if (cVar.c().equals(uri)) {
                return cVar.f8231b;
            }
        }
        return null;
    }

    public boolean J(int i) {
        return this.e.get(i).d();
    }

    public final boolean K() {
        return this.f8228k != -9223372036854775807L;
    }

    public final void M() {
        boolean zE = true;
        for (int i = 0; i < this.f.size(); i++) {
            zE &= this.f.get(i).e();
        }
        if (zE && this.o) {
            this.d.d0(this.f);
        }
    }

    public int N(int i, a1a a1aVar, DecoderInputBuffer decoderInputBuffer, int i2) {
        return this.e.get(i).e(a1aVar, decoderInputBuffer, i2);
    }

    public void O() {
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).f();
        }
        this.m = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void P() {
        this.d.U();
        i iVar = new i();
        ArrayList arrayList = new ArrayList(this.e.size());
        ArrayList arrayList2 = new ArrayList(this.f.size());
        for (int i = 0; i < this.e.size(); i++) {
            d dVar = this.e.get(i);
            d dVar2 = new d(dVar.f8232a.f8230a, i, iVar);
            arrayList.add(dVar2);
            dVar2.h();
            if (this.f.contains(dVar.f8232a)) {
                arrayList2.add(dVar2.f8232a);
            }
        }
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) this.e);
        this.e.clear();
        this.e.addAll(arrayList);
        this.f.clear();
        this.f.addAll(arrayList2);
        for (int i2 = 0; i2 < immutableListCopyOf.size(); i2++) {
            ((d) immutableListCopyOf.get(i2)).c();
        }
    }

    public final void R() {
        this.l = true;
        for (int i = 0; i < this.e.size(); i++) {
            this.l &= this.e.get(i).d;
        }
    }

    @Override // com.google.android.exoplayer2.source.j
    public long b(long j, brl brlVar) {
        return j;
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public boolean c(long j) {
        return h();
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public long e() {
        if (this.l || this.e.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (K()) {
            return this.f8228k;
        }
        long jZ = this.e.get(0).c.z();
        for (int i = 1; i < this.e.size(); i++) {
            jZ = Math.min(jZ, ((d) rk1.e(this.e.get(i))).c.z());
        }
        return jZ;
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public void f(long j) {
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public long g() {
        return e();
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public boolean h() {
        return !this.l;
    }

    @Override // com.google.android.exoplayer2.source.j
    public long i(long j) {
        if (K()) {
            return this.f8228k;
        }
        if (Q(j)) {
            return j;
        }
        this.f8228k = j;
        this.d.Z(j);
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).g(j);
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.j
    public long j() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.j
    public TrackGroupArray n() {
        rk1.g(this.n);
        return new TrackGroupArray((TrackGroup[]) ((ImmutableList) rk1.e(this.h)).toArray(new TrackGroup[0]));
    }

    @Override // com.google.android.exoplayer2.source.j
    public long p(com.google.android.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, k9l[] k9lVarArr, boolean[] zArr2, long j) {
        for (int i = 0; i < bVarArr.length; i++) {
            if (k9lVarArr[i] != null && (bVarArr[i] == null || !zArr[i])) {
                k9lVarArr[i] = null;
            }
        }
        this.f.clear();
        for (int i2 = 0; i2 < bVarArr.length; i2++) {
            com.google.android.exoplayer2.trackselection.b bVar = bVarArr[i2];
            if (bVar != null) {
                TrackGroup trackGroupF = bVar.f();
                int iIndexOf = ((ImmutableList) rk1.e(this.h)).indexOf(trackGroupF);
                this.f.add(((d) rk1.e(this.e.get(iIndexOf))).f8232a);
                if (this.h.contains(trackGroupF) && k9lVarArr[i2] == null) {
                    k9lVarArr[i2] = new C0198e(iIndexOf);
                    zArr2[i2] = true;
                }
            }
        }
        for (int i3 = 0; i3 < this.e.size(); i3++) {
            d dVar = this.e.get(i3);
            if (!this.f.contains(dVar.f8232a)) {
                dVar.c();
            }
        }
        this.o = true;
        M();
        return j;
    }

    @Override // com.google.android.exoplayer2.source.j
    public void r(com.google.android.exoplayer2.source.j.a aVar, long j) {
        this.g = aVar;
        for (int i = 0; i < this.e.size(); i++) {
            this.e.get(i).h();
        }
    }

    @Override // com.google.android.exoplayer2.source.j
    public void t() throws IOException {
        IOException iOException = this.i;
        if (iOException != null) {
            throw iOException;
        }
    }

    @Override // com.google.android.exoplayer2.source.j
    public void u(long j, boolean z) {
        if (K()) {
            return;
        }
        for (int i = 0; i < this.e.size(); i++) {
            d dVar = this.e.get(i);
            if (!dVar.d) {
                dVar.c.q(j, z, true);
            }
        }
    }
}
