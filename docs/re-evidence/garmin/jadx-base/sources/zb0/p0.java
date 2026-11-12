package zb0;

import android.content.Context;
import android.content.SharedPreferences;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.proto.generated.GDIAntiTheftAlarmExtension;
import com.garmin.proto.generated.GDIAntiTheftAlarmProto;
import com.garmin.proto.generated.GDISmartProto;
import com.google.protobuf.GeneratedMessage;

/* JADX INFO: loaded from: classes8.dex */
public class p0 implements com.garmin.android.apps.connectmobile.settings.devices.common.c.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f203612a;

    public p0(Context context, long j8) {
        this.f203612a = j8;
    }

    @Override // com.garmin.android.apps.connectmobile.settings.devices.common.c.a
    public final void i5(com.garmin.android.apps.connectmobile.settings.devices.common.c.b bVar, GDISmartProto.Smart smart) {
        boolean z14 = false;
        if (bVar == com.garmin.android.apps.connectmobile.settings.devices.common.c.b.SUCCESS && smart != null) {
            GeneratedMessage.GeneratedExtension<GDISmartProto.Smart, GDIAntiTheftAlarmProto.AntiTheftAlarmService> generatedExtension = GDIAntiTheftAlarmExtension.antiTheftAlarmService;
            if (smart.hasExtension((GeneratedMessage.GeneratedExtension) generatedExtension)) {
                GDIAntiTheftAlarmProto.AntiTheftAlarmService antiTheftAlarmService = (GDIAntiTheftAlarmProto.AntiTheftAlarmService) smart.getExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
                if (antiTheftAlarmService.hasSettingResponse() && antiTheftAlarmService.getSettingResponse().getIsEnabled()) {
                    z14 = true;
                }
            }
        }
        q0 q0VarA = q0.a(GarminConnectMobileApp.f28688j);
        SharedPreferences.Editor editor = q0.f203618b;
        q0VarA.getClass();
        editor.putBoolean(q0.b(this.f203612a, "com.garmin.android.apps.connectmobile.devices.BIKE_ALARM_ARMED_PREF"), z14);
        q0.f203618b.apply();
    }
}
