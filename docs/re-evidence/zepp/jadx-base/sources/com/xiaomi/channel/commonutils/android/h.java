package com.xiaomi.channel.commonutils.android;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: loaded from: classes18.dex */
final class h implements Runnable {
    public final /* synthetic */ Context a;
    public final /* synthetic */ ComponentName b;

    public h(Context context, ComponentName componentName) {
        this.a = context;
        this.b = componentName;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            PackageManager packageManager = this.a.getPackageManager();
            if (packageManager.getComponentEnabledSetting(this.b) != 2) {
                packageManager.setComponentEnabledSetting(this.b, 2, 1);
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.b.m3434a("close static register of network status receiver failed:" + th);
        }
    }
}
