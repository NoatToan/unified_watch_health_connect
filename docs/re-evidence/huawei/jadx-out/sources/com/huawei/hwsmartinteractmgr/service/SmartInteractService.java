package com.huawei.hwsmartinteractmgr.service;

import android.app.Notification;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import defpackage.lsb;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes39.dex */
public class SmartInteractService extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SmartInteractBinder f17709c;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        LogUtil.a("SMART_SmartInteractService", "onCreate");
        b(lsb.d().c().build());
        this.f17709c = new SmartInteractBinder();
        OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("SmartInteractService", "onCreate");
    }

    private void b(Notification notification) {
        try {
            startForeground(20220505, notification);
        } catch (Exception e) {
            ReleaseLogUtil.a("R_SMART_SmartInteractService", "startForegroundProtect exception:", ExceptionUtils.c(e));
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        LogUtil.a("SMART_SmartInteractService", "onStartCommand");
        super.onStartCommand(intent, i, i2);
        stopSelf(i2);
        return 2;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        LogUtil.a("SMART_SmartInteractService", "onBind");
        return this.f17709c;
    }

    @Override // android.app.Service
    public boolean onUnbind(Intent intent) {
        LogUtil.a("SMART_SmartInteractService", "onUnbind");
        return super.onUnbind(intent);
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("SMART_SmartInteractService", "onDestroy");
        lsb.d().e(20220505);
        if (this.f17709c != null) {
            this.f17709c = null;
        }
    }
}
