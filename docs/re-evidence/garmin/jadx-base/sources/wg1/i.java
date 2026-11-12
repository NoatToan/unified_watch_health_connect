package wg1;

import ch1.j4;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.common.smartnotifications.SmartNotificationsValueActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwg1/i;", "Lch1/j4$b;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class i implements j4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SmartNotificationsValueActivity f185134a;

    public i(SmartNotificationsValueActivity smartNotificationsValueActivity) {
        this.f185134a = smartNotificationsValueActivity;
    }

    @Override // ch1.j4.b
    public final boolean a(DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        wi1.h hVarNa = SmartNotificationsValueActivity.na(this.f185134a, deviceSettingsDTO);
        return hVarNa != null && hVarNa.e0();
    }

    @Override // ch1.j4.b
    public final String b() {
        SmartNotificationsValueActivity.a aVar = SmartNotificationsValueActivity.f42853o;
        SmartNotificationsValueActivity smartNotificationsValueActivity = this.f185134a;
        if (((Boolean) smartNotificationsValueActivity.f42855i.getValue()).booleanValue()) {
            return smartNotificationsValueActivity.getString(R.string.lbl_notifications_swimming_hint);
        }
        return null;
    }

    @Override // ch1.j4.b
    public final wi1.h.d c(DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        wi1.h hVarNa = SmartNotificationsValueActivity.na(this.f185134a, deviceSettingsDTO);
        if (hVarNa != null) {
            wi1.h.d.a aVar = wi1.h.d.f185523d;
            String str = hVarNa.f185502a;
            aVar.getClass();
            wi1.h.d dVarA = wi1.h.d.a.a(str);
            if (dVarA != null) {
                return dVarA;
            }
        }
        return SmartNotificationsValueActivity.f42854p;
    }

    @Override // ch1.j4.b
    public final void d(wi1.h.d dVar, DeviceSettingsDTO deviceSettingsDTO) {
        dVar.getClass();
        deviceSettingsDTO.getClass();
        wi1.h hVarNa = SmartNotificationsValueActivity.na(this.f185134a, deviceSettingsDTO);
        if (hVarNa != null) {
            hVarNa.i0(dVar.f185530a);
        }
    }
}
