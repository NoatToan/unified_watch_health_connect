package com.xiaomi.smarthome.frame.core;

import android.os.Bundle;
import com.xiaomi.smarthome.core.server.bluetooth.IBleResponse;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.library.MiJiaEnvironment;

/* JADX INFO: loaded from: classes2.dex */
public class CoreApi {
    private static volatile CoreApi sInstance;
    private static Object sLock = new Object();

    public static CoreApi getInstance() {
        if (sInstance == null) {
            synchronized (sLock) {
                try {
                    if (sInstance == null) {
                        sInstance = new CoreApi();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public void callBluetoothApi(String str, int i, Bundle bundle, IBleResponse iBleResponse) {
        BluetoothService.getInstance(MiJiaEnvironment.getAppContext()).callBluetoothApi(str, i, bundle, iBleResponse);
    }

    public int get13OptimizeBleLoginConnectRetryDelay(String str) {
        return 2000;
    }

    public int get6OptimizeBleLoginConnectRetryDelay(String str) {
        return 2000;
    }

    public void getBluetoothCache(String str, int i, Bundle bundle) {
    }

    public int getOptimizeBleLoginConnectRetryTimes() {
        return 1;
    }

    public boolean is13OptimizeBleLoginConnectModel(String str) {
        return true;
    }

    public boolean is6OptimizeBleLoginConnectModel(String str) {
        return true;
    }

    public boolean needSecurityChipCheck(String str) {
        return false;
    }
}
