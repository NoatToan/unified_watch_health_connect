package com.google.android.exoplayer2.source.dash;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.m;
import com.google.android.exoplayer2.offline.StreamKey;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.l;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.i;
import com.google.android.exoplayer2.v;
import com.xiaomi.fit.fitness.parser.sport.track.parser.ParserHelper;
import defpackage.bk5;
import defpackage.bn9;
import defpackage.bu3;
import defpackage.bu5;
import defpackage.ck5;
import defpackage.dp0;
import defpackage.fk5;
import defpackage.fxp;
import defpackage.g83;
import defpackage.ljf;
import defpackage.lyl;
import defpackage.mie;
import defpackage.nlq;
import defpackage.pi8;
import defpackage.r61;
import defpackage.ra4;
import defpackage.rk1;
import defpackage.sie;
import defpackage.tmk;
import defpackage.toe;
import defpackage.uqh;
import defpackage.wlf;
import defpackage.wlq;
import defpackage.y57;
import defpackage.yre;
import defpackage.z3n;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes4.dex */
public final class DashMediaSource extends com.google.android.exoplayer2.source.a {
    public IOException A;
    public Handler B;
    public m.f C;
    public Uri D;
    public Uri E;
    public bk5 F;
    public boolean G;
    public long H;
    public long I;
    public long J;
    public int K;
    public long L;
    public int M;
    public final m g;
    public final boolean h;
    public final com.google.android.exoplayer2.upstream.a.InterfaceC0205a i;
    public final com.google.android.exoplayer2.source.dash.a.InterfaceC0190a j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ra4 f8099k;
    public final com.google.android.exoplayer2.drm.c l;
    public final com.google.android.exoplayer2.upstream.h m;
    public final long n;
    public final l.a o;
    public final i.a<? extends bk5> p;
    public final e q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f8100r;
    public final SparseArray<com.google.android.exoplayer2.source.dash.b> s;
    public final Runnable t;
    public final Runnable u;
    public final com.google.android.exoplayer2.source.dash.d.b v;
    public final sie w;
    public com.google.android.exoplayer2.upstream.a x;
    public Loader y;
    public fxp z;

    public static final class Factory implements wlf {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.google.android.exoplayer2.source.dash.a.InterfaceC0190a f8101a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.a.InterfaceC0205a f8102b;
        public y57 c;
        public ra4 d;
        public com.google.android.exoplayer2.upstream.h e;
        public long f;
        public long g;
        public i.a<? extends bk5> h;
        public List<StreamKey> i;
        public Object j;

        public Factory(com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a) {
            this(new com.google.android.exoplayer2.source.dash.c.a(interfaceC0205a), interfaceC0205a);
        }

        @Override // defpackage.wlf
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public DashMediaSource a(m mVar) {
            m mVarA = mVar;
            rk1.e(mVarA.f7949b);
            i.a ck5Var = this.h;
            if (ck5Var == null) {
                ck5Var = new ck5();
            }
            List<StreamKey> list = mVarA.f7949b.e.isEmpty() ? this.i : mVarA.f7949b.e;
            i.a bn9Var = !list.isEmpty() ? new bn9(ck5Var, list) : ck5Var;
            m.g gVar = mVarA.f7949b;
            boolean z = false;
            boolean z2 = gVar.h == null && this.j != null;
            boolean z3 = gVar.e.isEmpty() && !list.isEmpty();
            if (mVarA.c.f7960a == -9223372036854775807L && this.f != -9223372036854775807L) {
                z = true;
            }
            if (z2 || z3 || z) {
                m.c cVarA = mVar.a();
                if (z2) {
                    cVarA.l(this.j);
                }
                if (z3) {
                    cVarA.j(list);
                }
                if (z) {
                    cVarA.g(this.f);
                }
                mVarA = cVarA.a();
            }
            m mVar2 = mVarA;
            return new DashMediaSource(mVar2, null, this.f8102b, bn9Var, this.f8101a, this.d, this.c.a(mVar2), this.e, this.g, null);
        }

        public Factory c(long j) {
            this.g = j;
            return this;
        }

        public Factory d(com.google.android.exoplayer2.upstream.h hVar) {
            if (hVar == null) {
                hVar = new com.google.android.exoplayer2.upstream.f();
            }
            this.e = hVar;
            return this;
        }

        public Factory(com.google.android.exoplayer2.source.dash.a.InterfaceC0190a interfaceC0190a, com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a) {
            this.f8101a = (com.google.android.exoplayer2.source.dash.a.InterfaceC0190a) rk1.e(interfaceC0190a);
            this.f8102b = interfaceC0205a;
            this.c = new com.google.android.exoplayer2.drm.a();
            this.e = new com.google.android.exoplayer2.upstream.f();
            this.f = -9223372036854775807L;
            this.g = 30000L;
            this.d = new bu5();
            this.i = Collections.emptyList();
        }
    }

    public class a implements z3n.b {
        public a() {
        }

        @Override // z3n.b
        public void a(IOException iOException) {
            DashMediaSource.this.Z(iOException);
        }

        @Override // z3n.b
        public void b() {
            DashMediaSource.this.a0(z3n.h());
        }
    }

    public static final class b extends v {
        public final long c;
        public final long d;
        public final long e;
        public final int f;
        public final long g;
        public final long h;
        public final long i;
        public final bk5 j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final m f8104k;
        public final m.f l;

        public b(long j, long j2, long j3, int i, long j4, long j5, long j6, bk5 bk5Var, m mVar, m.f fVar) {
            rk1.g(bk5Var.d == (fVar != null));
            this.c = j;
            this.d = j2;
            this.e = j3;
            this.f = i;
            this.g = j4;
            this.h = j5;
            this.i = j6;
            this.j = bk5Var;
            this.f8104k = mVar;
            this.l = fVar;
        }

        public static boolean t(bk5 bk5Var) {
            return bk5Var.d && bk5Var.e != -9223372036854775807L && bk5Var.f4304b == -9223372036854775807L;
        }

        @Override // com.google.android.exoplayer2.v
        public int b(Object obj) {
            int iIntValue;
            if ((obj instanceof Integer) && (iIntValue = ((Integer) obj).intValue() - this.f) >= 0 && iIntValue < i()) {
                return iIntValue;
            }
            return -1;
        }

        @Override // com.google.android.exoplayer2.v
        public v.b g(int i, v.b bVar, boolean z) {
            rk1.c(i, 0, i());
            return bVar.n(z ? this.j.d(i).f36027a : null, z ? Integer.valueOf(this.f + i) : null, 0, this.j.g(i), g83.c(this.j.d(i).f36028b - this.j.d(0).f36028b) - this.g);
        }

        @Override // com.google.android.exoplayer2.v
        public int i() {
            return this.j.e();
        }

        @Override // com.google.android.exoplayer2.v
        public Object m(int i) {
            rk1.c(i, 0, i());
            return Integer.valueOf(this.f + i);
        }

        @Override // com.google.android.exoplayer2.v
        public v.c o(int i, v.c cVar, long j) {
            rk1.c(i, 0, 1);
            long jS = s(j);
            Object obj = v.c.f8448r;
            m mVar = this.f8104k;
            bk5 bk5Var = this.j;
            return cVar.g(obj, mVar, bk5Var, this.c, this.d, this.e, true, t(bk5Var), this.l, jS, this.h, 0, i() - 1, this.g);
        }

        @Override // com.google.android.exoplayer2.v
        public int p() {
            return 1;
        }

        public final long s(long j) {
            fk5 fk5VarB;
            long j2 = this.i;
            if (!t(this.j)) {
                return j2;
            }
            if (j > 0) {
                j2 += j;
                if (j2 > this.h) {
                    return -9223372036854775807L;
                }
            }
            long j3 = this.g + j2;
            long jG = this.j.g(0);
            int i = 0;
            while (i < this.j.e() - 1 && j3 >= jG) {
                j3 -= jG;
                i++;
                jG = this.j.g(i);
            }
            uqh uqhVarD = this.j.d(i);
            int iA = uqhVarD.a(2);
            return (iA == -1 || (fk5VarB = uqhVarD.c.get(iA).c.get(0).b()) == null || fk5VarB.h(jG) == 0) ? j2 : (j2 + fk5VarB.c(fk5VarB.g(j3, jG))) - j3;
        }
    }

    public final class c implements com.google.android.exoplayer2.source.dash.d.b {
        public c() {
        }

        @Override // com.google.android.exoplayer2.source.dash.d.b
        public void a(long j) {
            DashMediaSource.this.S(j);
        }

        @Override // com.google.android.exoplayer2.source.dash.d.b
        public void b() {
            DashMediaSource.this.T();
        }

        public /* synthetic */ c(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    public static final class d implements i.a<Long> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pattern f8106a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

        @Override // com.google.android.exoplayer2.upstream.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) throws IOException {
            String line = new BufferedReader(new InputStreamReader(inputStream, bu3.c)).readLine();
            try {
                Matcher matcher = f8106a.matcher(line);
                if (!matcher.matches()) {
                    String strValueOf = String.valueOf(line);
                    throw new ParserException(strValueOf.length() != 0 ? "Couldn't parse timestamp: ".concat(strValueOf) : new String("Couldn't parse timestamp: "));
                }
                String strGroup = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat(ParserHelper.DATA_FORMAT4, Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(strGroup).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    long j = Marker.ANY_NON_NULL_MARKER.equals(matcher.group(4)) ? 1L : -1L;
                    long j2 = Long.parseLong(matcher.group(5));
                    String strGroup2 = matcher.group(7);
                    time -= j * (((j2 * 60) + (TextUtils.isEmpty(strGroup2) ? 0L : Long.parseLong(strGroup2))) * 60000);
                }
                return Long.valueOf(time);
            } catch (ParseException e) {
                throw new ParserException(e);
            }
        }
    }

    public final class e implements Loader.b<i<bk5>> {
        public e() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void o(i<bk5> iVar, long j, long j2, boolean z) {
            DashMediaSource.this.U(iVar, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void q(i<bk5> iVar, long j, long j2) {
            DashMediaSource.this.V(iVar, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c s(i<bk5> iVar, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.W(iVar, j, j2, iOException, i);
        }

        public /* synthetic */ e(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    public final class f implements sie {
        public f() {
        }

        @Override // defpackage.sie
        public void a() throws IOException {
            DashMediaSource.this.y.a();
            b();
        }

        public final void b() throws IOException {
            if (DashMediaSource.this.A != null) {
                throw DashMediaSource.this.A;
            }
        }
    }

    public final class g implements Loader.b<i<Long>> {
        public g() {
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void o(i<Long> iVar, long j, long j2, boolean z) {
            DashMediaSource.this.U(iVar, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void q(i<Long> iVar, long j, long j2) {
            DashMediaSource.this.X(iVar, j, j2);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.b
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Loader.c s(i<Long> iVar, long j, long j2, IOException iOException, int i) {
            return DashMediaSource.this.Y(iVar, j, j2, iOException);
        }

        public /* synthetic */ g(DashMediaSource dashMediaSource, a aVar) {
            this();
        }
    }

    public static final class h implements i.a<Long> {
        public h() {
        }

        public /* synthetic */ h(a aVar) {
            this();
        }

        @Override // com.google.android.exoplayer2.upstream.i.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Long a(Uri uri, InputStream inputStream) throws IOException {
            return Long.valueOf(wlq.C0(new BufferedReader(new InputStreamReader(inputStream)).readLine()));
        }
    }

    static {
        pi8.a("goog.exo.dash");
    }

    public /* synthetic */ DashMediaSource(m mVar, bk5 bk5Var, com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a, i.a aVar, com.google.android.exoplayer2.source.dash.a.InterfaceC0190a interfaceC0190a, ra4 ra4Var, com.google.android.exoplayer2.drm.c cVar, com.google.android.exoplayer2.upstream.h hVar, long j, a aVar2) {
        this(mVar, bk5Var, interfaceC0205a, aVar, interfaceC0190a, ra4Var, cVar, hVar, j);
    }

    public static long K(uqh uqhVar, long j, long j2) {
        long jC = g83.c(uqhVar.f36028b);
        boolean zO = O(uqhVar);
        long jMin = Long.MAX_VALUE;
        for (int i = 0; i < uqhVar.c.size(); i++) {
            dp0 dp0Var = uqhVar.c.get(i);
            List<tmk> list = dp0Var.c;
            if ((!zO || dp0Var.f15771b != 3) && !list.isEmpty()) {
                fk5 fk5VarB = list.get(0).b();
                if (fk5VarB == null) {
                    return jC + j;
                }
                long jL = fk5VarB.l(j, j2);
                if (jL == 0) {
                    return jC;
                }
                long jE = (fk5VarB.e(j, j2) + jL) - 1;
                jMin = Math.min(jMin, fk5VarB.d(jE, j) + fk5VarB.c(jE) + jC);
            }
        }
        return jMin;
    }

    public static long L(uqh uqhVar, long j, long j2) {
        long jC = g83.c(uqhVar.f36028b);
        boolean zO = O(uqhVar);
        long jMax = jC;
        for (int i = 0; i < uqhVar.c.size(); i++) {
            dp0 dp0Var = uqhVar.c.get(i);
            List<tmk> list = dp0Var.c;
            if ((!zO || dp0Var.f15771b != 3) && !list.isEmpty()) {
                fk5 fk5VarB = list.get(0).b();
                if (fk5VarB == null || fk5VarB.l(j, j2) == 0) {
                    return jC;
                }
                jMax = Math.max(jMax, fk5VarB.c(fk5VarB.e(j, j2)) + jC);
            }
        }
        return jMax;
    }

    public static long M(bk5 bk5Var, long j) {
        fk5 fk5VarB;
        int iE = bk5Var.e() - 1;
        uqh uqhVarD = bk5Var.d(iE);
        long jC = g83.c(uqhVarD.f36028b);
        long jG = bk5Var.g(iE);
        long jC2 = g83.c(j);
        long jC3 = g83.c(bk5Var.f4303a);
        long jC4 = g83.c(5000L);
        for (int i = 0; i < uqhVarD.c.size(); i++) {
            List<tmk> list = uqhVarD.c.get(i).c;
            if (!list.isEmpty() && (fk5VarB = list.get(0).b()) != null) {
                long jF = ((jC3 + jC) + fk5VarB.f(jG, jC2)) - jC2;
                if (jF < jC4 - 100000 || (jF > jC4 && jF < jC4 + 100000)) {
                    jC4 = jF;
                }
            }
        }
        return yre.b(jC4, 1000L, RoundingMode.CEILING);
    }

    public static boolean O(uqh uqhVar) {
        for (int i = 0; i < uqhVar.c.size(); i++) {
            int i2 = uqhVar.c.get(i).f15771b;
            if (i2 == 1 || i2 == 2) {
                return true;
            }
        }
        return false;
    }

    public static boolean P(uqh uqhVar) {
        for (int i = 0; i < uqhVar.c.size(); i++) {
            fk5 fk5VarB = uqhVar.c.get(i).c.get(0).b();
            if (fk5VarB == null || fk5VarB.k()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Q() {
        b0(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0() {
        Uri uri;
        this.B.removeCallbacks(this.t);
        if (this.y.i()) {
            return;
        }
        if (this.y.j()) {
            this.G = true;
            return;
        }
        synchronized (this.f8100r) {
            uri = this.D;
        }
        this.G = false;
        g0(new i(this.x, uri, 4, this.p), this.q, this.m.e(4));
    }

    @Override // com.google.android.exoplayer2.source.a
    public void B(fxp fxpVar) {
        this.z = fxpVar;
        this.l.prepare();
        if (this.h) {
            b0(false);
            return;
        }
        this.x = this.i.a();
        this.y = new Loader("DashMediaSource");
        this.B = wlq.x();
        h0();
    }

    @Override // com.google.android.exoplayer2.source.a
    public void D() {
        this.G = false;
        this.x = null;
        Loader loader = this.y;
        if (loader != null) {
            loader.l();
            this.y = null;
        }
        this.H = 0L;
        this.I = 0L;
        this.F = this.h ? this.F : null;
        this.D = this.E;
        this.A = null;
        Handler handler = this.B;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.B = null;
        }
        this.J = -9223372036854775807L;
        this.K = 0;
        this.L = -9223372036854775807L;
        this.M = 0;
        this.s.clear();
        this.l.release();
    }

    public final long N() {
        return Math.min((this.K - 1) * 1000, 5000);
    }

    public final void R() {
        z3n.j(this.y, new a());
    }

    public void S(long j) {
        long j2 = this.L;
        if (j2 == -9223372036854775807L || j2 < j) {
            this.L = j;
        }
    }

    public void T() {
        this.B.removeCallbacks(this.u);
        h0();
    }

    public void U(i<?> iVar, long j, long j2) {
        mie mieVar = new mie(iVar.f8438a, iVar.f8439b, iVar.e(), iVar.c(), j, j2, iVar.a());
        this.m.d(iVar.f8438a);
        this.o.q(mieVar, iVar.c);
    }

    public void V(i<bk5> iVar, long j, long j2) {
        mie mieVar = new mie(iVar.f8438a, iVar.f8439b, iVar.e(), iVar.c(), j, j2, iVar.a());
        this.m.d(iVar.f8438a);
        this.o.t(mieVar, iVar.c);
        bk5 bk5VarD = iVar.d();
        bk5 bk5Var = this.F;
        int iE = bk5Var == null ? 0 : bk5Var.e();
        long j3 = bk5VarD.d(0).f36028b;
        int i = 0;
        while (i < iE && this.F.d(i).f36028b < j3) {
            i++;
        }
        if (bk5VarD.d) {
            if (iE - i > bk5VarD.e()) {
                toe.h("DashMediaSource", "Loaded out of sync manifest");
            } else {
                long j4 = this.L;
                if (j4 != -9223372036854775807L) {
                    long j5 = bk5VarD.h;
                    if (1000 * j5 <= j4) {
                        StringBuilder sb = new StringBuilder(73);
                        sb.append("Loaded stale dynamic manifest: ");
                        sb.append(j5);
                        sb.append(", ");
                        sb.append(j4);
                        toe.h("DashMediaSource", sb.toString());
                    }
                }
                this.K = 0;
            }
            int i2 = this.K;
            this.K = i2 + 1;
            if (i2 < this.m.e(iVar.c)) {
                f0(N());
                return;
            } else {
                this.A = new DashManifestStaleException();
                return;
            }
        }
        this.F = bk5VarD;
        this.G = bk5VarD.d & this.G;
        this.H = j - j2;
        this.I = j;
        synchronized (this.f8100r) {
            try {
                if (iVar.f8439b.f8404a == this.D) {
                    Uri uriE = this.F.f4305k;
                    if (uriE == null) {
                        uriE = iVar.e();
                    }
                    this.D = uriE;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (iE != 0) {
            this.M += i;
            b0(true);
            return;
        }
        bk5 bk5Var2 = this.F;
        if (!bk5Var2.d) {
            b0(true);
            return;
        }
        nlq nlqVar = bk5Var2.i;
        if (nlqVar != null) {
            c0(nlqVar);
        } else {
            R();
        }
    }

    public Loader.c W(i<bk5> iVar, long j, long j2, IOException iOException, int i) {
        mie mieVar = new mie(iVar.f8438a, iVar.f8439b, iVar.e(), iVar.c(), j, j2, iVar.a());
        long jA = this.m.a(new com.google.android.exoplayer2.upstream.h.a(mieVar, new ljf(iVar.c), iOException, i));
        Loader.c cVarH = jA == -9223372036854775807L ? Loader.g : Loader.h(false, jA);
        boolean z = !cVarH.c();
        this.o.x(mieVar, iVar.c, iOException, z);
        if (z) {
            this.m.d(iVar.f8438a);
        }
        return cVarH;
    }

    public void X(i<Long> iVar, long j, long j2) {
        mie mieVar = new mie(iVar.f8438a, iVar.f8439b, iVar.e(), iVar.c(), j, j2, iVar.a());
        this.m.d(iVar.f8438a);
        this.o.t(mieVar, iVar.c);
        a0(iVar.d().longValue() - j);
    }

    public Loader.c Y(i<Long> iVar, long j, long j2, IOException iOException) {
        this.o.x(new mie(iVar.f8438a, iVar.f8439b, iVar.e(), iVar.c(), j, j2, iVar.a()), iVar.c, iOException, true);
        this.m.d(iVar.f8438a);
        Z(iOException);
        return Loader.f;
    }

    public final void Z(IOException iOException) {
        toe.d("DashMediaSource", "Failed to resolve time offset.", iOException);
        b0(true);
    }

    public final void a0(long j) {
        this.J = j;
        b0(true);
    }

    public final void b0(boolean z) {
        long j;
        long j2;
        for (int i = 0; i < this.s.size(); i++) {
            int iKeyAt = this.s.keyAt(i);
            if (iKeyAt >= this.M) {
                this.s.valueAt(i).M(this.F, iKeyAt - this.M);
            }
        }
        uqh uqhVarD = this.F.d(0);
        int iE = this.F.e() - 1;
        uqh uqhVarD2 = this.F.d(iE);
        long jG = this.F.g(iE);
        long jC = g83.c(wlq.W(this.J));
        long jL = L(uqhVarD, this.F.g(0), jC);
        long jK = K(uqhVarD2, jG, jC);
        boolean z2 = this.F.d && !P(uqhVarD2);
        if (z2) {
            long j3 = this.F.f;
            if (j3 != -9223372036854775807L) {
                jL = Math.max(jL, jK - g83.c(j3));
            }
        }
        long j4 = jK - jL;
        bk5 bk5Var = this.F;
        if (bk5Var.d) {
            rk1.g(bk5Var.f4303a != -9223372036854775807L);
            long jC2 = (jC - g83.c(this.F.f4303a)) - jL;
            i0(jC2, j4);
            long jD = this.F.f4303a + g83.d(jL);
            long jC3 = jC2 - g83.c(this.C.f7960a);
            long jMin = Math.min(5000000L, j4 / 2);
            j = jD;
            j2 = jC3 < jMin ? jMin : jC3;
        } else {
            j = -9223372036854775807L;
            j2 = 0;
        }
        long jC4 = jL - g83.c(uqhVarD.f36028b);
        bk5 bk5Var2 = this.F;
        C(new b(bk5Var2.f4303a, j, this.J, this.M, jC4, j4, j2, bk5Var2, this.g, bk5Var2.d ? this.C : null));
        if (this.h) {
            return;
        }
        this.B.removeCallbacks(this.u);
        if (z2) {
            this.B.postDelayed(this.u, M(this.F, wlq.W(this.J)));
        }
        if (this.G) {
            h0();
            return;
        }
        if (z) {
            bk5 bk5Var3 = this.F;
            if (bk5Var3.d) {
                long j5 = bk5Var3.e;
                if (j5 != -9223372036854775807L) {
                    if (j5 == 0) {
                        j5 = 5000;
                    }
                    f0(Math.max(0L, (this.H + j5) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.k
    public m c() {
        return this.g;
    }

    public final void c0(nlq nlqVar) {
        String str = nlqVar.f28052a;
        if (wlq.c(str, "urn:mpeg:dash:utc:direct:2014") || wlq.c(str, "urn:mpeg:dash:utc:direct:2012")) {
            d0(nlqVar);
            return;
        }
        if (wlq.c(str, "urn:mpeg:dash:utc:http-iso:2014") || wlq.c(str, "urn:mpeg:dash:utc:http-iso:2012")) {
            e0(nlqVar, new d());
            return;
        }
        if (wlq.c(str, "urn:mpeg:dash:utc:http-xsdate:2014") || wlq.c(str, "urn:mpeg:dash:utc:http-xsdate:2012")) {
            e0(nlqVar, new h(null));
        } else if (wlq.c(str, "urn:mpeg:dash:utc:ntp:2014") || wlq.c(str, "urn:mpeg:dash:utc:ntp:2012")) {
            R();
        } else {
            Z(new IOException("Unsupported UTC timing scheme"));
        }
    }

    @Override // com.google.android.exoplayer2.source.k
    public j d(k.a aVar, r61 r61Var, long j) {
        int iIntValue = ((Integer) aVar.f27977a).intValue() - this.M;
        l.a aVarX = x(aVar, this.F.d(iIntValue).f36028b);
        com.google.android.exoplayer2.source.dash.b bVar = new com.google.android.exoplayer2.source.dash.b(this.M + iIntValue, this.F, iIntValue, this.j, this.z, this.l, u(aVar), this.m, aVarX, this.J, this.w, r61Var, this.f8099k, this.v);
        this.s.put(bVar.f8110a, bVar);
        return bVar;
    }

    public final void d0(nlq nlqVar) {
        try {
            a0(wlq.C0(nlqVar.f28053b) - this.I);
        } catch (ParserException e2) {
            Z(e2);
        }
    }

    public final void e0(nlq nlqVar, i.a<Long> aVar) {
        g0(new i(this.x, Uri.parse(nlqVar.f28053b), 5, aVar), new g(this, null), 1);
    }

    @Override // com.google.android.exoplayer2.source.k
    public void f() throws IOException {
        this.w.a();
    }

    public final void f0(long j) {
        this.B.postDelayed(this.t, j);
    }

    public final <T> void g0(i<T> iVar, Loader.b<i<T>> bVar, int i) {
        this.o.z(new mie(iVar.f8438a, iVar.f8439b, this.y.n(iVar, bVar, i)), iVar.c);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001e  */
    /* JADX WARN: Code duplicated, block: B:19:0x003b  */
    /* JADX WARN: Code duplicated, block: B:26:0x0054  */
    /* JADX WARN: Code duplicated, block: B:35:0x0071  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    public final void i0(long j, long j2) {
        long j3;
        float f2;
        long jD = this.g.c.c;
        if (jD == -9223372036854775807L) {
            lyl lylVar = this.F.j;
            if (lylVar != null) {
                jD = lylVar.c;
                if (jD == -9223372036854775807L) {
                    jD = g83.d(j);
                }
            } else {
                jD = g83.d(j);
            }
        }
        long jD2 = this.g.c.f7961b;
        if (jD2 == -9223372036854775807L) {
            lyl lylVar2 = this.F.j;
            if (lylVar2 != null) {
                jD2 = lylVar2.f25561b;
                if (jD2 == -9223372036854775807L) {
                    jD2 = g83.d(j - j2);
                    if (jD2 < 0 && jD > 0) {
                        jD2 = 0;
                    }
                    j3 = this.F.c;
                    if (j3 != -9223372036854775807L) {
                        jD2 = Math.min(jD2 + j3, jD);
                    }
                }
            } else {
                jD2 = g83.d(j - j2);
                if (jD2 < 0) {
                    jD2 = 0;
                }
                j3 = this.F.c;
                if (j3 != -9223372036854775807L) {
                    jD2 = Math.min(jD2 + j3, jD);
                }
            }
        }
        long j4 = jD2;
        long j5 = this.C.f7960a;
        if (j5 == -9223372036854775807L) {
            bk5 bk5Var = this.F;
            lyl lylVar3 = bk5Var.j;
            if (lylVar3 != null) {
                long j6 = lylVar3.f25560a;
                if (j6 != -9223372036854775807L) {
                    j5 = j6;
                } else {
                    j5 = bk5Var.g;
                    if (j5 == -9223372036854775807L) {
                        j5 = this.n;
                    }
                }
            } else {
                j5 = bk5Var.g;
                if (j5 == -9223372036854775807L) {
                    j5 = this.n;
                }
            }
        }
        if (j5 < j4) {
            j5 = j4;
        }
        long jS = j5 > jD ? wlq.s(g83.d(j - Math.min(5000000L, j2 / 2)), j4, jD) : j5;
        m.f fVar = this.g.c;
        float f3 = fVar.d;
        if (f3 == -3.4028235E38f) {
            lyl lylVar4 = this.F.j;
            f3 = lylVar4 != null ? lylVar4.d : -3.4028235E38f;
        }
        float f4 = fVar.e;
        if (f4 == -3.4028235E38f) {
            lyl lylVar5 = this.F.j;
            if (lylVar5 != null) {
                f4 = lylVar5.e;
                f2 = f4;
            } else {
                f2 = -3.4028235E38f;
            }
        } else {
            f2 = f4;
        }
        this.C = new m.f(jS, j4, jD, f3, f2);
    }

    @Override // com.google.android.exoplayer2.source.k
    public void j(j jVar) {
        com.google.android.exoplayer2.source.dash.b bVar = (com.google.android.exoplayer2.source.dash.b) jVar;
        bVar.I();
        this.s.remove(bVar.f8110a);
    }

    public DashMediaSource(m mVar, bk5 bk5Var, com.google.android.exoplayer2.upstream.a.InterfaceC0205a interfaceC0205a, i.a<? extends bk5> aVar, com.google.android.exoplayer2.source.dash.a.InterfaceC0190a interfaceC0190a, ra4 ra4Var, com.google.android.exoplayer2.drm.c cVar, com.google.android.exoplayer2.upstream.h hVar, long j) {
        this.g = mVar;
        this.C = mVar.c;
        this.D = ((m.g) rk1.e(mVar.f7949b)).f7962a;
        this.E = mVar.f7949b.f7962a;
        this.F = bk5Var;
        this.i = interfaceC0205a;
        this.p = aVar;
        this.j = interfaceC0190a;
        this.l = cVar;
        this.m = hVar;
        this.n = j;
        this.f8099k = ra4Var;
        boolean z = bk5Var != null;
        this.h = z;
        a aVar2 = null;
        this.o = w(null);
        this.f8100r = new Object();
        this.s = new SparseArray<>();
        this.v = new c(this, aVar2);
        this.L = -9223372036854775807L;
        this.J = -9223372036854775807L;
        if (!z) {
            this.q = new e(this, aVar2);
            this.w = new f();
            this.t = new Runnable() { // from class: dk5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15606a.h0();
                }
            };
            this.u = new Runnable() { // from class: ek5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16721a.Q();
                }
            };
            return;
        }
        rk1.g(true ^ bk5Var.d);
        this.q = null;
        this.t = null;
        this.u = null;
        this.w = new sie.a();
    }
}
