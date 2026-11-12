package wg1;

import ch1.c4;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.common.smartnotifications.SmartNotificationsValueActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwg1/g;", "Lch1/c4$b;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class g implements c4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SmartNotificationsValueActivity f185132a;

    public g(SmartNotificationsValueActivity smartNotificationsValueActivity) {
        this.f185132a = smartNotificationsValueActivity;
    }

    @Override // ch1.c4.b
    public final boolean a(DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        wi1.h hVarNa = SmartNotificationsValueActivity.na(this.f185132a, deviceSettingsDTO);
        return hVarNa != null && hVarNa.e0();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    @Override // ch1.c4.b
    public final void b(DeviceSettingsDTO deviceSettingsDTO, boolean z14) {
        wi1.h.d dVarA;
        deviceSettingsDTO.getClass();
        wi1.h hVarNa = SmartNotificationsValueActivity.na(this.f185132a, deviceSettingsDTO);
        if (!z14) {
            dVarA = wi1.h.d.OFF;
        } else if (hVarNa != null) {
            wi1.h.d.a aVar = wi1.h.d.f185523d;
            String str = hVarNa.f185504c;
            aVar.getClass();
            dVarA = wi1.h.d.a.a(str);
            if (dVarA == null) {
                dVarA = SmartNotificationsValueActivity.f42854p;
            }
        } else {
            dVarA = SmartNotificationsValueActivity.f42854p;
        }
        if (hVarNa != null) {
            hVarNa.i0(dVarA != null ? dVarA.f185530a : null);
        }
    }

    @Override // ch1.c4.b
    public final boolean c(DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        wi1.h hVarNa = SmartNotificationsValueActivity.na(this.f185132a, deviceSettingsDTO);
        if (hVarNa == null) {
            return false;
        }
        wi1.h.d.a aVar = wi1.h.d.f185523d;
        String str = hVarNa.f185502a;
        aVar.getClass();
        wi1.h.d dVarA = wi1.h.d.a.a(str);
        return (dVarA == null || dVarA == wi1.h.d.OFF) ? false : true;
    }
}
