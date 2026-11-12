package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class w3 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f90068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ b3 f90069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ s5.x0 f90070e;

    /* JADX WARN: Multi-variable type inference failed */
    public w3(e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2, e23.p<? super p3.m, ? super Integer, Unit> pVar3, b3 b3Var, s5.x0 x0Var) {
        this.f90066a = pVar;
        this.f90067b = pVar2;
        this.f90068c = pVar3;
        this.f90069d = b3Var;
        this.f90070e = x0Var;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        c2.j.e eVar;
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            h4.r rVarF = c2.x2.f(aVar, 1.0f);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
            int iP = mVar2.P();
            p3.i2 i2VarX = mVar2.x();
            h4.r rVarC = h4.k.c(rVarF, mVar2);
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
            h5.g.a.e eVar2 = h5.g.a.f81810g;
            p3.b4.c(eVar2, zVarA, mVar2);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            p3.b4.c(c1623g, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            p3.b4.c(fVar, rVarC, mVar2);
            c2.b0 b0Var = c2.b0.f22601a;
            e23.p<p3.m, Integer, Unit> pVar = this.f90066a;
            e23.p<p3.m, Integer, Unit> pVar2 = this.f90067b;
            if (pVar == null || pVar2 == null) {
                eVar = pVar != null ? c2.j.f22692b : c2.j.f22693c;
            } else {
                eVar = c2.j.f22698h;
            }
            h4.r rVarF2 = c2.x2.f(aVar, 1.0f);
            c2.s2 s2VarA = c2.q2.a(eVar, h4.d.a.f81534l, mVar2, 48);
            int iP2 = mVar2.P();
            p3.i2 i2VarX2 = mVar2.x();
            h4.r rVarC2 = h4.k.c(rVarF2, mVar2);
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
            p3.b4.c(eVar2, s2VarA, mVar2);
            p3.b4.c(c1623g, i2VarX2, mVar2);
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP2))) {
                v.h.z(iP2, mVar2, iP2, bVar);
            }
            p3.b4.c(fVar, rVarC2, mVar2);
            c2.u2 u2Var = c2.u2.f22900a;
            if (pVar != null) {
                mVar2.C(-516028300);
                mh.a(this.f90070e, z3.f.c(-738208900, new v3(u2Var, pVar), mVar2), mVar2, 48);
                mVar2.f();
            } else {
                mVar2.C(-515838022);
                mVar2.f();
            }
            if (pVar2 == null) {
                mVar2.C(-515799087);
            } else {
                mVar2.C(260455984);
                pVar2.invoke(mVar2, 0);
            }
            mVar2.f();
            mVar2.y();
            if (this.f90068c == null && pVar == null && pVar2 == null) {
                mVar2.C(-250277930);
                mVar2.f();
            } else {
                mVar2.C(-250360576);
                v5.a(0.0f, 0, 3, this.f90069d.f87560x, null, mVar2);
                mVar2.f();
            }
            mVar2.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
