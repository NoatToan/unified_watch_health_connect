package h5;

import android.os.Trace;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0006B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lh5/q0;", "", "Lh5/e0;", "root", "<init>", "(Lh5/e0;)V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e0 f81936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f81937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f81938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f81939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final l1 f81940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final q3.c<o1.b> f81941f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f81942g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final q3.c<a> f81943h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public g6.a f81944i;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh5/q0$a;", "", "Lh5/e0;", "node", "", "isLookahead", "isForced", "<init>", "(Lh5/e0;ZZ)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final e0 f81945a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f81946b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f81947c;

        public a(e0 e0Var, boolean z14, boolean z15) {
            this.f81945a = e0Var;
            this.f81946b = z14;
            this.f81947c = z15;
        }
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81948a;

        static {
            int[] iArr = new int[e0.e.values().length];
            try {
                iArr[e0.e.LookaheadMeasuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e0.e.Measuring.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[e0.e.LookaheadLayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e0.e.LayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[e0.e.Idle.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f81948a = iArr;
        }
    }

    public q0(e0 e0Var) {
        this.f81936a = e0Var;
        o1.W.getClass();
        this.f81937b = new p(false);
        this.f81940e = new l1();
        this.f81941f = new q3.c<>(new o1.b[16], 0);
        this.f81942g = 1L;
        this.f81943h = new q3.c<>(new a[16], 0);
    }

    public static final boolean a(q0 q0Var, e0 e0Var, boolean z14) {
        g6.a aVar;
        boolean zD;
        f5.v1.a placementScope;
        w wVar;
        e0 e0VarK;
        e0 e0Var2 = q0Var.f81936a;
        boolean z15 = e0Var.M0;
        j0 j0Var = e0Var.T;
        boolean zC = false;
        if (!z15 && k(e0Var)) {
            if (e0Var == e0Var2) {
                aVar = q0Var.f81944i;
                aVar.getClass();
            } else {
                aVar = null;
            }
            if (z14) {
                if (j0Var.f81842e) {
                    int i14 = g4.f.f75739a;
                    zC = c(e0Var, aVar);
                }
                if ((zC || j0Var.f81843f) && p005kotlin.jvm.internal.s.g(e0Var.W(), Boolean.TRUE)) {
                    int i15 = g4.f.f75739a;
                    e0Var.X();
                }
            } else {
                if (e0Var.G()) {
                    int i16 = g4.f.f75739a;
                    zD = d(e0Var, aVar);
                } else {
                    zD = false;
                }
                if (e0Var.F() && (e0Var == e0Var2 || ((e0VarK = e0Var.K()) != null && e0VarK.g() && j0Var.f81853p.f81971w))) {
                    int i17 = g4.f.f75739a;
                    if (e0Var == e0Var2) {
                        if (e0Var.E == e0.g.NotUsed) {
                            e0Var.s();
                        }
                        e0 e0VarK2 = e0Var.K();
                        if (e0VarK2 == null || (wVar = e0VarK2.P.f81682c) == null || (placementScope = wVar.f81866l) == null) {
                            placementScope = i0.a(e0Var).getPlacementScope();
                        }
                        f5.v1.a.B(placementScope, j0Var.f81853p, 0, 0);
                    } else {
                        e0Var.f0();
                    }
                    l1 l1Var = q0Var.f81940e;
                    l1Var.getClass();
                    if (e0Var.L0 > 0) {
                        l1Var.f81884a.b(e0Var);
                        e0Var.K0 = true;
                    }
                }
                zC = zD;
            }
            q0Var.e();
        }
        return zC;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static boolean c(e0 e0Var, g6.a aVar) {
        boolean zS0;
        e0 e0Var2 = e0Var.f81767h;
        j0 j0Var = e0Var.T;
        if (e0Var2 == null) {
            return false;
        }
        if (aVar == null) {
            n0 n0Var = j0Var.f81854q;
            g6.a aVar2 = n0Var != null ? n0Var.f81906n : null;
            if (aVar2 == null || e0Var2 == null) {
                zS0 = false;
            } else {
                n0Var.getClass();
                zS0 = n0Var.S0(aVar2.f75988a);
            }
        } else if (e0Var2 != null) {
            n0 n0Var2 = j0Var.f81854q;
            n0Var2.getClass();
            zS0 = n0Var2.S0(aVar.f75988a);
        } else {
            zS0 = false;
        }
        e0 e0VarK = e0Var.K();
        if (zS0 && e0VarK != null) {
            if (e0VarK.f81767h == null) {
                e0.j0(e0VarK, false, 3);
                return zS0;
            }
            if (e0Var.I() == e0.g.InMeasureBlock) {
                e0.h0(e0VarK, false, 3);
                return zS0;
            }
            if (e0Var.I() == e0.g.InLayoutBlock) {
                e0VarK.g0(false);
            }
        }
        return zS0;
    }

    public static boolean d(e0 e0Var, g6.a aVar) {
        boolean zC0;
        if (aVar != null) {
            if (e0Var.E == e0.g.NotUsed) {
                e0Var.r();
            }
            zC0 = e0Var.T.f81853p.S0(aVar.f75988a);
        } else {
            zC0 = e0.c0(e0Var);
        }
        e0 e0VarK = e0Var.K();
        if (zC0 && e0VarK != null) {
            if (e0Var.H() == e0.g.InMeasureBlock) {
                e0.j0(e0VarK, false, 3);
                return zC0;
            }
            if (e0Var.H() == e0.g.InLayoutBlock) {
                e0VarK.i0(false);
            }
        }
        return zC0;
    }

    public static boolean i(e0 e0Var) {
        n0 n0Var;
        k0 k0Var;
        if (e0Var.T.f81842e) {
            return (e0Var.I() == e0.g.NotUsed && ((n0Var = e0Var.T.f81854q) == null || (k0Var = n0Var.f81911t) == null || !k0Var.f())) ? false : true;
        }
        return false;
    }

    public static boolean j(e0 e0Var) {
        if (!e0Var.G()) {
            return false;
        }
        do {
            if (e0Var.H() == e0.g.NotUsed && !e0Var.T.f81853p.A.f()) {
                e0 e0VarK = e0Var.K();
                if ((e0VarK != null ? e0VarK.T.f81841d : null) != e0.e.Measuring) {
                    return false;
                }
            }
            e0Var = e0Var.K();
            if (e0Var == null) {
                return false;
            }
        } while (!e0Var.g());
        return true;
    }

    public static boolean k(e0 e0Var) {
        n0 n0Var;
        k0 k0Var;
        boolean zG = e0Var.g();
        j0 j0Var = e0Var.T;
        return zG || j0Var.f81853p.f81971w || j(e0Var) || p005kotlin.jvm.internal.s.g(e0Var.W(), Boolean.TRUE) || i(e0Var) || j0Var.f81853p.A.f() || !((n0Var = j0Var.f81854q) == null || (k0Var = n0Var.f81911t) == null || !k0Var.f());
    }

    public final void b(boolean z14) {
        l1 l1Var = this.f81940e;
        if (z14) {
            q3.c<e0> cVar = l1Var.f81884a;
            e0 e0Var = this.f81936a;
            if (e0Var.L0 > 0) {
                cVar.g();
                cVar.b(e0Var);
                e0Var.K0 = true;
            }
        }
        if (l1Var.f81884a.f142358c != 0) {
            Trace.beginSection("Compose:onPositionedCallbacks");
            try {
                l1Var.a();
                Unit unit = Unit.INSTANCE;
            } finally {
                Trace.endSection();
            }
        }
    }

    public final void e() {
        q3.c<a> cVar = this.f81943h;
        int i14 = cVar.f142358c;
        if (i14 != 0) {
            a[] aVarArr = cVar.f142356a;
            for (int i15 = 0; i15 < i14; i15++) {
                a aVar = aVarArr[i15];
                if (aVar.f81945a.isAttached()) {
                    boolean z14 = aVar.f81946b;
                    e0 e0Var = aVar.f81945a;
                    boolean z15 = aVar.f81947c;
                    if (z14) {
                        e0.h0(e0Var, z15, 2);
                    } else {
                        e0.j0(e0Var, z15, 2);
                    }
                }
            }
            cVar.g();
        }
    }

    public final void f(e0 e0Var) {
        q3.c<e0> cVarN = e0Var.N();
        e0[] e0VarArr = cVarN.f142356a;
        int i14 = cVarN.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            e0 e0Var2 = e0VarArr[i15];
            if (p005kotlin.jvm.internal.s.g(e0Var2.W(), Boolean.TRUE) && !e0Var2.M0) {
                if (this.f81937b.b(e0Var2)) {
                    e0Var2.X();
                }
                f(e0Var2);
            }
        }
    }

    public final void g(e0 e0Var, boolean z14) {
        if (!this.f81938c) {
            e5.a.b("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
        }
        if (z14 ? e0Var.T.f81842e : e0Var.G()) {
            e5.a.a("node not yet measured");
        }
        h(e0Var, z14);
    }

    public final void h(e0 e0Var, boolean z14) {
        n0 n0Var;
        k0 k0Var;
        q3.c<e0> cVarN = e0Var.N();
        e0[] e0VarArr = cVarN.f142356a;
        int i14 = cVarN.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            e0 e0Var2 = e0VarArr[i15];
            if ((!z14 && (e0Var2.H() == e0.g.InMeasureBlock || e0Var2.T.f81853p.A.f())) || (z14 && (e0Var2.I() == e0.g.InMeasureBlock || ((n0Var = e0Var2.T.f81854q) != null && (k0Var = n0Var.f81911t) != null && k0Var.f())))) {
                boolean zF = gl.b.F(e0Var2);
                j0 j0Var = e0Var2.T;
                if (zF && !z14) {
                    if (j0Var.f81842e && this.f81937b.b(e0Var2)) {
                        o(e0Var2, true);
                    } else {
                        g(e0Var2, true);
                    }
                }
                if (z14 ? j0Var.f81842e : e0Var2.G()) {
                    o(e0Var2, z14);
                }
                if (!(z14 ? j0Var.f81842e : e0Var2.G())) {
                    h(e0Var2, z14);
                }
            }
        }
        if (z14 ? e0Var.T.f81842e : e0Var.G()) {
            o(e0Var, z14);
        }
    }

    public final boolean l(i5.m.o oVar) {
        boolean z14;
        boolean z15;
        e0 e0VarFirst;
        boolean z16;
        boolean zO;
        p pVar = this.f81937b;
        e0 e0Var = this.f81936a;
        if (!e0Var.isAttached()) {
            e5.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!e0Var.g()) {
            e5.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f81938c) {
            e5.a.a("performMeasureAndLayout called during measure layout");
        }
        if (this.f81944i != null) {
            this.f81938c = true;
            this.f81939d = true;
            try {
                boolean zC = pVar.c();
                n nVar = pVar.f81930a;
                if (zC) {
                    z14 = false;
                    while (true) {
                        n nVar2 = pVar.f81932c;
                        n nVar3 = pVar.f81931b;
                        if (!nVar.f81897c.isEmpty()) {
                            e0VarFirst = nVar.f81897c.first();
                            nVar.c(e0VarFirst);
                            z16 = e0VarFirst.f81767h != null;
                            z15 = false;
                        } else if (!nVar3.f81897c.isEmpty()) {
                            e0VarFirst = nVar3.f81897c.first();
                            nVar3.c(e0VarFirst);
                            z16 = e0VarFirst.f81767h != null;
                            z15 = true;
                        } else {
                            if (nVar2.f81897c.isEmpty()) {
                                break;
                            }
                            e0 e0VarFirst2 = nVar2.f81897c.first();
                            nVar2.c(e0VarFirst2);
                            z15 = true;
                            e0VarFirst = e0VarFirst2;
                            z16 = false;
                        }
                        if (z15) {
                            zO = a(this, e0VarFirst, z16);
                        } else {
                            zO = o(e0VarFirst, z16);
                            if (e0VarFirst.T.f81843f) {
                                pVar.a(e0VarFirst, z.LookaheadPlacement);
                            }
                            if (e0VarFirst.F()) {
                                pVar.a(e0VarFirst, z.Placement);
                            }
                        }
                        if (e0VarFirst == e0Var && zO) {
                            z14 = true;
                        }
                    }
                    if (oVar != null) {
                        oVar.invoke();
                    }
                } else {
                    z14 = false;
                }
                this.f81938c = false;
                this.f81939d = false;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    this.f81938c = false;
                    this.f81939d = false;
                    throw th4;
                }
            }
        } else {
            z14 = false;
        }
        q3.c<o1.b> cVar = this.f81941f;
        o1.b[] bVarArr = cVar.f142356a;
        int i14 = cVar.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            bVarArr[i15].h();
        }
        cVar.g();
        return z14;
    }

    public final void m(e0 e0Var, long j8) {
        if (e0Var.M0) {
            return;
        }
        e0 e0Var2 = this.f81936a;
        if (e0Var.equals(e0Var2)) {
            e5.a.a("measureAndLayout called on root");
        }
        if (!e0Var2.isAttached()) {
            e5.a.a("performMeasureAndLayout called with unattached root");
        }
        if (!e0Var2.g()) {
            e5.a.a("performMeasureAndLayout called with unplaced root");
        }
        if (this.f81938c) {
            e5.a.a("performMeasureAndLayout called during measure layout");
        }
        if (this.f81944i != null) {
            this.f81938c = true;
            this.f81939d = false;
            try {
                p pVar = this.f81937b;
                pVar.f81930a.c(e0Var);
                pVar.f81931b.c(e0Var);
                pVar.f81932c.c(e0Var);
                if ((c(e0Var, g6.a.a(j8)) || e0Var.T.f81843f) && p005kotlin.jvm.internal.s.g(e0Var.W(), Boolean.TRUE)) {
                    e0Var.X();
                }
                f(e0Var);
                d(e0Var, g6.a.a(j8));
                if (e0Var.F() && e0Var.g()) {
                    e0Var.f0();
                    l1 l1Var = this.f81940e;
                    l1Var.getClass();
                    if (e0Var.L0 > 0) {
                        l1Var.f81884a.b(e0Var);
                        e0Var.K0 = true;
                    }
                }
                e();
                this.f81938c = false;
                this.f81939d = false;
            } catch (Throwable th3) {
                try {
                    throw th3;
                } catch (Throwable th4) {
                    this.f81938c = false;
                    this.f81939d = false;
                    throw th4;
                }
            }
        }
        q3.c<o1.b> cVar = this.f81941f;
        o1.b[] bVarArr = cVar.f142356a;
        int i14 = cVar.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            bVarArr[i15].h();
        }
        cVar.g();
    }

    public final void n() {
        p pVar = this.f81937b;
        if (pVar.c()) {
            e0 e0Var = this.f81936a;
            if (!e0Var.isAttached()) {
                e5.a.a("performMeasureAndLayout called with unattached root");
            }
            if (!e0Var.g()) {
                e5.a.a("performMeasureAndLayout called with unplaced root");
            }
            if (this.f81938c) {
                e5.a.a("performMeasureAndLayout called during measure layout");
            }
            if (this.f81944i != null) {
                this.f81938c = true;
                this.f81939d = false;
                try {
                    int i14 = g4.f.f75739a;
                    if ((pVar.f81932c.f81897c.isEmpty() || pVar.f81930a.f81897c.isEmpty()) ? false : true) {
                        if (e0Var.f81767h != null) {
                            q(e0Var, true);
                        } else {
                            p(e0Var);
                        }
                    }
                    q(e0Var, false);
                    this.f81938c = false;
                    this.f81939d = false;
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        this.f81938c = false;
                        this.f81939d = false;
                        throw th4;
                    }
                }
            }
        }
    }

    public final boolean o(e0 e0Var, boolean z14) {
        g6.a aVar;
        boolean zD = false;
        if (!e0Var.M0 && k(e0Var)) {
            if (e0Var == this.f81936a) {
                aVar = this.f81944i;
                aVar.getClass();
            } else {
                aVar = null;
            }
            if (z14) {
                if (e0Var.T.f81842e) {
                    int i14 = g4.f.f75739a;
                    zD = c(e0Var, aVar);
                }
            } else if (e0Var.G()) {
                int i15 = g4.f.f75739a;
                zD = d(e0Var, aVar);
            }
            e();
        }
        return zD;
    }

    public final void p(e0 e0Var) {
        q3.c<e0> cVarN = e0Var.N();
        e0[] e0VarArr = cVarN.f142356a;
        int i14 = cVarN.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            e0 e0Var2 = e0VarArr[i15];
            if (e0Var2.H() == e0.g.InMeasureBlock || e0Var2.T.f81853p.A.f()) {
                if (gl.b.F(e0Var2)) {
                    q(e0Var2, true);
                } else {
                    p(e0Var2);
                }
            }
        }
    }

    public final void q(e0 e0Var, boolean z14) {
        g6.a aVar;
        if (e0Var.M0) {
            return;
        }
        if (e0Var == this.f81936a) {
            aVar = this.f81944i;
            aVar.getClass();
        } else {
            aVar = null;
        }
        if (z14) {
            c(e0Var, aVar);
        } else {
            d(e0Var, aVar);
        }
    }

    public final boolean r(e0 e0Var, boolean z14) {
        int i14 = b.f81948a[e0Var.T.f81841d.ordinal()];
        if (i14 != 1 && i14 != 2) {
            if (i14 == 3 || i14 == 4) {
                this.f81943h.b(new a(e0Var, false, z14));
            } else {
                if (i14 != 5) {
                    lc.u0.r();
                    return false;
                }
                if (!e0Var.G() || z14) {
                    e0Var.T.f81853p.f81972x = true;
                    if (!e0Var.M0 && (e0Var.g() || j(e0Var))) {
                        e0 e0VarK = e0Var.K();
                        if (e0VarK == null || !e0VarK.G()) {
                            this.f81937b.a(e0Var, z.Measurement);
                        }
                        if (!this.f81939d) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void s(long j8) {
        g6.a aVar = this.f81944i;
        if (aVar == null ? false : g6.a.d(aVar.f75988a, j8)) {
            return;
        }
        if (this.f81938c) {
            e5.a.a("updateRootConstraints called while measuring");
        }
        this.f81944i = g6.a.a(j8);
        e0 e0Var = this.f81936a;
        e0 e0Var2 = e0Var.f81767h;
        j0 j0Var = e0Var.T;
        if (e0Var2 != null) {
            j0Var.f81842e = true;
        }
        j0Var.f81853p.f81972x = true;
        this.f81937b.a(e0Var, e0Var2 != null ? z.LookaheadMeasurement : z.Measurement);
    }
}
