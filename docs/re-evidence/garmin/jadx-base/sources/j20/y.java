package j20;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f96631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.contacts.emergency.f f96632b;

    public /* synthetic */ y(com.garmin.android.apps.connectmobile.contacts.emergency.f fVar, int i14) {
        this.f96631a = i14;
        this.f96632b = fVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0037  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f96631a;
        com.garmin.android.apps.connectmobile.contacts.emergency.f fVar = this.f96632b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.contacts.emergency.f.a aVar = com.garmin.android.apps.connectmobile.contacts.emergency.f.f32689b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(813584626, new y(fVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.contacts.emergency.f.a aVar2 = com.garmin.android.apps.connectmobile.contacts.emergency.f.f32689b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    boolean zR = mVar2.r(fVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new iz1.f(fVar, 6);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new iz1.f(fVar, 6);
                            mVar2.K(objQ);
                        }
                    }
                    fVar.u6((e23.l) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
