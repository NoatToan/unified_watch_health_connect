package g62;

import p005kotlin.Unit;
import p3.x1;
import w52.s0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class e implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76073a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.data.model.a f76074b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b f76075c;

    public /* synthetic */ e(com.garmin.android.apps.connectmobile.workouts.data.model.a aVar, com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar, int i14) {
        this.f76073a = i14;
        this.f76074b = aVar;
        this.f76075c = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:19:0x005c  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f76073a;
        com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b bVar = this.f76075c;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(129685754, new e(this.f76074b, bVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.edit.multisports.b.f49107t;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    String str = bVar.w6().f182503c;
                    boolean zR = mVar2.r(bVar);
                    Object objQ = mVar2.q();
                    p3.m.a aVar3 = p3.m.f135153a;
                    if (zR) {
                        objQ = new o(bVar);
                        mVar2.K(objQ);
                    } else {
                        aVar3.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new o(bVar);
                            mVar2.K(objQ);
                        }
                    }
                    e23.q qVar = (e23.q) ((k23.g) objQ);
                    boolean zR2 = mVar2.r(bVar);
                    Object objQ2 = mVar2.q();
                    if (zR2) {
                        objQ2 = new h(bVar, 0);
                        mVar2.K(objQ2);
                    } else {
                        aVar3.getClass();
                        if (objQ2 == p3.m.a.f135155b) {
                            objQ2 = new h(bVar, 0);
                            mVar2.K(objQ2);
                        }
                    }
                    s0.c(this.f76074b, str, qVar, (e23.p) objQ2, mVar2, com.garmin.android.apps.connectmobile.workouts.data.model.a.f48070d);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
