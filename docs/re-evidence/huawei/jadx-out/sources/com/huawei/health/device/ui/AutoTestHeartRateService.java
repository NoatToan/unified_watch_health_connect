package com.huawei.health.device.ui;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.huawei.health.device.callback.IHealthDeviceCallback;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.open.data.model.HealthData;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.enq;
import defpackage.enw;

/* JADX INFO: loaded from: classes7.dex */
public class AutoTestHeartRateService extends Service {
    private String d = "";
    private boolean e = true;

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
        if (intent == null) {
            return 1;
        }
        this.d = intent.getStringExtra("mProductId");
        new b().start();
        return super.onStartCommand(intent, i, i2);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.e = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(IHealthDeviceCallback iHealthDeviceCallback, HealthDevice healthDevice, HealthData healthData) {
        iHealthDeviceCallback.onDataChanged(healthDevice, healthData);
    }

    class b extends Thread {
        private b() {
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            do {
                try {
                    Thread.sleep(5000L);
                    AutoTestHeartRateService.this.d(new enw(50001), enq.d().b(AutoTestHeartRateService.this.d), enq.d().c(AutoTestHeartRateService.this.d));
                } catch (InterruptedException unused) {
                    LogUtil.d("AutoTestHeartRateService", "AutoTestHeartRateService InterruptedException");
                }
            } while (AutoTestHeartRateService.this.e);
        }
    }
}
