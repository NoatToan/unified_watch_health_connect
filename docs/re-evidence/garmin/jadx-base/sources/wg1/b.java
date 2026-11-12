package wg1;

import ch1.k4;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.common.smartnotifications.SmartNotificationsActivity;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwg1/b;", "Lch1/k4$b;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class b implements k4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SmartNotificationsActivity f185123a;

    public b(SmartNotificationsActivity smartNotificationsActivity) {
        this.f185123a = smartNotificationsActivity;
    }

    @Override // ch1.k4.b
    public final boolean a() {
        return true;
    }

    @Override // ch1.k4.b
    public final boolean b(DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        wi1.c cVar = deviceSettingsDTO.f33863b1;
        return cVar != null && cVar.h0();
    }

    @Override // ch1.k4.b
    public final boolean c(DeviceSettingsDTO deviceSettingsDTO) {
        j jVar;
        deviceSettingsDTO.getClass();
        SmartNotificationsActivity.a aVar = SmartNotificationsActivity.f42849j;
        d dVarNa = this.f185123a.na();
        if ((dVarNa == null || (jVar = dVarNa.f185126b) == null) ? false : jVar.f185135a) {
            wi1.c cVar = deviceSettingsDTO.f33863b1;
            if (cVar != null && cVar.f0()) {
                return true;
            }
        }
        return false;
    }

    @Override // ch1.k4.b
    public final String d() {
        String string = this.f185123a.getString(R.string.device_settings_during_activity);
        string.getClass();
        return string;
    }

    @Override // ch1.k4.b
    public final wi1.h.d e(DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        wi1.c cVar = deviceSettingsDTO.f33863b1;
        if (cVar != null) {
            wi1.h.d.a aVar = wi1.h.d.f185523d;
            String str = cVar.f185502a;
            aVar.getClass();
            wi1.h.d dVarA = wi1.h.d.a.a(str);
            if (dVarA != null) {
                return dVarA;
            }
        }
        return wi1.h.d.SHOW_ALL;
    }

    @Override // ch1.k4.b
    public final String getDescription() {
        return this.f185123a.getString(R.string.notifications_during_activity_description_msg);
    }
}
