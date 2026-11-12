package tv;

import android.widget.Toast;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.bikesensors.DeviceSettingsFirmwareUpdate;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import java.util.Timer;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166506a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DeviceSettingsFirmwareUpdate f166507b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f166508c;

    public /* synthetic */ g(DeviceSettingsFirmwareUpdate deviceSettingsFirmwareUpdate, int i14, int i15) {
        this.f166506a = i15;
        this.f166507b = deviceSettingsFirmwareUpdate;
        this.f166508c = i14;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i14 = this.f166506a;
        int i15 = this.f166508c;
        DeviceSettingsFirmwareUpdate deviceSettingsFirmwareUpdate = this.f166507b;
        switch (i14) {
            case 0:
                int i16 = DeviceSettingsFirmwareUpdate.B;
                if (i15 == 2) {
                    deviceSettingsFirmwareUpdate.ca(5, true);
                } else if (i15 == 16) {
                    GCMSettingManager.K(-1L);
                } else if (i15 == 8) {
                    GCMSettingManager.K(-1L);
                    i iVar = deviceSettingsFirmwareUpdate.f30789i;
                    if (iVar != null) {
                        iVar.cancel();
                    }
                    Timer timer = deviceSettingsFirmwareUpdate.f30787g;
                    if (timer != null) {
                        timer.cancel();
                        deviceSettingsFirmwareUpdate.f30787g.purge();
                        deviceSettingsFirmwareUpdate.f30787g = null;
                    }
                    deviceSettingsFirmwareUpdate.f30789i = new i(deviceSettingsFirmwareUpdate);
                    Timer timer2 = new Timer();
                    deviceSettingsFirmwareUpdate.f30787g = timer2;
                    timer2.schedule(deviceSettingsFirmwareUpdate.f30789i, 2000L);
                    deviceSettingsFirmwareUpdate.f30790j = 0;
                    deviceSettingsFirmwareUpdate.ca(0, false);
                }
                deviceSettingsFirmwareUpdate.hideProgressOverlay();
                break;
            default:
                int i17 = DeviceSettingsFirmwareUpdate.B;
                if (8 != i15) {
                    Toast.makeText(deviceSettingsFirmwareUpdate, deviceSettingsFirmwareUpdate.getString(R.string.txt_something_went_wrong_try_again), 0).show();
                    deviceSettingsFirmwareUpdate.finish();
                } else {
                    deviceSettingsFirmwareUpdate.ea();
                    GCMSettingManager.K(-1L);
                    i iVar2 = deviceSettingsFirmwareUpdate.f30789i;
                    if (iVar2 != null) {
                        iVar2.cancel();
                    }
                    Timer timer3 = deviceSettingsFirmwareUpdate.f30787g;
                    if (timer3 != null) {
                        timer3.cancel();
                        deviceSettingsFirmwareUpdate.f30787g.purge();
                        deviceSettingsFirmwareUpdate.f30787g = null;
                    }
                    deviceSettingsFirmwareUpdate.f30789i = new i(deviceSettingsFirmwareUpdate);
                    Timer timer4 = new Timer();
                    deviceSettingsFirmwareUpdate.f30787g = timer4;
                    timer4.schedule(deviceSettingsFirmwareUpdate.f30789i, 2000L);
                }
                break;
        }
    }
}
