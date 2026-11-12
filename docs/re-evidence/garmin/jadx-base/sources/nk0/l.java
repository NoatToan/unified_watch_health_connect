package nk0;

import com.garmin.android.apps.connectmobile.gear.presentation.GearActivity;
import com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.MultiDayActivitiesEditActivity;
import com.garmin.android.apps.connectmobile.settings.devices.backup.DeviceBackupActivity;
import com.garmin.android.apps.connectmobile.sleep.presentation.SleepReportsActivity;
import com.garmin.android.apps.connectmobile.weighttracker.presentation.WeightReportsActivity;
import lc.m0;
import lc.y;
import ot1.n;
import ot1.u;
import ot1.v;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ m0 f126406b;

    public /* synthetic */ l(m0 m0Var, int i14) {
        this.f126405a = i14;
        this.f126406b = m0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f126405a;
        int i15 = 1;
        ro0.i iVar = null;
        Object[] objArr = 0;
        m0 m0Var = this.f126406b;
        switch (i14) {
            case 0:
                GearActivity.a aVar = GearActivity.f35500b;
                m0Var.n();
                break;
            case 1:
                fy1.c.f73884a.getClass();
                fy1.c.b("GarminCoachTermsAndConditionsDeclined");
                m0Var.n();
                break;
            case 2:
                ot1.e eVar = ot1.e.f133785a;
                y.k(n.f133806a.d(), m0Var);
                break;
            case 3:
                ot1.e eVar2 = ot1.e.f133785a;
                y.k(ot1.g.f133790a.d(), m0Var);
                break;
            case 4:
                n nVar = n.f133806a;
                y.k(ot1.m.f133805a.d(), m0Var);
                break;
            case 5:
                u uVar = u.f133824a;
                y.k(v.f133840a.d(), m0Var);
                break;
            case 6:
                DeviceBackupActivity.a aVar2 = DeviceBackupActivity.f42558c;
                y.k("allBackups", m0Var);
                break;
            case 7:
                int i16 = WeightReportsActivity.f47991a;
                y.k("EDIT_WEIGHT_GOAL_ROUTE", m0Var);
                break;
            case 8:
                m0Var.getClass();
                y.l(m0Var, new qn0.k(iVar, i15, (p005kotlin.jvm.internal.j) (objArr == true ? 1 : 0)));
                break;
            case 9:
                m0Var.getClass();
                y.l(m0Var, qn0.n.INSTANCE);
                break;
            case 10:
                m0Var.getClass();
                y.l(m0Var, new qn0.k(new ro0.i(ro0.l.HEALTH_STATUS, "ABOUT_YOUR_STATUS")));
                break;
            case 11:
                m0Var.getClass();
                y.l(m0Var, qn0.j.INSTANCE);
                break;
            case 12:
                m0Var.getClass();
                y.l(m0Var, new qn0.k(new ro0.i(ro0.l.HEALTH_STATUS, "HRV")));
                break;
            case 13:
                m0Var.n();
                break;
            case 14:
                MultiDayActivitiesEditActivity.a aVar3 = MultiDayActivitiesEditActivity.f39291b;
                y.l(m0Var, com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.a.c.INSTANCE);
                break;
            case 15:
                MultiDayActivitiesEditActivity.a aVar4 = MultiDayActivitiesEditActivity.f39291b;
                y.l(m0Var, com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.a.f.INSTANCE);
                break;
            case 16:
                MultiDayActivitiesEditActivity.a aVar5 = MultiDayActivitiesEditActivity.f39291b;
                y.l(m0Var, com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.a.C0701a.INSTANCE);
                break;
            case 17:
                MultiDayActivitiesEditActivity.a aVar6 = MultiDayActivitiesEditActivity.f39291b;
                y.l(m0Var, com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.a.e.INSTANCE);
                break;
            case 18:
                MultiDayActivitiesEditActivity.a aVar7 = MultiDayActivitiesEditActivity.f39291b;
                y.l(m0Var, com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.a.C0701a.INSTANCE);
                break;
            case 19:
                MultiDayActivitiesEditActivity.a aVar8 = MultiDayActivitiesEditActivity.f39291b;
                y.l(m0Var, com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.a.e.INSTANCE);
                break;
            case 20:
                MultiDayActivitiesEditActivity.a aVar9 = MultiDayActivitiesEditActivity.f39291b;
                y.l(m0Var, com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.a.e.INSTANCE);
                break;
            case 21:
                MultiDayActivitiesEditActivity.a aVar10 = MultiDayActivitiesEditActivity.f39291b;
                y.l(m0Var, com.garmin.android.apps.connectmobile.multidayactivities.presentation.edit.a.c.INSTANCE);
                break;
            case 22:
                SleepReportsActivity.a aVar11 = SleepReportsActivity.f44239b;
                m0Var.m();
                break;
            case 23:
                SleepReportsActivity.a aVar12 = SleepReportsActivity.f44239b;
                sn1.b.f160414a.getClass();
                y.l(m0Var, new com.garmin.android.apps.connectmobile.sleep.presentation.b((com.garmin.android.apps.connectmobile.sleep.presentation.a.b) null, new ro0.i(ro0.l.SLEEP_ENHANCED, "DATA_ACCURACY_ACTION"), 1, (p005kotlin.jvm.internal.j) null));
                break;
            case 24:
                SleepReportsActivity.a aVar13 = SleepReportsActivity.f44239b;
                y.l(m0Var, sm1.k.INSTANCE);
                break;
            case 25:
                y.k(u72.d.b.f169455b.f169453a, m0Var);
                break;
            case 26:
                y.k(u72.d.c.f169456b.f169453a, m0Var);
                break;
            case 27:
                m0Var.n();
                break;
            case 28:
                y.l(m0Var, vg2.a.e.INSTANCE);
                break;
            default:
                y.l(m0Var, vg2.a.g.INSTANCE);
                break;
        }
        return Unit.INSTANCE;
    }
}
