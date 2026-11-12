package i3;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class ve {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p3.j0 f90019a = p3.v.c(new i01.j(25));

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class a implements e23.p<p3.m, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h4.r f90020a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o4.r1 f90021b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ long f90022c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ float f90023d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ u1.u f90024e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f90025f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90026g;

        /* JADX WARN: Multi-variable type inference failed */
        public a(h4.r rVar, o4.r1 r1Var, long j8, float f14, u1.u uVar, float f15, e23.p<? super p3.m, ? super Integer, Unit> pVar) {
            this.f90020a = rVar;
            this.f90021b = r1Var;
            this.f90022c = j8;
            this.f90023d = f14;
            this.f90024e = uVar;
            this.f90025f = f15;
            this.f90026g = pVar;
        }

        @Override // e23.p
        public final Unit invoke(p3.m mVar, Integer num) {
            p3.m mVar2 = mVar;
            int iIntValue = num.intValue();
            if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                p3.x1 x1Var = p3.n.f135158a;
                h4.r rVarD = ve.d(this.f90020a, this.f90021b, ve.e(this.f90022c, this.f90023d, mVar2), this.f90024e, ((g6.c) mVar2.A(kotlin.t1.f91490h)).s0(this.f90025f));
                Object objQ = mVar2.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new i11.f(28);
                    mVar2.K(objQ);
                }
                h4.r rVarC = p5.v.c((e23.l) objQ, rVarD, false);
                Unit unit = Unit.INSTANCE;
                Object objQ2 = mVar2.q();
                if (objQ2 == c2565a) {
                    objQ2 = ue.f89930a;
                    mVar2.K(objQ2);
                }
                h4.r rVarB = b5.s0.b(rVarC, unit, (PointerInputEventHandler) objQ2);
                h4.d.f81522a.getClass();
                f5.z0 z0VarD = c2.q.d(h4.d.a.f81524b, true);
                int iP = mVar2.P();
                p3.i2 i2VarX = mVar2.x();
                h4.r rVarC2 = h4.k.c(rVarB, mVar2);
                h5.g.V.getClass();
                h5.e0.a aVar = h5.g.a.f81805b;
                if (mVar2.F() == null) {
                    p3.p0.l();
                    throw null;
                }
                mVar2.z();
                if (mVar2.getT()) {
                    mVar2.M(aVar);
                } else {
                    mVar2.c();
                }
                p3.b4.c(h5.g.a.f81810g, z0VarD, mVar2);
                p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                    v.h.z(iP, mVar2, iP, bVar);
                }
                p3.b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                c2.u uVar = c2.u.f22885a;
                v.h.B(this.f90026g, mVar2, 0);
            } else {
                mVar2.e();
            }
            return Unit.INSTANCE;
        }
    }

    public static final void a(h4.r rVar, o4.r1 r1Var, long j8, long j14, float f14, float f15, u1.u uVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, p3.m mVar, int i14, int i15) {
        if ((i15 & 1) != 0) {
            rVar = h4.r.S;
        }
        if ((i15 & 2) != 0) {
            r1Var = o4.m1.f128891a;
        }
        if ((i15 & 4) != 0) {
            s7.f89624a.getClass();
            j8 = s7.a(mVar).f88501p;
        }
        if ((i15 & 8) != 0) {
            j14 = k2.b(j8, mVar);
        }
        if ((i15 & 16) != 0) {
            f14 = 0;
            g6.f.a aVar = g6.f.f75994b;
        }
        if ((i15 & 32) != 0) {
            f15 = 0;
            g6.f.a aVar2 = g6.f.f75994b;
        }
        if ((i15 & 64) != 0) {
            uVar = null;
        }
        p3.x1 x1Var = p3.n.f135158a;
        p3.j0 j0Var = f90019a;
        float f16 = f14 + ((g6.f) mVar.A(j0Var)).f75997a;
        p3.v.b(new p3.n2[]{s2.f89590a.c(o4.d0.a(j14)), j0Var.c(g6.f.a(f16))}, z3.f.c(421772006, new a(rVar, r1Var, j8, f16, uVar, f15, pVar), mVar), mVar, 56);
    }

    public static final void b(boolean z14, e23.a aVar, h4.r rVar, boolean z15, o4.r1 r1Var, long j8, long j14, float f14, u1.u uVar, a2.j jVar, z3.e eVar, p3.m mVar, int i14, int i15) {
        boolean z16 = (i15 & 8) != 0 ? true : z15;
        long jB = (i15 & 64) != 0 ? k2.b(j8, mVar) : j14;
        float f15 = 0;
        g6.f.a aVar2 = g6.f.f75994b;
        float f16 = (i15 & 256) != 0 ? 0 : f14;
        u1.u uVar2 = (i15 & 512) != 0 ? null : uVar;
        a2.j jVar2 = (i15 & 1024) == 0 ? jVar : null;
        p3.x1 x1Var = p3.n.f135158a;
        if (jVar2 == null) {
            mVar.C(1528143336);
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = tn.k.c(mVar);
            }
            jVar2 = (a2.j) objQ;
        } else {
            mVar.C(-227800369);
        }
        mVar.f();
        a2.j jVar3 = jVar2;
        p3.j0 j0Var = f90019a;
        float f17 = ((g6.f) mVar.A(j0Var)).f75997a + f15;
        p3.v.b(new p3.n2[]{s2.f89590a.c(o4.d0.a(jB)), j0Var.c(g6.f.a(f17))}, z3.f.c(1508735219, new xe(rVar, r1Var, j8, f17, uVar2, z14, jVar3, z16, aVar, f16, eVar), mVar), mVar, 56);
    }

    public static final void c(e23.a aVar, h4.r rVar, boolean z14, o4.r1 r1Var, long j8, long j14, float f14, float f15, u1.u uVar, a2.j jVar, z3.e eVar, p3.m mVar, int i14, int i15) {
        float f16;
        float f17;
        boolean z15 = (i15 & 4) != 0 ? true : z14;
        long jB = (i15 & 32) != 0 ? k2.b(j8, mVar) : j14;
        if ((i15 & 64) != 0) {
            f16 = 0;
            g6.f.a aVar2 = g6.f.f75994b;
        } else {
            f16 = f14;
        }
        if ((i15 & 128) != 0) {
            g6.f.a aVar3 = g6.f.f75994b;
            f17 = 0;
        } else {
            f17 = f15;
        }
        u1.u uVar2 = (i15 & 256) != 0 ? null : uVar;
        a2.j jVar2 = (i15 & 512) == 0 ? jVar : null;
        p3.x1 x1Var = p3.n.f135158a;
        if (jVar2 == null) {
            mVar.C(-1701037204);
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            if (objQ == p3.m.a.f135155b) {
                objQ = tn.k.c(mVar);
            }
            jVar2 = (a2.j) objQ;
        } else {
            mVar.C(2023337163);
        }
        mVar.f();
        a2.j jVar3 = jVar2;
        p3.j0 j0Var = f90019a;
        float f18 = ((g6.f) mVar.A(j0Var)).f75997a + f16;
        p3.v.b(new p3.n2[]{s2.f89590a.c(o4.d0.a(jB)), j0Var.c(g6.f.a(f18))}, z3.f.c(849208527, new we(rVar, r1Var, j8, f18, uVar2, jVar3, z15, aVar, f17, eVar), mVar), mVar, 56);
    }

    public static final h4.r d(h4.r rVar, o4.r1 r1Var, long j8, u1.u uVar, float f14) {
        o4.r1 r1Var2;
        h4.r rVarB;
        if (f14 > 0.0f) {
            r1Var2 = r1Var;
            rVarB = o4.s0.b(h4.r.S, 0.0f, 0.0f, 0.0f, f14, r1Var2, 124895);
        } else {
            r1Var2 = r1Var;
            rVarB = h4.r.S;
        }
        h4.r rVarThen = rVar.then(rVarB);
        h4.r rVarC = h4.r.S;
        if (uVar != null) {
            rVarC = u1.q.c(uVar.f167683a, rVarC, uVar.f167684b, r1Var2);
        }
        return l4.k.b(u1.n.e(rVarThen.then(rVarC), j8, r1Var2), r1Var2);
    }

    public static final long e(long j8, float f14, p3.m mVar) {
        p3.x1 x1Var = p3.n.f135158a;
        s7.f89624a.getClass();
        j2 j2VarA = s7.a(mVar);
        boolean zBooleanValue = ((Boolean) mVar.A(k2.f88659b)).booleanValue();
        long j14 = j2VarA.f88501p;
        if (o4.d0.d(j8, j14) && zBooleanValue) {
            return g6.f.c(f14, (float) 0) ? j14 : o4.f0.g(o4.d0.c(((((float) Math.log(f14 + 1)) * 4.5f) + 2.0f) / 100.0f, j2VarA.f88505t, 14), j14);
        }
        return j8;
    }
}
