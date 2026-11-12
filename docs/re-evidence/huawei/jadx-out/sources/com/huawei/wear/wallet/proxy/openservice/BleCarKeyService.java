package com.huawei.wear.wallet.proxy.openservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.huawei.wallet.proxy.InitWalletProxy;
import defpackage.xnd;
import defpackage.xyc;

/* JADX INFO: loaded from: classes46.dex */
public class BleCarKeyService extends Service {
    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        xnd.d("BleCarKeyService", "onBind");
        xyc.c("BleCarKeyService", getApplicationContext());
        try {
            InitWalletProxy initWalletProxyE = InitWalletProxy.e();
            if (initWalletProxyE == null) {
                return null;
            }
            xnd.d("BleCarKeyService", "BleCarKeyService onBind");
            return initWalletProxyE.getServiceBinder(getApplicationContext(), "BleCarKeyService", intent);
        } catch (ClassNotFoundException unused) {
            xnd.d("BleCarKeyService", "onBind, not PluginAvailable");
            return null;
        }
    }

    @Override // android.app.Service
    public void onCreate() {
        xnd.d("BleCarKeyService", "onCreate");
        super.onCreate();
        xyc.c("BleCarKeyService", getApplicationContext());
        try {
            InitWalletProxy initWalletProxyE = InitWalletProxy.e();
            if (initWalletProxyE != null) {
                initWalletProxyE.serviceOnCreate(getApplicationContext(), "BleCarKeyService");
                xnd.d("BleCarKeyService", "BleCarKeyService onCreate");
            }
        } catch (ClassNotFoundException unused) {
            xnd.d("BleCarKeyService", "onCreate, not PluginAvailable");
        }
    }

    @Override // android.app.Service
    public void onDestroy() {
        xnd.d("BleCarKeyService", "onDestroy");
        super.onDestroy();
        try {
            InitWalletProxy initWalletProxyE = InitWalletProxy.e();
            if (initWalletProxyE != null) {
                initWalletProxyE.serviceOnDestroy(getApplicationContext(), "BleCarKeyService");
                xnd.d("BleCarKeyService", "BleCarKeyService onDestory");
            }
        } catch (ClassNotFoundException unused) {
            xnd.d("BleCarKeyService", "onDestroy, not PluginAvailable");
        }
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        xnd.d("BleCarKeyService", "onStartCommand");
        super.onStartCommand(intent, i, i2);
        stopSelf(i2);
        return 2;
    }
}
