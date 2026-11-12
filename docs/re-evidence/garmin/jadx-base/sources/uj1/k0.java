package uj1;

import g02.s0;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class k0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f f171534b;

    public /* synthetic */ k0(com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f fVar, int i14) {
        this.f171533a = i14;
        this.f171534b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0100  */
    /* JADX WARN: Code duplicated, block: B:47:0x0131  */
    /* JADX WARN: Code duplicated, block: B:52:0x014c  */
    /* JADX WARN: Code duplicated, block: B:60:0x017e  */
    /* JADX WARN: Code duplicated, block: B:65:0x019a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f171533a;
        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f fVar = this.f171534b;
        int i15 = 1;
        int i16 = 0;
        int i17 = 2;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    p1 p1VarF = o53.f0.F(fVar.u6().f137977h1, new yj1.o(false, null, null, null, 15, null), mVar, 0);
                    yj1.e eVar = (yj1.e) o53.f0.G(fVar.u6().Q0, mVar).getF182175a();
                    s0.a(null, ((yj1.o) p1VarF.getF182175a()).f197574a || ((Boolean) o53.f0.F(fVar.u6().W0, Boolean.FALSE, mVar, 48).getF182175a()).booleanValue(), z3.f.c(132962518, new u91.i(9, fVar, p1VarF), mVar), mVar, 384, 1);
                    boolean z14 = eVar instanceof yj1.e.a;
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (z14) {
                        mVar.C(-480827567);
                        f12.l.f68084a.getClass();
                        com.garmin.android.apps.connectmobile.userprofile.model.g gVarW0 = f12.l.a.a().W0();
                        String str = gVarW0 != null ? gVarW0.f46858b : null;
                        if (str == null) {
                            str = "";
                        }
                        boolean zR = mVar.r(fVar);
                        Object objQ = mVar.q();
                        if (zR) {
                            objQ = new m0(fVar, i16);
                            mVar.K(objQ);
                        } else {
                            aVar2.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new m0(fVar, i16);
                                mVar.K(objQ);
                            }
                        }
                        og.a.a(0, (e23.a) objQ, str, mVar);
                        mVar.f();
                    } else if (eVar instanceof yj1.e.c) {
                        mVar.C(-292591277);
                        wj1.a aVar3 = ((yj1.e.c) eVar).f197533a;
                        boolean zR2 = mVar.r(fVar);
                        Object objQ2 = mVar.q();
                        if (zR2) {
                            objQ2 = new j0(fVar, i17);
                            mVar.K(objQ2);
                        } else {
                            aVar2.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new j0(fVar, i17);
                                mVar.K(objQ2);
                            }
                        }
                        e23.l lVar = (e23.l) objQ2;
                        boolean zR3 = mVar.r(fVar);
                        Object objQ3 = mVar.q();
                        if (zR3) {
                            objQ3 = new m0(fVar, i15);
                            mVar.K(objQ3);
                        } else {
                            aVar2.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new m0(fVar, i15);
                                mVar.K(objQ3);
                            }
                        }
                        og.a.i(aVar3, lVar, (e23.a) objQ3, mVar, wj1.a.f185782b);
                        mVar.f();
                    } else if (eVar instanceof yj1.e.b) {
                        mVar.C(-292579940);
                        wj1.a aVar4 = ((yj1.e.b) eVar).f197532a;
                        boolean zR4 = mVar.r(fVar);
                        Object objQ4 = mVar.q();
                        if (zR4) {
                            objQ4 = new j0(fVar, 3);
                            mVar.K(objQ4);
                        } else {
                            aVar2.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new j0(fVar, 3);
                                mVar.K(objQ4);
                            }
                        }
                        e23.l lVar2 = (e23.l) objQ4;
                        boolean zR5 = mVar.r(fVar);
                        Object objQ5 = mVar.q();
                        if (zR5) {
                            objQ5 = new m0(fVar, i17);
                            mVar.K(objQ5);
                        } else {
                            aVar2.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new m0(fVar, i17);
                                mVar.K(objQ5);
                            }
                        }
                        og.a.h(aVar4, lVar2, (e23.a) objQ5, mVar, wj1.a.f185782b);
                        mVar.f();
                    } else {
                        if (eVar != null) {
                            throw n23.j.m(mVar, -292607317);
                        }
                        mVar.C(-479736832);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.a aVar5 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.f.f43837h;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(53326688, new k0(fVar, i16), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
