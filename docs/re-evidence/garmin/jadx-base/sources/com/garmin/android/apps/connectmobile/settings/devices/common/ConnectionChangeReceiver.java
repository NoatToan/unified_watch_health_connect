package com.garmin.android.apps.connectmobile.settings.devices.common;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.gfdi.protobuf.handlers.FindMyEdgeCommunicationHandler;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import hk0.p;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import p005kotlin.Metadata;
import vg1.h;
import vg1.t;
import zb0.n0;
import zb0.p0;
import zb0.q0;
import zb0.r0;
import zb0.u0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/settings/devices/common/ConnectionChangeReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class ConnectionChangeReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras;
        Long lValueOf = (intent == null || (extras = intent.getExtras()) == null) ? null : Long.valueOf(extras.getLong("GCM_extra_device_connected_unit_id"));
        if (lValueOf != null) {
            long jLongValue = lValueOf.longValue();
            Bundle extras2 = intent.getExtras();
            Integer numValueOf = extras2 != null ? Integer.valueOf(extras2.getInt("GCM_extra_gatt_status")) : null;
            Map<u0, t> map = n0.f203577a;
            if (km2.a.i(jLongValue, null, SupportedCapability.FIND_MY_WATCH.ordinal()) && km2.a.i(jLongValue, null, SupportedCapability.ANTI_THEFT_ALARM.ordinal())) {
                GarminConnectMobileApp.f28685g.getClass();
                r0 r0Var = new r0(GarminConnectMobileApp.a.a(), jLongValue);
                q0 q0VarA = q0.a(GarminConnectMobileApp.a.a());
                a aVar = new a(GarminConnectMobileApp.a.a(), jLongValue);
                p0 p0Var = new p0(GarminConnectMobileApp.a.a(), jLongValue);
                h hVar = new h();
                if (p.k(jLongValue)) {
                    FindMyEdgeCommunicationHandler.getInstance().sendLocationUpdatedSetEnabledRequest(jLongValue, true);
                    new c(p0Var.f203612a, p0Var).a();
                    q0VarA.getClass();
                    if (q0.f203617a.getBoolean(q0.b(jLongValue, "com.garmin.android.apps.connectmobile.devices.BIKE_ALARM_ARMED_PREF"), false)) {
                        aVar.b(a.EnumC0797a.CONNECTION_ESTABLISHED);
                        return;
                    }
                    if (q0.f203617a.getBoolean(q0.b(jLongValue, "com.garmin.android.apps.connectmobile.devices.EDGE_DISCONNECTED_TIMEOUT_PREF"), false)) {
                        int i14 = (int) jLongValue;
                        if (hVar.hasMessages(i14)) {
                            hVar.removeMessages(i14);
                        } else {
                            r0Var.a(true);
                        }
                        q0.f203618b.putBoolean(q0.b(jLongValue, "com.garmin.android.apps.connectmobile.devices.EDGE_DISCONNECTED_TIMEOUT_PREF"), false);
                        q0.f203618b.apply();
                        return;
                    }
                    return;
                }
                q0VarA.getClass();
                if (q0.f203617a.getBoolean(q0.b(jLongValue, "com.garmin.android.apps.connectmobile.devices.BIKE_ALARM_ARMED_PREF"), false)) {
                    aVar.b(a.EnumC0797a.CONNECTION_LOST);
                    return;
                }
                if (numValueOf == null || numValueOf.intValue() != 8) {
                    if (!(sn.a.g(Build.MANUFACTURER.toString()) + StringUtils.SPACE + sn.a.g(Build.MODEL.toString())).equals("HUAWEI BLL-L22")) {
                        return;
                    }
                }
                q0.f203618b.putBoolean(q0.b(jLongValue, "com.garmin.android.apps.connectmobile.devices.EDGE_DISCONNECTED_TIMEOUT_PREF"), true);
                q0.f203618b.apply();
                Message message = new Message();
                Bundle bundle = new Bundle();
                bundle.putLong("GCM_deviceUnitID", jLongValue);
                message.setData(bundle);
                message.what = (int) jLongValue;
                hVar.sendMessageDelayed(message, 45000L);
            }
        }
    }
}
