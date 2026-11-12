package ch1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lch1/j5;", "Lch1/v5;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class j5 extends v5 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j5(Context context) {
        super(context);
        context.getClass();
        this.f27487d.put(DeviceSettingsDTO.q.ANALOG_GENERIC_1, Integer.valueOf(R.id.device_settings_vivofit3_watch_face_1));
        this.f27487d.put(DeviceSettingsDTO.q.ANALOG_GENERIC_2, Integer.valueOf(R.id.device_settings_vivofit3_watch_face_2));
        this.f27487d.put(DeviceSettingsDTO.q.ANALOG_GENERIC_3, Integer.valueOf(R.id.device_settings_vivofit3_watch_face_3));
        this.f27487d.put(DeviceSettingsDTO.q.ANALOG_GENERIC_4, Integer.valueOf(R.id.device_settings_vivofit3_watch_face_4));
        this.f27487d.put(DeviceSettingsDTO.q.ANALOG_GENERIC_5, Integer.valueOf(R.id.device_settings_vivofit3_watch_face_5));
        this.f27487d.put(DeviceSettingsDTO.q.ANALOG_GENERIC_6, Integer.valueOf(R.id.device_settings_vivofit3_watch_face_6));
        this.f27487d.put(DeviceSettingsDTO.q.ANALOG_GENERIC_7, Integer.valueOf(R.id.device_settings_vivofit3_watch_face_7));
        this.f27487d.put(DeviceSettingsDTO.q.ANALOG_GENERIC_8, Integer.valueOf(R.id.device_settings_vivofit3_watch_face_8));
    }
}
