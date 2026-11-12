package fh1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;

/* JADX INFO: loaded from: classes10.dex */
public class j extends a1 {
    public j(Context context) {
        super(context);
    }

    @Override // fb2.a
    public final String t() {
        return this.f70343a.getString(R.string.lbl_activity_timer);
    }

    @Override // fh1.a1
    public final com.garmin.android.apps.connectmobile.devices.model.y z(DeviceSettingsDTO deviceSettingsDTO) {
        com.garmin.android.apps.connectmobile.devices.model.z zVarC = deviceSettingsDTO.C();
        if (zVarC == null) {
            return null;
        }
        return zVarC.C("APP_NATIVE_ID_TIMER");
    }
}
