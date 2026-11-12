package h5;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\tB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lh5/n0;", "Lf5/v1;", "Lf5/y0;", "Lh5/b;", "Lh5/y0;", "Lh5/j0;", "layoutNodeLayoutDelegate", "<init>", "(Lh5/j0;)V", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n0 extends f5.v1 implements f5.y0, h5.b, y0 {
    public Object A;
    public long B;
    public final e C;
    public final d D;
    public boolean E;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final j0 f81898f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f81899g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f81900h = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f81901i = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public e0.g f81902j = e0.g.NotUsed;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f81903k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f81904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f81905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public g6.a f81906n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public long f81907o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public e23.l<? super o4.t0, Unit> f81908p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public r4.c f81909q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public a f81910r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final k0 f81911t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final q3.c<n0> f81912v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f81913w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f81914x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final c f81915y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f81916z;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh5/n0$a;", "", "<init>", "(Ljava/lang/String;I)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum a {
        IsPlacedInLookahead,
        IsPlacedInApproach,
        IsNotPlaced
    }

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f81922b;

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
                iArr[e0.e.LayingOut.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[e0.e.LookaheadLayingOut.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f81921a = iArr;
            int[] iArr2 = new int[e0.g.values().length];
            try {
                iArr2[e0.g.InMeasureBlock.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[e0.g.InLayoutBlock.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            f81922b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class c extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        public c() {
            super(0);
        }

        @Override // e23.a
        public final Unit invoke() {
            n0 n0Var = n0.this;
            j0 j0Var = n0Var.f81898f;
            j0Var.f81845h = 0;
            q3.c<e0> cVarN = j0Var.f81838a.N();
            e0[] e0VarArr = cVarN.f142356a;
            int i14 = cVarN.f142358c;
            for (int i15 = 0; i15 < i14; i15++) {
                n0 n0Var2 = e0VarArr[i15].T.f81854q;
                n0Var2.getClass();
                n0Var2.f81900h = n0Var2.f81901i;
                n0Var2.f81901i = Integer.MAX_VALUE;
                if (n0Var2.f81902j == e0.g.InLayoutBlock) {
                    n0Var2.f81902j = e0.g.NotUsed;
                }
            }
            n0Var.T(o0.f81928a);
            w.b bVar = n0Var.K().V0;
            if (bVar != null) {
                boolean z14 = bVar.f81865k;
                q3.c.a aVar = (q3.c.a) j0Var.f81838a.D();
                int i16 = aVar.f142359a.f142358c;
                for (int i17 = 0; i17 < i16; i17++) {
                    m0 m0VarD1 = ((e0) aVar.get(i17)).P.f81683d.D1();
                    if (m0VarD1 != null) {
                        m0VarD1.f81865k = z14;
                    }
                }
            }
            w.b bVar2 = n0Var.K().V0;
            bVar2.getClass();
            bVar2.Q0().q();
            if (n0Var.K().V0 != null) {
                q3.c.a aVar2 = (q3.c.a) j0Var.f81838a.D();
                int i18 = aVar2.f142359a.f142358c;
                for (int i19 = 0; i19 < i18; i19++) {
                    m0 m0VarD2 = ((e0) aVar2.get(i19)).P.f81683d.D1();
                    if (m0VarD2 != null) {
                        m0VarD2.f81865k = false;
                    }
                }
            }
            q3.c<e0> cVarN2 = j0Var.f81838a.N();
            e0[] e0VarArr2 = cVarN2.f142356a;
            int i24 = cVarN2.f142358c;
            for (int i25 = 0; i25 < i24; i25++) {
                n0 n0Var3 = e0VarArr2[i25].T.f81854q;
                n0Var3.getClass();
                int i26 = n0Var3.f81900h;
                int i27 = n0Var3.f81901i;
                if (i26 != i27 && i27 == Integer.MAX_VALUE) {
                    n0Var3.I0(true);
                }
            }
            n0Var.T(p0.f81934a);
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
            m0 m0VarD1;
            n0 n0Var = n0.this;
            j0 j0Var = n0Var.f81898f;
            f5.v1.a placementScope = null;
            if (gl.b.F(j0Var.f81838a) || j0Var.f81840c) {
                c1 c1Var = j0Var.a().f81715v;
                if (c1Var != null) {
                    placementScope = c1Var.f81866l;
                }
            } else {
                c1 c1Var2 = j0Var.a().f81715v;
                if (c1Var2 != null && (m0VarD1 = c1Var2.D1()) != null) {
                    placementScope = m0VarD1.f81866l;
                }
            }
            if (placementScope == null) {
                placementScope = i0.a(j0Var.f81838a).getPlacementScope();
            }
            m0 m0VarD2 = j0Var.a().D1();
            m0VarD2.getClass();
            f5.v1.a.y(placementScope, m0VarD2, n0Var.f81907o);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class e extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        public e() {
            super(0);
        }

        @Override // e23.a
        public final Unit invoke() {
            n0 n0Var = n0.this;
            m0 m0VarD1 = n0Var.f81898f.a().D1();
            m0VarD1.getClass();
            m0VarD1.Q(n0Var.B);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh5/b;", "it", "", "invoke", "(Lh5/b;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends p005kotlin.jvm.internal.w implements e23.l<h5.b, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f81926a = new f();

        public f() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(h5.b bVar) {
            bVar.p().f81663c = false;
            return Unit.INSTANCE;
        }
    }

    public n0(j0 j0Var) {
        this.f81898f = j0Var;
        g6.k.f76003b.getClass();
        this.f81907o = 0L;
        this.f81910r = a.IsNotPlaced;
        this.f81911t = new k0(this);
        this.f81912v = new q3.c<>(new n0[16], 0);
        this.f81913w = true;
        this.f81915y = new c();
        this.f81916z = true;
        this.A = j0Var.f81853p.f81969t;
        this.B = g6.b.b(0, 0, 15);
        this.C = new e();
        this.D = new d();
    }

    @Override // f5.c1
    public final int E(f5.a aVar) {
        j0 j0Var = this.f81898f;
        e0 e0VarK = j0Var.f81838a.K();
        e0.e eVar = e0VarK != null ? e0VarK.T.f81841d : null;
        e0.e eVar2 = e0.e.LookaheadMeasuring;
        k0 k0Var = this.f81911t;
        if (eVar == eVar2) {
            k0Var.f81663c = true;
        } else {
            e0 e0VarK2 = j0Var.f81838a.K();
            if ((e0VarK2 != null ? e0VarK2.T.f81841d : null) == e0.e.LookaheadLayingOut) {
                k0Var.f81664d = true;
            }
        }
        this.f81903k = true;
        m0 m0VarD1 = j0Var.a().D1();
        m0VarD1.getClass();
        int iE = m0VarD1.E(aVar);
        this.f81903k = false;
        return iE;
    }

    public final boolean G0() {
        j0 j0Var = this.f81898f;
        return gl.b.F(j0Var.f81838a) || j0Var.f81840c;
    }

    public final void I0(boolean z14) {
        if (z14 && G0()) {
            return;
        }
        if (z14 || G0()) {
            this.f81910r = a.IsNotPlaced;
            q3.c<e0> cVarN = this.f81898f.f81838a.N();
            e0[] e0VarArr = cVarN.f142356a;
            int i14 = cVarN.f142358c;
            for (int i15 = 0; i15 < i14; i15++) {
                n0 n0Var = e0VarArr[i15].T.f81854q;
                n0Var.getClass();
                n0Var.I0(true);
            }
        }
    }

    @Override // h5.b
    public final void J() {
        this.f81914x = true;
        k0 k0Var = this.f81911t;
        k0Var.i();
        j0 j0Var = this.f81898f;
        boolean z14 = j0Var.f81843f;
        e0 e0Var = j0Var.f81838a;
        if (z14) {
            q3.c<e0> cVarN = e0Var.N();
            e0[] e0VarArr = cVarN.f142356a;
            int i14 = cVarN.f142358c;
            for (int i15 = 0; i15 < i14; i15++) {
                e0 e0Var2 = e0VarArr[i15];
                j0 j0Var2 = e0Var2.T;
                if (j0Var2.f81842e && e0Var2.I() == e0.g.InMeasureBlock) {
                    n0 n0Var = j0Var2.f81854q;
                    n0Var.getClass();
                    n0 n0Var2 = j0Var2.f81854q;
                    g6.a aVar = n0Var2 != null ? n0Var2.f81906n : null;
                    aVar.getClass();
                    if (n0Var.S0(aVar.f75988a)) {
                        e0.h0(e0Var, false, 7);
                    }
                }
            }
        }
        w.b bVar = K().V0;
        bVar.getClass();
        if (j0Var.f81844g || (!this.f81903k && !bVar.f81865k && j0Var.f81843f)) {
            j0Var.f81843f = false;
            e0.e eVar = j0Var.f81841d;
            j0Var.f81841d = e0.e.LookaheadLayingOut;
            j0Var.i(false);
            r1 snapshotObserver = i0.a(e0Var).getSnapshotObserver();
            snapshotObserver.f81981a.d(e0Var, snapshotObserver.f81988h, this.f81915y);
            j0Var.f81841d = eVar;
            if (j0Var.f81850m && bVar.f81865k) {
                requestLayout();
            }
            j0Var.f81844g = false;
        }
        if (k0Var.f81664d) {
            k0Var.f81665e = true;
        }
        if (k0Var.f81662b && k0Var.f()) {
            k0Var.h();
        }
        this.f81914x = false;
    }

    public final void J0() {
        a aVar = this.f81910r;
        j0 j0Var = this.f81898f;
        boolean z14 = j0Var.f81840c;
        e0 e0Var = j0Var.f81838a;
        if (z14) {
            this.f81910r = a.IsPlacedInApproach;
        } else {
            this.f81910r = a.IsPlacedInLookahead;
        }
        if (aVar != a.IsPlacedInLookahead && j0Var.f81842e) {
            e0.h0(e0Var, true, 6);
        }
        q3.c<e0> cVarN = e0Var.N();
        e0[] e0VarArr = cVarN.f142356a;
        int i14 = cVarN.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            e0 e0Var2 = e0VarArr[i15];
            n0 n0Var = e0Var2.T.f81854q;
            if (n0Var == null) {
                vb.h.s("Error: Child node's lookahead pass delegate cannot be null when in a lookahead scope.");
                return;
            }
            if (n0Var.f81901i != Integer.MAX_VALUE) {
                n0Var.J0();
                e0.k0(e0Var2);
            }
        }
    }

    @Override // h5.b
    public final w K() {
        return this.f81898f.f81838a.P.f81682c;
    }

    public final void N0() {
        j0 j0Var = this.f81898f;
        if (j0Var.f81852o > 0) {
            q3.c<e0> cVarN = j0Var.f81838a.N();
            e0[] e0VarArr = cVarN.f142356a;
            int i14 = cVarN.f142358c;
            for (int i15 = 0; i15 < i14; i15++) {
                e0 e0Var = e0VarArr[i15];
                j0 j0Var2 = e0Var.T;
                if ((j0Var2.f81850m || j0Var2.f81851n) && !j0Var2.f81843f) {
                    e0Var.g0(false);
                }
                n0 n0Var = j0Var2.f81854q;
                if (n0Var != null) {
                    n0Var.N0();
                }
            }
        }
    }

    @Override // f5.w
    public final int O(int i14) {
        O0();
        m0 m0VarD1 = this.f81898f.a().D1();
        m0VarD1.getClass();
        return m0VarD1.O(i14);
    }

    public final void O0() {
        e0.g gVar;
        j0 j0Var = this.f81898f;
        e0.h0(j0Var.f81838a, false, 7);
        e0 e0Var = j0Var.f81838a;
        e0 e0VarK = e0Var.K();
        if (e0VarK == null || e0Var.E != e0.g.NotUsed) {
            return;
        }
        int i14 = b.f81921a[e0VarK.T.f81841d.ordinal()];
        if (i14 != 2) {
            gVar = i14 != 3 ? e0VarK.E : e0.g.InLayoutBlock;
        } else {
            gVar = e0.g.InMeasureBlock;
        }
        e0Var.E = gVar;
    }

    public final void P0() {
        e0.e eVar;
        this.E = true;
        j0 j0Var = this.f81898f;
        e0 e0VarK = j0Var.f81838a.K();
        a aVar = this.f81910r;
        if ((aVar != a.IsPlacedInLookahead && !j0Var.f81840c) || (aVar != a.IsPlacedInApproach && j0Var.f81840c)) {
            J0();
            if (this.f81899g && e0VarK != null) {
                e0VarK.g0(false);
            }
        }
        if (e0VarK != null) {
            j0 j0Var2 = e0VarK.T;
            if (!this.f81899g && ((eVar = j0Var2.f81841d) == e0.e.LayingOut || eVar == e0.e.LookaheadLayingOut)) {
                if (this.f81901i != Integer.MAX_VALUE) {
                    e5.a.b("Place was called on a node which was placed already");
                }
                int i14 = j0Var2.f81845h;
                this.f81901i = i14;
                j0Var2.f81845h = i14 + 1;
            }
        } else {
            this.f81901i = 0;
        }
        J();
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0025  */
    @Override // f5.y0
    public final f5.v1 Q(long j8) {
        e0.g gVar;
        j0 j0Var = this.f81898f;
        e0 e0VarK = j0Var.f81838a.K();
        if ((e0VarK != null ? e0VarK.T.f81841d : null) == e0.e.LookaheadMeasuring) {
            j0Var.f81839b = false;
        } else {
            e0 e0VarK2 = j0Var.f81838a.K();
            if ((e0VarK2 != null ? e0VarK2.T.f81841d : null) == e0.e.LookaheadLayingOut) {
                j0Var.f81839b = false;
            }
        }
        e0 e0Var = j0Var.f81838a;
        e0 e0VarK3 = e0Var.K();
        if (e0VarK3 != null) {
            j0 j0Var2 = e0VarK3.T;
            if (this.f81902j != e0.g.NotUsed && !e0Var.I) {
                e5.a.b("measure() may not be called multiple times on the same Measurable. If you want to get the content size of the Measurable before calculating the final constraints, please use methods like minIntrinsicWidth()/maxIntrinsicWidth() and minIntrinsicHeight()/maxIntrinsicHeight()");
            }
            int i14 = b.f81921a[j0Var2.f81841d.ordinal()];
            if (i14 == 1 || i14 == 2) {
                gVar = e0.g.InMeasureBlock;
            } else {
                if (i14 != 3 && i14 != 4) {
                    androidx.room.a0.s(j0Var2.f81841d, "Measurable could be only measured from the parent's measure or layout block. Parents state is ");
                    return null;
                }
                gVar = e0.g.InLayoutBlock;
            }
            this.f81902j = gVar;
        } else {
            this.f81902j = e0.g.NotUsed;
        }
        e0 e0Var2 = j0Var.f81838a;
        if (e0Var2.E == e0.g.NotUsed) {
            e0Var2.r();
        }
        S0(j8);
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006f A[Catch: all -> 0x001b, TryCatch #0 {all -> 0x001b, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0013, B:9:0x0018, B:12:0x001e, B:14:0x0022, B:15:0x0027, B:17:0x0036, B:19:0x003a, B:22:0x0040, B:21:0x003e, B:23:0x0043, B:25:0x004d, B:30:0x0057, B:32:0x0083, B:31:0x006f), top: B:36:0x0007 }] */
    public final void Q0(long j8, e23.l lVar, r4.c cVar) {
        j0 j0Var = this.f81898f;
        e0 e0Var = j0Var.f81838a;
        e0 e0Var2 = j0Var.f81838a;
        try {
            e0 e0VarK = e0Var.K();
            e0.e eVar = e0VarK != null ? e0VarK.T.f81841d : null;
            e0.e eVar2 = e0.e.LookaheadLayingOut;
            if (eVar == eVar2) {
                j0Var.f81840c = false;
            }
            if (e0Var2.M0) {
                e5.a.a("place is called on a deactivated node");
            }
            j0Var.f81841d = eVar2;
            boolean z14 = true;
            this.f81904l = true;
            this.E = false;
            if (!g6.k.c(j8, this.f81907o)) {
                if (j0Var.f81851n || j0Var.f81850m) {
                    j0Var.f81843f = true;
                }
                N0();
            }
            o1 o1VarA = i0.a(e0Var2);
            this.f81907o = j8;
            if (j0Var.f81843f) {
                j0Var.h(false);
                this.f81911t.f81667g = false;
                r1 snapshotObserver = o1VarA.getSnapshotObserver();
                snapshotObserver.f81981a.d(e0Var2, snapshotObserver.f81987g, this.D);
            } else {
                if (this.f81910r == a.IsNotPlaced) {
                    z14 = false;
                }
                if (z14) {
                    m0 m0VarD1 = j0Var.a().D1();
                    m0VarD1.getClass();
                    m0VarD1.o1(g6.k.e(j8, m0VarD1.f69148e));
                    P0();
                } else {
                    j0Var.h(false);
                    this.f81911t.f81667g = false;
                    r1 snapshotObserver2 = o1VarA.getSnapshotObserver();
                    snapshotObserver2.f81981a.d(e0Var2, snapshotObserver2.f81987g, this.D);
                }
            }
            this.f81908p = lVar;
            this.f81909q = cVar;
            j0Var.f81841d = e0.e.Idle;
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th3) {
            e0Var.m0(th3);
            throw null;
        }
    }

    public final boolean S0(long j8) {
        long j14;
        j0 j0Var = this.f81898f;
        e0 e0Var = j0Var.f81838a;
        e0 e0Var2 = j0Var.f81838a;
        try {
            if (e0Var.M0) {
                e5.a.a("measure is called on a deactivated node");
            }
            e0 e0VarK = e0Var2.K();
            e0Var2.I = e0Var2.I || (e0VarK != null && e0VarK.I);
            if (!e0Var2.T.f81842e) {
                g6.a aVar = this.f81906n;
                if (aVar == null ? false : g6.a.d(aVar.f75988a, j8)) {
                    o1 o1Var = e0Var2.f81774n;
                    if (o1Var != null) {
                        o1Var.K(e0Var2, true);
                    }
                    e0Var2.l0();
                    return false;
                }
            }
            this.f81906n = g6.a.a(j8);
            E0(j8);
            this.f81911t.f81666f = false;
            T(f.f81926a);
            if (this.f81905m) {
                j14 = this.f69146c;
            } else {
                long j15 = Integer.MIN_VALUE;
                j14 = (j15 & 4294967295L) | (j15 << 32);
                g6.m.a aVar2 = g6.m.f76012b;
            }
            this.f81905m = true;
            m0 m0VarD1 = j0Var.a().D1();
            if (!(m0VarD1 != null)) {
                e5.a.b("Lookahead result from lookaheadRemeasure cannot be null");
            }
            j0Var.c(j8);
            long j16 = (((long) m0VarD1.f69145b) & 4294967295L) | (((long) m0VarD1.f69144a) << 32);
            g6.m.a aVar3 = g6.m.f76012b;
            D0(j16);
            return (((int) (j14 >> 32)) == m0VarD1.f69144a && ((int) (j14 & 4294967295L)) == m0VarD1.f69145b) ? false : true;
        } catch (Throwable th3) {
            e0Var.m0(th3);
            throw null;
        }
    }

    @Override // h5.b
    public final void T(e23.l<? super h5.b, Unit> lVar) {
        q3.c<e0> cVarN = this.f81898f.f81838a.N();
        e0[] e0VarArr = cVarN.f142356a;
        int i14 = cVarN.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            n0 n0Var = e0VarArr[i15].T.f81854q;
            n0Var.getClass();
            lVar.invoke(n0Var);
        }
    }

    @Override // h5.b
    public final void Z() {
        e0.h0(this.f81898f.f81838a, false, 7);
    }

    @Override // f5.w
    public final int a0(int i14) {
        O0();
        m0 m0VarD1 = this.f81898f.a().D1();
        m0VarD1.getClass();
        return m0VarD1.a0(i14);
    }

    @Override // h5.b
    public final h5.b d0() {
        j0 j0Var;
        e0 e0VarK = this.f81898f.f81838a.K();
        if (e0VarK == null || (j0Var = e0VarK.T) == null) {
            return null;
        }
        return j0Var.f81854q;
    }

    @Override // f5.c1, f5.w
    /* JADX INFO: renamed from: e, reason: from getter */
    public final Object getF81969t() {
        return this.A;
    }

    @Override // f5.w
    public final int e0(int i14) {
        O0();
        m0 m0VarD1 = this.f81898f.a().D1();
        m0VarD1.getClass();
        return m0VarD1.e0(i14);
    }

    @Override // f5.w
    public final int l0(int i14) {
        O0();
        m0 m0VarD1 = this.f81898f.a().D1();
        m0VarD1.getClass();
        return m0VarD1.l0(i14);
    }

    @Override // f5.v1
    public final int m0() {
        m0 m0VarD1 = this.f81898f.a().D1();
        m0VarD1.getClass();
        return m0VarD1.m0();
    }

    @Override // f5.v1
    public final int n0() {
        m0 m0VarD1 = this.f81898f.a().D1();
        m0VarD1.getClass();
        return m0VarD1.n0();
    }

    @Override // h5.b
    public final h5.a p() {
        return this.f81911t;
    }

    @Override // h5.y0
    public final void r(boolean z14) {
        m0 m0VarD1;
        j0 j0Var = this.f81898f;
        m0 m0VarD2 = j0Var.a().D1();
        if (Boolean.valueOf(z14).equals(m0VarD2 != null ? Boolean.valueOf(m0VarD2.f81863i) : null) || (m0VarD1 = j0Var.a().D1()) == null) {
            return;
        }
        m0VarD1.f81863i = z14;
    }

    @Override // h5.b
    public final void requestLayout() {
        e0 e0Var = this.f81898f.f81838a;
        e0.d dVar = e0.N0;
        e0Var.g0(false);
    }

    @Override // h5.b
    /* JADX INFO: renamed from: u, reason: from getter */
    public final int getF81958i() {
        return this.f81901i;
    }

    @Override // f5.v1
    public final void u0(float f14, long j8, e23.l lVar) {
        Q0(j8, lVar, null);
    }

    @Override // f5.v1
    public final void z0(long j8, float f14, r4.c cVar) {
        Q0(j8, null, cVar);
    }
}
