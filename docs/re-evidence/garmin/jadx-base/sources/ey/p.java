package ey;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.calendar.presentation.GCMCalendarFilterActivity;
import gl1.y;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class p implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f67109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GCMCalendarFilterActivity f67110b;

    public /* synthetic */ p(GCMCalendarFilterActivity gCMCalendarFilterActivity, int i14) {
        this.f67109a = i14;
        this.f67110b = gCMCalendarFilterActivity;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x003d  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f67109a;
        GCMCalendarFilterActivity gCMCalendarFilterActivity = this.f67110b;
        int i15 = 2;
        int i16 = 1;
        switch (i14) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i17 = GCMCalendarFilterActivity.f31105a;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-223021334, new p(gCMCalendarFilterActivity, i16), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                int i18 = GCMCalendarFilterActivity.f31105a;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    z3.e eVarC = z3.f.c(-1721044731, new p(gCMCalendarFilterActivity, i15), mVar2);
                    j.f67095a.getClass();
                    z02.d.a(false, eVarC, null, null, null, j.f67096b, mVar2, 196656, 29);
                } else {
                    mVar2.e();
                }
                break;
            default:
                p3.m mVar3 = (p3.m) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                int i19 = GCMCalendarFilterActivity.f31105a;
                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    String strQ = y.Q(mVar3, R.string.lbl_filter_calendar);
                    boolean zR = mVar3.r(gCMCalendarFilterActivity);
                    Object objQ = mVar3.q();
                    if (zR) {
                        objQ = new e40.d(gCMCalendarFilterActivity, 20);
                        mVar3.K(objQ);
                    } else {
                        p3.m.f135153a.getClass();
                        if (objQ == p3.m.a.f135155b) {
                            objQ = new e40.d(gCMCalendarFilterActivity, 20);
                            mVar3.K(objQ);
                        }
                    }
                    z02.f.c(0, 54, null, (e23.a) objQ, null, strQ, mVar3, null);
                } else {
                    mVar3.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
