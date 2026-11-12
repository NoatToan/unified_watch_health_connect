package i3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class i3 implements e23.p<p3.m, Integer, Unit> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e23.q<c2.a0, p3.m, Integer, Unit> f88392a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88393b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.p<p3.m, Integer, Unit> f88394c;

    /* JADX WARN: Multi-variable type inference failed */
    public i3(e23.q<? super c2.a0, ? super p3.m, ? super Integer, Unit> qVar, e23.p<? super p3.m, ? super Integer, Unit> pVar, e23.p<? super p3.m, ? super Integer, Unit> pVar2) {
        this.f88392a = qVar;
        this.f88393b = pVar;
        this.f88394c = pVar2;
    }

    @Override // e23.p
    public final Unit invoke(p3.m mVar, Integer num) {
        p3.m mVar2 = mVar;
        int iIntValue = num.intValue();
        if (mVar2.n(iIntValue & 1, (iIntValue & 3) != 2)) {
            p3.x1 x1Var = p3.n.f135158a;
            c2.j.f22691a.getClass();
            c2.j.g gVar = c2.j.f22698h;
            h4.r.a aVar = h4.r.S;
            h4.d.f81522a.getClass();
            c2.z zVarA = c2.y.a(gVar, h4.d.a.f81536n, mVar2, 6);
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
            h5.g.a.e eVar = h5.g.a.f81810g;
            p3.b4.c(eVar, zVarA, mVar2);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            p3.b4.c(c1623g, i2VarX, mVar2);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP))) {
                v.h.z(iP, mVar2, iP, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            p3.b4.c(fVar, rVarC, mVar2);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarA = b0Var.a(aVar, 1.0f, false);
            h4.g gVar2 = h4.d.a.f81524b;
            f5.z0 z0VarD = c2.q.d(gVar2, false);
            int iP2 = mVar2.P();
            p3.i2 i2VarX2 = mVar2.x();
            h4.r rVarC2 = h4.k.c(rVarA, mVar2);
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
            p3.b4.c(eVar, z0VarD, mVar2);
            p3.b4.c(c1623g, i2VarX2, mVar2);
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP2))) {
                v.h.z(iP2, mVar2, iP2, bVar);
            }
            p3.b4.c(fVar, rVarC2, mVar2);
            c2.u uVar = c2.u.f22885a;
            this.f88392a.invoke(b0Var, mVar2, 6);
            mVar2.y();
            h4.r rVarX = c2.l.x(b0Var.b(aVar, h4.d.a.f81538p), k3.f88661a);
            f5.z0 z0VarD2 = c2.q.d(gVar2, false);
            int iP3 = mVar2.P();
            p3.i2 i2VarX3 = mVar2.x();
            h4.r rVarC3 = h4.k.c(rVarX, mVar2);
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
            p3.b4.c(eVar, z0VarD2, mVar2);
            p3.b4.c(c1623g, i2VarX3, mVar2);
            if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iP3))) {
                v.h.z(iP3, mVar2, iP3, bVar);
            }
            p3.b4.c(fVar, rVarC3, mVar2);
            n3.o.f123178a.getClass();
            l3.k.b(k2.e(n3.o.f123179b, mVar2), sj.a(n3.o.f123180c, mVar2), z3.f.c(-1103927529, new h3(this.f88393b, this.f88394c), mVar2), mVar2, 384);
            mVar2.y();
            mVar2.y();
        } else {
            mVar2.e();
        }
        return Unit.INSTANCE;
    }
}
