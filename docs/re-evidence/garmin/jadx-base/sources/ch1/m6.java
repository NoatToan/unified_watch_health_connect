package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lch1/m6;", "Lfb2/t;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m6 extends fb2.t<DeviceSettingsDTO, Boolean> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        return deviceSettingsDTO.K0 != null;
    }

    @Override // fb2.t
    public final Map<Boolean, CharSequence> q(Boolean[] boolArr) {
        boolArr.getClass();
        HashMap map = new HashMap();
        map.put(Boolean.TRUE, b(R.string.common_lbl_automatic));
        map.put(Boolean.FALSE, b(R.string.lbl_off));
        return map;
    }

    @Override // fb2.t
    public final Boolean r(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        return Boolean.valueOf(deviceSettingsDTO2.v1());
    }

    @Override // fb2.t
    public final int t() {
        return View.generateViewId();
    }

    @Override // fb2.t
    public final String u() {
        String string = this.f70343a.getString(R.string.lbl_heart_rate_monitor);
        string.getClass();
        return string;
    }

    @Override // fb2.t
    public final Boolean[] v(DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        return new Boolean[]{Boolean.TRUE, Boolean.FALSE};
    }

    @Override // fb2.t
    public final void w(Boolean bool, DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        deviceSettingsDTO2.K0 = bool;
        deviceSettingsDTO2.S1("opticalHeartRateEnabled");
    }
}
