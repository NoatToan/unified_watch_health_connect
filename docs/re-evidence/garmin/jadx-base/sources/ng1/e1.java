package ng1;

import android.app.TimePickerDialog;
import android.content.Intent;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.Vivosmart3CreateEditDeviceAlarmActivity;
import java.util.Calendar;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class e1 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125926a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Vivosmart3CreateEditDeviceAlarmActivity f125927b;

    public /* synthetic */ e1(Vivosmart3CreateEditDeviceAlarmActivity vivosmart3CreateEditDeviceAlarmActivity, int i14) {
        this.f125926a = i14;
        this.f125927b = vivosmart3CreateEditDeviceAlarmActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        switch (this.f125926a) {
            case 0:
                Vivosmart3CreateEditDeviceAlarmActivity.a aVar = Vivosmart3CreateEditDeviceAlarmActivity.f42315o;
                Vivosmart3CreateEditDeviceAlarmActivity vivosmart3CreateEditDeviceAlarmActivity = this.f125927b;
                ls0.m mVar = new ls0.m(vivosmart3CreateEditDeviceAlarmActivity, 5);
                Calendar calendar = vivosmart3CreateEditDeviceAlarmActivity.f42323h;
                calendar.getClass();
                int i14 = calendar.get(11);
                Calendar calendar2 = vivosmart3CreateEditDeviceAlarmActivity.f42323h;
                calendar2.getClass();
                int i15 = calendar2.get(12);
                TimePickerDialog timePickerDialog = new TimePickerDialog(vivosmart3CreateEditDeviceAlarmActivity, R.style.GCMTimePicker, mVar, i14, i15, !vivosmart3CreateEditDeviceAlarmActivity.f42325j);
                timePickerDialog.updateTime(i14, i15);
                timePickerDialog.show();
                og.a.W(timePickerDialog, vivosmart3CreateEditDeviceAlarmActivity);
                og.a.w(timePickerDialog, vivosmart3CreateEditDeviceAlarmActivity);
                break;
            default:
                Vivosmart3CreateEditDeviceAlarmActivity.a aVar2 = Vivosmart3CreateEditDeviceAlarmActivity.f42315o;
                Intent intent = new Intent();
                intent.putExtra("extras_alarm_deleted", true);
                Vivosmart3CreateEditDeviceAlarmActivity vivosmart3CreateEditDeviceAlarmActivity2 = this.f125927b;
                intent.putExtra("extras_alarm_id", vivosmart3CreateEditDeviceAlarmActivity2.f42324i);
                vivosmart3CreateEditDeviceAlarmActivity2.setResult(-1, intent);
                vivosmart3CreateEditDeviceAlarmActivity2.finish();
                break;
        }
    }
}
