package h5;

import com.google.common.primitives.Longs;
import com.google.firebase.messaging.Constants;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import java.util.List;
import kotlin.a4;
import kotlin.o3;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0004\u0013\u0014\u0015\u0016B\u001b\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lh5/e0;", "Lp3/i;", "Lf5/z1;", "Lh5/p1;", "Lf5/j0;", "Lp5/s;", "Lh5/g;", "", "Lh5/o1$b;", "", "isVirtual", "", "semanticsId", "<init>", "(ZI)V", "instance", "", "w", "(Lh5/e0;)Ljava/lang/String;", "f", "d", JWKParameterNames.RSA_EXPONENT, "g", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e0 implements p3.i, f5.z1, p1, f5.j0, p5.s, h5.g, o1.b {
    public static final d N0 = new d(null);
    public static final c O0 = new c();
    public static final a P0 = a.f81785a;
    public static final b Q0 = new b();
    public static final androidx.browser.trusted.c R0 = new androidx.browser.trusted.c(14);
    public g6.c A;
    public g6.o B;
    public a4 C;
    public p3.w D;
    public g E;
    public g F;
    public h4.r H0;
    public boolean I;
    public j6.a.f I0;
    public j6.a.g J0;
    public boolean K0;
    public int L0;
    public boolean M0;
    public final a1 P;
    public final j0 T;
    public f5.q0 X;
    public c1 Y;
    public boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f81760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f81761b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f81762c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f81763d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f81764e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f81765f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f81766g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public e0 f81767h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f81768i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final z0<e0> f81769j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public q3.c<e0> f81770k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public h4.r f81771k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f81772l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public e0 f81773m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public o1 f81774n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p002j6.a f81775o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f81776p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f81777q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f81778r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p5.q f81779t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f81780v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final q3.c<e0> f81781w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f81782x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public f5.z0 f81783y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public y f81784z;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh5/e0;", "invoke", "()Lh5/e0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends p005kotlin.jvm.internal.w implements e23.a<e0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f81785a = new a();

        public a() {
            super(0);
        }

        @Override // e23.a
        public final e0 invoke() {
            return new e0(false, 0, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h5/e0$b", "Li5/a4;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements a4 {
        @Override // kotlin.a4
        public final long b() {
            return 300L;
        }

        @Override // kotlin.a4
        public final long c() {
            return 400L;
        }

        @Override // kotlin.a4
        public final float e() {
            return 16.0f;
        }

        @Override // kotlin.a4
        public final long g() {
            g6.h.f76000b.getClass();
            return 0L;
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h5/e0$c", "Lh5/e0$f;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends f {
        public c() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // f5.z0
        public final f5.a1 f(f5.b1 b1Var, List list, long j8) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh5/e0$e;", "", "<init>", "(Ljava/lang/String;I)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum e {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lh5/e0$f;", "Lf5/z0;", "", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "<init>", "(Ljava/lang/String;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class f implements f5.z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f81792a;

        public f(String str) {
            this.f81792a = str;
        }

        @Override // f5.z0
        public final int c(f5.x xVar, List list, int i14) {
            throw new IllegalStateException(this.f81792a.toString());
        }

        @Override // f5.z0
        public final int g(f5.x xVar, List list, int i14) {
            throw new IllegalStateException(this.f81792a.toString());
        }

        @Override // f5.z0
        public final int h(f5.x xVar, List list, int i14) {
            throw new IllegalStateException(this.f81792a.toString());
        }

        @Override // f5.z0
        public final int i(f5.x xVar, List list, int i14) {
            throw new IllegalStateException(this.f81792a.toString());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lh5/e0$g;", "", "<init>", "(Ljava/lang/String;I)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum g {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed
    }

    public static final /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f81797a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f81797a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class i extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        public i() {
            super(0);
        }

        @Override // e23.a
        public final Unit invoke() {
            j0 j0Var = e0.this.T;
            j0Var.f81853p.C = true;
            n0 n0Var = j0Var.f81854q;
            if (n0Var != null) {
                n0Var.f81913w = true;
            }
            return Unit.INSTANCE;
        }
    }

    public e0(boolean z14, int i14) {
        this.f81760a = z14;
        this.f81761b = i14;
        g6.k.f76003b.getClass();
        this.f81763d = g6.k.f76004c;
        this.f81764e = true;
        this.f81765f = true;
        this.f81769j = new z0<>(new q3.c(new e0[16], 0), new i());
        this.f81781w = new q3.c<>(new e0[16], 0);
        this.f81782x = true;
        this.f81783y = O0;
        this.A = i0.f81837a;
        this.B = g6.o.Ltr;
        this.C = Q0;
        p3.w.f135362l0.getClass();
        this.D = p3.w.a.f135364b;
        g gVar = g.NotUsed;
        this.E = gVar;
        this.F = gVar;
        this.P = new a1(this);
        this.T = new j0(this);
        this.Z = true;
        this.f81771k0 = h4.r.S;
    }

    public static boolean c0(e0 e0Var) {
        r0 r0Var = e0Var.T.f81853p;
        g6.a aVarA = r0Var.f81959j ? g6.a.a(r0Var.f69147d) : null;
        if (aVarA == null) {
            e0Var.getClass();
            return false;
        }
        if (e0Var.E == g.NotUsed) {
            e0Var.r();
        }
        return e0Var.T.f81853p.S0(aVarA.f75988a);
    }

    public static void h0(e0 e0Var, boolean z14, int i14) {
        e0 e0VarK;
        if ((i14 & 1) != 0) {
            z14 = false;
        }
        boolean z15 = (i14 & 2) != 0;
        boolean z16 = (i14 & 4) != 0;
        if (e0Var.f81767h == null) {
            e5.a.b("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        o1 o1Var = e0Var.f81774n;
        if (o1Var == null || e0Var.f81777q || e0Var.f81760a) {
            return;
        }
        o1Var.k(e0Var, true, z14, z15);
        if (z16) {
            n0 n0Var = e0Var.T.f81854q;
            n0Var.getClass();
            j0 j0Var = n0Var.f81898f;
            e0 e0VarK2 = j0Var.f81838a.K();
            g gVar = j0Var.f81838a.E;
            if (e0VarK2 == null || gVar == g.NotUsed) {
                return;
            }
            while (e0VarK2.E == gVar && (e0VarK = e0VarK2.K()) != null) {
                e0VarK2 = e0VarK;
            }
            int i15 = n0.b.f81922b[gVar.ordinal()];
            if (i15 == 1) {
                if (e0VarK2.f81767h != null) {
                    h0(e0VarK2, z14, 6);
                    return;
                } else {
                    j0(e0VarK2, z14, 6);
                    return;
                }
            }
            if (i15 != 2) {
                vb.h.z("Intrinsics isn't used by the parent");
            } else if (e0VarK2.f81767h != null) {
                e0VarK2.g0(z14);
            } else {
                e0VarK2.i0(z14);
            }
        }
    }

    public static void j0(e0 e0Var, boolean z14, int i14) {
        o1 o1Var;
        e0 e0VarK;
        if ((i14 & 1) != 0) {
            z14 = false;
        }
        boolean z15 = (i14 & 2) != 0;
        boolean z16 = (i14 & 4) != 0;
        if (e0Var.f81777q || e0Var.f81760a || (o1Var = e0Var.f81774n) == null) {
            return;
        }
        o1.a aVar = o1.W;
        o1Var.k(e0Var, false, z14, z15);
        if (z16) {
            j0 j0Var = e0Var.T.f81853p.f81955f;
            e0 e0VarK2 = j0Var.f81838a.K();
            g gVar = j0Var.f81838a.E;
            if (e0VarK2 == null || gVar == g.NotUsed) {
                return;
            }
            while (e0VarK2.E == gVar && (e0VarK = e0VarK2.K()) != null) {
                e0VarK2 = e0VarK;
            }
            int i15 = r0.a.f81976b[gVar.ordinal()];
            if (i15 == 1) {
                j0(e0VarK2, z14, 6);
            } else if (i15 == 2) {
                e0VarK2.i0(z14);
            } else {
                vb.h.z("Intrinsics isn't used by the parent");
            }
        }
    }

    public static void k0(e0 e0Var) {
        j0 j0Var = e0Var.T;
        if (h.f81797a[j0Var.f81841d.ordinal()] != 1) {
            androidx.room.a0.s(j0Var.f81841d, "Unexpected state ");
            return;
        }
        if (j0Var.f81842e) {
            h0(e0Var, true, 6);
            return;
        }
        if (j0Var.f81843f) {
            e0Var.g0(true);
        }
        if (e0Var.G()) {
            j0(e0Var, true, 6);
        } else if (e0Var.F()) {
            e0Var.i0(true);
        }
    }

    private final String w(e0 instance) {
        StringBuilder sb3 = new StringBuilder("Cannot insert ");
        sb3.append(instance);
        sb3.append(" because it already has a parent or an owner. This tree: ");
        sb3.append(t(0));
        sb3.append(" Other tree: ");
        e0 e0Var = instance.f81773m;
        sb3.append(e0Var != null ? e0Var.t(0) : null);
        return sb3.toString();
    }

    @Override // p5.s
    public final boolean A() {
        return this.P.f81683d.S1();
    }

    @Override // p5.s
    public final e0 B() {
        return K();
    }

    public final List<f5.y0> C() {
        return this.T.f81853p.G0();
    }

    public final List<e0> D() {
        return N().f();
    }

    public final List<e0> E() {
        return this.f81769j.f82027a.f();
    }

    public final boolean F() {
        return this.T.f81853p.f81973y;
    }

    public final boolean G() {
        return this.T.f81853p.f81972x;
    }

    public final g H() {
        return this.T.f81853p.f81962l;
    }

    public final g I() {
        g gVar;
        n0 n0Var = this.T.f81854q;
        return (n0Var == null || (gVar = n0Var.f81902j) == null) ? g.NotUsed : gVar;
    }

    public final y J() {
        y yVar = this.f81784z;
        if (yVar != null) {
            return yVar;
        }
        y yVar2 = new y(this, this.f81783y);
        this.f81784z = yVar2;
        return yVar2;
    }

    public final e0 K() {
        e0 e0Var = this.f81773m;
        while (e0Var != null && e0Var.f81760a) {
            e0Var = e0Var.f81773m;
        }
        return e0Var;
    }

    public final int L() {
        return this.T.f81853p.f81958i;
    }

    public final q3.c<e0> M() {
        boolean z14 = this.f81782x;
        q3.c<e0> cVar = this.f81781w;
        if (z14) {
            cVar.g();
            cVar.d(cVar.f142358c, N());
            cVar.n(R0);
            this.f81782x = false;
        }
        return cVar;
    }

    public final q3.c<e0> N() {
        p0();
        if (this.f81768i == 0) {
            return this.f81769j.f82027a;
        }
        q3.c<e0> cVar = this.f81770k;
        cVar.getClass();
        return cVar;
    }

    public final void O(long j8, v vVar, int i14, boolean z14) {
        a1 a1Var = this.P;
        c1 c1Var = a1Var.f81683d;
        c1.e eVar = c1.M0;
        long jB1 = c1Var.B1(j8);
        c1 c1Var2 = a1Var.f81683d;
        c1.M0.getClass();
        c1Var2.O1(c1.S0, jB1, vVar, i14, z14);
    }

    public final void P(long j8, v vVar, boolean z14) {
        a1 a1Var = this.P;
        c1 c1Var = a1Var.f81683d;
        c1.e eVar = c1.M0;
        long jB1 = c1Var.B1(j8);
        c1 c1Var2 = a1Var.f81683d;
        c1.M0.getClass();
        c1.b bVar = c1.T0;
        b5.m0.f15849b.getClass();
        c1Var2.O1(bVar, jB1, vVar, b5.m0.f15850c, z14);
    }

    public final void Q(int i14, e0 e0Var) {
        if (e0Var.f81773m != null && e0Var.f81774n != null) {
            e5.a.b(w(e0Var));
        }
        e0Var.f81773m = this;
        z0<e0> z0Var = this.f81769j;
        z0Var.f82027a.a(i14, e0Var);
        z0Var.f82028b.invoke();
        b0();
        if (e0Var.f81760a) {
            this.f81768i++;
        }
        V();
        o1 o1Var = this.f81774n;
        if (o1Var != null) {
            e0Var.q(o1Var);
        }
        if (e0Var.T.f81849l > 0) {
            j0 j0Var = this.T;
            j0Var.d(j0Var.f81849l + 1);
        }
        if (e0Var.L0 > 0) {
            n0(this.L0 + 1);
        }
    }

    public final void R() {
        if (this.Z) {
            a1 a1Var = this.P;
            c1 c1Var = a1Var.f81682c;
            c1 c1Var2 = a1Var.f81683d.f81715v;
            this.Y = null;
            while (!p005kotlin.jvm.internal.s.g(c1Var, c1Var2)) {
                if ((c1Var != null ? c1Var.K0 : null) != null) {
                    this.Y = c1Var;
                    break;
                }
                c1Var = c1Var != null ? c1Var.f81715v : null;
            }
            this.Z = false;
        }
        c1 c1Var3 = this.Y;
        if (c1Var3 != null && c1Var3.K0 == null) {
            throw e5.m("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        }
        if (c1Var3 != null) {
            c1Var3.R1();
            return;
        }
        e0 e0VarK = K();
        if (e0VarK != null) {
            e0VarK.R();
            return;
        }
        o1 o1Var = this.f81774n;
        if (o1Var != null) {
            o1Var.h();
        }
    }

    public final void S() {
        a1 a1Var = this.P;
        c1 c1Var = a1Var.f81683d;
        w wVar = a1Var.f81682c;
        while (c1Var != wVar) {
            c1Var.getClass();
            d0 d0Var = (d0) c1Var;
            n1 n1Var = d0Var.K0;
            if (n1Var != null) {
                n1Var.invalidate();
            }
            c1Var = d0Var.f81714t;
        }
        n1 n1Var2 = a1Var.f81682c.K0;
        if (n1Var2 != null) {
            n1Var2.invalidate();
        }
    }

    public final void T() {
        if (this.f81760a) {
            e0 e0VarK = K();
            if (e0VarK != null) {
                e0VarK.T();
                return;
            }
            return;
        }
        if (this.f81767h != null) {
            h0(this, false, 7);
        } else {
            j0(this, false, 7);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, p5.q] */
    public final void U() {
        if (this.f81780v) {
            return;
        }
        if (this.P.f81681b.getChild() != null || this.H0 != null) {
            this.f81778r = true;
            return;
        }
        p5.q qVar = this.f81779t;
        this.f81780v = true;
        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
        r0Var.f105810a = new p5.q();
        r1 snapshotObserver = i0.a(this).getSnapshotObserver();
        f0 f0Var = new f0(this, r0Var);
        snapshotObserver.f81981a.d(this, snapshotObserver.f81984d, f0Var);
        this.f81780v = false;
        this.f81779t = (p5.q) r0Var.f105810a;
        this.f81778r = false;
        o1 o1VarA = i0.a(this);
        p1.q0<p5.t> q0Var = o1VarA.getSemanticsOwner().f135954d;
        Object[] objArr = q0Var.f134667a;
        int i14 = q0Var.f134668b;
        for (int i15 = 0; i15 < i14; i15++) {
            ((p5.t) objArr[i15]).a(this, qVar);
        }
        o1VarA.D();
    }

    public final void V() {
        e0 e0Var;
        if (this.f81768i > 0) {
            this.f81772l = true;
        }
        if (!this.f81760a || (e0Var = this.f81773m) == null) {
            return;
        }
        e0Var.V();
    }

    public final Boolean W() {
        n0 n0Var = this.T.f81854q;
        if (n0Var != null) {
            return Boolean.valueOf(n0Var.f81910r != n0.a.IsNotPlaced);
        }
        return null;
    }

    public final void X() {
        e0 e0VarK;
        if (this.E == g.NotUsed) {
            s();
        }
        n0 n0Var = this.T.f81854q;
        n0Var.getClass();
        boolean z14 = true;
        try {
            n0Var.f81899g = true;
            if (!n0Var.f81904l) {
                e5.a.b("replace() called on item that was not placed");
            }
            n0Var.E = false;
            if (n0Var.f81910r == n0.a.IsNotPlaced) {
                z14 = false;
            }
            n0Var.Q0(n0Var.f81907o, n0Var.f81908p, n0Var.f81909q);
            if (z14 && !n0Var.E && (e0VarK = n0Var.f81898f.f81838a.K()) != null) {
                e0VarK.g0(false);
            }
        } finally {
            n0Var.f81899g = false;
        }
    }

    @Override // h5.p1
    public final boolean X0() {
        return isAttached();
    }

    public final void Y(int i14, int i15, int i16) {
        if (i14 == i15) {
            return;
        }
        for (int i17 = 0; i17 < i16; i17++) {
            int i18 = i14 > i15 ? i14 + i17 : i14;
            int i19 = i14 > i15 ? i15 + i17 : (i15 + i16) - 2;
            z0<e0> z0Var = this.f81769j;
            q3.c<e0> cVar = z0Var.f82027a;
            e23.a<Unit> aVar = z0Var.f82028b;
            e0 e0VarK = cVar.k(i18);
            aVar.invoke();
            z0Var.f82027a.a(i19, e0VarK);
            aVar.invoke();
        }
        b0();
        V();
        T();
    }

    public final void Z(e0 e0Var) {
        if (e0Var.T.f81849l > 0) {
            j0 j0Var = this.T;
            j0Var.d(j0Var.f81849l - 1);
        }
        if (this.f81774n != null) {
            e0Var.u();
        }
        e0Var.f81773m = null;
        if (e0Var.L0 > 0) {
            n0(this.L0 - 1);
        }
        e0Var.P.f81683d.f81715v = null;
        if (e0Var.f81760a) {
            this.f81768i--;
            q3.c<e0> cVar = e0Var.f81769j.f82027a;
            e0[] e0VarArr = cVar.f142356a;
            int i14 = cVar.f142358c;
            for (int i15 = 0; i15 < i14; i15++) {
                e0VarArr[i15].P.f81683d.f81715v = null;
            }
        }
        V();
        b0();
    }

    @Override // p3.i
    public final void a() {
        p002j6.a aVar = this.f81775o;
        if (aVar != null) {
            aVar.a();
        }
        f5.q0 q0Var = this.X;
        if (q0Var != null) {
            q0Var.a();
        }
        a1 a1Var = this.P;
        c1 c1Var = a1Var.f81682c.f81714t;
        for (c1 c1Var2 = a1Var.f81683d; !p005kotlin.jvm.internal.s.g(c1Var2, c1Var) && c1Var2 != null; c1Var2 = c1Var2.f81714t) {
            c1Var2.W1();
        }
    }

    public final void a0(c1 c1Var) {
        o1 o1Var = this.f81774n;
        q5.e rectManager = o1Var != null ? o1Var.getRectManager() : null;
        j0 j0Var = this.T;
        boolean z14 = j0Var.f81841d != e.Idle || G() || F();
        if (this.f81766g && rectManager != null) {
            if (c1Var == this.P.f81683d) {
                this.f81765f = true;
                if (!z14) {
                    rectManager.e(this);
                }
            } else {
                this.f81764e = true;
                q3.c<e0> cVarN = N();
                e0[] e0VarArr = cVarN.f142356a;
                int i14 = cVarN.f142358c;
                for (int i15 = 0; i15 < i14; i15++) {
                    e0 e0Var = e0VarArr[i15];
                    e0Var.f81765f = true;
                    if (!z14) {
                        rectManager.e(e0Var);
                    }
                }
                if (this.f81766g) {
                    rectManager.f142835e = true;
                    q5.c cVar = rectManager.f142832b;
                    int i16 = this.f81761b & 33554431;
                    long[] jArr = cVar.f142825a;
                    int i17 = cVar.f142827c;
                    for (int i18 = 0; i18 < jArr.length - 2 && i18 < i17; i18 += 3) {
                        int i19 = i18 + 2;
                        long j8 = jArr[i19];
                        if ((((int) j8) & 33554431) == i16) {
                            jArr[i19] = (((j8 >> 63) & 1) << 60) | j8;
                            break;
                        }
                    }
                }
                rectManager.h();
            }
        }
        j0Var.f81853p.U0();
    }

    @Override // f5.j0
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getF81761b() {
        return this.f81761b;
    }

    public final void b0() {
        if (!this.f81760a) {
            this.f81782x = true;
            return;
        }
        e0 e0VarK = K();
        if (e0VarK != null) {
            e0VarK.b0();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v5 */
    @Override // h5.g
    public final void c(p3.w wVar) {
        this.D = wVar;
        m((g6.c) wVar.a(kotlin.t1.f91490h));
        n((g6.o) wVar.a(kotlin.t1.f91496n));
        d((a4) wVar.a(kotlin.t1.f91502t));
        a1 a1Var = this.P;
        if ((a1Var.f81685f.getAggregateChildKindSet() & 32768) != 0) {
            for (h4.r.c child = a1Var.f81685f; child != null; child = child.getChild()) {
                if ((child.getKindSet() & 32768) != 0) {
                    ?? B = child;
                    ?? cVar = 0;
                    while (B != 0) {
                        if (B instanceof h5.h) {
                            h4.r.c node = ((h5.h) B).getNode();
                            if (node.getIsAttached()) {
                                g1.d(node);
                            } else {
                                node.setUpdatedNodeAwaitingAttachForInvalidation$ui(true);
                            }
                        } else if ((B.getKindSet() & 32768) != 0 && (B instanceof m)) {
                            h4.r.c child2 = ((m) B).f81888b;
                            int i14 = 0;
                            while (child2 != null) {
                                if ((child2.getKindSet() & 32768) != 0) {
                                    i14++;
                                    if (i14 == 1) {
                                        B = B;
                                        cVar = cVar;
                                        cVar = cVar;
                                        B = child2;
                                    } else {
                                        if (cVar == 0) {
                                            cVar = new q3.c(new h4.r.c[16], 0);
                                        }
                                        if (B != 0) {
                                            cVar.b(B);
                                            B = 0;
                                        }
                                        cVar.b(child2);
                                    }
                                } else {
                                    B = B;
                                    cVar = cVar;
                                }
                                child2 = child2.getChild();
                                B = B;
                                cVar = cVar;
                            }
                            if (i14 == 1) {
                                B = B;
                                cVar = cVar;
                            } else {
                                B = B;
                                cVar = cVar;
                            }
                        }
                        B = k.b(cVar);
                    }
                }
                if ((child.getAggregateChildKindSet() & 32768) == 0) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v4 */
    @Override // h5.g
    public final void d(a4 a4Var) {
        if (p005kotlin.jvm.internal.s.g(this.C, a4Var)) {
            return;
        }
        this.C = a4Var;
        a1 a1Var = this.P;
        if ((a1Var.f81685f.getAggregateChildKindSet() & 16) != 0) {
            for (h4.r.c child = a1Var.f81685f; child != null; child = child.getChild()) {
                if ((child.getKindSet() & 16) != 0) {
                    ?? B = child;
                    ?? cVar = 0;
                    while (B != 0) {
                        if (B instanceof u1) {
                            ((u1) B).z0();
                        } else if ((B.getKindSet() & 16) != 0 && (B instanceof m)) {
                            h4.r.c child2 = ((m) B).f81888b;
                            int i14 = 0;
                            B = B;
                            cVar = cVar;
                            while (child2 != null) {
                                if ((child2.getKindSet() & 16) != 0) {
                                    i14++;
                                    if (i14 == 1) {
                                        cVar = cVar;
                                        B = child2;
                                    } else {
                                        if (cVar == 0) {
                                            cVar = new q3.c(new h4.r.c[16], 0);
                                        }
                                        if (B != 0) {
                                            cVar.b(B);
                                            B = 0;
                                        }
                                        cVar.b(child2);
                                    }
                                }
                                child2 = child2.getChild();
                                B = B;
                                cVar = cVar;
                            }
                            if (i14 == 1) {
                            }
                        }
                        B = k.b(cVar);
                    }
                }
                if ((child.getAggregateChildKindSet() & 16) == 0) {
                    return;
                }
            }
        }
    }

    public final void d0() {
        z0<e0> z0Var = this.f81769j;
        int i14 = z0Var.f82027a.f142358c;
        while (true) {
            i14--;
            if (-1 >= i14) {
                z0Var.f82027a.g();
                z0Var.f82028b.invoke();
                return;
            }
            Z(z0Var.f82027a.f142356a[i14]);
        }
    }

    @Override // p3.i
    public final void e() {
        q5.e rectManager;
        q5.e rectManager2;
        if (!isAttached()) {
            e5.a.a("onReuse is only expected on attached node");
        }
        p002j6.a aVar = this.f81775o;
        if (aVar != null) {
            aVar.e();
        }
        f5.q0 q0Var = this.X;
        if (q0Var != null) {
            q0Var.i(false);
        }
        this.f81780v = false;
        boolean z14 = this.M0;
        a1 a1Var = this.P;
        if (z14) {
            this.M0 = false;
        } else {
            h4.r.c parent = a1Var.f81684e;
            for (h4.r.c parent2 = parent; parent2 != null; parent2 = parent2.getParent()) {
                if (parent2.getIsAttached()) {
                    parent2.reset$ui();
                }
            }
            for (h4.r.c parent3 = parent; parent3 != null; parent3 = parent3.getParent()) {
                if (parent3.getIsAttached()) {
                    parent3.runDetachLifecycle$ui();
                }
            }
            while (parent != null) {
                if (parent.getIsAttached()) {
                    parent.markAsDetached$ui();
                }
                parent = parent.getParent();
            }
        }
        int i14 = this.f81761b;
        o1 o1Var = this.f81774n;
        if (o1Var != null && (rectManager2 = o1Var.getRectManager()) != null) {
            rectManager2.f(this);
        }
        this.f81761b = p5.v.f136092a.addAndGet(1);
        o1 o1Var2 = this.f81774n;
        if (o1Var2 != null) {
            o1Var2.G(i14, this);
        }
        for (h4.r.c child = a1Var.f81685f; child != null; child = child.getChild()) {
            child.markAsAttached$ui();
        }
        a1Var.e();
        if (a1Var.d(8)) {
            U();
        }
        k0(this);
        o1 o1Var3 = this.f81774n;
        if (o1Var3 != null) {
            o1Var3.A(i14, this);
        }
        o1 o1Var4 = this.f81774n;
        if (o1Var4 == null || (rectManager = o1Var4.getRectManager()) == null) {
            return;
        }
        rectManager.e(this);
    }

    public final void e0(int i14, int i15) {
        if (i15 < 0) {
            e5.a.a("count (" + i15 + ") must be greater than 0");
        }
        int i16 = (i15 + i14) - 1;
        if (i14 > i16) {
            return;
        }
        while (true) {
            z0<e0> z0Var = this.f81769j;
            Z(z0Var.f82027a.f142356a[i16]);
            z0Var.f82027a.k(i16);
            z0Var.f82028b.invoke();
            if (i16 == i14) {
                return;
            } else {
                i16--;
            }
        }
    }

    @Override // h5.g
    public final void f(h4.r rVar) {
        if (this.f81760a && this.f81771k0 != h4.r.S) {
            e5.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (this.M0) {
            e5.a.a("modifier is updated when deactivated");
        }
        if (!isAttached()) {
            this.H0 = rVar;
            return;
        }
        p(rVar);
        if (this.f81778r) {
            U();
        }
    }

    public final void f0() {
        e0 e0VarK;
        if (this.E == g.NotUsed) {
            s();
        }
        r0 r0Var = this.T.f81853p;
        j0 j0Var = r0Var.f81955f;
        try {
            r0Var.f81956g = true;
            if (!r0Var.f81960k) {
                e5.a.b("replace called on unplaced item");
            }
            boolean z14 = r0Var.f81970v;
            r0Var.P0(r0Var.f81964n, r0Var.f81967q, r0Var.f81965o, r0Var.f81966p);
            if (z14 && !r0Var.T && (e0VarK = j0Var.f81838a.K()) != null) {
                e0VarK.i0(false);
            }
            r0Var.f81956g = false;
        } catch (Throwable th3) {
            try {
                j0Var.f81838a.m0(th3);
                throw null;
            } catch (Throwable th4) {
                r0Var.f81956g = false;
                throw th4;
            }
        }
    }

    @Override // f5.j0
    public final boolean g() {
        return this.T.f81853p.f81970v;
    }

    public final void g0(boolean z14) {
        o1 o1Var;
        if (this.f81760a || (o1Var = this.f81774n) == null) {
            return;
        }
        o1Var.B(this, true, z14);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v2, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r5v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v5 */
    @Override // h5.o1.b
    public final void h() {
        h4.r.c parent;
        a1 a1Var = this.P;
        w wVar = a1Var.f81682c;
        boolean zH = g1.h(4194304);
        if (zH) {
            parent = wVar.U0;
        } else {
            parent = wVar.U0.getParent();
            if (parent == null) {
                return;
            }
        }
        c1.e eVar = c1.M0;
        for (h4.r.c cVarJ1 = wVar.J1(zH); cVarJ1 != null && (cVarJ1.getAggregateChildKindSet() & 4194304) != 0; cVarJ1 = cVarJ1.getChild()) {
            if ((cVarJ1.getKindSet() & 4194304) != 0) {
                ?? B = cVarJ1;
                ?? cVar = 0;
                while (B != 0) {
                    if (B instanceof b0) {
                        ((b0) B).f(a1Var.f81682c);
                    } else if ((B.getKindSet() & 4194304) != 0 && (B instanceof m)) {
                        h4.r.c child = ((m) B).f81888b;
                        int i14 = 0;
                        B = B;
                        cVar = cVar;
                        while (child != null) {
                            if ((child.getKindSet() & 4194304) != 0) {
                                i14++;
                                if (i14 == 1) {
                                    cVar = cVar;
                                    B = child;
                                } else {
                                    if (cVar == 0) {
                                        cVar = new q3.c(new h4.r.c[16], 0);
                                    }
                                    if (B != 0) {
                                        cVar.b(B);
                                        B = 0;
                                    }
                                    cVar.b(child);
                                }
                            }
                            child = child.getChild();
                            B = B;
                            cVar = cVar;
                        }
                        if (i14 == 1) {
                        }
                    }
                    B = k.b(cVar);
                }
            }
            if (cVarJ1 == parent) {
                return;
            }
        }
    }

    @Override // h5.g
    public final void i(f5.z0 z0Var) {
        if (p005kotlin.jvm.internal.s.g(this.f81783y, z0Var)) {
            return;
        }
        this.f81783y = z0Var;
        y yVar = this.f81784z;
        if (yVar != null) {
            yVar.f82021b.setValue(z0Var);
        }
        T();
    }

    public final void i0(boolean z14) {
        o1 o1Var;
        if (this.f81760a || (o1Var = this.f81774n) == null) {
            return;
        }
        o1.a aVar = o1.W;
        o1Var.B(this, false, z14);
    }

    @Override // f5.j0
    public final boolean isAttached() {
        return this.f81774n != null;
    }

    @Override // h5.g
    public final void j(int i14) {
    }

    @Override // p3.i
    public final void k() {
        p002j6.a aVar = this.f81775o;
        if (aVar != null) {
            aVar.k();
        }
        f5.q0 q0Var = this.X;
        if (q0Var != null) {
            q0Var.i(true);
        }
        this.M0 = true;
        h4.r.c parent = this.P.f81684e;
        for (h4.r.c parent2 = parent; parent2 != null; parent2 = parent2.getParent()) {
            if (parent2.getIsAttached()) {
                parent2.reset$ui();
            }
        }
        for (h4.r.c parent3 = parent; parent3 != null; parent3 = parent3.getParent()) {
            if (parent3.getIsAttached()) {
                parent3.runDetachLifecycle$ui();
            }
        }
        while (parent != null) {
            if (parent.getIsAttached()) {
                parent.markAsDetached$ui();
            }
            parent = parent.getParent();
        }
        if (isAttached()) {
            this.f81779t = null;
            this.f81778r = false;
        }
        o1 o1Var = this.f81774n;
        if (o1Var != null) {
            o1Var.w(this);
        }
    }

    @Override // f5.z1
    public final void l() {
        if (this.f81767h != null) {
            h0(this, false, 5);
        } else {
            j0(this, false, 5);
        }
        r0 r0Var = this.T.f81853p;
        g6.a aVarA = r0Var.f81959j ? g6.a.a(r0Var.f69147d) : null;
        o1 o1Var = this.f81774n;
        if (aVarA != null) {
            if (o1Var != null) {
                o1Var.q(this, aVarA.f75988a);
            }
        } else if (o1Var != null) {
            o1.a aVar = o1.W;
            o1Var.c(true);
        }
    }

    public final void l0() {
        q3.c<e0> cVarN = N();
        e0[] e0VarArr = cVarN.f142356a;
        int i14 = cVarN.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            e0 e0Var = e0VarArr[i15];
            g gVar = e0Var.F;
            e0Var.E = gVar;
            if (gVar != g.NotUsed) {
                e0Var.l0();
            }
        }
    }

    @Override // h5.g
    public final void m(g6.c cVar) {
        if (p005kotlin.jvm.internal.s.g(this.A, cVar)) {
            return;
        }
        this.A = cVar;
        T();
        e0 e0VarK = K();
        if (e0VarK != null) {
            e0VarK.R();
        } else {
            o1 o1Var = this.f81774n;
            if (o1Var != null) {
                o1Var.h();
            }
        }
        S();
        for (h4.r.c child = this.P.f81685f; child != null; child = child.getChild()) {
            child.onDensityChange();
        }
    }

    public final void m0(Throwable th3) {
        g4.h hVar = (g4.h) this.D.a(g4.j.f75742a);
        if (hVar == null) {
            throw th3;
        }
        hVar.g(this, th3);
        throw th3;
    }

    @Override // h5.g
    public final void n(g6.o oVar) {
        if (this.B != oVar) {
            this.B = oVar;
            T();
            e0 e0VarK = K();
            if (e0VarK != null) {
                e0VarK.R();
            } else {
                o1 o1Var = this.f81774n;
                if (o1Var != null) {
                    o1Var.h();
                }
            }
            S();
            for (h4.r.c child = this.P.f81685f; child != null; child = child.getChild()) {
                child.onLayoutDirectionChange();
            }
        }
    }

    public final void n0(int i14) {
        e0 e0VarK;
        e0 e0VarK2;
        int i15 = this.L0;
        if (i15 != i14) {
            if (i14 > 0 && i15 == 0 && (e0VarK2 = K()) != null) {
                e0VarK2.n0(e0VarK2.L0 + 1);
            }
            if (i14 == 0 && this.L0 > 0 && (e0VarK = K()) != null) {
                e0VarK.n0(e0VarK.L0 - 1);
            }
            this.L0 = i14;
        }
    }

    @Override // f5.j0
    /* JADX INFO: renamed from: o, reason: from getter */
    public final boolean getM0() {
        return this.M0;
    }

    public final void o0(e0 e0Var) {
        if (p005kotlin.jvm.internal.s.g(e0Var, this.f81767h)) {
            return;
        }
        this.f81767h = e0Var;
        j0 j0Var = this.T;
        if (e0Var != null) {
            if (j0Var.f81854q == null) {
                j0Var.f81854q = new n0(j0Var);
            }
            a1 a1Var = this.P;
            c1 c1Var = a1Var.f81682c.f81714t;
            for (c1 c1Var2 = a1Var.f81683d; !p005kotlin.jvm.internal.s.g(c1Var2, c1Var) && c1Var2 != null; c1Var2 = c1Var2.f81714t) {
                c1Var2.v1();
            }
        } else {
            j0Var.f81854q = null;
            j0Var.f81843f = false;
            j0Var.f81842e = false;
        }
        T();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1, types: [h5.a1$b] */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3, types: [int] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [q3.c<h4.r$b>] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v3, types: [h4.r$c, h5.c1] */
    /* JADX WARN: Type inference failed for: r9v1, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
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
    public final void p(h4.r rVar) {
        ?? r14;
        boolean z14;
        q3.c<h4.r.b> cVar;
        q3.c<h4.r.b> cVar2;
        boolean z15;
        a1 a1Var;
        boolean z16;
        q3.c<h4.r.b> cVar3;
        a1 a1Var2;
        ?? r15;
        q3.c<h4.r.b> cVar4;
        ?? r16;
        boolean z17;
        q3.c<h4.r.b> cVar5;
        q3.c<h4.r.b> cVar6;
        q3.c<h4.r.b> cVar7;
        q3.c<h4.r.b> cVar8;
        char c14;
        q3.c<h4.r.b> cVar9;
        b1 b1Var;
        a1 a1Var3 = this.P;
        boolean zD = a1Var3.d(16);
        b2 b2Var = a1Var3.f81684e;
        boolean zD2 = a1Var3.d(1024);
        this.f81771k0 = rVar;
        w wVar = a1Var3.f81682c;
        e0 e0Var = a1Var3.f81680a;
        h4.r.c cVar10 = a1Var3.f81685f;
        a1.b bVar = a1Var3.f81681b;
        if (cVar10 == bVar) {
            e5.a.b("padChain called on already padded chain");
        }
        h4.r.c cVar11 = a1Var3.f81685f;
        cVar11.setParent$ui(bVar);
        bVar.setChild$ui(cVar11);
        q3.c<h4.r.b> cVar12 = a1Var3.f81686g;
        int i14 = cVar12 != null ? cVar12.f142358c : 0;
        q3.c<h4.r.b> cVar13 = a1Var3.f81687h;
        if (cVar13 == null) {
            cVar13 = new q3.c<>(new h4.r.b[16], 0);
        }
        q3.c<h4.r> cVar14 = a1Var3.f81688i;
        cVar14.b(rVar);
        b1 b1Var2 = null;
        while (true) {
            int i15 = cVar14.f142358c;
            if (i15 == 0) {
                break;
            }
            h4.r rVarK = cVar14.k(i15 - 1);
            if (rVarK instanceof h4.h) {
                h4.h hVar = (h4.h) rVarK;
                cVar14.b(hVar.f81557b);
                cVar14.b(hVar.f81556a);
            } else if (rVarK instanceof h4.r.b) {
                cVar13.b(rVarK);
            } else {
                if (b1Var2 == null) {
                    b1Var = new b1(cVar13);
                    b1Var2 = b1Var;
                } else {
                    b1Var = b1Var2;
                }
                rVarK.all(b1Var);
            }
        }
        int i16 = cVar13.f142358c;
        if (i16 == i14) {
            h4.r.c child = bVar.getChild();
            int i17 = 0;
            while (true) {
                if (child == null) {
                    cVar6 = cVar12;
                } else if (i17 < i14) {
                    if (cVar6 == null) {
                        throw e5.m("expected prior modifier list to be non-empty");
                    }
                    h4.r.b bVar2 = cVar6.f142356a[i17];
                    h4.r.b bVar3 = cVar13.f142356a[i17];
                    if (p005kotlin.jvm.internal.s.g(bVar2, bVar3)) {
                        cVar9 = cVar6;
                        c14 = 2;
                    } else {
                        cVar8 = cVar6;
                        c14 = bVar2.getClass() == bVar3.getClass() ? (char) 1 : (char) 0;
                    }
                    if (c14 == 0) {
                        cVar9 = cVar8;
                        cVar9 = cVar8;
                        child = child.getParent();
                        cVar7 = cVar9;
                        break;
                    }
                    cVar9 = cVar8;
                    cVar9 = cVar8;
                    if (c14 == 1) {
                        a1.h(bVar2, bVar3, child);
                    }
                    child = child.getChild();
                    i17++;
                    cVar6 = cVar9;
                }
                cVar7 = cVar6;
                break;
            }
            if (i17 >= i14) {
                a1Var3 = a1Var3;
                cVar3 = cVar7;
                z16 = false;
                a1Var2 = a1Var3;
                r15 = bVar;
                cVar2 = cVar13;
                z14 = false;
                z15 = false;
                cVar4 = cVar3;
                r14 = z16;
            } else {
                if (cVar7 == null) {
                    throw e5.m("expected prior modifier list to be non-empty");
                }
                if (child == null) {
                    throw e5.m("structuralUpdate requires a non-null tail");
                }
                boolean z18 = e0Var.H0 != null;
                h4.r.c cVar15 = child;
                a1 a1Var4 = a1Var3;
                cVar2 = cVar13;
                q3.c<h4.r.b> cVar16 = cVar7;
                z17 = false;
                a1Var4.f(i17, cVar16, cVar2, cVar15, !z18);
                a1Var = a1Var4;
                cVar5 = cVar16;
                z14 = false;
                z15 = true;
                a1Var2 = a1Var;
                cVar4 = cVar5;
                r15 = bVar;
                r14 = z17;
            }
        } else {
            r14 = 0;
            z17 = false;
            z16 = false;
            if (e0Var.H0 != null && i14 == 0) {
                h4.r.c cVar17 = bVar;
                int i18 = 0;
                while (i18 < cVar13.f142358c) {
                    h4.r.c cVarB = a1.b(cVar13.f142356a[i18], cVar17);
                    i18++;
                    cVar17 = cVarB;
                }
                int kindSet = 0;
                for (h4.r.c parent = b2Var.getParent(); parent != null && parent != bVar; parent = parent.getParent()) {
                    kindSet |= parent.getKindSet();
                    parent.setAggregateChildKindSet$ui(kindSet);
                }
                a1Var = a1Var3;
                cVar2 = cVar13;
                cVar5 = cVar12;
                z14 = false;
                z15 = true;
                a1Var2 = a1Var;
                cVar4 = cVar5;
                r15 = bVar;
                r14 = z17;
            } else if (i16 != 0) {
                if (cVar12 == null) {
                    z14 = false;
                    cVar = new q3.c<>(new h4.r.b[16], 0);
                } else {
                    z14 = false;
                    cVar = cVar12;
                }
                boolean z19 = e0Var.H0 != null ? true : z14;
                a1 a1Var5 = a1Var3;
                a1.b bVar4 = bVar;
                cVar2 = cVar13;
                a1Var5.f(0, cVar, cVar2, bVar4, !z19);
                z15 = true;
                a1Var2 = a1Var5;
                cVar4 = cVar;
                r15 = bVar4;
            } else {
                if (cVar12 == null) {
                    throw e5.m("expected prior modifier list to be non-empty");
                }
                h4.r.c child2 = bVar.getChild();
                for (int i19 = 0; child2 != null && i19 < cVar12.f142358c; i19++) {
                    child2 = a1.c(child2).getChild();
                }
                e0 e0VarK = e0Var.K();
                wVar.f81715v = e0VarK != null ? e0VarK.P.f81682c : null;
                a1Var3.f81683d = wVar;
                cVar3 = cVar12;
                a1Var2 = a1Var3;
                r15 = bVar;
                cVar2 = cVar13;
                z14 = false;
                z15 = false;
                cVar4 = cVar3;
                r14 = z16;
            }
        }
        a1Var2.f81686g = cVar2;
        if (cVar4 != null) {
            cVar4.g();
            r16 = cVar4;
        } else {
            r16 = r14;
        }
        a1Var2.f81687h = r16;
        h4.r.c child3 = r15.getChild();
        ?? r17 = b2Var;
        if (child3 != null) {
            r17 = child3;
        }
        r17.setParent$ui(r14);
        r15.setChild$ui(r14);
        r15.setAggregateChildKindSet$ui(-1);
        r15.updateCoordinator$ui(r14);
        if (r17 == r15) {
            e5.a.b("trimChain did not update the head");
        }
        a1Var2.f81685f = r17;
        if (z15) {
            a1Var2.g();
        }
        boolean zD3 = a1Var2.d(16);
        boolean zD4 = a1Var2.d(1024);
        this.T.j();
        if (this.f81767h == null && a1Var2.d(512)) {
            o0(this);
        }
        if (zD == zD3 && zD2 == zD4) {
            return;
        }
        q5.e rectManager = i0.a(this).getRectManager();
        rectManager.getClass();
        if (isAttached()) {
            q5.c cVar18 = rectManager.f142832b;
            int i24 = this.f81761b & 33554431;
            long[] jArr = cVar18.f142825a;
            int i25 = cVar18.f142827c;
            for (?? r18 = z14; r18 < jArr.length - 2 && r18 < i25; r18 += 3) {
                int i26 = r18 + 2;
                long j8 = jArr[i26];
                if ((((int) j8) & 33554431) == i24) {
                    jArr[i26] = ((zD3 ? 1L : 0L) * Longs.MAX_POWER_OF_TWO) | ((-6917529027641081857L) & j8) | ((zD4 ? 1L : 0L) * 2305843009213693952L);
                    return;
                }
            }
        }
    }

    public final void p0() {
        if (this.f81768i <= 0 || !this.f81772l) {
            return;
        }
        this.f81772l = false;
        q3.c<e0> cVar = this.f81770k;
        if (cVar == null) {
            cVar = new q3.c<>(new e0[16], 0);
            this.f81770k = cVar;
        }
        cVar.g();
        q3.c<e0> cVar2 = this.f81769j.f82027a;
        e0[] e0VarArr = cVar2.f142356a;
        int i14 = cVar2.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            e0 e0Var = e0VarArr[i15];
            if (e0Var.f81760a) {
                cVar.d(cVar.f142358c, e0Var.N());
            } else {
                cVar.b(e0Var);
            }
        }
        j0 j0Var = this.T;
        j0Var.f81853p.C = true;
        n0 n0Var = j0Var.f81854q;
        if (n0Var != null) {
            n0Var.f81913w = true;
        }
    }

    public final void q(o1 o1Var) {
        e0 e0Var;
        if (this.f81774n != null) {
            e5.a.b("Cannot attach " + this + " as it already is attached.  Tree: " + t(0));
        }
        e0 e0Var2 = this.f81773m;
        if (e0Var2 != null && !p005kotlin.jvm.internal.s.g(e0Var2.f81774n, o1Var)) {
            StringBuilder sb3 = new StringBuilder("Attaching to a different owner(");
            sb3.append(o1Var);
            sb3.append(") than the parent's owner(");
            e0 e0VarK = K();
            sb3.append(e0VarK != null ? e0VarK.f81774n : null);
            sb3.append("). This tree: ");
            sb3.append(t(0));
            sb3.append(" Parent tree: ");
            e0 e0Var3 = this.f81773m;
            sb3.append(e0Var3 != null ? e0Var3.t(0) : null);
            e5.a.b(sb3.toString());
        }
        e0 e0VarK2 = K();
        j0 j0Var = this.T;
        if (e0VarK2 == null) {
            j0Var.f81853p.f81970v = true;
            o1Var.getRectManager().e(this);
            n0 n0Var = j0Var.f81854q;
            if (n0Var != null) {
                n0Var.f81910r = n0.a.IsPlacedInLookahead;
            }
        }
        a1 a1Var = this.P;
        a1Var.f81683d.f81715v = e0VarK2 != null ? e0VarK2.P.f81682c : null;
        this.f81774n = o1Var;
        this.f81776p = (e0VarK2 != null ? e0VarK2.f81776p : -1) + 1;
        h4.r rVar = this.H0;
        if (rVar != null) {
            p(rVar);
        }
        this.H0 = null;
        o1Var.d(this);
        e0 e0Var4 = this.f81773m;
        if (e0Var4 == null || (e0Var = e0Var4.f81767h) == null) {
            e0Var = this.f81767h;
        }
        o0(e0Var);
        if (this.f81767h == null && a1Var.d(512)) {
            o0(this);
        }
        if (!this.M0) {
            for (h4.r.c child = a1Var.f81685f; child != null; child = child.getChild()) {
                child.markAsAttached$ui();
            }
        }
        q3.c<e0> cVar = this.f81769j.f82027a;
        e0[] e0VarArr = cVar.f142356a;
        int i14 = cVar.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            e0VarArr[i15].q(o1Var);
        }
        if (!this.M0) {
            a1Var.e();
        }
        T();
        if (e0VarK2 != null) {
            e0VarK2.T();
        }
        j6.a.f fVar = this.I0;
        if (fVar != null) {
            fVar.invoke(o1Var);
        }
        j0Var.j();
        if (!this.M0 && a1Var.d(8)) {
            U();
        }
        o1Var.e(this);
    }

    public final void r() {
        this.F = this.E;
        this.E = g.NotUsed;
        q3.c<e0> cVarN = N();
        e0[] e0VarArr = cVarN.f142356a;
        int i14 = cVarN.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            e0 e0Var = e0VarArr[i15];
            if (e0Var.E != g.NotUsed) {
                e0Var.r();
            }
        }
    }

    public final void s() {
        this.F = this.E;
        this.E = g.NotUsed;
        q3.c<e0> cVarN = N();
        e0[] e0VarArr = cVarN.f142356a;
        int i14 = cVarN.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            e0 e0Var = e0VarArr[i15];
            if (e0Var.E == g.InLayoutBlock) {
                e0Var.s();
            }
        }
    }

    public final String t(int i14) {
        StringBuilder sb3 = new StringBuilder();
        for (int i15 = 0; i15 < i14; i15++) {
            sb3.append("  ");
        }
        sb3.append("|-");
        sb3.append(toString());
        sb3.append('\n');
        q3.c<e0> cVarN = N();
        e0[] e0VarArr = cVarN.f142356a;
        int i16 = cVarN.f142358c;
        for (int i17 = 0; i17 < i16; i17++) {
            sb3.append(e0VarArr[i17].t(i14 + 1));
        }
        String string = sb3.toString();
        return i14 == 0 ? fb1.c.m(1, 0, string) : string;
    }

    public final String toString() {
        return o3.b(this) + " children: " + ((q3.c.a) D()).f142359a.f142358c + " measurePolicy: " + this.f81783y + " deactivated: " + this.M0;
    }

    public final void u() {
        k0 k0Var;
        o1 o1Var = this.f81774n;
        if (o1Var == null) {
            StringBuilder sb3 = new StringBuilder("Cannot detach node that is already detached!  Tree: ");
            e0 e0VarK = K();
            sb3.append(e0VarK != null ? e0VarK.t(0) : null);
            e5.a.c(sb3.toString());
            o2.c.f();
            return;
        }
        e0 e0VarK2 = K();
        j0 j0Var = this.T;
        if (e0VarK2 != null) {
            e0VarK2.R();
            e0VarK2.T();
            r0 r0Var = j0Var.f81853p;
            g gVar = g.NotUsed;
            r0Var.f81962l = gVar;
            n0 n0Var = j0Var.f81854q;
            if (n0Var != null) {
                n0Var.f81902j = gVar;
            }
        }
        g0 g0Var = j0Var.f81853p.A;
        g0Var.f81662b = true;
        g0Var.f81663c = false;
        g0Var.f81665e = false;
        g0Var.f81664d = false;
        g0Var.f81666f = false;
        g0Var.f81667g = false;
        g0Var.f81668h = null;
        n0 n0Var2 = j0Var.f81854q;
        if (n0Var2 != null && (k0Var = n0Var2.f81911t) != null) {
            k0Var.f81662b = true;
            k0Var.f81663c = false;
            k0Var.f81665e = false;
            k0Var.f81664d = false;
            k0Var.f81666f = false;
            k0Var.f81667g = false;
            k0Var.f81668h = null;
        }
        a1 a1Var = this.P;
        h4.r.c parent = a1Var.f81684e;
        c1 c1Var = a1Var.f81682c.f81714t;
        for (c1 c1Var2 = a1Var.f81683d; !p005kotlin.jvm.internal.s.g(c1Var2, c1Var) && c1Var2 != null; c1Var2 = c1Var2.f81714t) {
            c1Var2.c2();
            if (c1Var2.f81711p.g()) {
                c1Var2.X1();
            }
        }
        j6.a.g gVar2 = this.J0;
        if (gVar2 != null) {
            gVar2.invoke(o1Var);
        }
        for (h4.r.c parent2 = parent; parent2 != null; parent2 = parent2.getParent()) {
            if (parent2.getIsAttached()) {
                parent2.runDetachLifecycle$ui();
            }
        }
        this.f81777q = true;
        q3.c<e0> cVar = this.f81769j.f82027a;
        e0[] e0VarArr = cVar.f142356a;
        int i14 = cVar.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            e0VarArr[i15].u();
        }
        Unit unit = Unit.INSTANCE;
        this.f81777q = false;
        while (parent != null) {
            if (parent.getIsAttached()) {
                parent.markAsDetached$ui();
            }
            parent = parent.getParent();
        }
        o1Var.l(this);
        o1Var.getRectManager().f(this);
        this.f81774n = null;
        o0(null);
        this.f81776p = 0;
        r0 r0Var2 = j0Var.f81853p;
        r0Var2.f81958i = Integer.MAX_VALUE;
        r0Var2.f81957h = Integer.MAX_VALUE;
        r0Var2.f81970v = false;
        n0 n0Var3 = j0Var.f81854q;
        if (n0Var3 != null) {
            n0Var3.f81901i = Integer.MAX_VALUE;
            n0Var3.f81900h = Integer.MAX_VALUE;
            n0Var3.f81910r = n0.a.IsNotPlaced;
        }
        if (a1Var.d(8)) {
            p5.q qVar = this.f81779t;
            this.f81779t = null;
            this.f81778r = false;
            p1.q0<p5.t> q0Var = o1Var.getSemanticsOwner().f135954d;
            Object[] objArr = q0Var.f134667a;
            int i16 = q0Var.f134668b;
            for (int i17 = 0; i17 < i16; i17++) {
                ((p5.t) objArr[i17]).a(this, qVar);
            }
            o1Var.D();
        }
    }

    public final void v(o4.y yVar, r4.c cVar) {
        try {
            this.P.f81683d.s1(yVar, cVar);
            Unit unit = Unit.INSTANCE;
        } catch (Throwable th3) {
            m0(th3);
            throw null;
        }
    }

    public final List<f5.y0> x() {
        n0 n0Var = this.T.f81854q;
        n0Var.getClass();
        q3.c<n0> cVar = n0Var.f81912v;
        j0 j0Var = n0Var.f81898f;
        j0Var.f81838a.D();
        if (!n0Var.f81913w) {
            return cVar.f();
        }
        e0 e0Var = j0Var.f81838a;
        q3.c<e0> cVarN = e0Var.N();
        e0[] e0VarArr = cVarN.f142356a;
        int i14 = cVarN.f142358c;
        for (int i15 = 0; i15 < i14; i15++) {
            e0 e0Var2 = e0VarArr[i15];
            if (cVar.f142358c <= i15) {
                n0 n0Var2 = e0Var2.T.f81854q;
                n0Var2.getClass();
                cVar.b(n0Var2);
            } else {
                n0 n0Var3 = e0Var2.T.f81854q;
                n0Var3.getClass();
                n0[] n0VarArr = cVar.f142356a;
                n0 n0Var4 = n0VarArr[i15];
                n0VarArr[i15] = n0Var3;
            }
        }
        cVar.l(((q3.c.a) e0Var.D()).f142359a.f142358c, cVar.f142358c);
        n0Var.f81913w = false;
        return cVar.f();
    }

    @Override // p5.s
    public final p5.q y() {
        if (isAttached() && !this.M0 && this.P.d(8)) {
            return this.f81779t;
        }
        return null;
    }

    @Override // p5.s
    public final List<p5.s> z() {
        return D();
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh5/e0$d;", "", "<init>", "()V", "Lh5/e0$f;", "ErrorMeasurePolicy", "Lh5/e0$f;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d {
        public /* synthetic */ d(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private d() {
        }
    }

    public e0(boolean z14, int i14, int i15, p005kotlin.jvm.internal.j jVar) {
        this((i15 & 1) != 0 ? false : z14, (i15 & 2) != 0 ? p5.v.f136092a.addAndGet(1) : i14);
    }

    public e0() {
        this(false, 0, 3, null);
    }
}
