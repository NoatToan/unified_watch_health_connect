package com.huawei.wear.wallet.proxy.openservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.huawei.wallet.proxy.InitWalletProxy;
import defpackage.xnd;
import defpackage.xyc;

/* JADX INFO: loaded from: classes46.dex */
public class WalletPassService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        xnd.d("WalletPassService", "onBind");
        xyc.c("WalletPassService", getApplicationContext());
        try {
            InitWalletProxy initWalletProxyE = InitWalletProxy.e();
            if (initWalletProxyE == null) {
                return null;
            }
            xnd.d("WalletPassService", "HealthHmsPassService onBind");
            return initWalletProxyE.getServiceBinder(getApplicationContext(), "WalletPassService", intent);
        } catch (ClassNotFoundException unused) {
            xnd.d("WalletPassService", "onBind, not PluginAvailable");
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        xnd.d("WalletPassService", "onCreate");
        super.onCreate();
        try {
            InitWalletProxy initWalletProxyE = InitWalletProxy.e();
            if (initWalletProxyE != null) {
                initWalletProxyE.serviceOnCreate(getApplicationContext(), "WalletPassService");
                xnd.d("WalletPassService", "HealthHmsPassService onCreate");
            }
        } catch (ClassNotFoundException unused) {
            xnd.d("WalletPassService", "onCreate, not PluginAvailable");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        xnd.d("WalletPassService", "onDestroy");
        super.onDestroy();
        try {
            InitWalletProxy initWalletProxyE = InitWalletProxy.e();
            if (initWalletProxyE != null) {
                initWalletProxyE.serviceOnDestroy(getApplicationContext(), "WalletPassService");
                xnd.d("WalletPassService", "HealthHmsPassService onDestory");
            }
        } catch (ClassNotFoundException unused) {
            xnd.d("WalletPassService", "onDestroy, not PluginAvailable");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        xnd.d("WalletPassService", "onStartCommand");
        super.onStartCommand(intent, i, i2);
        stopSelf(i2);
        return 2;
    }
}
