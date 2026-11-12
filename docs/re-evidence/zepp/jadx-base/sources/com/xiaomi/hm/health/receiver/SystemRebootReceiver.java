package com.xiaomi.hm.health.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.huami.tools.log.HMLog;

/* JADX INFO: loaded from: classes21.dex */
public class SystemRebootReceiver extends BroadcastReceiver {
    private static final String a = "SystemRebootReceiver";
    private static String b = "com.xiaomi.hm.health";
    public static final String ACTION_DEVICE_BIND_APPLICATION = b + ".ACTION_DEVICE_BIND_APPLICATION";
    public static final String ACTION_DEVICE_UNBIND_APPLICATION = b + ".ACTION_DEVICE_UNBIND_APPLICATION";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        HMLog.i(a, "SystemRebootReceiver:" + action, new Object[0]);
        if (action == null || action.equals("android.intent.action.BOOT_COMPLETED") || action.equals(ACTION_DEVICE_BIND_APPLICATION)) {
            return;
        }
        action.equals(ACTION_DEVICE_UNBIND_APPLICATION);
    }
}
