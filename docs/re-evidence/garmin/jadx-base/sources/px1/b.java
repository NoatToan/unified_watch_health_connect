package px1;

import c2.g;
import c2.k3;
import c2.l;
import c2.n3;
import c2.p3;
import c2.q3;
import com.garmin.android.apps.connectmobile.training.stp.presentation.activity.StrengthTrainingPlanDashboardActivity;
import e23.p;
import h4.r;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.x1;
import z3.f;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f141778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ StrengthTrainingPlanDashboardActivity f141779b;

    public /* synthetic */ b(StrengthTrainingPlanDashboardActivity strengthTrainingPlanDashboardActivity, int i14) {
        this.f141778a = i14;
        this.f141779b = strengthTrainingPlanDashboardActivity;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f141778a;
        StrengthTrainingPlanDashboardActivity strengthTrainingPlanDashboardActivity = this.f141779b;
        int i15 = 1;
        switch (i14) {
            case 0:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                StrengthTrainingPlanDashboardActivity.a aVar = StrengthTrainingPlanDashboardActivity.f45641h;
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, f.c(1531410073, new b(strengthTrainingPlanDashboardActivity, i15), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                StrengthTrainingPlanDashboardActivity.a aVar2 = StrengthTrainingPlanDashboardActivity.f45641h;
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    Long l14 = strengthTrainingPlanDashboardActivity.f45644g;
                    if (l14 == null) {
                        mVar2.C(1094902840);
                        mVar2.f();
                    } else {
                        mVar2.C(1094902841);
                        long jLongValue = l14.longValue();
                        r.a aVar3 = r.S;
                        int i16 = k3.f22728a;
                        g gVarD = q3.d(mVar2);
                        p3.f22815b.getClass();
                        yx1.c.a(jLongValue, l.k(aVar3, n3.d(gVarD, p3.f22823j)), null, !strengthTrainingPlanDashboardActivity.isTopNavigation(), mVar2, 0);
                        mVar2.f();
                    }
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
