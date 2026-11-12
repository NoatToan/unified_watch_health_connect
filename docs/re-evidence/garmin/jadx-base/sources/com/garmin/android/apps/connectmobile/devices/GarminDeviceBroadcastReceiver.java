package com.garmin.android.apps.connectmobile.devices;

import am.j;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import o53.e1;
import p005kotlin.Metadata;
import zb0.t0;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/garmin/android/apps/connectmobile/devices/GarminDeviceBroadcastReceiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class GarminDeviceBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        String action = intent.getAction();
        if (action == null) {
            return;
        }
        Intent intent2 = new Intent(intent);
        intent2.setClass(context, GarminDeviceWakefulService.class);
        BroadcastReceiver.PendingResult pendingResultGoAsync = goAsync();
        pendingResultGoAsync.getClass();
        ge1.b.T(e1.f129333a, null, null, new t0(intent2, pendingResultGoAsync, context, null), 3);
        String strM = j.m("Starting [GarminDeviceWakefulService] with action [", action, "].");
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "GarminDeviceBroadcastReceiver", strM);
    }
}
