package dh1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import fb2.t;
import java.util.HashMap;
import java.util.Map;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ldh1/n;", "Lfb2/t;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Llu/b;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n extends t<DeviceSettingsDTO, lu.b> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        return deviceSettingsDTO.Z0();
    }

    @Override // fb2.t
    public final Map<lu.b, CharSequence> q(lu.b[] bVarArr) {
        lu.b[] bVarArr2 = bVarArr;
        bVarArr2.getClass();
        HashMap map = new HashMap();
        for (lu.b bVar : bVarArr2) {
            int i14 = bVar.f114924b;
            if (lu.b.LAP == bVar) {
                map.put(bVar, b(i14));
            } else {
                map.put(bVar, c(i14, Integer.valueOf(bVar.f114923a)));
            }
        }
        return map;
    }

    @Override // fb2.t
    public final lu.b r(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        return deviceSettingsDTO2.z0();
    }

    @Override // fb2.t
    public final String s() {
        return b(R.string.audio_prompts_alert_interval_footer);
    }

    @Override // fb2.t
    public final int t() {
        return View.generateViewId();
    }

    @Override // fb2.t
    public final String u() {
        String strB = b(R.string.audio_prompts_alert_interval_header);
        strB.getClass();
        return strB;
    }

    @Override // fb2.t
    public final lu.b[] v(DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        return new lu.b[]{lu.b.LAP, lu.b.MINUTE_1, lu.b.MINUTE_2, lu.b.MINUTE_3, lu.b.MINUTE_4, lu.b.MINUTE_5, lu.b.MINUTE_6, lu.b.MINUTE_7, lu.b.MINUTE_8, lu.b.MINUTE_9, lu.b.MINUTE_10};
    }

    @Override // fb2.t
    public final void w(lu.b bVar, DeviceSettingsDTO deviceSettingsDTO) {
        lu.b bVar2 = bVar;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        if (bVar2 != null) {
            deviceSettingsDTO2.V1(bVar2);
        }
    }
}
