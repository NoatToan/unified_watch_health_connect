package pk1;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.room.a0;
import aq.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.help.HelpActivity;
import com.garmin.android.apps.connectmobile.hydration.presentation.settings.HydrationSettingsActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.usersettings.accessibility.WheelchairModeActivity;
import com.garmin.android.apps.connectmobile.settings.view.GCMSettingsItemView;
import com.garmin.android.apps.connectmobile.weather.defaultlocation.WeatherLocationPreferenceActivity;
import com.garmin.android.lib.legal.LegalGatewayActivity;
import gg1.o0;
import java.util.ArrayList;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class r implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u f138311b;

    public /* synthetic */ r(u uVar, int i14) {
        this.f138310a = i14;
        this.f138311b = uVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f138310a;
        u uVar = this.f138311b;
        switch (i14) {
            case 0:
                u.a aVar = u.E;
                WheelchairModeActivity.a aVar2 = WheelchairModeActivity.f44027a;
                Context contextRequireContext = uVar.requireContext();
                contextRequireContext.getClass();
                aVar2.getClass();
                a0.r(contextRequireContext, WheelchairModeActivity.class);
                return;
            case 1:
                u.a aVar3 = u.E;
                HelpActivity.a.e(HelpActivity.f36653a, uVar.requireContext(), ro0.l.USER_SETTINGS, "UNITS", null, 8);
                return;
            case 2:
                u.a aVar4 = u.E;
                Context contextRequireContext2 = uVar.requireContext();
                contextRequireContext2.getClass();
                new z22.a(contextRequireContext2, true, new w(uVar));
                return;
            case 3:
                u.a aVar5 = u.E;
                o0[] o0VarArrValues = o0.values();
                androidx.appcompat.app.e.a title = new androidx.appcompat.app.e.a(uVar.requireContext()).setTitle(R.string.pref_measurement_units);
                ArrayList arrayList = new ArrayList(o0VarArrValues.length);
                for (o0 o0Var : o0VarArrValues) {
                    arrayList.add(uVar.getString(o0Var.f77292b));
                }
                title.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), p13.u.M(o0VarArrValues, uVar.B.g()), new hg1.g(29, o0VarArrValues, uVar)).setNegativeButton(R.string.lbl_cancel, new mt0.y(15)).create().show();
                return;
            case 4:
                u.a aVar6 = u.E;
                Context contextRequireContext3 = uVar.requireContext();
                contextRequireContext3.getClass();
                new j42.b(contextRequireContext3, 0.0d, false, false, 0, 0, 0, 0, (j42.b.InterfaceC1852b) new s(uVar), 254, (p005kotlin.jvm.internal.j) null);
                return;
            case 5:
                uVar.B.K1(0.0d);
                GCMSettingsItemView gCMSettingsItemView = uVar.f138322g;
                if (gCMSettingsItemView != null) {
                    gCMSettingsItemView.setSummary(uVar.G6(0.0d));
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("weightView");
                    throw null;
                }
            case 6:
                u.a aVar7 = u.E;
                HelpActivity.a.e(HelpActivity.f36653a, uVar.requireContext(), ro0.l.USER_SETTINGS, "DISPLAY_PREFERENCES", null, 8);
                return;
            case 7:
                u.a aVar8 = u.E;
                androidx.fragment.app.m mVarRequireActivity = uVar.requireActivity();
                MenstrualCycleSettingsActivity.a aVar9 = MenstrualCycleSettingsActivity.f39030c;
                androidx.fragment.app.m mVarRequireActivity2 = uVar.requireActivity();
                mVarRequireActivity2.getClass();
                UserSettingsDTO userSettingsDTOS = GCMSettingManager.s();
                aVar9.getClass();
                mVarRequireActivity.startActivity(MenstrualCycleSettingsActivity.a.a(aVar9, mVarRequireActivity2, userSettingsDTOS, false, false, false, 48));
                return;
            case 8:
                u.a aVar10 = u.E;
                new com.garmin.android.apps.connectmobile.settings.d(uVar.requireContext(), new s(uVar));
                return;
            case 9:
                uVar.B.U2(-1.0f);
                GCMSettingsItemView gCMSettingsItemView2 = uVar.f138321f;
                if (gCMSettingsItemView2 != null) {
                    gCMSettingsItemView2.setSummary(uVar.F6(-1.0f));
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("heightView");
                    throw null;
                }
            case 10:
                u.a aVar11 = u.E;
                String[] strArr = new String[12];
                strArr[0] = uVar.A6(-1);
                for (int i15 = 1; i15 < 12; i15++) {
                    strArr[i15] = uVar.A6(i15 - 1);
                }
                rk1.b.e eVar = new rk1.b.e(uVar.requireContext());
                eVar.h(strArr, false);
                String string = uVar.getString(R.string.lbl_activity_class);
                rk1.b.d dVar = eVar.f153344b;
                dVar.f153346b = string;
                eVar.e(0);
                eVar.d(11);
                eVar.c(Integer.valueOf(uVar.B.e2() + 1));
                dVar.f153345a = 1;
                eVar.f(new z(uVar, 3));
                eVar.a();
                return;
            case 11:
                u.a aVar12 = u.E;
                WeatherLocationPreferenceActivity.a aVar13 = WeatherLocationPreferenceActivity.f47895d;
                androidx.fragment.app.m mVarRequireActivity3 = uVar.requireActivity();
                mVarRequireActivity3.getClass();
                aVar13.getClass();
                mVarRequireActivity3.startActivity(new Intent(mVarRequireActivity3, (Class<?>) WeatherLocationPreferenceActivity.class));
                return;
            case 12:
                u.a aVar14 = u.E;
                new gg1.b(uVar.requireContext(), new v(uVar));
                return;
            case 13:
                uVar.B.B1(null);
                GCMSettingsItemView gCMSettingsItemView3 = uVar.f138318c;
                if (gCMSettingsItemView3 == null) {
                    p005kotlin.jvm.internal.s.m("dateOfBirthView");
                    throw null;
                }
                gCMSettingsItemView3.setSummary(uVar.C6(null));
                uVar.u6();
                return;
            case 14:
                u.a aVar15 = u.E;
                Context contextRequireContext4 = uVar.requireContext();
                contextRequireContext4.getClass();
                new z22.a(contextRequireContext4, false, new x(uVar));
                return;
            case 15:
                u.a aVar16 = u.E;
                HelpActivity.a.e(HelpActivity.f36653a, uVar.requireContext(), ro0.l.USER_SETTINGS, "SLEEP", null, 8);
                return;
            case 16:
                u.a aVar17 = u.E;
                LegalGatewayActivity.a aVar18 = LegalGatewayActivity.f49928n;
                androidx.fragment.app.m mVarRequireActivity4 = uVar.requireActivity();
                mVarRequireActivity4.getClass();
                LegalGatewayActivity.a.b(aVar18, mVarRequireActivity4, 0, lc2.a.GARMIN_CONNECT_PRIVACY_POLICY, ((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f(), false, null, false, uVar.getString(R.string.txt_privacy_policy), 112);
                return;
            case 17:
                u.a aVar19 = u.E;
                HelpActivity.a.e(HelpActivity.f36653a, uVar.requireContext(), ro0.l.USER_SETTINGS, "PERSONAL_INFORMATION", null, 8);
                return;
            case 18:
                yk1.a aVar20 = uVar.D;
                if (aVar20 != null) {
                    aVar20.q0();
                    return;
                }
                return;
            default:
                u.a aVar21 = u.E;
                HydrationSettingsActivity.a aVar22 = HydrationSettingsActivity.f36708c;
                androidx.fragment.app.m activity = uVar.getActivity();
                aVar22.getClass();
                if (activity != null) {
                    activity.startActivityForResult(new Intent(activity, (Class<?>) HydrationSettingsActivity.class), 70);
                    return;
                }
                return;
        }
    }
}
