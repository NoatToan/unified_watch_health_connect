package kx0;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.text.format.DateFormat;
import android.view.View;
import android.widget.TimePicker;
import aq.z;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.settings.MenstrualCycleReminderSettingsActivity;
import com.garmin.android.apps.connectmobile.menstrualcycle.presentation.util.TextInputActivity;
import java.util.ArrayList;
import o13.t;
import org.joda.time.LocalTime;
import p13.u;
import r22.m0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f107039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MenstrualCycleReminderSettingsActivity f107040b;

    public /* synthetic */ c(MenstrualCycleReminderSettingsActivity menstrualCycleReminderSettingsActivity, int i14) {
        this.f107039a = i14;
        this.f107040b = menstrualCycleReminderSettingsActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f107039a;
        final int i15 = 1;
        final int i16 = 0;
        MenstrualCycleReminderSettingsActivity menstrualCycleReminderSettingsActivity = this.f107040b;
        switch (i14) {
            case 0:
                MenstrualCycleReminderSettingsActivity.a aVar = MenstrualCycleReminderSettingsActivity.f39014o;
                TextInputActivity.a aVar2 = TextInputActivity.f39191b;
                String string = menstrualCycleReminderSettingsActivity.getString(R.string.mct_message);
                string.getClass();
                String string2 = menstrualCycleReminderSettingsActivity.getString(R.string.mct_period_reminder_lbl);
                string2.getClass();
                String str = menstrualCycleReminderSettingsActivity.f39021f;
                if (str == null) {
                    p005kotlin.jvm.internal.s.m("mPeriodText");
                    throw null;
                }
                aVar2.getClass();
                menstrualCycleReminderSettingsActivity.startActivityForResult(TextInputActivity.a.a(menstrualCycleReminderSettingsActivity, string, string2, str), 2);
                return;
            case 1:
                MenstrualCycleReminderSettingsActivity.a aVar3 = MenstrualCycleReminderSettingsActivity.f39014o;
                final MenstrualCycleReminderSettingsActivity menstrualCycleReminderSettingsActivity2 = this.f107040b;
                TimePickerDialog.OnTimeSetListener onTimeSetListener = new TimePickerDialog.OnTimeSetListener() { // from class: kx0.e
                    @Override // android.app.TimePickerDialog.OnTimeSetListener
                    public final void onTimeSet(TimePicker timePicker, int i17, int i18) {
                        int i19 = i16;
                        MenstrualCycleReminderSettingsActivity menstrualCycleReminderSettingsActivity3 = menstrualCycleReminderSettingsActivity2;
                        switch (i19) {
                            case 0:
                                MenstrualCycleReminderSettingsActivity.a aVar4 = MenstrualCycleReminderSettingsActivity.f39014o;
                                menstrualCycleReminderSettingsActivity3.f39023h = new LocalTime(i17, i18);
                                menstrualCycleReminderSettingsActivity3.fa();
                                break;
                            default:
                                MenstrualCycleReminderSettingsActivity.a aVar5 = MenstrualCycleReminderSettingsActivity.f39014o;
                                menstrualCycleReminderSettingsActivity3.f39019d = new LocalTime(i17, i18);
                                menstrualCycleReminderSettingsActivity3.ha();
                                break;
                        }
                    }
                };
                LocalTime localTime = menstrualCycleReminderSettingsActivity2.f39023h;
                if (localTime == null) {
                    p005kotlin.jvm.internal.s.m("mLoggingTime");
                    throw null;
                }
                int hourOfDay = localTime.getHourOfDay();
                LocalTime localTime2 = menstrualCycleReminderSettingsActivity2.f39023h;
                if (localTime2 == null) {
                    p005kotlin.jvm.internal.s.m("mLoggingTime");
                    throw null;
                }
                TimePickerDialog timePickerDialog = new TimePickerDialog(menstrualCycleReminderSettingsActivity2, R.style.GCMTimePicker, onTimeSetListener, hourOfDay, localTime2.getMinuteOfHour(), DateFormat.is24HourFormat(menstrualCycleReminderSettingsActivity2));
                timePickerDialog.show();
                og.a.W(timePickerDialog, menstrualCycleReminderSettingsActivity2);
                og.a.w(timePickerDialog, menstrualCycleReminderSettingsActivity2);
                return;
            case 2:
                MenstrualCycleReminderSettingsActivity.a aVar4 = MenstrualCycleReminderSettingsActivity.f39014o;
                t tVar = menstrualCycleReminderSettingsActivity.f39017b;
                a[] aVarArr = (a[]) tVar.getValue();
                ArrayList arrayList = new ArrayList(aVarArr.length);
                for (a aVar5 : aVarArr) {
                    arrayList.add(aVar5.a(menstrualCycleReminderSettingsActivity));
                }
                String[] strArr = (String[]) arrayList.toArray(new String[0]);
                a[] aVarArr2 = (a[]) tVar.getValue();
                a aVar6 = menstrualCycleReminderSettingsActivity.f39024i;
                if (aVar6 == null) {
                    p005kotlin.jvm.internal.s.m("mLoggingFrequency");
                    throw null;
                }
                new androidx.appcompat.app.e.a(menstrualCycleReminderSettingsActivity).setTitle(menstrualCycleReminderSettingsActivity.getString(R.string.device_setting_alarm_frequency)).setSingleChoiceItems(strArr, u.M(aVarArr2, aVar6), (DialogInterface.OnClickListener) null).setNegativeButton(menstrualCycleReminderSettingsActivity.getString(R.string.lbl_cancel), (DialogInterface.OnClickListener) null).setPositiveButton(menstrualCycleReminderSettingsActivity.getString(R.string.lbl_ok), new f(menstrualCycleReminderSettingsActivity, 0)).show();
                return;
            case 3:
                MenstrualCycleReminderSettingsActivity.a aVar7 = MenstrualCycleReminderSettingsActivity.f39014o;
                TextInputActivity.a aVar8 = TextInputActivity.f39191b;
                String string3 = menstrualCycleReminderSettingsActivity.getString(R.string.mct_message);
                string3.getClass();
                String string4 = menstrualCycleReminderSettingsActivity.getString(R.string.mct_logging_reminder_lbl);
                string4.getClass();
                String str2 = menstrualCycleReminderSettingsActivity.f39025j;
                if (str2 == null) {
                    p005kotlin.jvm.internal.s.m("mLoggingText");
                    throw null;
                }
                aVar8.getClass();
                menstrualCycleReminderSettingsActivity.startActivityForResult(TextInputActivity.a.a(menstrualCycleReminderSettingsActivity, string3, string4, str2), 3);
                return;
            case 4:
                MenstrualCycleReminderSettingsActivity.a aVar9 = MenstrualCycleReminderSettingsActivity.f39014o;
                i2.a aVar10 = i2.f36769a;
                a2 a2Var = a2.GENERAL;
                aVar10.getClass();
                i2.a.b(a2Var, "MenstrualCycleReminderSettingsActivity", "showEnableAlarmsAndRemindersDialog positive button pressed, showing settings screen.");
                menstrualCycleReminderSettingsActivity.startActivity(new Intent("android.settings.REQUEST_SCHEDULE_EXACT_ALARM", Uri.parse("package:" + menstrualCycleReminderSettingsActivity.getPackageName())));
                return;
            case 5:
                MenstrualCycleReminderSettingsActivity.a aVar11 = MenstrualCycleReminderSettingsActivity.f39014o;
                i2.a aVar12 = i2.f36769a;
                a2 a2Var2 = a2.GENERAL;
                aVar12.getClass();
                i2.a.b(a2Var2, "MenstrualCycleReminderSettingsActivity", "showEnableAlarmsAndRemindersDialog dialog negative button pressed, finishing the activity.");
                m0 m0Var = menstrualCycleReminderSettingsActivity.f39028m;
                if (m0Var != null) {
                    m0Var.dismiss();
                }
                menstrualCycleReminderSettingsActivity.finish();
                return;
            case 6:
                MenstrualCycleReminderSettingsActivity.a aVar13 = MenstrualCycleReminderSettingsActivity.f39014o;
                final MenstrualCycleReminderSettingsActivity menstrualCycleReminderSettingsActivity3 = this.f107040b;
                TimePickerDialog.OnTimeSetListener onTimeSetListener2 = new TimePickerDialog.OnTimeSetListener() { // from class: kx0.e
                    @Override // android.app.TimePickerDialog.OnTimeSetListener
                    public final void onTimeSet(TimePicker timePicker, int i17, int i18) {
                        int i19 = i15;
                        MenstrualCycleReminderSettingsActivity menstrualCycleReminderSettingsActivity4 = menstrualCycleReminderSettingsActivity3;
                        switch (i19) {
                            case 0:
                                MenstrualCycleReminderSettingsActivity.a aVar14 = MenstrualCycleReminderSettingsActivity.f39014o;
                                menstrualCycleReminderSettingsActivity4.f39023h = new LocalTime(i17, i18);
                                menstrualCycleReminderSettingsActivity4.fa();
                                break;
                            default:
                                MenstrualCycleReminderSettingsActivity.a aVar15 = MenstrualCycleReminderSettingsActivity.f39014o;
                                menstrualCycleReminderSettingsActivity4.f39019d = new LocalTime(i17, i18);
                                menstrualCycleReminderSettingsActivity4.ha();
                                break;
                        }
                    }
                };
                LocalTime localTime3 = menstrualCycleReminderSettingsActivity3.f39019d;
                if (localTime3 == null) {
                    p005kotlin.jvm.internal.s.m("mPeriodTime");
                    throw null;
                }
                int hourOfDay2 = localTime3.getHourOfDay();
                LocalTime localTime4 = menstrualCycleReminderSettingsActivity3.f39019d;
                if (localTime4 == null) {
                    p005kotlin.jvm.internal.s.m("mPeriodTime");
                    throw null;
                }
                TimePickerDialog timePickerDialog2 = new TimePickerDialog(menstrualCycleReminderSettingsActivity3, R.style.GCMTimePicker, onTimeSetListener2, hourOfDay2, localTime4.getMinuteOfHour(), DateFormat.is24HourFormat(menstrualCycleReminderSettingsActivity3));
                timePickerDialog2.show();
                og.a.W(timePickerDialog2, menstrualCycleReminderSettingsActivity3);
                og.a.w(timePickerDialog2, menstrualCycleReminderSettingsActivity3);
                return;
            default:
                MenstrualCycleReminderSettingsActivity.a aVar14 = MenstrualCycleReminderSettingsActivity.f39014o;
                rk1.b.e eVar = new rk1.b.e(menstrualCycleReminderSettingsActivity);
                eVar.h((String[]) menstrualCycleReminderSettingsActivity.f39016a.getValue(), false);
                String string5 = menstrualCycleReminderSettingsActivity.getString(R.string.device_setting_alarm_frequency);
                rk1.b.d dVar = eVar.f153344b;
                dVar.f153346b = string5;
                eVar.e(0);
                eVar.d(5);
                eVar.c(Integer.valueOf(menstrualCycleReminderSettingsActivity.da() - 1));
                eVar.f(new z(menstrualCycleReminderSettingsActivity, 2));
                dVar.f153345a = 1;
                eVar.b().show();
                return;
        }
    }
}
