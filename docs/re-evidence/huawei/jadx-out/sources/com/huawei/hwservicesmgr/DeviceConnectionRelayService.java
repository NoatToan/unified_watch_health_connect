package com.huawei.hwservicesmgr;

import android.app.Service;
import android.content.Intent;
import android.os.BadParcelableException;
import android.os.IBinder;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.meq;

/* JADX INFO: loaded from: classes38.dex */
public class DeviceConnectionRelayService extends Service {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final IBinder f17664c = null;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        LogUtil.a("DeviceConnectionRelayService", "DeviceConnectionRelayService is start");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        LogUtil.a("DeviceConnectionRelayService", "DeviceConnectionRelayService is bind");
        if (intent != null) {
            try {
                if (BaseApplication.APP_PACKAGE_HEALTH_TV.equals(intent.getStringExtra("package_name"))) {
                    meq.e(intent);
                }
            } catch (BadParcelableException unused) {
                LogUtil.e("DeviceConnectionRelayService", "onBind getStringExtra catch BadParcelableException");
            }
        }
        stopSelf();
        LogUtil.a("DeviceConnectionRelayService", "DeviceConnectionRelayService is stopSelf.");
        return f17664c;
    }

    @Override // android.app.Service
    public void onDestroy() {
        super.onDestroy();
        LogUtil.a("DeviceConnectionRelayService", "DeviceConnectionRelayService is Destroy");
    }
}
