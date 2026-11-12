package a03;

import c2.x2;
import f5.z0;
import o4.m1;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.x1;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class o0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f147a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f148b;

    public /* synthetic */ o0(float f14, int i14) {
        this.f147a = i14;
        this.f148b = f14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f147a;
        float f14 = this.f148b;
        switch (i14) {
            case 0:
                g6.c cVar = (g6.c) obj;
                ((Float) obj2).getClass();
                cVar.getClass();
                return Float.valueOf(cVar.s0(f14));
            case 1:
                ((Integer) obj2).getClass();
                b12.k.a(f14, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                g02.k0.e(f14, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                l72.o.b(f14, (p3.m) obj, p3.p0.t(7));
                return Unit.INSTANCE;
            case 4:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    g6.f.a aVar = g6.f.f75994b;
                    c2.q.a(u1.n.e(x2.q(h4.r.S, 40), fb1.c.g(d92.b.f58623a, mVar), k2.i.c(0.0f, f14, 0.0f, 0.0f, 13)), mVar, 0);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            case 5:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    g6.f.a aVar3 = g6.f.f75994b;
                    h4.r rVarQ = x2.q(aVar2, 40);
                    h4.d.f81522a.getClass();
                    h4.g gVar = h4.d.a.f81524b;
                    z0 z0VarD = c2.q.d(gVar, false);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarQ, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    h5.g.a.e eVar = h5.g.a.f81810g;
                    b4.c(eVar, z0VarD, mVar2);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC, mVar2);
                    h4.r rVarC2 = c2.u.f22885a.c(u1.n.e(x2.q(aVar2, f14), fb1.c.g(d92.b.f58623a, mVar2), m1.f128891a), h4.d.a.f81528f);
                    z0 z0VarD2 = c2.q.d(gVar, false);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC3 = h4.k.c(rVarC2, mVar2);
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar4);
                    } else {
                        mVar2.c();
                    }
                    b4.c(eVar, z0VarD2, mVar2);
                    b4.c(c1623g, i2VarX2, mVar2);
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar);
                    }
                    b4.c(fVar, rVarC3, mVar2);
                    mVar2.y();
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                sg2.n.c(f14, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                vy0.i.d(f14, (p3.m) obj, p3.p0.t(1));
                return Unit.INSTANCE;
            default:
                ((Integer) obj).getClass();
                ((Integer) obj2).getClass();
                return c2.l.e(f14, 0.0f, f14, 0.0f, 10);
        }
    }

    public /* synthetic */ o0(float f14, int i14, int i15) {
        this.f147a = i15;
        this.f148b = f14;
    }
}
