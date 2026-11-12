package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.gfdi.configuration.SupportedCapability;

/* JADX INFO: loaded from: classes10.dex */
public class l1 extends fb2.m<DeviceSettingsDTO> {
    public l1(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        return km2.a.i(((DeviceSettingsDTO) obj).f33860a, null, SupportedCapability.HANDS_CALIBRATION.ordinal());
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t */
    public final int getF27322f() {
        return R.id.device_settings_hands_calibration;
    }

    @Override // fb2.m
    public final String u() {
        return this.f70343a.getString(R.string.device_settings_hands_calibration);
    }
}
