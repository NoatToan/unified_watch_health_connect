package ls0;

import android.app.TimePickerDialog;
import android.text.format.DateFormat;
import android.widget.TimePicker;
import androidx.fragment.app.Fragment;
import c22.j0;
import c22.l3;
import com.garmin.android.apps.connectmobile.jet_lag.presentation.setup.TripFlightFragment;
import com.garmin.android.apps.connectmobile.settings.devices.AlarmDeviceSettings;
import com.garmin.android.apps.connectmobile.settings.devices.CreateEditDeviceAlarmActivity;
import com.garmin.android.apps.connectmobile.settings.devices.DeviceUserSettingsActivity;
import com.garmin.android.apps.connectmobile.settings.devices.Vivosmart3CreateEditDeviceAlarmActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceUserSettingActivityDefault;
import com.garmin.android.apps.connectmobile.traininginitiative.viewmodels.AddTIEventViewModel;
import com.garmin.android.apps.connectmobile.view.view_3_0.GCMComplexTwoLineButton;
import java.util.Calendar;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.joda.time.DateTime;
import org.joda.time.LocalTime;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements TimePickerDialog.OnTimeSetListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f114735a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f114736b;

    public /* synthetic */ m(Object obj, int i14) {
        this.f114735a = i14;
        this.f114736b = obj;
    }

    @Override // android.app.TimePickerDialog.OnTimeSetListener
    public final void onTimeSet(TimePicker timePicker, int i14, int i15) {
        String strD1;
        String strD2;
        int i16 = this.f114735a;
        Object obj = this.f114736b;
        switch (i16) {
            case 0:
                int i17 = TripFlightFragment.f37039n;
                ((e23.l) obj).invoke(new LocalTime(i14, i15));
                return;
            case 1:
                AlarmDeviceSettings alarmDeviceSettings = (AlarmDeviceSettings) obj;
                com.garmin.android.apps.connectmobile.devices.model.i iVar = alarmDeviceSettings.f41840g;
                iVar.getClass();
                iVar.f34182b = (i14 * 60) + i15;
                Calendar calendar = Calendar.getInstance(Locale.getDefault());
                calendar.set(11, i14);
                calendar.set(12, i15);
                GCMComplexTwoLineButton gCMComplexTwoLineButton = alarmDeviceSettings.f41835b;
                gCMComplexTwoLineButton.getClass();
                gCMComplexTwoLineButton.setButtonBottomLeftLabel(DateFormat.getTimeFormat(alarmDeviceSettings).format(calendar.getTime()));
                return;
            case 2:
                CreateEditDeviceAlarmActivity createEditDeviceAlarmActivity = (CreateEditDeviceAlarmActivity) obj;
                Calendar calendar2 = createEditDeviceAlarmActivity.f41947j;
                calendar2.getClass();
                calendar2.set(11, i14);
                Calendar calendar3 = createEditDeviceAlarmActivity.f41947j;
                calendar3.getClass();
                calendar3.set(12, i15);
                int iCa = CreateEditDeviceAlarmActivity.ca(createEditDeviceAlarmActivity.f41947j);
                if (createEditDeviceAlarmActivity.f41949l) {
                    strD1 = j0.u(iCa);
                } else {
                    l3.f23124b.getClass();
                    strD1 = l3.a.d1(iCa);
                }
                GCMComplexTwoLineButton gCMComplexTwoLineButton2 = createEditDeviceAlarmActivity.f41939b;
                gCMComplexTwoLineButton2.getClass();
                gCMComplexTwoLineButton2.setButtonBottomLeftLabel(strD1);
                createEditDeviceAlarmActivity.f41950m = true;
                return;
            case 3:
                l3.f23124b.getClass();
                long jZ = l3.a.z(i14, i15);
                DeviceUserSettingsActivity deviceUserSettingsActivity = DeviceUserSettingsActivity.this;
                deviceUserSettingsActivity.f42015c.Z0(jZ);
                deviceUserSettingsActivity.ia();
                return;
            case 4:
                l3.f23124b.getClass();
                long jZ2 = l3.a.z(i14, i15);
                DeviceUserSettingsActivity deviceUserSettingsActivity2 = DeviceUserSettingsActivity.this;
                deviceUserSettingsActivity2.f42015c.j1(jZ2);
                deviceUserSettingsActivity2.ka();
                return;
            case 5:
                Vivosmart3CreateEditDeviceAlarmActivity vivosmart3CreateEditDeviceAlarmActivity = (Vivosmart3CreateEditDeviceAlarmActivity) obj;
                Calendar calendar4 = vivosmart3CreateEditDeviceAlarmActivity.f42323h;
                calendar4.getClass();
                calendar4.set(11, i14);
                Calendar calendar5 = vivosmart3CreateEditDeviceAlarmActivity.f42323h;
                calendar5.getClass();
                calendar5.set(12, i15);
                int iCa2 = Vivosmart3CreateEditDeviceAlarmActivity.ca(vivosmart3CreateEditDeviceAlarmActivity.f42323h);
                if (vivosmart3CreateEditDeviceAlarmActivity.f42325j) {
                    strD2 = j0.u(iCa2);
                } else {
                    l3.f23124b.getClass();
                    strD2 = l3.a.d1(iCa2);
                }
                GCMComplexTwoLineButton gCMComplexTwoLineButton3 = vivosmart3CreateEditDeviceAlarmActivity.f42316a;
                gCMComplexTwoLineButton3.getClass();
                gCMComplexTwoLineButton3.setButtonBottomLeftLabel(strD2);
                vivosmart3CreateEditDeviceAlarmActivity.f42326k = true;
                return;
            case 6:
                nv2.f fVar = (nv2.f) obj;
                cx2.i.a aVar = cx2.i.f56681a;
                Fragment fragment = fVar.f127976a;
                aVar.getClass();
                if (!cx2.i.a.a(fragment)) {
                    fVar.f127980e.getClass();
                    return;
                }
                fVar.f127977b.h(fVar.f127978c, fVar.f127979d, Long.valueOf(TimeUnit.MINUTES.toSeconds(i15) + TimeUnit.HOURS.toSeconds(i14)));
                return;
            case 7:
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0 a0Var = (com.garmin.android.apps.connectmobile.traininginitiative.ui.a0) obj;
                com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.a aVar2 = com.garmin.android.apps.connectmobile.traininginitiative.ui.a0.I1;
                DateTime dateTime = new DateTime();
                DateTime dateTime2 = a0Var.f45806p;
                if (dateTime2 == null) {
                    p005kotlin.jvm.internal.s.m("mPickerStartDateTime");
                    throw null;
                }
                DateTime dateTimeWithYear = dateTime.withYear(dateTime2.getYear());
                DateTime dateTime3 = a0Var.f45806p;
                if (dateTime3 == null) {
                    p005kotlin.jvm.internal.s.m("mPickerStartDateTime");
                    throw null;
                }
                DateTime dateTimeWithMonthOfYear = dateTimeWithYear.withMonthOfYear(dateTime3.getMonthOfYear());
                DateTime dateTime4 = a0Var.f45806p;
                if (dateTime4 == null) {
                    p005kotlin.jvm.internal.s.m("mPickerStartDateTime");
                    throw null;
                }
                DateTime dateTimeWithMillisOfSecond = dateTimeWithMonthOfYear.withDayOfMonth(dateTime4.getDayOfMonth()).withHourOfDay(i14).withMinuteOfHour(i15).withSecondOfMinute(0).withMillisOfSecond(0);
                DateTime dateTime5 = a0Var.f45806p;
                if (dateTime5 == null) {
                    p005kotlin.jvm.internal.s.m("mPickerStartDateTime");
                    throw null;
                }
                DateTime dateTimeWithZone = dateTimeWithMillisOfSecond.withZone(dateTime5.getZone());
                dateTimeWithZone.getClass();
                a0Var.f45806p = dateTimeWithZone;
                AddTIEventViewModel addTIEventViewModelF6 = a0Var.F6();
                DateTime dateTime6 = a0Var.f45806p;
                if (dateTime6 == null) {
                    p005kotlin.jvm.internal.s.m("mPickerStartDateTime");
                    throw null;
                }
                addTIEventViewModelF6.L6(dateTime6);
                GCMComplexTwoLineButton gCMComplexTwoLineButton4 = a0Var.f45802n;
                if (gCMComplexTwoLineButton4 == null) {
                    p005kotlin.jvm.internal.s.m("mStartTimeButton");
                    throw null;
                }
                j0 j0Var = j0.f23099a;
                int hourOfDay = dateTimeWithZone.getHourOfDay();
                int minuteOfHour = dateTimeWithZone.getMinuteOfHour();
                j0Var.getClass();
                gCMComplexTwoLineButton4.setButtonBottomLeftLabel(j0.C(hourOfDay, minuteOfHour));
                a0Var.E6();
                return;
            case 8:
                l3.f23124b.getClass();
                long jZ3 = l3.a.z(i14, i15);
                DeviceUserSettingActivityDefault deviceUserSettingActivityDefault = DeviceUserSettingActivityDefault.this;
                deviceUserSettingActivityDefault.f42749c.Z0(jZ3);
                deviceUserSettingActivityDefault.ga();
                return;
            case 9:
                l3.f23124b.getClass();
                long jZ4 = l3.a.z(i14, i15);
                DeviceUserSettingActivityDefault deviceUserSettingActivityDefault2 = DeviceUserSettingActivityDefault.this;
                deviceUserSettingActivityDefault2.f42749c.j1(jZ4);
                deviceUserSettingActivityDefault2.ha();
                return;
            default:
                l3.f23124b.getClass();
                long jZ5 = l3.a.z(i14, i15);
                xg1.i<Double> iVar2 = ((xg1.p) obj).f190916a;
                if (iVar2 != null) {
                    iVar2.a(Double.valueOf(jZ5));
                    return;
                }
                return;
        }
    }
}
