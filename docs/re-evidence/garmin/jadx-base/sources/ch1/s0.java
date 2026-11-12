package ch1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lch1/s0;", "Lch1/z2;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "inputMaxLength", "<init>", "(Landroid/content/Context;I)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s0 extends z2<DeviceSettingsDTO> {
    /* JADX WARN: Illegal instructions before constructor call */
    public s0(Context context, int i14) {
        context.getClass();
        String string = context.getString(R.string.msg_enter_initials_up_to_number_letters, Integer.valueOf(i14));
        string.getClass();
        super(context, i14, string);
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((DeviceSettingsDTO) obj).getClass();
        return true;
    }

    @Override // fb2.i
    public final String q(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        return deviceSettingsDTO.B;
    }

    @Override // ch1.z2, fb2.i
    public final int r() {
        z2.f27510h.getClass();
        return z2.f27512j;
    }

    @Override // ch1.z2, fb2.i
    public final int s() {
        z2.f27510h.getClass();
        return z2.f27511i;
    }

    @Override // fb2.i
    public final void v(Object obj, String str) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        deviceSettingsDTO.B = str;
    }
}
