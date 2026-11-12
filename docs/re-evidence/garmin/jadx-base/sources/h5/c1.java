package h5;

import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.nimbusds.jose.jwk.JWKParameterNames;
import i3.e5;
import java.util.Map;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b!\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002\t\nB\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lh5/c1;", "Lh5/l0;", "Lf5/y0;", "Lf5/c0;", "Lh5/p1;", "Lh5/e0;", "layoutNode", "<init>", "(Lh5/e0;)V", "f", JWKParameterNames.RSA_EXPONENT, "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class c1 extends l0 implements f5.y0, f5.c0, p1 {
    public static final e M0 = new e(null);
    public static final d N0 = d.f81721a;
    public static final c O0 = c.f81720a;
    public static final o4.o1 P0 = new o4.o1();
    public static final a0 Q0 = new a0();
    public static final float[] R0 = o4.a1.b();
    public static final a S0 = new a();
    public static final b T0 = new b();
    public g6.o A;
    public float B = 0.8f;
    public f5.a1 C;
    public p1.p0<f5.a> D;
    public long E;
    public float F;
    public d1 H0;
    public n4.b I;
    public final g I0;
    public boolean J0;
    public n1 K0;
    public r4.c L0;
    public a0 P;
    public o4.r1 T;
    public boolean X;
    public boolean Y;
    public r4.c Z;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public o4.y f81710k0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final e0 f81711p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f81712q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f81713r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public c1 f81714t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c1 f81715v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f81716w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f81717x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e23.l<? super o4.t0, Unit> f81718y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public g6.c f81719z;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h5/c1$a", "Lh5/c1$f;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements f {
        @Override // h5.c1.f
        public final int a() {
            return 16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v1 */
        /* JADX WARN: Type inference failed for: r1v10 */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3, types: [q3.c] */
        /* JADX WARN: Type inference failed for: r1v4 */
        /* JADX WARN: Type inference failed for: r1v5 */
        /* JADX WARN: Type inference failed for: r1v6, types: [q3.c] */
        /* JADX WARN: Type inference failed for: r1v8 */
        /* JADX WARN: Type inference failed for: r1v9 */
        /* JADX WARN: Type inference failed for: r3v4 */
        /* JADX WARN: Type inference failed for: r9v0, types: [h4.r$c] */
        /* JADX WARN: Type inference failed for: r9v1, types: [h4.r$c] */
        /* JADX WARN: Type inference failed for: r9v10 */
        /* JADX WARN: Type inference failed for: r9v11 */
        /* JADX WARN: Type inference failed for: r9v3 */
        /* JADX WARN: Type inference failed for: r9v4, types: [h4.r$c] */
        /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r9v6 */
        /* JADX WARN: Type inference failed for: r9v7 */
        /* JADX WARN: Type inference failed for: r9v8 */
        /* JADX WARN: Type inference failed for: r9v9 */
        @Override // h5.c1.f
        public final boolean b(h4.r.c cVar) {
            ?? cVar2 = 0;
            while (cVar != 0) {
                if (cVar instanceof u1) {
                    ((u1) cVar).E();
                } else if ((cVar.getKindSet() & 16) != 0 && (cVar instanceof m)) {
                    h4.r.c child = ((m) cVar).f81888b;
                    int i14 = 0;
                    cVar2 = cVar2;
                    cVar = cVar;
                    while (child != null) {
                        if ((child.getKindSet() & 16) != 0) {
                            i14++;
                            if (i14 == 1) {
                                cVar2 = cVar2;
                                cVar = child;
                            } else {
                                if (cVar2 == 0) {
                                    cVar2 = new q3.c(new h4.r.c[16], 0);
                                }
                                if (cVar != 0) {
                                    cVar2.b(cVar);
                                    cVar = 0;
                                }
                                cVar2.b(child);
                            }
                        }
                        child = child.getChild();
                        cVar2 = cVar2;
                        cVar = cVar;
                    }
                    if (i14 == 1) {
                    }
                }
                cVar = k.b(cVar2);
            }
            return false;
        }

        @Override // h5.c1.f
        public final boolean c(e0 e0Var) {
            return true;
        }

        @Override // h5.c1.f
        public final boolean d(v vVar, e0 e0Var) {
            if (!e0Var.P.f81683d.e2()) {
                return false;
            }
            vVar.f82002c = vVar.f82000a.f134668b - 1;
            return true;
        }

        @Override // h5.c1.f
        public final void f(e0 e0Var, long j8, v vVar, int i14, boolean z14) {
            e0Var.O(j8, vVar, i14, z14);
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"h5/c1$b", "Lh5/c1$f;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements f {
        @Override // h5.c1.f
        public final int a() {
            return 8;
        }

        @Override // h5.c1.f
        public final boolean b(h4.r.c cVar) {
            return false;
        }

        @Override // h5.c1.f
        public final boolean c(e0 e0Var) {
            p5.q qVarY = e0Var.y();
            boolean z14 = false;
            if (qVarY != null && qVarY.f136089e) {
                z14 = true;
            }
            return !z14;
        }

        @Override // h5.c1.f
        public final boolean d(v vVar, e0 e0Var) {
            return false;
        }

        @Override // h5.c1.f
        public final boolean e(h4.r.c cVar) {
            if (h4.i.f81566h) {
                return p5.c0.f(p5.z.a(k.g(cVar), false));
            }
            return true;
        }

        @Override // h5.c1.f
        public final void f(e0 e0Var, long j8, v vVar, int i14, boolean z14) {
            e0Var.P(j8, vVar, z14);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh5/c1;", "coordinator", "", "invoke", "(Lh5/c1;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class c extends p005kotlin.jvm.internal.w implements e23.l<c1, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f81720a = new c();

        public c() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(c1 c1Var) {
            n1 n1Var = c1Var.K0;
            if (n1Var != null) {
                n1Var.invalidate();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lh5/c1;", "coordinator", "", "invoke", "(Lh5/c1;)V", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class d extends p005kotlin.jvm.internal.w implements e23.l<c1, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f81721a = new d();

        public d() {
            super(1);
        }

        @Override // e23.l
        public final Unit invoke(c1 c1Var) {
            c1 c1Var2 = c1Var;
            e0 e0Var = c1Var2.f81711p;
            try {
                if (c1Var2.X0()) {
                    c1Var2.l2(true);
                }
                return Unit.INSTANCE;
            } catch (Throwable th3) {
                e0Var.m0(th3);
                throw null;
            }
        }
    }

    public interface f {
        int a();

        boolean b(h4.r.c cVar);

        boolean c(e0 e0Var);

        boolean d(v vVar, e0 e0Var);

        default boolean e(h4.r.c cVar) {
            return true;
        }

        void f(e0 e0Var, long j8, v vVar, int i14, boolean z14);
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class g extends p005kotlin.jvm.internal.w implements e23.a<Unit> {
        public g() {
            super(0);
        }

        @Override // e23.a
        public final Unit invoke() {
            c1 c1Var = c1.this.f81715v;
            if (c1Var != null) {
                c1Var.R1();
            }
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class h extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h4.r.c f81724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f81725c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f81726d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ v f81727e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f81728f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f81729g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f81730h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final /* synthetic */ boolean f81731i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(h4.r.c cVar, f fVar, long j8, v vVar, int i14, boolean z14, float f14, boolean z15) {
            super(0);
            this.f81724b = cVar;
            this.f81725c = fVar;
            this.f81726d = j8;
            this.f81727e = vVar;
            this.f81728f = i14;
            this.f81729g = z14;
            this.f81730h = f14;
            this.f81731i = z15;
        }

        @Override // e23.a
        public final Unit invoke() {
            h4.r.c cVarA = f1.a(this.f81724b, this.f81725c.a());
            e eVar = c1.M0;
            c1.this.Y1(cVarA, this.f81725c, this.f81726d, this.f81727e, this.f81728f, this.f81729g, this.f81730h, this.f81731i);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class i extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h4.r.c f81733b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ f f81734c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f81735d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ v f81736e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f81737f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ boolean f81738g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ float f81739h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h4.r.c cVar, f fVar, long j8, v vVar, int i14, boolean z14, float f14) {
            super(0);
            this.f81733b = cVar;
            this.f81734c = fVar;
            this.f81735d = j8;
            this.f81736e = vVar;
            this.f81737f = i14;
            this.f81738g = z14;
            this.f81739h = f14;
        }

        @Override // e23.a
        public final Unit invoke() {
            h4.r.c cVarA = f1.a(this.f81733b, this.f81734c.a());
            e eVar = c1.M0;
            c1.this.Y1(cVarA, this.f81734c, this.f81735d, this.f81736e, this.f81737f, this.f81738g, this.f81739h, false);
            return Unit.INSTANCE;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class j extends p005kotlin.jvm.internal.w implements e23.a<Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ e23.l<o4.t0, Unit> f81740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c1 f81741b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public j(e23.l<? super o4.t0, Unit> lVar, c1 c1Var) {
            super(0);
            this.f81740a = lVar;
            this.f81741b = c1Var;
        }

        @Override // e23.a
        public final Unit invoke() {
            o4.o1 o1Var = c1.P0;
            this.f81740a.invoke(o1Var);
            c1 c1Var = this.f81741b;
            boolean zG = p005kotlin.jvm.internal.s.g(c1Var.T, o1Var.f128916o);
            boolean z14 = c1Var.X;
            boolean z15 = o1Var.f128917p;
            boolean z16 = z14 != z15;
            if (!zG || z16) {
                c1Var.T = o1Var.f128916o;
                c1Var.X = z15;
                if (c1Var.Y && (z16 || (z15 && !zG))) {
                    c1Var.f81711p.U();
                }
            }
            c1Var.Y = true;
            o1Var.f128925z = o1Var.f128916o.a(o1Var.f128919r, o1Var.f128921v, o1Var.f128920t);
            return Unit.INSTANCE;
        }
    }

    public c1(e0 e0Var) {
        this.f81711p = e0Var;
        this.f81719z = e0Var.A;
        this.A = e0Var.B;
        g6.k.f76003b.getClass();
        this.E = 0L;
        this.T = o4.m1.f128891a;
        this.I0 = new g();
    }

    public static c1 g2(f5.c0 c0Var) {
        c1 c1Var;
        f5.x0 x0Var = c0Var instanceof f5.x0 ? (f5.x0) c0Var : null;
        if (x0Var != null && (c1Var = x0Var.f69154a.f81889p) != null) {
            return c1Var;
        }
        c0Var.getClass();
        return (c1) c0Var;
    }

    @Override // f5.c0
    public final long B(long j8) {
        if (!isAttached()) {
            e5.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        T1();
        for (c1 c1Var = this; c1Var != null; c1Var = c1Var.f81715v) {
            e0 e0Var = c1Var.f81711p;
            if (c1Var == e0Var.P.f81683d && !e0Var.f81762c) {
                long jB = i0.a(e0Var).getRectManager().b(e0Var);
                g6.k.f76003b.getClass();
                if (!g6.k.c(jB, g6.k.f76004c)) {
                    return jg.b.I(j8, jB);
                }
            }
            n1 n1Var = c1Var.K0;
            if (n1Var != null) {
                j8 = n1Var.c(j8, false);
            }
            j8 = jg.b.I(j8, c1Var.E);
        }
        return j8;
    }

    public final long B1(long j8) {
        long j14 = this.E;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        g6.k.a aVar = g6.k.f76003b;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j8 & 4294967295L)) - ((int) (j14 & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(fIntBitsToFloat - ((int) (j14 >> 32)))) << 32);
        n4.c.a aVar2 = n4.c.f123541b;
        n1 n1Var = this.K0;
        return n1Var != null ? n1Var.c(jFloatToRawIntBits, true) : jFloatToRawIntBits;
    }

    public abstract m0 D1();

    public final long E1() {
        return this.f81719z.k1(this.f81711p.C.g());
    }

    @Override // f5.c0
    public final long F(long j8) {
        if (!isAttached()) {
            e5.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        f5.c0 c0VarC = f5.d0.c(this);
        return X(c0VarC, n4.c.i(i0.a(this.f81711p).m(j8), f5.d0.e(c0VarC)));
    }

    public abstract h4.r.c F1();

    @Override // f5.c0
    public final void G(f5.c0 c0Var, float[] fArr) {
        c1 c1VarG2 = g2(c0Var);
        c1VarG2.T1();
        c1 c1VarX1 = x1(c1VarG2);
        o4.a1.e(fArr);
        c1VarG2.j2(c1VarX1, fArr);
        i2(c1VarX1, fArr);
    }

    public final h4.r.c I1(int i14) {
        boolean zH = g1.h(i14);
        h4.r.c cVarF1 = F1();
        if (!zH && (cVarF1 = cVarF1.getParent()) == null) {
            return null;
        }
        for (h4.r.c cVarJ1 = J1(zH); cVarJ1 != null && (cVarJ1.getAggregateChildKindSet() & i14) != 0; cVarJ1 = cVarJ1.getChild()) {
            if ((cVarJ1.getKindSet() & i14) != 0) {
                return cVarJ1;
            }
            if (cVarJ1 == cVarF1) {
                return null;
            }
        }
        return null;
    }

    public final h4.r.c J1(boolean z14) {
        h4.r.c cVarF1;
        a1 a1Var = this.f81711p.P;
        if (a1Var.f81683d == this) {
            return a1Var.f81685f;
        }
        c1 c1Var = this.f81715v;
        if (!z14) {
            if (c1Var != null) {
                return c1Var.F1();
            }
            return null;
        }
        if (c1Var == null || (cVarF1 = c1Var.F1()) == null) {
            return null;
        }
        return cVarF1.getChild();
    }

    public final void M1(h4.r.c cVar, f fVar, long j8, v vVar, int i14, boolean z14) {
        if (cVar == null) {
            P1(fVar, j8, vVar, i14, z14);
            return;
        }
        if (!fVar.e(cVar)) {
            M1(f1.a(cVar, fVar.a()), fVar, j8, vVar, i14, z14);
            return;
        }
        int i15 = vVar.f82002c;
        p1.q0<Object> q0Var = vVar.f82000a;
        vVar.b(i15 + 1, q0Var.f134668b);
        vVar.f82002c++;
        q0Var.g(cVar);
        vVar.f82001b.a(ge1.b.e(z14, false, -1.0f));
        M1(f1.a(cVar, fVar.a()), fVar, j8, vVar, i14, z14);
        vVar.f82002c = i15;
    }

    public final void N1(h4.r.c cVar, f fVar, long j8, v vVar, int i14, boolean z14, float f14) {
        if (cVar == null) {
            P1(fVar, j8, vVar, i14, z14);
            return;
        }
        if (!fVar.e(cVar)) {
            N1(f1.a(cVar, fVar.a()), fVar, j8, vVar, i14, z14, f14);
            return;
        }
        int i15 = vVar.f82002c;
        p1.q0<Object> q0Var = vVar.f82000a;
        vVar.b(i15 + 1, q0Var.f134668b);
        vVar.f82002c++;
        q0Var.g(cVar);
        vVar.f82001b.a(ge1.b.e(z14, false, f14));
        Y1(f1.a(cVar, fVar.a()), fVar, j8, vVar, i14, z14, f14, true);
        vVar.f82002c = i15;
    }

    @Override // h5.l0
    public final l0 O0() {
        return this.f81714t;
    }

    public final void O1(f fVar, long j8, v vVar, int i14, boolean z14) {
        boolean z15;
        h4.r.c cVarI1 = I1(fVar.a());
        boolean z16 = false;
        if (!m2(j8)) {
            b5.m0.f15849b.getClass();
            if (i14 == b5.m0.f15850c) {
                float fO1 = o1(j8, E1());
                if ((Float.floatToRawIntBits(fO1) & Integer.MAX_VALUE) < 2139095040) {
                    if (vVar.f82002c != vVar.f82000a.f134668b - 1) {
                        if (q.a(vVar.a(), ge1.b.e(false, false, fO1)) <= 0) {
                            return;
                        }
                    }
                    N1(cVarI1, fVar, j8, vVar, i14, false, fO1);
                    return;
                }
                return;
            }
            return;
        }
        if (cVarI1 == null) {
            P1(fVar, j8, vVar, i14, z14);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < n0() && fIntBitsToFloat2 < m0()) {
            M1(cVarI1, fVar, j8, vVar, i14, z14);
            return;
        }
        b5.m0.f15849b.getClass();
        float fO2 = i14 == b5.m0.f15850c ? o1(j8, E1()) : Float.POSITIVE_INFINITY;
        if ((Float.floatToRawIntBits(fO2) & Integer.MAX_VALUE) < 2139095040) {
            if (vVar.f82002c == vVar.f82000a.f134668b - 1) {
                z15 = z14;
            } else {
                z15 = z14;
                if (q.a(vVar.a(), ge1.b.e(z15, false, fO2)) > 0) {
                }
            }
            z16 = true;
        } else {
            z15 = z14;
        }
        Y1(cVarI1, fVar, j8, vVar, i14, z15, fO2, z16);
    }

    @Override // h5.l0
    public final boolean P0() {
        return this.C != null;
    }

    public void P1(f fVar, long j8, v vVar, int i14, boolean z14) {
        c1 c1Var = this.f81714t;
        if (c1Var != null) {
            c1Var.O1(fVar, c1Var.B1(j8), vVar, i14, z14);
        }
    }

    @Override // h5.l0
    public final f5.a1 Q0() {
        f5.a1 a1Var = this.C;
        if (a1Var != null) {
            return a1Var;
        }
        vb.h.z("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    public final void R1() {
        n1 n1Var = this.K0;
        if (n1Var != null) {
            n1Var.invalidate();
            return;
        }
        c1 c1Var = this.f81715v;
        if (c1Var != null) {
            c1Var.R1();
        }
    }

    @Override // h5.l0
    public final l0 S0() {
        return this.f81715v;
    }

    public final boolean S1() {
        if (this.K0 != null && this.B <= 0.0f) {
            return true;
        }
        c1 c1Var = this.f81715v;
        if (c1Var != null) {
            return c1Var.S1();
        }
        return false;
    }

    public final void T1() {
        this.f81711p.T.b();
    }

    @Override // h5.l0
    /* JADX INFO: renamed from: U0, reason: from getter */
    public final long getF81890q() {
        return this.E;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r7v7, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public final void U1() {
        h4.r.c parent;
        boolean zH = g1.h(128);
        h4.r.c cVarJ1 = J1(zH);
        if (cVarJ1 == null || (cVarJ1.getNode().getAggregateChildKindSet() & 128) == 0) {
            return;
        }
        f4.f.f68735e.getClass();
        f4.f fVarA = f4.f.a.a();
        e23.l<Object, Unit> lVarE = fVarA != null ? fVarA.getF68799i() : null;
        f4.f fVarB = f4.f.a.b(fVarA);
        try {
            if (!zH) {
                parent = F1().getParent();
                if (parent == null) {
                }
                Unit unit = Unit.INSTANCE;
                f4.f.a.e(fVarA, fVarB, lVarE);
            }
            parent = F1();
            for (h4.r.c cVarJ2 = J1(zH); cVarJ2 != null && (cVarJ2.getAggregateChildKindSet() & 128) != 0; cVarJ2 = cVarJ2.getChild()) {
                if ((cVarJ2.getKindSet() & 128) != 0) {
                    ?? B = cVarJ2;
                    ?? cVar = 0;
                    while (B != 0) {
                        if (B instanceof w0) {
                            ((w0) B).e(this.f69146c);
                        } else if ((B.getKindSet() & 128) != 0 && (B instanceof m)) {
                            h4.r.c child = ((m) B).f81888b;
                            int i14 = 0;
                            B = B;
                            cVar = cVar;
                            while (child != null) {
                                if ((child.getKindSet() & 128) != 0) {
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
                if (cVarJ2 == parent) {
                    break;
                }
            }
            Unit unit2 = Unit.INSTANCE;
            f4.f.a.e(fVarA, fVarB, lVarE);
        } catch (Throwable th3) {
            f4.f.a.e(fVarA, fVarB, lVarE);
            throw th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void V1() {
        boolean zH = g1.h(4194304);
        h4.r.c cVarF1 = F1();
        if (!zH && (cVarF1 = cVarF1.getParent()) == null) {
            return;
        }
        for (h4.r.c cVarJ1 = J1(zH); cVarJ1 != null && (cVarJ1.getAggregateChildKindSet() & 4194304) != 0; cVarJ1 = cVarJ1.getChild()) {
            if ((cVarJ1.getKindSet() & 4194304) != 0) {
                ?? B = cVarJ1;
                ?? cVar = 0;
                while (B != 0) {
                    if (B instanceof b0) {
                        ((b0) B).f(this);
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
            if (cVarJ1 == cVarF1) {
                return;
            }
        }
    }

    @Override // f5.c0
    public final long W(long j8) {
        return i0.a(this.f81711p).u(B(j8));
    }

    public final void W1() {
        this.f81716w = true;
        this.I0.invoke();
        c2();
        long j8 = this.E;
        g6.k.f76003b.getClass();
        if (g6.k.c(j8, 0L)) {
            return;
        }
        this.f81711p.a0(this);
    }

    @Override // f5.c0
    public final long X(f5.c0 c0Var, long j8) {
        if (c0Var instanceof f5.x0) {
            f5.x0 x0Var = (f5.x0) c0Var;
            x0Var.f69154a.f81889p.T1();
            n4.c.a aVar = n4.c.f123541b;
            return x0Var.X(this, j8 ^ (-9223372034707292160L)) ^ (-9223372034707292160L);
        }
        c1 c1VarG2 = g2(c0Var);
        c1VarG2.T1();
        c1 c1VarX1 = x1(c1VarG2);
        while (c1VarG2 != c1VarX1) {
            n1 n1Var = c1VarG2.K0;
            if (n1Var != null) {
                j8 = n1Var.c(j8, false);
            }
            j8 = jg.b.I(j8, c1VarG2.E);
            c1VarG2 = c1VarG2.f81715v;
            c1VarG2.getClass();
        }
        return l1(c1VarX1, j8);
    }

    @Override // h5.p1
    public final boolean X0() {
        return (this.K0 == null || this.f81716w || !this.f81711p.isAttached()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void X1() {
        boolean zH = g1.h(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
        h4.r.c cVarJ1 = J1(zH);
        if (cVarJ1 == null || (cVarJ1.getNode().getAggregateChildKindSet() & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) == 0) {
            return;
        }
        h4.r.c cVarF1 = F1();
        if (!zH && (cVarF1 = cVarF1.getParent()) == null) {
            return;
        }
        for (h4.r.c cVarJ2 = J1(zH); cVarJ2 != null && (cVarJ2.getAggregateChildKindSet() & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0; cVarJ2 = cVarJ2.getChild()) {
            if ((cVarJ2.getKindSet() & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
                ?? B = cVarJ2;
                ?? cVar = 0;
                while (B != 0) {
                    if (B instanceof g2) {
                        ((g2) B).D0();
                    } else if ((B.getKindSet() & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 && (B instanceof m)) {
                        h4.r.c child = ((m) B).f81888b;
                        int i14 = 0;
                        B = B;
                        cVar = cVar;
                        while (child != null) {
                            if ((child.getKindSet() & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0) {
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
            if (cVarJ2 == cVarF1) {
                return;
            }
        }
    }

    @Override // h5.l0
    public final f5.c0 Y0() {
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01c0 A[PHI: r3
      0x01c0: PHI (r3v14 ??) = (r3v2 ??), (r3v2 ??), (r3v16 ??) binds: [B:57:0x0188, B:59:0x018c, B:73:0x01ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v7, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r4v21 */
    public final void Y1(h4.r.c cVar, f fVar, long j8, v vVar, int i14, boolean z14, float f14, boolean z15) {
        ?? B;
        if (cVar == null) {
            P1(fVar, j8, vVar, i14, z14);
            return;
        }
        if (!fVar.e(cVar)) {
            Y1(f1.a(cVar, fVar.a()), fVar, j8, vVar, i14, z14, f14, z15);
            return;
        }
        int i15 = i14;
        b5.m0.f15849b.getClass();
        if (i15 == b5.m0.f15852e || i15 == b5.m0.f15853f) {
            ?? cVar2 = 0;
            ?? r14 = cVar;
            while (r14 != 0) {
                if (r14 instanceof u1) {
                    long jV0 = ((u1) r14).V0();
                    int i16 = (int) (j8 >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i16);
                    e0 e0Var = this.f81711p;
                    g6.o oVar = e0Var.B;
                    c2.a aVar = c2.f81742b;
                    long j14 = Long.MIN_VALUE & jV0;
                    if (fIntBitsToFloat < (-((j14 == 0 || oVar == g6.o.Ltr) ? c2.a.a(c2.f81742b, jV0, 0) : c2.a.a(c2.f81742b, jV0, 2)))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i16) >= n0() + ((j14 == 0 || e0Var.B == g6.o.Ltr) ? c2.a.a(c2.f81742b, jV0, 2) : c2.a.a(c2.f81742b, jV0, 0))) {
                        break;
                    }
                    int i17 = (int) (j8 & 4294967295L);
                    float fIntBitsToFloat2 = Float.intBitsToFloat(i17);
                    c2.a aVar2 = c2.f81742b;
                    if (fIntBitsToFloat2 < (-c2.a.a(aVar2, jV0, 1))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i17) >= c2.a.a(aVar2, jV0, 3) + m0()) {
                        break;
                    }
                    h hVar = new h(cVar, fVar, j8, vVar, i15, z14, f14, z15);
                    p1.l0 l0Var = vVar.f82001b;
                    p1.q0<Object> q0Var = vVar.f82000a;
                    int i18 = vVar.f82002c;
                    int i19 = q0Var.f134668b;
                    if (i18 == i19 - 1) {
                        vVar.b(i18 + 1, i19);
                        vVar.f82002c++;
                        q0Var.g(cVar);
                        l0Var.a(ge1.b.e(z14, true, 0.0f));
                        hVar.invoke();
                        vVar.f82002c = i18;
                        return;
                    }
                    long jA = vVar.a();
                    int i24 = vVar.f82002c;
                    if (!q.c(jA)) {
                        if (q.b(jA) > 0.0f) {
                            int i25 = vVar.f82002c;
                            vVar.b(i25 + 1, q0Var.f134668b);
                            vVar.f82002c++;
                            q0Var.g(cVar);
                            l0Var.a(ge1.b.e(z14, true, 0.0f));
                            hVar.invoke();
                            vVar.f82002c = i25;
                            return;
                        }
                        return;
                    }
                    int i26 = q0Var.f134668b;
                    int i27 = i26 - 1;
                    vVar.f82002c = i27;
                    vVar.b(i26, q0Var.f134668b);
                    vVar.f82002c++;
                    q0Var.g(cVar);
                    l0Var.a(ge1.b.e(z14, true, 0.0f));
                    hVar.invoke();
                    vVar.f82002c = i27;
                    if (q.b(vVar.a()) < 0.0f) {
                        vVar.b(i24 + 1, vVar.f82002c + 1);
                    }
                    vVar.f82002c = i24;
                    return;
                }
                if ((r14.getKindSet() & 16) == 0 || !(r14 instanceof m)) {
                    B = r14;
                    cVar2 = cVar2;
                    B = k.b(cVar2);
                } else {
                    h4.r.c child = ((m) r14).f81888b;
                    int i28 = 0;
                    while (child != null) {
                        if ((child.getKindSet() & 16) != 0) {
                            i28++;
                            if (i28 == 1) {
                                B = r14;
                                cVar2 = cVar2;
                                cVar2 = cVar2;
                                B = child;
                            } else {
                                if (cVar2 == 0) {
                                    cVar2 = new q3.c(new h4.r.c[16], 0);
                                }
                                if (B != 0) {
                                    cVar2.b(B);
                                    B = 0;
                                }
                                cVar2.b(child);
                            }
                        } else {
                            B = r14;
                            cVar2 = cVar2;
                        }
                        child = child.getChild();
                        B = B;
                        cVar2 = cVar2;
                    }
                    if (i28 == 1) {
                        B = r14;
                        cVar2 = cVar2;
                    } else {
                        B = r14;
                        cVar2 = cVar2;
                        B = k.b(cVar2);
                    }
                }
                i15 = i14;
                r14 = B;
                cVar2 = cVar2;
            }
        }
        if (z15) {
            N1(cVar, fVar, j8, vVar, i14, z14, f14);
        } else {
            f2(cVar, fVar, j8, vVar, i14, z14, f14);
        }
    }

    public void Z1(o4.y yVar, r4.c cVar) {
        c1 c1Var = this.f81714t;
        if (c1Var != null) {
            c1Var.s1(yVar, cVar);
        }
    }

    @Override // f5.c0
    public final long a() {
        return this.f69146c;
    }

    public final void a2(long j8, float f14, e23.l<? super o4.t0, Unit> lVar, r4.c cVar) {
        e0 e0Var = this.f81711p;
        if (cVar != null) {
            if (lVar != null) {
                e5.a.a("both ways to create layers shouldn't be used together");
            }
            if (this.L0 != cVar) {
                this.L0 = null;
                k2(null, false);
                this.L0 = cVar;
            }
            if (this.K0 == null) {
                o1 o1VarA = i0.a(e0Var);
                d1 d1Var = this.H0;
                if (d1Var == null) {
                    d1 d1Var2 = new d1(this, new e1(this));
                    this.H0 = d1Var2;
                    d1Var = d1Var2;
                }
                g gVar = this.I0;
                n1 n1VarJ = o1VarA.j(d1Var, gVar, cVar);
                n1VarJ.k(this.f69146c);
                n1VarJ.g(j8);
                this.K0 = n1VarJ;
                e0Var.Z = true;
                gVar.invoke();
            }
        } else {
            if (this.L0 != null) {
                this.L0 = null;
                k2(null, false);
            }
            k2(lVar, false);
        }
        if (!g6.k.c(this.E, j8)) {
            o1 o1VarA2 = i0.a(e0Var);
            h4.n.f81572b.getClass();
            o1VarA2.z(h4.n.f81573c);
            this.E = j8;
            n1 n1Var = this.K0;
            if (n1Var != null) {
                n1Var.g(j8);
            } else {
                c1 c1Var = this.f81715v;
                if (c1Var != null) {
                    c1Var.R1();
                }
            }
            e0Var.a0(this);
            l0.a1(this);
            o1 o1Var = e0Var.f81774n;
            if (o1Var != null) {
                o1Var.F(e0Var);
            }
        }
        this.F = f14;
        if (this == e0Var.P.f81683d) {
            i0.a(e0Var).getRectManager().e(e0Var);
        }
        if (this.f81865k) {
            return;
        }
        N0(Q0());
    }

    @Override // f5.c0
    public final long b0(f5.c0 c0Var, long j8) {
        return X(c0Var, j8);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0082  */
    public final void b2(n4.b bVar, boolean z14, boolean z15) {
        long jFloatToRawIntBits;
        n1 n1Var = this.K0;
        if (n1Var != null) {
            if (this.f81717x) {
                if (z15) {
                    long jE1 = E1();
                    float f14 = bVar.f123537a;
                    float f15 = bVar.f123538b;
                    if (bVar.f123539c >= 0.0f) {
                        long j8 = this.f69146c;
                        if (f14 > ((int) (j8 >> 32)) || bVar.f123540d < 0.0f || f15 > ((int) (j8 & 4294967295L))) {
                            n4.c.f123541b.getClass();
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jE1 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jE1 & 4294967295L));
                            float f16 = (fIntBitsToFloat - (bVar.f123539c - bVar.f123537a)) / 2.0f;
                            if (f16 > 0.0f) {
                                f14 -= f16;
                            } else {
                                float f17 = (-fIntBitsToFloat) / 2.0f;
                                if (f14 < f17) {
                                    f14 = f17;
                                }
                            }
                            float f18 = (fIntBitsToFloat2 - (bVar.f123540d - bVar.f123538b)) / 2.0f;
                            if (f18 > 0.0f) {
                                f15 -= f18;
                            } else {
                                float f19 = (-fIntBitsToFloat2) / 2.0f;
                                if (f15 < f19) {
                                    f15 = f19;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f14)) << 32) | (((long) Float.floatToRawIntBits(f15)) & 4294967295L);
                            n4.c.a aVar = n4.c.f123541b;
                        }
                    } else {
                        n4.c.f123541b.getClass();
                        jFloatToRawIntBits = 0;
                    }
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    long j14 = this.f69146c;
                    float f22 = (int) (j14 >> 32);
                    int i14 = (int) (jE1 >> 32);
                    float f24 = (int) (j14 & 4294967295L);
                    int i15 = (int) (jE1 & 4294967295L);
                    bVar.a(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i14) + f22, Math.max(f22, Float.intBitsToFloat(i14) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i15) + f24, Math.max(f24, Float.intBitsToFloat(i15) + fIntBitsToFloat4)));
                } else if (z14) {
                    long j15 = this.f69146c;
                    bVar.a(0.0f, 0.0f, (int) (j15 >> 32), (int) (j15 & 4294967295L));
                }
                if (bVar.b()) {
                    return;
                }
            }
            n1Var.j(bVar, false);
        }
        long j16 = this.E;
        g6.k.a aVar2 = g6.k.f76003b;
        float f25 = (int) (j16 >> 32);
        bVar.f123537a += f25;
        bVar.f123539c += f25;
        float f26 = (int) (j16 & 4294967295L);
        bVar.f123538b += f26;
        bVar.f123540d += f26;
    }

    @Override // f5.c0
    public final f5.c0 c0() {
        if (!isAttached()) {
            e5.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        T1();
        return this.f81715v;
    }

    public final void c2() {
        if (this.K0 != null) {
            if (this.L0 != null) {
                this.L0 = null;
            }
            k2(null, false);
            this.f81711p.i0(false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8, types: [q3.c] */
    public final void d2(f5.a1 a1Var) {
        c1 c1Var;
        f5.a1 a1Var2 = this.C;
        if (a1Var != a1Var2) {
            this.C = a1Var;
            e0 e0Var = this.f81711p;
            int i14 = 0;
            if (a1Var2 == null || a1Var.getF68911a() != a1Var2.getF68911a() || a1Var.getF68912b() != a1Var2.getF68912b()) {
                int f68897a = a1Var.getF68911a();
                int f68898b = a1Var.getF68912b();
                n1 n1Var = this.K0;
                if (n1Var != null) {
                    g6.m.a aVar = g6.m.f76012b;
                    n1Var.k((((long) f68897a) << 32) | (((long) f68898b) & 4294967295L));
                } else if (e0Var.g() && (c1Var = this.f81715v) != null) {
                    c1Var.R1();
                }
                long j8 = (((long) f68898b) & 4294967295L) | (((long) f68897a) << 32);
                g6.m.a aVar2 = g6.m.f76012b;
                D0(j8);
                if (this.f81718y != null) {
                    l2(false);
                }
                boolean zH = g1.h(4);
                h4.r.c cVarF1 = F1();
                if (zH || (cVarF1 = cVarF1.getParent()) != null) {
                    for (h4.r.c cVarJ1 = J1(zH); cVarJ1 != null && (cVarJ1.getAggregateChildKindSet() & 4) != 0; cVarJ1 = cVarJ1.getChild()) {
                        if ((cVarJ1.getKindSet() & 4) != 0) {
                            ?? B = cVarJ1;
                            ?? cVar = 0;
                            while (B != 0) {
                                if (B instanceof s) {
                                    ((s) B).b1();
                                } else if ((B.getKindSet() & 4) != 0 && (B instanceof m)) {
                                    h4.r.c child = ((m) B).f81888b;
                                    int i15 = 0;
                                    B = B;
                                    cVar = cVar;
                                    while (child != null) {
                                        if ((child.getKindSet() & 4) != 0) {
                                            i15++;
                                            if (i15 == 1) {
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
                                    if (i15 == 1) {
                                    }
                                }
                                B = k.b(cVar);
                            }
                        }
                        if (cVarJ1 == cVarF1) {
                            break;
                        }
                    }
                }
                o1 o1Var = e0Var.f81774n;
                if (o1Var != null) {
                    o1Var.F(e0Var);
                }
                e0Var.a0(this);
            }
            p1.p0<f5.a> p0Var = this.D;
            if ((p0Var == null || p0Var.f134877e == 0) && a1Var.p().isEmpty()) {
                return;
            }
            p1.p0<f5.a> p0Var2 = this.D;
            Map<f5.a, Integer> mapP = a1Var.p();
            if (p0Var2 != null && p0Var2.f134877e == mapP.size()) {
                Object[] objArr = p0Var2.f134874b;
                int[] iArr = p0Var2.f134875c;
                long[] jArr = p0Var2.f134873a;
                int length = jArr.length - 2;
                if (length < 0) {
                    return;
                }
                int i16 = 0;
                loop0: while (true) {
                    long j14 = jArr[i16];
                    if ((((~j14) << 7) & j14 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i17 = 8 - ((~(i16 - length)) >>> 31);
                        for (int i18 = i14; i18 < i17; i18++) {
                            if ((255 & j14) < 128) {
                                int i19 = (i16 << 3) + i18;
                                Object obj = objArr[i19];
                                int i24 = iArr[i19];
                                Integer num = mapP.get((f5.a) obj);
                                if (num == null || num.intValue() != i24) {
                                    break loop0;
                                }
                            }
                            j14 >>= 8;
                        }
                        if (i17 != 8) {
                            return;
                        }
                    }
                    if (i16 == length) {
                        return;
                    }
                    i16++;
                    i14 = 0;
                }
            }
            e0Var.T.f81853p.A.g();
            p1.p0<f5.a> p0VarA = this.D;
            if (p0VarA == null) {
                p0VarA = p1.z0.a();
                this.D = p0VarA;
            }
            p0VarA.c();
            for (Map.Entry<f5.a, Integer> entry : a1Var.p().entrySet()) {
                p0VarA.h(entry.getKey(), entry.getValue().intValue());
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r5v5, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object] */
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
    @Override // f5.c1, f5.w
    /* JADX INFO: renamed from: e */
    public final Object getF81969t() {
        e0 e0Var = this.f81711p;
        if (!e0Var.P.d(64)) {
            return null;
        }
        F1();
        p005kotlin.jvm.internal.r0 r0Var = new p005kotlin.jvm.internal.r0();
        for (h4.r.c parent = e0Var.P.f81684e; parent != null; parent = parent.getParent()) {
            if ((parent.getKindSet() & 64) != 0) {
                ?? cVar = 0;
                ?? B = parent;
                while (B != 0) {
                    if (B instanceof s1) {
                        r0Var.f105810a = ((s1) B).r(e0Var.A, r0Var.f105810a);
                    } else if ((B.getKindSet() & 64) != 0 && (B instanceof m)) {
                        h4.r.c child = ((m) B).f81888b;
                        int i14 = 0;
                        B = B;
                        cVar = cVar;
                        while (child != null) {
                            if ((child.getKindSet() & 64) != 0) {
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
        }
        return r0Var.f105810a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [h4.r$c] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [q3.c] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final boolean e2() {
        h4.r.c cVarJ1 = J1(g1.h(16));
        if (cVarJ1 != null && cVarJ1.getIsAttached()) {
            if (!cVarJ1.getNode().getIsAttached()) {
                e5.a.b("visitLocalDescendants called on an unattached node");
            }
            h4.r.c node = cVarJ1.getNode();
            if ((node.getAggregateChildKindSet() & 16) != 0) {
                while (node != null) {
                    if ((node.getKindSet() & 16) != 0) {
                        ?? B = node;
                        ?? cVar = 0;
                        while (B != 0) {
                            if (B instanceof u1) {
                                if (((u1) B).S1()) {
                                    return true;
                                }
                            } else if ((B.getKindSet() & 16) != 0 && (B instanceof m)) {
                                h4.r.c child = ((m) B).f81888b;
                                int i14 = 0;
                                while (child != null) {
                                    if ((child.getKindSet() & 16) != 0) {
                                        i14++;
                                        if (i14 == 1) {
                                            B = B;
                                            cVar = cVar;
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
                                    } else {
                                        B = B;
                                        cVar = cVar;
                                    }
                                    child = child.getChild();
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
                    node = node.getChild();
                }
            }
        }
        return false;
    }

    @Override // f5.c0
    public final long f(long j8) {
        if (!isAttached()) {
            e5.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return i0.a(this.f81711p).f(B(j8));
    }

    @Override // h5.l0
    public final void f1() {
        r4.c cVar = this.L0;
        long j8 = this.E;
        if (cVar != null) {
            z0(j8, this.F, cVar);
        } else {
            u0(this.F, j8, this.f81718y);
        }
    }

    public final void f2(h4.r.c cVar, f fVar, long j8, v vVar, int i14, boolean z14, float f14) {
        int i15;
        if (cVar == null) {
            P1(fVar, j8, vVar, i14, z14);
            return;
        }
        if (!fVar.e(cVar)) {
            f2(f1.a(cVar, fVar.a()), fVar, j8, vVar, i14, z14, f14);
            return;
        }
        if (!fVar.b(cVar)) {
            Y1(f1.a(cVar, fVar.a()), fVar, j8, vVar, i14, z14, f14, false);
            return;
        }
        i iVar = new i(cVar, fVar, j8, vVar, i14, z14, f14);
        p1.l0 l0Var = vVar.f82001b;
        p1.q0<Object> q0Var = vVar.f82000a;
        int i16 = vVar.f82002c;
        int i17 = q0Var.f134668b;
        if (i16 != i17 - 1) {
            long jA = vVar.a();
            int i18 = vVar.f82002c;
            int i19 = q0Var.f134668b;
            int i24 = i19 - 1;
            vVar.f82002c = i24;
            vVar.b(i19, q0Var.f134668b);
            vVar.f82002c++;
            q0Var.g(cVar);
            l0Var.a(ge1.b.e(z14, false, f14));
            iVar.invoke();
            vVar.f82002c = i24;
            long jA2 = vVar.a();
            if (vVar.f82002c + 1 >= q0Var.f134668b - 1 || q.a(jA, jA2) <= 0) {
                vVar.b(vVar.f82002c + 1, q0Var.f134668b);
            } else {
                int i25 = i18 + 1;
                boolean zC = q.c(jA2);
                int i26 = vVar.f82002c;
                vVar.b(i25, zC ? i26 + 2 : i26 + 1);
            }
            vVar.f82002c = i18;
            return;
        }
        int i27 = i16 + 1;
        vVar.b(i27, i17);
        vVar.f82002c++;
        q0Var.g(cVar);
        l0Var.a(ge1.b.e(z14, false, f14));
        iVar.invoke();
        vVar.f82002c = i16;
        if (i27 == q0Var.f134668b - 1 || q.c(vVar.a())) {
            int i28 = vVar.f82002c;
            int i29 = i28 + 1;
            q0Var.l(i29);
            if (i29 < 0 || i29 >= (i15 = l0Var.f134838b)) {
                org.apache.commons.lang3.e.v("Index must be between 0 and size");
                return;
            }
            long[] jArr = l0Var.f134837a;
            long j14 = jArr[i29];
            if (i29 != i15 - 1) {
                p13.s.g(jArr, jArr, i29, i28 + 2, i15);
            }
            l0Var.f134838b--;
        }
    }

    public final void g1(c1 c1Var, n4.b bVar, boolean z14) {
        if (c1Var == this) {
            return;
        }
        c1 c1Var2 = this.f81715v;
        if (c1Var2 != null) {
            c1Var2.g1(c1Var, bVar, z14);
        }
        long j8 = this.E;
        g6.k.a aVar = g6.k.f76003b;
        float f14 = (int) (j8 >> 32);
        bVar.f123537a -= f14;
        bVar.f123539c -= f14;
        float f15 = (int) (j8 & 4294967295L);
        bVar.f123538b -= f15;
        bVar.f123540d -= f15;
        n1 n1Var = this.K0;
        if (n1Var != null) {
            n1Var.j(bVar, true);
            if (this.f81717x && z14) {
                long j14 = this.f69146c;
                bVar.a(0.0f, 0.0f, (int) (j14 >> 32), (int) (j14 & 4294967295L));
            }
        }
    }

    @Override // g6.c
    /* JADX INFO: renamed from: getDensity */
    public final float getF75991a() {
        return this.f81711p.A.getF75991a();
    }

    @Override // f5.x
    /* JADX INFO: renamed from: getLayoutDirection */
    public final g6.o getF68910b() {
        return this.f81711p.B;
    }

    public final n4.d h2() {
        if (!isAttached()) {
            n4.d.f123545e.getClass();
            return n4.d.f123546f;
        }
        f5.c0 c0VarC = f5.d0.c(this);
        n4.b bVar = this.I;
        if (bVar == null) {
            bVar = new n4.b(0.0f, 0.0f, 0.0f, 0.0f);
            this.I = bVar;
        }
        long jN1 = n1(E1());
        int i14 = (int) (jN1 >> 32);
        bVar.f123537a = -Float.intBitsToFloat(i14);
        int i15 = (int) (jN1 & 4294967295L);
        bVar.f123538b = -Float.intBitsToFloat(i15);
        bVar.f123539c = Float.intBitsToFloat(i14) + n0();
        bVar.f123540d = Float.intBitsToFloat(i15) + m0();
        c1 c1Var = this;
        while (c1Var != c0VarC) {
            c1Var.b2(bVar, false, true);
            if (bVar.b()) {
                n4.d.f123545e.getClass();
                return n4.d.f123546f;
            }
            c1Var = c1Var.f81715v;
            c1Var.getClass();
        }
        return new n4.d(bVar.f123537a, bVar.f123538b, bVar.f123539c, bVar.f123540d);
    }

    @Override // f5.c0
    public final void i0(float[] fArr) {
        o1 o1VarA = i0.a(this.f81711p);
        c1 c1VarG2 = g2(f5.d0.c(this));
        j2(c1VarG2, fArr);
        if (o1VarA instanceof b5.l) {
            ((b5.l) o1VarA).i(fArr);
            return;
        }
        long jF = f5.d0.f(c1VarG2);
        if ((9223372034707292159L & jF) != 9205357640488583168L) {
            o4.a1.i(fArr, Float.intBitsToFloat((int) (jF >> 32)), Float.intBitsToFloat((int) (jF & 4294967295L)));
        }
    }

    public final void i2(c1 c1Var, float[] fArr) {
        if (p005kotlin.jvm.internal.s.g(c1Var, this)) {
            return;
        }
        c1 c1Var2 = this.f81715v;
        c1Var2.getClass();
        c1Var2.i2(c1Var, fArr);
        long j8 = this.E;
        g6.k.f76003b.getClass();
        if (!g6.k.c(j8, 0L)) {
            float[] fArr2 = R0;
            o4.a1.e(fArr2);
            long j14 = this.E;
            o4.a1.i(fArr2, -((int) (j14 >> 32)), -((int) (j14 & 4294967295L)));
            o4.a1.h(fArr, fArr2);
        }
        n1 n1Var = this.K0;
        if (n1Var != null) {
            n1Var.f(fArr);
        }
    }

    @Override // f5.c0
    public final boolean isAttached() {
        return F1().getIsAttached();
    }

    @Override // f5.c0
    public final n4.d j0(f5.c0 c0Var, boolean z14) {
        if (!isAttached()) {
            e5.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!c0Var.isAttached()) {
            e5.a.b("LayoutCoordinates " + c0Var + " is not attached!");
        }
        c1 c1VarG2 = g2(c0Var);
        c1VarG2.T1();
        c1 c1VarX1 = x1(c1VarG2);
        n4.b bVar = this.I;
        if (bVar == null) {
            bVar = new n4.b(0.0f, 0.0f, 0.0f, 0.0f);
            this.I = bVar;
        }
        bVar.f123537a = 0.0f;
        bVar.f123538b = 0.0f;
        bVar.f123539c = (int) (c0Var.a() >> 32);
        bVar.f123540d = (int) (c0Var.a() & 4294967295L);
        while (c1VarG2 != c1VarX1) {
            c1VarG2.b2(bVar, z14, false);
            if (bVar.b()) {
                n4.d.f123545e.getClass();
                return n4.d.f123546f;
            }
            c1VarG2 = c1VarG2.f81715v;
            c1VarG2.getClass();
        }
        g1(c1VarX1, bVar, z14);
        return new n4.d(bVar.f123537a, bVar.f123538b, bVar.f123539c, bVar.f123540d);
    }

    @Override // h5.l0, h5.u0
    /* JADX INFO: renamed from: j1, reason: from getter */
    public final e0 getF81711p() {
        return this.f81711p;
    }

    public final void j2(c1 c1Var, float[] fArr) {
        c1 c1Var2 = this;
        while (!c1Var2.equals(c1Var)) {
            n1 n1Var = c1Var2.K0;
            if (n1Var != null) {
                n1Var.b(fArr);
            }
            long j8 = c1Var2.E;
            g6.k.f76003b.getClass();
            if (!g6.k.c(j8, 0L)) {
                float[] fArr2 = R0;
                o4.a1.e(fArr2);
                o4.a1.i(fArr2, (int) (j8 >> 32), (int) (j8 & 4294967295L));
                o4.a1.h(fArr, fArr2);
            }
            c1Var2 = c1Var2.f81715v;
            c1Var2.getClass();
        }
    }

    public final void k2(e23.l<? super o4.t0, Unit> lVar, boolean z14) {
        o1 o1Var;
        if (lVar != null && this.L0 != null) {
            e5.a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        e0 e0Var = this.f81711p;
        boolean z15 = (!z14 && this.f81718y == lVar && p005kotlin.jvm.internal.s.g(this.f81719z, e0Var.A) && this.A == e0Var.B) ? false : true;
        this.f81719z = e0Var.A;
        this.A = e0Var.B;
        boolean zIsAttached = e0Var.isAttached();
        g gVar = this.I0;
        if (!zIsAttached || lVar == null) {
            this.f81718y = null;
            n1 n1Var = this.K0;
            if (n1Var != null) {
                if (!o4.l1.c(n1Var.mo322getUnderlyingMatrixsQKQjiQ())) {
                    e0Var.a0(this);
                }
                n1Var.destroy();
                this.K0 = null;
                e0Var.Z = true;
                gVar.invoke();
                if (isAttached() && e0Var.g() && (o1Var = e0Var.f81774n) != null) {
                    o1Var.F(e0Var);
                }
            }
            this.J0 = false;
            return;
        }
        this.f81718y = lVar;
        if (this.K0 != null) {
            if (z15) {
                l2(true);
                return;
            }
            return;
        }
        o1 o1VarA = i0.a(e0Var);
        d1 d1Var = this.H0;
        if (d1Var == null) {
            d1 d1Var2 = new d1(this, new e1(this));
            this.H0 = d1Var2;
            d1Var = d1Var2;
        }
        o1.a aVar = o1.W;
        n1 n1VarJ = o1VarA.j(d1Var, gVar, null);
        n1VarJ.k(this.f69146c);
        n1VarJ.g(this.E);
        this.K0 = n1VarJ;
        l2(true);
        e0Var.Z = true;
        gVar.invoke();
    }

    public final long l1(c1 c1Var, long j8) {
        if (c1Var == this) {
            return j8;
        }
        c1 c1Var2 = this.f81715v;
        return (c1Var2 == null || p005kotlin.jvm.internal.s.g(c1Var, c1Var2)) ? B1(j8) : B1(c1Var2.l1(c1Var, j8));
    }

    public final void l2(boolean z14) {
        o1 o1Var;
        if (this.L0 != null) {
            return;
        }
        n1 n1Var = this.K0;
        e23.l<? super o4.t0, Unit> lVar = this.f81718y;
        if (n1Var == null) {
            if (lVar == null) {
                return;
            }
            e5.a.b("null layer with a non-null layerBlock");
            return;
        }
        if (lVar == null) {
            throw e5.m("updateLayerParameters requires a non-null layerBlock");
        }
        o4.o1 o1Var2 = P0;
        o1Var2.e();
        e0 e0Var = this.f81711p;
        o1Var2.f128920t = e0Var.A;
        o1Var2.f128921v = e0Var.B;
        o1Var2.f128919r = g6.n.c(this.f69146c);
        i0.a(e0Var).getSnapshotObserver().f81981a.d(this, N0, new j(lVar, this));
        a0 a0Var = this.P;
        if (a0Var == null) {
            a0Var = new a0();
            this.P = a0Var;
        }
        a0 a0Var2 = Q0;
        a0Var2.getClass();
        a0Var2.f81671a = a0Var.f81671a;
        a0Var2.f81672b = a0Var.f81672b;
        a0Var2.f81673c = a0Var.f81673c;
        a0Var2.f81674d = a0Var.f81674d;
        a0Var2.f81675e = a0Var.f81675e;
        a0Var2.f81676f = a0Var.f81676f;
        a0Var2.f81677g = a0Var.f81677g;
        a0Var2.f81678h = a0Var.f81678h;
        a0Var2.f81679i = a0Var.f81679i;
        a0Var.f81671a = o1Var2.f128903b;
        a0Var.f81672b = o1Var2.f128904c;
        a0Var.f81673c = o1Var2.f128906e;
        a0Var.f81674d = o1Var2.f128907f;
        a0Var.f81675e = o1Var2.f128911j;
        a0Var.f81676f = o1Var2.f128912k;
        a0Var.f81677g = o1Var2.f128913l;
        a0Var.f81678h = o1Var2.f128914m;
        a0Var.f81679i = o1Var2.f128915n;
        n1Var.i(o1Var2);
        boolean z15 = this.f81717x;
        this.f81717x = o1Var2.f128917p;
        this.B = o1Var2.f128905d;
        boolean z16 = a0Var2.f81671a == a0Var.f81671a && a0Var2.f81672b == a0Var.f81672b && a0Var2.f81673c == a0Var.f81673c && a0Var2.f81674d == a0Var.f81674d && a0Var2.f81675e == a0Var.f81675e && a0Var2.f81676f == a0Var.f81676f && a0Var2.f81677g == a0Var.f81677g && a0Var2.f81678h == a0Var.f81678h && o4.z1.b(a0Var2.f81679i, a0Var.f81679i);
        if (z14 && ((!z16 || z15 != this.f81717x) && (o1Var = e0Var.f81774n) != null)) {
            o1Var.F(e0Var);
        }
        if (z16) {
            return;
        }
        e0Var.a0(this);
        if (e0Var.L0 > 0) {
            i0.a(e0Var).J(e0Var);
        }
    }

    public final boolean m2(long j8) {
        if ((((9187343241974906880L ^ (j8 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        n1 n1Var = this.K0;
        return n1Var == null || !this.f81717x || n1Var.e(j8);
    }

    public final long n1(long j8) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j8 >> 32)) - n0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j8 & 4294967295L)) - m0();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
        n4.g.a aVar = n4.g.f123559b;
        return jFloatToRawIntBits;
    }

    @Override // f5.c0
    public final long o(long j8) {
        if (!isAttached()) {
            e5.a.b("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return X(f5.d0.c(this), i0.a(this.f81711p).o(j8));
    }

    public final float o1(long j8, long j14) {
        if (n0() >= Float.intBitsToFloat((int) (j14 >> 32)) && m0() >= Float.intBitsToFloat((int) (j14 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jN1 = n1(j14);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jN1 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jN1 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j8 >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - n0());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j8 & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - m0()))) & 4294967295L) | (((long) Float.floatToRawIntBits(fMax)) << 32);
        n4.c.a aVar = n4.c.f123541b;
        if ((fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) <= fIntBitsToFloat2) {
            return n4.c.f(jFloatToRawIntBits);
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // g6.i
    /* JADX INFO: renamed from: r0 */
    public final float getF75992b() {
        return this.f81711p.A.getF75992b();
    }

    public final void s1(o4.y yVar, r4.c cVar) {
        n1 n1Var = this.K0;
        if (n1Var != null) {
            n1Var.a(yVar, cVar);
            return;
        }
        long j8 = this.E;
        g6.k.a aVar = g6.k.f76003b;
        float f14 = (int) (j8 >> 32);
        float f15 = (int) (j8 & 4294967295L);
        yVar.q(f14, f15);
        u1(yVar, cVar);
        yVar.q(-f14, -f15);
    }

    @Override // f5.v1
    public void u0(float f14, long j8, e23.l lVar) {
        if (!this.f81712q) {
            a2(j8, f14, lVar, null);
            return;
        }
        m0 m0VarD1 = D1();
        m0VarD1.getClass();
        a2(m0VarD1.f81890q, f14, lVar, null);
    }

    public final void u1(o4.y yVar, r4.c cVar) {
        o4.y yVar2;
        r4.c cVar2;
        h4.r.c cVarI1 = I1(4);
        if (cVarI1 == null) {
            Z1(yVar, cVar);
            return;
        }
        e0 e0Var = this.f81711p;
        e0Var.getClass();
        h0 sharedDrawScope = i0.a(e0Var).getSharedDrawScope();
        long jC = g6.n.c(this.f69146c);
        sharedDrawScope.getClass();
        q3.c cVar3 = null;
        while (cVarI1 != null) {
            if (cVarI1 instanceof s) {
                yVar2 = yVar;
                cVar2 = cVar;
                sharedDrawScope.e(yVar2, jC, this, (s) cVarI1, cVar2);
            } else {
                yVar2 = yVar;
                cVar2 = cVar;
                if ((cVarI1.getKindSet() & 4) != 0 && (cVarI1 instanceof m)) {
                    int i14 = 0;
                    for (h4.r.c child = ((m) cVarI1).f81888b; child != null; child = child.getChild()) {
                        if ((child.getKindSet() & 4) != 0) {
                            i14++;
                            if (i14 == 1) {
                                cVarI1 = child;
                            } else {
                                if (cVar3 == null) {
                                    cVar3 = new q3.c(new h4.r.c[16], 0);
                                }
                                if (cVarI1 != null) {
                                    cVar3.b(cVarI1);
                                    cVarI1 = null;
                                }
                                cVar3.b(child);
                            }
                        }
                    }
                    if (i14 == 1) {
                    }
                }
                yVar = yVar2;
                cVar = cVar2;
            }
            cVarI1 = k.b(cVar3);
            yVar = yVar2;
            cVar = cVar2;
        }
    }

    public abstract void v1();

    public final c1 x1(c1 c1Var) {
        e0 e0VarK = c1Var.f81711p;
        e0 e0Var = this.f81711p;
        if (e0VarK == e0Var) {
            h4.r.c cVarF1 = c1Var.F1();
            h4.r.c cVarF2 = F1();
            if (!cVarF2.getNode().getIsAttached()) {
                e5.a.b("visitLocalAncestors called on an unattached node");
            }
            for (h4.r.c parent = cVarF2.getNode().getParent(); parent != null; parent = parent.getParent()) {
                if ((parent.getKindSet() & 2) != 0 && parent == cVarF1) {
                    return c1Var;
                }
            }
            return this;
        }
        while (e0VarK.f81776p > e0Var.f81776p) {
            e0VarK = e0VarK.K();
            e0VarK.getClass();
        }
        e0 e0VarK2 = e0Var;
        while (e0VarK2.f81776p > e0VarK.f81776p) {
            e0VarK2 = e0VarK2.K();
            e0VarK2.getClass();
        }
        while (e0VarK != e0VarK2) {
            e0VarK = e0VarK.K();
            e0VarK2 = e0VarK2.K();
            if (e0VarK == null || e0VarK2 == null) {
                vb.h.s("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (e0VarK2 != e0Var) {
            if (e0VarK != c1Var.f81711p) {
                return e0VarK.P.f81682c;
            }
            return c1Var;
        }
        return this;
    }

    @Override // f5.c0
    public final f5.c0 y() {
        boolean zIsAttached = isAttached();
        e0 e0Var = this.f81711p;
        if (!zIsAttached) {
            StringBuilder sb3 = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (e0 e0VarK = e0Var; e0VarK != null; e0VarK = e0VarK.K()) {
                sb3.append("\n|");
                sb3.append(e0VarK);
                sb3.append(" isAttached=");
                sb3.append(e0VarK.isAttached());
                sb3.append(" modifier=");
                sb3.append(e0VarK.f81771k0);
                sb3.append(" tail=");
                sb3.append(F1());
            }
            e5.a.b(sb3.toString());
        }
        T1();
        return e0Var.P.f81683d.f81715v;
    }

    @Override // f5.v1
    public void z0(long j8, float f14, r4.c cVar) {
        if (!this.f81712q) {
            a2(j8, f14, null, cVar);
            return;
        }
        m0 m0VarD1 = D1();
        m0VarD1.getClass();
        a2(m0VarD1.f81890q, f14, null, cVar);
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR \u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lh5/c1$e;", "", "<init>", "()V", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Lkotlin/Function1;", "Lh5/c1;", "", "onCommitAffectingLayerParams", "Le23/l;", "onCommitAffectingLayer", "Lo4/o1;", "graphicsLayerScope", "Lo4/o1;", "Lh5/a0;", "tmpLayerPositionalProperties", "Lh5/a0;", "Lo4/a1;", "tmpMatrix", "[F", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e {
        public /* synthetic */ e(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private e() {
        }
    }
}
