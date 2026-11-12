package fh1;

import android.content.Context;
import android.view.View;
import ch.qos.logback.core.CoreConstants;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfh1/c0;", "Lfb2/a;", "Lcom/garmin/android/apps/connectmobile/devices/model/DeviceSettingsDTO;", "Landroid/content/Context;", CoreConstants.CONTEXT_SCOPE_VALUE, "<init>", "(Landroid/content/Context;)V", "gcm-device-settings_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c0 extends fb2.a<DeviceSettingsDTO> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f71586i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(Context context) {
        super(context);
        context.getClass();
        this.f71586i = View.generateViewId();
    }

    @Override // fb2.e
    public final boolean h(Object obj) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        wi1.c cVar = deviceSettingsDTO.f33863b1;
        cVar.getClass();
        com.garmin.android.apps.connectmobile.devices.model.o oVar = cVar.f185491i;
        oVar.getClass();
        return oVar.D("page_heartrate");
    }

    @Override // fb2.a
    public final boolean q(DeviceSettingsDTO deviceSettingsDTO) {
        DeviceSettingsDTO deviceSettingsDTO2 = deviceSettingsDTO;
        deviceSettingsDTO2.getClass();
        wi1.c cVar = deviceSettingsDTO2.f33863b1;
        cVar.getClass();
        com.garmin.android.apps.connectmobile.devices.model.o oVar = cVar.f185491i;
        oVar.getClass();
        return oVar.M().booleanValue();
    }

    @Override // fb2.a
    public final String r() {
        return this.f70343a.getString(R.string.heart_rate_monitor_required);
    }

    @Override // fb2.a
    /* JADX INFO: renamed from: s, reason: from getter */
    public final int getF71586i() {
        return this.f71586i;
    }

    @Override // fb2.a
    public final String t() {
        String string = this.f70343a.getString(R.string.device_screen_heart_rate);
        string.getClass();
        return string;
    }

    @Override // fb2.a
    public final void y(Object obj, boolean z14) {
        DeviceSettingsDTO deviceSettingsDTO = (DeviceSettingsDTO) obj;
        deviceSettingsDTO.getClass();
        wi1.c cVar = deviceSettingsDTO.f33863b1;
        cVar.getClass();
        com.garmin.android.apps.connectmobile.devices.model.o oVar = cVar.f185491i;
        oVar.getClass();
        oVar.n0(Boolean.valueOf(z14));
    }
}
