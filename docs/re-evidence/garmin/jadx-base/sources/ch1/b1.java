package ch1;

import android.content.Context;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;

/* JADX INFO: loaded from: classes10.dex */
public class b1 extends b0 {
    public b1(Context context) {
        super(context);
    }

    @Override // ch1.b0, ch1.w3
    public final HashMap u() {
        HashMap map = new HashMap();
        map.put(DeviceSettingsDTO.q.DIGITAL_TRADITIONAL, Integer.valueOf(R.id.device_settings_fr30_watch_face_digital_traditional_image));
        map.put(DeviceSettingsDTO.q.ANALOG_TRADITIONAL, Integer.valueOf(R.id.device_settings_fr30_watch_face_analog_traditional_image));
        return map;
    }

    @Override // ch1.b0
    public final int y() {
        return R.layout.gcm_fr30_watch_mode;
    }
}
