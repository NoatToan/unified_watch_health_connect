package ch1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.Locale;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lch1/l4;", "Lfb2/a;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l4 extends fb2.a<DeviceSettingsDTO> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((DeviceSettingsDTO) obj).getClass();
        return false;
    }

    @Override // fb2.a
    public final boolean q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        com.garmin.android.apps.connectmobile.devices.model.h hVar = deviceSettingsDTO2.f33885m;
        if (hVar != null) {
            return p005kotlin.jvm.internal.s.g(hVar.getLowSpo2AlertEnabled(), Boolean.TRUE);
        }
        return false;
    }

    @Override // fb2.a
    public final String r() {
        return c22.b0.b(null).equalsIgnoreCase(Locale.JAPAN.getCountry()) ? b(R.string.device_settings_blood_ox_alert_help_text) : b(R.string.device_settings_sp02_alert_help_text);
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s */
    public final int getF71586i() {
        return R.id.device_settings_low_spo2_alert;
    }

    @Override // fb2.a
    public final String t() {
        String strB = b(R.string.device_settings_alert);
        strB.getClass();
        return strB;
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        com.garmin.android.apps.connectmobile.devices.model.h hVar = deviceSettingsDTO.f33885m;
        if (hVar != null) {
            hVar.D(Boolean.valueOf(z14));
        }
    }
}
