package qy0;

import com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity;
import e23.l;
import e23.p;
import gl1.y;
import lc.m0;
import lc.v0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f148473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiDayActivitiesEditActivity f148474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cy0.k f148475c;

    public /* synthetic */ c(MultiDayActivitiesEditActivity multiDayActivitiesEditActivity, cy0.k kVar, int i14) {
        this.f148473a = i14;
        this.f148474b = multiDayActivitiesEditActivity;
        this.f148475c = kVar;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0051  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f148473a;
        cy0.k kVar = this.f148475c;
        MultiDayActivitiesEditActivity multiDayActivitiesEditActivity = this.f148474b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                MultiDayActivitiesEditActivity.a aVar = MultiDayActivitiesEditActivity.f39291b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, true, z3.f.c(96653107, new c(multiDayActivitiesEditActivity, kVar, i15), mVar), mVar, 221184, 15);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                MultiDayActivitiesEditActivity.a aVar2 = MultiDayActivitiesEditActivity.f39291b;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    m0 m0VarI = y.I(new v0[0], mVar2);
                    com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.a.e eVar = com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.a.e.INSTANCE;
                    boolean zR = mVar2.r(multiDayActivitiesEditActivity) | mVar2.r(m0VarI) | mVar2.r(kVar);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new p90.h(multiDayActivitiesEditActivity, 20, m0VarI, kVar);
                        mVar2.K(objQ);
                    } else {
                        m.f135153a.getClass();
                        if (objQ == m.a.f135155b) {
                            objQ = new p90.h(multiDayActivitiesEditActivity, 20, m0VarI, kVar);
                            mVar2.K(objQ);
                        }
                    }
                    nc.y.a(m0VarI, eVar, null, null, null, null, null, null, null, (l) objQ, mVar2, 48, 2044);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
