package com.xiaomi.push.service;

import android.content.ComponentName;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes22.dex */
class r0 implements Runnable {
    public final /* synthetic */ XMPushService a;

    public r0(XMPushService xMPushService) {
        this.a = xMPushService;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            PackageManager packageManager = this.a.getApplicationContext().getPackageManager();
            ComponentName componentName = new ComponentName(this.a.getApplicationContext(), "com.xiaomi.push.service.receivers.PingReceiver");
            if (packageManager.getComponentEnabledSetting(componentName) != 2) {
                packageManager.setComponentEnabledSetting(componentName, 2, 1);
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("[Alarm] disable ping receiver may be failure. " + th);
        }
    }
}
