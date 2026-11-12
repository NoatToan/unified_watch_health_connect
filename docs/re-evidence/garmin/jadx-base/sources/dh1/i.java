package dh1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import ch1.i2;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import zb0.d0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldh1/i;", "Lch1/i2;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i extends i2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context);
        context.getClass();
    }

    @Override // ch1.i2, fb2.m
    /* JADX INFO: renamed from: v */
    public final String q(DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        d0 d0Var = (d0) KoinJavaComponent.get$default(d0.class, null, null, 6, null);
        Boolean bool = deviceSettingsDTO.f33886m1;
        return (((bool != null ? bool.booleanValue() : false) || deviceSettingsDTO.k0() || deviceSettingsDTO.x0() || deviceSettingsDTO.o0()) || d0Var.n(deviceSettingsDTO.f33860a)) ? b(R.string.lbl_on) : b(R.string.lbl_off);
    }
}
