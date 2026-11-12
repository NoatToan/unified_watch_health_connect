package ch1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lch1/r1;", "Lfb2/m;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "lowHighAHrAlertCapable", "<init>", "(Landroid/content/Context;Z)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class r1 extends fb2.m<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27444f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(Context context, boolean z14) {
        super(context);
        context.getClass();
        this.f27444f = z14 ? R.string.device_settings_abnormal_heart_rate_alerts : R.string.device_settings_abnormal_heart_rate;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((DeviceSettingsDTO) obj).getClass();
        return true;
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t */
    public final int getF27322f() {
        return R.id.user_settings_high_heart_rate;
    }

    @Override // fb2.m
    public final String u() {
        String strB = b(this.f27444f);
        strB.getClass();
        return strB;
    }

    public /* synthetic */ r1(Context context, boolean z14, int i14, p005kotlin.jvm.internal.j jVar) {
        this(context, (i14 & 2) != 0 ? false : z14);
    }
}
