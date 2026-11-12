package kx0;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.widget.NumberPicker;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import c22.q0;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.presentation.automatic.MultipleCoursesActivity;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleReminderSettingsActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.MCTCycleTypeActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.setup.MCTSetupActivity;
import com.garmin.android.apps.connectmobile.settings.devices.AlarmDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.CreateEditDeviceAlarmActivity;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.TimeDateSystemDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.VivoactiveDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.Vivofit2DeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.Vivofit2DeviceSettingsScreensDuringActivity;
import com.garmin.android.apps.connectmobile.settings.devices.VivofitDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.traininginitiative.ui.trainigplanintegration.EventTrainingPlanIntegrationActivity;
import com.garmin.android.apps.connectmobile.userprofile.editimage.EditProfileImageActivity;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.util.ArrayList;
import java.util.List;
import p13.x;
import sg0.w0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f107046b;

    public /* synthetic */ f(Object obj, int i14) {
        this.f107045a = i14;
        this.f107046b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int value;
        int value2;
        int value3;
        int i15 = this.f107045a;
        Object obj = this.f107046b;
        switch (i15) {
            case 0:
                MenstrualCycleReminderSettingsActivity menstrualCycleReminderSettingsActivity = (MenstrualCycleReminderSettingsActivity) obj;
                MenstrualCycleReminderSettingsActivity.a aVar = MenstrualCycleReminderSettingsActivity.f39014o;
                a[] aVarArr = (a[]) menstrualCycleReminderSettingsActivity.f39017b.getValue();
                dialogInterface.getClass();
                menstrualCycleReminderSettingsActivity.f39024i = aVarArr[((androidx.appcompat.app.e) dialogInterface).f4658a.f4596g.getCheckedItemPosition()];
                TextView textView = (TextView) menstrualCycleReminderSettingsActivity.findViewById(R.id.mct_reminder_settings_logging_frequency_value);
                a aVar2 = menstrualCycleReminderSettingsActivity.f39024i;
                if (aVar2 != null) {
                    textView.setText(aVar2.a(menstrualCycleReminderSettingsActivity));
                    return;
                } else {
                    p005kotlin.jvm.internal.s.m("mLoggingFrequency");
                    throw null;
                }
            case 1:
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a aVar3 = (com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a) obj;
                com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.C0691a c0691a = com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.a.f39031t1;
                dialogInterface.getClass();
                aVar3.F6();
                dialogInterface.dismiss();
                aVar3.onResume();
                return;
            case 2:
                EventTrainingPlanIntegrationActivity.a aVar4 = EventTrainingPlanIntegrationActivity.f46267e;
                ((kp2.a) obj).invoke(Boolean.TRUE);
                dialogInterface.dismiss();
                return;
            case 3:
                MultipleCoursesActivity.a aVar5 = MultipleCoursesActivity.f33000c;
                g22.a.c((MultipleCoursesActivity) obj, Uri.parse("https://support.garmin.com/sas/gcapp/?productId=125677&contentId=4SKJEVdUWL11K9escSVn96"));
                return;
            case 4:
                q0.a aVar6 = q0.f23203a;
                String str = hb2.g.a.STRAVA.f82804a;
                str.getClass();
                Context context = ((androidx.appcompat.app.e.a) obj).getContext();
                context.getClass();
                aVar6.getClass();
                q0.a.b(context, str);
                return;
            case 5:
                MCTCycleTypeActivity mCTCycleTypeActivity = (MCTCycleTypeActivity) obj;
                MCTCycleTypeActivity.a aVar7 = MCTCycleTypeActivity.f39091e;
                mCTCycleTypeActivity.startActivityForResult(MCTSetupActivity.a.a(MCTSetupActivity.f39100c, mCTCycleTypeActivity, 4), 201);
                return;
            case 6:
                ((w0) obj).invoke();
                dialogInterface.dismiss();
                return;
            case 7:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.a.C0666a c0666a = com.garmin.android.apps.connectmobile.leaderboard.challenges.a.f37286d;
                ((com.garmin.android.apps.connectmobile.leaderboard.challenges.a) obj).requireActivity().finish();
                return;
            case 8:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.c.a aVar8 = com.garmin.android.apps.connectmobile.leaderboard.challenges.c.f37365h;
                ((com.garmin.android.apps.connectmobile.leaderboard.challenges.c) obj).u6();
                return;
            case 9:
                com.garmin.android.apps.connectmobile.leaderboard.challenges.g gVar = (com.garmin.android.apps.connectmobile.leaderboard.challenges.g) obj;
                gVar.f37545q.f(false);
                gVar.requireActivity().getOnBackPressedDispatcher().d();
                return;
            case 10:
                mv2.h hVar = (mv2.h) obj;
                cx2.i.a aVar9 = cx2.i.f56681a;
                Fragment fragment = hVar.f121215a;
                ArrayList arrayList = hVar.f121229o;
                ArrayList arrayList2 = hVar.f121228n;
                ArrayList arrayList3 = hVar.f121227m;
                aVar9.getClass();
                if (!cx2.i.a.a(fragment)) {
                    hVar.f121219e.getClass();
                    return;
                }
                int size = arrayList3.size();
                NumberPicker numberPicker = hVar.f121222h;
                if (size > 0) {
                    if (numberPicker == null) {
                        p005kotlin.jvm.internal.s.m("hoursPicker");
                        throw null;
                    }
                    value = ((Number) arrayList3.get(numberPicker.getValue())).intValue();
                } else {
                    if (numberPicker == null) {
                        p005kotlin.jvm.internal.s.m("hoursPicker");
                        throw null;
                    }
                    value = numberPicker.getValue();
                }
                int size2 = arrayList2.size();
                NumberPicker numberPicker2 = hVar.f121224j;
                if (size2 > 0) {
                    if (numberPicker2 == null) {
                        p005kotlin.jvm.internal.s.m("minutesPicker");
                        throw null;
                    }
                    value2 = ((Number) arrayList2.get(numberPicker2.getValue())).intValue();
                } else {
                    if (numberPicker2 == null) {
                        p005kotlin.jvm.internal.s.m("minutesPicker");
                        throw null;
                    }
                    value2 = numberPicker2.getValue();
                }
                int size3 = arrayList.size();
                NumberPicker numberPicker3 = hVar.f121226l;
                if (size3 > 0) {
                    if (numberPicker3 == null) {
                        p005kotlin.jvm.internal.s.m("secondsPicker");
                        throw null;
                    }
                    value3 = ((Number) arrayList.get(numberPicker3.getValue())).intValue();
                } else {
                    if (numberPicker3 == null) {
                        p005kotlin.jvm.internal.s.m("secondsPicker");
                        throw null;
                    }
                    value3 = numberPicker3.getValue();
                }
                hVar.f121216b.h(hVar.f121217c, hVar.f121218d, x.k(Integer.valueOf(value), Integer.valueOf(value2), Integer.valueOf(value3)));
                return;
            case 11:
                dialogInterface.dismiss();
                ((EditProfileImageActivity) obj).finish();
                return;
            case 12:
                int i16 = com.garmin.android.apps.connectmobile.userprofile.editimage.a.f46642h;
                j22.b bVar = j22.b.f96736a;
                androidx.fragment.app.m mVarRequireActivity = ((com.garmin.android.apps.connectmobile.userprofile.editimage.a) obj).requireActivity();
                mVarRequireActivity.getClass();
                bVar.getClass();
                j22.b.r(mVarRequireActivity);
                return;
            case 13:
                AlarmDeviceSettings alarmDeviceSettings = (AlarmDeviceSettings) obj;
                AlarmDeviceSettings.a aVar10 = AlarmDeviceSettings.f41833n;
                dialogInterface.getClass();
                com.garmin.android.apps.connectmobile.devices.model.i iVar = alarmDeviceSettings.f41840g;
                iVar.getClass();
                DeviceSettingsDTO deviceSettingsDTO = alarmDeviceSettings.f41839f;
                deviceSettingsDTO.getClass();
                List<String> list = deviceSettingsDTO.f33880k;
                list.getClass();
                iVar.f34181a = list.get(i14);
                GCMComplexTwoLineButton gCMComplexTwoLineButton = alarmDeviceSettings.f41836c;
                gCMComplexTwoLineButton.getClass();
                com.garmin.android.apps.connectmobile.devices.model.c.a aVar11 = com.garmin.android.apps.connectmobile.devices.model.c.f34112c;
                com.garmin.android.apps.connectmobile.devices.model.i iVar2 = alarmDeviceSettings.f41840g;
                iVar2.getClass();
                String str2 = iVar2.f34181a;
                aVar11.getClass();
                gCMComplexTwoLineButton.setButtonBottomLeftLabel(alarmDeviceSettings.getString(com.garmin.android.apps.connectmobile.devices.model.c.a.a(str2).f34119b));
                dialogInterface.dismiss();
                return;
            case 14:
                int i17 = ng1.q.f125986q;
                ((ng1.q) obj).finish();
                return;
            case 15:
                CreateEditDeviceAlarmActivity createEditDeviceAlarmActivity = (CreateEditDeviceAlarmActivity) obj;
                CreateEditDeviceAlarmActivity.a aVar12 = CreateEditDeviceAlarmActivity.f41935r;
                Intent intent = new Intent();
                intent.putExtra("extras_alarm_deleted", true);
                intent.putExtra("extras_alarm_id", createEditDeviceAlarmActivity.f41948k);
                createEditDeviceAlarmActivity.setResult(-1, intent);
                createEditDeviceAlarmActivity.finish();
                return;
            case 16:
                int i18 = DeviceUserSettingsActivity.f42010c1;
                ((DeviceUserSettingsActivity) obj).finish();
                return;
            case 17:
                DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
                deviceUserSettingsActivity.f42015c.P0(UserSettingsDTO.c.values()[i14]);
                deviceUserSettingsActivity.ga();
                dialogInterface.dismiss();
                return;
            case 18:
                DeviceUserSettingsActivity deviceUserSettingsActivity2 = DeviceUserSettingsActivity.this;
                deviceUserSettingsActivity2.f42015c.R0(UserSettingsDTO.d.values()[i14]);
                UserSettingsDTO userSettingsDTO = deviceUserSettingsActivity2.f42015c;
                if (userSettingsDTO != null) {
                    deviceUserSettingsActivity2.f42032t.setButtonBottomLeftLabel(deviceUserSettingsActivity2.getString(userSettingsDTO.H().f43545b));
                }
                dialogInterface.dismiss();
                return;
            case 19:
                TimeDateSystemDeviceSettings timeDateSystemDeviceSettings = ((TimeDateSystemDeviceSettings.a) obj).f42176a;
                timeDateSystemDeviceSettings.f42171f.I1(DeviceSettingsDTO.p.values()[i14]);
                timeDateSystemDeviceSettings.f42166a.setButtonBottomLeftLabel(timeDateSystemDeviceSettings.getString(timeDateSystemDeviceSettings.f42171f.h0().f34017b));
                dialogInterface.dismiss();
                return;
            case 20:
                TimeDateSystemDeviceSettings timeDateSystemDeviceSettings2 = ((TimeDateSystemDeviceSettings.b) obj).f42177a;
                timeDateSystemDeviceSettings2.f42171f.D1(DeviceSettingsDTO.j.values()[i14]);
                timeDateSystemDeviceSettings2.f42167b.setButtonBottomLeftLabel(timeDateSystemDeviceSettings2.getString(timeDateSystemDeviceSettings2.f42171f.a0().f33976b));
                dialogInterface.dismiss();
                return;
            case 21:
                TimeDateSystemDeviceSettings timeDateSystemDeviceSettings3 = ((TimeDateSystemDeviceSettings.d) obj).f42179a;
                timeDateSystemDeviceSettings3.f42171f.F1(DeviceSettingsDTO.l.values()[i14]);
                timeDateSystemDeviceSettings3.f42169d.setButtonBottomLeftLabel(timeDateSystemDeviceSettings3.getString(timeDateSystemDeviceSettings3.f42171f.c0().f33990b));
                dialogInterface.dismiss();
                return;
            case 22:
                VivoactiveDeviceSettings vivoactiveDeviceSettings = ((VivoactiveDeviceSettings.a) obj).f42210a;
                DeviceSettingsDTO deviceSettingsDTO2 = vivoactiveDeviceSettings.f125985k;
                DeviceSettingsDTO.v vVar = DeviceSettingsDTO.v.values()[i14];
                deviceSettingsDTO2.getClass();
                vVar.getClass();
                deviceSettingsDTO2.D = vVar.f34072a;
                deviceSettingsDTO2.S1("mountingSide");
                vivoactiveDeviceSettings.f42207t.setButtonBottomLeftLabel(vivoactiveDeviceSettings.getString(vivoactiveDeviceSettings.f125985k.e0().f34073b));
                dialogInterface.dismiss();
                return;
            case 23:
                Vivofit2DeviceSettings vivofit2DeviceSettings = ((Vivofit2DeviceSettings.a) obj).f42219a;
                vivofit2DeviceSettings.f125985k.I1(DeviceSettingsDTO.p.values()[i14]);
                vivofit2DeviceSettings.f42215w.setButtonBottomLeftLabel(vivofit2DeviceSettings.getString(vivofit2DeviceSettings.f125985k.h0().f34017b));
                dialogInterface.dismiss();
                return;
            case 24:
                Vivofit2DeviceSettings vivofit2DeviceSettings2 = ((Vivofit2DeviceSettings.b) obj).f42220a;
                vivofit2DeviceSettings2.f125985k.D1(DeviceSettingsDTO.j.values()[i14]);
                vivofit2DeviceSettings2.f42216x.setButtonBottomLeftLabel(vivofit2DeviceSettings2.getString(vivofit2DeviceSettings2.f125985k.a0().f33976b));
                dialogInterface.dismiss();
                return;
            case 25:
                Vivofit2DeviceSettings vivofit2DeviceSettings3 = ((Vivofit2DeviceSettings.c) obj).f42221a;
                vivofit2DeviceSettings3.f125985k.F1(DeviceSettingsDTO.l.values()[i14]);
                vivofit2DeviceSettings3.f42217y.setButtonBottomLeftLabel(vivofit2DeviceSettings3.getString(vivofit2DeviceSettings3.f125985k.c0().f33990b));
                dialogInterface.dismiss();
                return;
            case 26:
                Vivofit2DeviceSettings vivofit2DeviceSettings4 = ((Vivofit2DeviceSettings.d) obj).f42222a;
                vivofit2DeviceSettings4.f125985k.A1(Vivofit2DeviceSettings.g.values()[i14].f42227a);
                vivofit2DeviceSettings4.f42213t.setButtonBottomLeftLabel(vivofit2DeviceSettings4.getString(Vivofit2DeviceSettings.g.a(vivofit2DeviceSettings4.f125985k.A).f42228b));
                dialogInterface.dismiss();
                return;
            case 27:
                Vivofit2DeviceSettingsScreensDuringActivity vivofit2DeviceSettingsScreensDuringActivity = ((Vivofit2DeviceSettingsScreensDuringActivity.a) obj).f42257a;
                vivofit2DeviceSettingsScreensDuringActivity.f42255j.f33863b1.f185492j = Vivofit2DeviceSettingsScreensDuringActivity.i.values()[i14].f42267a;
                vivofit2DeviceSettingsScreensDuringActivity.f42254i.setButtonBottomLeftLabel(vivofit2DeviceSettingsScreensDuringActivity.getString(Vivofit2DeviceSettingsScreensDuringActivity.i.a(vivofit2DeviceSettingsScreensDuringActivity.f42255j.f33863b1.f185492j).f42268b));
                dialogInterface.dismiss();
                return;
            case 28:
                VivofitDeviceSettings vivofitDeviceSettings = ((VivofitDeviceSettings.a) obj).f42298a;
                vivofitDeviceSettings.f125985k.I1(DeviceSettingsDTO.p.values()[i14]);
                vivofitDeviceSettings.f42292t.setButtonBottomLeftLabel(vivofitDeviceSettings.getString(vivofitDeviceSettings.f125985k.h0().f34017b));
                dialogInterface.dismiss();
                return;
            default:
                VivofitDeviceSettings vivofitDeviceSettings2 = ((VivofitDeviceSettings.b) obj).f42299a;
                vivofitDeviceSettings2.f125985k.D1(DeviceSettingsDTO.j.values()[i14]);
                vivofitDeviceSettings2.f42293v.setButtonBottomLeftLabel(vivofitDeviceSettings2.getString(vivofitDeviceSettings2.f125985k.a0().f33976b));
                dialogInterface.dismiss();
                return;
        }
    }
}
