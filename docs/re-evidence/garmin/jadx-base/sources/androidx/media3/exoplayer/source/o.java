package androidx.media3.exoplayer.source;

import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.common.e0;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.a0;
import androidx.media3.exoplayer.d0;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.x0;
import bb.f0;
import bb.g0;
import bb.l0;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.util.MimeTypes;
import fa.z;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import o62.b0;

/* JADX INFO: loaded from: classes.dex */
public final class o implements i, bb.p, Loader.b<a>, Loader.f, r.d {
    public static final Map<String, String> M0;
    public static final androidx.media3.common.q N0;
    public boolean A;
    public boolean B;
    public e C;
    public g0 D;
    public long E;
    public boolean F;
    public long H0;
    public int I;
    public boolean I0;
    public int J0;
    public boolean K0;
    public boolean L0;
    public boolean P;
    public boolean T;
    public boolean X;
    public int Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f9541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ha.d f9542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.c f9543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.media3.exoplayer.upstream.b f9544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final k.a f9545e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.media3.exoplayer.drm.b.a f9546f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final b f9547g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final xa.b f9548h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f9549i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final long f9550j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final boolean f9551k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public long f9552k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f9553l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Loader f9554m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final n f9555n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final fa.f f9556o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final sa.l f9557p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sa.l f9558q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Handler f9559r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public i.a f9560t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ob.b f9561v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public r[] f9562w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public d[] f9563x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f9564y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f9565z;

    public final class a implements Loader.e, f.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f9567b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ha.m f9568c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final n f9569d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final bb.p f9570e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final fa.f f9571f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public volatile boolean f9573h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public long f9575j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public l0 f9577l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f9578m;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final f0 f9572g = new f0();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f9574i = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f9566a = sa.i.f158115c.getAndIncrement();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public ha.g f9576k = a(0);

        public a(Uri uri, ha.d dVar, n nVar, bb.p pVar, fa.f fVar) {
            this.f9567b = uri;
            this.f9568c = new ha.m(dVar);
            this.f9569d = nVar;
            this.f9570e = pVar;
            this.f9571f = fVar;
        }

        public final ha.g a(long j8) {
            ha.g.b bVar = new ha.g.b();
            bVar.f82565a = this.f9567b;
            bVar.f82570f = j8;
            bVar.f82572h = o.this.f9549i;
            bVar.f82573i = 6;
            bVar.f82569e = o.M0;
            return bVar.a();
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public final void cancelLoad() {
            this.f9573h = true;
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public final void load() {
            ha.d fVar;
            bb.n nVar;
            int i14;
            int iB = 0;
            while (iB == 0 && !this.f9573h) {
                try {
                    long j8 = this.f9572g.f17167a;
                    ha.g gVarA = a(j8);
                    this.f9576k = gVarA;
                    long jB = this.f9568c.b(gVarA);
                    if (this.f9573h) {
                        if (iB != 1 && ((sa.a) this.f9569d).a() != -1) {
                            this.f9572g.f17167a = ((sa.a) this.f9569d).a();
                        }
                        ha.f.a(this.f9568c);
                        return;
                    }
                    if (jB != -1) {
                        jB += j8;
                        o oVar = o.this;
                        oVar.f9559r.post(new sa.l(oVar, 0));
                    }
                    long j14 = jB;
                    o.this.f9561v = ob.b.b(this.f9568c.f82616a.getResponseHeaders());
                    ha.m mVar = this.f9568c;
                    ob.b bVar = o.this.f9561v;
                    if (bVar == null || (i14 = bVar.f131096f) == -1) {
                        fVar = mVar;
                    } else {
                        fVar = new f(mVar, i14, this);
                        o oVar2 = o.this;
                        oVar2.getClass();
                        l0 l0VarQ = oVar2.q(new d(0, true));
                        this.f9577l = l0VarQ;
                        l0VarQ.d(o.N0);
                    }
                    ((sa.a) this.f9569d).b(fVar, this.f9567b, this.f9568c.f82616a.getResponseHeaders(), j8, j14, this.f9570e);
                    if (o.this.f9561v != null && (nVar = ((sa.a) this.f9569d).f158103b) != null) {
                        bb.n nVarE = nVar.e();
                        if (nVarE instanceof ub.d) {
                            ((ub.d) nVarE).f169692s = true;
                        }
                    }
                    if (this.f9574i) {
                        n nVar2 = this.f9569d;
                        long j15 = this.f9575j;
                        bb.n nVar3 = ((sa.a) nVar2).f158103b;
                        nVar3.getClass();
                        nVar3.seek(j8, j15);
                        this.f9574i = false;
                    }
                    while (iB == 0 && !this.f9573h) {
                        try {
                            fa.f fVar2 = this.f9571f;
                            synchronized (fVar2) {
                                while (!fVar2.f70013b) {
                                    try {
                                        fVar2.wait();
                                    } catch (Throwable th3) {
                                        throw th3;
                                    }
                                }
                            }
                            n nVar4 = this.f9569d;
                            f0 f0Var = this.f9572g;
                            sa.a aVar = (sa.a) nVar4;
                            bb.n nVar5 = aVar.f158103b;
                            nVar5.getClass();
                            bb.i iVar = aVar.f158104c;
                            iVar.getClass();
                            iB = nVar5.b(iVar, f0Var);
                            long jA = ((sa.a) this.f9569d).a();
                            if (jA > o.this.f9550j + j8) {
                                fa.f fVar3 = this.f9571f;
                                synchronized (fVar3) {
                                    fVar3.f70013b = false;
                                }
                                o oVar3 = o.this;
                                oVar3.f9559r.post(oVar3.f9558q);
                                j8 = jA;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (iB == 1) {
                        iB = 0;
                    } else if (((sa.a) this.f9569d).a() != -1) {
                        this.f9572g.f17167a = ((sa.a) this.f9569d).a();
                    }
                    ha.f.a(this.f9568c);
                } catch (Throwable th4) {
                    if (iB != 1 && ((sa.a) this.f9569d).a() != -1) {
                        this.f9572g.f17167a = ((sa.a) this.f9569d).a();
                    }
                    ha.f.a(this.f9568c);
                    throw th4;
                }
            }
        }
    }

    public interface b {
    }

    public final class c implements sa.n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9580a;

        public c(int i14) {
            this.f9580a = i14;
        }

        @Override // sa.n
        public final int a(a0 a0Var, DecoderInputBuffer decoderInputBuffer, int i14) {
            o oVar = o.this;
            if (oVar.t()) {
                return -3;
            }
            int i15 = this.f9580a;
            oVar.o(i15);
            int iV = oVar.f9562w[i15].v(a0Var, decoderInputBuffer, i14, oVar.K0);
            if (iV == -3) {
                oVar.p(i15);
            }
            return iV;
        }

        @Override // sa.n
        public final boolean isReady() {
            o oVar = o.this;
            return !oVar.t() && oVar.f9562w[this.f9580a].r(oVar.K0);
        }

        @Override // sa.n
        public final void maybeThrowError() throws IOException {
            int i14 = this.f9580a;
            o oVar = o.this;
            r rVar = oVar.f9562w[i14];
            DrmSession drmSession = rVar.f9626h;
            if (drmSession != null && drmSession.getState() == 1) {
                DrmSession.DrmSessionException error = rVar.f9626h.getError();
                error.getClass();
                throw error;
            }
            Loader loader = oVar.f9554m;
            int minimumLoadableRetryCount = oVar.f9544d.getMinimumLoadableRetryCount(oVar.I);
            IOException iOException = loader.f9702c;
            if (iOException != null) {
                throw iOException;
            }
            Loader.d<? extends Loader.e> dVar = loader.f9701b;
            if (dVar != null) {
                if (minimumLoadableRetryCount == Integer.MIN_VALUE) {
                    minimumLoadableRetryCount = dVar.f9705a;
                }
                IOException iOException2 = dVar.f9709e;
                if (iOException2 != null && dVar.f9710f > minimumLoadableRetryCount) {
                    throw iOException2;
                }
            }
        }

        @Override // sa.n
        public final int skipData(long j8) throws Throwable {
            o oVar = o.this;
            if (oVar.t()) {
                return 0;
            }
            int i14 = this.f9580a;
            oVar.o(i14);
            r rVar = oVar.f9562w[i14];
            int iP = rVar.p(j8, oVar.K0);
            rVar.z(iP);
            if (iP == 0) {
                oVar.p(i14);
            }
            return iP;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f9582a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f9583b;

        public d(int i14, boolean z14) {
            this.f9582a = i14;
            this.f9583b = z14;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f9582a == dVar.f9582a && this.f9583b == dVar.f9583b) {
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return (this.f9582a * 31) + (this.f9583b ? 1 : 0);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final sa.r f9584a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f9585b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean[] f9586c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean[] f9587d;

        public e(sa.r rVar, boolean[] zArr) {
            this.f9584a = rVar;
            this.f9585b = zArr;
            int i14 = rVar.f158153a;
            this.f9586c = new boolean[i14];
            this.f9587d = new boolean[i14];
        }
    }

    static {
        HashMap map = new HashMap();
        map.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
        M0 = Collections.unmodifiableMap(map);
        androidx.media3.common.q.b bVar = new androidx.media3.common.q.b();
        bVar.f8399a = "icy";
        bVar.f8411m = androidx.media3.common.x.n(MimeTypes.APPLICATION_ICY);
        N0 = bVar.a();
    }

    public o(Uri uri, ha.d dVar, n nVar, androidx.media3.exoplayer.drm.c cVar, androidx.media3.exoplayer.drm.b.a aVar, androidx.media3.exoplayer.upstream.b bVar, k.a aVar2, b bVar2, xa.b bVar3, String str, int i14, boolean z14, long j8, ya.b bVar4) {
        this.f9541a = uri;
        this.f9542b = dVar;
        this.f9543c = cVar;
        this.f9546f = aVar;
        this.f9544d = bVar;
        this.f9545e = aVar2;
        this.f9547g = bVar2;
        this.f9548h = bVar3;
        this.f9549i = str;
        this.f9550j = i14;
        this.f9551k = z14;
        this.f9554m = bVar4 != null ? new Loader(bVar4) : new Loader("ProgressiveMediaPeriod");
        this.f9555n = nVar;
        this.f9553l = j8;
        this.f9556o = new fa.f();
        this.f9557p = new sa.l(this, 1);
        this.f9558q = new sa.l(this, 2);
        this.f9559r = z.m(null);
        this.f9563x = new d[0];
        this.f9562w = new r[0];
        this.H0 = C.TIME_UNSET;
        this.I = 1;
    }

    @Override // bb.p
    public final void a(g0 g0Var) {
        this.f9559r.post(new r0.h(12, this, g0Var));
    }

    @Override // androidx.media3.exoplayer.source.r.d
    public final void b() {
        this.f9559r.post(this.f9557p);
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void c(i.a aVar, long j8) {
        this.f9560t = aVar;
        this.f9556o.a();
        s();
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long d(wa.g[] gVarArr, boolean[] zArr, sa.n[] nVarArr, boolean[] zArr2, long j8) {
        wa.g gVar;
        h();
        e eVar = this.C;
        sa.r rVar = eVar.f9584a;
        boolean[] zArr3 = eVar.f9586c;
        int i14 = this.Y;
        int i15 = 0;
        for (int i16 = 0; i16 < gVarArr.length; i16++) {
            sa.n nVar = nVarArr[i16];
            if (nVar != null && (gVarArr[i16] == null || !zArr[i16])) {
                int i17 = ((c) nVar).f9580a;
                fa.a.d(zArr3[i17]);
                this.Y--;
                zArr3[i17] = false;
                nVarArr[i16] = null;
            }
        }
        boolean z14 = !this.P ? j8 == 0 || this.B : i14 != 0;
        for (int i18 = 0; i18 < gVarArr.length; i18++) {
            if (nVarArr[i18] == null && (gVar = gVarArr[i18]) != null) {
                fa.a.d(gVar.length() == 1);
                fa.a.d(gVar.getIndexInTrackGroup(0) == 0);
                int iB = rVar.b(gVar.getTrackGroup());
                fa.a.d(!zArr3[iB]);
                this.Y++;
                zArr3[iB] = true;
                this.X = gVar.getSelectedFormat().f8392t | this.X;
                nVarArr[i18] = new c(iB);
                zArr2[i18] = true;
                if (!z14) {
                    r rVar2 = this.f9562w[iB];
                    z14 = (rVar2.n() == 0 || rVar2.y(j8, true)) ? false : true;
                }
            }
        }
        if (this.Y == 0) {
            this.I0 = false;
            this.T = false;
            this.X = false;
            Loader loader = this.f9554m;
            if (loader.c()) {
                r[] rVarArr = this.f9562w;
                int length = rVarArr.length;
                while (i15 < length) {
                    rVarArr[i15].i();
                    i15++;
                }
                loader.a();
            } else {
                this.K0 = false;
                for (r rVar3 : this.f9562w) {
                    rVar3.w(false);
                }
            }
        } else if (z14) {
            j8 = seekToUs(j8);
            while (i15 < nVarArr.length) {
                if (nVarArr[i15] != null) {
                    zArr2[i15] = true;
                }
                i15++;
            }
        }
        this.P = true;
        return j8;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void discardBuffer(long j8, boolean z14) throws Throwable {
        if (this.B) {
            return;
        }
        h();
        if (m()) {
            return;
        }
        boolean[] zArr = this.C.f9586c;
        int length = this.f9562w.length;
        for (int i14 = 0; i14 < length; i14++) {
            this.f9562w[i14].h(j8, z14, zArr[i14]);
        }
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long e(long j8, x0 x0Var) {
        h();
        if (!this.D.isSeekable()) {
            return 0L;
        }
        g0.a seekPoints = this.D.getSeekPoints(j8);
        return x0Var.a(j8, seekPoints.f17174a.f17186a, seekPoints.f17175b.f17186a);
    }

    @Override // bb.p
    public final void endTracks() {
        this.f9564y = true;
        this.f9559r.post(this.f9557p);
    }

    @Override // androidx.media3.exoplayer.source.s
    public final boolean f(d0 d0Var) {
        if (this.K0) {
            return false;
        }
        Loader loader = this.f9554m;
        if (loader.f9702c != null || this.I0) {
            return false;
        }
        if (this.f9565z && this.Y == 0) {
            return false;
        }
        boolean zA = this.f9556o.a();
        if (loader.c()) {
            return zA;
        }
        s();
        return true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final void g(Loader.e eVar, long j8, long j14) {
        g0 g0Var;
        a aVar = (a) eVar;
        if (this.E == C.TIME_UNSET && (g0Var = this.D) != null) {
            boolean zIsSeekable = g0Var.isSeekable();
            long jK = k(true);
            long j15 = jK == Long.MIN_VALUE ? 0L : jK + AbstractComponentTracker.LINGERING_TIMEOUT;
            this.E = j15;
            ((p) this.f9547g).t(j15, zIsSeekable, this.F);
        }
        ha.m mVar = aVar.f9568c;
        sa.i iVar = new sa.i(aVar.f9566a, aVar.f9576k, mVar.f82618c, mVar.f82619d, j8, j14, mVar.f82617b);
        this.f9544d.getClass();
        this.f9545e.c(iVar, 1, -1, null, 0, null, aVar.f9575j, this.E);
        this.K0 = true;
        i.a aVar2 = this.f9560t;
        aVar2.getClass();
        aVar2.b(this);
    }

    @Override // androidx.media3.exoplayer.source.s
    public final long getBufferedPositionUs() {
        long jK;
        boolean z14;
        long j8;
        h();
        if (this.K0 || this.Y == 0) {
            return Long.MIN_VALUE;
        }
        if (m()) {
            return this.H0;
        }
        if (this.A) {
            int length = this.f9562w.length;
            jK = Long.MAX_VALUE;
            for (int i14 = 0; i14 < length; i14++) {
                e eVar = this.C;
                if (eVar.f9585b[i14] && eVar.f9586c[i14]) {
                    r rVar = this.f9562w[i14];
                    synchronized (rVar) {
                        z14 = rVar.f9641w;
                    }
                    if (z14) {
                        continue;
                    } else {
                        r rVar2 = this.f9562w[i14];
                        synchronized (rVar2) {
                            j8 = rVar2.f9640v;
                        }
                        jK = Math.min(jK, j8);
                    }
                }
            }
        } else {
            jK = Long.MAX_VALUE;
        }
        if (jK == Long.MAX_VALUE) {
            jK = k(false);
        }
        return jK == Long.MIN_VALUE ? this.f9552k0 : jK;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // androidx.media3.exoplayer.source.i
    public final sa.r getTrackGroups() {
        h();
        return this.C.f9584a;
    }

    public final void h() {
        fa.a.d(this.f9565z);
        this.C.getClass();
        this.D.getClass();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final Loader.c i(Loader.e eVar, long j8, long j14, IOException iOException, int i14) {
        Loader.c cVarB;
        g0 g0Var;
        a aVar = (a) eVar;
        ha.m mVar = aVar.f9568c;
        sa.i iVar = new sa.i(aVar.f9566a, aVar.f9576k, mVar.f82618c, mVar.f82619d, j8, j14, mVar.f82617b);
        long jB = this.f9544d.b(new androidx.media3.exoplayer.upstream.b.c(iVar, new sa.j(1, -1, null, 0, null, z.Y(aVar.f9575j), z.Y(this.E)), iOException, i14));
        if (jB == C.TIME_UNSET) {
            cVarB = Loader.f9699f;
        } else {
            int iJ = j();
            boolean z14 = iJ > this.J0;
            if (this.Z || !((g0Var = this.D) == null || g0Var.getDurationUs() == C.TIME_UNSET)) {
                this.J0 = iJ;
            } else if (!this.f9565z || t()) {
                this.T = this.f9565z;
                this.f9552k0 = 0L;
                this.J0 = 0;
                for (r rVar : this.f9562w) {
                    rVar.w(false);
                }
                aVar.f9572g.f17167a = 0L;
                aVar.f9575j = 0L;
                aVar.f9574i = true;
                aVar.f9578m = false;
            } else {
                this.I0 = true;
                cVarB = Loader.f9698e;
            }
            cVarB = Loader.b(jB, z14);
        }
        int i15 = cVarB.f9703a;
        this.f9545e.d(iVar, 1, -1, null, 0, null, aVar.f9575j, this.E, iOException, !(i15 == 0 || i15 == 1));
        return cVarB;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final boolean isLoading() {
        boolean z14;
        if (!this.f9554m.c()) {
            return false;
        }
        fa.f fVar = this.f9556o;
        synchronized (fVar) {
            z14 = fVar.f70013b;
        }
        return z14;
    }

    public final int j() {
        int i14 = 0;
        for (r rVar : this.f9562w) {
            i14 += rVar.f9635q + rVar.f9634p;
        }
        return i14;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x001a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0015  */
    public final long k(boolean z14) {
        r rVar;
        long jMax = Long.MIN_VALUE;
        for (int i14 = 0; i14 < this.f9562w.length; i14++) {
            if (z14) {
                rVar = this.f9562w[i14];
                synchronized (rVar) {
                    jMax = Math.max(jMax, rVar.f9640v);
                }
            } else {
                e eVar = this.C;
                eVar.getClass();
                if (eVar.f9586c[i14]) {
                    rVar = this.f9562w[i14];
                    synchronized (rVar) {
                    }
                    jMax = Math.max(jMax, rVar.f9640v);
                } else {
                    continue;
                }
            }
        }
        return jMax;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    public final void l(Loader.e eVar, long j8, long j14, boolean z14) {
        a aVar = (a) eVar;
        ha.m mVar = aVar.f9568c;
        sa.i iVar = new sa.i(aVar.f9566a, aVar.f9576k, mVar.f82618c, mVar.f82619d, j8, j14, mVar.f82617b);
        this.f9544d.getClass();
        this.f9545e.b(iVar, 1, -1, null, 0, null, aVar.f9575j, this.E);
        if (z14) {
            return;
        }
        for (r rVar : this.f9562w) {
            rVar.w(false);
        }
        if (this.Y > 0) {
            i.a aVar2 = this.f9560t;
            aVar2.getClass();
            aVar2.b(this);
        }
    }

    public final boolean m() {
        return this.H0 != C.TIME_UNSET;
    }

    @Override // androidx.media3.exoplayer.source.i
    public final void maybeThrowPrepareError() throws IOException {
        try {
            Loader loader = this.f9554m;
            int minimumLoadableRetryCount = this.f9544d.getMinimumLoadableRetryCount(this.I);
            IOException iOException = loader.f9702c;
            if (iOException != null) {
                throw iOException;
            }
            Loader.d<? extends Loader.e> dVar = loader.f9701b;
            if (dVar != null) {
                if (minimumLoadableRetryCount == Integer.MIN_VALUE) {
                    minimumLoadableRetryCount = dVar.f9705a;
                }
                IOException iOException2 = dVar.f9709e;
                if (iOException2 != null && dVar.f9710f > minimumLoadableRetryCount) {
                    throw iOException2;
                }
            }
            if (this.K0 && !this.f9565z) {
                throw ParserException.createForMalformedContainer("Loading finished before preparation is complete.", null);
            }
        } catch (IOException e4) {
            if (!this.f9551k) {
                throw e4;
            }
            fa.k.d("Suppressing preparation error because suppressPrepareError=true", e4);
            this.f9564y = true;
            r(new g0.b(C.TIME_UNSET));
        }
    }

    public final void n() {
        long j8 = this.f9553l;
        if (this.L0 || this.f9565z || !this.f9564y || this.D == null) {
            return;
        }
        for (r rVar : this.f9562w) {
            if (rVar.q() == null) {
                return;
            }
        }
        fa.f fVar = this.f9556o;
        synchronized (fVar) {
            fVar.f70013b = false;
        }
        int length = this.f9562w.length;
        e0[] e0VarArr = new e0[length];
        boolean[] zArr = new boolean[length];
        for (int i14 = 0; i14 < length; i14++) {
            androidx.media3.common.q qVarQ = this.f9562w[i14].q();
            qVarQ.getClass();
            String str = qVarQ.f8386n;
            boolean zJ = androidx.media3.common.x.j(str);
            boolean z14 = zJ || androidx.media3.common.x.m(str);
            zArr[i14] = z14;
            this.A = z14 | this.A;
            this.B = j8 != C.TIME_UNSET && length == 1 && androidx.media3.common.x.k(str);
            ob.b bVar = this.f9561v;
            if (bVar != null) {
                int i15 = bVar.f131091a;
                if (zJ || this.f9563x[i14].f9583b) {
                    androidx.media3.common.w wVar = qVarQ.f8384l;
                    androidx.media3.common.w wVar2 = wVar == null ? new androidx.media3.common.w(bVar) : wVar.b(bVar);
                    androidx.media3.common.q.b bVarA = qVarQ.a();
                    bVarA.f8409k = wVar2;
                    qVarQ = bVarA.a();
                }
                if (zJ && qVarQ.f8380h == -1 && qVarQ.f8381i == -1 && i15 != -1) {
                    androidx.media3.common.q.b bVarA2 = qVarQ.a();
                    bVarA2.f8406h = i15;
                    qVarQ = bVarA2.a();
                }
            }
            int iA = this.f9543c.a(qVarQ);
            androidx.media3.common.q.b bVarA3 = qVarQ.a();
            bVarA3.K = iA;
            androidx.media3.common.q qVarA = bVarA3.a();
            e0VarArr[i14] = new e0(Integer.toString(i14), qVarA);
            this.X = qVarA.f8392t | this.X;
        }
        this.C = new e(new sa.r(e0VarArr), zArr);
        if (this.B && this.E == C.TIME_UNSET) {
            this.E = j8;
            this.D = new sa.m(this, this.D);
        }
        ((p) this.f9547g).t(this.E, this.D.isSeekable(), this.F);
        this.f9565z = true;
        i.a aVar = this.f9560t;
        aVar.getClass();
        aVar.a(this);
    }

    public final void o(int i14) {
        h();
        e eVar = this.C;
        boolean[] zArr = eVar.f9587d;
        if (zArr[i14]) {
            return;
        }
        androidx.media3.common.q qVar = eVar.f9584a.a(i14).f8217d[0];
        int iH = androidx.media3.common.x.h(qVar.f8386n);
        long j8 = this.f9552k0;
        k.a aVar = this.f9545e;
        aVar.getClass();
        aVar.a(new b0(12, aVar, new sa.j(1, iH, qVar, 0, null, z.Y(j8), C.TIME_UNSET)));
        zArr[i14] = true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.f
    public final void onLoaderReleased() {
        for (r rVar : this.f9562w) {
            rVar.w(true);
            DrmSession drmSession = rVar.f9626h;
            if (drmSession != null) {
                drmSession.a(rVar.f9623e);
                rVar.f9626h = null;
                rVar.f9625g = null;
            }
        }
        sa.a aVar = (sa.a) this.f9555n;
        bb.n nVar = aVar.f158103b;
        if (nVar != null) {
            nVar.release();
            aVar.f158103b = null;
        }
        aVar.f158104c = null;
    }

    public final void p(int i14) {
        h();
        boolean[] zArr = this.C.f9585b;
        if (this.I0 && zArr[i14] && !this.f9562w[i14].r(false)) {
            this.H0 = 0L;
            this.I0 = false;
            this.T = true;
            this.f9552k0 = 0L;
            this.J0 = 0;
            for (r rVar : this.f9562w) {
                rVar.w(false);
            }
            i.a aVar = this.f9560t;
            aVar.getClass();
            aVar.b(this);
        }
    }

    public final l0 q(d dVar) {
        int length = this.f9562w.length;
        for (int i14 = 0; i14 < length; i14++) {
            if (dVar.equals(this.f9563x[i14])) {
                return this.f9562w[i14];
            }
        }
        if (this.f9564y) {
            fa.k.g("Extractor added new track (id=" + dVar.f9582a + ") after finishing tracks.");
            return new bb.k();
        }
        androidx.media3.exoplayer.drm.c cVar = this.f9543c;
        cVar.getClass();
        androidx.media3.exoplayer.drm.b.a aVar = this.f9546f;
        aVar.getClass();
        r rVar = new r(this.f9548h, cVar, aVar);
        rVar.f9624f = this;
        int i15 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f9563x, i15);
        dVarArr[length] = dVar;
        int i16 = z.f70071a;
        this.f9563x = dVarArr;
        r[] rVarArr = (r[]) Arrays.copyOf(this.f9562w, i15);
        rVarArr[length] = rVar;
        this.f9562w = rVarArr;
        return rVar;
    }

    public final void r(g0 g0Var) {
        this.D = this.f9561v == null ? g0Var : new g0.b(C.TIME_UNSET);
        this.E = g0Var.getDurationUs();
        boolean z14 = !this.Z && g0Var.getDurationUs() == C.TIME_UNSET;
        this.F = z14;
        this.I = z14 ? 7 : 1;
        if (this.f9565z) {
            ((p) this.f9547g).t(this.E, g0Var.isSeekable(), this.F);
        } else {
            n();
        }
    }

    @Override // androidx.media3.exoplayer.source.i
    public final long readDiscontinuity() {
        if (this.X) {
            this.X = false;
            return this.f9552k0;
        }
        if (!this.T) {
            return C.TIME_UNSET;
        }
        if (!this.K0 && j() <= this.J0) {
            return C.TIME_UNSET;
        }
        this.T = false;
        return this.f9552k0;
    }

    @Override // androidx.media3.exoplayer.source.s
    public final void reevaluateBuffer(long j8) {
    }

    public final void s() {
        a aVar = new a(this.f9541a, this.f9542b, this.f9555n, this, this.f9556o);
        if (this.f9565z) {
            fa.a.d(m());
            long j8 = this.E;
            if (j8 != C.TIME_UNSET && this.H0 > j8) {
                this.K0 = true;
                this.H0 = C.TIME_UNSET;
                return;
            }
            g0 g0Var = this.D;
            g0Var.getClass();
            long j14 = g0Var.getSeekPoints(this.H0).f17174a.f17187b;
            long j15 = this.H0;
            aVar.f9572g.f17167a = j14;
            aVar.f9575j = j15;
            aVar.f9574i = true;
            aVar.f9578m = false;
            for (r rVar : this.f9562w) {
                rVar.f9638t = this.H0;
            }
            this.H0 = C.TIME_UNSET;
        }
        this.J0 = j();
        this.f9545e.f(new sa.i(aVar.f9566a, aVar.f9576k, this.f9554m.e(aVar, this, this.f9544d.getMinimumLoadableRetryCount(this.I))), 1, -1, null, 0, null, aVar.f9575j, this.E);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0082 A[LOOP:1: B:42:0x0080->B:43:0x0082, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:46:0x008e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097 A[LOOP:2: B:47:0x0095->B:48:0x0097, LOOP_END] */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x007d, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:46:0x008e, please report this as an issue */
    @Override // androidx.media3.exoplayer.source.i
    public final long seekToUs(long j8) {
        int i14;
        h();
        boolean[] zArr = this.C.f9585b;
        if (!this.D.isSeekable()) {
            j8 = 0;
        }
        this.T = false;
        boolean z14 = true;
        boolean z15 = this.f9552k0 == j8;
        this.f9552k0 = j8;
        if (m()) {
            this.H0 = j8;
            return j8;
        }
        int i15 = this.I;
        Loader loader = this.f9554m;
        if (i15 == 7 || !(this.K0 || loader.c())) {
            this.I0 = false;
            this.H0 = j8;
            this.K0 = false;
            this.X = false;
            if (loader.c()) {
                for (r rVar : this.f9562w) {
                    rVar.i();
                }
                loader.a();
                return j8;
            }
            loader.f9702c = null;
            for (r rVar2 : this.f9562w) {
                rVar2.w(false);
            }
        } else {
            int length = this.f9562w.length;
            for (int i16 = 0; i16 < length; i16++) {
                r rVar3 = this.f9562w[i16];
                if (rVar3.n() != 0 || !z15) {
                    if (!(this.B ? rVar3.x(rVar3.f9635q) : rVar3.y(j8, false)) && (zArr[i16] || !this.A)) {
                        z14 = false;
                        break;
                    }
                }
            }
            if (!z14) {
                this.I0 = false;
                this.H0 = j8;
                this.K0 = false;
                this.X = false;
                if (loader.c()) {
                    while (i < r2) {
                        rVar.i();
                    }
                    loader.a();
                    return j8;
                }
                loader.f9702c = null;
                while (i14 < r2) {
                    rVar2.w(false);
                }
            }
        }
        return j8;
    }

    public final boolean t() {
        return this.T || m();
    }

    @Override // bb.p
    public final l0 track(int i14, int i15) {
        return q(new d(i14, false));
    }
}
