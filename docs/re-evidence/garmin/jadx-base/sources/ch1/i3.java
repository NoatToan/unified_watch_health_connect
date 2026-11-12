package ch1;

import android.content.Context;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import java.util.Locale;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lch1/i3;", "Lfb2/m;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i3 extends fb2.m<DeviceSettingsDTO> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(Context context) {
        super(context, false, true);
        context.getClass();
    }

    @Override // fb2.m, fb2.e
    public final boolean g(i.c cVar, Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        cVar.getClass();
        deviceSettingsDTO.getClass();
        return h(deviceSettingsDTO) && super.g(cVar, deviceSettingsDTO);
    }

    @Override // fb2.m, fb2.e
    public final boolean k(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        if (!h(deviceSettingsDTO)) {
            return false;
        }
        super.k(deviceSettingsDTO);
        return true;
    }

    @Override // fb2.m
    /* JADX INFO: renamed from: t */
    public final int getF27322f() {
        return R.id.user_settings_pulse_ox;
    }

    @Override // fb2.m
    public final String u() {
        String string = this.f70343a.getString(c22.b0.b(null).equalsIgnoreCase(Locale.JAPAN.getCountry()) ? R.string.device_settings_blood_ox : R.string.device_settings_pulse_ox);
        string.getClass();
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0052 A[RETURN] */
    @Override // fb2.e
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public final boolean h(DeviceSettingsDTO deviceSettingsDTO) {
        com.garmin.android.apps.connectmobile.devices.model.h hVar;
        com.garmin.android.apps.connectmobile.devices.model.h hVar2;
        deviceSettingsDTO.getClass();
        boolean zW = ((zb0.d0) KoinJavaComponent.get$default(zb0.d0.class, null, null, 6, null)).w();
        boolean zT = ((zb0.d0) KoinJavaComponent.get$default(zb0.d0.class, null, null, 6, null)).t();
        boolean z14 = zW && (hVar2 = deviceSettingsDTO.f33885m) != null && hVar2.q();
        if (zT) {
            com.garmin.android.apps.connectmobile.devices.model.h hVar3 = deviceSettingsDTO.f33885m;
            if (hVar3 == null || hVar3.getSpo2Threshold() <= 0) {
                com.garmin.android.apps.connectmobile.devices.model.h hVar4 = deviceSettingsDTO.f33885m;
                if ((hVar4 != null ? hVar4.getLowSpo2AlertEnabled() : null) == null && ((hVar = deviceSettingsDTO.f33885m) == null || !hVar.r())) {
                    if (z14) {
                        return false;
                    }
                }
            }
        } else if (z14) {
            return false;
        }
        return true;
    }
}
