package mt0;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.view.View;
import androidx.navigation.fragment.NavHostFragment;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.stats.exercises.NewSelectExerciseActivity;
import com.garmin.android.apps.connectmobile.activities.stats.rounds.edit.EditExerciseSetActivity;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.forceupdate.ForceUpdateActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.BadgeChallengeRedeemActivity;
import com.garmin.android.apps.connectmobile.leaderboard.challenges.ChallengePromoCodeView;
import com.garmin.android.apps.connectmobile.leaderboard.model.AdHocChallengeDTO;
import com.garmin.android.apps.connectmobile.settings.devices.AlarmsSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.CreateEditDeviceAlarmActivity;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.FenixChronosDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.FenixChronosNotificationsAndAlertsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.Forerunner935DeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.MultipleAlarmsSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.TimeDateSystemDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.VivoactiveDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.Vivofit2DeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.Vivofit2DeviceSettingsScreensDefault;
import com.garmin.android.apps.connectmobile.settings.devices.VivofitDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.Vivosmart3CreateEditDeviceAlarmActivity;
import com.garmin.android.apps.connectmobile.settings.devices.VivosmartDeviceSettingsOrientation;
import com.garmin.android.apps.connectmobile.settings.devices.WeatherLocationSettings;
import com.garmin.android.apps.connectmobile.settings.devices.wifi.GCMWiFiNetworksActivity;
import org.koin.java.KoinJavaComponent;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f120638a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f120639b;

    public /* synthetic */ h0(Object obj, int i14) {
        this.f120638a = i14;
        this.f120639b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        t tVarY;
        int i14 = this.f120638a;
        int i15 = 0;
        Object obj = this.f120639b;
        switch (i14) {
            case 0:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.l.b bVar = com.garmin.android.apps.connectmobile.leaderboard.challenges.l.f37644h;
                ((com.garmin.android.apps.connectmobile.leaderboard.challenges.l) obj).A6();
                return;
            case 1:
                v1 v1Var = ((com.garmin.android.apps.connectmobile.leaderboard.challenges.m) obj).f37671b;
                if (v1Var != null) {
                    v1Var.k1();
                    return;
                }
                return;
            case 2:
                BadgeChallengeRedeemActivity badgeChallengeRedeemActivity = (BadgeChallengeRedeemActivity) obj;
                BadgeChallengeRedeemActivity.a aVar = BadgeChallengeRedeemActivity.f37213i;
                com.garmin.android.apps.connectmobile.a2 a2Var = com.garmin.android.apps.connectmobile.a2.CHALLENGES;
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var, "BadgeChallengeRedeemActivity", "Shop Now pressed!");
                badgeChallengeRedeemActivity.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(badgeChallengeRedeemActivity.f37221h)));
                return;
            case 3:
                ChallengePromoCodeView.a aVar2 = ((ChallengePromoCodeView) obj).f37224c;
                if (aVar2 != null) {
                    aVar2.E();
                    return;
                }
                return;
            case 4:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.a aVar3 = com.garmin.android.apps.connectmobile.leaderboard.challenges.h0.f37562o;
                pt0.f0.b bVar2 = (pt0.f0.b) ((com.garmin.android.apps.connectmobile.g3) obj).f35301b;
                if (bVar2 != null) {
                    bVar2.f140671b.invoke();
                    return;
                }
                return;
            case 5:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.i0 i0Var = (com.garmin.android.apps.connectmobile.leaderboard.challenges.i0) obj;
                androidx.lifecycle.w1 w1Var = i0Var.f37605a;
                hi0.a aVar4 = i0Var.f37609e;
                if (aVar4 != null && (tVarY = gl1.d.Y(aVar4, true, false)) != null) {
                    ((zt0.a) w1Var.getValue()).y4(p13.w.c(tVarY));
                }
                zt0.a aVar5 = (zt0.a) w1Var.getValue();
                AdHocChallengeDTO adHocChallengeDTO = aVar5.f206931b;
                Context contextRequireContext = i0Var.requireContext();
                contextRequireContext.getClass();
                com.garmin.android.apps.connectmobile.leaderboard.model.s sVar = i0Var.f37608d;
                if (sVar != null) {
                    adHocChallengeDTO.f37989c = sVar.f38319a;
                    adHocChallengeDTO.f37990d = contextRequireContext.getString(com.garmin.android.apps.connectmobile.leaderboard.model.s.a(sVar));
                    adHocChallengeDTO.f37991e = contextRequireContext.getString(com.garmin.android.apps.connectmobile.leaderboard.model.s.a(sVar));
                    if (adHocChallengeDTO.f38001o.isEmpty()) {
                        aVar5.f206937h.j(Boolean.FALSE);
                        return;
                    } else {
                        aVar5.f206939j.j(Boolean.FALSE);
                        return;
                    }
                }
                return;
            case 6:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.o0 o0Var = (com.garmin.android.apps.connectmobile.leaderboard.challenges.o0) obj;
                o0Var.F = true;
                o0Var.p7();
                o0Var.e7(1);
                return;
            case 7:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.w0 w0Var = (com.garmin.android.apps.connectmobile.leaderboard.challenges.w0) obj;
                z10.i3 i3Var = (z10.i3) w0Var.Z.getValue();
                Context contextRequireContext2 = w0Var.requireContext();
                contextRequireContext2.getClass();
                i3Var.x4(contextRequireContext2, false, new a4(w0Var, i15));
                return;
            case 8:
                mh1.i iVar = ((com.garmin.android.apps.connectmobile.userprofile.editimage.c) obj).f46672o;
                if (iVar != null) {
                    iVar.invoke();
                    return;
                }
                return;
            case 9:
                int i16 = n12.n0.a.f122272d;
                ((n12.n0) obj).f122268a.F0(null);
                return;
            case 10:
                ((nf0.a) obj).u6();
                return;
            case 11:
                int i17 = nf0.z.f125870h;
                ((nf0.z) obj).E6();
                return;
            case 12:
                int i18 = nf0.b0.f125773c;
                z10.i3 i3Var2 = (z10.i3) ((nf0.b0) obj).f125774b.getValue();
                int i19 = z10.i3.f201047d;
                i3Var2.x4(null, false, null);
                return;
            case 13:
                AlarmsSettingsActivity alarmsSettingsActivity = (AlarmsSettingsActivity) obj;
                AlarmsSettingsActivity.a aVar6 = AlarmsSettingsActivity.f41854n;
                CreateEditDeviceAlarmActivity.a aVar7 = CreateEditDeviceAlarmActivity.f41935r;
                boolean z14 = alarmsSettingsActivity.f41864j;
                zb0.u0 u0Var = alarmsSettingsActivity.f41867m;
                Boolean bool = alarmsSettingsActivity.f41866l;
                aVar7.getClass();
                CreateEditDeviceAlarmActivity.a.a(alarmsSettingsActivity, -1, null, z14, u0Var, bool);
                return;
            case 14:
                ng1.t tVar = (ng1.t) obj;
                Long l14 = tVar.f126009a;
                if (l14 != null) {
                    g22.e.i(tVar, ((zb0.d0) KoinJavaComponent.get$default(zb0.d0.class, null, null, 6, null)).r(l14.longValue()));
                    return;
                }
                return;
            case 15:
                FenixChronosDeviceSettings fenixChronosDeviceSettings = (FenixChronosDeviceSettings) obj;
                int i24 = FenixChronosDeviceSettings.T;
                DeviceSettingsDTO deviceSettingsDTO = fenixChronosDeviceSettings.f125985k;
                zb0.u0 u0Var2 = fenixChronosDeviceSettings.f125980f;
                String str = fenixChronosDeviceSettings.f125949q;
                FenixChronosNotificationsAndAlertsActivity.f42059e.getClass();
                deviceSettingsDTO.getClass();
                u0Var2.getClass();
                Intent intent = new Intent(fenixChronosDeviceSettings, (Class<?>) FenixChronosNotificationsAndAlertsActivity.class);
                intent.putExtra("GCM_deviceSettings", deviceSettingsDTO);
                intent.putExtra("GCM_deviceEnumValue", u0Var2);
                intent.putExtra("GCM_deviceName", str);
                fenixChronosDeviceSettings.startActivityForResult(intent, 10);
                return;
            case 16:
                Forerunner935DeviceSettings forerunner935DeviceSettings = (Forerunner935DeviceSettings) obj;
                int i25 = Forerunner935DeviceSettings.f42118y;
                long j8 = forerunner935DeviceSettings.f125976b;
                String str2 = forerunner935DeviceSettings.f125978d;
                String str3 = forerunner935DeviceSettings.f125949q;
                int iKa = forerunner935DeviceSettings.ka();
                GCMWiFiNetworksActivity.a aVar8 = GCMWiFiNetworksActivity.f43245f;
                aVar8.getClass();
                if (GCMWiFiNetworksActivity.a.e(j8) || GCMWiFiNetworksActivity.a.f(str2)) {
                    forerunner935DeviceSettings.startActivity(GCMWiFiNetworksActivity.a.a(forerunner935DeviceSettings, j8, str2, str3, iKa));
                    return;
                } else {
                    GCMWiFiNetworksActivity.a.c(aVar8, forerunner935DeviceSettings);
                    return;
                }
            case 17:
                MultipleAlarmsSettingsActivity multipleAlarmsSettingsActivity = (MultipleAlarmsSettingsActivity) obj;
                MultipleAlarmsSettingsActivity.a aVar9 = MultipleAlarmsSettingsActivity.f42152i;
                Vivosmart3CreateEditDeviceAlarmActivity.a aVar10 = Vivosmart3CreateEditDeviceAlarmActivity.f42315o;
                boolean z15 = multipleAlarmsSettingsActivity.f42159g;
                aVar10.getClass();
                Intent intent2 = new Intent(multipleAlarmsSettingsActivity, (Class<?>) Vivosmart3CreateEditDeviceAlarmActivity.class);
                intent2.putExtra("extras_device_alarm", (Parcelable) null);
                intent2.putExtra("extras_alarm_id", -1);
                intent2.putExtra("extras_twelve_hour_format", z15);
                multipleAlarmsSettingsActivity.startActivityForResult(intent2, 101);
                return;
            case 18:
                VivoactiveDeviceSettings vivoactiveDeviceSettings = (VivoactiveDeviceSettings) obj;
                int i26 = VivoactiveDeviceSettings.f42206x;
                TimeDateSystemDeviceSettings.ca(vivoactiveDeviceSettings, vivoactiveDeviceSettings.f125985k);
                return;
            case 19:
                Vivofit2DeviceSettings vivofit2DeviceSettings = (Vivofit2DeviceSettings) obj;
                int i27 = Vivofit2DeviceSettings.F;
                DeviceSettingsDTO deviceSettingsDTO2 = vivofit2DeviceSettings.f125985k;
                Intent intent3 = new Intent(vivofit2DeviceSettings, (Class<?>) Vivofit2DeviceSettingsScreensDefault.class);
                intent3.putExtra("GCM_deviceSettings", deviceSettingsDTO2);
                vivofit2DeviceSettings.startActivityForResult(intent3, 10);
                return;
            case 20:
                VivofitDeviceSettings vivofitDeviceSettings = (VivofitDeviceSettings) obj;
                int i28 = VivofitDeviceSettings.B;
                DeviceUserSettingsActivity.fa(vivofitDeviceSettings, vivofitDeviceSettings.f125976b, vivofitDeviceSettings.f125978d);
                return;
            case 21:
                VivosmartDeviceSettingsOrientation vivosmartDeviceSettingsOrientation = (VivosmartDeviceSettingsOrientation) obj;
                vivosmartDeviceSettingsOrientation.f42388p = true;
                vivosmartDeviceSettingsOrientation.ca();
                return;
            case 22:
                WeatherLocationSettings weatherLocationSettings = (WeatherLocationSettings) obj;
                int i29 = WeatherLocationSettings.f42487g;
                j22.b.f96736a.getClass();
                if (j22.b.j(weatherLocationSettings) == j22.f.ALLOWED_ALL_TIME) {
                    com.garmin.android.apps.connectmobile.i2.a(com.garmin.android.apps.connectmobile.a2.SETTINGS, "WeatherLocationSettings", "onGetDirectionsClickListener:Access fine location permission has already been granted. Connecting to location client...");
                    weatherLocationSettings.ca();
                    return;
                }
                com.garmin.android.apps.connectmobile.a2 a2Var2 = com.garmin.android.apps.connectmobile.a2.SETTINGS;
                com.garmin.android.apps.connectmobile.i2.a(a2Var2, "WeatherLocationSettings", "onGetDirectionsClickListener:Access fine location permission has NOT been granted. Requesting permission.");
                j22.a aVar11 = j22.a.f96719h;
                if (!j22.b.C(weatherLocationSettings, aVar11)) {
                    j22.b.u(weatherLocationSettings, 1, j22.g.f96765j);
                    return;
                }
                com.garmin.android.apps.connectmobile.i2.f36769a.getClass();
                com.garmin.android.apps.connectmobile.i2.a.b(a2Var2, "WeatherLocationSettings", "requestLocationPermission: Displaying location permission rationale to provide additional context.");
                weatherLocationSettings.f42491d = new androidx.appcompat.app.e.a(weatherLocationSettings).setTitle("").setMessage(j22.b.f(aVar11)).setCancelable(false).setPositiveButton(R.string.lbl_ok, new ng1.c1(weatherLocationSettings, 3)).show();
                return;
            case 23:
                int i30 = ForceUpdateActivity.f35275a;
                new c22.n1((ForceUpdateActivity) obj, hb2.g.a.GARMIN_CONNECT_MOBILE).a();
                return;
            case 24:
                NavHostFragment.f10124e.getClass();
                NavHostFragment.a.a((nm0.d) obj).g(R.id.action_to_groupDetailMemberListFragment, null);
                return;
            case 25:
                int i34 = np2.b.f126868c;
                ((k11.h) obj).invoke();
                return;
            case 26:
                EditExerciseSetActivity editExerciseSetActivity = (EditExerciseSetActivity) obj;
                EditExerciseSetActivity.a aVar12 = EditExerciseSetActivity.f29932e;
                NewSelectExerciseActivity.a aVar13 = NewSelectExerciseActivity.f29823c;
                com.garmin.android.apps.connectmobile.repcounting.model.c cVar = editExerciseSetActivity.f29936d;
                if (cVar == null) {
                    p005kotlin.jvm.internal.s.m("exerciseList");
                    throw null;
                }
                am.x0 x0Var = editExerciseSetActivity.f29933a;
                if (x0Var == null) {
                    p005kotlin.jvm.internal.s.m("activityType");
                    throw null;
                }
                boolean zD = hq.j.d(x0Var);
                am.x0 x0Var2 = editExerciseSetActivity.f29933a;
                if (x0Var2 != null) {
                    editExerciseSetActivity.startActivityForResult(NewSelectExerciseActivity.a.a(aVar13, editExerciseSetActivity, cVar, null, null, false, null, zD, hq.j.c(x0Var2), false, 316), 1001);
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("activityType");
                    throw null;
                }
            case 27:
                int i35 = o31.d.f128763j;
                ((o31.d) obj).b().completeUpdate();
                return;
            case 28:
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d.a aVar14 = com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d.f49637i;
                androidx.fragment.app.v supportFragmentManager = ((com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.d) obj).requireActivity().getSupportFragmentManager();
                supportFragmentManager.getClass();
                androidx.fragment.app.a aVar15 = new androidx.fragment.app.a(supportFragmentManager);
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.e.f49652d.getClass();
                aVar15.l(R.id.content_frame, new com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.e(), null);
                aVar15.d(null);
                aVar15.e();
                return;
            default:
                ob1.a.C2490a c2490a = ob1.a.f131136m;
                ((ob1.a) obj).v6();
                return;
        }
    }
}
