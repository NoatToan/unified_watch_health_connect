package ch1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lch1/n4;", "Lch1/a5;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n4 extends a5<DeviceSettingsDTO, Integer> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f27422e = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n4(Context context) {
        super(context);
        context.getClass();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((DeviceSettingsDTO) obj).getClass();
        return false;
    }

    @Override // ch1.a5
    public final Integer s(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        com.garmin.android.apps.connectmobile.devices.model.h hVar = deviceSettingsDTO2.f33885m;
        return Integer.valueOf(hVar != null ? hVar.getSpo2Threshold() : 0);
    }

    @Override // ch1.a5
    public final int t() {
        return R.id.device_settings_sp02_threshold;
    }

    @Override // ch1.a5
    public final String u() {
        String strB = b(R.string.device_settings_sp02_threshold);
        strB.getClass();
        return strB;
    }

    @Override // ch1.a5
    public final xg1.c<Integer> v(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        return new a0.h(18, this, deviceSettingsDTO2);
    }

    @Override // ch1.a5
    public final xg1.r<Integer> w() {
        return new m4(this);
    }

    @Override // ch1.a5
    public final void x(Integer num, DeviceSettingsDTO deviceSettingsDTO) {
        com.garmin.android.apps.connectmobile.devices.model.h hVar;
        Integer num2 = num;
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        if (num2 == null || (hVar = deviceSettingsDTO2.f33885m) == null) {
            return;
        }
        hVar.I(num2.intValue());
    }
}
