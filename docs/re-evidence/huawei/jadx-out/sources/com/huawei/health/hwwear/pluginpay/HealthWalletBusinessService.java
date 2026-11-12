package com.huawei.health.hwwear.pluginpay;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ddy;
import health.compact.a.DeviceConfigInit;

/* JADX INFO: loaded from: classes29.dex */
public class HealthWalletBusinessService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        if (!ddy.e().isPluginAvaiable()) {
            LogUtil.a("R_HealthWalletBusinessService", "onBind not PluginAvailable");
            return null;
        }
        return ddy.e().getServiceBinder(getApplicationContext(), "HealthWalletBusinessService", intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        DeviceConfigInit.create();
        if (!ddy.e().isPluginAvaiable()) {
            LogUtil.a("HealthWalletBusinessService", "onCreate not PluginAvailable");
        } else {
            ddy.e().serviceOnCreate(getApplicationContext(), "HealthWalletBusinessService");
            LogUtil.a("HealthWalletBusinessService", "HwTransitOpenService onCreate");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        if (!ddy.e().isPluginAvaiable()) {
            LogUtil.a("HealthWalletBusinessService", "onDestroy not PluginAvailable");
        } else {
            ddy.e().serviceOnDestroy(getApplicationContext(), "HealthWalletBusinessService");
            LogUtil.a("HealthWalletBusinessService", "HwTransitOpenService onDestory");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        stopSelf(i2);
        return 2;
    }
}
