package hg1;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.ActionMode;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import androidx.lifecycle.v1;
import c22.b1;
import c22.l3;
import c22.m3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.contacts.edit.EditContactMethodActivity;
import com.garmin.android.apps.connectmobile.developer.glogger.GloggerAdminActivity;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.activityoptions.HeartRateAlertsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.Forerunner35PhoneNotificationsDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.TimeDateSystemDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.VivosmartDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.VivosmartDeviceSettingsDisplay;
import com.garmin.android.apps.connectmobile.settings.devices.VivosmartHRDeviceSettingsDisplay;
import com.garmin.android.apps.connectmobile.settings.devices.fr30.Forerunner30PhoneNotificationsDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.view.GCMSettingsItemView;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepEditActivity;
import com.garmin.feature.garminpay.providers.felica.ui.account.developer.FelicaConsoleActivity;
import com.garmin.feature.garminpay.ui.dev.devices.WalletMessageConsoleActivity;
import com.garmin.feature.garminpay.ui.developer.DeveloperSettingsActivity;
import gg1.o0;
import ig1.d0;
import ig1.d2;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import mt0.h2;
import ng1.p;
import o53.f0;
import p005kotlin.jvm.internal.p0;
import p005kotlin.jvm.internal.s;
import pk1.u;
import w2.a0;
import zb0.s0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class g implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f83681a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f83682b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f83683c;

    public /* synthetic */ g(int i14, Object obj, Object obj2) {
        this.f83681a = i14;
        this.f83682b = obj;
        this.f83683c = obj2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f83681a;
        int i16 = 1;
        Object obj = this.f83683c;
        Object obj2 = this.f83682b;
        switch (i15) {
            case 0:
                LinearLayout linearLayout = (LinearLayout) obj2;
                HeartRateAlertsActivity heartRateAlertsActivity = (HeartRateAlertsActivity) obj;
                int i17 = HeartRateAlertsActivity.f41672k;
                dialogInterface.getClass();
                linearLayout.setVisibility(i14 == 5 ? 0 : 4);
                TextView textView = heartRateAlertsActivity.f41676d;
                if (textView != null) {
                    String[] strArr = heartRateAlertsActivity.f41680h;
                    strArr.getClass();
                    textView.setText(strArr[i14]);
                }
                com.garmin.android.apps.connectmobile.devices.model.f fVar = heartRateAlertsActivity.f41681i;
                fVar.getClass();
                i = i14 != 5 ? i14 + 1 : 0;
                if (i == 0 || (i >= 1 && i <= 5)) {
                    i16 = i;
                }
                fVar.y1("heartRateAlertZone", Integer.valueOf(i16));
                dialogInterface.dismiss();
                return;
            case 1:
                View view2 = (View) obj;
                Forerunner30PhoneNotificationsDeviceSettings forerunner30PhoneNotificationsDeviceSettings = ((Forerunner30PhoneNotificationsDeviceSettings.a) obj2).f42986a;
                if (forerunner30PhoneNotificationsDeviceSettings.f42979i.Q0()) {
                    if (i14 == 0) {
                        forerunner30PhoneNotificationsDeviceSettings.f42979i.f33863b1.i0("SHOW_ALL");
                    }
                    wi1.c cVar = forerunner30PhoneNotificationsDeviceSettings.f42979i.f33863b1;
                    forerunner30PhoneNotificationsDeviceSettings.f42977g = cVar.f185502a;
                    forerunner30PhoneNotificationsDeviceSettings.f42973c.setButtonBottomLeftLabel(cVar.D(view2.getContext()));
                }
                dialogInterface.dismiss();
                return;
            case 2:
                View view3 = (View) obj;
                Forerunner30PhoneNotificationsDeviceSettings forerunner30PhoneNotificationsDeviceSettings2 = ((Forerunner30PhoneNotificationsDeviceSettings.b) obj2).f42987a;
                if (forerunner30PhoneNotificationsDeviceSettings2.f42979i.S0()) {
                    DeviceSettingsDTO deviceSettingsDTO = forerunner30PhoneNotificationsDeviceSettings2.f42979i;
                    if (i14 == 0) {
                        deviceSettingsDTO.f33865c1.f185503b = "TONE";
                    } else if (i14 == 1) {
                        deviceSettingsDTO.f33865c1.f185503b = "TONE_AND_VIBRATION";
                    } else {
                        deviceSettingsDTO.f33865c1.f185503b = "VIBRATION";
                    }
                    forerunner30PhoneNotificationsDeviceSettings2.f42976f.setButtonBottomLeftLabel(deviceSettingsDTO.f33865c1.H(view3.getContext()));
                }
                dialogInterface.dismiss();
                return;
            case 3:
                View view4 = (View) obj;
                Forerunner30PhoneNotificationsDeviceSettings forerunner30PhoneNotificationsDeviceSettings3 = ((Forerunner30PhoneNotificationsDeviceSettings.c) obj2).f42988a;
                if (forerunner30PhoneNotificationsDeviceSettings3.f42979i.Q0()) {
                    DeviceSettingsDTO deviceSettingsDTO2 = forerunner30PhoneNotificationsDeviceSettings3.f42979i;
                    if (i14 == 0) {
                        deviceSettingsDTO2.f33863b1.f185503b = "TONE";
                    } else if (i14 == 1) {
                        deviceSettingsDTO2.f33863b1.f185503b = "TONE_AND_VIBRATION";
                    } else {
                        deviceSettingsDTO2.f33863b1.f185503b = "VIBRATION";
                    }
                    forerunner30PhoneNotificationsDeviceSettings3.f42974d.setButtonBottomLeftLabel(deviceSettingsDTO2.f33863b1.H(view4.getContext()));
                }
                dialogInterface.dismiss();
                return;
            case 4:
                View view5 = (View) obj;
                Forerunner30PhoneNotificationsDeviceSettings forerunner30PhoneNotificationsDeviceSettings4 = ((Forerunner30PhoneNotificationsDeviceSettings.d) obj2).f42989a;
                if (forerunner30PhoneNotificationsDeviceSettings4.f42979i.S0()) {
                    if (i14 == 0) {
                        forerunner30PhoneNotificationsDeviceSettings4.f42979i.f33865c1.i0("SHOW_ALL");
                    }
                    wi1.f fVar2 = forerunner30PhoneNotificationsDeviceSettings4.f42979i.f33865c1;
                    forerunner30PhoneNotificationsDeviceSettings4.f42978h = fVar2.f185502a;
                    forerunner30PhoneNotificationsDeviceSettings4.f42975e.setButtonBottomLeftLabel(fVar2.D(view5.getContext()));
                }
                dialogInterface.dismiss();
                return;
            case 5:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.a aVar = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h.P;
                ((com.garmin.android.apps.connectmobile.menstrualcycle.presentation.details.h) obj2).v6((View) obj);
                return;
            case 6:
                EditContactMethodActivity.a aVar2 = EditContactMethodActivity.f32519d;
                dialogInterface.getClass();
                ((EditContactMethodActivity) obj2).ea((String) obj);
                return;
            case 7:
                GloggerAdminActivity gloggerAdminActivity = (GloggerAdminActivity) obj2;
                String str = (String) obj;
                int i18 = GloggerAdminActivity.f33666d;
                File file = new File(str);
                if (file.exists()) {
                    File[] fileArrListFiles = file.getParentFile().listFiles(new com.google.firebase.crashlytics.internal.persistence.b(file, i16));
                    if (fileArrListFiles == null || fileArrListFiles.length == 0) {
                        Toast.makeText(gloggerAdminActivity, "No log files found!", 1).show();
                    } else {
                        Intent intent = new Intent("android.intent.action.SEND_MULTIPLE");
                        intent.addFlags(1);
                        intent.setType("message/rfc822");
                        intent.putExtra("android.intent.extra.TEXT", "Garmin Connect Mobile");
                        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                        for (File file2 : fileArrListFiles) {
                            arrayList.add(FileProvider.d(gloggerAdminActivity, "GarminConnectMobileApp.provider", file2));
                        }
                        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                        gloggerAdminActivity.startActivity(intent);
                    }
                } else {
                    Toast.makeText(gloggerAdminActivity, str.concat(" does not exist!"), 1).show();
                }
                dialogInterface.dismiss();
                return;
            case 8:
                d0 d0Var = (d0) obj2;
                com.garmin.android.apps.connectmobile.devices.model.f fVar3 = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
                int i19 = d0.f93294l;
                m3 m3VarR = d0Var.r(fVar3);
                m3 m3Var = d0Var.f93296k[i14];
                d0Var.f93325h.setButtonRightLabel(d0Var.q(m3Var));
                double dB = b1.b(d0Var.f93324g.getButtonRightLabel());
                l3.f23124b.getClass();
                double dG = l3.a.g(l3.a.g(dB, m3VarR, m3Var), m3Var, m3.METER);
                d0Var.v(fVar3, m3Var, Double.valueOf(dG));
                dialogInterface.dismiss();
                d0Var.f93324g.setButtonRightLabel(l3.a.R(null, dG, m3Var, l3.n(), false, null));
                d0Var.p();
                return;
            case 9:
                d2 d2Var = (d2) obj2;
                com.garmin.android.apps.connectmobile.devices.model.f fVar4 = (com.garmin.android.apps.connectmobile.devices.model.f) obj;
                int i24 = d2.f93297m;
                m3 m3Var2 = d2Var.f93296k[i14];
                d2Var.f93325h.setButtonRightLabel(d2Var.q(m3Var2));
                double dB2 = b1.b(d2Var.f93324g.getButtonRightLabel());
                fVar4.Y1(m3Var2);
                fVar4.V1(dB2);
                dialogInterface.dismiss();
                d2Var.p();
                return;
            case 10:
                WalletMessageConsoleActivity walletMessageConsoleActivity = (WalletMessageConsoleActivity) obj;
                WalletMessageConsoleActivity.a aVar3 = WalletMessageConsoleActivity.f51900i;
                String string = ((EditText) obj2).getText().toString();
                if (string.length() == 0) {
                    Toast.makeText(walletMessageConsoleActivity, "Empty card ID.", 0).show();
                    return;
                } else {
                    gl.b.I(f0.w(walletMessageConsoleActivity), null, new ir2.d(walletMessageConsoleActivity, string, null), 3);
                    return;
                }
            case 11:
                WalletMessageConsoleActivity walletMessageConsoleActivity2 = (WalletMessageConsoleActivity) obj2;
                Object item = ((ArrayAdapter) obj).getItem(i14);
                item.getClass();
                long jLongValue = ((Number) item).longValue();
                WalletMessageConsoleActivity.a aVar4 = WalletMessageConsoleActivity.f51900i;
                walletMessageConsoleActivity2.getClass();
                ge1.b.T(f0.w(walletMessageConsoleActivity2), null, null, new ir2.e(walletMessageConsoleActivity2, jLongValue, null), 3);
                return;
            case 12:
                DeveloperSettingsActivity developerSettingsActivity = (DeveloperSettingsActivity) obj2;
                List list = (List) obj;
                String str2 = DeveloperSettingsActivity.f51946n;
                FelicaConsoleActivity.a aVar5 = FelicaConsoleActivity.f51010q;
                long unitID = ((sd2.f) list.get(i14)).getUnitID();
                Object obj3 = list.get(i14);
                obj3.getClass();
                String strI = a0.i((sd2.f) obj3);
                aVar5.getClass();
                Intent intent2 = new Intent(developerSettingsActivity, (Class<?>) FelicaConsoleActivity.class);
                intent2.putExtra("extra.unit_id", unitID);
                intent2.putExtra("extra.device_name", strI);
                developerSettingsActivity.startActivity(intent2);
                dialogInterface.dismiss();
                return;
            case 13:
                ((e23.l) obj2).invoke(((List) obj).get(i14));
                dialogInterface.dismiss();
                return;
            case 14:
                ((Context) obj2).startActivity((Intent) obj);
                dialogInterface.dismiss();
                return;
            case 15:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                ((e23.l) obj2).invoke(Integer.valueOf(((p0) obj).f105807a));
                return;
            case 16:
                com.garmin.android.apps.connectmobile.settings.devices.index.b bVar = (com.garmin.android.apps.connectmobile.settings.devices.index.b) obj2;
                bVar.f43068d.a((com.garmin.android.apps.connectmobile.smartscale.model.e) obj, bVar);
                return;
            case 17:
                ((h2) obj2).c7();
                ((ActionMode) obj).finish();
                return;
            case 18:
                p pVar = (p) obj2;
                int i25 = p.f125974l;
                pVar.showProgressOverlay();
                com.garmin.android.apps.connectmobile.settings.devices.e eVarN = com.garmin.android.apps.connectmobile.settings.devices.e.N();
                long j8 = pVar.f125976b;
                ng1.o oVar = new ng1.o(pVar);
                eVarN.getClass();
                pVar.f125975a = com.garmin.android.apps.connectmobile.settings.devices.e.Q(j8, (String) obj, oVar);
                return;
            case 19:
                View view6 = (View) obj;
                Forerunner35PhoneNotificationsDeviceSettings forerunner35PhoneNotificationsDeviceSettings = ((Forerunner35PhoneNotificationsDeviceSettings.a) obj2).f42105a;
                if (forerunner35PhoneNotificationsDeviceSettings.f42099j.Q0()) {
                    DeviceSettingsDTO deviceSettingsDTO3 = forerunner35PhoneNotificationsDeviceSettings.f42099j;
                    if (i14 == 0) {
                        deviceSettingsDTO3.f33863b1.i0("SHOW_ALL");
                    } else {
                        deviceSettingsDTO3.f33863b1.i0("SHOW_CALLS_ONLY");
                    }
                    wi1.c cVar2 = forerunner35PhoneNotificationsDeviceSettings.f42099j.f33863b1;
                    forerunner35PhoneNotificationsDeviceSettings.f42097h = cVar2.f185502a;
                    forerunner35PhoneNotificationsDeviceSettings.f42093d.setButtonBottomLeftLabel(cVar2.D(view6.getContext()));
                }
                dialogInterface.dismiss();
                return;
            case 20:
                View view7 = (View) obj;
                Forerunner35PhoneNotificationsDeviceSettings forerunner35PhoneNotificationsDeviceSettings2 = ((Forerunner35PhoneNotificationsDeviceSettings.b) obj2).f42106a;
                if (forerunner35PhoneNotificationsDeviceSettings2.f42099j.S0()) {
                    DeviceSettingsDTO deviceSettingsDTO4 = forerunner35PhoneNotificationsDeviceSettings2.f42099j;
                    if (i14 == 0) {
                        deviceSettingsDTO4.f33865c1.f185503b = "TONE";
                    } else if (i14 == 1) {
                        deviceSettingsDTO4.f33865c1.f185503b = "TONE_AND_VIBRATION";
                    } else {
                        deviceSettingsDTO4.f33865c1.f185503b = "VIBRATION";
                    }
                    forerunner35PhoneNotificationsDeviceSettings2.f42096g.setButtonBottomLeftLabel(deviceSettingsDTO4.f33865c1.H(view7.getContext()));
                }
                dialogInterface.dismiss();
                return;
            case 21:
                View view8 = (View) obj;
                Forerunner35PhoneNotificationsDeviceSettings forerunner35PhoneNotificationsDeviceSettings3 = ((Forerunner35PhoneNotificationsDeviceSettings.c) obj2).f42107a;
                if (forerunner35PhoneNotificationsDeviceSettings3.f42099j.Q0()) {
                    DeviceSettingsDTO deviceSettingsDTO5 = forerunner35PhoneNotificationsDeviceSettings3.f42099j;
                    if (i14 == 0) {
                        deviceSettingsDTO5.f33863b1.f185503b = "TONE";
                    } else if (i14 == 1) {
                        deviceSettingsDTO5.f33863b1.f185503b = "TONE_AND_VIBRATION";
                    } else {
                        deviceSettingsDTO5.f33863b1.f185503b = "VIBRATION";
                    }
                    forerunner35PhoneNotificationsDeviceSettings3.f42094e.setButtonBottomLeftLabel(deviceSettingsDTO5.f33863b1.H(view8.getContext()));
                }
                dialogInterface.dismiss();
                return;
            case 22:
                View view9 = (View) obj;
                Forerunner35PhoneNotificationsDeviceSettings forerunner35PhoneNotificationsDeviceSettings4 = ((Forerunner35PhoneNotificationsDeviceSettings.d) obj2).f42108a;
                if (forerunner35PhoneNotificationsDeviceSettings4.f42099j.S0()) {
                    DeviceSettingsDTO deviceSettingsDTO6 = forerunner35PhoneNotificationsDeviceSettings4.f42099j;
                    if (i14 == 0) {
                        deviceSettingsDTO6.f33865c1.i0("SHOW_ALL");
                    } else {
                        deviceSettingsDTO6.f33865c1.i0("SHOW_CALLS_ONLY");
                    }
                    wi1.f fVar5 = forerunner35PhoneNotificationsDeviceSettings4.f42099j.f33865c1;
                    forerunner35PhoneNotificationsDeviceSettings4.f42098i = fVar5.f185502a;
                    forerunner35PhoneNotificationsDeviceSettings4.f42095f.setButtonBottomLeftLabel(fVar5.D(view9.getContext()));
                }
                dialogInterface.dismiss();
                return;
            case 23:
                TimeDateSystemDeviceSettings timeDateSystemDeviceSettings = TimeDateSystemDeviceSettings.this;
                DeviceSettingsDTO deviceSettingsDTO7 = timeDateSystemDeviceSettings.f42171f;
                s0 s0Var = (s0) ((ArrayList) obj).get(i14);
                deviceSettingsDTO7.getClass();
                if (s0Var != null) {
                    deviceSettingsDTO7.f33907y = Integer.valueOf(s0Var.f203656a.f20535a);
                    deviceSettingsDTO7.S1("language");
                }
                GCMComplexTwoLineButton gCMComplexTwoLineButton = timeDateSystemDeviceSettings.f42168c;
                DeviceSettingsDTO deviceSettingsDTO8 = timeDateSystemDeviceSettings.f42171f;
                deviceSettingsDTO8.getClass();
                s0.a aVar6 = s0.f203651c;
                Integer num = deviceSettingsDTO8.f33907y;
                s0 s0Var2 = s0.GCMDeviceLanguageEnglish;
                aVar6.getClass();
                gCMComplexTwoLineButton.setButtonBottomLeftLabel(timeDateSystemDeviceSettings.getString(s0.a.a(num, s0Var2).f203657b));
                dialogInterface.dismiss();
                return;
            case 24:
                VivosmartDeviceSettings vivosmartDeviceSettings = ((VivosmartDeviceSettings.a) obj2).f42341a;
                String string2 = ((EditText) ((View) obj).findViewById(R.id.dialog_edit_text)).getText().toString();
                if (!TextUtils.isEmpty(string2)) {
                    try {
                        DeviceSettingsDTO deviceSettingsDTO9 = vivosmartDeviceSettings.f125985k;
                        deviceSettingsDTO9.P = Long.valueOf(Long.parseLong(string2));
                        deviceSettingsDTO9.S1("customWheelSize");
                        vivosmartDeviceSettings.f42336v.setButtonBottomLeftLabel(string2);
                    } catch (NumberFormatException unused) {
                        i2.a(a2.SETTINGS, "VivosmartDeviceSettings", "Bad wheel size input");
                    }
                    break;
                }
                dialogInterface.dismiss();
                return;
            case 25:
                VivosmartDeviceSettingsDisplay vivosmartDeviceSettingsDisplay = ((VivosmartDeviceSettingsDisplay.b) obj2).f42353a;
                vivosmartDeviceSettingsDisplay.f42346d.A1(((VivosmartDeviceSettingsDisplay.f) ((ArrayList) obj).get(i14)).f42370a);
                vivosmartDeviceSettingsDisplay.f42343a.setButtonBottomLeftLabel(vivosmartDeviceSettingsDisplay.getString(VivosmartDeviceSettingsDisplay.f.a(vivosmartDeviceSettingsDisplay.f42346d.A).f42371b));
                dialogInterface.dismiss();
                return;
            case 26:
                VivosmartHRDeviceSettingsDisplay vivosmartHRDeviceSettingsDisplay = ((VivosmartHRDeviceSettingsDisplay.d) obj2).f42450a;
                vivosmartHRDeviceSettingsDisplay.f42444n.A1(((VivosmartHRDeviceSettingsDisplay.m) ((ArrayList) obj).get(i14)).f42472a);
                int i26 = VivosmartHRDeviceSettingsDisplay.m.a(vivosmartHRDeviceSettingsDisplay.f42444n.A).f42473b;
                if (i26 == VivosmartHRDeviceSettingsDisplay.m.f42464h.f42473b) {
                    i26 = VivosmartHRDeviceSettingsDisplay.m.f42460d.f42473b;
                }
                vivosmartHRDeviceSettingsDisplay.f42442l.setButtonBottomLeftLabel(vivosmartHRDeviceSettingsDisplay.getString(i26));
                dialogInterface.dismiss();
                return;
            case 27:
                com.garmin.android.apps.connectmobile.activities.manual.eventType.b.a aVar7 = com.garmin.android.apps.connectmobile.activities.manual.eventType.b.f29199g;
                ((ls0.h) obj2).invoke((qs.g) obj);
                dialogInterface.dismiss();
                return;
            case 28:
                WorkoutStepEditActivity.a aVar8 = WorkoutStepEditActivity.f49573h;
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.j jVarDa = ((WorkoutStepEditActivity) obj2).da();
                com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.h hVar = (com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g.h) ((com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.g) obj);
                ge1.b.T(v1.a(jVarDa), null, null, new com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.k(jVarDa, hVar.f49689a, hVar.f49690b, hVar.f49691c, null), 3);
                return;
            default:
                u uVar = (u) obj;
                u.a aVar9 = u.E;
                o0 o0Var = ((o0[]) obj2)[i14];
                f12.l lVar = uVar.B;
                lVar.H1(o0Var);
                GCMSettingsItemView gCMSettingsItemView = uVar.f138332q;
                if (gCMSettingsItemView == null) {
                    s.m("measurementUnitsView");
                    throw null;
                }
                String string3 = uVar.getString(o0Var.f77292b);
                string3.getClass();
                gCMSettingsItemView.setSummary(string3);
                uVar.w6();
                uVar.z6();
                lVar.T3(true);
                dialogInterface.dismiss();
                return;
        }
    }
}
