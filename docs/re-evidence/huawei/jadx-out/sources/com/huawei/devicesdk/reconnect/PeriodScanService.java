package com.huawei.devicesdk.reconnect;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import defpackage.cno;
import defpackage.cnr;
import defpackage.cqc;
import defpackage.cqp;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class PeriodScanService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        if (intent == null) {
            LogUtil.b("PeriodScanService", "onStartCommand. intent is invalid.");
            return 2;
        }
        super.onStartCommand(intent, i, i2);
        int intExtra = intent.getIntExtra("type", 1);
        ReleaseLogUtil.c("DEVMGR_PeriodScanService", "onStartCommand, type: ", Integer.valueOf(intExtra));
        cnr.d().c();
        if (intExtra == 1) {
            a();
            if (!cnr.d().b()) {
                return 3;
            }
            ReleaseLogUtil.c("DEVMGR_PeriodScanService", "onStartCommand. need subscript next reconnect.");
            cnr.d().e();
            return 3;
        }
        if (!cnr.d().b()) {
            return 3;
        }
        cnr.d().f();
        return 3;
    }

    private void a() {
        for (Map.Entry<String, Boolean> entry : cno.a().b().entrySet()) {
            if (entry.getValue() != null && entry.getValue().booleanValue()) {
                String strB = cnr.d().b(entry.getKey());
                LogUtil.b("PeriodScanService", "reportNotScanGattDevice deviceName: ", strB);
                cno.a().b().put(entry.getKey(), false);
                cqp.a(100094, cqc.a((Object) strB), "", "2");
            }
        }
    }
}
