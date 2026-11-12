package tv;

import android.content.DialogInterface;
import com.garmin.android.apps.connectmobile.bikesensors.DeviceSettingsFirmwareUpdate;
import com.garmin.android.apps.connectmobile.devices.DeviceDetailsActivity;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceSettingsFirmwareUpdate f166503b;

    public /* synthetic */ e(DeviceSettingsFirmwareUpdate deviceSettingsFirmwareUpdate, int i14) {
        this.f166502a = i14;
        this.f166503b = deviceSettingsFirmwareUpdate;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i14) {
        int i15 = this.f166502a;
        DeviceSettingsFirmwareUpdate deviceSettingsFirmwareUpdate = this.f166503b;
        switch (i15) {
            case 0:
                int i16 = DeviceSettingsFirmwareUpdate.B;
                deviceSettingsFirmwareUpdate.getClass();
                dialogInterface.dismiss();
                if (deviceSettingsFirmwareUpdate.f30796p) {
                    DeviceDetailsActivity.na(deviceSettingsFirmwareUpdate, deviceSettingsFirmwareUpdate.f30794n);
                }
                deviceSettingsFirmwareUpdate.setResult(-1);
                deviceSettingsFirmwareUpdate.finish();
                break;
            default:
                int i17 = DeviceSettingsFirmwareUpdate.B;
                dialogInterface.dismiss();
                long jF = deviceSettingsFirmwareUpdate.f30783c.f(deviceSettingsFirmwareUpdate, deviceSettingsFirmwareUpdate.f30784d);
                deviceSettingsFirmwareUpdate.f30785e = jF;
                deviceSettingsFirmwareUpdate.f30783c.f166541d = deviceSettingsFirmwareUpdate.f30791k;
                GCMSettingManager.K(jF);
                deviceSettingsFirmwareUpdate.ca(5, true);
                break;
        }
    }
}
