package fh1;

import android.content.Context;
import android.view.View;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class e extends fb2.a<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f71588i = View.generateViewId();

    public e(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        fb2.f.a(deviceSettingsDTO, "Model is required.");
        return deviceSettingsDTO.C() != null;
    }

    @Override // fb2.a
    public final boolean q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        fb2.f.a(deviceSettingsDTO2, "Model is required.");
        if (deviceSettingsDTO2.C() != null) {
            return deviceSettingsDTO2.C().f34342b;
        }
        return false;
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71595i() {
        return f71588i;
    }

    @Override // fb2.a
    public final String t() {
        return this.f70343a.getString(R.string.device_screen_last_displayed);
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        fb2.f.a(deviceSettingsDTO, "Model is required.");
        com.garmin.android.apps.connectmobile.devices.model.z zVarC = deviceSettingsDTO.C();
        if (zVarC != null) {
            zVarC.f34342b = z14;
        }
    }
}
