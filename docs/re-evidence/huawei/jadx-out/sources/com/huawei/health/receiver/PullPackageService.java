package com.huawei.health.receiver;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.huawei.health.weight.WeightApi;
import com.huawei.hwlogsmodel.LogUtil;
import defpackage.ffv;
import defpackage.gcn;
import health.compact.a.Services;

/* JADX INFO: loaded from: classes30.dex */
public class PullPackageService extends Service {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final IBinder f8663b = null;

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        LogUtil.a("PullPackageService", "PullPackageService is start");
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (intent == null) {
            return 2;
        }
        String stringExtra = intent.getStringExtra("packageName");
        LogUtil.a("PullPackageService", "packageName:", stringExtra);
        if (!TextUtils.isEmpty(stringExtra)) {
            b(stringExtra);
        }
        stopSelf(i2);
        return 2;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return f8663b;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0042  */
    private void b(String str) {
        byte b2;
        LogUtil.a("PullPackageService", "dispatchCommand packageName ", str);
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != -1518033795) {
            if (iHashCode != -1101632487) {
                if (iHashCode == -416151250 && str.equals("com.huawei.health.healthyliving")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("com.huawei.health.wear.golf")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("com.huawei.ohos.fastinglite")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            WeightApi weightApi = (WeightApi) Services.d("Main", WeightApi.class);
            LogUtil.a("PullPackageService", "onStartCommand weightApi ", weightApi);
            if (weightApi != null) {
                weightApi.registerFastingLite();
                return;
            }
            return;
        }
        if (b2 != 1) {
            if (b2 != 2) {
                return;
            }
            ffv.m();
        } else {
            gcn gcnVarC = gcn.c();
            if (gcnVarC != null) {
                gcnVarC.initGolfDeviceEngineManager();
            } else {
                LogUtil.e("PullPackageService", "golf start trackManagerProxy failed");
            }
        }
    }
}
