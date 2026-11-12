package com.xiaomi.smarthome.network;

import com.xiaomi.smarthome.core.server.internal.api.SmartHomeRc4Api;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;

/* JADX INFO: loaded from: classes2.dex */
public class MiJiaNetworkInterceptManager {
    private static volatile MiJiaNetworkInterceptManager sInstance;

    private MiJiaNetworkInterceptManager() {
    }

    public static MiJiaNetworkInterceptManager getInstance() {
        if (sInstance == null) {
            synchronized (MiJiaNetworkInterceptManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new MiJiaNetworkInterceptManager();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return sInstance;
    }

    public void addMiJiaNetworkIntercept(MiJiaNetworkIntercept miJiaNetworkIntercept) {
        MiJiaLog.writeLogOnAll(LogType.NETWORK, "MiJiaNetworkIntercept", "addMiJiaNetworkIntercept");
        SmartHomeRc4Api.getInstance().addMiJiaNetworkIntercept(miJiaNetworkIntercept);
    }
}
