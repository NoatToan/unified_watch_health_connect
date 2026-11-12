package dh1;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import c22.l3;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import fb2.z;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ldh1/r;", "Lfb2/z;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r extends z<DeviceSettingsDTO> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        return deviceSettingsDTO.V0();
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0057  */
    @Override // fb2.z
    public final String q(DeviceSettingsDTO deviceSettingsDTO) {
        String strB;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        if (!deviceSettingsDTO2.o0()) {
            String strB2 = b(R.string.lbl_off);
            strB2.getClass();
            return strB2;
        }
        lu.e.a aVar = lu.e.f114944d;
        String str = deviceSettingsDTO2.f33904w1;
        aVar.getClass();
        String strB3 = b(lu.e.a.a(str).f114950a);
        strB3.getClass();
        lu.b bVarP0 = deviceSettingsDTO2.p0();
        if (bVarP0 != null) {
            int i14 = bVarP0.f114924b;
            if ("TIME".equals(deviceSettingsDTO2.f33906x1)) {
                l3.a aVar2 = l3.f23124b;
                Integer num = deviceSettingsDTO2.f33908y1;
                num.getClass();
                double dIntValue = num.intValue();
                aVar2.getClass();
                strB = c(i14, Integer.valueOf((int) (dIntValue / 60.0d)));
            } else {
                strB = b(i14);
            }
            if (strB == null) {
                strB = "";
            }
        } else {
            strB = "";
        }
        String strJoin = TextUtils.join(", ", new String[]{strB3, strB});
        strJoin.getClass();
        return strJoin;
    }

    @Override // fb2.z
    /* JADX INFO: renamed from: s */
    public final int getF180417e() {
        return View.generateViewId();
    }

    @Override // fb2.z
    public final String t() {
        String strB = b(R.string.audio_prompts_power_alert_title);
        strB.getClass();
        return strB;
    }
}
