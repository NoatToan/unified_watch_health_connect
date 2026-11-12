package ng1;

import android.app.TimePickerDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.settings.devices.AlarmSoundActivity;
import com.garmin.android.apps.connectmobile.settings.devices.CreateEditDeviceAlarmActivity;
import java.util.Calendar;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class u implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f126012a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CreateEditDeviceAlarmActivity f126013b;

    public /* synthetic */ u(CreateEditDeviceAlarmActivity createEditDeviceAlarmActivity, int i14) {
        this.f126012a = i14;
        this.f126013b = createEditDeviceAlarmActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view2) {
        int i14 = this.f126012a;
        CreateEditDeviceAlarmActivity createEditDeviceAlarmActivity = this.f126013b;
        switch (i14) {
            case 0:
                CreateEditDeviceAlarmActivity.a aVar = CreateEditDeviceAlarmActivity.f41935r;
                CreateEditDeviceAlarmActivity createEditDeviceAlarmActivity2 = this.f126013b;
                ls0.m mVar = new ls0.m(createEditDeviceAlarmActivity2, 2);
                Calendar calendar = createEditDeviceAlarmActivity2.f41947j;
                calendar.getClass();
                int i15 = calendar.get(11);
                Calendar calendar2 = createEditDeviceAlarmActivity2.f41947j;
                calendar2.getClass();
                int i16 = calendar2.get(12);
                TimePickerDialog timePickerDialog = new TimePickerDialog(createEditDeviceAlarmActivity2, R.style.GCMTimePicker, mVar, i15, i16, !createEditDeviceAlarmActivity2.f41949l);
                timePickerDialog.updateTime(i15, i16);
                timePickerDialog.show();
                og.a.W(timePickerDialog, createEditDeviceAlarmActivity2);
                og.a.w(timePickerDialog, createEditDeviceAlarmActivity2);
                break;
            case 1:
                CreateEditDeviceAlarmActivity.a aVar2 = CreateEditDeviceAlarmActivity.f41935r;
                AlarmSoundActivity.a aVar3 = AlarmSoundActivity.f41849e;
                com.garmin.android.apps.connectmobile.devices.model.i iVar = createEditDeviceAlarmActivity.f41943f;
                aVar3.getClass();
                Intent intent = new Intent(createEditDeviceAlarmActivity, (Class<?>) AlarmSoundActivity.class);
                intent.putExtra("EXTRAS_DEVICE_ALARM", iVar);
                createEditDeviceAlarmActivity.startActivityForResult(intent, 102);
                break;
            default:
                zb0.u0 u0Var = createEditDeviceAlarmActivity.f41953p;
                if (u0Var != null && (u0Var == zb0.u0.T1 || u0Var == zb0.u0.f203705c2)) {
                    String string = createEditDeviceAlarmActivity.getString(R.string.remove_alarm_confirmation);
                    string.getClass();
                    new androidx.appcompat.app.e.a(createEditDeviceAlarmActivity).setMessage(string).setPositiveButton(R.string.lbl_delete, new kx0.f(createEditDeviceAlarmActivity, 15)).setNegativeButton(R.string.lbl_cancel, (DialogInterface.OnClickListener) null).create().show();
                } else {
                    Intent intent2 = new Intent();
                    intent2.putExtra("extras_alarm_deleted", true);
                    intent2.putExtra("extras_alarm_id", createEditDeviceAlarmActivity.f41948k);
                    createEditDeviceAlarmActivity.setResult(-1, intent2);
                    createEditDeviceAlarmActivity.finish();
                }
                break;
        }
    }
}
