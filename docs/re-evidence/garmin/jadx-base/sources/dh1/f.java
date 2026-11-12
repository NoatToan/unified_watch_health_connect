package dh1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Ldh1/f;", "Ldh1/e;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(Context context) {
        super(context);
        context.getClass();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [T, com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO, java.lang.Object] */
    @Override // fb2.z, fb2.e
    public final boolean k(Object obj) {
        ?? r14 = (DeviceSettingsDTO) obj;
        r14.getClass();
        if (d()) {
            this.f70344b = r14;
            return r14.R0();
        }
        vb.h.s("View decorator is not found. Please call initialize() first before calling update().");
        return false;
    }
}
