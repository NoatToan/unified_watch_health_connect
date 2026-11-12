package p3;

import android.os.Trace;
import ch.qos.logback.core.joran.action.ActionConst;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;
import java.util.Set;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0002\u0014\u0015BQ\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lp3/o0;", "Lp3/v0;", "Lp3/c;", "applier", "Lp3/p;", "parentContext", "Ls3/i;", "slotTable", "", "Lp3/y2;", "abandonSet", "Lp3/g;", "changes", "lateChanges", "Lp3/y;", "observerHolder", "Lp3/r;", "composition", "<init>", "(Lp3/c;Lp3/p;Ls3/i;Ljava/util/Set;Lp3/g;Lp3/g;Lp3/y;Lp3/r;)V", "a", "b", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o0 extends v0 {
    public int B;
    public int C;
    public boolean D;
    public final c E;
    public final ArrayList<p2> F;
    public boolean G;
    public s3.h H;
    public s3.i I;
    public s3.l J;
    public boolean K;
    public i2 L;
    public t3.a M;
    public final t3.b N;
    public s3.b O;
    public t3.c P;
    public e3 Q;
    public final g4.i R;
    public final t13.g S;
    public boolean T;
    public long U;
    public q0 V;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p3.c<?> f135177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f135178c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final s3.i f135179d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Set<y2> f135180e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g f135181f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f135182g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final y f135183h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final r f135184i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public r0 f135186k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f135187l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f135188m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f135189n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int[] f135191p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public p1.g0 f135192q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f135193r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f135194s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public p1.i0<i2> f135198w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f135199x;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f135201z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ArrayList<r0> f135185j = new ArrayList<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final u0 f135190o = new u0();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final ArrayList f135195t = new ArrayList();

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final u0 f135196u = new u0();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public i2 f135197v = z3.j.a();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final u0 f135200y = new u0();
    public int A = -1;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0004\u001a\u00060\u0002R\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lp3/o0$a;", "Lp3/y2;", "Lp3/o0$b;", "Lp3/o0;", ActionConst.REF_ATTRIBUTE, "<init>", "(Lp3/o0$b;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements y2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b f135202a;

        public a(b bVar) {
            this.f135202a = bVar;
        }

        @Override // p3.y2
        public final void onAbandoned() {
            this.f135202a.z();
        }

        @Override // p3.y2
        public final void onForgotten() {
            this.f135202a.z();
        }

        @Override // p3.y2
        public final void onRemembered() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001B-\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lp3/o0$b;", "Lp3/p;", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "compositeKeyHashCode", "", "collectingParameterInformation", "collectingSourceInformation", "Lp3/y;", "observerHolder", "<init>", "(Lp3/o0;JZZLp3/y;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class b extends p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f135203a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f135204b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f135205c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public HashSet f135206d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final p1.u0<o0> f135207e = p1.i1.a();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final c2 f135208f;

        public b(long j8, boolean z14, boolean z15, y yVar) {
            this.f135203a = j8;
            this.f135204b = z14;
            this.f135205c = z15;
            z3.i iVarA = z3.j.a();
            x2 x2Var = x2.f135386a;
            x2Var.getClass();
            this.f135208f = new c2(iVarA, x2Var);
        }

        @Override // p3.p
        public final void a(c0 c0Var, e23.p<? super m, ? super Integer, Unit> pVar) {
            o0.this.f135178c.a(c0Var, pVar);
        }

        @Override // p3.p
        public final p1.h1<p2> b(c0 c0Var, e3 e3Var, e23.p<? super m, ? super Integer, Unit> pVar) {
            return o0.this.f135178c.b(c0Var, e3Var, pVar);
        }

        @Override // p3.p
        public final void c(j1 j1Var) {
            o0.this.f135178c.c(j1Var);
        }

        @Override // p3.p
        public final void d() {
            o0.this.B--;
        }

        @Override // p3.p
        public final boolean e() {
            return o0.this.f135178c.e();
        }

        @Override // p3.p
        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getF135204b() {
            return this.f135204b;
        }

        @Override // p3.p
        /* JADX INFO: renamed from: g, reason: from getter */
        public final boolean getF135205c() {
            return this.f135205c;
        }

        @Override // p3.p
        /* JADX INFO: renamed from: h, reason: from getter */
        public final long getF135203a() {
            return this.f135203a;
        }

        @Override // p3.p
        public final o i() {
            return o0.this.f135184i;
        }

        @Override // p3.p
        public final i2 j() {
            return (i2) this.f135208f.getF182175a();
        }

        @Override // p3.p
        /* JADX INFO: renamed from: k */
        public final t13.g getF135297x() {
            return o0.this.f135178c.getF135297x();
        }

        @Override // p3.p
        public final boolean l() {
            return o0.this.f135178c.l();
        }

        @Override // p3.p
        public final void m(j1 j1Var) {
            o0.this.f135178c.m(j1Var);
        }

        @Override // p3.p
        public final void n(c0 c0Var) {
            o0 o0Var = o0.this;
            o0Var.f135178c.n(o0Var.f135184i);
            o0Var.f135178c.n(c0Var);
        }

        @Override // p3.p
        public final void o(j1 j1Var, i1 i1Var, p3.c<?> cVar) {
            o0.this.f135178c.o(j1Var, i1Var, cVar);
        }

        @Override // p3.p
        public final i1 p(j1 j1Var) {
            return o0.this.f135178c.p(j1Var);
        }

        @Override // p3.p
        public final p1.h1<p2> q(c0 c0Var, e3 e3Var, p1.h1<p2> h1Var) {
            return o0.this.f135178c.q(c0Var, e3Var, h1Var);
        }

        @Override // p3.p
        public final void r(Set<g4.g> set) {
            HashSet hashSet = this.f135206d;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.f135206d = hashSet;
            }
            hashSet.add(set);
        }

        @Override // p3.p
        public final void s(o0 o0Var) {
            this.f135207e.d(o0Var);
        }

        @Override // p3.p
        public final void t(p2 p2Var) {
            o0.this.f135178c.t(p2Var);
        }

        @Override // p3.p
        public final void u(c0 c0Var) {
            o0.this.f135178c.u(c0Var);
        }

        @Override // p3.p
        public final e v(kotlin.s2 s2Var) {
            return o0.this.f135178c.v(s2Var);
        }

        @Override // p3.p
        public final void w() {
            o0.this.B++;
        }

        @Override // p3.p
        public final void x(o0 o0Var) {
            HashSet<Set> hashSet = this.f135206d;
            if (hashSet != null) {
                for (Set set : hashSet) {
                    o0Var.getClass();
                    set.remove(o0Var.m0());
                }
            }
            if (o0Var != null) {
                this.f135207e.l(o0Var);
            }
        }

        @Override // p3.p
        public final void y(r rVar) {
            o0.this.f135178c.y(rVar);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0062 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:22:0x0064 A[LOOP:0: B:9:0x0018->B:22:0x0064, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:26:0x0067 A[EDGE_INSN: B:26:0x0067->B:23:0x0067 BREAK  A[LOOP:0: B:9:0x0018->B:22:0x0064], SYNTHETIC] */
        public final void z() {
            p1.u0<o0> u0Var = this.f135207e;
            if (u0Var.c()) {
                HashSet hashSet = this.f135206d;
                if (hashSet != null) {
                    Object[] objArr = u0Var.f134733b;
                    long[] jArr = u0Var.f134732a;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i14 = 0;
                        while (true) {
                            long j8 = jArr[i14];
                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i14 != length) {
                                    break;
                                    break;
                                }
                                i14++;
                            } else {
                                int i15 = 8 - ((~(i14 - length)) >>> 31);
                                for (int i16 = 0; i16 < i15; i16++) {
                                    if ((255 & j8) < 128) {
                                        o0 o0Var = (o0) objArr[(i14 << 3) + i16];
                                        Iterator it = hashSet.iterator();
                                        while (it.hasNext()) {
                                            ((Set) it.next()).remove(o0Var.m0());
                                        }
                                    }
                                    j8 >>= 8;
                                }
                                if (i15 != 8) {
                                    break;
                                } else if (i14 != length) {
                                    break;
                                } else {
                                    i14++;
                                }
                            }
                        }
                    }
                }
                u0Var.e();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"p3/o0$c", "Lp3/f0;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements f0 {
        public c() {
        }

        @Override // p3.f0
        public final void a() {
            o0.this.B--;
        }

        @Override // p3.f0
        public final void start() {
            o0.this.B++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o0(p3.c<?> cVar, p pVar, s3.i iVar, Set<y2> set, g gVar, g gVar2, y yVar, r rVar) {
        this.f135177b = cVar;
        this.f135178c = pVar;
        this.f135179d = iVar;
        this.f135180e = set;
        this.f135181f = gVar;
        this.f135182g = gVar2;
        this.f135183h = yVar;
        this.f135184i = rVar;
        int i14 = 0;
        int i15 = 1;
        this.D = pVar.getF135205c() || pVar.e();
        this.E = new c();
        this.F = new ArrayList<>();
        s3.h hVarG = iVar.g();
        hVarG.c();
        this.H = hVarG;
        s3.i iVar2 = new s3.i();
        if (pVar.getF135205c()) {
            iVar2.d();
        }
        Object[] objArr = 0;
        if (pVar.e()) {
            iVar2.f156358k = new p1.i0<>(i14, i15, objArr == true ? 1 : 0);
        }
        this.I = iVar2;
        s3.l lVarH = iVar2.h();
        lVarH.e(true);
        this.J = lVarH;
        t3.a aVar = gVar instanceof t3.a ? (t3.a) gVar : null;
        if (aVar == null) {
            n.b("Inconsistent composition");
            o2.c.f();
            throw null;
        }
        this.N = new t3.b(this, aVar);
        s3.h hVarG2 = this.I.g();
        try {
            s3.b bVarA = hVarG2.a(0);
            hVarG2.c();
            this.O = bVarA;
            this.P = new t3.c();
            this.R = new g4.i(this);
            t13.g gVarK = pVar.getF135297x();
            t13.g gVarT = T();
            this.S = gVarK.plus(gVarT == null ? t13.h.f161748a : gVarT);
        } catch (Throwable th3) {
            hVarG2.c();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0030  */
    public static final j1 A0(int i14, o0 o0Var) {
        ArrayList arrayList;
        int i15 = o0Var.H.i(i14);
        s3.h hVar = o0Var.H;
        Object objP = hVar.p(i14, hVar.f156335b);
        if (i15 != 126665345 || !(objP instanceof h1)) {
            return null;
        }
        if (o0Var.H.d(i14)) {
            ArrayList arrayList2 = new ArrayList();
            B0(o0Var, arrayList2, i14);
            if (arrayList2.isEmpty()) {
                arrayList = null;
            } else {
                arrayList = arrayList2;
            }
        } else {
            arrayList = null;
        }
        s3.h hVar2 = o0Var.H;
        Object objP2 = hVar2.p(i14, hVar2.f156335b);
        objP2.getClass();
        h1 h1Var = (h1) objP2;
        Object objH = o0Var.H.h(i14, 0);
        s3.b bVarA = o0Var.H.a(i14);
        int iA = s3.k.a(i14, o0Var.H.f156335b) + i14;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = o0Var.f135195t;
        int iH = p0.h(i14, arrayList4);
        if (iH < 0) {
            iH = -(iH + 1);
        }
        while (iH < arrayList4.size()) {
            w0 w0Var = (w0) arrayList4.get(iH);
            if (w0Var.f135366b >= iA) {
                break;
            }
            arrayList3.add(new o13.p(w0Var.f135365a, w0Var.f135367c));
            iH++;
        }
        return new j1(h1Var, objH, o0Var.f135184i, o0Var.f135179d, bVarA, arrayList3, o0Var.b0(i14), arrayList);
    }

    public static final void B0(o0 o0Var, ArrayList arrayList, int i14) {
        int iA = s3.k.a(i14, o0Var.H.f156335b) + i14;
        int iA2 = i14 + 1;
        while (iA2 < iA) {
            if (o0Var.H.j(iA2)) {
                j1 j1VarA0 = A0(iA2, o0Var);
                if (j1VarA0 != null) {
                    arrayList.add(j1VarA0);
                }
            } else if (o0Var.H.d(iA2)) {
                B0(o0Var, arrayList, iA2);
            }
            iA2 += s3.k.a(iA2, o0Var.H.f156335b);
        }
    }

    public static final int C0(o0 o0Var, int i14, int i15, boolean z14, int i16) {
        int i17;
        long[] jArr;
        Object[] objArr;
        int i18;
        Object[] objArr2;
        int i19;
        s3.h hVar = o0Var.H;
        int i24 = 0;
        if (hVar.j(i15)) {
            int i25 = hVar.i(i15);
            Object objP = hVar.p(i15, hVar.f156335b);
            if (i25 == 126665345 && (objP instanceof h1)) {
                j1 j1VarA0 = A0(i15, o0Var);
                if (j1VarA0 != null) {
                    o0Var.f135178c.c(j1VarA0);
                    o0Var.N.e();
                    t3.b bVar = o0Var.N;
                    r rVar = o0Var.f135184i;
                    p pVar = o0Var.f135178c;
                    t3.g gVar = bVar.f162080b.f162078a;
                    gVar.d(t3.d.u.f162125c);
                    t3.g.b.c(gVar, rVar, pVar, j1VarA0);
                }
                if (!z14 || i15 == i14) {
                    return hVar.o(i15);
                }
                t3.b bVar2 = o0Var.N;
                bVar2.c();
                bVar2.b();
                o0 o0Var2 = bVar2.f162079a;
                int iO = o0Var2.H.l(i15) ? 1 : o0Var2.H.o(i15);
                if (iO > 0) {
                    bVar2.f(i16, iO);
                }
                return 0;
            }
            if (i25 == 206 && p005kotlin.jvm.internal.s.g(objP, n.f135162e)) {
                Object objH = hVar.h(i15, 0);
                z2 z2Var = objH instanceof z2 ? (z2) objH : null;
                y2 f135269a = z2Var != null ? z2Var.getF135269a() : null;
                a aVar = f135269a instanceof a ? (a) f135269a : null;
                if (aVar != null) {
                    p1.u0<o0> u0Var = aVar.f135202a.f135207e;
                    Object[] objArr3 = u0Var.f134733b;
                    long[] jArr2 = u0Var.f134732a;
                    int length = jArr2.length - 2;
                    if (length >= 0) {
                        int i26 = 0;
                        while (true) {
                            long j8 = jArr2[i26];
                            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                int i27 = 8;
                                int i28 = 8 - ((~(i26 - length)) >>> 31);
                                int i29 = i24;
                                while (i29 < i28) {
                                    if ((255 & j8) < 128) {
                                        o0 o0Var3 = (o0) objArr3[(i26 << 3) + i29];
                                        s3.i iVar = o0Var3.f135179d;
                                        if (iVar.f156349b <= 0 || (iVar.f156348a[1] & 67108864) == 0) {
                                            objArr2 = objArr3;
                                            i19 = i24;
                                        } else {
                                            r rVar2 = o0Var3.f135184i;
                                            synchronized (rVar2.f135232d) {
                                                rVar2.G();
                                                p1.t0<Object, Object> t0Var = rVar2.f135242n;
                                                rVar2.f135242n = p1.g1.b();
                                                try {
                                                    rVar2.f135250x.L0(t0Var);
                                                    Unit unit = Unit.INSTANCE;
                                                } catch (Throwable th3) {
                                                    rVar2.f135242n = t0Var;
                                                    throw th3;
                                                }
                                            }
                                            t3.a aVar2 = new t3.a();
                                            o0Var3.M = aVar2;
                                            s3.h hVarG = o0Var3.f135179d.g();
                                            try {
                                                o0Var3.H = hVarG;
                                                t3.b bVar3 = o0Var3.N;
                                                t3.a aVar3 = bVar3.f162080b;
                                                try {
                                                    bVar3.f162080b = aVar2;
                                                    o0Var3.z0(0);
                                                    t3.b bVar4 = o0Var3.N;
                                                    bVar4.b();
                                                    if (bVar4.f162081c) {
                                                        objArr2 = objArr3;
                                                        bVar4.f162080b.f162078a.d(t3.d.b0.f162098c);
                                                        if (bVar4.f162081c) {
                                                            bVar4.d(false);
                                                            bVar4.d(false);
                                                            bVar4.f162080b.f162078a.d(t3.d.j.f162113c);
                                                            i19 = 0;
                                                            bVar4.f162081c = false;
                                                        }
                                                        bVar3.f162080b = aVar3;
                                                        hVarG.c();
                                                    } else {
                                                        objArr2 = objArr3;
                                                    }
                                                    i19 = 0;
                                                    bVar3.f162080b = aVar3;
                                                    hVarG.c();
                                                } catch (Throwable th4) {
                                                    bVar3.f162080b = aVar3;
                                                    throw th4;
                                                }
                                            } catch (Throwable th5) {
                                                hVarG.c();
                                                throw th5;
                                            }
                                        }
                                        o0Var.f135178c.u(o0Var3.f135184i);
                                    } else {
                                        jArr2 = jArr2;
                                        objArr2 = objArr3;
                                        i19 = i24;
                                        i27 = i27;
                                    }
                                    j8 >>= i27;
                                    i29++;
                                    i27 = i27;
                                    objArr3 = objArr2;
                                    i24 = i19;
                                    jArr2 = jArr2;
                                }
                                jArr = jArr2;
                                objArr = objArr3;
                                i18 = i24;
                                if (i28 != i27) {
                                    break;
                                }
                            } else {
                                jArr = jArr2;
                                objArr = objArr3;
                                i18 = i24;
                            }
                            if (i26 == length) {
                                break;
                            }
                            i26++;
                            objArr3 = objArr;
                            i24 = i18;
                            jArr2 = jArr;
                        }
                    }
                }
                return hVar.o(i15);
            }
            i17 = 1;
            if (!hVar.l(i15)) {
                return hVar.o(i15);
            }
        } else {
            i17 = 1;
            if (hVar.d(i15)) {
                int iA = s3.k.a(i15, hVar.f156335b) + i15;
                int iC0 = 0;
                for (int iA2 = i15 + 1; iA2 < iA; iA2 += s3.k.a(iA2, hVar.f156335b)) {
                    boolean zL = hVar.l(iA2);
                    if (zL) {
                        o0Var.N.c();
                        t3.b bVar5 = o0Var.N;
                        Object objN = hVar.n(iA2);
                        bVar5.c();
                        bVar5.f162086h.add(objN);
                    }
                    iC0 += C0(o0Var, i14, iA2, zL || z14, zL ? 0 : i16 + iC0);
                    if (zL) {
                        o0Var.N.c();
                        o0Var.N.a();
                    }
                }
                if (!hVar.l(i15)) {
                    return iC0;
                }
            } else if (!hVar.l(i15)) {
                return hVar.o(i15);
            }
        }
        return i17;
    }

    @Override // p3.m
    public final <T> T A(t<T> tVar) {
        return (T) x.a(a0(), tVar);
    }

    @Override // p3.m
    public final boolean B(Object obj) {
        if (p005kotlin.jvm.internal.s.g(s0(), obj)) {
            return false;
        }
        O0(obj);
        return true;
    }

    @Override // p3.m
    public final void C(int i14) {
        int i15;
        int i16;
        if (this.f135186k != null) {
            r3.c.f149972b.getClass();
            F0(i14, null, null, 0);
            return;
        }
        if (this.f135194s) {
            n.a("A call to createNode(), emitNode() or useNode() expected");
        }
        this.U = Long.rotateLeft(Long.rotateLeft(this.U, 3) ^ ((long) i14), 3) ^ ((long) this.f135189n);
        this.f135189n++;
        s3.h hVar = this.H;
        boolean z14 = this.T;
        m.a aVar = m.f135153a;
        if (z14) {
            hVar.f156344k++;
            s3.l lVar = this.J;
            aVar.getClass();
            lVar.S(i14, m.a.f135155b);
            k0(false, null);
            return;
        }
        if (hVar.g() == i14 && ((i16 = hVar.f156340g) >= hVar.f156341h || (hVar.f156335b[(i16 * 5) + 1] & 536870912) == 0)) {
            hVar.u();
            k0(false, null);
            return;
        }
        if (hVar.f156344k <= 0 && (i15 = hVar.f156340g) != hVar.f156341h) {
            int i17 = this.f135187l;
            w0();
            this.N.f(i17, hVar.s());
            p0.a(this.f135195t, i15, hVar.f156340g);
        }
        hVar.f156344k++;
        this.T = true;
        this.L = null;
        if (this.J.f156385w) {
            s3.l lVarH = this.I.h();
            this.J = lVarH;
            lVarH.O();
            this.K = false;
            this.L = null;
        }
        s3.l lVar2 = this.J;
        lVar2.d();
        int i18 = lVar2.f156382t;
        aVar.getClass();
        lVar2.S(i14, m.a.f135155b);
        this.O = lVar2.b(i18);
        k0(false, null);
    }

    @Override // p3.m
    /* JADX INFO: renamed from: D, reason: from getter */
    public final boolean getT() {
        return this.T;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:35:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:43:0x0109  */
    public final void D0() {
        int i14;
        long jRotateLeft;
        long jRotateLeft2;
        if (this.f135195t.isEmpty()) {
            this.f135188m = this.H.s() + this.f135188m;
            return;
        }
        s3.h hVar = this.H;
        int iG = hVar.g();
        int[] iArr = hVar.f156335b;
        int i15 = hVar.f156340g;
        Object objP = i15 < hVar.f156341h ? hVar.p(i15, iArr) : null;
        Object objF = hVar.f();
        int i16 = this.f135189n;
        m.a aVar = m.f135153a;
        if (objP == null) {
            if (objF != null && iG == 207) {
                aVar.getClass();
                if (!objF.equals(m.a.f135155b)) {
                    this.U = Long.rotateLeft(((long) objF.hashCode()) ^ Long.rotateLeft(this.U, 3), 3) ^ ((long) i16);
                }
                I0(null, (iArr[(hVar.f156340g * 5) + 1] & 1073741824) != 0);
                v0();
                hVar.e();
                if (objP == null) {
                    if (objP instanceof Enum) {
                        this.U = Long.rotateRight(Long.rotateRight(this.U ^ ((long) 0), 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                        return;
                    } else {
                        this.U = Long.rotateRight(Long.rotateRight(this.U ^ ((long) 0), 3) ^ ((long) objP.hashCode()), 3);
                        return;
                    }
                }
                if (objF != null && iG == 207) {
                    aVar.getClass();
                    if (!objF.equals(m.a.f135155b)) {
                        this.U = Long.rotateRight(Long.rotateRight(this.U ^ ((long) i16), 3) ^ ((long) objF.hashCode()), 3);
                        return;
                    }
                }
                this.U = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.U ^ ((long) i16), 3), 3);
            }
            jRotateLeft2 = Long.rotateLeft(Long.rotateLeft(this.U, 3) ^ ((long) iG), 3) ^ ((long) i16);
        } else {
            if (objP instanceof Enum) {
                jRotateLeft = Long.rotateLeft(((long) ((Enum) objP).ordinal()) ^ Long.rotateLeft(this.U, 3), 3);
                i14 = 0;
            } else {
                i14 = 0;
                jRotateLeft = Long.rotateLeft(((long) objP.hashCode()) ^ Long.rotateLeft(this.U, 3), 3);
            }
            jRotateLeft2 = jRotateLeft ^ ((long) i14);
        }
        this.U = jRotateLeft2;
        I0(null, (iArr[(hVar.f156340g * 5) + 1] & 1073741824) != 0);
        v0();
        hVar.e();
        if (objP == null) {
            if (objP instanceof Enum) {
                this.U = Long.rotateRight(Long.rotateRight(this.U ^ ((long) 0), 3) ^ ((long) ((Enum) objP).ordinal()), 3);
                return;
            } else {
                this.U = Long.rotateRight(Long.rotateRight(this.U ^ ((long) 0), 3) ^ ((long) objP.hashCode()), 3);
                return;
            }
        }
        if (objF != null) {
            aVar.getClass();
            if (!objF.equals(m.a.f135155b)) {
                this.U = Long.rotateRight(Long.rotateRight(this.U ^ ((long) i16), 3) ^ ((long) objF.hashCode()), 3);
                return;
            }
        }
        this.U = Long.rotateRight(((long) iG) ^ Long.rotateRight(this.U ^ ((long) i16), 3), 3);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    @Override // p3.m
    public final o0 E(int i14) {
        p2 p2Var;
        boolean z14;
        C(i14);
        boolean z15 = this.T;
        y yVar = this.f135183h;
        ArrayList<p2> arrayList = this.F;
        r rVar = this.f135184i;
        if (z15) {
            rVar.getClass();
            p2 p2Var2 = new p2(rVar);
            arrayList.add(p2Var2);
            O0(p2Var2);
            p2Var2.f135220e = this.C;
            p2Var2.f135217b &= -17;
            yVar.a();
            return this;
        }
        int i15 = this.H.f156342i;
        ArrayList arrayList2 = this.f135195t;
        int iH = p0.h(i15, arrayList2);
        w0 w0Var = iH >= 0 ? (w0) arrayList2.remove(iH) : null;
        Object objM = this.H.m();
        m.f135153a.getClass();
        if (p005kotlin.jvm.internal.s.g(objM, m.a.f135155b)) {
            rVar.getClass();
            p2Var = new p2(rVar);
            O0(p2Var);
        } else {
            objM.getClass();
            p2Var = (p2) objM;
        }
        if (w0Var == null) {
            int i16 = p2Var.f135217b;
            boolean z16 = (i16 & 64) != 0;
            if (z16) {
                p2Var.f135217b = i16 & (-65);
            }
            if (z16) {
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = true;
        }
        int i17 = p2Var.f135217b;
        p2Var.f135217b = z14 ? i17 | 8 : i17 & (-9);
        arrayList.add(p2Var);
        p2Var.f135220e = this.C;
        p2Var.f135217b &= -17;
        yVar.a();
        int i18 = p2Var.f135217b;
        if ((i18 & 256) != 0) {
            p2Var.f135217b = (i18 & (-257)) | 512;
            t3.g gVar = this.N.f162080b.f162078a;
            gVar.d(t3.d.c0.f162100c);
            t3.g.b.a(gVar, 0, p2Var);
            if (!this.f135201z) {
                int i19 = p2Var.f135217b;
                if ((i19 & 128) != 0) {
                    this.f135201z = true;
                    this.A = this.H.f156342i;
                    p2Var.f135217b = i19 | 1024;
                }
            }
        }
        return this;
    }

    public final void E0() {
        s3.h hVar = this.H;
        int i14 = hVar.f156342i;
        this.f135188m = i14 >= 0 ? hVar.f156335b[(i14 * 5) + 1] & 67108863 : 0;
        hVar.t();
    }

    @Override // p3.m
    public final p3.c<?> F() {
        return this.f135177b;
    }

    /* JADX WARN: Code duplicated, block: B:162:0x0307  */
    /* JADX WARN: Code duplicated, block: B:165:0x031d  */
    /* JADX WARN: Code duplicated, block: B:168:0x0338  */
    /* JADX WARN: Code duplicated, block: B:169:0x0345 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:170:0x0347 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:171:0x0349  */
    /* JADX WARN: Code duplicated, block: B:173:0x0350  */
    /* JADX WARN: Code duplicated, block: B:175:0x0357 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x0359  */
    /* JADX WARN: Code duplicated, block: B:177:0x035f  */
    /* JADX WARN: Code duplicated, block: B:182:0x0392  */
    /* JADX WARN: Code duplicated, block: B:22:0x0079  */
    /* JADX WARN: Code duplicated, block: B:25:0x0085  */
    /* JADX WARN: Code duplicated, block: B:26:0x0087  */
    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:32:0x00a6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:37:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:41:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:50:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:63:0x0119  */
    /* JADX WARN: Code duplicated, block: B:66:0x0129  */
    /* JADX WARN: Code duplicated, block: B:69:0x0131  */
    /* JADX WARN: Code duplicated, block: B:71:0x0145  */
    /* JADX WARN: Code duplicated, block: B:72:0x0148  */
    /* JADX WARN: Code duplicated, block: B:77:0x016f  */
    /* JADX WARN: Code duplicated, block: B:79:0x0177  */
    /* JADX WARN: Code duplicated, block: B:80:0x0181  */
    /* JADX WARN: Code duplicated, block: B:83:0x0195  */
    /* JADX WARN: Code duplicated, block: B:84:0x0197  */
    /* JADX WARN: Code duplicated, block: B:86:0x019b  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ba  */
    public final void F0(int i14, Object obj, Object obj2, int i15) {
        long jRotateLeft;
        long j8;
        boolean z14;
        boolean z15;
        r0 r0Var;
        r0 r0Var2;
        ArrayList arrayList;
        p1.i0<r3.b> i0Var;
        int i16;
        Object objValueOf;
        p1.t0<Object, Object> t0Var;
        Object objD;
        p1.q0 q0Var;
        s3.l lVar;
        Object obj3;
        Object obj4;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        s3.h hVar;
        int[] iArr;
        ArrayList arrayList2;
        int i26;
        int i27;
        int i28;
        int i29;
        s3.l lVar2;
        int i30;
        r0 r0Var3;
        Object obj5 = obj;
        if (this.f135194s) {
            n.a("A call to createNode(), emitNode() or useNode() expected");
        }
        int i34 = this.f135189n;
        m.a aVar = m.f135153a;
        if (obj5 == null) {
            if (obj2 != null && i14 == 207) {
                aVar.getClass();
                if (!obj2.equals(m.a.f135155b)) {
                    this.U = Long.rotateLeft(Long.rotateLeft(this.U, 3) ^ ((long) obj2.hashCode()), 3) ^ ((long) i34);
                }
                if (obj5 == null) {
                    this.f135189n++;
                }
                r3.c.f149972b.getClass();
                if (i15 != 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (this.T) {
                    this.H.f156344k++;
                    lVar2 = this.J;
                    i30 = lVar2.f156382t;
                    if (z14) {
                        aVar.getClass();
                        m.a.C2565a c2565a = m.a.f135155b;
                        aVar.getClass();
                        lVar2.T(c2565a, i14, c2565a, true);
                    } else if (obj2 != null) {
                        if (obj5 == null) {
                            aVar.getClass();
                            obj5 = m.a.f135155b;
                        }
                        lVar2.T(obj5, i14, obj2, false);
                    } else {
                        if (obj5 == null) {
                            aVar.getClass();
                            obj5 = m.a.f135155b;
                        }
                        lVar2.S(i14, obj5);
                    }
                    r0Var3 = this.f135186k;
                    if (r0Var3 != null) {
                        s3.e eVar = new s3.e(i14, -1, (-2) - i30, -1, 0);
                        r0Var3.f135257e.i(eVar.f156329c, new r3.b(-1, this.f135187l - r0Var3.f135254b, 0));
                        r0Var3.f135256d.add(eVar);
                    }
                    k0(z14, null);
                    return;
                }
                if (i15 != r3.c.f149973c && this.f135201z) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (this.f135186k == null) {
                    int iG = this.H.g();
                    if (z15 && iG == i14) {
                        s3.h hVar2 = this.H;
                        int i35 = hVar2.f156340g;
                        if (p005kotlin.jvm.internal.s.g(obj5, i35 < hVar2.f156341h ? hVar2.p(i35, hVar2.f156335b) : null)) {
                            I0(obj2, z14);
                        } else {
                            hVar = this.H;
                            iArr = hVar.f156335b;
                            arrayList2 = new ArrayList();
                            if (hVar.f156344k <= 0) {
                                i26 = hVar.f156340g;
                                i27 = 0;
                                while (i26 < hVar.f156341h) {
                                    int i36 = i26 * 5;
                                    int i37 = iArr[i36];
                                    Object objP = hVar.p(i26, iArr);
                                    i28 = iArr[i36 + 1];
                                    if ((i28 & 1073741824) != 0) {
                                        i29 = 1;
                                    } else {
                                        i29 = i28 & 67108863;
                                    }
                                    int i38 = i26;
                                    arrayList2.add(new s3.e(i37, objP, i38, i29, i27));
                                    i26 = iArr[i36 + 3] + i38;
                                    i27++;
                                }
                            }
                            this.f135186k = new r0(arrayList2, this.f135187l);
                        }
                    } else {
                        hVar = this.H;
                        iArr = hVar.f156335b;
                        arrayList2 = new ArrayList();
                        if (hVar.f156344k <= 0) {
                            i26 = hVar.f156340g;
                            i27 = 0;
                            while (i26 < hVar.f156341h) {
                                int i39 = i26 * 5;
                                int i310 = iArr[i39];
                                Object objP2 = hVar.p(i26, iArr);
                                i28 = iArr[i39 + 1];
                                if ((i28 & 1073741824) != 0) {
                                    i29 = 1;
                                } else {
                                    i29 = i28 & 67108863;
                                }
                                int i311 = i26;
                                arrayList2.add(new s3.e(i310, objP2, i311, i29, i27));
                                i26 = iArr[i39 + 3] + i311;
                                i27++;
                            }
                        }
                        this.f135186k = new r0(arrayList2, this.f135187l);
                    }
                }
                r0Var = this.f135186k;
                if (r0Var != null) {
                    arrayList = r0Var.f135256d;
                    i0Var = r0Var.f135257e;
                    i16 = r0Var.f135254b;
                    if (obj5 != null) {
                        objValueOf = new y0(Integer.valueOf(i14), obj5);
                    } else {
                        objValueOf = Integer.valueOf(i14);
                    }
                    t0Var = ((q3.b) r0Var.f135258f.getValue()).f142355a;
                    objD = t0Var.d(objValueOf);
                    if (objD == null) {
                        objD = null;
                    } else if (objD instanceof p1.q0) {
                        q0Var = (p1.q0) objD;
                        Object objL = q0Var.l(0);
                        if (q0Var.d()) {
                            t0Var.k(objValueOf);
                        }
                        if (q0Var.f134668b == 1) {
                            t0Var.m(objValueOf, q0Var.a());
                        }
                        objD = objL;
                    } else {
                        t0Var.k(objValueOf);
                    }
                    s3.e eVar2 = (s3.e) objD;
                    if (!z15 || eVar2 == null) {
                        this.H.f156344k++;
                        this.T = true;
                        this.L = null;
                        if (this.J.f156385w) {
                            s3.l lVarH = this.I.h();
                            this.J = lVarH;
                            lVarH.O();
                            this.K = false;
                            this.L = null;
                        }
                        this.J.d();
                        lVar = this.J;
                        int i44 = lVar.f156382t;
                        if (z14) {
                            aVar.getClass();
                            m.a.C2565a c2565a2 = m.a.f135155b;
                            aVar.getClass();
                            lVar.T(c2565a2, i14, c2565a2, true);
                        } else if (obj2 != null) {
                            if (obj == null) {
                                aVar.getClass();
                                obj4 = m.a.f135155b;
                            } else {
                                obj4 = obj;
                            }
                            lVar.T(obj4, i14, obj2, false);
                        } else {
                            if (obj == null) {
                                aVar.getClass();
                                obj3 = m.a.f135155b;
                            } else {
                                obj3 = obj;
                            }
                            lVar.S(i14, obj3);
                        }
                        this.O = this.J.b(i44);
                        s3.e eVar3 = new s3.e(i14, -1, (-2) - i44, -1, 0);
                        i0Var.i(eVar3.f156329c, new r3.b(-1, this.f135187l - i16, 0));
                        arrayList.add(eVar3);
                        r0Var2 = new r0(new ArrayList(), z14 ? 0 : this.f135187l);
                    } else {
                        int i45 = eVar2.f156329c;
                        arrayList.add(eVar2);
                        r3.b bVarB = i0Var.b(i45);
                        this.f135187l = (bVarB != null ? bVarB.f149970b : -1) + i16;
                        r3.b bVarB2 = i0Var.b(i45);
                        int i46 = bVarB2 != null ? bVarB2.f149969a : -1;
                        int i47 = r0Var.f135255c;
                        int i48 = i46 - i47;
                        int i49 = 8;
                        if (i46 <= i47) {
                            i17 = i48;
                            if (i47 > i46) {
                                Object[] objArr = i0Var.f134774c;
                                long[] jArr = i0Var.f134772a;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    int i54 = 0;
                                    while (true) {
                                        long j14 = jArr[i54];
                                        if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i55 = 8 - ((~(i54 - length)) >>> 31);
                                            int i56 = 0;
                                            while (i56 < i55) {
                                                if ((j14 & 255) >= 128) {
                                                    i19 = i46;
                                                } else {
                                                    r3.b bVar = (r3.b) objArr[(i54 << 3) + i56];
                                                    int i57 = bVar.f149969a;
                                                    if (i57 == i46) {
                                                        bVar.f149969a = i47;
                                                        i19 = i46;
                                                    } else {
                                                        i19 = i46;
                                                        if (i19 + 1 <= i57 && i57 < i47) {
                                                            bVar.f149969a = i57 - 1;
                                                        }
                                                    }
                                                }
                                                j14 >>= 8;
                                                i56++;
                                                i46 = i19;
                                            }
                                            i18 = i46;
                                            if (i55 != 8) {
                                                break;
                                            }
                                        } else {
                                            i18 = i46;
                                        }
                                        if (i54 == length) {
                                            break;
                                        }
                                        i54++;
                                        i46 = i18;
                                    }
                                }
                            }
                        } else {
                            Object[] objArr2 = i0Var.f134774c;
                            long[] jArr2 = i0Var.f134772a;
                            int length2 = jArr2.length - 2;
                            if (length2 >= 0) {
                                int i58 = 0;
                                while (true) {
                                    long j15 = jArr2[i58];
                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i59 = 8 - ((~(i58 - length2)) >>> 31);
                                        int i64 = 0;
                                        while (i64 < i59) {
                                            if ((j15 & 255) < 128) {
                                                i25 = i49;
                                                r3.b bVar2 = (r3.b) objArr2[(i58 << 3) + i64];
                                                i24 = i48;
                                                int i65 = bVar2.f149969a;
                                                if (i65 == i46) {
                                                    bVar2.f149969a = i47;
                                                } else if (i47 <= i65 && i65 < i46) {
                                                    bVar2.f149969a = i65 + 1;
                                                }
                                            } else {
                                                i24 = i48;
                                                i25 = i49;
                                            }
                                            j15 >>= i25;
                                            i64++;
                                            i48 = i24;
                                            i49 = i25;
                                        }
                                        i17 = i48;
                                        if (i59 != i49) {
                                            break;
                                        }
                                    } else {
                                        i17 = i48;
                                    }
                                    if (i58 == length2) {
                                        break;
                                    }
                                    i58++;
                                    i48 = i17;
                                    i49 = 8;
                                }
                            } else {
                                i17 = i48;
                            }
                        }
                        t3.b bVar3 = this.N;
                        bVar3.f162084f = (i45 - bVar3.f162079a.H.f156340g) + bVar3.f162084f;
                        this.H.r(i45);
                        if (i17 > 0) {
                            bVar3.d(false);
                            bVar3.e();
                            t3.g gVar = bVar3.f162080b.f162078a;
                            gVar.d(t3.d.r.f162122c);
                            gVar.f162135c[gVar.f162136d - gVar.f162133a[gVar.f162134b - 1].f162093a] = i17;
                        }
                        I0(obj2, z14);
                        r0Var2 = null;
                    }
                } else {
                    r0Var2 = null;
                }
                k0(z14, r0Var2);
            }
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.U, 3) ^ ((long) i14), 3);
            j8 = i34;
        } else {
            jRotateLeft = Long.rotateLeft(Long.rotateLeft(this.U, 3) ^ ((long) (obj5 instanceof Enum ? ((Enum) obj5).ordinal() : obj5.hashCode())), 3);
            j8 = 0;
        }
        this.U = jRotateLeft ^ j8;
        if (obj5 == null) {
            this.f135189n++;
        }
        r3.c.f149972b.getClass();
        if (i15 != 0) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (this.T) {
            this.H.f156344k++;
            lVar2 = this.J;
            i30 = lVar2.f156382t;
            if (z14) {
                aVar.getClass();
                m.a.C2565a c2565a3 = m.a.f135155b;
                aVar.getClass();
                lVar2.T(c2565a3, i14, c2565a3, true);
            } else if (obj2 != null) {
                if (obj5 == null) {
                    aVar.getClass();
                    obj5 = m.a.f135155b;
                }
                lVar2.T(obj5, i14, obj2, false);
            } else {
                if (obj5 == null) {
                    aVar.getClass();
                    obj5 = m.a.f135155b;
                }
                lVar2.S(i14, obj5);
            }
            r0Var3 = this.f135186k;
            if (r0Var3 != null) {
                s3.e eVar4 = new s3.e(i14, -1, (-2) - i30, -1, 0);
                r0Var3.f135257e.i(eVar4.f156329c, new r3.b(-1, this.f135187l - r0Var3.f135254b, 0));
                r0Var3.f135256d.add(eVar4);
            }
            k0(z14, null);
            return;
        }
        if (i15 != r3.c.f149973c) {
            z15 = false;
        } else {
            z15 = true;
        }
        if (this.f135186k == null) {
            int iG2 = this.H.g();
            if (z15) {
                hVar = this.H;
                iArr = hVar.f156335b;
                arrayList2 = new ArrayList();
                if (hVar.f156344k <= 0) {
                    i26 = hVar.f156340g;
                    i27 = 0;
                    while (i26 < hVar.f156341h) {
                        int i312 = i26 * 5;
                        int i313 = iArr[i312];
                        Object objP3 = hVar.p(i26, iArr);
                        i28 = iArr[i312 + 1];
                        if ((i28 & 1073741824) != 0) {
                            i29 = 1;
                        } else {
                            i29 = i28 & 67108863;
                        }
                        int i314 = i26;
                        arrayList2.add(new s3.e(i313, objP3, i314, i29, i27));
                        i26 = iArr[i312 + 3] + i314;
                        i27++;
                    }
                }
                this.f135186k = new r0(arrayList2, this.f135187l);
            } else {
                hVar = this.H;
                iArr = hVar.f156335b;
                arrayList2 = new ArrayList();
                if (hVar.f156344k <= 0) {
                    i26 = hVar.f156340g;
                    i27 = 0;
                    while (i26 < hVar.f156341h) {
                        int i315 = i26 * 5;
                        int i316 = iArr[i315];
                        Object objP4 = hVar.p(i26, iArr);
                        i28 = iArr[i315 + 1];
                        if ((i28 & 1073741824) != 0) {
                            i29 = 1;
                        } else {
                            i29 = i28 & 67108863;
                        }
                        int i317 = i26;
                        arrayList2.add(new s3.e(i316, objP4, i317, i29, i27));
                        i26 = iArr[i315 + 3] + i317;
                        i27++;
                    }
                }
                this.f135186k = new r0(arrayList2, this.f135187l);
            }
        }
        r0Var = this.f135186k;
        if (r0Var != null) {
            arrayList = r0Var.f135256d;
            i0Var = r0Var.f135257e;
            i16 = r0Var.f135254b;
            if (obj5 != null) {
                objValueOf = new y0(Integer.valueOf(i14), obj5);
            } else {
                objValueOf = Integer.valueOf(i14);
            }
            t0Var = ((q3.b) r0Var.f135258f.getValue()).f142355a;
            objD = t0Var.d(objValueOf);
            if (objD == null) {
                objD = null;
            } else if (objD instanceof p1.q0) {
                q0Var = (p1.q0) objD;
                Object objL2 = q0Var.l(0);
                if (q0Var.d()) {
                    t0Var.k(objValueOf);
                }
                if (q0Var.f134668b == 1) {
                    t0Var.m(objValueOf, q0Var.a());
                }
                objD = objL2;
            } else {
                t0Var.k(objValueOf);
            }
            s3.e eVar5 = (s3.e) objD;
            if (z15) {
            }
            this.H.f156344k++;
            this.T = true;
            this.L = null;
            if (this.J.f156385w) {
                s3.l lVarH2 = this.I.h();
                this.J = lVarH2;
                lVarH2.O();
                this.K = false;
                this.L = null;
            }
            this.J.d();
            lVar = this.J;
            int i410 = lVar.f156382t;
            if (z14) {
                aVar.getClass();
                m.a.C2565a c2565a4 = m.a.f135155b;
                aVar.getClass();
                lVar.T(c2565a4, i14, c2565a4, true);
            } else if (obj2 != null) {
                if (obj == null) {
                    aVar.getClass();
                    obj4 = m.a.f135155b;
                } else {
                    obj4 = obj;
                }
                lVar.T(obj4, i14, obj2, false);
            } else {
                if (obj == null) {
                    aVar.getClass();
                    obj3 = m.a.f135155b;
                } else {
                    obj3 = obj;
                }
                lVar.S(i14, obj3);
            }
            this.O = this.J.b(i410);
            s3.e eVar6 = new s3.e(i14, -1, (-2) - i410, -1, 0);
            i0Var.i(eVar6.f156329c, new r3.b(-1, this.f135187l - i16, 0));
            arrayList.add(eVar6);
            r0Var2 = new r0(new ArrayList(), z14 ? 0 : this.f135187l);
        } else {
            r0Var2 = null;
        }
        k0(z14, r0Var2);
    }

    @Override // p3.m
    public final Object G(Object obj, Object obj2) {
        s3.h hVar = this.H;
        int i14 = hVar.f156340g;
        Object objK = p0.k(i14 < hVar.f156341h ? hVar.p(i14, hVar.f156335b) : null, obj, obj2);
        return objK == null ? new y0(obj, obj2) : objK;
    }

    public final void G0() {
        r3.c.f149972b.getClass();
        F0(-127, null, null, 0);
    }

    @Override // p3.m
    public final void H() {
        r3.c.f149972b.getClass();
        F0(125, null, null, r3.c.f149973c);
        this.f135194s = true;
    }

    public final void H0(int i14, Object obj) {
        r3.c.f149972b.getClass();
        F0(i14, obj, null, 0);
    }

    @Override // p3.m
    /* JADX INFO: renamed from: I, reason: from getter */
    public final t13.g getS() {
        return this.S;
    }

    public final void I0(Object obj, boolean z14) {
        if (z14) {
            s3.h hVar = this.H;
            if (hVar.f156344k <= 0) {
                if ((hVar.f156335b[(hVar.f156340g * 5) + 1] & 1073741824) == 0) {
                    j2.a("Expected a node group");
                }
                hVar.u();
                return;
            }
            return;
        }
        if (obj != null && this.H.f() != obj) {
            t3.b bVar = this.N;
            bVar.getClass();
            bVar.d(false);
            t3.g gVar = bVar.f162080b.f162078a;
            gVar.d(t3.d.f0.f162106c);
            t3.g.b.a(gVar, 0, obj);
        }
        this.H.u();
    }

    @Override // p3.m
    public final void J(e23.a<Unit> aVar) {
        t3.g gVar = this.N.f162080b.f162078a;
        gVar.d(t3.d.a0.f162096c);
        t3.g.b.a(gVar, 0, aVar);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void J0() {
        this.f135189n = 0;
        this.H = this.f135179d.g();
        r3.c.a aVar = r3.c.f149972b;
        aVar.getClass();
        F0(100, null, null, 0);
        p pVar = this.f135178c;
        pVar.w();
        i2 i2VarJ = pVar.j();
        this.f135200y.c(this.f135199x ? 1 : 0);
        this.f135199x = B(i2VarJ);
        this.L = null;
        if (!this.f135193r) {
            this.f135193r = pVar.getF135204b();
        }
        if (!this.D) {
            this.D = pVar.getF135205c();
        }
        if (this.D) {
            y3 y3Var = g4.j.f75742a;
            y3Var.getClass();
            i2VarJ = i2VarJ.c0(y3Var, new z3(T()));
        }
        this.f135197v = i2VarJ;
        Set<g4.g> set = (Set) x.a(i2VarJ, g4.l.f75743a);
        if (set != null) {
            set.add(m0());
            pVar.r(set);
        }
        int iHashCode = Long.hashCode(pVar.getF135203a());
        aVar.getClass();
        F0(iHashCode, null, null, 0);
    }

    @Override // p3.m
    public final void K(Object obj) {
        if (obj instanceof y2) {
            s0 s0Var = new s0((y2) obj, this.f135189n - 1);
            if (this.T) {
                t3.g gVar = this.N.f162080b.f162078a;
                gVar.d(t3.d.v.f162126c);
                t3.g.b.a(gVar, 0, s0Var);
            }
            this.f135180e.add(obj);
            obj = s0Var;
        }
        O0(obj);
    }

    public final boolean K0(p2 p2Var, Object obj) {
        s3.b bVar = p2Var.f135218c;
        if (bVar == null) {
            return false;
        }
        int iC = this.H.f156334a.c(oc.b.f(bVar));
        if (!this.G || iC < this.H.f156340g) {
            return false;
        }
        ArrayList arrayList = this.f135195t;
        int iH = p0.h(iC, arrayList);
        if (iH < 0) {
            int i14 = -(iH + 1);
            if (!(obj instanceof e0)) {
                obj = null;
            }
            arrayList.add(i14, new w0(p2Var, iC, obj));
            return true;
        }
        w0 w0Var = (w0) arrayList.get(iH);
        if (!(obj instanceof e0)) {
            w0Var.f135367c = null;
            return true;
        }
        Object obj2 = w0Var.f135367c;
        if (obj2 == null) {
            w0Var.f135367c = obj;
            return true;
        }
        if (obj2 instanceof p1.u0) {
            ((p1.u0) obj2).d(obj);
            return true;
        }
        p1.u0<Object> u0Var = p1.i1.f134743a;
        p1.u0 u0Var2 = new p1.u0(2);
        u0Var2.j(obj2);
        u0Var2.j(obj);
        w0Var.f135367c = u0Var2;
        return true;
    }

    @Override // p3.m
    public final void L(int i14) {
        r3.c.f149972b.getClass();
        F0(i14, null, null, 0);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0090 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0092 A[LOOP:1: B:20:0x0042->B:35:0x0092, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0095 A[EDGE_INSN: B:43:0x0095->B:36:0x0095 BREAK  A[LOOP:1: B:20:0x0042->B:35:0x0092], SYNTHETIC] */
    public final void L0(p1.t0<Object, Object> t0Var) {
        ArrayList arrayList = this.f135195t;
        for (int iJ = p13.x.j(arrayList); -1 < iJ; iJ--) {
            w0 w0Var = (w0) arrayList.get(iJ);
            s3.b bVar = w0Var.f135365a.f135218c;
            s3.b bVarF = bVar != null ? oc.b.f(bVar) : null;
            if (bVarF == null || !bVarF.getValid()) {
                arrayList.remove(iJ);
            } else {
                int i14 = w0Var.f135366b;
                int i15 = bVarF.f156318a;
                if (i14 != i15) {
                    w0Var.f135366b = i15;
                }
            }
        }
        Object[] objArr = t0Var.f134721b;
        Object[] objArr2 = t0Var.f134722c;
        long[] jArr = t0Var.f134720a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i16 = 0;
            while (true) {
                long j8 = jArr[i16];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i16 != length) {
                        break;
                        break;
                    }
                    i16++;
                } else {
                    int i17 = 8 - ((~(i16 - length)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((255 & j8) < 128) {
                            int i19 = (i16 << 3) + i18;
                            Object obj = objArr[i19];
                            Object obj2 = objArr2[i19];
                            obj.getClass();
                            p2 p2Var = (p2) obj;
                            s3.b bVar2 = p2Var.f135218c;
                            if (bVar2 != null) {
                                int i24 = oc.b.f(bVar2).f156318a;
                                if (obj2 == d3.f135065a) {
                                    obj2 = null;
                                }
                                arrayList.add(new w0(p2Var, i24, obj2));
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i17 != 8) {
                        break;
                    } else if (i16 != length) {
                        break;
                    } else {
                        i16++;
                    }
                }
            }
        }
        p13.c0.u(arrayList, p0.f135214a);
    }

    @Override // p3.m
    public final <T> void M(e23.a<? extends T> aVar) {
        if (!this.f135194s) {
            n.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f135194s = false;
        if (!this.T) {
            n.a("createNode() can only be called when inserting");
        }
        u0 u0Var = this.f135190o;
        int i14 = u0Var.f135319a[u0Var.f135320b - 1];
        s3.l lVar = this.J;
        s3.b bVarB = lVar.b(lVar.f156384v);
        this.f135188m++;
        t3.c cVar = this.P;
        t3.g gVar = cVar.f162091a;
        gVar.d(t3.d.o.f162119c);
        t3.g.b.a(gVar, 0, aVar);
        gVar.f162135c[gVar.f162136d - gVar.f162133a[gVar.f162134b - 1].f162093a] = i14;
        t3.g.b.a(gVar, 1, bVarB);
        t3.g gVar2 = cVar.f162092b;
        gVar2.d(t3.d.t.f162124c);
        gVar2.f162135c[gVar2.f162136d - gVar2.f162133a[gVar2.f162134b - 1].f162093a] = i14;
        t3.g.b.a(gVar2, 0, bVarB);
    }

    public final void M0(int i14, int i15) {
        if (P0(i14) != i15) {
            int i16 = 0;
            if (i14 < 0) {
                p1.g0 g0Var = this.f135192q;
                if (g0Var == null) {
                    g0Var = new p1.g0(i16, 1, null);
                    this.f135192q = g0Var;
                }
                g0Var.f(i14, i15);
                return;
            }
            int[] iArr = this.f135191p;
            if (iArr == null) {
                int i17 = this.H.f156336c;
                int[] iArr2 = new int[i17];
                Arrays.fill(iArr2, 0, i17, -1);
                this.f135191p = iArr2;
                iArr = iArr2;
            }
            iArr[i14] = i15;
        }
    }

    @Override // p3.m
    public final void N(int i14, Object obj) {
        r3.c.f149972b.getClass();
        F0(i14, obj, null, 0);
    }

    public final void N0(int i14, int i15) {
        int iP0 = P0(i14);
        if (iP0 != i15) {
            int i16 = i15 - iP0;
            ArrayList<r0> arrayList = this.f135185j;
            int size = arrayList.size() - 1;
            while (i14 != -1) {
                int iP1 = P0(i14) + i16;
                M0(i14, iP1);
                for (int i17 = size; -1 < i17; i17--) {
                    r0 r0Var = arrayList.get(i17);
                    if (r0Var != null && r0Var.a(i14, iP1)) {
                        size = i17 - 1;
                        break;
                    }
                }
                s3.h hVar = this.H;
                if (i14 < 0) {
                    i14 = hVar.f156342i;
                } else if (hVar.l(i14)) {
                    return;
                } else {
                    i14 = this.H.q(i14);
                }
            }
        }
    }

    @Override // p3.m
    public final void O() {
        this.f135201z = false;
    }

    public final void O0(Object obj) {
        if (this.T) {
            this.J.V(obj);
            return;
        }
        s3.h hVar = this.H;
        boolean z14 = hVar.f156347n;
        t3.b bVar = this.N;
        if (!z14) {
            s3.b bVarA = hVar.a(hVar.f156342i);
            t3.g gVar = bVar.f162080b.f162078a;
            gVar.d(t3.d.b.f162097c);
            t3.g.b.b(gVar, 0, bVarA, 1, obj);
            return;
        }
        int iC = (hVar.f156345l - s3.k.c(hVar.f156342i, hVar.f156335b)) - 1;
        if (bVar.f162079a.H.f156342i - bVar.f162084f >= 0) {
            bVar.d(true);
            t3.g gVar2 = bVar.f162080b.f162078a;
            gVar2.d(t3.d.h0.f162110c);
            t3.g.b.a(gVar2, 0, obj);
            gVar2.f162135c[gVar2.f162136d - gVar2.f162133a[gVar2.f162134b - 1].f162093a] = iC;
            return;
        }
        s3.h hVar2 = this.H;
        s3.b bVarA2 = hVar2.a(hVar2.f156342i);
        t3.g gVar3 = bVar.f162080b.f162078a;
        gVar3.d(t3.d.e0.f162104c);
        t3.g.b.b(gVar3, 0, obj, 1, bVarA2);
        gVar3.f162135c[gVar3.f162136d - gVar3.f162133a[gVar3.f162134b - 1].f162093a] = iC;
    }

    public final int P0(int i14) {
        int i15;
        if (i14 >= 0) {
            int[] iArr = this.f135191p;
            return (iArr == null || (i15 = iArr[i14]) < 0) ? this.H.o(i14) : i15;
        }
        p1.g0 g0Var = this.f135192q;
        if (g0Var == null || g0Var.a(i14) < 0) {
            return 0;
        }
        int iA = g0Var.a(i14);
        if (iA >= 0) {
            return g0Var.f134739c[iA];
        }
        n23.j.s(am.j.h(i14, "Cannot find value for key "));
        return 0;
    }

    @Override // p3.m
    public final void Q() {
        g0(false);
    }

    @Override // p3.m
    public final void R() {
        g0(false);
    }

    @Override // p3.v0
    public final void S() {
        if (this.G || this.A != 0) {
            j2.a("Cannot disable reuse from root if it was caused by other groups");
        }
        this.A = -1;
        this.f135201z = false;
    }

    @Override // p3.v0
    public final g4.i T() {
        if (this.f135178c.l()) {
            return this.R;
        }
        return null;
    }

    @Override // p3.v0
    /* JADX INFO: renamed from: U, reason: from getter */
    public final boolean getD() {
        return this.D;
    }

    @Override // p3.v0
    public final List<g4.d> V() {
        p pVar = this.f135178c;
        o oVarI = pVar.i();
        r rVar = oVarI != null ? (r) oVarI : null;
        if (rVar == null) {
            return p13.j0.f134944a;
        }
        s3.i iVar = rVar.f135234f;
        s3.h hVarG = s3.k.e(iVar).g();
        try {
            Integer numB = g4.c.b(hVarG, pVar, 0, hVarG.f156336c);
            hVarG.c();
            if (numB == null) {
                return p13.j0.f134944a;
            }
            s3.h hVarG2 = s3.k.e(iVar).g();
            try {
                return p13.h0.C0(g4.c.c(hVarG2, numB.intValue(), 0), rVar.f135250x.V());
            } finally {
                hVarG2.c();
            }
        } catch (Throwable th3) {
            hVarG.c();
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x009e  */
    @Override // p3.v0
    public final g4.a W(Object obj) {
        List listC0;
        s3.h hVarG;
        s3.i iVar = this.f135179d;
        s3.h hVarG2 = iVar.g();
        int i14 = 0;
        while (true) {
            try {
                g4.n nVar = null;
                if (i14 < iVar.f156349b) {
                    if (hVarG2.l(i14)) {
                        Object objN = hVarG2.n(i14);
                        if (objN != obj) {
                            z2 z2Var = objN instanceof z2 ? (z2) objN : null;
                            if ((z2Var != null ? z2Var.getF135269a() : null) == obj) {
                            }
                        }
                        g4.n nVar2 = new g4.n(i14, null);
                        hVarG2.c();
                        nVar = nVar2;
                        if (nVar != null) {
                            int i15 = nVar.f75745a;
                            Integer num = nVar.f75746b;
                            hVarG = iVar.g();
                            try {
                                ArrayList arrayListC = g4.c.c(hVarG, i15, num);
                                hVarG.c();
                                listC0 = p13.h0.C0(arrayListC, V());
                            } catch (Throwable th3) {
                                hVarG.c();
                                throw th3;
                            }
                        } else {
                            listC0 = p13.j0.f134944a;
                        }
                        return new g4.a(listC0, this.D);
                    }
                    int[] iArr = hVarG2.f156335b;
                    int i16 = i14 + 1;
                    int iC = (i16 < hVarG2.f156336c ? iArr[(i16 * 5) + 4] : hVarG2.f156338e) - s3.k.c(i14, iArr);
                    int i17 = 0;
                    while (true) {
                        if (i17 >= iC) {
                            i14 = i16;
                        } else {
                            Object objH = hVarG2.h(i14, i17);
                            if (objH != obj) {
                                z2 z2Var2 = objH instanceof z2 ? (z2) objH : null;
                                if ((z2Var2 != null ? z2Var2.getF135269a() : null) != obj) {
                                    i17++;
                                }
                            }
                            nVar = new g4.n(i14, Integer.valueOf(i17));
                        }
                    }
                } else {
                    Unit unit = Unit.INSTANCE;
                }
                hVarG2.c();
                if (nVar != null) {
                    int i18 = nVar.f75745a;
                    Integer num2 = nVar.f75746b;
                    hVarG = iVar.g();
                    ArrayList arrayListC2 = g4.c.c(hVarG, i18, num2);
                    hVarG.c();
                    listC0 = p13.h0.C0(arrayListC2, V());
                } else {
                    listC0 = p13.j0.f134944a;
                }
                return new g4.a(listC0, this.D);
            } catch (Throwable th4) {
                hVarG2.c();
                throw th4;
            }
        }
    }

    @Override // p3.v0
    public final void X() {
        this.A = 0;
        this.f135201z = true;
    }

    public final void Y() {
        Z();
        this.f135185j.clear();
        this.f135190o.f135320b = 0;
        this.f135196u.f135320b = 0;
        this.f135200y.f135320b = 0;
        this.f135198w = null;
        t3.c cVar = this.P;
        cVar.f162092b.a();
        cVar.f162091a.a();
        this.U = 0;
        this.B = 0;
        this.f135194s = false;
        this.T = false;
        this.f135201z = false;
        this.G = false;
        this.A = -1;
        s3.h hVar = this.H;
        if (!hVar.f156339f) {
            hVar.c();
        }
        if (this.J.f156385w) {
            return;
        }
        l0();
    }

    public final void Z() {
        this.f135186k = null;
        this.f135187l = 0;
        this.f135188m = 0;
        this.U = 0L;
        this.f135194s = false;
        t3.b bVar = this.N;
        bVar.f162081c = false;
        bVar.f162082d.f135320b = 0;
        bVar.f162084f = 0;
        bVar.f162083e = true;
        bVar.f162085g = 0;
        bVar.f162086h.clear();
        bVar.f162087i = -1;
        bVar.f162088j = -1;
        bVar.f162089k = -1;
        bVar.f162090l = 0;
        this.F.clear();
        this.f135191p = null;
        this.f135192q = null;
    }

    @Override // p3.m
    public final int a() {
        return this.T ? -this.J.f156384v : this.H.f156342i;
    }

    public final i2 a0() {
        i2 i2Var = this.L;
        return i2Var != null ? i2Var : b0(this.H.f156342i);
    }

    @Override // p3.m
    public final void apply(e23.p pVar, Object obj) {
        if (this.T) {
            t3.g gVar = this.P.f162091a;
            gVar.d(t3.d.g0.f162108c);
            t3.g.b.a(gVar, 0, obj);
            pVar.getClass();
            p005kotlin.jvm.internal.y0.e(2, pVar);
            t3.g.b.a(gVar, 1, pVar);
            return;
        }
        t3.b bVar = this.N;
        bVar.b();
        t3.g gVar2 = bVar.f162080b.f162078a;
        gVar2.d(t3.d.g0.f162108c);
        pVar.getClass();
        p005kotlin.jvm.internal.y0.e(2, pVar);
        t3.g.b.b(gVar2, 0, obj, 1, pVar);
    }

    @Override // p3.m
    public final boolean b() {
        p2 p2VarN0;
        return (this.T || this.f135201z || this.f135199x || (p2VarN0 = n0()) == null || (p2VarN0.f135217b & 8) != 0) ? false : true;
    }

    public final i2 b0(int i14) {
        i2 i2VarB;
        if (this.T && this.K) {
            int iG = this.J.f156384v;
            while (iG > 0) {
                if (this.J.s(iG) == 202 && p005kotlin.jvm.internal.s.g(this.J.t(iG), n.f135160c)) {
                    Object objQ = this.J.q(iG);
                    objQ.getClass();
                    i2 i2Var = (i2) objQ;
                    this.L = i2Var;
                    return i2Var;
                }
                s3.l lVar = this.J;
                iG = lVar.G(iG, lVar.f156364b);
            }
        }
        if (this.H.f156336c > 0) {
            while (i14 > 0) {
                if (this.H.i(i14) == 202) {
                    s3.h hVar = this.H;
                    if (p005kotlin.jvm.internal.s.g(hVar.p(i14, hVar.f156335b), n.f135160c)) {
                        p1.i0<i2> i0Var = this.f135198w;
                        if (i0Var == null || (i2VarB = i0Var.b(i14)) == null) {
                            s3.h hVar2 = this.H;
                            Object objB = hVar2.b(i14, hVar2.f156335b);
                            objB.getClass();
                            i2VarB = (i2) objB;
                        }
                        this.L = i2VarB;
                        return i2VarB;
                    }
                }
                i14 = this.H.q(i14);
            }
        }
        i2 i2Var2 = this.f135197v;
        this.L = i2Var2;
        return i2Var2;
    }

    @Override // p3.m
    public final void c() {
        if (!this.f135194s) {
            n.a("A call to createNode(), emitNode() or useNode() expected was not expected");
        }
        this.f135194s = false;
        if (this.T) {
            n.a("useNode() called while inserting");
        }
        s3.h hVar = this.H;
        Object objN = hVar.n(hVar.f156342i);
        t3.b bVar = this.N;
        bVar.c();
        bVar.f162086h.add(objN);
        if (this.f135201z && (objN instanceof i)) {
            bVar.b();
            bVar.f162080b.f162078a.d(t3.d.j0.f162114c);
        }
    }

    public final g4.a c0() {
        RandomAccess randomAccess;
        Object objP;
        if (!this.f135178c.l()) {
            return null;
        }
        q13.b bVarB = p13.w.b();
        s3.l lVar = this.J;
        bVarB.addAll(g4.c.a(lVar, null, lVar.f156382t, null));
        s3.h hVar = this.H;
        boolean z14 = hVar.f156339f;
        int[] iArr = hVar.f156335b;
        if (z14 || hVar.f156336c == 0) {
            randomAccess = p13.j0.f134944a;
        } else {
            g4.q qVar = new g4.q(hVar);
            int iQ = hVar.f156342i;
            Object objValueOf = Integer.valueOf(hVar.f156345l - s3.k.c(iQ, iArr));
            while (iQ >= 0) {
                if (hVar.k(iQ)) {
                    objP = hVar.p(iQ, iArr);
                } else {
                    m.f135153a.getClass();
                    objP = m.a.f135155b;
                }
                qVar.d(hVar.i(iQ), objP, hVar.f156334a.j(iQ), objValueOf);
                objValueOf = hVar.a(iQ);
                iQ = hVar.q(iQ);
            }
            randomAccess = qVar.f75732a;
        }
        bVarB.addAll(randomAccess);
        bVarB.addAll(V());
        return new g4.a(p13.w.a(bVarB), this.D);
    }

    @Override // p3.m
    public final void d(Object obj) {
        if (!this.T && this.H.g() == 207 && !p005kotlin.jvm.internal.s.g(this.H.f(), obj) && this.A < 0) {
            this.A = this.H.f156340g;
            this.f135201z = true;
        }
        r3.c.f149972b.getClass();
        F0(MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, null, obj, 0);
    }

    public final void d0() {
        z3.q.f202125a.getClass();
        Trace.beginSection("Compose:Composer.dispose");
        try {
            this.f135178c.x(this);
            this.F.clear();
            this.f135195t.clear();
            this.f135181f.a();
            this.f135198w = null;
            this.f135177b.clear();
            Unit unit = Unit.INSTANCE;
        } finally {
            z3.q.f202125a.getClass();
            Trace.endSection();
        }
    }

    @Override // p3.m
    public final void e() {
        if (this.f135188m != 0) {
            n.a("No nodes can be emitted before calling skipAndEndGroup");
        }
        if (this.T) {
            return;
        }
        p2 p2VarN0 = n0();
        if (p2VarN0 != null) {
            int i14 = p2VarN0.f135217b;
            if ((i14 & 128) == 0) {
                p2VarN0.f135217b = i14 | 16;
            }
        }
        if (this.f135195t.isEmpty()) {
            E0();
        } else {
            v0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0087 A[Catch: all -> 0x0060, TRY_LEAVE, TryCatch #0 {all -> 0x0060, blocks: (B:14:0x004d, B:16:0x0054, B:19:0x0062, B:22:0x0068, B:24:0x0075, B:25:0x0087), top: B:47:0x004d, outer: #1 }] */
    public final void e0(p1.t0<Object, Object> t0Var, e23.p<? super m, ? super Integer, Unit> pVar) {
        ArrayList arrayList = this.f135195t;
        if (this.G) {
            n.a("Reentrant composition is not supported");
        }
        this.f135183h.a();
        z3.q.f202125a.getClass();
        Trace.beginSection("Compose:recompose");
        try {
            this.C = Long.hashCode(f4.l.i().getF68737b());
            this.f135198w = null;
            L0(t0Var);
            this.f135187l = 0;
            this.G = true;
            try {
                J0();
                Object objS0 = s0();
                if (objS0 != pVar && pVar != null) {
                    O0(pVar);
                }
                c cVar = this.E;
                q3.c cVarE = p0.e();
                try {
                    cVarE.b(cVar);
                    if (pVar != null) {
                        H0(200, n.f135158a);
                        z3.k.b(this, pVar);
                        g0(false);
                    } else if (!this.f135199x || objS0 == null) {
                        D0();
                    } else {
                        m.f135153a.getClass();
                        if (objS0.equals(m.a.f135155b)) {
                            D0();
                        } else {
                            H0(200, n.f135158a);
                            p005kotlin.jvm.internal.y0.e(2, objS0);
                            z3.k.b(this, (e23.p) objS0);
                            g0(false);
                        }
                    }
                    cVarE.k(cVarE.f142358c - 1);
                    j0();
                    this.G = false;
                    arrayList.clear();
                    if (!this.J.f156385w) {
                        n.a("Check failed");
                    }
                    l0();
                    Unit unit = Unit.INSTANCE;
                    Trace.endSection();
                } catch (Throwable th3) {
                    cVarE.k(cVarE.f142358c - 1);
                    throw th3;
                }
            } catch (Throwable th4) {
                try {
                    jg.b.R(th4, new n0(0, this));
                    throw th4;
                } catch (Throwable th5) {
                    this.G = false;
                    arrayList.clear();
                    Y();
                    if (!this.J.f156385w) {
                        n.a("Check failed");
                    }
                    l0();
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            z3.q.f202125a.getClass();
            Trace.endSection();
            throw th6;
        }
    }

    @Override // p3.m
    public final void f() {
        g0(false);
    }

    public final void f0(int i14, int i15) {
        if (i14 <= 0 || i14 == i15) {
            return;
        }
        f0(this.H.q(i14), i15);
        if (this.H.l(i14)) {
            Object objN = this.H.n(i14);
            t3.b bVar = this.N;
            bVar.c();
            bVar.f162086h.add(objN);
        }
    }

    @Override // p3.m
    public final b g() {
        H0(MlKitException.CODE_SCANNER_PIPELINE_INFERENCE_ERROR, n.f135162e);
        if (this.T) {
            s3.l.z(this.J);
        }
        Object objS0 = s0();
        z2 c3Var = objS0 instanceof z2 ? (z2) objS0 : null;
        if (c3Var == null) {
            c3Var = new c3(new a(new b(this.U, this.f135193r, this.D, this.f135184i.f135248v)), -1);
            O0(c3Var);
        }
        y2 f135269a = c3Var.getF135269a();
        f135269a.getClass();
        b bVar = ((a) f135269a).f135202a;
        bVar.f135208f.setValue(a0());
        g0(false);
        return bVar;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x03aa  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v21 */
    /* JADX WARN: Type inference failed for: r5v22, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void g0(boolean z14) {
        long jRotateRight;
        u0 u0Var;
        int i14;
        ArrayList arrayList;
        int i15;
        ?? r14;
        int i16;
        u0 u0Var2;
        int i17;
        p1.u0 u0Var3;
        int i18;
        List<s3.e> list;
        ArrayList arrayList2;
        HashSet hashSet;
        int i19;
        int i24;
        int i25;
        Object[] objArr;
        long[] jArr;
        int i26;
        Object[] objArr2;
        long[] jArr2;
        int i27;
        Object[] objArr3;
        long[] jArr3;
        int i28;
        Object[] objArr4;
        long[] jArr4;
        long jRotateRight2;
        u0 u0Var4 = this.f135190o;
        int i29 = u0Var4.f135319a[u0Var4.f135320b - 2] - 1;
        boolean z15 = this.T;
        m.a aVar = m.f135153a;
        if (z15) {
            s3.l lVar = this.J;
            int i30 = lVar.f156384v;
            int iS = lVar.s(i30);
            Object objT = this.J.t(i30);
            Object objQ = this.J.q(i30);
            if (objT == null) {
                if (objQ != null && iS == 207) {
                    aVar.getClass();
                    if (!objQ.equals(m.a.f135155b)) {
                        this.U = Long.rotateRight(Long.rotateRight(this.U ^ ((long) i29), 3) ^ ((long) objQ.hashCode()), 3);
                    }
                }
                jRotateRight2 = Long.rotateRight(this.U ^ ((long) i29), 3) ^ ((long) iS);
            } else {
                jRotateRight2 = Long.rotateRight(this.U ^ ((long) 0), 3) ^ ((long) (objT instanceof Enum ? ((Enum) objT).ordinal() : objT.hashCode()));
            }
            this.U = Long.rotateRight(jRotateRight2, 3);
        } else {
            s3.h hVar = this.H;
            int i34 = hVar.f156342i;
            int i35 = hVar.i(i34);
            s3.h hVar2 = this.H;
            Object objP = hVar2.p(i34, hVar2.f156335b);
            s3.h hVar3 = this.H;
            Object objB = hVar3.b(i34, hVar3.f156335b);
            if (objP == null) {
                if (objB != null && i35 == 207) {
                    aVar.getClass();
                    if (!objB.equals(m.a.f135155b)) {
                        this.U = Long.rotateRight(Long.rotateRight(this.U ^ ((long) i29), 3) ^ ((long) objB.hashCode()), 3);
                    }
                }
                jRotateRight = Long.rotateRight(this.U ^ ((long) i29), 3) ^ ((long) i35);
            } else {
                jRotateRight = Long.rotateRight(this.U ^ ((long) 0), 3) ^ ((long) (objP instanceof Enum ? ((Enum) objP).ordinal() : objP.hashCode()));
            }
            this.U = Long.rotateRight(jRotateRight, 3);
        }
        int i36 = this.f135188m;
        r0 r0Var = this.f135186k;
        ArrayList arrayList3 = this.f135195t;
        t3.b bVar = this.N;
        if (r0Var != null) {
            p1.i0<r3.b> i0Var = r0Var.f135257e;
            int i37 = r0Var.f135254b;
            List<s3.e> list2 = r0Var.f135253a;
            if (list2.size() > 0) {
                ArrayList arrayList4 = r0Var.f135256d;
                HashSet hashSet2 = new HashSet(arrayList4.size());
                int size = arrayList4.size();
                for (int i38 = 0; i38 < size; i38++) {
                    hashSet2.add(arrayList4.get(i38));
                }
                i15 = -1;
                p1.u0 u0VarA = p1.i1.a();
                int size2 = arrayList4.size();
                int size3 = list2.size();
                i14 = 1;
                int i39 = 0;
                int i44 = 0;
                int i45 = 0;
                while (i39 < size3) {
                    s3.e eVar = list2.get(i39);
                    if (hashSet2.contains(eVar)) {
                        u0Var2 = u0Var4;
                        i17 = i39;
                        if (!u0VarA.a(eVar)) {
                            int i46 = i44;
                            if (i46 < size2) {
                                s3.e eVar2 = (s3.e) arrayList4.get(i46);
                                if (eVar2 != eVar) {
                                    r3.b bVarB = i0Var.b(eVar2.f156329c);
                                    int i47 = bVarB != null ? bVarB.f149970b : -1;
                                    u0VarA.d(eVar2);
                                    i24 = i45;
                                    if (i47 != i24) {
                                        r3.b bVarB2 = i0Var.b(eVar2.f156329c);
                                        int i48 = bVarB2 != null ? bVarB2.f149971c : eVar2.f156330d;
                                        u0Var3 = u0VarA;
                                        int i49 = i47 + i37;
                                        i18 = i37;
                                        int i54 = i24 + i18;
                                        if (i48 > 0) {
                                            list = list2;
                                            int i55 = bVar.f162090l;
                                            if (i55 > 0) {
                                                arrayList2 = arrayList4;
                                                if (bVar.f162088j == i49 - i55 && bVar.f162089k == i54 - i55) {
                                                    bVar.f162090l = i55 + i48;
                                                }
                                            } else {
                                                arrayList2 = arrayList4;
                                            }
                                            bVar.c();
                                            bVar.f162088j = i49;
                                            bVar.f162089k = i54;
                                            bVar.f162090l = i48;
                                        } else {
                                            list = list2;
                                            arrayList2 = arrayList4;
                                            bVar.getClass();
                                        }
                                        if (i47 <= i24) {
                                            int i56 = i48;
                                            arrayList3 = arrayList3;
                                            hashSet = hashSet2;
                                            i19 = size2;
                                            if (i24 > i47) {
                                                Object[] objArr5 = i0Var.f134774c;
                                                long[] jArr5 = i0Var.f134772a;
                                                int length = jArr5.length - 2;
                                                if (length >= 0) {
                                                    int i57 = 0;
                                                    while (true) {
                                                        long j8 = jArr5[i57];
                                                        if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                            int i58 = 8 - ((~(i57 - length)) >>> 31);
                                                            int i59 = 0;
                                                            while (i59 < i58) {
                                                                if ((j8 & 255) < 128) {
                                                                    objArr2 = objArr5;
                                                                    r3.b bVar2 = (r3.b) objArr5[(i57 << 3) + i59];
                                                                    jArr2 = jArr5;
                                                                    int i64 = bVar2.f149970b;
                                                                    i27 = i47;
                                                                    if (i47 <= i64 && i64 < i27 + i56) {
                                                                        bVar2.f149970b = (i64 - i27) + i24;
                                                                    } else if (i27 + 1 <= i64 && i64 < i24) {
                                                                        bVar2.f149970b = i64 - i56;
                                                                    }
                                                                } else {
                                                                    objArr2 = objArr5;
                                                                    jArr2 = jArr5;
                                                                    i27 = i47;
                                                                }
                                                                j8 >>= 8;
                                                                i59++;
                                                                jArr5 = jArr2;
                                                                objArr5 = objArr2;
                                                                i47 = i27;
                                                            }
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i26 = i47;
                                                            if (i58 != 8) {
                                                                break;
                                                            }
                                                        } else {
                                                            objArr = objArr5;
                                                            jArr = jArr5;
                                                            i26 = i47;
                                                        }
                                                        if (i57 == length) {
                                                            break;
                                                        }
                                                        i57++;
                                                        jArr5 = jArr;
                                                        objArr5 = objArr;
                                                        i47 = i26;
                                                    }
                                                }
                                            }
                                        } else {
                                            Object[] objArr6 = i0Var.f134774c;
                                            long[] jArr6 = i0Var.f134772a;
                                            int length2 = jArr6.length - 2;
                                            if (length2 >= 0) {
                                                hashSet = hashSet2;
                                                i19 = size2;
                                                int i65 = 0;
                                                while (true) {
                                                    long j14 = jArr6[i65];
                                                    int i66 = i48;
                                                    arrayList3 = arrayList3;
                                                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i67 = 8 - ((~(i65 - length2)) >>> 31);
                                                        int i68 = 0;
                                                        while (i68 < i67) {
                                                            if ((j14 & 255) < 128) {
                                                                i28 = i68;
                                                                r3.b bVar3 = (r3.b) objArr6[(i65 << 3) + i68];
                                                                objArr4 = objArr6;
                                                                int i69 = bVar3.f149970b;
                                                                jArr4 = jArr6;
                                                                if (i47 <= i69 && i69 < i47 + i66) {
                                                                    bVar3.f149970b = (i69 - i47) + i24;
                                                                } else if (i24 <= i69 && i69 < i47) {
                                                                    bVar3.f149970b = i69 + i66;
                                                                }
                                                            } else {
                                                                i28 = i68;
                                                                objArr4 = objArr6;
                                                                jArr4 = jArr6;
                                                            }
                                                            j14 >>= 8;
                                                            i68 = i28 + 1;
                                                            objArr6 = objArr4;
                                                            jArr6 = jArr4;
                                                        }
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                        if (i67 != 8) {
                                                            break;
                                                        }
                                                    } else {
                                                        objArr3 = objArr6;
                                                        jArr3 = jArr6;
                                                    }
                                                    if (i65 == length2) {
                                                        break;
                                                    }
                                                    i65++;
                                                    arrayList3 = arrayList3;
                                                    i48 = i66;
                                                    objArr6 = objArr3;
                                                    jArr6 = jArr3;
                                                }
                                            }
                                        }
                                        i25 = i17;
                                    } else {
                                        u0Var3 = u0VarA;
                                        i18 = i37;
                                        list = list2;
                                        arrayList2 = arrayList4;
                                    }
                                    hashSet = hashSet2;
                                    i19 = size2;
                                    i25 = i17;
                                } else {
                                    arrayList3 = arrayList3;
                                    u0Var3 = u0VarA;
                                    i18 = i37;
                                    list = list2;
                                    arrayList2 = arrayList4;
                                    hashSet = hashSet2;
                                    i19 = size2;
                                    i24 = i45;
                                    i25 = i17 + 1;
                                }
                                i44 = i46 + 1;
                                r3.b bVarB3 = i0Var.b(eVar2.f156329c);
                                int i74 = i24 + (bVarB3 != null ? bVarB3.f149971c : eVar2.f156330d);
                                i39 = i25;
                                r0Var = r0Var;
                                u0VarA = u0Var3;
                                i37 = i18;
                                list2 = list;
                                arrayList4 = arrayList2;
                                hashSet2 = hashSet;
                                size2 = i19;
                                arrayList3 = arrayList3;
                                i45 = i74;
                                u0Var4 = u0Var2;
                            } else {
                                i44 = i46;
                                u0Var4 = u0Var2;
                                i39 = i17;
                            }
                        }
                    } else {
                        u0Var2 = u0Var4;
                        r3.b bVarB4 = i0Var.b(eVar.f156329c);
                        int i75 = bVarB4 != null ? bVarB4.f149970b : -1;
                        int i76 = eVar.f156329c;
                        i17 = i39;
                        bVar.f(i75 + i37, eVar.f156330d);
                        r0Var.a(i76, 0);
                        bVar.f162084f = (i76 - bVar.f162079a.H.f156340g) + bVar.f162084f;
                        this.H.r(i76);
                        w0();
                        this.H.s();
                        p0.a(arrayList3, i76, s3.k.a(i76, this.H.f156335b) + i76);
                    }
                    i39 = i17 + 1;
                    u0Var4 = u0Var2;
                }
                u0Var = u0Var4;
                arrayList = arrayList3;
                bVar.c();
                if (list2.size() > 0) {
                    s3.h hVar4 = this.H;
                    bVar.f162084f = (hVar4.f156341h - bVar.f162079a.H.f156340g) + bVar.f162084f;
                    hVar4.t();
                }
            } else {
                u0Var = u0Var4;
                i14 = 1;
                arrayList = arrayList3;
                i15 = -1;
            }
        } else {
            u0Var = u0Var4;
            i14 = 1;
            arrayList = arrayList3;
            i15 = -1;
        }
        boolean z16 = this.T;
        if (!z16) {
            s3.h hVar5 = this.H;
            int i77 = hVar5.f156346m - hVar5.f156345l;
            if (i77 > 0) {
                if (i77 > 0) {
                    bVar.d(false);
                    bVar.e();
                    t3.g gVar = bVar.f162080b.f162078a;
                    gVar.d(t3.d.d0.f162102c);
                    gVar.f162135c[gVar.f162136d - gVar.f162133a[gVar.f162134b - 1].f162093a] = i77;
                } else {
                    bVar.getClass();
                }
            }
        }
        int i78 = this.f135187l;
        while (true) {
            s3.h hVar6 = this.H;
            if (hVar6.f156344k > 0 || (i16 = hVar6.f156340g) == hVar6.f156341h) {
                break;
            }
            w0();
            bVar.f(i78, this.H.s());
            p0.a(arrayList, i16, this.H.f156340g);
        }
        if (z16) {
            if (z14) {
                t3.c cVar = this.P;
                t3.g gVar2 = cVar.f162092b;
                if (gVar2.f162134b == 0) {
                    n.a("Cannot end node insertion, there are no pending operations that can be realized.");
                }
                t3.g gVar3 = cVar.f162091a;
                t3.d[] dVarArr = gVar2.f162133a;
                int i79 = gVar2.f162134b - 1;
                gVar2.f162134b = i79;
                t3.d dVar = dVarArr[i79];
                dVarArr[i79] = null;
                gVar3.d(dVar);
                Object[] objArr7 = gVar2.f162137e;
                Object[] objArr8 = gVar3.f162137e;
                int i84 = gVar3.f162138f;
                int i85 = dVar.f162094b;
                int i86 = gVar2.f162138f;
                int i87 = i86 - i85;
                System.arraycopy(objArr7, i87, objArr8, i84 - i85, i86 - i87);
                Object[] objArr9 = gVar2.f162137e;
                int i88 = gVar2.f162138f;
                p13.s.m(i88 - i85, i88, null, objArr9);
                int[] iArr = gVar2.f162135c;
                int[] iArr2 = gVar3.f162135c;
                int i89 = gVar3.f162136d;
                int i93 = dVar.f162093a;
                int i94 = gVar2.f162136d;
                p13.s.d(i89 - i93, i94 - i93, i94, iArr, iArr2);
                gVar2.f162138f -= i85;
                gVar2.f162136d -= i93;
                i36 = i14;
            }
            s3.h hVar7 = this.H;
            if (hVar7.f156344k <= 0) {
                j2.a("Unbalanced begin/end empty");
            }
            hVar7.f156344k--;
            s3.l lVar2 = this.J;
            int i95 = lVar2.f156384v;
            lVar2.j();
            if (this.H.f156344k <= 0) {
                int i96 = (-2) - i95;
                this.J.k();
                this.J.e(i14);
                s3.b bVar4 = this.O;
                boolean zC = this.P.f162091a.c();
                s3.i iVar = this.I;
                if (zC) {
                    bVar.b();
                    r14 = 0;
                    bVar.d(false);
                    bVar.e();
                    bVar.c();
                    t3.g gVar4 = bVar.f162080b.f162078a;
                    gVar4.d(t3.d.p.f162120c);
                    t3.g.b.b(gVar4, 0, bVar4, 1, iVar);
                } else {
                    t3.c cVar2 = this.P;
                    bVar.b();
                    bVar.d(false);
                    bVar.e();
                    bVar.c();
                    t3.g gVar5 = bVar.f162080b.f162078a;
                    gVar5.d(t3.d.q.f162121c);
                    t3.g.b.c(gVar5, bVar4, iVar, cVar2);
                    this.P = new t3.c();
                    r14 = 0;
                }
                this.T = r14;
                if (this.f135179d.f156349b != 0) {
                    M0(i96, r14);
                    N0(i96, i36);
                }
            }
        } else {
            if (z14) {
                bVar.a();
            }
            int i97 = bVar.f162079a.H.f156342i;
            u0 u0Var5 = bVar.f162082d;
            int i98 = i15;
            if (u0Var5.a(i98) > i97) {
                n.a("Missed recording an endGroup");
            }
            if (u0Var5.a(i98) == i97) {
                bVar.d(false);
                u0Var5.b();
                bVar.f162080b.f162078a.d(t3.d.j.f162113c);
            }
            int i99 = this.H.f156342i;
            if (i36 != P0(i99)) {
                N0(i99, i36);
            }
            if (z14) {
                i36 = 1;
            }
            this.H.e();
            bVar.c();
        }
        ArrayList<r0> arrayList5 = this.f135185j;
        r0 r0VarRemove = arrayList5.remove(arrayList5.size() - 1);
        if (r0VarRemove != null && !z16) {
            r0VarRemove.f135255c++;
        }
        this.f135186k = r0VarRemove;
        this.f135187l = u0Var.b() + i36;
        this.f135189n = u0Var.b();
        this.f135188m = u0Var.b() + i36;
    }

    @Override // p3.m
    public final boolean h(boolean z14) {
        Object objS0 = s0();
        if ((objS0 instanceof Boolean) && z14 == ((Boolean) objS0).booleanValue()) {
            return false;
        }
        O0(Boolean.valueOf(z14));
        return true;
    }

    public final void h0() {
        g0(false);
        p2 p2VarN0 = n0();
        if (p2VarN0 != null) {
            int i14 = p2VarN0.f135217b;
            if ((i14 & 1) != 0) {
                p2VarN0.f135217b = i14 | 2;
            }
        }
    }

    @Override // p3.m
    public final boolean i(float f14) {
        Object objS0 = s0();
        if ((objS0 instanceof Float) && f14 == ((Number) objS0).floatValue()) {
            return false;
        }
        O0(Float.valueOf(f14));
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x007e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0080 A[LOOP:0: B:15:0x003e->B:27:0x0080, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0083 A[EDGE_INSN: B:28:0x0083->B:29:0x0084 BREAK  A[LOOP:0: B:15:0x003e->B:27:0x0080]] */
    /* JADX WARN: Code duplicated, block: B:57:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:62:0x0083 A[SYNTHETIC] */
    public final p2 i0() {
        p2 p2Var;
        s3.b bVarA;
        ct2.e eVar;
        ArrayList<p2> arrayList = this.F;
        p2 p2VarRemove = !arrayList.isEmpty() ? arrayList.remove(arrayList.size() - 1) : null;
        if (p2VarRemove != null) {
            p2VarRemove.f135217b &= -9;
            this.f135183h.a();
            int i14 = this.C;
            p1.p0<Object> p0Var = p2VarRemove.f135221f;
            if (p0Var == null || (p2VarRemove.f135217b & 16) != 0) {
                eVar = null;
                break;
            }
            Object[] objArr = p0Var.f134874b;
            int[] iArr = p0Var.f134875c;
            long[] jArr = p0Var.f134873a;
            int length = jArr.length - 2;
            if (length < 0) {
                eVar = null;
                break;
            }
            int i15 = 0;
            loop0: while (true) {
                long j8 = jArr[i15];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((j8 & 255) < 128) {
                            int i18 = (i15 << 3) + i17;
                            Object obj = objArr[i18];
                            if (iArr[i18] != i14) {
                                eVar = new ct2.e(p2VarRemove, i14, p0Var, 5);
                                break loop0;
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i16 == 8) {
                        if (i15 == length) {
                            i15++;
                        }
                    }
                    eVar = null;
                    break;
                }
                if (i15 == length) {
                    eVar = null;
                    break;
                }
                i15++;
            }
            t3.b bVar = this.N;
            if (eVar != null) {
                t3.g gVar = bVar.f162080b.f162078a;
                gVar.d(t3.d.i.f162111c);
                t3.g.b.b(gVar, 0, eVar, 1, this.f135184i);
            }
            int i19 = p2VarRemove.f135217b;
            if ((i19 & 512) != 0) {
                p2VarRemove.f135217b = i19 & (-513);
                t3.g gVar2 = bVar.f162080b.f162078a;
                gVar2.d(t3.d.l.f162116c);
                t3.g.b.a(gVar2, 0, p2VarRemove);
                int i24 = p2VarRemove.f135217b;
                p2VarRemove.f135217b = i24 & (-129);
                if ((i24 & 1024) != 0) {
                    p2VarRemove.f135217b = i24 & (-1153);
                    if (this.A == this.H.f156342i) {
                        this.f135201z = false;
                        this.A = -1;
                    }
                }
            }
        }
        if (p2VarRemove != null) {
            int i25 = p2VarRemove.f135217b;
            if ((i25 & 16) == 0 && ((i25 & 1) != 0 || this.f135193r)) {
                if (p2VarRemove.f135218c == null) {
                    if (this.T) {
                        s3.l lVar = this.J;
                        bVarA = lVar.b(lVar.f156384v);
                    } else {
                        s3.h hVar = this.H;
                        bVarA = hVar.a(hVar.f156342i);
                    }
                    p2VarRemove.f135218c = bVarA;
                }
                p2VarRemove.f135217b &= -5;
                p2Var = p2VarRemove;
            } else {
                p2Var = null;
            }
        } else {
            p2Var = null;
        }
        g0(false);
        return p2Var;
    }

    @Override // p3.m
    public final void j() {
        this.f135201z = this.A >= 0;
    }

    public final void j0() {
        g0(false);
        this.f135178c.d();
        g0(false);
        t3.b bVar = this.N;
        if (bVar.f162081c) {
            bVar.d(false);
            bVar.d(false);
            bVar.f162080b.f162078a.d(t3.d.j.f162113c);
            bVar.f162081c = false;
        }
        bVar.b();
        if (bVar.f162082d.f135320b != 0) {
            n.a("Missed recording an endGroup()");
        }
        if (!this.f135185j.isEmpty()) {
            n.a("Start/end imbalance");
        }
        Z();
        this.H.c();
        this.f135199x = this.f135200y.b() != 0;
    }

    @Override // p3.m
    public final boolean k(int i14) {
        Object objS0 = s0();
        if ((objS0 instanceof Integer) && i14 == ((Number) objS0).intValue()) {
            return false;
        }
        O0(Integer.valueOf(i14));
        return true;
    }

    public final void k0(boolean z14, r0 r0Var) {
        this.f135185j.add(this.f135186k);
        this.f135186k = r0Var;
        int i14 = this.f135188m;
        u0 u0Var = this.f135190o;
        u0Var.c(i14);
        u0Var.c(this.f135189n);
        u0Var.c(this.f135187l);
        if (z14) {
            this.f135187l = 0;
        }
        this.f135188m = 0;
        this.f135189n = 0;
    }

    @Override // p3.m
    public final boolean l(long j8) {
        Object objS0 = s0();
        if ((objS0 instanceof Long) && j8 == ((Number) objS0).longValue()) {
            return false;
        }
        O0(Long.valueOf(j8));
        return true;
    }

    public final void l0() {
        s3.i iVar = new s3.i();
        if (this.D) {
            iVar.d();
        }
        int i14 = 1;
        if (this.f135178c.e()) {
            iVar.f156358k = new p1.i0<>(0, i14, null);
        }
        this.I = iVar;
        s3.l lVarH = iVar.h();
        lVarH.e(true);
        this.J = lVarH;
    }

    @Override // p3.m
    public final boolean m(double d14) {
        Object objS0 = s0();
        if ((objS0 instanceof Double) && d14 == ((Number) objS0).doubleValue()) {
            return false;
        }
        O0(Double.valueOf(d14));
        return true;
    }

    public final g4.g m0() {
        q0 q0Var = this.V;
        if (q0Var != null) {
            return q0Var;
        }
        q0 q0Var2 = new q0(this.f135184i);
        this.V = q0Var2;
        return q0Var2;
    }

    @Override // p3.m
    public final boolean n(int i14, boolean z14) {
        p2 p2VarN0;
        if ((i14 & 1) == 0 && (this.T || this.f135201z)) {
            e3 e3Var = this.Q;
            if (e3Var != null && (p2VarN0 = n0()) != null && e3Var.c()) {
                int i15 = p2VarN0.f135217b;
                if ((i15 & 512) != 0) {
                    return true;
                }
                int i16 = i15 | 1;
                p2VarN0.f135217b = i16;
                p2VarN0.f135217b = (this.f135201z ? i15 | 129 : i16 & (-129)) | 256;
                t3.g gVar = this.N.f162080b.f162078a;
                gVar.d(t3.d.w.f162127c);
                t3.g.b.a(gVar, 0, p2VarN0);
                this.f135178c.t(p2VarN0);
                return false;
            }
        } else if (!z14 && b()) {
            return false;
        }
        return true;
    }

    public final p2 n0() {
        if (this.B != 0) {
            return null;
        }
        ArrayList<p2> arrayList = this.F;
        if (arrayList.isEmpty()) {
            return null;
        }
        return (p2) am.j.f(1, arrayList);
    }

    @Override // p3.m
    public final p2 o() {
        return n0();
    }

    public final boolean o0() {
        if (!b() || this.f135199x) {
            return true;
        }
        p2 p2VarN0 = n0();
        return (p2VarN0 == null || (p2VarN0.f135217b & 4) == 0) ? false : true;
    }

    @Override // p3.m
    public final void p() {
        if (this.f135201z && this.H.f156342i == this.A) {
            this.A = -1;
            this.f135201z = false;
        }
        g0(false);
    }

    /* JADX WARN: Code duplicated, block: B:67:0x014b A[Catch: all -> 0x00c0, TryCatch #1 {all -> 0x00c0, blocks: (B:8:0x0017, B:10:0x0028, B:12:0x0063, B:14:0x006b, B:16:0x0071, B:17:0x0076, B:18:0x0079, B:27:0x00b4, B:95:0x0226, B:36:0x00cb, B:37:0x00ce, B:38:0x00cf, B:40:0x00d6, B:42:0x00da, B:45:0x00e2, B:48:0x00ec, B:50:0x00f0, B:51:0x00f5, B:55:0x00ff, B:57:0x010c, B:63:0x012c, B:65:0x0142, B:67:0x014b, B:69:0x0156, B:71:0x0167, B:73:0x016d, B:75:0x0180, B:94:0x0223, B:126:0x027b, B:127:0x027e, B:129:0x0280, B:130:0x0283, B:62:0x012a, B:58:0x011a, B:54:0x00fa, B:131:0x0284, B:64:0x0139), top: B:140:0x0017, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x0156 A[Catch: all -> 0x00c0, TryCatch #1 {all -> 0x00c0, blocks: (B:8:0x0017, B:10:0x0028, B:12:0x0063, B:14:0x006b, B:16:0x0071, B:17:0x0076, B:18:0x0079, B:27:0x00b4, B:95:0x0226, B:36:0x00cb, B:37:0x00ce, B:38:0x00cf, B:40:0x00d6, B:42:0x00da, B:45:0x00e2, B:48:0x00ec, B:50:0x00f0, B:51:0x00f5, B:55:0x00ff, B:57:0x010c, B:63:0x012c, B:65:0x0142, B:67:0x014b, B:69:0x0156, B:71:0x0167, B:73:0x016d, B:75:0x0180, B:94:0x0223, B:126:0x027b, B:127:0x027e, B:129:0x0280, B:130:0x0283, B:62:0x012a, B:58:0x011a, B:54:0x00fa, B:131:0x0284, B:64:0x0139), top: B:140:0x0017, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0165  */
    /* JADX WARN: Code duplicated, block: B:73:0x016d A[Catch: all -> 0x00c0, TryCatch #1 {all -> 0x00c0, blocks: (B:8:0x0017, B:10:0x0028, B:12:0x0063, B:14:0x006b, B:16:0x0071, B:17:0x0076, B:18:0x0079, B:27:0x00b4, B:95:0x0226, B:36:0x00cb, B:37:0x00ce, B:38:0x00cf, B:40:0x00d6, B:42:0x00da, B:45:0x00e2, B:48:0x00ec, B:50:0x00f0, B:51:0x00f5, B:55:0x00ff, B:57:0x010c, B:63:0x012c, B:65:0x0142, B:67:0x014b, B:69:0x0156, B:71:0x0167, B:73:0x016d, B:75:0x0180, B:94:0x0223, B:126:0x027b, B:127:0x027e, B:129:0x0280, B:130:0x0283, B:62:0x012a, B:58:0x011a, B:54:0x00fa, B:131:0x0284, B:64:0x0139), top: B:140:0x0017, inners: #15 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x017e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0211 A[Catch: all -> 0x023e, TRY_LEAVE, TryCatch #14 {all -> 0x023e, blocks: (B:90:0x0206, B:92:0x0211, B:118:0x0269, B:119:0x026b), top: B:165:0x0206 }] */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final void p0(ArrayList arrayList) {
        i1 i1Var;
        s3.b bVar;
        s3.b bVarF;
        ArrayList arrayList2;
        s3.h hVarG;
        s3.h hVarG2;
        s3.h hVar;
        int[] iArr;
        p1.i0<i2> i0Var;
        p1.i0<i2> i0Var2;
        int[] iArr2;
        t3.a aVar;
        t3.a aVar2;
        t3.a aVar3;
        boolean z14;
        p005kotlin.jvm.internal.j jVar;
        t3.a aVar4;
        h3 h3Var;
        s3.h hVar2;
        o0 o0Var = this;
        s3.i iVar = o0Var.f135179d;
        p pVar = o0Var.f135178c;
        g gVar = o0Var.f135182g;
        p005kotlin.jvm.internal.j jVar2 = null;
        t3.a aVar5 = gVar instanceof t3.a ? (t3.a) gVar : null;
        if (aVar5 == null) {
            n.b("Inconsistent composition");
            o2.c.f();
            return;
        }
        t3.b bVar2 = o0Var.N;
        t3.a aVar6 = bVar2.f162080b;
        try {
            bVar2.f162080b = aVar5;
            aVar5.f162078a.d(t3.d.z.f162130c);
            int size = arrayList.size();
            int i14 = 0;
            int i15 = 0;
            while (i15 < size) {
                o13.p pVar2 = (o13.p) arrayList.get(i15);
                j1 j1Var = (j1) pVar2.f128594a;
                j1 j1Var2 = (j1) pVar2.f128595b;
                s3.b bVarF2 = oc.b.f(j1Var.f135127e);
                s3.i iVarE = s3.k.e(j1Var.f135126d);
                int iC = iVarE.c(bVarF2);
                int i16 = size;
                z3.g gVar2 = new z3.g(i14, 1, jVar2);
                bVar2.b();
                t3.g gVar3 = bVar2.f162080b.f162078a;
                gVar3.d(t3.d.g.f162107c);
                t3.g.b.b(gVar3, i14, gVar2, 1, bVarF2);
                if (j1Var2 == null) {
                    if (iVarE.equals(o0Var.I)) {
                        if (!o0Var.J.f156385w) {
                            n.a("Check failed");
                        }
                        o0Var.l0();
                    }
                    s3.h hVarG3 = iVarE.g();
                    try {
                        hVarG3.r(iC);
                        bVar2.f162084f = iC;
                        t3.a aVar7 = new t3.a();
                        ok0.d dVar = new ok0.d(o0Var, aVar7, hVarG3, j1Var, 4);
                        hVar2 = hVarG3;
                        try {
                            o0Var = this;
                            try {
                                o0Var.u0(null, null, null, p13.j0.f134944a, dVar);
                                t3.a aVar8 = bVar2.f162080b;
                                aVar8.getClass();
                                if (!aVar7.b()) {
                                    t3.g gVar4 = aVar8.f162078a;
                                    gVar4.d(t3.d.c.f162099c);
                                    t3.g.b.b(gVar4, i14, aVar7, 1, gVar2);
                                }
                                Unit unit = Unit.INSTANCE;
                                hVar2.c();
                                pVar = pVar;
                                jVar = null;
                            } catch (Throwable th3) {
                                th = th3;
                                hVar2.c();
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } catch (Throwable th5) {
                        th = th5;
                        hVar2 = hVarG3;
                    }
                } else {
                    i1 i1VarP = pVar.p(j1Var2);
                    s3.i iVarE2 = (i1VarP == null || (h3Var = i1VarP.f135114a) == null) ? null : s3.k.e(h3Var);
                    s3.i iVarE3 = iVarE2 == null ? s3.k.e(j1Var2.f135126d) : iVarE2;
                    try {
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                try {
                                                                    if (iVarE2 != null) {
                                                                        if (iVarE2.f156354g) {
                                                                            n.a("use active SlotWriter to create an anchor location instead");
                                                                        }
                                                                        if (iVarE2.f156349b <= 0) {
                                                                            j2.a("Parameter index is out of range");
                                                                        }
                                                                        ArrayList<s3.b> arrayList3 = iVarE2.f156356i;
                                                                        i1Var = i1VarP;
                                                                        int iF = s3.k.f(arrayList3, 0, iVarE2.f156349b);
                                                                        if (iF < 0) {
                                                                            bVar = new s3.b(0);
                                                                            arrayList3.add(-(iF + 1), (s3.b) bVar);
                                                                        } else {
                                                                            bVar = arrayList3.get(iF);
                                                                        }
                                                                        if (bVar != null) {
                                                                        }
                                                                        bVarF = oc.b.f(bVar);
                                                                        arrayList2 = new ArrayList();
                                                                        hVarG = iVarE3.g();
                                                                        p0.d(hVarG, arrayList2, iVarE3.c(bVarF));
                                                                        Unit unit2 = Unit.INSTANCE;
                                                                        hVarG.c();
                                                                        if (arrayList2.isEmpty()) {
                                                                            bVarF = bVarF;
                                                                        } else {
                                                                            aVar4 = bVar2.f162080b;
                                                                            aVar4.getClass();
                                                                            if (!arrayList2.isEmpty()) {
                                                                                t3.g gVar5 = aVar4.f162078a;
                                                                                gVar5.d(t3.d.C3057d.f162101c);
                                                                                t3.g.b.b(gVar5, 1, arrayList2, 0, gVar2);
                                                                            }
                                                                            if (iVarE.equals(iVar)) {
                                                                                int iC2 = iVar.c(bVarF2);
                                                                                o0Var.M0(iC2, o0Var.P0(iC2) + arrayList2.size());
                                                                            }
                                                                        }
                                                                        t3.g gVar6 = bVar2.f162080b.f162078a;
                                                                        gVar6.d(t3.d.e.f162103c);
                                                                        int i17 = gVar6.f162138f - gVar6.f162133a[gVar6.f162134b - 1].f162094b;
                                                                        Object[] objArr = gVar6.f162137e;
                                                                        objArr[i17] = i1Var;
                                                                        objArr[i17 + 1] = pVar;
                                                                        objArr[i17 + 3] = j1Var;
                                                                        objArr[i17 + 2] = j1Var2;
                                                                        hVarG2 = iVarE3.g();
                                                                        hVar = o0Var.H;
                                                                        iArr = o0Var.f135191p;
                                                                        i0Var = o0Var.f135198w;
                                                                        o0Var.f135191p = null;
                                                                        o0Var.f135198w = null;
                                                                        o0Var.H = hVarG2;
                                                                        int iC3 = iVarE3.c(oc.b.f(bVarF));
                                                                        hVarG2.r(iC3);
                                                                        bVar2.f162084f = iC3;
                                                                        aVar = new t3.a();
                                                                        aVar2 = bVar2.f162080b;
                                                                        bVar2.f162080b = aVar;
                                                                        z14 = bVar2.f162083e;
                                                                        bVar2.f162083e = false;
                                                                        c0 c0Var = j1Var2.f135125c;
                                                                        c0 c0Var2 = j1Var.f135125c;
                                                                        Integer numValueOf = Integer.valueOf(hVarG2.f156340g);
                                                                        hVarG2 = hVarG2;
                                                                        i0Var2 = i0Var;
                                                                        aVar3 = aVar2;
                                                                        jVar = null;
                                                                        iArr2 = iArr;
                                                                        o0Var.u0(c0Var, c0Var2, numValueOf, j1Var2.f135128f, new oe.j(26, o0Var, j1Var));
                                                                        bVar2.f162083e = z14;
                                                                        bVar2.f162080b = aVar3;
                                                                        aVar3.getClass();
                                                                        if (!aVar.b()) {
                                                                            t3.g gVar7 = aVar3.f162078a;
                                                                            gVar7.d(t3.d.c.f162099c);
                                                                            t3.g.b.b(gVar7, 0, aVar, 1, gVar2);
                                                                        }
                                                                        o0Var.H = hVar;
                                                                        o0Var.f135191p = iArr2;
                                                                        o0Var.f135198w = i0Var2;
                                                                        hVarG2.c();
                                                                    } else {
                                                                        i1Var = i1VarP;
                                                                        pVar = pVar;
                                                                    }
                                                                    o0Var.H = hVar;
                                                                    o0Var.f135191p = iArr2;
                                                                    o0Var.f135198w = i0Var2;
                                                                    hVarG2.c();
                                                                } catch (Throwable th6) {
                                                                    th = th6;
                                                                    hVarG2.c();
                                                                    throw th;
                                                                }
                                                                bVar2.f162080b = aVar3;
                                                                aVar3.getClass();
                                                                if (!aVar.b()) {
                                                                    t3.g gVar8 = aVar3.f162078a;
                                                                    gVar8.d(t3.d.c.f162099c);
                                                                    t3.g.b.b(gVar8, 0, aVar, 1, gVar2);
                                                                }
                                                            } catch (Throwable th7) {
                                                                th = th7;
                                                                o0Var.H = hVar;
                                                                o0Var.f135191p = iArr2;
                                                                o0Var.f135198w = i0Var2;
                                                                throw th;
                                                            }
                                                            bVar2.f162083e = z14;
                                                        } catch (Throwable th8) {
                                                            th = th8;
                                                            bVar2.f162080b = aVar3;
                                                            throw th;
                                                        }
                                                        o0Var.u0(c0Var, c0Var2, numValueOf, j1Var2.f135128f, new oe.j(26, o0Var, j1Var));
                                                    } catch (Throwable th9) {
                                                        th = th9;
                                                        bVar2.f162083e = z14;
                                                        throw th;
                                                    }
                                                    hVarG2 = hVarG2;
                                                    i0Var2 = i0Var;
                                                    aVar3 = aVar2;
                                                    jVar = null;
                                                    iArr2 = iArr;
                                                } catch (Throwable th10) {
                                                    th = th10;
                                                    i0Var2 = i0Var;
                                                    aVar3 = aVar2;
                                                    iArr2 = iArr;
                                                    bVar2.f162083e = z14;
                                                    throw th;
                                                }
                                                c0 c0Var3 = j1Var.f135125c;
                                                Integer numValueOf2 = Integer.valueOf(hVarG2.f156340g);
                                            } catch (Throwable th11) {
                                                th = th11;
                                                aVar3 = aVar2;
                                                i0Var2 = i0Var;
                                            }
                                            c0 c0Var4 = j1Var2.f135125c;
                                        } catch (Throwable th12) {
                                            th = th12;
                                            i0Var2 = i0Var;
                                            aVar3 = aVar2;
                                        }
                                        bVar2.f162083e = false;
                                    } catch (Throwable th13) {
                                        th = th13;
                                        i0Var2 = i0Var;
                                        aVar3 = aVar2;
                                        hVarG2 = hVarG2;
                                        iArr2 = iArr;
                                    }
                                    bVar2.f162080b = aVar;
                                    z14 = bVar2.f162083e;
                                } catch (Throwable th14) {
                                    th = th14;
                                    i0Var2 = i0Var;
                                    aVar3 = aVar2;
                                    hVarG2 = hVarG2;
                                    iArr2 = iArr;
                                }
                                o0Var.H = hVarG2;
                                int iC4 = iVarE3.c(oc.b.f(bVarF));
                                hVarG2.r(iC4);
                                bVar2.f162084f = iC4;
                                aVar = new t3.a();
                                aVar2 = bVar2.f162080b;
                            } catch (Throwable th15) {
                                th = th15;
                                i0Var2 = i0Var;
                                hVarG2 = hVarG2;
                                iArr2 = iArr;
                            }
                            hVar = o0Var.H;
                            iArr = o0Var.f135191p;
                            i0Var = o0Var.f135198w;
                            o0Var.f135191p = null;
                            o0Var.f135198w = null;
                        } catch (Throwable th16) {
                            th = th16;
                            hVarG2 = hVarG2;
                        }
                        p0.d(hVarG, arrayList2, iVarE3.c(bVarF));
                        Unit unit3 = Unit.INSTANCE;
                        hVarG.c();
                        if (arrayList2.isEmpty()) {
                            aVar4 = bVar2.f162080b;
                            aVar4.getClass();
                            if (!arrayList2.isEmpty()) {
                                t3.g gVar9 = aVar4.f162078a;
                                gVar9.d(t3.d.C3057d.f162101c);
                                t3.g.b.b(gVar9, 1, arrayList2, 0, gVar2);
                            }
                            if (iVarE.equals(iVar)) {
                                int iC5 = iVar.c(bVarF2);
                                o0Var.M0(iC5, o0Var.P0(iC5) + arrayList2.size());
                            }
                        } else {
                            bVarF = bVarF;
                        }
                        t3.g gVar10 = bVar2.f162080b.f162078a;
                        gVar10.d(t3.d.e.f162103c);
                        int i18 = gVar10.f162138f - gVar10.f162133a[gVar10.f162134b - 1].f162094b;
                        Object[] objArr2 = gVar10.f162137e;
                        objArr2[i18] = i1Var;
                        objArr2[i18 + 1] = pVar;
                        objArr2[i18 + 3] = j1Var;
                        objArr2[i18 + 2] = j1Var2;
                        hVarG2 = iVarE3.g();
                    } catch (Throwable th17) {
                        hVarG.c();
                        throw th17;
                    }
                    bVar = j1Var2.f135127e;
                    bVarF = oc.b.f(bVar);
                    arrayList2 = new ArrayList();
                    hVarG = iVarE3.g();
                }
                bVar2.f162080b.f162078a.d(t3.d.b0.f162098c);
                i15++;
                size = i16;
                iVar = iVar;
                jVar2 = jVar;
                pVar = pVar;
                i14 = 0;
            }
            bVar2.b();
            bVar2.f162080b.f162078a.d(t3.d.k.f162115c);
            bVar2.f162084f = 0;
            bVar2.f162080b = aVar6;
        } catch (Throwable th18) {
            bVar2.f162080b = aVar6;
            throw th18;
        }
    }

    @Override // p3.m
    public final Object q() {
        boolean z14 = this.T;
        m.a aVar = m.f135153a;
        if (z14) {
            if (this.f135194s) {
                n.a("A call to createNode(), emitNode() or useNode() expected");
            }
            aVar.getClass();
            return m.a.f135155b;
        }
        Object objM = this.H.m();
        if (!this.f135201z || (objM instanceof c3)) {
            return objM instanceof z2 ? ((z2) objM).getF135269a() : objM;
        }
        aVar.getClass();
        return m.a.f135155b;
    }

    public final void q0(ArrayList arrayList) {
        z3.q.f202125a.getClass();
        Trace.beginSection("Compose:insertMovableContent");
        try {
            try {
                p0(arrayList);
                Z();
                Unit unit = Unit.INSTANCE;
                Trace.endSection();
            } catch (Throwable th3) {
                Y();
                throw th3;
            }
        } catch (Throwable th4) {
            z3.q.f202125a.getClass();
            Trace.endSection();
            throw th4;
        }
    }

    @Override // p3.m
    public final boolean r(Object obj) {
        if (s0() == obj) {
            return false;
        }
        O0(obj);
        return true;
    }

    public final void r0(h1<Object> h1Var, i2 i2Var, Object obj, boolean z14) {
        N(126665345, h1Var);
        s0();
        O0(obj);
        long j8 = this.U;
        try {
            this.U = 126665345;
            if (this.T) {
                s3.l.z(this.J);
            }
            boolean z15 = (this.T || p005kotlin.jvm.internal.s.g(this.H.f(), i2Var)) ? false : true;
            if (z15) {
                x0(i2Var);
            }
            x1 x1Var = n.f135160c;
            r3.c.f149972b.getClass();
            F0(202, x1Var, i2Var, 0);
            this.L = null;
            if (!this.T || z14) {
                boolean z16 = this.f135199x;
                this.f135199x = z15;
                z3.k.b(this, new z3.e(-59194059, true, new oo0.f(7, h1Var, obj)));
                this.f135199x = z16;
            } else {
                this.K = true;
                s3.l lVar = this.J;
                this.f135178c.m(new j1(h1Var, obj, this.f135184i, this.I, lVar.b(lVar.G(lVar.f156384v, lVar.f156364b)), p13.j0.f134944a, a0(), null));
            }
            g0(false);
            this.L = null;
            this.U = j8;
            g0(false);
        } catch (Throwable th3) {
            try {
                jg.b.R(th3, new n0(1, this));
                throw th3;
            } catch (Throwable th4) {
                g0(false);
                this.L = null;
                this.U = j8;
                g0(false);
                throw th4;
            }
        }
    }

    @Override // p3.m
    public final void s(h1<?> h1Var, Object obj) {
        r0(h1Var, a0(), obj, false);
    }

    public final Object s0() {
        boolean z14 = this.T;
        m.a aVar = m.f135153a;
        if (z14) {
            if (this.f135194s) {
                n.a("A call to createNode(), emitNode() or useNode() expected");
            }
            aVar.getClass();
            return m.a.f135155b;
        }
        Object objM = this.H.m();
        if (!this.f135201z || (objM instanceof c3)) {
            return objM;
        }
        aVar.getClass();
        return m.a.f135155b;
    }

    @Override // p3.m
    public final void t(o2 o2Var) {
        p2 p2Var = o2Var instanceof p2 ? (p2) o2Var : null;
        if (p2Var != null) {
            p2Var.f135217b |= 1;
        }
    }

    public final int t0(int i14) {
        int iQ = this.H.q(i14) + 1;
        int i15 = 0;
        while (iQ < i14) {
            if (!this.H.k(iQ)) {
                i15++;
            }
            iQ += s3.k.a(iQ, this.H.f156335b);
        }
        return i15;
    }

    @Override // p3.m
    public final void u(boolean z14) {
        if (this.f135188m != 0) {
            n.a("No nodes can be emitted before calling deactivateToEndGroup");
        }
        if (this.T) {
            return;
        }
        if (!z14) {
            E0();
            return;
        }
        s3.h hVar = this.H;
        int i14 = hVar.f156340g;
        int i15 = hVar.f156341h;
        t3.b bVar = this.N;
        bVar.getClass();
        bVar.d(false);
        bVar.f162080b.f162078a.d(t3.d.f.f162105c);
        p0.a(this.f135195t, i14, i15);
        this.H.t();
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003b A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:3:0x0005, B:5:0x0010, B:7:0x001e, B:11:0x0028, B:10:0x0024, B:14:0x002f, B:16:0x0035, B:18:0x003b), top: B:23:0x0005 }] */
    public final <R> R u0(c0 c0Var, c0 c0Var2, Integer num, List<? extends o13.p<p2, ? extends Object>> list, e23.a<? extends R> aVar) {
        R rInvoke;
        boolean z14 = this.G;
        int i14 = this.f135187l;
        try {
            this.G = true;
            this.f135187l = 0;
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                o13.p<p2, ? extends Object> pVar = list.get(i15);
                p2 p2Var = pVar.f128594a;
                Object obj = pVar.f128595b;
                if (obj != null) {
                    K0(p2Var, obj);
                } else {
                    K0(p2Var, null);
                }
            }
            if (c0Var == null) {
                rInvoke = aVar.invoke();
            } else {
                rInvoke = (R) c0Var.k(c0Var2, num != null ? num.intValue() : -1, aVar);
                if (rInvoke == null) {
                    rInvoke = aVar.invoke();
                }
            }
            return rInvoke;
        } finally {
            this.G = z14;
            this.f135187l = i14;
        }
    }

    @Override // p3.m
    /* JADX INFO: renamed from: v, reason: from getter */
    public final long getU() {
        return this.U;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:10:0x003a  */
    /* JADX WARN: Code duplicated, block: B:200:0x0109 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f8 A[LOOP:7: B:34:0x00b2->B:50:0x00f8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:51:0x0101  */
    /* JADX WARN: Code duplicated, block: B:55:0x0113  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:63:0x0140  */
    /* JADX WARN: Code duplicated, block: B:66:0x0145  */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:67:0x0151
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.IfRegionMaker.process(IfRegionMaker.java:111)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:109)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:162)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    public final void v0() {
        /*
            Method dump skipped, instruction units count: 859
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p3.o0.v0():void");
    }

    @Override // p3.m
    public final void w(int i14) {
        if (i14 < 0) {
            int i15 = -i14;
            s3.l lVar = this.J;
            while (true) {
                int i16 = lVar.f156384v;
                if (i16 <= i15) {
                    return;
                } else {
                    g0(lVar.y(i16));
                }
            }
        } else {
            if (this.T) {
                s3.l lVar2 = this.J;
                while (this.T) {
                    g0(lVar2.y(lVar2.f156384v));
                }
            }
            s3.h hVar = this.H;
            while (true) {
                int i17 = hVar.f156342i;
                if (i17 <= i14) {
                    return;
                } else {
                    g0(hVar.l(i17));
                }
            }
        }
    }

    public final void w0() {
        z0(this.H.f156340g);
        t3.b bVar = this.N;
        bVar.d(false);
        bVar.e();
        bVar.f162080b.f162078a.d(t3.d.x.f162128c);
        int i14 = bVar.f162084f;
        s3.h hVar = bVar.f162079a.H;
        bVar.f162084f = s3.k.a(hVar.f156340g, hVar.f156335b) + i14;
    }

    @Override // p3.m
    public final i2 x() {
        return a0();
    }

    public final void x0(i2 i2Var) {
        p1.i0<i2> i0Var = this.f135198w;
        if (i0Var == null) {
            i0Var = new p1.i0<>(0, 1, null);
            this.f135198w = i0Var;
        }
        i0Var.i(this.H.f156340g, i2Var);
    }

    @Override // p3.m
    public final void y() {
        g0(true);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x001a  */
    public final void y0(int i14, int i15, int i16) {
        s3.h hVar = this.H;
        if (i14 == i15) {
            i16 = i14;
        } else if (i14 != i16 && i15 != i16) {
            if (hVar.q(i14) == i15) {
                i16 = i15;
            } else if (hVar.q(i15) == i14) {
                i16 = i14;
            } else if (hVar.q(i14) == hVar.q(i15)) {
                i16 = hVar.q(i14);
            } else {
                int iQ = i14;
                int i17 = 0;
                while (iQ > 0 && iQ != i16) {
                    iQ = hVar.q(iQ);
                    i17++;
                }
                int iQ2 = i15;
                int i18 = 0;
                while (iQ2 > 0 && iQ2 != i16) {
                    iQ2 = hVar.q(iQ2);
                    i18++;
                }
                int i19 = i17 - i18;
                int iQ3 = i14;
                for (int i24 = 0; i24 < i19; i24++) {
                    iQ3 = hVar.q(iQ3);
                }
                int i25 = i18 - i17;
                int iQ4 = i15;
                for (int i26 = 0; i26 < i25; i26++) {
                    iQ4 = hVar.q(iQ4);
                }
                i16 = iQ3;
                for (int iQ5 = iQ4; i16 != iQ5; iQ5 = hVar.q(iQ5)) {
                    i16 = hVar.q(i16);
                }
            }
        }
        while (i14 > 0 && i14 != i16) {
            if (hVar.l(i14)) {
                this.N.a();
            }
            i14 = hVar.q(i14);
        }
        f0(i15, i16);
    }

    @Override // p3.m
    public final void z() {
        r3.c.f149972b.getClass();
        F0(125, null, null, r3.c.f149974d);
        this.f135194s = true;
    }

    public final void z0(int i14) {
        boolean zL = this.H.l(i14);
        t3.b bVar = this.N;
        if (zL) {
            bVar.c();
            Object objN = this.H.n(i14);
            bVar.c();
            bVar.f162086h.add(objN);
        }
        C0(this, i14, i14, zL, 0);
        bVar.c();
        if (zL) {
            bVar.a();
        }
    }
}
