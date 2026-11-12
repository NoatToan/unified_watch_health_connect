package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class i0 extends fb2.m<DeviceSettingsDTO> {
    public i0(Context context) {
        super(context);
    }

    @Override // fb2.e
    public final /* bridge */ /* synthetic */ boolean h(Object obj) {
        return true;
    }

    @Override // fb2.m
    public final String s() {
        return b(R.string.stride_length_help);
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t */
    public final int getF93293f() {
        return R.id.user_settings_custom_step_length;
    }

    @Override // fb2.m
    public final String u() {
        return b(R.string.user_setting_custom_stride_length);
    }
}
