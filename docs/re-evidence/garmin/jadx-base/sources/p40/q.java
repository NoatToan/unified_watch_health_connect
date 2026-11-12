package p40;

import c2.x2;
import o72.i3;
import p005kotlin.Unit;
import p3.b4;
import p3.i2;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class q implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f135721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f135722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f135723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f135724e;

    public /* synthetic */ q(p1 p1Var, p1 p1Var2, p1 p1Var3, p1 p1Var4, int i14) {
        this.f135720a = i14;
        this.f135721b = p1Var;
        this.f135722c = p1Var2;
        this.f135723d = p1Var3;
        this.f135724e = p1Var4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f135720a;
        p3.m.a aVar = p3.m.f135153a;
        p1 p1Var = this.f135724e;
        p1 p1Var2 = this.f135723d;
        p1 p1Var3 = this.f135722c;
        p1 p1Var4 = this.f135721b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    h4.r.a aVar2 = h4.r.S;
                    h4.r rVarF = x2.f(aVar2, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar3 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA = c2.y.a(c2.j.f22694d, aVar3, mVar, 48);
                    int iHashCode = Long.hashCode(mVar.getU());
                    i2 i2VarX = mVar.x();
                    h4.r rVarC = h4.k.c(rVarF, mVar);
                    h5.g.V.getClass();
                    h5.e0.a aVar4 = h5.g.a.f81805b;
                    if (mVar.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar.z();
                    if (mVar.getT()) {
                        mVar.M(aVar4);
                    } else {
                        mVar.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA, mVar);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar.getT() || !p005kotlin.jvm.internal.s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar);
                    c2.b0 b0Var = c2.b0.f22601a;
                    int i15 = u.b.f135762a[((u0) p1Var4.getF182175a()).ordinal()];
                    if (i15 == 1) {
                        mVar.C(315452521);
                        p1Var3.setValue(0);
                        h4.r rVarX = x2.x(x2.z(aVar2, null, 3), null, 3);
                        Object objQ = mVar.q();
                        aVar.getClass();
                        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                        if (objQ == c2565a) {
                            objQ = new i3(p1Var2, 12);
                            mVar.K(objQ);
                        }
                        e23.l lVar = (e23.l) objQ;
                        Object objQ2 = mVar.q();
                        if (objQ2 == c2565a) {
                            objQ2 = new i3(p1Var, 13);
                            mVar.K(objQ2);
                        }
                        u.f(rVarX, null, null, lVar, (e23.l) objQ2, mVar, 27654);
                        mVar.f();
                    } else {
                        if (i15 != 2) {
                            throw n23.j.m(mVar, 1395647359);
                        }
                        mVar.C(315932773);
                        h4.r rVarX2 = x2.x(x2.z(aVar2, null, 3), null, 3);
                        Object objQ3 = mVar.q();
                        aVar.getClass();
                        p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                        if (objQ3 == c2565a2) {
                            objQ3 = new i3(p1Var3, 14);
                            mVar.K(objQ3);
                        }
                        e23.l lVar2 = (e23.l) objQ3;
                        Object objQ4 = mVar.q();
                        if (objQ4 == c2565a2) {
                            objQ4 = new i3(p1Var2, 15);
                            mVar.K(objQ4);
                        }
                        e23.l lVar3 = (e23.l) objQ4;
                        Object objQ5 = mVar.q();
                        if (objQ5 == c2565a2) {
                            objQ5 = new i3(p1Var, 16);
                            mVar.K(objQ5);
                        }
                        u.c(rVarX2, null, null, null, lVar2, lVar3, (e23.l) objQ5, mVar, 1794054);
                        mVar = mVar;
                        mVar.f();
                    }
                    mVar.y();
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    h4.r rVarF2 = x2.f(aVar5, 1.0f);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar6 = h4.d.a.f81537o;
                    c2.j.f22691a.getClass();
                    c2.z zVarA2 = c2.y.a(c2.j.f22694d, aVar6, mVar2, 48);
                    int iHashCode2 = Long.hashCode(mVar2.getU());
                    i2 i2VarX2 = mVar2.x();
                    h4.r rVarC2 = h4.k.c(rVarF2, mVar2);
                    h5.g.V.getClass();
                    h5.e0.a aVar7 = h5.g.a.f81805b;
                    if (mVar2.F() == null) {
                        p3.p0.l();
                        throw null;
                    }
                    mVar2.z();
                    if (mVar2.getT()) {
                        mVar2.M(aVar7);
                    } else {
                        mVar2.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX2, mVar2);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar2, iHashCode2, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC2, mVar2);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    int i16 = r0.b.f135732a[((u0) p1Var4.getF182175a()).ordinal()];
                    if (i16 == 1) {
                        mVar2.C(527171368);
                        p1Var3.setValue(0);
                        h4.r rVarX3 = x2.x(x2.z(aVar5, null, 3), null, 3);
                        Object objQ6 = mVar2.q();
                        aVar.getClass();
                        p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                        if (objQ6 == c2565a3) {
                            objQ6 = new i3(p1Var2, 19);
                            mVar2.K(objQ6);
                        }
                        e23.l lVar4 = (e23.l) objQ6;
                        Object objQ7 = mVar2.q();
                        if (objQ7 == c2565a3) {
                            objQ7 = new i3(p1Var, 20);
                            mVar2.K(objQ7);
                        }
                        u.f(rVarX3, null, null, lVar4, (e23.l) objQ7, mVar2, 27654);
                        mVar2.f();
                    } else {
                        if (i16 != 2) {
                            throw n23.j.m(mVar2, -2061206383);
                        }
                        mVar2.C(527692292);
                        h4.r rVarX4 = x2.x(x2.z(aVar5, null, 3), null, 3);
                        Object objQ8 = mVar2.q();
                        aVar.getClass();
                        p3.m.a.C2565a c2565a4 = p3.m.a.f135155b;
                        if (objQ8 == c2565a4) {
                            objQ8 = new i3(p1Var3, 21);
                            mVar2.K(objQ8);
                        }
                        e23.l lVar5 = (e23.l) objQ8;
                        Object objQ9 = mVar2.q();
                        if (objQ9 == c2565a4) {
                            objQ9 = new i3(p1Var2, 22);
                            mVar2.K(objQ9);
                        }
                        e23.l lVar6 = (e23.l) objQ9;
                        Object objQ10 = mVar2.q();
                        if (objQ10 == c2565a4) {
                            objQ10 = new i3(p1Var, 23);
                            mVar2.K(objQ10);
                        }
                        u.c(rVarX4, null, null, null, lVar5, lVar6, (e23.l) objQ10, mVar2, 1794054);
                        mVar2.f();
                    }
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
