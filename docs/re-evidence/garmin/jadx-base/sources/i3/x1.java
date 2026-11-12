package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class x1 implements e23.q<r1.e0, p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f90189b;

    /* JADX WARN: Multi-variable type inference failed */
    public x1(e23.p<? super p3.m, ? super Integer, Unit> pVar, long j8) {
        this.f90188a = pVar;
        this.f90189b = j8;
    }

    @Override // e23.q
    public final Unit invoke(r1.e0 e0Var, p3.m mVar, Integer num) {
        z3.e eVarC;
        p3.m mVar2 = mVar;
        num.intValue();
        p3.x1 x1Var = p3.n.f135158a;
        float f14 = y1.f90384a;
        e23.p<p3.m, Integer, Unit> pVar = this.f90188a;
        if (pVar != null) {
            mVar2.C(-1219055576);
            eVarC = z3.f.c(-566924201, new b2(this.f90189b, pVar), mVar2);
            mVar2.f();
        } else {
            mVar2.C(-1218863531);
            mVar2.f();
            eVarC = null;
        }
        p3.p1 p1VarD = y1.d(eVarC, mVar2);
        h4.d.f81522a.getClass();
        h4.g gVar = h4.d.a.f81528f;
        h4.r.a aVar = h4.r.S;
        f5.z0 z0VarD = c2.q.d(gVar, false);
        int iP = mVar2.P();
        p3.i2 i2VarX = mVar2.x();
        h4.r rVarC = h4.k.c(aVar, mVar2);
        h5.g.V.getClass();
        h5.e0.a aVar2 = h5.g.a.f81805b;
        if (mVar2.F() == null) {
            p3.p0.l();
            throw null;
        }
        mVar2.z();
        if (mVar2.getT()) {
            mVar2.M(aVar2);
        } else {
            mVar2.c();
        }
        p3.b4.c(h5.g.a.f81810g, z0VarD, mVar2);
        p3.b4.c(h5.g.a.f81809f, i2VarX, mVar2);
        h5.g.a.b bVar = h5.g.a.f81813j;
        if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
            v.h.z(iP, mVar2, iP, bVar);
        }
        p3.b4.c(h5.g.a.f81807d, rVarC, mVar2);
        c2.u uVar = c2.u.f22885a;
        e23.p pVar2 = (e23.p) p1VarD.getF182175a();
        if (pVar2 == null) {
            mVar2.C(-2101783313);
        } else {
            mVar2.C(-344894126);
            pVar2.invoke(mVar2, 0);
        }
        mVar2.f();
        mVar2.y();
        return Unit.INSTANCE;
    }
}
