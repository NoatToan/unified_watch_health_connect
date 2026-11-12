package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class j0 extends fb2.w<DeviceSettingsDTO> {
    public j0(Context context) {
        super(context, 50, context.getString(R.string.device_settings_custom_widget_placeholder), context.getString(R.string.device_settings_custom_widget_help));
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        fb2.f.a(deviceSettingsDTO, "Model is required.");
        return deviceSettingsDTO.f33882k1 != null;
    }

    @Override // fb2.i
    public final String q(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        fb2.f.a(deviceSettingsDTO, "Model is required.");
        return deviceSettingsDTO.f33882k1;
    }

    @Override // fb2.i
    public final int r() {
        return R.id.infoMessage;
    }

    @Override // fb2.i
    public final int s() {
        return R.id.inputField;
    }

    @Override // fb2.i
    public final void v(Object obj, String str) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        fb2.f.a(deviceSettingsDTO, "Model is required.");
        deviceSettingsDTO.f33882k1 = str;
    }
}
