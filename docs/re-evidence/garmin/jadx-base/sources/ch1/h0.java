package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class h0 extends fb2.z<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27359e;

    public h0(Context context) {
        super(context);
        this.f27359e = this.f70343a.getString(R.string.device_setting_orientation);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        return ((DeviceSettingsDTO) obj).j0() != null;
    }

    @Override // fb2.z
    public final String q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        if (deviceSettingsDTO2.j0() == null) {
            return this.f70343a.getString(R.string.device_settings_button_facing_right);
        }
        DeviceSettingsDTO.r rVarJ0 = deviceSettingsDTO2.j0();
        DeviceSettingsDTO.r rVar = DeviceSettingsDTO.r.LANDSCAPE;
        Context context = this.f70343a;
        return rVarJ0 == rVar ? context.getString(R.string.device_settings_button_facing_right) : context.getString(R.string.device_settings_button_facing_left);
    }

    @Override // fb2.z
    /* JADX INFO: renamed from: s */
    public final int getF27419g() {
        return R.id.device_settings_orientation_btn;
    }

    @Override // fb2.z
    public final String t() {
        return this.f27359e;
    }

    public h0(Context context, String str) {
        super(context);
        this.f27359e = str;
    }
}
