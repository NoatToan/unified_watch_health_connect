package ng1;

import android.content.DialogInterface;
import android.net.Uri;
import android.os.Parcelable;
import android.widget.EditText;
import android.widget.NumberPicker;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.auth.PostUserAuthenticationActivity;
import com.garmin.android.apps.connectmobile.blood_pressure.presentation.add_blood_pressure.AddBloodPressureActivity;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.lteconnect.VerizonLteWebViewActivity;
import com.garmin.android.apps.connectmobile.powerguide.PowerGuideListActivity;
import com.garmin.android.apps.connectmobile.settings.GCMDumpAppLogActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.settings.devices.VivofitDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.VivosmartDeviceSettingsDisplay;
import com.garmin.android.apps.connectmobile.settings.devices.VivosmartDeviceSettingsOrientation;
import com.garmin.android.apps.connectmobile.settings.devices.WeatherLocationSettings;
import com.garmin.android.apps.connectmobile.social.share.UCropImageActivity;
import com.garmin.android.apps.connectmobile.training.itp.dashboard.ITPDashboardActivity;
import com.garmin.android.apps.connectmobile.view.LocationTextPickerActivity;
import com.garmin.android.apps.connectmobile.workouts.presentation.stepedit.WorkoutStepTargetTypeActivity;
import java.util.regex.Pattern;
import mt0.s1;
import p005kotlin.Unit;
import r22.j2;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class c1 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f125918b;

    public /* synthetic */ c1(Object obj, int i14) {
        this.f125917a = i14;
        this.f125918b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f125917a;
        int iIntValue = 0;
        Object obj = this.f125918b;
        switch (i15) {
            case 0:
                VivofitDeviceSettings vivofitDeviceSettings = ((VivofitDeviceSettings.c) obj).f42300a;
                vivofitDeviceSettings.f125985k.F1(DeviceSettingsDTO.l.values()[i14]);
                vivofitDeviceSettings.f42294w.setButtonBottomLeftLabel(vivofitDeviceSettings.getString(vivofitDeviceSettings.f125985k.c0().f33990b));
                dialogInterface.dismiss();
                return;
            case 1:
                VivosmartDeviceSettingsDisplay vivosmartDeviceSettingsDisplay = ((VivosmartDeviceSettingsDisplay.d) obj).f42355a;
                DeviceSettingsDTO deviceSettingsDTO = vivosmartDeviceSettingsDisplay.f42346d;
                DeviceSettingsDTO.a aVar = DeviceSettingsDTO.a.values()[i14];
                deviceSettingsDTO.getClass();
                aVar.getClass();
                deviceSettingsDTO.T = aVar.f33917a;
                deviceSettingsDTO.S1("gestureMode");
                vivosmartDeviceSettingsDisplay.f42345c.setButtonBottomLeftLabel(vivosmartDeviceSettingsDisplay.getString(vivosmartDeviceSettingsDisplay.f42346d.M().f33918b));
                dialogInterface.dismiss();
                return;
            case 2:
                DeviceSettingsDTO.v vVar = DeviceSettingsDTO.v.values()[i14];
                VivosmartDeviceSettingsOrientation vivosmartDeviceSettingsOrientation = ((VivosmartDeviceSettingsOrientation.e) obj).f42399a;
                if (vVar != vivosmartDeviceSettingsOrientation.f42384l.e0()) {
                    DeviceSettingsDTO deviceSettingsDTO2 = vivosmartDeviceSettingsOrientation.f42384l;
                    deviceSettingsDTO2.getClass();
                    vVar.getClass();
                    deviceSettingsDTO2.D = vVar.f34072a;
                    deviceSettingsDTO2.S1("mountingSide");
                    vivosmartDeviceSettingsOrientation.f42373a.setButtonBottomLeftLabel(vivosmartDeviceSettingsOrientation.getString(vivosmartDeviceSettingsOrientation.f42384l.e0().f34073b));
                    vivosmartDeviceSettingsOrientation.da();
                }
                dialogInterface.dismiss();
                return;
            case 3:
                int i16 = WeatherLocationSettings.f42487g;
                dialogInterface.dismiss();
                j22.b bVar = j22.b.f96736a;
                j22.g gVar = j22.g.f96765j;
                bVar.getClass();
                j22.b.u((WeatherLocationSettings) obj, 1, gVar);
                return;
            case 4:
                int i17 = WorkoutStepTargetTypeActivity.f49603b;
                ((s1) obj).invoke();
                return;
            case 5:
                ov1.j.a aVar2 = ov1.j.f134173d;
                ((ov1.j) obj).A6().y5();
                dialogInterface.dismiss();
                return;
            case 6:
                dialogInterface.getClass();
                ((po2.x) obj).invoke(dialogInterface);
                return;
            case 7:
                dialogInterface.getClass();
                ((po2.x) obj).invoke(dialogInterface);
                return;
            case 8:
                dialogInterface.getClass();
                ((po2.x) obj).invoke(dialogInterface);
                return;
            case 9:
                dialogInterface.getClass();
                ((po2.o) obj).invoke(dialogInterface);
                return;
            case 10:
                dialogInterface.getClass();
                ((po2.x) obj).invoke(dialogInterface);
                return;
            case 11:
                dialogInterface.getClass();
                ((po2.o) obj).invoke(dialogInterface);
                return;
            case 12:
                dialogInterface.getClass();
                ((po2.o) obj).invoke(dialogInterface);
                return;
            case 13:
                dialogInterface.getClass();
                ((po2.o) obj).invoke(dialogInterface);
                return;
            case 14:
                dialogInterface.getClass();
                ((po2.o) obj).invoke(dialogInterface);
                return;
            case 15:
                PostUserAuthenticationActivity.a aVar3 = PostUserAuthenticationActivity.f30291i;
                dialogInterface.getClass();
                dialogInterface.dismiss();
                String[] strArr = (String[]) d53.w.W(GCMSettingManager.k().a(), new String[]{"api"}).toArray(new String[0]);
                g22.a.c((PostUserAuthenticationActivity) obj, Uri.parse(strArr[0] + strArr[1] + "/signin"));
                return;
            case 16:
                int i18 = VerizonLteWebViewActivity.f38708h;
                dialogInterface.dismiss();
                ((VerizonLteWebViewActivity) obj).finish();
                return;
            case 17:
                ITPDashboardActivity iTPDashboardActivity = (ITPDashboardActivity) obj;
                ITPDashboardActivity.a aVar4 = ITPDashboardActivity.f45618m;
                if (iTPDashboardActivity.oa().T == null) {
                    iTPDashboardActivity.qa();
                    return;
                }
                fg0.k kVar = iTPDashboardActivity.oa().T;
                if (kVar == null) {
                    return;
                }
                Parcelable.Creator<fg0.k> creator = fg0.k.CREATOR;
                String strR = kVar.r(false);
                if (strR == null) {
                    return;
                }
                boolean zP0 = kVar.p0();
                String string = zP0 ? iTPDashboardActivity.getString(R.string.keep_training_plan_with_event_subscribed, strR) : iTPDashboardActivity.getString(R.string.keep_training_plan_with_event_created, strR);
                string.getClass();
                int i19 = zP0 ? R.string.workout_remove_from_calendar : R.string.delete_event;
                androidx.fragment.app.v supportFragmentManager = iTPDashboardActivity.getSupportFragmentManager();
                supportFragmentManager.getClass();
                rt1.n.d(iTPDashboardActivity, supportFragmentManager, string, i19, new ad0.f(iTPDashboardActivity, zP0, kVar, 17));
                return;
            case 18:
                qh0.a aVar5 = (qh0.a) obj;
                String strTrim = aVar5.f144691b.getText().toString().trim();
                if (!strTrim.isEmpty()) {
                    try {
                        iIntValue = Integer.valueOf(strTrim).intValue();
                    } catch (NumberFormatException e4) {
                        i2.i("FloorsGoalDialog", "Error parsing floors climbed goal value: " + e4.getMessage());
                    }
                    break;
                }
                qh0.a.b bVar2 = qh0.a.f144689e;
                if (bVar2 != null && iIntValue >= 0) {
                    bVar2.l(iIntValue);
                }
                xg1.i<Double> iVar = aVar5.f144690a;
                if (iVar != null && iIntValue > 0) {
                    iVar.a(Double.valueOf(iIntValue));
                }
                dialogInterface.dismiss();
                return;
            case 19:
                com.garmin.android.apps.connectmobile.settings.lte.c.a aVar6 = com.garmin.android.apps.connectmobile.settings.lte.c.f43491d;
                ((com.garmin.android.apps.connectmobile.settings.lte.c) obj).u6().f144861c.m("LTESubscriptionStatusFragment");
                dialogInterface.dismiss();
                return;
            case 20:
                r22.g0 g0Var = (r22.g0) obj;
                if (g0Var.f149658f != null) {
                    String string2 = g0Var.f149653a.getText().toString();
                    if (Pattern.compile("([0-9]*[.])?[0-9]+").matcher(string2).matches()) {
                        g0Var.f149658f.b(Double.parseDouble(string2));
                        return;
                    }
                    return;
                }
                return;
            case 21:
                LocationTextPickerActivity locationTextPickerActivity = (LocationTextPickerActivity) obj;
                EditText editText = locationTextPickerActivity.f47493c;
                if (editText == null) {
                    p005kotlin.jvm.internal.s.m("enterLatitudeEditText");
                    throw null;
                }
                editText.setText("");
                EditText editText2 = locationTextPickerActivity.f47494d;
                if (editText2 != null) {
                    editText2.setText("");
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("enterLongitudeEditText");
                    throw null;
                }
            case 22:
                ((r22.i1) obj).dismiss();
                return;
            case 23:
                j2 j2Var = (j2) obj;
                e23.p<Double, Boolean, Unit> pVar = j2Var.f149719a;
                NumberPicker numberPicker = j2Var.f149726h;
                if (numberPicker == null) {
                    p005kotlin.jvm.internal.s.m("pickerWhole");
                    throw null;
                }
                pVar.invoke(Double.valueOf(numberPicker.getValue()), Boolean.valueOf(j2Var.f149724f));
                dialogInterface.dismiss();
                return;
            case 24:
                ro0.u uVar = ro0.u.f153887a;
                dialogInterface.dismiss();
                j22.b bVar3 = j22.b.f96736a;
                j22.a[] aVarArr = {j22.a.f96722k};
                bVar3.getClass();
                j22.b.x((GCMDumpAppLogActivity) obj, 1, aVarArr);
                return;
            case 25:
                com.garmin.android.apps.connectmobile.social.share.d.a aVar7 = com.garmin.android.apps.connectmobile.social.share.d.f44653m;
                j22.b bVar4 = j22.b.f96736a;
                j22.a[] aVarArr2 = {j22.a.f96722k};
                bVar4.getClass();
                j22.b.z((com.garmin.android.apps.connectmobile.social.share.d) obj, 3, aVarArr2);
                return;
            case 26:
                ro1.r rVar = ((com.garmin.android.apps.connectmobile.social.share.f) obj).f44690g;
                if (rVar != null) {
                    rVar.E6();
                    return;
                }
                return;
            case 27:
                UCropImageActivity.a aVar8 = UCropImageActivity.f44623o;
                dialogInterface.dismiss();
                ((UCropImageActivity) obj).f44637n.a(f.k.a(g.e.d.f74074a, 0, 14), null);
                return;
            case 28:
                AddBloodPressureActivity.ka((AddBloodPressureActivity) obj);
                return;
            default:
                int i24 = PowerGuideListActivity.f40349k;
                ((PowerGuideListActivity) obj).finish();
                return;
        }
    }
}
