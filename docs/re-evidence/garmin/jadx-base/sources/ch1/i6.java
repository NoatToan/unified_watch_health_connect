package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lch1/i6;", "Lfb2/m;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "", "buttonLabelResourceId", "<init>", "(Landroid/content/Context;I)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i6 extends fb2.m<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f27379f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(Context context, int i14) {
        super(context);
        context.getClass();
        this.f27379f = i14;
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        ((DeviceSettingsDTO) obj).getClass();
        return true;
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t */
    public final int getF27322f() {
        return View.generateViewId();
    }

    @Override // fb2.m
    public final String u() {
        String strB = b(this.f27379f);
        strB.getClass();
        return strB;
    }
}
