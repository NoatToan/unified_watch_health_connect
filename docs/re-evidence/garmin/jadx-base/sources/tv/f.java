package tv;

import android.text.TextUtils;
import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.bikesensors.DeviceSettingsFirmwareUpdate;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.view.GCMComplexBanner;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceSettingsFirmwareUpdate f166505b;

    public /* synthetic */ f(DeviceSettingsFirmwareUpdate deviceSettingsFirmwareUpdate, int i14) {
        this.f166504a = i14;
        this.f166505b = deviceSettingsFirmwareUpdate;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f166504a;
        int i15 = 0;
        DeviceSettingsFirmwareUpdate deviceSettingsFirmwareUpdate = this.f166505b;
        switch (i14) {
            case 0:
                deviceSettingsFirmwareUpdate.f30802x.setProgress(deviceSettingsFirmwareUpdate.f30790j);
                break;
            case 1:
                deviceSettingsFirmwareUpdate.f30802x.setProgress(100.0f);
                deviceSettingsFirmwareUpdate.f30802x.setStyle(GCMComplexBanner.c.ERROR);
                deviceSettingsFirmwareUpdate.f30802x.setPrimaryText(deviceSettingsFirmwareUpdate.getString(R.string.lbl_installation_failed));
                deviceSettingsFirmwareUpdate.f30799t.setText(deviceSettingsFirmwareUpdate.getString(R.string.device_settings_vector_code_update_failure_title));
                break;
            case 2:
                deviceSettingsFirmwareUpdate.f30802x.setProgress(100.0f);
                deviceSettingsFirmwareUpdate.f30802x.setStyle(GCMComplexBanner.c.WARNING);
                deviceSettingsFirmwareUpdate.f30802x.setPrimaryText(deviceSettingsFirmwareUpdate.f30793m);
                deviceSettingsFirmwareUpdate.f30802x.setSecondaryText(deviceSettingsFirmwareUpdate.getString(R.string.device_settings_vector_update_sent));
                new ac2.d(deviceSettingsFirmwareUpdate.getApplicationContext()).a(deviceSettingsFirmwareUpdate.f30781a.f30870e, wb2.g.RECEIVED);
                androidx.appcompat.app.e.a aVar = new androidx.appcompat.app.e.a(deviceSettingsFirmwareUpdate);
                aVar.setTitle(deviceSettingsFirmwareUpdate.getString(R.string.device_settings_vector_update_sent));
                aVar.setMessage(deviceSettingsFirmwareUpdate.getString(R.string.msg_device_firmware_update_sent));
                aVar.setCancelable(true);
                aVar.setPositiveButton(deviceSettingsFirmwareUpdate.getString(R.string.lbl_ok), new e(deviceSettingsFirmwareUpdate, i15));
                aVar.create().show();
                break;
            case 3:
                deviceSettingsFirmwareUpdate.f30802x.setProgress(deviceSettingsFirmwareUpdate.f30790j);
                deviceSettingsFirmwareUpdate.f30802x.setPrimaryText(deviceSettingsFirmwareUpdate.f30793m);
                deviceSettingsFirmwareUpdate.f30802x.setSecondaryText(deviceSettingsFirmwareUpdate.getString(R.string.device_settings_vector_sending_updates));
                deviceSettingsFirmwareUpdate.f30802x.setStyle(GCMComplexBanner.c.INFO);
                break;
            default:
                int i16 = DeviceSettingsFirmwareUpdate.B;
                deviceSettingsFirmwareUpdate.hideProgressOverlay();
                GCMSettingManager.K(-1L);
                if (TextUtils.isEmpty(deviceSettingsFirmwareUpdate.f30784d)) {
                    Toast.makeText(deviceSettingsFirmwareUpdate, deviceSettingsFirmwareUpdate.getString(R.string.txt_something_went_wrong_try_again), 0).show();
                    deviceSettingsFirmwareUpdate.finish();
                }
                break;
        }
    }
}
