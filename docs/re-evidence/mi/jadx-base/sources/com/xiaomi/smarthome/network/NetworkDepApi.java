package com.xiaomi.smarthome.network;

import android.os.Bundle;
import com.xiaomi.smarthome.core.entity.Error;
import com.xiaomi.smarthome.core.server.internal.NetCallback;

/* JADX INFO: loaded from: classes2.dex */
public abstract class NetworkDepApi {
    public static volatile NetworkDepApi sInstance = new NetworkDepApiDefaultImpl();

    public static NetworkDepApi getInstance() {
        return sInstance;
    }

    public abstract String HashedDeviceIdUtil();

    public abstract void doUnAuthorized();

    public abstract String getFcmToken();

    public abstract String getPushId();

    public abstract void installCommonOnce();

    public abstract void log401AfterRefreshToken(String str);

    public abstract void log401Exp(String str);

    public abstract void postCatchedException(Throwable th);

    public abstract void refreshServiceToken(String str, String str2, boolean z, String str3, NetCallback<Bundle, Error> netCallback);

    public abstract void statCuserId();
}
