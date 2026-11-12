package com.garmin.android.apps.connectmobile;

import p005kotlin.Unit;
import p3.b4;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class m implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f38724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AppConfigurationViewActivity f38725b;

    public /* synthetic */ m(AppConfigurationViewActivity appConfigurationViewActivity, int i14) {
        this.f38724a = i14;
        this.f38725b = appConfigurationViewActivity;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:30:0x014f  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f38724a;
        AppConfigurationViewActivity appConfigurationViewActivity = this.f38725b;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i15 = AppConfigurationViewActivity.f28625b;
                int i16 = 1;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    p3.x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, true, z3.f.c(-1715668361, new m(appConfigurationViewActivity, i16), mVar), mVar, 221184, 15);
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = AppConfigurationViewActivity.f28625b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    p3.x1 x1Var2 = p3.n.f135158a;
                    p3.p1 p1VarC = s9.c.c(appConfigurationViewActivity.ba().f28630d, mVar2);
                    p3.p1 p1VarC2 = s9.c.c(appConfigurationViewActivity.ba().f28628b, mVar2);
                    h4.r.a aVar = h4.r.S;
                    h4.r rVarD = c2.x2.d(aVar, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar = j92.b.f97899b;
                    h4.r rVarY = c2.l.y(rVarD, eVar.f97918c);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    c2.z zVarA = c2.y.a(kVar, h4.d.a.f81536n, mVar2, 0);
                    int iHashCode = Long.hashCode(mVar2.getU());
                    p3.i2 i2VarX = mVar2.x();
                    h4.r rVarC = h4.k.c(rVarY, mVar2);
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
                    b4.c(h5.g.a.f81810g, zVarA, mVar2);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar2);
                    h5.g.a.b bVar = h5.g.a.f81813j;
                    if (mVar2.getT() || !p005kotlin.jvm.internal.s.g(mVar2.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar2, iHashCode, bVar);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar2);
                    c2.b0 b0Var = c2.b0.f22601a;
                    String str = (String) p1VarC2.getF182175a();
                    h4.r rVarF = c2.x2.f(aVar, 1.0f);
                    w0.f47884a.getClass();
                    z3.e eVar2 = w0.f47885b;
                    boolean zR = mVar2.r(appConfigurationViewActivity);
                    Object objQ = mVar2.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zR) {
                        objQ = new b41.a(appConfigurationViewActivity, 27);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new b41.a(appConfigurationViewActivity, 27);
                            mVar2.K(objQ);
                        }
                    }
                    l72.p1.a(str, rVarF, "Search by key", null, false, false, null, 0L, null, null, eVar2, null, null, (e23.l) objQ, mVar2, 432, 6, 15352);
                    h4.r rVarC2 = c2.l.C(c2.x2.d(aVar, 1.0f), 0.0f, eVar.f97920e, 0.0f, 0.0f, 13);
                    c2.j.i iVarI = c2.j.i(eVar.f97918c);
                    boolean zB = mVar2.B(p1VarC) | mVar2.r(appConfigurationViewActivity);
                    Object objQ2 = mVar2.q();
                    if (zB) {
                        objQ2 = new cn1.d(1, p1VarC, appConfigurationViewActivity);
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new cn1.d(1, p1VarC, appConfigurationViewActivity);
                            mVar2.K(objQ2);
                        }
                    }
                    e2.c.b(rVarC2, null, null, iVarI, null, null, false, null, (e23.l) objQ2, mVar2, 0, 494);
                    mVar2.y();
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
