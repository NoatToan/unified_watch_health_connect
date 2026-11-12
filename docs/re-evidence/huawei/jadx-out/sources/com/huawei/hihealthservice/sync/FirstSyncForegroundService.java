package com.huawei.hihealthservice.sync;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.lsb;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class FirstSyncForegroundService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        LogUtil.b("FirstSyncForegroundService", "start FirstSyncForegroundService, show the sync notification");
        try {
            startForeground(10010, lsb.d().c().build());
        } catch (IllegalStateException e) {
            LogUtil.e("FirstSyncForegroundService", "startForeground appear exception, message:", e.getMessage());
        }
        super.onStartCommand(intent, i, i2);
        return 2;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LogUtil.b("FirstSyncForegroundService", "FirstSyncForegroundService onDestroy");
        stopForeground(false);
    }
}
