package h5;

import i3.e5;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\u0011\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lh5/h0;", "Lq4/f;", "Lq4/c;", "Lq4/a;", "canvasDrawScope", "<init>", "(Lq4/a;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h0 implements q4.f, q4.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q4.a f81825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public s f81826b;

    public /* synthetic */ h0(q4.a aVar, int i14, p005kotlin.jvm.internal.j jVar) {
        this((i14 & 1) != 0 ? new q4.a() : aVar);
    }

    @Override // g6.c
    public final long A(long j8) {
        return this.f81825a.A(j8);
    }

    @Override // g6.c
    public final long D(float f14) {
        return this.f81825a.D(f14);
    }

    @Override // q4.f
    public final void H(long j8, float f14, long j14, q4.g gVar, int i14) {
        this.f81825a.H(j8, f14, j14, gVar, i14);
    }

    @Override // g6.i
    public final float H0(long j8) {
        return this.f81825a.H0(j8);
    }

    @Override // q4.f
    public final void I(o4.f1 f1Var, long j8, float f14, q4.g gVar, int i14) {
        this.f81825a.I(f1Var, j8, f14, gVar, i14);
    }

    @Override // q4.f
    public final void K1(o4.v0 v0Var, long j8, q4.g gVar, o4.e0 e0Var, int i14) {
        this.f81825a.K1(v0Var, j8, gVar, e0Var, i14);
    }

    @Override // q4.f
    public final void L0(o4.v0 v0Var, long j8, long j14, long j15, long j16, float f14, q4.g gVar, o4.e0 e0Var, int i14, int i15) {
        this.f81825a.L0(v0Var, j8, j14, j15, j16, f14, gVar, e0Var, i14, i15);
    }

    @Override // q4.f
    public final void L1(o4.f1 f1Var, o4.w wVar, float f14, q4.g gVar, int i14) {
        this.f81825a.L1(f1Var, wVar, f14, gVar, i14);
    }

    @Override // q4.f
    public final void M(long j8, long j14, long j15, float f14, int i14, o4.g1 g1Var, int i15) {
        this.f81825a.M(j8, j14, j15, f14, i14, g1Var, i15);
    }

    @Override // q4.f
    public final void N(long j8, float f14, float f15, long j14, long j15, float f16, q4.k kVar, int i14) {
        this.f81825a.N(j8, f14, f15, j14, j15, f16, kVar, i14);
    }

    @Override // q4.f
    public final void R0(o4.w1 w1Var, float f14, long j8, long j14, q4.g gVar, int i14) {
        this.f81825a.R0(w1Var, f14, j8, j14, gVar, i14);
    }

    @Override // q4.f
    /* JADX INFO: renamed from: S */
    public final q4.a.b getF142543b() {
        return this.f81825a.f142543b;
    }

    @Override // q4.f
    public final void U(long j8, long j14, long j15, long j16, q4.g gVar, int i14) {
        this.f81825a.U(j8, j14, j15, j16, gVar, i14);
    }

    @Override // g6.i
    public final long Y(float f14) {
        return this.f81825a.Y(f14);
    }

    @Override // q4.f
    public final long b() {
        return this.f81825a.b();
    }

    @Override // g6.c
    public final float c1(int i14) {
        return this.f81825a.c1(i14);
    }

    @Override // g6.c
    public final float d1(float f14) {
        return this.f81825a.d1(f14);
    }

    public final void e(o4.y yVar, long j8, c1 c1Var, s sVar, r4.c cVar) {
        s sVar2 = this.f81826b;
        this.f81826b = sVar;
        g6.o oVar = c1Var.f81711p.B;
        q4.a aVar = this.f81825a;
        g6.c cVarD = aVar.f142543b.d();
        q4.a.b bVar = aVar.f142543b;
        g6.o oVarE = bVar.e();
        o4.y yVarA = bVar.a();
        long jB = bVar.b();
        r4.c cVar2 = bVar.f142551b;
        bVar.g(c1Var);
        bVar.h(oVar);
        bVar.f(yVar);
        bVar.c(j8);
        bVar.f142551b = cVar;
        yVar.l();
        try {
            sVar.p(this);
            yVar.i();
            bVar.g(cVarD);
            bVar.h(oVarE);
            bVar.f(yVarA);
            bVar.c(jB);
            bVar.f142551b = cVar2;
            this.f81826b = sVar2;
        } catch (Throwable th3) {
            yVar.i();
            bVar.g(cVarD);
            bVar.h(oVarE);
            bVar.f(yVarA);
            bVar.c(jB);
            bVar.f142551b = cVar2;
            throw th3;
        }
    }

    @Override // g6.c
    public final int f0(float f14) {
        return this.f81825a.f0(f14);
    }

    @Override // g6.c
    public final float g0(long j8) {
        return this.f81825a.g0(j8);
    }

    @Override // g6.c
    /* JADX INFO: renamed from: getDensity */
    public final float getF75991a() {
        return this.f81825a.getF75991a();
    }

    @Override // q4.f
    public final g6.o getLayoutDirection() {
        return this.f81825a.f142542a.f142547b;
    }

    @Override // q4.f
    public final long i1() {
        return this.f81825a.i1();
    }

    @Override // g6.c
    public final long k1(long j8) {
        return this.f81825a.k1(j8);
    }

    @Override // q4.c
    public final void m1() {
        q4.a aVar = this.f81825a;
        o4.y yVarA = aVar.f142543b.a();
        s sVar = this.f81826b;
        if (sVar == null) {
            throw e5.m("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        h4.r.c child = sVar.getNode().getChild();
        if (child == null || (child.getAggregateChildKindSet() & 4) == 0) {
            child = null;
            break;
        }
        while (true) {
            if (child == null || (child.getKindSet() & 2) != 0) {
                child = null;
                break;
            } else if ((child.getKindSet() & 4) != 0) {
                break;
            } else {
                child = child.getChild();
            }
        }
        if (child == null) {
            c1 c1VarE = k.e(sVar, 4);
            if (c1VarE.F1() == sVar.getNode()) {
                c1VarE = c1VarE.f81714t;
                c1VarE.getClass();
            }
            c1VarE.Z1(yVarA, aVar.f142543b.f142551b);
            return;
        }
        q3.c cVar = null;
        while (child != null) {
            if (child instanceof s) {
                s sVar2 = (s) child;
                r4.c cVar2 = aVar.f142543b.f142551b;
                c1 c1VarE2 = k.e(sVar2, 4);
                long jC = g6.n.c(c1VarE2.f69146c);
                e0 e0Var = c1VarE2.f81711p;
                e0Var.getClass();
                i0.a(e0Var).getSharedDrawScope().e(yVarA, jC, c1VarE2, sVar2, cVar2);
            } else if ((child.getKindSet() & 4) != 0 && (child instanceof m)) {
                int i14 = 0;
                for (h4.r.c child2 = ((m) child).f81888b; child2 != null; child2 = child2.getChild()) {
                    if ((child2.getKindSet() & 4) != 0) {
                        i14++;
                        if (i14 == 1) {
                            child = child2;
                        } else {
                            if (cVar == null) {
                                cVar = new q3.c(new h4.r.c[16], 0);
                            }
                            if (child != null) {
                                cVar.b(child);
                                child = null;
                            }
                            cVar.b(child2);
                        }
                    }
                }
                if (i14 == 1) {
                }
            }
            child = k.b(cVar);
        }
    }

    @Override // q4.f
    public final void q1(o4.w wVar, long j8, long j14, long j15, float f14, q4.g gVar, int i14) {
        this.f81825a.q1(wVar, j8, j14, j15, f14, gVar, i14);
    }

    @Override // g6.i
    /* JADX INFO: renamed from: r0 */
    public final float getF75992b() {
        return this.f81825a.getF75992b();
    }

    @Override // q4.f
    public final void r1(long j8, long j14, long j15, float f14, q4.g gVar, o4.e0 e0Var, int i14) {
        this.f81825a.r1(j8, j14, j15, f14, gVar, e0Var, i14);
    }

    @Override // g6.c
    public final float s0(float f14) {
        return this.f81825a.getF75991a() * f14;
    }

    @Override // g6.c
    public final int v0(long j8) {
        return this.f81825a.v0(j8);
    }

    @Override // q4.f
    public final void y0(o4.w wVar, long j8, long j14, float f14, float f15, int i14) {
        this.f81825a.y0(wVar, j8, j14, f14, f15, i14);
    }

    @Override // q4.f
    public final void y1(o4.z0 z0Var, float f14, long j8, q4.g gVar, int i14) {
        this.f81825a.y1(z0Var, f14, j8, gVar, i14);
    }

    @Override // q4.f
    public final void z(o4.w wVar, long j8, long j14, float f14, q4.g gVar, int i14) {
        this.f81825a.z(wVar, j8, j14, f14, gVar, i14);
    }

    public h0(q4.a aVar) {
        this.f81825a = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public h0() {
        this(null, 1, 0 == true ? 1 : 0);
    }
}
