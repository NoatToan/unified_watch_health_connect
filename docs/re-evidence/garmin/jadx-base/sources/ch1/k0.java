package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class k0 extends fb2.m<DeviceSettingsDTO> {
    public k0(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final /* bridge */ /* synthetic */ boolean h(Object obj) {
        return true;
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t */
    public final int getF93293f() {
        return R.id.device_settings_custom_widget_btn;
    }

    @Override // fb2.m
    public final String u() {
        return this.f70343a.getString(R.string.device_settings_custom_widget);
    }
}
