package o62;

import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class m0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f129717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.i f129718b;

    public /* synthetic */ m0(com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.i iVar, int i14) {
        this.f129717a = i14;
        this.f129718b = iVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f129717a;
        com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.i iVar = this.f129718b;
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (i14) {
            case 0:
                num.getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.c0(iVar, mVar, p3.p0.t(1));
                break;
            case 1:
                num.getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.b0(iVar, mVar, p3.p0.t(1));
                break;
            case 2:
                num.getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.F(iVar, mVar, p3.p0.t(1));
                break;
            case 3:
                num.getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.d0(iVar, mVar, p3.p0.t(1));
                break;
            case 4:
                num.getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.k(iVar, mVar, p3.p0.t(1));
                break;
            case 5:
                num.getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.w(iVar, mVar, p3.p0.t(1));
                break;
            case 6:
                int iIntValue = num.intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.M(iVar, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 7:
                num.getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.n(iVar, mVar, p3.p0.t(1));
                break;
            case 8:
                num.getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.T(iVar, mVar, p3.p0.t(1));
                break;
            case 9:
                num.getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.W(iVar, mVar, p3.p0.t(1));
                break;
            case 10:
                num.getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.u(iVar, mVar, p3.p0.t(1));
                break;
            case 11:
                num.getClass();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.y(iVar, mVar, p3.p0.t(1));
                break;
            default:
                int iIntValue2 = num.intValue();
                if (mVar.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.N(iVar, mVar, 0);
                    com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.u(iVar, mVar, 0);
                    com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.h.v(iVar, mVar, 0);
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ m0(com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.i iVar, int i14, int i15) {
        this.f129717a = i15;
        this.f129718b = iVar;
    }
}
