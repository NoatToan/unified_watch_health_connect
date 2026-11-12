package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lch1/t0;", "Lfb2/z;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "labelText", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class t0 extends fb2.z<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f27462e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(Context context, String str) {
        super(context);
        context.getClass();
        this.f27462e = str;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((DeviceSettingsDTO) obj).getClass();
        return true;
    }

    @Override // fb2.z
    public final String q(DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        return "";
    }

    @Override // fb2.z
    /* JADX INFO: renamed from: s */
    public final int getF27419g() {
        return View.generateViewId();
    }

    @Override // fb2.z
    public final String t() {
        String str = this.f27462e;
        if (str != null && str.length() != 0) {
            return str;
        }
        String strB = b(R.string.lbl_display_name);
        strB.getClass();
        return strB;
    }
}
