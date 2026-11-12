package h5;

import java.util.List;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lh5/r0;", "Lf5/y0;", "Lf5/v1;", "Lh5/b;", "Lh5/y0;", "Lh5/j0;", "layoutNodeLayoutDelegate", "<init>", "(Lh5/j0;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r0 extends f5.v1 implements f5.y0, h5.b, y0 {
    public final g0 A;
    public final q3.c<r0> B;
    public boolean C;
    public boolean D;
    public long E;
    public final c F;
    public final d H0;
    public final b I;
    public boolean I0;
    public float P;
    public boolean T;
    public e23.l<? super o4.t0, Unit> X;
    public r4.c Y;
    public long Z;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j0 f81955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f81956g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f81959j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f81960k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public float f81961k0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f81963m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public long f81964n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public e23.l<? super o4.t0, Unit> f81965o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public r4.c f81966p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f81967q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f81968r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Object f81969t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f81970v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f81971w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f81972x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public boolean f81973y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f81974z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f81957h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f81958i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public e0.g f81962l = e0.g.NotUsed;

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81975a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f81976b;

        static {
            int[] iArr = new int[e0.e.values().length];
            try {
                iArr[e0.e.Measuring.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[e0.e.LayingOut.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f81975a = iArr;
            int[] iArr2 = new int[e0.g.values().length];
            try {
                iArr2[e0.g.InMeasureBlock.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[e0.g.InLayoutBlock.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f81976b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class b extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        public b() {
            super(0);
        }

        @Override // e23.a
        public final Unit invoke() {
            r0 r0Var = r0.this;
            j0 j0Var = r0Var.f81955f;
            j0Var.f81846i = 0;
            q3.c<e0> cVarN = j0Var.f81838a.N();
            e0[] e0VarArr = cVarN.f142356a;
            int i14 = cVarN.f142358c;
            for (int i15 = 0; i15 < i14; i15++) {
                r0 r0Var2 = e0VarArr[i15].T.f81853p;
                r0Var2.f81957h = r0Var2.f81958i;
                r0Var2.f81958i = Integer.MAX_VALUE;
                r0Var2.f81971w = false;
                if (r0Var2.f81962l == e0.g.InLayoutBlock) {
                    r0Var2.f81962l = e0.g.NotUsed;
                }
            }
            r0Var.T(s0.f81996a);
            if (r0Var.K().f81865k) {
                q3.c.a aVar = (q3.c.a) j0Var.f81838a.D();
                int i16 = aVar.f142359a.f142358c;
                for (int i17 = 0; i17 < i16; i17++) {
                    ((e0) aVar.get(i17)).P.f81683d.f81865k = true;
                }
            }
            r0Var.K().Q0().q();
            if (r0Var.K().f81865k) {
                q3.c.a aVar2 = (q3.c.a) j0Var.f81838a.D();
                int i18 = aVar2.f142359a.f142358c;
                for (int i19 = 0; i19 < i18; i19++) {
                    ((e0) aVar2.get(i19)).P.f81683d.f81865k = false;
                }
            }
            e0 e0Var = j0Var.f81838a;
            q3.c<e0> cVarN2 = e0Var.N();
            e0[] e0VarArr2 = cVarN2.f142356a;
            int i24 = cVarN2.f142358c;
            for (int i25 = 0; i25 < i24; i25++) {
                e0 e0Var2 = e0VarArr2[i25];
                j0 j0Var2 = e0Var2.T;
                if (j0Var2.f81853p.f81957h != e0Var2.L()) {
                    e0Var.b0();
                    e0Var.R();
                    if (e0Var2.L() == Integer.MAX_VALUE) {
                        if (j0Var2.f81840c || gl.b.F(e0Var2)) {
                            n0 n0Var = j0Var2.f81854q;
                            n0Var.getClass();
                            n0Var.I0(false);
                        }
                        j0Var2.f81853p.J0();
                    }
                }
            }
            r0Var.T(t0.f81997a);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        public c() {
            super(0);
        }

        @Override // e23.a
        public final Unit invoke() {
            r0 r0Var = r0.this;
            r0Var.f81955f.a().Q(r0Var.E);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class d extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        public d() {
            super(0);
        }

        @Override // e23.a
        public final Unit invoke() {
            f5.v1.a placementScope;
            r0 r0Var = r0.this;
            j0 j0Var = r0Var.f81955f;
            c1 c1Var = j0Var.a().f81715v;
            if (c1Var == null || (placementScope = c1Var.f81866l) == null) {
                placementScope = i0.a(j0Var.f81838a).getPlacementScope();
            }
            e23.l<? super o4.t0, Unit> lVar = r0Var.X;
            r4.c cVar = r0Var.Y;
            if (cVar != null) {
                c1 c1VarA = j0Var.a();
                long j8 = r0Var.Z;
                float f14 = r0Var.f81961k0;
                placementScope.getClass();
                f5.v1.a.e(placementScope, c1VarA);
                c1VarA.z0(g6.k.e(j8, c1VarA.f69148e), f14, cVar);
            } else if (lVar == null) {
                c1 c1VarA2 = j0Var.a();
                long j14 = r0Var.Z;
                float f15 = r0Var.f81961k0;
                placementScope.getClass();
                f5.v1.a.e(placementScope, c1VarA2);
                c1VarA2.u0(f15, g6.k.e(j14, c1VarA2.f69148e), null);
            } else {
                c1 c1VarA3 = j0Var.a();
                long j15 = r0Var.Z;
                float f16 = r0Var.f81961k0;
                placementScope.getClass();
                f5.v1.a.e(placementScope, c1VarA3);
                c1VarA3.u0(f16, g6.k.e(j15, c1VarA3.f69148e), lVar);
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh5/b;", "it", "", "invoke", "(Lh5/b;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends p005kotlin.jvm.internal.w implements e23.l<h5.b, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f81980a = new e();

        public e() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(h5.b bVar) {
            bVar.p().f81663c = false;
            return Unit.INSTANCE;
        }
    }

    public r0(j0 j0Var) {
        this.f81955f = j0Var;
        g6.k.f76003b.getClass();
        this.f81964n = 0L;
        this.f81968r = true;
        this.A = new g0(this);
        this.B = new q3.c<>(new r0[16], 0);
        this.C = true;
        this.E = g6.b.b(0, 0, 15);
        this.F = new c();
        this.I = new b();
        this.Z = 0L;
        this.H0 = new d();
    }

    @Override // f5.c1
    public final int E(f5.a aVar) {
        j0 j0Var = this.f81955f;
        e0 e0VarK = j0Var.f81838a.K();
        e0.e eVar = e0VarK != null ? e0VarK.T.f81841d : null;
        e0.e eVar2 = e0.e.Measuring;
        g0 g0Var = this.A;
        if (eVar == eVar2) {
            g0Var.f81663c = true;
        } else {
            e0 e0VarK2 = j0Var.f81838a.K();
            if ((e0VarK2 != null ? e0VarK2.T.f81841d : null) == e0.e.LayingOut) {
                g0Var.f81664d = true;
            }
        }
        this.f81963m = true;
        int iE = j0Var.a().E(aVar);
        this.f81963m = false;
        return iE;
    }

    public final List<r0> G0() {
        j0 j0Var = this.f81955f;
        j0Var.f81838a.p0();
        boolean z14 = this.C;
        q3.c<r0> cVar = this.B;
        if (!z14) {
            return cVar.f();
        }
        e0 e0Var = j0Var.f81838a;
        q3.c<e0> cVarN = e0Var.N();
        e0[] e0VarArr = cVarN.f142356a;
        int i14 = cVarN.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            e0 e0Var2 = e0VarArr[i15];
            if (cVar.f142358c <= i15) {
                cVar.b(e0Var2.T.f81853p);
            } else {
                r0 r0Var = e0Var2.T.f81853p;
                r0[] r0VarArr = cVar.f142356a;
                r0 r0Var2 = r0VarArr[i15];
                r0VarArr[i15] = r0Var;
            }
        }
        cVar.l(((q3.c.a) e0Var.D()).f142359a.f142358c, cVar.f142358c);
        this.C = false;
        return cVar.f();
    }

    public final void I0() {
        boolean z14 = this.f81970v;
        this.f81970v = true;
        j0 j0Var = this.f81955f;
        e0 e0Var = j0Var.f81838a;
        if (!z14) {
            e0Var.P.f81682c.V1();
            i0.a(e0Var).getRectManager().e(j0Var.f81838a);
            if (e0Var.G()) {
                e0.j0(e0Var, true, 6);
            } else if (e0Var.T.f81842e) {
                e0.h0(e0Var, true, 6);
            }
        }
        a1 a1Var = e0Var.P;
        c1 c1Var = a1Var.f81682c.f81714t;
        for (c1 c1Var2 = a1Var.f81683d; !p005kotlin.jvm.internal.s.g(c1Var2, c1Var) && c1Var2 != null; c1Var2 = c1Var2.f81714t) {
            if (c1Var2.J0) {
                c1Var2.R1();
            }
        }
        q3.c<e0> cVarN = e0Var.N();
        e0[] e0VarArr = cVarN.f142356a;
        int i14 = cVarN.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            e0 e0Var2 = e0VarArr[i15];
            if (e0Var2.L() != Integer.MAX_VALUE) {
                e0Var2.T.f81853p.I0();
                e0.k0(e0Var2);
            }
        }
    }

    @Override // h5.b
    public final void J() {
        boolean zS0;
        this.D = true;
        g0 g0Var = this.A;
        g0Var.i();
        boolean z14 = this.f81973y;
        j0 j0Var = this.f81955f;
        if (z14) {
            q3.c<e0> cVarN = j0Var.f81838a.N();
            e0[] e0VarArr = cVarN.f142356a;
            int i14 = cVarN.f142358c;
            for (int i15 = 0; i15 < i14; i15++) {
                e0 e0Var = e0VarArr[i15];
                boolean zG = e0Var.G();
                j0 j0Var2 = e0Var.T;
                if (zG && e0Var.H() == e0.g.InMeasureBlock) {
                    r0 r0Var = j0Var2.f81853p;
                    g6.a aVarA = r0Var.f81959j ? g6.a.a(r0Var.f69147d) : null;
                    if (aVarA != null) {
                        if (e0Var.E == e0.g.NotUsed) {
                            e0Var.r();
                        }
                        zS0 = j0Var2.f81853p.S0(aVarA.f75988a);
                    } else {
                        zS0 = false;
                    }
                    if (zS0) {
                        e0.j0(j0Var.f81838a, false, 7);
                    }
                }
            }
        }
        if (this.f81974z || (!this.f81963m && !K().f81865k && this.f81973y)) {
            this.f81973y = false;
            e0.e eVar = j0Var.f81841d;
            j0Var.f81841d = e0.e.LayingOut;
            j0Var.g(false);
            e0 e0Var2 = j0Var.f81838a;
            r1 snapshotObserver = i0.a(e0Var2).getSnapshotObserver();
            snapshotObserver.f81981a.d(e0Var2, snapshotObserver.f81985e, this.I);
            j0Var.f81841d = eVar;
            this.f81974z = false;
        }
        if (g0Var.f81664d) {
            g0Var.f81665e = true;
        }
        if (g0Var.f81662b && g0Var.f()) {
            g0Var.h();
        }
        this.D = false;
    }

    public final void J0() {
        if (this.f81970v) {
            this.f81970v = false;
            j0 j0Var = this.f81955f;
            e0 e0Var = j0Var.f81838a;
            e0 e0Var2 = j0Var.f81838a;
            i0.a(e0Var).getRectManager().f(e0Var2);
            a1 a1Var = e0Var2.P;
            c1 c1Var = a1Var.f81682c.f81714t;
            for (c1 c1Var2 = a1Var.f81683d; !p005kotlin.jvm.internal.s.g(c1Var2, c1Var) && c1Var2 != null; c1Var2 = c1Var2.f81714t) {
                c1Var2.X1();
                c1Var2.c2();
            }
            q3.c<e0> cVarN = e0Var2.N();
            e0[] e0VarArr = cVarN.f142356a;
            int i14 = cVarN.f142358c;
            for (int i15 = 0; i15 < i14; i15++) {
                e0VarArr[i15].T.f81853p.J0();
            }
        }
    }

    @Override // h5.b
    public final w K() {
        return this.f81955f.f81838a.P.f81682c;
    }

    public final void N0() {
        e0.g gVar;
        j0 j0Var = this.f81955f;
        e0.j0(j0Var.f81838a, false, 7);
        e0 e0Var = j0Var.f81838a;
        e0 e0VarK = e0Var.K();
        if (e0VarK == null || e0Var.E != e0.g.NotUsed) {
            return;
        }
        int i14 = a.f81975a[e0VarK.T.f81841d.ordinal()];
        if (i14 != 1) {
            gVar = i14 != 2 ? e0VarK.E : e0.g.InLayoutBlock;
        } else {
            gVar = e0.g.InMeasureBlock;
        }
        e0Var.E = gVar;
    }

    @Override // f5.w
    public final int O(int i14) {
        j0 j0Var = this.f81955f;
        if (!gl.b.F(j0Var.f81838a)) {
            N0();
            return j0Var.a().O(i14);
        }
        n0 n0Var = j0Var.f81854q;
        n0Var.getClass();
        return n0Var.O(i14);
    }

    public final void O0() {
        this.T = true;
        j0 j0Var = this.f81955f;
        e0 e0VarK = j0Var.f81838a.K();
        float f14 = K().F;
        e0 e0Var = j0Var.f81838a;
        a1 a1Var = e0Var.P;
        c1 c1Var = a1Var.f81683d;
        w wVar = a1Var.f81682c;
        while (c1Var != wVar) {
            c1Var.getClass();
            d0 d0Var = (d0) c1Var;
            f14 += d0Var.F;
            c1Var = d0Var.f81714t;
        }
        if (f14 != this.P) {
            this.P = f14;
            if (e0VarK != null) {
                e0VarK.b0();
            }
            if (e0VarK != null) {
                e0VarK.R();
            }
        }
        if (!K().f81865k) {
            boolean z14 = this.f81970v;
            if (!z14 || this.A.e()) {
                I0();
            }
            if (z14) {
                e0Var.P.f81682c.V1();
            } else {
                if (e0VarK != null) {
                    e0VarK.R();
                }
                if (this.f81956g && e0VarK != null) {
                    e0VarK.i0(false);
                }
            }
        }
        if (e0VarK != null) {
            j0 j0Var2 = e0VarK.T;
            if (!this.f81956g && j0Var2.f81841d == e0.e.LayingOut) {
                if (this.f81958i != Integer.MAX_VALUE) {
                    e5.a.b("Place was called on a node which was placed already");
                }
                int i14 = j0Var2.f81846i;
                this.f81958i = i14;
                j0Var2.f81846i = i14 + 1;
            }
        } else {
            this.f81958i = 0;
        }
        J();
    }

    public final void P0(long j8, float f14, e23.l<? super o4.t0, Unit> lVar, r4.c cVar) {
        j0 j0Var = this.f81955f;
        e0 e0Var = j0Var.f81838a;
        e0 e0Var2 = j0Var.f81838a;
        if (e0Var.M0) {
            e5.a.a("place is called on a deactivated node");
        }
        j0Var.f81841d = e0.e.LayingOut;
        this.f81964n = j8;
        this.f81967q = f14;
        this.f81965o = lVar;
        this.f81966p = cVar;
        this.T = false;
        o1 o1VarA = i0.a(e0Var2);
        if (this.f81973y || !this.f81970v) {
            this.A.f81667g = false;
            j0Var.f(false);
            this.X = lVar;
            this.Z = j8;
            this.f81961k0 = f14;
            this.Y = cVar;
            r1 snapshotObserver = o1VarA.getSnapshotObserver();
            snapshotObserver.f81981a.d(e0Var2, snapshotObserver.f81986f, this.H0);
        } else {
            c1 c1VarA = j0Var.a();
            c1VarA.a2(g6.k.e(j8, c1VarA.f69148e), f14, lVar, cVar);
            O0();
        }
        j0Var.f81841d = e0.e.Idle;
        if (j0Var.a().f81865k && (j0Var.f81848k || j0Var.f81847j)) {
            requestLayout();
        }
        this.f81960k = true;
    }

    @Override // f5.y0
    public final f5.v1 Q(long j8) {
        e0.g gVar;
        j0 j0Var = this.f81955f;
        e0 e0Var = j0Var.f81838a;
        e0.g gVar2 = e0Var.E;
        e0.g gVar3 = e0.g.NotUsed;
        if (gVar2 == gVar3) {
            e0Var.r();
        }
        if (gl.b.F(j0Var.f81838a)) {
            n0 n0Var = j0Var.f81854q;
            n0Var.getClass();
            n0Var.f81902j = gVar3;
            int i14 = g4.f.f75739a;
            n0Var.Q(j8);
        }
        e0 e0Var2 = j0Var.f81838a;
        e0 e0VarK = e0Var2.K();
        if (e0VarK != null) {
            j0 j0Var2 = e0VarK.T;
            if (this.f81962l != gVar3 && !e0Var2.I) {
                e5.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i15 = a.f81975a[j0Var2.f81841d.ordinal()];
            if (i15 == 1) {
                gVar = e0.g.InMeasureBlock;
            } else {
                if (i15 != 2) {
                    androidx.room.a0.s(j0Var2.f81841d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                gVar = e0.g.InLayoutBlock;
            }
            this.f81962l = gVar;
        } else {
            this.f81962l = gVar3;
        }
        S0(j8);
        return this;
    }

    public final void Q0(long j8, float f14, e23.l<? super o4.t0, Unit> lVar, r4.c cVar) {
        f5.v1.a placementScope;
        j0 j0Var = this.f81955f;
        e0 e0Var = j0Var.f81838a;
        e0 e0Var2 = j0Var.f81838a;
        try {
            this.f81971w = true;
            if (!g6.k.c(j8, this.f81964n) || lVar != this.f81965o || this.I0) {
                if (j0Var.f81848k || j0Var.f81847j || this.I0) {
                    this.f81973y = true;
                    this.I0 = false;
                }
            }
            n0 n0Var = j0Var.f81854q;
            if (n0Var != null) {
                j0 j0Var2 = n0Var.f81898f;
                if (n0Var.f81910r == n0.a.IsNotPlaced && !gl.b.F(j0Var2.f81838a)) {
                    j0Var2.f81840c = true;
                }
            }
            n0 n0Var2 = j0Var.f81854q;
            if (n0Var2 != null && n0Var2.G0()) {
                c1 c1Var = j0Var.a().f81715v;
                if (c1Var == null || (placementScope = c1Var.f81866l) == null) {
                    placementScope = i0.a(e0Var2).getPlacementScope();
                }
                n0 n0Var3 = j0Var.f81854q;
                n0Var3.getClass();
                e0 e0VarK = e0Var2.K();
                if (e0VarK != null) {
                    e0VarK.T.f81845h = 0;
                }
                n0Var3.f81901i = Integer.MAX_VALUE;
                placementScope.r(n0Var3, (int) (j8 >> 32), (int) (4294967295L & j8), 0.0f);
            }
            n0 n0Var4 = j0Var.f81854q;
            if (n0Var4 != null && !n0Var4.f81904l) {
                e5.a.b("Error: Placement happened before lookahead.");
            }
            P0(j8, f14, lVar, cVar);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th3) {
            e0Var.m0(th3);
            throw null;
        }
    }

    public final boolean S0(long j8) {
        j0 j0Var = this.f81955f;
        e0 e0Var = j0Var.f81838a;
        e0 e0Var2 = j0Var.f81838a;
        try {
            if (e0Var.M0) {
                e5.a.a("measure is called on a deactivated node");
            }
            o1 o1VarA = i0.a(e0Var2);
            e0 e0VarK = e0Var2.K();
            boolean z14 = true;
            e0Var2.I = e0Var2.I || (e0VarK != null && e0VarK.I);
            if (!e0Var2.G() && g6.a.d(this.f69147d, j8)) {
                o1.a aVar = o1.W;
                o1VarA.K(e0Var2, false);
                e0Var2.l0();
                return false;
            }
            this.A.f81666f = false;
            T(e.f81980a);
            this.f81959j = true;
            long j14 = j0Var.a().f69146c;
            E0(j8);
            e0.e eVar = j0Var.f81841d;
            e0.e eVar2 = e0.e.Idle;
            if (eVar != eVar2) {
                e5.a.b("layout state is not idle before measure starts");
            }
            this.E = j8;
            e0.e eVar3 = e0.e.Measuring;
            j0Var.f81841d = eVar3;
            this.f81972x = false;
            r1 snapshotObserver = i0.a(e0Var2).getSnapshotObserver();
            snapshotObserver.f81981a.d(e0Var2, snapshotObserver.f81983c, this.F);
            if (j0Var.f81841d == eVar3) {
                this.f81973y = true;
                this.f81974z = true;
                j0Var.f81841d = eVar2;
            }
            if (g6.m.c(j0Var.a().f69146c, j14) && j0Var.a().f69144a == this.f69144a && j0Var.a().f69145b == this.f69145b) {
                z14 = false;
            }
            D0((((long) j0Var.a().f69145b) & 4294967295L) | (((long) j0Var.a().f69144a) << 32));
            return z14;
        } catch (Throwable th3) {
            e0Var.m0(th3);
            throw null;
        }
    }

    @Override // h5.b
    public final void T(e23.l<? super h5.b, Unit> lVar) {
        q3.c<e0> cVarN = this.f81955f.f81838a.N();
        e0[] e0VarArr = cVarN.f142356a;
        int i14 = cVarN.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            lVar.invoke(e0VarArr[i15].T.f81853p);
        }
    }

    public final void U0() {
        j0 j0Var = this.f81955f;
        e0 e0Var = j0Var.f81838a;
        e0 e0Var2 = j0Var.f81838a;
        if (!e0Var.g() || j0Var.f81849l <= 0) {
            return;
        }
        j0 j0Var2 = e0Var2.T;
        if ((j0Var2.f81847j || j0Var2.f81848k) && !j0Var2.f81853p.f81973y) {
            e0Var2.i0(false);
        }
        q3.c<e0> cVarN = e0Var2.N();
        e0[] e0VarArr = cVarN.f142356a;
        int i14 = cVarN.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            e0VarArr[i15].T.f81853p.U0();
        }
    }

    @Override // h5.b
    public final void Z() {
        e0.j0(this.f81955f.f81838a, false, 7);
    }

    @Override // f5.w
    public final int a0(int i14) {
        j0 j0Var = this.f81955f;
        if (!gl.b.F(j0Var.f81838a)) {
            N0();
            return j0Var.a().a0(i14);
        }
        n0 n0Var = j0Var.f81854q;
        n0Var.getClass();
        return n0Var.a0(i14);
    }

    @Override // h5.b
    public final h5.b d0() {
        j0 j0Var;
        e0 e0VarK = this.f81955f.f81838a.K();
        if (e0VarK == null || (j0Var = e0VarK.T) == null) {
            return null;
        }
        return j0Var.f81853p;
    }

    @Override // f5.c1, f5.w
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Object getA() {
        return this.f81969t;
    }

    @Override // f5.w
    public final int e0(int i14) {
        j0 j0Var = this.f81955f;
        if (!gl.b.F(j0Var.f81838a)) {
            N0();
            return j0Var.a().e0(i14);
        }
        n0 n0Var = j0Var.f81854q;
        n0Var.getClass();
        return n0Var.e0(i14);
    }

    @Override // f5.w
    public final int l0(int i14) {
        j0 j0Var = this.f81955f;
        if (!gl.b.F(j0Var.f81838a)) {
            N0();
            return j0Var.a().l0(i14);
        }
        n0 n0Var = j0Var.f81854q;
        n0Var.getClass();
        return n0Var.l0(i14);
    }

    @Override // f5.v1
    public final int m0() {
        return this.f81955f.a().m0();
    }

    @Override // f5.v1
    public final int n0() {
        return this.f81955f.a().n0();
    }

    @Override // h5.b
    public final h5.a p() {
        return this.A;
    }

    @Override // h5.y0
    public final void r(boolean z14) {
        j0 j0Var = this.f81955f;
        if (z14 != j0Var.a().f81863i) {
            j0Var.a().f81863i = z14;
            this.I0 = true;
        }
    }

    @Override // h5.b
    public final void requestLayout() {
        e0 e0Var = this.f81955f.f81838a;
        e0.d dVar = e0.N0;
        e0Var.i0(false);
    }

    @Override // h5.b
    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getF81901i() {
        return this.f81958i;
    }

    @Override // f5.v1
    public final void u0(float f14, long j8, e23.l lVar) {
        Q0(j8, f14, lVar, null);
    }

    @Override // f5.v1
    public final void z0(long j8, float f14, r4.c cVar) {
        Q0(j8, f14, null, cVar);
    }
}
