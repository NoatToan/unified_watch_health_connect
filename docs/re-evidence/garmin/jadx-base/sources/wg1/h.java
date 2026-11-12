package wg1;

import ch1.g4;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.common.smartnotifications.SmartNotificationsValueActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwg1/h;", "Lch1/g4$a;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class h implements g4.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SmartNotificationsValueActivity f185133a;

    public h(SmartNotificationsValueActivity smartNotificationsValueActivity) {
        this.f185133a = smartNotificationsValueActivity;
    }

    @Override // ch1.g4.a
    public final boolean a(DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        wi1.h hVarNa = SmartNotificationsValueActivity.na(this.f185133a, deviceSettingsDTO);
        return hVarNa != null && hVarNa.f0();
    }

    @Override // ch1.g4.a
    public final void b(DeviceSettingsDTO deviceSettingsDTO, boolean z14) {
        deviceSettingsDTO.getClass();
        wi1.h hVarNa = SmartNotificationsValueActivity.na(this.f185133a, deviceSettingsDTO);
        if (hVarNa != null) {
            hVarNa.k0(z14);
        }
    }

    @Override // ch1.g4.a
    public final boolean c(DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        wi1.h hVarNa = SmartNotificationsValueActivity.na(this.f185133a, deviceSettingsDTO);
        return hVarNa != null && hVarNa.h0();
    }
}
