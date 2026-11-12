package zj1;

import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import e23.p;
import p005kotlin.Unit;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f204931a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e f204932b;

    public /* synthetic */ i(com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e eVar, int i14) {
        this.f204931a = i14;
        this.f204932b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f204931a;
        com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e eVar = this.f204932b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.a aVar = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.f43912d;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-418539483, new i(eVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.a aVar2 = com.garmin.android.apps.connectmobile.settings.safetyfeatures.ui.setupwizard.e.f43912d;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    eVar.u6();
                    String strConcat = GCMSettingManager.k().b().concat("/images/activities/generic_running_person.png");
                    boolean zR = mVar2.r(eVar);
                    Object objQ = mVar2.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zR) {
                        objQ = new j(eVar, 1);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new j(eVar, 1);
                            mVar2.K(objQ);
                        }
                    }
                    e23.a aVar4 = (e23.a) objQ;
                    boolean zR2 = mVar2.r(eVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new j(eVar, 2);
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new j(eVar, 2);
                            mVar2.K(objQ2);
                        }
                    }
                    k.a(strConcat, aVar4, (e23.a) objQ2, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
