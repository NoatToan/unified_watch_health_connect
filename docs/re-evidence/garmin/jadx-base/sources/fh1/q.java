package fh1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class q extends a1 {
    public q(Context context) {
        super(context);
    }

    @Override // fb2.a
    public final String t() {
        return this.f70343a.getString(R.string.title_intensity_minutes);
    }

    @Override // fh1.a1
    public final com.garmin.android.apps.connectmobile.devices.model.y z(DeviceSettingsDTO deviceSettingsDTO) {
        com.garmin.android.apps.connectmobile.devices.model.z zVarH = deviceSettingsDTO.H();
        if (zVarH == null) {
            return null;
        }
        return zVarH.C("APP_NATIVE_ID_ACTIVE_MINUTES");
    }
}
