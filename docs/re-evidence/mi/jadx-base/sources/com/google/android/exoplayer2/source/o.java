package com.google.android.exoplayer2.source;

import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.exoplayer2.upstream.Loader;
import defpackage.a1a;
import defpackage.arl;
import defpackage.ayf;
import defpackage.brl;
import defpackage.g83;
import defpackage.jdo;
import defpackage.k9l;
import defpackage.kb4;
import defpackage.kl8;
import defpackage.ljf;
import defpackage.mie;
import defpackage.okh;
import defpackage.r4i;
import defpackage.r61;
import defpackage.rk1;
import defpackage.snp;
import defpackage.wlq;
import defpackage.zm5;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class o implements j, kl8, Loader.b<a>, Loader.f, r.d {
    public static final Map<String, String> M = K();
    public static final Format N = new Format.b().S("icy").e0("application/x-icy").E();
    public boolean A;
    public boolean C;
    public boolean D;
    public int E;
    public long G;
    public boolean I;
    public int J;
    public boolean K;
    public boolean L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f8183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.google.android.exoplayer2.upstream.a f8184b;
    public final com.google.android.exoplayer2.drm.c c;
    public final com.google.android.exoplayer2.upstream.h d;
    public final l.a e;
    public final com.google.android.exoplayer2.drm.b.a f;
    public final b g;
    public final r61 h;
    public final String i;
    public final long j;
    public final n l;
    public j.a q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public IcyHeaders f8186r;
    public boolean u;
    public boolean v;
    public boolean w;
    public e x;
    public arl y;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Loader f8185k = new Loader("ProgressiveMediaPeriod");
    public final kb4 m = new kb4();
    public final Runnable n = new Runnable() { // from class: mci
        @Override // java.lang.Runnable
        public final void run() {
            this.f26009a.S();
        }
    };
    public final Runnable o = new Runnable() { // from class: nci
        @Override // java.lang.Runnable
        public final void run() {
            this.f27780a.Q();
        }
    };
    public final Handler p = wlq.x();
    public d[] t = new d[0];
    public r[] s = new r[0];
    public long H = -9223372036854775807L;
    public long F = -1;
    public long z = -9223372036854775807L;
    public int B = 1;

    public final class a implements Loader.e, f.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Uri f8188b;
        public final jdo c;
        public final n d;
        public final kl8 e;
        public final kb4 f;
        public volatile boolean h;
        public long j;
        public snp m;
        public boolean n;
        public final r4i g = new r4i();
        public boolean i = true;
        public long l = -1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f8187a = mie.a();

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public com.google.android.exoplayer2.upstream.b f8189k = i(0);

        public a(Uri uri, com.google.android.exoplayer2.upstream.a aVar, n nVar, kl8 kl8Var, kb4 kb4Var) {
            this.f8188b = uri;
            this.c = new jdo(aVar);
            this.d = nVar;
            this.e = kl8Var;
            this.f = kb4Var;
        }

        @Override // com.google.android.exoplayer2.source.f.a
        public void a(okh okhVar) {
            long jMax = !this.n ? this.j : Math.max(o.this.M(), this.j);
            int iA = okhVar.a();
            snp snpVar = (snp) rk1.e(this.m);
            snpVar.d(okhVar, iA);
            snpVar.e(jMax, 1, iA, 0, null);
            this.n = true;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void b() {
            this.h = true;
        }

        public final com.google.android.exoplayer2.upstream.b i(long j) {
            return new com.google.android.exoplayer2.upstream.b.C0206b().i(this.f8188b).h(j).f(o.this.i).b(6).e(o.M).a();
        }

        public final void j(long j, long j2) {
            this.g.f32179a = j;
            this.j = j2;
            this.i = true;
            this.n = false;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void load() throws IOException {
            int iE = 0;
            while (iE == 0 && !this.h) {
                try {
                    long j = this.g.f32179a;
                    com.google.android.exoplayer2.upstream.b bVarI = i(j);
                    this.f8189k = bVarI;
                    long jB = this.c.b(bVarI);
                    this.l = jB;
                    if (jB != -1) {
                        this.l = jB + j;
                    }
                    o.this.f8186r = IcyHeaders.a(this.c.d());
                    zm5 fVar = this.c;
                    if (o.this.f8186r != null && o.this.f8186r.f != -1) {
                        fVar = new f(this.c, o.this.f8186r.f, this);
                        snp snpVarN = o.this.N();
                        this.m = snpVarN;
                        snpVarN.b(o.N);
                    }
                    long jB2 = j;
                    this.d.d(fVar, this.f8188b, this.c.d(), j, this.l, this.e);
                    if (o.this.f8186r != null) {
                        this.d.c();
                    }
                    if (this.i) {
                        this.d.a(jB2, this.j);
                        this.i = false;
                    }
                    while (true) {
                        long j2 = jB2;
                        while (true) {
                            if (iE != 0 || this.h) {
                                break;
                            }
                            try {
                                this.f.a();
                                iE = this.d.e(this.g);
                                jB2 = this.d.b();
                                if (jB2 > o.this.j + j2) {
                                    this.f.c();
                                    o.this.p.post(o.this.o);
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                    }
                    if (iE == 1) {
                        iE = 0;
                    } else if (this.d.b() != -1) {
                        this.g.f32179a = this.d.b();
                    }
                    wlq.n(this.c);
                } catch (Throwable th) {
                    if (iE != 1 && this.d.b() != -1) {
                        this.g.f32179a = this.d.b();
                    }
                    wlq.n(this.c);
                    throw th;
                }
            }
        }
    }

    public interface b {
        void m(long j, boolean z, boolean z2);
    }

    public final class c implements k9l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8190a;

        public c(int i) {
            this.f8190a = i;
        }

        @Override // defpackage.k9l
        public void a() throws IOException {
            o.this.W(this.f8190a);
        }

        @Override // defpackage.k9l
        public int d(a1a a1aVar, DecoderInputBuffer decoderInputBuffer, int i) {
            return o.this.b0(this.f8190a, a1aVar, decoderInputBuffer, i);
        }

        @Override // defpackage.k9l
        public boolean isReady() {
            return o.this.P(this.f8190a);
        }

        @Override // defpackage.k9l
        public int k(long j) {
            return o.this.f0(this.f8190a, j);
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f8192a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f8193b;

        public d(int i, boolean z) {
            this.f8192a = i;
            this.f8193b = z;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f8192a == dVar.f8192a && this.f8193b == dVar.f8193b;
        }

        public int hashCode() {
            return (this.f8192a * 31) + (this.f8193b ? 1 : 0);
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TrackGroupArray f8194a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean[] f8195b;
        public final boolean[] c;
        public final boolean[] d;

        public e(TrackGroupArray trackGroupArray, boolean[] zArr) {
            this.f8194a = trackGroupArray;
            this.f8195b = zArr;
            int i = trackGroupArray.f8078a;
            this.c = new boolean[i];
            this.d = new boolean[i];
        }
    }

    public o(Uri uri, com.google.android.exoplayer2.upstream.a aVar, n nVar, com.google.android.exoplayer2.drm.c cVar, com.google.android.exoplayer2.drm.b.a aVar2, com.google.android.exoplayer2.upstream.h hVar, l.a aVar3, b bVar, r61 r61Var, String str, int i) {
        this.f8183a = uri;
        this.f8184b = aVar;
        this.c = cVar;
        this.f = aVar2;
        this.d = hVar;
        this.e = aVar3;
        this.g = bVar;
        this.h = r61Var;
        this.i = str;
        this.j = i;
        this.l = nVar;
    }

    public static Map<String, String> K() {
        HashMap map = new HashMap();
        map.put(IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_NAME, "1");
        return Collections.unmodifiableMap(map);
    }

    private boolean O() {
        return this.H != -9223372036854775807L;
    }

    public final void H() {
        rk1.g(this.v);
        rk1.e(this.x);
        rk1.e(this.y);
    }

    public final boolean I(a aVar, int i) {
        arl arlVar;
        if (this.F != -1 || ((arlVar = this.y) != null && arlVar.i() != -9223372036854775807L)) {
            this.J = i;
            return true;
        }
        if (this.v && !h0()) {
            this.I = true;
            return false;
        }
        this.D = this.v;
        this.G = 0L;
        this.J = 0;
        for (r rVar : this.s) {
            rVar.V();
        }
        aVar.j(0L, 0L);
        return true;
    }

    public final void J(a aVar) {
        if (this.F == -1) {
            this.F = aVar.l;
        }
    }

    public final int L() {
        int iG = 0;
        for (r rVar : this.s) {
            iG += rVar.G();
        }
        return iG;
    }

    public final long M() {
        long jMax = Long.MIN_VALUE;
        for (r rVar : this.s) {
            jMax = Math.max(jMax, rVar.z());
        }
        return jMax;
    }

    public snp N() {
        return a0(new d(0, true));
    }

    public boolean P(int i) {
        return !h0() && this.s[i].K(this.K);
    }

    public final /* synthetic */ void Q() {
        if (this.L) {
            return;
        }
        ((j.a) rk1.e(this.q)).k(this);
    }

    public final void S() {
        if (this.L || this.v || !this.u || this.y == null) {
            return;
        }
        for (r rVar : this.s) {
            if (rVar.F() == null) {
                return;
            }
        }
        this.m.c();
        int length = this.s.length;
        TrackGroup[] trackGroupArr = new TrackGroup[length];
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            Format formatE = (Format) rk1.e(this.s[i].F());
            String str = formatE.l;
            boolean zP = ayf.p(str);
            boolean z = zP || ayf.s(str);
            zArr[i] = z;
            this.w = z | this.w;
            IcyHeaders icyHeaders = this.f8186r;
            if (icyHeaders != null) {
                if (zP || this.t[i].f8193b) {
                    Metadata metadata = formatE.j;
                    formatE = formatE.a().X(metadata == null ? new Metadata(icyHeaders) : metadata.a(icyHeaders)).E();
                }
                if (zP && formatE.f == -1 && formatE.g == -1 && icyHeaders.f7995a != -1) {
                    formatE = formatE.a().G(icyHeaders.f7995a).E();
                }
            }
            trackGroupArr[i] = new TrackGroup(formatE.c(this.c.c(formatE)));
        }
        this.x = new e(new TrackGroupArray(trackGroupArr), zArr);
        this.v = true;
        ((j.a) rk1.e(this.q)).o(this);
    }

    public final void T(int i) {
        H();
        e eVar = this.x;
        boolean[] zArr = eVar.d;
        if (zArr[i]) {
            return;
        }
        Format formatA = eVar.f8194a.a(i).a(0);
        this.e.i(ayf.l(formatA.l), formatA, 0, null, this.G);
        zArr[i] = true;
    }

    public final void U(int i) {
        H();
        boolean[] zArr = this.x.f8195b;
        if (this.I && zArr[i]) {
            if (this.s[i].K(false)) {
                return;
            }
            this.H = 0L;
            this.I = false;
            this.D = true;
            this.G = 0L;
            this.J = 0;
            for (r rVar : this.s) {
                rVar.V();
            }
            ((j.a) rk1.e(this.q)).k(this);
        }
    }

    public void V() throws IOException {
        this.f8185k.k(this.d.e(this.B));
    }

    public void W(int i) throws IOException {
        this.s[i].N();
        V();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public void o(a aVar, long j, long j2, boolean z) {
        jdo jdoVar = aVar.c;
        mie mieVar = new mie(aVar.f8187a, aVar.f8189k, jdoVar.s(), jdoVar.t(), j, j2, jdoVar.r());
        this.d.d(aVar.f8187a);
        this.e.r(mieVar, 1, -1, null, 0, null, aVar.j, this.z);
        if (z) {
            return;
        }
        J(aVar);
        for (r rVar : this.s) {
            rVar.V();
        }
        if (this.E > 0) {
            ((j.a) rk1.e(this.q)).k(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public void q(a aVar, long j, long j2) {
        arl arlVar;
        if (this.z == -9223372036854775807L && (arlVar = this.y) != null) {
            boolean zE = arlVar.e();
            long jM = M();
            long j3 = jM == Long.MIN_VALUE ? 0L : jM + 10000;
            this.z = j3;
            this.g.m(j3, zE, this.A);
        }
        jdo jdoVar = aVar.c;
        mie mieVar = new mie(aVar.f8187a, aVar.f8189k, jdoVar.s(), jdoVar.t(), j, j2, jdoVar.r());
        this.d.d(aVar.f8187a);
        this.e.u(mieVar, 1, -1, null, 0, null, aVar.j, this.z);
        J(aVar);
        this.K = true;
        ((j.a) rk1.e(this.q)).k(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public Loader.c s(a aVar, long j, long j2, IOException iOException, int i) {
        Loader.c cVarH;
        J(aVar);
        jdo jdoVar = aVar.c;
        mie mieVar = new mie(aVar.f8187a, aVar.f8189k, jdoVar.s(), jdoVar.t(), j, j2, jdoVar.r());
        long jA = this.d.a(new com.google.android.exoplayer2.upstream.h.a(mieVar, new ljf(1, -1, null, 0, null, g83.d(aVar.j), g83.d(this.z)), iOException, i));
        if (jA == -9223372036854775807L) {
            cVarH = Loader.g;
        } else {
            int iL = L();
            cVarH = I(aVar, iL) ? Loader.h(iL > this.J, jA) : Loader.f;
        }
        boolean z = !cVarH.c();
        this.e.w(mieVar, 1, -1, null, 0, null, aVar.j, this.z, iOException, z);
        if (z) {
            this.d.d(aVar.f8187a);
        }
        return cVarH;
    }

    @Override // com.google.android.exoplayer2.source.r.d
    public void a(Format format) {
        this.p.post(this.n);
    }

    public final snp a0(d dVar) {
        int length = this.s.length;
        for (int i = 0; i < length; i++) {
            if (dVar.equals(this.t[i])) {
                return this.s[i];
            }
        }
        r rVarK = r.k(this.h, this.p.getLooper(), this.c, this.f);
        rVarK.d0(this);
        int i2 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.t, i2);
        dVarArr[length] = dVar;
        this.t = (d[]) wlq.k(dVarArr);
        r[] rVarArr = (r[]) Arrays.copyOf(this.s, i2);
        rVarArr[length] = rVarK;
        this.s = (r[]) wlq.k(rVarArr);
        return rVarK;
    }

    @Override // com.google.android.exoplayer2.source.j
    public long b(long j, brl brlVar) {
        H();
        if (!this.y.e()) {
            return 0L;
        }
        arl.a aVarD = this.y.d(j);
        return brlVar.a(j, aVarD.f3390a.f14648a, aVarD.f3391b.f14648a);
    }

    public int b0(int i, a1a a1aVar, DecoderInputBuffer decoderInputBuffer, int i2) {
        if (h0()) {
            return -3;
        }
        T(i);
        int iS = this.s[i].S(a1aVar, decoderInputBuffer, i2, this.K);
        if (iS == -3) {
            U(i);
        }
        return iS;
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public boolean c(long j) {
        if (this.K || this.f8185k.i() || this.I) {
            return false;
        }
        if (this.v && this.E == 0) {
            return false;
        }
        boolean zE = this.m.e();
        if (this.f8185k.j()) {
            return zE;
        }
        g0();
        return true;
    }

    public void c0() {
        if (this.v) {
            for (r rVar : this.s) {
                rVar.R();
            }
        }
        this.f8185k.m(this);
        this.p.removeCallbacksAndMessages(null);
        this.q = null;
        this.L = true;
    }

    @Override // defpackage.kl8
    public snp d(int i, int i2) {
        return a0(new d(i, false));
    }

    public final boolean d0(boolean[] zArr, long j) {
        int length = this.s.length;
        for (int i = 0; i < length; i++) {
            if (!this.s[i].Z(j, false) && (zArr[i] || !this.w)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public long e() {
        long jM;
        H();
        boolean[] zArr = this.x.f8195b;
        if (this.K) {
            return Long.MIN_VALUE;
        }
        if (O()) {
            return this.H;
        }
        if (this.w) {
            int length = this.s.length;
            jM = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                if (zArr[i] && !this.s[i].J()) {
                    jM = Math.min(jM, this.s[i].z());
                }
            }
        } else {
            jM = Long.MAX_VALUE;
        }
        if (jM == Long.MAX_VALUE) {
            jM = M();
        }
        return jM == Long.MIN_VALUE ? this.G : jM;
    }

    /* JADX INFO: renamed from: e0, reason: merged with bridge method [inline-methods] */
    public final void R(arl arlVar) {
        this.y = this.f8186r == null ? arlVar : new arl.b(-9223372036854775807L);
        this.z = arlVar.i();
        boolean z = this.F == -1 && arlVar.i() == -9223372036854775807L;
        this.A = z;
        this.B = z ? 7 : 1;
        this.g.m(this.z, arlVar.e(), this.A);
        if (this.v) {
            return;
        }
        S();
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public void f(long j) {
    }

    public int f0(int i, long j) {
        if (h0()) {
            return 0;
        }
        T(i);
        r rVar = this.s[i];
        int iE = rVar.E(j, this.K);
        rVar.e0(iE);
        if (iE == 0) {
            U(i);
        }
        return iE;
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public long g() {
        if (this.E == 0) {
            return Long.MIN_VALUE;
        }
        return e();
    }

    public final void g0() {
        a aVar = new a(this.f8183a, this.f8184b, this.l, this, this.m);
        if (this.v) {
            rk1.g(O());
            long j = this.z;
            if (j != -9223372036854775807L && this.H > j) {
                this.K = true;
                this.H = -9223372036854775807L;
                return;
            }
            aVar.j(((arl) rk1.e(this.y)).d(this.H).f3390a.f14649b, this.H);
            for (r rVar : this.s) {
                rVar.b0(this.H);
            }
            this.H = -9223372036854775807L;
        }
        this.J = L();
        this.e.A(new mie(aVar.f8187a, aVar.f8189k, this.f8185k.n(aVar, this, this.d.e(this.B))), 1, -1, null, 0, null, aVar.j, this.z);
    }

    @Override // com.google.android.exoplayer2.source.j, com.google.android.exoplayer2.source.s
    public boolean h() {
        return this.f8185k.j() && this.m.d();
    }

    public final boolean h0() {
        return this.D || O();
    }

    @Override // com.google.android.exoplayer2.source.j
    public long i(long j) {
        H();
        boolean[] zArr = this.x.f8195b;
        if (!this.y.e()) {
            j = 0;
        }
        int i = 0;
        this.D = false;
        this.G = j;
        if (O()) {
            this.H = j;
            return j;
        }
        if (this.B != 7 && d0(zArr, j)) {
            return j;
        }
        this.I = false;
        this.H = j;
        this.K = false;
        if (this.f8185k.j()) {
            r[] rVarArr = this.s;
            int length = rVarArr.length;
            while (i < length) {
                rVarArr[i].r();
                i++;
            }
            this.f8185k.f();
        } else {
            this.f8185k.g();
            r[] rVarArr2 = this.s;
            int length2 = rVarArr2.length;
            while (i < length2) {
                rVarArr2[i].V();
                i++;
            }
        }
        return j;
    }

    @Override // com.google.android.exoplayer2.source.j
    public long j() {
        if (!this.D) {
            return -9223372036854775807L;
        }
        if (!this.K && L() <= this.J) {
            return -9223372036854775807L;
        }
        this.D = false;
        return this.G;
    }

    @Override // defpackage.kl8
    public void k(final arl arlVar) {
        this.p.post(new Runnable() { // from class: oci
            @Override // java.lang.Runnable
            public final void run() {
                this.f29004a.R(arlVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void l() {
        for (r rVar : this.s) {
            rVar.T();
        }
        this.l.release();
    }

    @Override // defpackage.kl8
    public void m() {
        this.u = true;
        this.p.post(this.n);
    }

    @Override // com.google.android.exoplayer2.source.j
    public TrackGroupArray n() {
        H();
        return this.x.f8194a;
    }

    @Override // com.google.android.exoplayer2.source.j
    public long p(com.google.android.exoplayer2.trackselection.b[] bVarArr, boolean[] zArr, k9l[] k9lVarArr, boolean[] zArr2, long j) {
        com.google.android.exoplayer2.trackselection.b bVar;
        H();
        e eVar = this.x;
        TrackGroupArray trackGroupArray = eVar.f8194a;
        boolean[] zArr3 = eVar.c;
        int i = this.E;
        int i2 = 0;
        for (int i3 = 0; i3 < bVarArr.length; i3++) {
            k9l k9lVar = k9lVarArr[i3];
            if (k9lVar != null && (bVarArr[i3] == null || !zArr[i3])) {
                int i4 = ((c) k9lVar).f8190a;
                rk1.g(zArr3[i4]);
                this.E--;
                zArr3[i4] = false;
                k9lVarArr[i3] = null;
            }
        }
        boolean z = !this.C ? j == 0 : i != 0;
        for (int i5 = 0; i5 < bVarArr.length; i5++) {
            if (k9lVarArr[i5] == null && (bVar = bVarArr[i5]) != null) {
                rk1.g(bVar.length() == 1);
                rk1.g(bVar.c(0) == 0);
                int iC = trackGroupArray.c(bVar.f());
                rk1.g(!zArr3[iC]);
                this.E++;
                zArr3[iC] = true;
                k9lVarArr[i5] = new c(iC);
                zArr2[i5] = true;
                if (!z) {
                    r rVar = this.s[iC];
                    z = (rVar.Z(j, true) || rVar.C() == 0) ? false : true;
                }
            }
        }
        if (this.E == 0) {
            this.I = false;
            this.D = false;
            if (this.f8185k.j()) {
                r[] rVarArr = this.s;
                int length = rVarArr.length;
                while (i2 < length) {
                    rVarArr[i2].r();
                    i2++;
                }
                this.f8185k.f();
            } else {
                r[] rVarArr2 = this.s;
                int length2 = rVarArr2.length;
                while (i2 < length2) {
                    rVarArr2[i2].V();
                    i2++;
                }
            }
        } else if (z) {
            j = i(j);
            while (i2 < k9lVarArr.length) {
                if (k9lVarArr[i2] != null) {
                    zArr2[i2] = true;
                }
                i2++;
            }
        }
        this.C = true;
        return j;
    }

    @Override // com.google.android.exoplayer2.source.j
    public void r(j.a aVar, long j) {
        this.q = aVar;
        this.m.e();
        g0();
    }

    @Override // com.google.android.exoplayer2.source.j
    public void t() throws IOException {
        V();
        if (this.K && !this.v) {
            throw new ParserException("Loading finished before preparation is complete.");
        }
    }

    @Override // com.google.android.exoplayer2.source.j
    public void u(long j, boolean z) {
        H();
        if (O()) {
            return;
        }
        boolean[] zArr = this.x.c;
        int length = this.s.length;
        for (int i = 0; i < length; i++) {
            this.s[i].q(j, z, zArr[i]);
        }
    }
}
