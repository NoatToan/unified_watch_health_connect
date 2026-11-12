package i62;

import com.garmin.android.apps.connectmobile.R;
import gl1.y;
import h4.r;
import l72.s;
import p005kotlin.Unit;
import p3.x1;
import v62.m2;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f91850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.msn.b f91851b;

    public /* synthetic */ h(com.garmin.android.apps.connectmobile.workouts.presentation.msn.b bVar, int i14) {
        this.f91850a = i14;
        this.f91851b = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x006a  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f91850a;
        com.garmin.android.apps.connectmobile.workouts.presentation.msn.b bVar = this.f91851b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.workouts.presentation.msn.b.a aVar = com.garmin.android.apps.connectmobile.workouts.presentation.msn.b.f49484x;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(1708734111, new h(bVar, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.workouts.presentation.msn.b.a aVar2 = com.garmin.android.apps.connectmobile.workouts.presentation.msn.b.f49484x;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    s sVar = s.f111232a;
                    r.a aVar3 = r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    r rVarY = c2.l.y(aVar3, j92.b.f97899b.f97920e);
                    s62.a.f157643a.getClass();
                    u4.d dVarA = m2.a(t62.b.f162798a);
                    String strQ = y.Q(mVar2, R.string.msn_workouts_incompatible_device_banner_title);
                    String strQ2 = y.Q(mVar2, R.string.msn_workouts_incompatible_device_banner_msg);
                    boolean zR = mVar2.r(bVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new i(bVar, 2);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new i(bVar, 2);
                            mVar2.K(objQ);
                        }
                    }
                    sVar.c(rVarY, dVarA, null, null, strQ, strQ2, null, false, (e23.a) objQ, null, mVar2, 0, 0, 1484);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
