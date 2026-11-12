package tv;

import com.garmin.android.apps.connectmobile.bikesensors.DeviceSettingsFirmwareUpdate;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes7.dex */
public class h extends TimerTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeviceSettingsFirmwareUpdate f166509a;

    public h(DeviceSettingsFirmwareUpdate deviceSettingsFirmwareUpdate) {
        this.f166509a = deviceSettingsFirmwareUpdate;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        DeviceSettingsFirmwareUpdate deviceSettingsFirmwareUpdate = this.f166509a;
        deviceSettingsFirmwareUpdate.f30782b.b(deviceSettingsFirmwareUpdate.f30785e);
    }
}
