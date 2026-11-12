package com.xiaomi.milink.udt.boot;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import com.xiaomi.milink.transmit.core.UDTTransmitService;

/* JADX INFO: loaded from: classes11.dex */
public class UDTBootBroadcastReceiver extends BroadcastReceiver {
    public final boolean a(Context context) {
        int i = Settings.System.getInt(context.getContentResolver(), "cloud_milink_security", -1);
        StringBuilder sb = new StringBuilder();
        sb.append("airkan cloud securtity: ");
        sb.append(i);
        return i != 0;
    }

    public final void b(Context context) {
        Intent intent = new Intent("android.intent.action.RUN");
        intent.setClass(context, UDTTransmitService.class);
        intent.setPackage("com.xiaomi.milink.udt");
        context.stopService(intent);
    }

    public final void c(Context context) {
        Intent intent = new Intent("android.intent.action.RUN");
        intent.setClass(context, UDTTransmitService.class);
        intent.setPackage("com.xiaomi.milink.udt");
        context.startService(intent);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ((intent.getAction().equals("com.xiaomi.milink.action.START_AIRKAN") || intent.getAction().equals("android.intent.action.BOOT_COMPLETED")) && a(context)) {
            c(context);
            return;
        }
        if (intent.getAction().equals("com.xiaomi.milink.action.START_UDTSERVICE") && a(context)) {
            c(context);
            return;
        }
        if (intent.getAction().equals("com.duokan.action.FACTORY_TEST_ON")) {
            b(context);
            return;
        }
        if (intent.getAction().equals("com.duokan.action.FACTORY_TEST_OFF") && a(context)) {
            c(context);
            return;
        }
        if (intent.getAction().equals("com.xiaomi.mitv.settings.CLOUD_SECURITY_CHANGED")) {
            int i = Settings.System.getInt(context.getContentResolver(), "cloud_milink_security", -1);
            if (i == 0) {
                b(context);
            } else if (i == 1 || i == 2) {
                c(context);
            }
        }
    }
}
