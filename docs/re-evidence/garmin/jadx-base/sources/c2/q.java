package c2;

import java.util.List;
import p005kotlin.Metadata;
import p3.b4;

/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p1.t0<h4.d, f5.z0> f22829a = c(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p1.t0<h4.d, f5.z0> f22830b = c(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s f22831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f22832d;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements f5.z0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22833a = new a();

        @Override // f5.z0
        public final f5.a1 f(f5.b1 b1Var, List<? extends f5.y0> list, long j8) {
            return f5.b1.h0(b1Var, g6.a.l(j8), g6.a.k(j8), new bt1.s(23));
        }
    }

    static {
        h4.d.f81522a.getClass();
        f22831c = new s(h4.d.a.f81524b, false);
        f22832d = a.f22833a;
    }

    public static final void a(h4.r rVar, p3.m mVar, int i14) {
        int i15;
        p3.o0 o0VarE = mVar.E(-211209833);
        if ((i14 & 6) == 0) {
            i15 = (o0VarE.B(rVar) ? 4 : 2) | i14;
        } else {
            i15 = i14;
        }
        byte b14 = 0;
        if (o0VarE.n(i15 & 1, (i15 & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            int iHashCode = Long.hashCode(o0VarE.U);
            h4.r rVarC = h4.k.c(rVar, o0VarE);
            p3.i2 i2VarA0 = o0VarE.a0();
            h5.g.V.getClass();
            h5.e0.a aVar = h5.g.a.f81805b;
            if (o0VarE.f135177b == null) {
                p3.p0.l();
                throw null;
            }
            o0VarE.z();
            if (o0VarE.T) {
                o0VarE.M(aVar);
            } else {
                o0VarE.c();
            }
            b4.c(h5.g.a.f81810g, f22832d, o0VarE);
            b4.c(h5.g.a.f81809f, i2VarA0, o0VarE);
            b4.b(h5.g.a.f81814k, o0VarE);
            b4.c(h5.g.a.f81807d, rVarC, o0VarE);
            b4.a(o0VarE, Integer.valueOf(iHashCode), h5.g.a.f81813j);
            o0VarE.g0(true);
        } else {
            o0VarE.e();
        }
        p3.p2 p2VarI0 = o0VarE.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new p(rVar, i14, b14, b14);
        }
    }

    public static final void b(f5.v1.a aVar, f5.v1 v1Var, f5.y0 y0Var, g6.o oVar, int i14, int i15, h4.d dVar) {
        h4.d dVar2;
        Object f81969t = y0Var.getF81969t();
        o oVar2 = f81969t instanceof o ? (o) f81969t : null;
        h4.d dVar3 = (oVar2 == null || (dVar2 = oVar2.f22789a) == null) ? dVar : dVar2;
        long j8 = (((long) v1Var.f69144a) << 32) | (((long) v1Var.f69145b) & 4294967295L);
        g6.m.a aVar2 = g6.m.f76012b;
        f5.v1.a.y(aVar, v1Var, dVar3.a(j8, (((long) i14) << 32) | (((long) i15) & 4294967295L), oVar));
    }

    public static final p1.t0<h4.d, f5.z0> c(boolean z14) {
        p1.t0<h4.d, f5.z0> t0Var = new p1.t0<>(9);
        h4.d.f81522a.getClass();
        h4.g gVar = h4.d.a.f81524b;
        t0Var.m(gVar, new s(gVar, z14));
        h4.g gVar2 = h4.d.a.f81525c;
        t0Var.m(gVar2, new s(gVar2, z14));
        h4.g gVar3 = h4.d.a.f81526d;
        t0Var.m(gVar3, new s(gVar3, z14));
        h4.g gVar4 = h4.d.a.f81527e;
        t0Var.m(gVar4, new s(gVar4, z14));
        h4.g gVar5 = h4.d.a.f81528f;
        t0Var.m(gVar5, new s(gVar5, z14));
        h4.g gVar6 = h4.d.a.f81529g;
        t0Var.m(gVar6, new s(gVar6, z14));
        h4.g gVar7 = h4.d.a.f81530h;
        t0Var.m(gVar7, new s(gVar7, z14));
        h4.g gVar8 = h4.d.a.f81531i;
        t0Var.m(gVar8, new s(gVar8, z14));
        h4.g gVar9 = h4.d.a.f81532j;
        t0Var.m(gVar9, new s(gVar9, z14));
        return t0Var;
    }

    public static final f5.z0 d(h4.d dVar, boolean z14) {
        f5.z0 z0VarD = (z14 ? f22829a : f22830b).d(dVar);
        return z0VarD == null ? new s(dVar, z14) : z0VarD;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    public static final s e(h4.d dVar, p3.m mVar, int i14) {
        p3.x1 x1Var = p3.n.f135158a;
        h4.d.f81522a.getClass();
        if (p005kotlin.jvm.internal.s.g(dVar, h4.d.a.f81524b)) {
            mVar.C(244332343);
            mVar.f();
            return f22831c;
        }
        mVar.C(244380021);
        boolean zH = ((((i14 & 14) ^ 6) > 4 && mVar.B(dVar)) || (i14 & 6) == 4) | mVar.h(false);
        Object objQ = mVar.q();
        if (zH) {
            objQ = new s(dVar, false);
            mVar.K(objQ);
        } else {
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = new s(dVar, false);
                mVar.K(objQ);
            }
        }
        s sVar = (s) objQ;
        mVar.f();
        return sVar;
    }
}
