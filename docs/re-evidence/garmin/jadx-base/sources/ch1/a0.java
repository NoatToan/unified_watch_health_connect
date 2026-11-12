package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a0 extends w3<DeviceSettingsDTO, String> {
    public a0(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        fb2.f.a(deviceSettingsDTO, "Model is required!");
        List<String> list = deviceSettingsDTO.S0;
        return list != null && list.size() > 0;
    }

    @Override // ch1.w3
    public final String q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        fb2.f.a(deviceSettingsDTO2, "Model is required!");
        return deviceSettingsDTO2.R0;
    }

    @Override // ch1.w3
    public final void w(String str, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        fb2.f.a(deviceSettingsDTO2, "Model is required!");
        deviceSettingsDTO2.R0 = str;
    }
}
