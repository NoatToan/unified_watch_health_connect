package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.antitheft.AntiTheftMovementAlertEvent;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import com.garmin.proto.generated.GDIAntiTheftAlarmProto;
import com.garmin.proto.generated.GDISmartProto;

/* JADX INFO: loaded from: classes10.dex */
public class BikeAlarmNotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null || intent.getBundleExtra("BIKE_ALARM_BUNDLE_KEY") == null) {
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("BIKE_ALARM_BUNDLE_KEY");
        long j8 = bundleExtra.getLong("GCM_deviceUnitID", 0L);
        ((NotificationManager) context.getSystemService("notification")).cancel(bundleExtra.getInt("BIKE_ALARM_NOTIFICATION_ID", 0));
        if ("ACTION_TURN_OFF_NOTIFICATION".equals(intent.getAction()) && km2.a.i(j8, null, SupportedCapability.ANTI_THEFT_ALARM.ordinal())) {
            c cVar = new c(j8, null);
            GDIAntiTheftAlarmProto.DisableRequest.Builder builderNewBuilder = GDIAntiTheftAlarmProto.DisableRequest.newBuilder();
            GDIAntiTheftAlarmProto.AntiTheftAlarmService.Builder builderNewBuilder2 = GDIAntiTheftAlarmProto.AntiTheftAlarmService.newBuilder();
            builderNewBuilder2.setDisableRequest(builderNewBuilder);
            GDISmartProto.Smart.Builder builderNewBuilder3 = GDISmartProto.Smart.newBuilder();
            builderNewBuilder3.getClass();
            vg1.f.b(builderNewBuilder3, builderNewBuilder2);
            cVar.b(builderNewBuilder3);
            AntiTheftMovementAlertEvent antiTheftMovementAlertEvent = new AntiTheftMovementAlertEvent(false);
            oi2.a.f132270a.getClass();
            l73.c.b().e(antiTheftMovementAlertEvent);
        }
    }
}
