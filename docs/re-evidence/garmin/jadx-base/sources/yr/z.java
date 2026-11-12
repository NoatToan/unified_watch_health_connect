package yr;

import c2.q2;
import c2.s2;
import c2.u2;
import c2.x2;
import f5.z0;
import i3.i7;
import i3.mh;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;
import u62.h1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class z implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f198920a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nr.g.i f198921b;

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f198920a;
        nr.g.i iVar = this.f198921b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarY = c2.l.y(aVar, eVar.f97920e);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    h4.g.a aVar2 = h4.d.a.f81536n;
                    c2.z zVarA = c2.y.a(kVar, aVar2, mVar, 0);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarY, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar3 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA, mVar);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81534l, mVar, 48);
                    int iHashCode2 = Long.hashCode(mVar.getU());
                    i2 i2VarX2 = mVar.x();
                    h4.r rVarC2 = h4.k.c(aVar, mVar);
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, s2VarA, mVar);
                    b4.c(c1623g, i2VarX2, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC2, mVar);
                    u2 u2Var = u2.f22900a;
                    j92.c cVar = j92.b.f97901d;
                    h4.r rVarE = u1.n.e(l4.k.b(x2.q(aVar, cVar.f97906e), k2.i.f102406a), d92.b.a(mVar).e().g(), m1.f128891a);
                    z0 z0VarD = c2.q.d(h4.d.a.f81528f, false);
                    int iHashCode3 = Long.hashCode(mVar.getU());
                    i2 i2VarX3 = mVar.x();
                    h4.r rVarC3 = h4.k.c(rVarE, mVar);
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, z0VarD, mVar);
                    b4.c(c1623g, i2VarX3, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar, iHashCode3, bVar);
                    }
                    b4.c(fVar, rVarC3, mVar);
                    c2.u uVar = c2.u.f22885a;
                    h4.r rVarQ = x2.q(aVar, cVar.f97905d);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = h1.a(t62.a.f162797a);
                    gl.c.f77766a.getClass();
                    i7.b(dVarA, null, rVarQ, gl.c.a(mVar).c(), mVar, 48, 0);
                    mVar.y();
                    h4.r rVarA = u2Var.a(c2.l.C(aVar, eVar.f97920e, 0.0f, 0.0f, 0.0f, 14), 1.0f, true);
                    c2.z zVarA2 = c2.y.a(kVar, aVar2, mVar, 0);
                    int iHashCode4 = Long.hashCode(mVar.getU());
                    i2 i2VarX4 = mVar.x();
                    h4.r rVarC4 = h4.k.c(rVarA, mVar);
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar3);
                    } else {
                        mVar.c();
                    }
                    b4.c(eVar2, zVarA2, mVar);
                    b4.c(c1623g, i2VarX4, mVar);
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar, iHashCode4, bVar);
                    }
                    b4.c(fVar, rVarC4, mVar);
                    String str = iVar.f127074a;
                    d92.b.f58624b.getClass();
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(d92.c.e(j92.f.f97930g), mVar), mVar, 0, 0, 131070);
                    mh.c(iVar.f127075b, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.f(j92.f.f97933j, mVar), mVar, 0, 0, 131070);
                    mVar.y();
                    mVar.y();
                    l72.x0.f111346a.e(c2.l.C(aVar, 0.0f, eVar.f97920e, 0.0f, 0.0f, 13), z3.f.c(1556364328, new xn.t(iVar, 11), mVar), mVar, (l72.x0.f111348c << 6) | 48, 0);
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                a0.a(iVar, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
        }
    }
}
