package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class e0 extends fb2.m<DeviceSettingsDTO> {
    public e0(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        fb2.f.a((DeviceSettingsDTO) obj, "Model is required");
        return true;
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t */
    public final int getF27322f() {
        return R.id.device_settings_color_theme_btn;
    }

    @Override // fb2.m
    public final String u() {
        return b(R.string.device_setting_color_theme);
    }
}
