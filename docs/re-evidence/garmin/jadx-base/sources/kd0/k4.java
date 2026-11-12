package kd0;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.dashboard.presentation.DashboardActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.MenstrualCycleDetailsActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.NaturalCyclesLearnMoreActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleReminderSettingsActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleSettingsActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.reminders.MenstrualCycleReminders;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.base.PregnancyDetailsActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.logdelivery.PregnancyLogDeliveryDateActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.reminders.list.PregnancyRemindersActivity;
import com.garmin.android.apps.connectmobile.pregnancytracking.ui.setup.PregnancySetupGenesisActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import java.util.ArrayList;
import java.util.Calendar;
import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkd0/k4;", "Lax0/a;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class k4 implements ax0.a {
    @Override // ax0.a
    public final Object A(LocalDate localDate, ww0.b bVar, hx0.a0 a0Var) {
        com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a.getClass();
        return com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.m(localDate, bVar, a0Var);
    }

    @Override // ax0.a
    public final Object B(v13.c cVar) {
        com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a.getClass();
        return com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.i(cVar);
    }

    @Override // ax0.a
    public final void C(Context context, LocalDate localDate, boolean z14, db1.m mVar) {
        PregnancyDetailsActivity.a aVar = PregnancyDetailsActivity.f40489x;
        tb1.e.f163745a.getClass();
        boolean zH = tb1.e.a.h();
        DateTime dateTimeAtStartOfDay = localDate.toDateTimeAtStartOfDay();
        aVar.getClass();
        context.startActivity(PregnancyDetailsActivity.a.a(context, false, zH, dateTimeAtStartOfDay, z14, mVar, false));
    }

    @Override // ax0.a
    public final Object D(LocalDate localDate, hx0.v vVar) {
        com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a.getClass();
        return com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.e(localDate, vVar);
    }

    @Override // ax0.a
    public final long a(UserSettingsDTO userSettingsDTO, JSONObject jSONObject, com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<?> interfaceC0995b) {
        userSettingsDTO.getClass();
        jSONObject.getClass();
        interfaceC0995b.getClass();
        return cw.q.N().O(userSettingsDTO, jSONObject, interfaceC0995b);
    }

    @Override // ax0.a
    public final boolean c() {
        return com.garmin.android.apps.connectmobile.k1.f37122a.c();
    }

    @Override // ax0.a
    public final boolean d() {
        return com.garmin.android.apps.connectmobile.k1.f37122a.d();
    }

    @Override // ax0.a
    public final UserSettingsDTO getUserSettings() {
        return GCMSettingManager.s();
    }

    @Override // ax0.a
    public final long i(com.garmin.android.library.backgroundtaskmanagement.b.InterfaceC0995b<?> interfaceC0995b) {
        interfaceC0995b.getClass();
        return cw.q.N().M(interfaceC0995b);
    }

    @Override // ax0.a
    public final boolean k() {
        return com.garmin.android.apps.connectmobile.k1.f37122a.k();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // ax0.a
    public final Integer l(int i14) {
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.u uVar;
        com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.u.f40867g.getClass();
        int i15 = i14 - 1;
        if (i15 < 40) {
            try {
                uVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.u.values()[i15];
                if (uVar.f40869a != i14) {
                    uVar = null;
                }
            } catch (Exception unused) {
            }
        } else {
            uVar = null;
        }
        if (uVar != null) {
            return uVar.f40871c;
        }
        return null;
    }

    @Override // ax0.a
    public final void m(Context context) {
        context.getClass();
        NaturalCyclesLearnMoreActivity.f38818a.getClass();
        context.startActivity(new Intent(context, (Class<?>) NaturalCyclesLearnMoreActivity.class));
    }

    @Override // ax0.a
    public final jx0.g n(ww0.k kVar, boolean z14) {
        jx0.g.E.getClass();
        jx0.g gVar = new jx0.g();
        jx0.a.C1950a c1950a = jx0.a.f101397n;
        if (kVar == null) {
            z14 = false;
        }
        c1950a.getClass();
        Bundle bundle = new Bundle();
        bundle.putParcelable("AbstractMenstrualCycleReportFragmentReport", kVar);
        bundle.putBoolean("AbstractMenstrualCycleReportFragmentLoading", z14);
        bundle.putString("AbstractMenstrualCycleReportFragmentCycleReportState", "CYCLE_REPORT_1");
        com.garmin.android.apps.connectmobile.l2.f37135b.getClass();
        com.garmin.android.apps.connectmobile.l2.a.c(gVar, bundle);
        return gVar;
    }

    @Override // ax0.a
    public final void o(androidx.fragment.app.m mVar) {
        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
        Intent intent = new Intent(mVar, (Class<?>) DashboardActivity.class);
        intent.addFlags(335544320);
        if (mVar != null) {
            mVar.startActivity(intent);
        }
    }

    @Override // ax0.a
    public final Object p(lx0.h hVar) {
        com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a;
        tb1.e.f163745a.getClass();
        String string = new LocalDate(Calendar.getInstance()).toString();
        string.getClass();
        bVar.getClass();
        return com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.f(string, hVar);
    }

    @Override // ax0.a
    public final void q(MenstrualCycleReminderSettingsActivity menstrualCycleReminderSettingsActivity) {
        MenstrualCycleReminders.f39205a.getClass();
        MenstrualCycleReminders.a.f(menstrualCycleReminderSettingsActivity);
    }

    @Override // ax0.a
    public final void r(MenstrualCycleDetailsActivity menstrualCycleDetailsActivity) {
        PregnancyLogDeliveryDateActivity.f40875e.getClass();
        menstrualCycleDetailsActivity.startActivity(new Intent(menstrualCycleDetailsActivity, (Class<?>) PregnancyLogDeliveryDateActivity.class));
    }

    @Override // ax0.a
    public final Object s(String str, db1.m mVar, v13.c cVar) {
        com.garmin.android.apps.connectmobile.pregnancytracking.network.d.f40430a.getClass();
        return com.garmin.android.apps.connectmobile.pregnancytracking.network.d.b.q(str, mVar, cVar);
    }

    @Override // ax0.a
    public final Intent t(MenstrualCycleDetailsActivity menstrualCycleDetailsActivity) {
        MenstrualCycleSettingsActivity.a aVar = MenstrualCycleSettingsActivity.f39030c;
        aVar.getClass();
        return MenstrualCycleSettingsActivity.a.a(aVar, menstrualCycleDetailsActivity, null, false, false, false, 48);
    }

    @Override // ax0.a
    public final void u(Context context) {
        yx0.b.a(context);
    }

    @Override // ax0.a
    public final void v(androidx.fragment.app.m mVar) {
        PregnancySetupGenesisActivity.f40944a.getClass();
        mVar.startActivity(new Intent(mVar, (Class<?>) PregnancySetupGenesisActivity.class));
    }

    @Override // ax0.a
    public final void w(MenstrualCycleDetailsActivity menstrualCycleDetailsActivity) {
        PregnancyRemindersActivity.f40928d.getClass();
        menstrualCycleDetailsActivity.startActivity(new Intent(menstrualCycleDetailsActivity, (Class<?>) PregnancyRemindersActivity.class));
    }

    @Override // ax0.a
    public final void x() {
        ((b31.f) KoinJavaComponent.get$default(b31.f.class, null, null, 6, null)).b(e31.a.ENTERED_MENSTRUAL_CYCLE_TRACKING);
    }

    @Override // ax0.a
    public final void y(Context context) {
        com.garmin.android.apps.connectmobile.navigation.b.f39357a.getClass();
        Intent intent = new Intent(context, (Class<?>) DashboardActivity.class);
        intent.addFlags(67108864);
        z6.h0 h0VarE = z6.h0.e(context);
        ArrayList<Intent> arrayList = h0VarE.f202637a;
        arrayList.add(intent);
        arrayList.add(MenstrualCycleDetailsActivity.a.b(MenstrualCycleDetailsActivity.f38784t, context, false, null, 30));
        h0VarE.g();
    }

    @Override // ax0.a
    public final void z(MenstrualCycleReminderSettingsActivity menstrualCycleReminderSettingsActivity) {
        MenstrualCycleReminders.f39205a.getClass();
        MenstrualCycleReminders.a.b(menstrualCycleReminderSettingsActivity);
    }
}
