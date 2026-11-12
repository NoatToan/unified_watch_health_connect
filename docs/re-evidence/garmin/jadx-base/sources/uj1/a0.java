package uj1;

import androidx.lifecycle.s0;
import p005kotlin.Unit;
import p3.p1;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class a0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f171487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e f171488b;

    public /* synthetic */ a0(com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e eVar, int i14) {
        this.f171487a = i14;
        this.f171488b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:40:0x0129  */
    /* JADX WARN: Code duplicated, block: B:45:0x0144  */
    /* JADX WARN: Code duplicated, block: B:53:0x0176  */
    /* JADX WARN: Code duplicated, block: B:58:0x0191  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f171487a;
        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e eVar = this.f171488b;
        int i15 = 0;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    p1 p1VarF = o53.f0.F((s0) eVar.f43783f.getValue(), new yj1.b(false, false, false, false, null, false, false, null, 255, null), mVar, 0);
                    yj1.e eVar2 = (yj1.e) o53.f0.G(eVar.v6().Q0, mVar).getF182175a();
                    g02.s0.a(null, ((Boolean) o53.f0.F(eVar.v6().W0, Boolean.FALSE, mVar, 48).getF182175a()).booleanValue(), z3.f.c(1281401206, new u91.i(7, eVar, p1VarF), mVar), mVar, 384, 1);
                    boolean z14 = eVar2 instanceof yj1.e.a;
                    p3.m.a aVar2 = p3.m.f135153a;
                    if (z14) {
                        mVar.C(-1115913519);
                        f12.l.f68084a.getClass();
                        com.garmin.android.apps.connectmobile.userprofile.model.g gVarW0 = f12.l.a.a().W0();
                        String str = gVarW0 != null ? gVarW0.f46858b : null;
                        if (str == null) {
                            str = "";
                        }
                        boolean zR = mVar.r(eVar);
                        Object objQ = mVar.q();
                        if (zR) {
                            objQ = new b0(eVar, 0);
                            mVar.K(objQ);
                        } else {
                            aVar2.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new b0(eVar, 0);
                                mVar.K(objQ);
                            }
                        }
                        og.a.a(0, (e23.a) objQ, str, mVar);
                        mVar.f();
                    } else if (eVar2 instanceof yj1.e.c) {
                        mVar.C(-728719949);
                        wj1.a aVar3 = ((yj1.e.c) eVar2).f197533a;
                        boolean zR2 = mVar.r(eVar);
                        Object objQ2 = mVar.q();
                        if (zR2) {
                            objQ2 = new c0(eVar, 0);
                            mVar.K(objQ2);
                        } else {
                            aVar2.getClass();
                            if (objQ2 == p3.m.a.f135155b) {
                                objQ2 = new c0(eVar, 0);
                                mVar.K(objQ2);
                            }
                        }
                        e23.l lVar = (e23.l) objQ2;
                        boolean zR3 = mVar.r(eVar);
                        Object objQ3 = mVar.q();
                        if (zR3) {
                            objQ3 = new b0(eVar, 1);
                            mVar.K(objQ3);
                        } else {
                            aVar2.getClass();
                            if (objQ3 == p3.m.a.f135155b) {
                                objQ3 = new b0(eVar, 1);
                                mVar.K(objQ3);
                            }
                        }
                        og.a.i(aVar3, lVar, (e23.a) objQ3, mVar, wj1.a.f185782b);
                        mVar.f();
                    } else if (eVar2 instanceof yj1.e.b) {
                        mVar.C(-728708644);
                        wj1.a aVar4 = ((yj1.e.b) eVar2).f197532a;
                        boolean zR4 = mVar.r(eVar);
                        Object objQ4 = mVar.q();
                        if (zR4) {
                            objQ4 = new c0(eVar, 1);
                            mVar.K(objQ4);
                        } else {
                            aVar2.getClass();
                            if (objQ4 == p3.m.a.f135155b) {
                                objQ4 = new c0(eVar, 1);
                                mVar.K(objQ4);
                            }
                        }
                        e23.l lVar2 = (e23.l) objQ4;
                        boolean zR5 = mVar.r(eVar);
                        Object objQ5 = mVar.q();
                        if (zR5) {
                            objQ5 = new b0(eVar, 2);
                            mVar.K(objQ5);
                        } else {
                            aVar2.getClass();
                            if (objQ5 == p3.m.a.f135155b) {
                                objQ5 = new b0(eVar, 2);
                                mVar.K(objQ5);
                            }
                        }
                        og.a.h(aVar4, lVar2, (e23.a) objQ5, mVar, wj1.a.f185782b);
                        mVar.f();
                    } else {
                        if (eVar2 != null) {
                            throw n23.j.m(mVar, -728735960);
                        }
                        mVar.C(-1114825760);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                return Unit.INSTANCE;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.a aVar5 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.e.f43777g;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1354946816, new a0(eVar, i15), mVar2), mVar2, 196608, 31);
                } else {
                    mVar2.e();
                }
                return Unit.INSTANCE;
        }
    }
}
