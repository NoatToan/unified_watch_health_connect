package hw1;

import c2.l;
import c2.q;
import c2.q2;
import c2.s2;
import c2.u;
import c2.u2;
import c2.x2;
import e23.p;
import f5.z0;
import h4.k;
import h4.r;
import h5.e0;
import i3.v5;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p3.b4;
import p3.i2;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import ug2.q0;
import z2.m0;
import z2.u1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f85943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f85944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z3.e f85945c;

    public /* synthetic */ c(r rVar, z3.e eVar) {
        this.f85943a = 1;
        this.f85944b = rVar;
        this.f85945c = eVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f85943a;
        z3.e eVar = this.f85945c;
        r rVar = this.f85944b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                d.a(rVar, eVar, (m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 1:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    h4.d.f81522a.getClass();
                    z0 z0VarD = q.d(h4.d.a.f81524b, false);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    r rVarC = k.c(rVar, mVar);
                    h5.g.V.getClass();
                    e0.a aVar = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar);
                    } else {
                        mVar.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, z0VarD, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar);
                    u uVar = u.f22885a;
                    r.a aVar2 = r.S;
                    g6.f.a aVar3 = g6.f.f75994b;
                    r rVarC2 = uVar.c(l.C(x2.f(aVar2, 1.0f), 0.0f, 0.0f, 0.0f, 8, 7), h4.d.a.f81528f);
                    d92.b.f58623a.getClass();
                    v5.a(2, 48, 0, d92.b.a(mVar).e().g(), rVarC2, mVar);
                    r rVarF = x2.f(aVar2, 1.0f);
                    c2.j.f22691a.getClass();
                    s2 s2VarA = q2.a(c2.j.f22699i, h4.d.a.f81533k, mVar, 6);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    r rVarC3 = k.c(rVarF, mVar);
                    if (mVar.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, s2VarA, mVar);
                    b4.c(c1623g, i2VarX2, mVar);
                    if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC3, mVar);
                    eVar.invoke(u2.f22900a, mVar, 6);
                    mVar.y();
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                q0.b(rVar, eVar, (m) obj, p0.t(49));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                m0.b(rVar, eVar, (m) obj, p0.t(49));
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                u1.a(rVar, eVar, (m) obj, p0.t(49));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ c(r rVar, z3.e eVar, int i14, int i15) {
        this.f85943a = i15;
        this.f85944b = rVar;
        this.f85945c = eVar;
    }
}
