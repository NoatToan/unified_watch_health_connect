package wg1;

import ch1.b4;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.settings.devices.common.smartnotifications.SmartNotificationsValueActivity;
import d53.u;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lwg1/f;", "Lch1/b4$b;", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f implements b4.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ SmartNotificationsValueActivity f185131a;

    public f(SmartNotificationsValueActivity smartNotificationsValueActivity) {
        this.f185131a = smartNotificationsValueActivity;
    }

    @Override // ch1.b4.b
    public final boolean a(DeviceSettingsDTO deviceSettingsDTO) {
        deviceSettingsDTO.getClass();
        wi1.h hVarNa = SmartNotificationsValueActivity.na(this.f185131a, deviceSettingsDTO);
        return hVarNa != null && hVarNa.c0();
    }

    @Override // ch1.b4.b
    public final void b(wi1.h.c cVar, DeviceSettingsDTO deviceSettingsDTO) {
        cVar.getClass();
        deviceSettingsDTO.getClass();
        wi1.h hVarNa = SmartNotificationsValueActivity.na(this.f185131a, deviceSettingsDTO);
        if (hVarNa != null) {
            hVarNa.f185503b = cVar.f185521a;
        }
    }

    @Override // ch1.b4.b
    public final wi1.h.c c(DeviceSettingsDTO deviceSettingsDTO) {
        wi1.h.c cVar;
        deviceSettingsDTO.getClass();
        wi1.h hVarNa = SmartNotificationsValueActivity.na(this.f185131a, deviceSettingsDTO);
        if (hVarNa != null) {
            wi1.h.c.a aVar = wi1.h.c.f185515c;
            String str = hVarNa.f185503b;
            aVar.getClass();
            if (str == null) {
                cVar = null;
                break;
            }
            w13.c cVar2 = wi1.h.c.f185520h;
            p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar2, cVar2);
            do {
                if (!bVarN.hasNext()) {
                    cVar = null;
                    break;
                }
                cVar = (wi1.h.c) bVarN.next();
            } while (!u.q(cVar.f185521a, str, true));
            if (cVar != null) {
                return cVar;
            }
        }
        return wi1.h.c.TONES_AND_VIBRATION;
    }
}
