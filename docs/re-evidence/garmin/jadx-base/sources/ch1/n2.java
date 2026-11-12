package ch1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lch1/n2;", "Lfb2/a;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class n2 extends fb2.a<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f27421i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n2(Context context) {
        super(context);
        context.getClass();
        this.f27421i = View.generateViewId();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        return deviceSettingsDTO.f33885m != null;
    }

    @Override // fb2.a
    public final boolean q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        com.garmin.android.apps.connectmobile.devices.model.h hVar = deviceSettingsDTO2.f33885m;
        if (hVar != null) {
            return hVar.getLowHrAlertEnabled();
        }
        return false;
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getF27421i() {
        return this.f27421i;
    }

    @Override // fb2.a
    public final String t() {
        String strB = b(R.string.device_settings_low_alert_lbl);
        strB.getClass();
        return strB;
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        if (z14) {
            c22.m0.f23142a.getClass();
            c22.m0.a.a();
        }
        com.garmin.android.apps.connectmobile.devices.model.h hVar = deviceSettingsDTO.f33885m;
        if (hVar != null) {
            hVar.A(z14);
        }
    }
}
