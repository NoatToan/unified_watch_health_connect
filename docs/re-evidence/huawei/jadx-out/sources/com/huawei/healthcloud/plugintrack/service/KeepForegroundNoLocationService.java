package com.huawei.healthcloud.plugintrack.service;

import com.huawei.hwlogsmodel.LogUtil;
import defpackage.lsb;
import health.compact.a.LogAnonymous;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class KeepForegroundNoLocationService extends KeepForegroundService {
    @Override // com.huawei.healthcloud.plugintrack.service.KeepForegroundService, android.app.Service
    public void onCreate() {
        super.onCreate();
        LogUtil.a("KeepForegroundNoLocationService", "KeepForegroundNoLocationService onCreate");
        try {
            startForeground(20200523, lsb.d().c().build());
        } catch (Exception e) {
            ReleaseLogUtil.e("KeepForegroundNoLocationService", "startForeground error exception ", LogAnonymous.b(e));
        }
    }
}
