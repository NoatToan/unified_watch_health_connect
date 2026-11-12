package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class u0 extends fb2.m<DeviceSettingsDTO> {
    public u0(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final /* bridge */ /* synthetic */ boolean h(Object obj) {
        return true;
    }

    @Override // fb2.m
    public final int t() {
        return R.id.device_settings_display_btn;
    }

    @Override // fb2.m
    public String u() {
        return this.f70343a.getString(R.string.device_setting_display_options);
    }
}
