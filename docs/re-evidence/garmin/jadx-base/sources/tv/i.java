package tv;

import com.garmin.android.apps.connectmobile.bikesensors.DeviceSettingsFirmwareUpdate;
import com.garmin.android.apps.connectmobile.i2;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes7.dex */
public class i extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceSettingsFirmwareUpdate f166510a;

    public i(DeviceSettingsFirmwareUpdate deviceSettingsFirmwareUpdate) {
        this.f166510a = deviceSettingsFirmwareUpdate;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        try {
            this.f166510a.f30783c.d();
        } catch (FileNotFoundException unused) {
            i2.i("VectorSettingsManager", "Firmware update failed");
        } catch (IOException unused2) {
            i2.i("VectorSettingsManager", "Firmware update failed");
        }
    }
}
