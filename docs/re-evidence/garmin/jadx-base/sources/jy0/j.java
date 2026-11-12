package jy0;

import com.garmin.android.apps.connectmobile.multidayactivities.presentation.creation.MultiDayActivitiesCreationActivity;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f101740a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MultiDayActivitiesCreationActivity f101741b;

    public /* synthetic */ j(MultiDayActivitiesCreationActivity multiDayActivitiesCreationActivity, int i14) {
        this.f101740a = i14;
        this.f101741b = multiDayActivitiesCreationActivity;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x003f  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object, o13.l] */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f101740a;
        MultiDayActivitiesCreationActivity multiDayActivitiesCreationActivity = this.f101741b;
        int i15 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i16 = MultiDayActivitiesCreationActivity.f39228b;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, true, z3.f.c(-486672289, new j(multiDayActivitiesCreationActivity, i15), mVar), mVar, 221184, 15);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i17 = MultiDayActivitiesCreationActivity.f39228b;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    l lVar = (l) multiDayActivitiesCreationActivity.f39229a.getValue();
                    boolean zR = mVar2.r(multiDayActivitiesCreationActivity);
                    Object objQ = mVar2.q();
                    if (zR) {
                        objQ = new jx0.e(multiDayActivitiesCreationActivity, 2);
                        mVar2.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new jx0.e(multiDayActivitiesCreationActivity, 2);
                            mVar2.K(objQ);
                        }
                    }
                    u.d(lVar, (e23.a) objQ, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
