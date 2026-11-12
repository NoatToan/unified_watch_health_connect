package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class b2 extends fb2.z<DeviceSettingsDTO> {
    public b2(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        nr0.a aVar = ((DeviceSettingsDTO) obj).f33879j1;
        return aVar != null && aVar.f();
    }

    @Override // fb2.z
    public final String q(DeviceSettingsDTO deviceSettingsDTO) {
        nr0.a aVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2 == null || (aVar = deviceSettingsDTO2.f33879j1) == null) {
            return null;
        }
        return String.valueOf(aVar.b());
    }

    @Override // fb2.z
    /* JADX INFO: renamed from: s */
    public final int getF180417e() {
        return R.id.user_settings_weekly_intensity_minutes;
    }

    @Override // fb2.z
    public final String t() {
        return b(R.string.title_intensity_minutes);
    }
}
