package j31;

import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.devices.settings.realtime.RTSSettingsLauncherActivity;
import com.garmin.android.apps.connectmobile.settings.devices.common.DeviceSettingsActivityTrackerSetupDefault;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.proto.generated.GDIRealtimeSettingsProto;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj31/f1;", "Lj31/z0;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class f1 implements z0 {
    @Override // j31.z0
    public final void d(Context context, long j8, String str, String str2) {
        context.getClass();
        str.getClass();
        str2.getClass();
        rd2.f.a().f152045a.getClass();
        sd2.f fVarI = rd2.j.i(j8, null);
        if (fVarI != null && km2.a.i(j8, null, SupportedCapability.REALTIME_SETTINGS.ordinal())) {
            RTSSettingsLauncherActivity.f34352a.getClass();
            context.startActivity(RTSSettingsLauncherActivity.a.a(context, fVarI, GDIRealtimeSettingsProto.WellKnownCompositionId.PULSE_OX_SETTINGS_VALUE, true, null, null));
            return;
        }
        Intent intent = new Intent(context, (Class<?>) DeviceSettingsActivityTrackerSetupDefault.class);
        intent.putExtra("setting_name", DeviceSettingsActivityTrackerSetupDefault.a.PULSE_OX_SETTINGS);
        intent.putExtra("GCM_deviceUnitID", j8);
        intent.putExtra("GCM_deviceProductNbr", str2);
        intent.putExtra("GCM_deviceName", str);
        context.startActivity(intent);
    }
}
