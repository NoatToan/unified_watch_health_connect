package tr2;

import java.util.List;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class w implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.feature.garminpay.ui.userwallet.e f166184b;

    public /* synthetic */ w(com.garmin.feature.garminpay.ui.userwallet.e eVar, int i14) {
        this.f166183a = i14;
        this.f166184b = eVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0039  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f166183a;
        com.garmin.feature.garminpay.ui.userwallet.e eVar = this.f166184b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.feature.garminpay.ui.userwallet.e.a aVar = com.garmin.feature.garminpay.ui.userwallet.e.f52303k;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1085538402, new w(eVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.feature.garminpay.ui.userwallet.e.a aVar2 = com.garmin.feature.garminpay.ui.userwallet.e.f52303k;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    List<vr2.q> list = eVar.f52305a;
                    boolean zR = mVar2.r(eVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new tn2.t(eVar, 8);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new tn2.t(eVar, 8);
                            mVar2.K(objQ);
                        }
                    }
                    ur2.a.a(list, (e23.l) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
