package com.xiaomi.smarthome.network;

import android.os.Bundle;
import com.xiaomi.smarthome.core.entity.Error;
import com.xiaomi.smarthome.core.server.internal.NetCallback;

/* JADX INFO: loaded from: classes2.dex */
public class NetworkDepApiDefaultImpl extends NetworkDepApi {
    @Override // com.xiaomi.smarthome.network.NetworkDepApi
    public String HashedDeviceIdUtil() {
        return null;
    }

    @Override // com.xiaomi.smarthome.network.NetworkDepApi
    public void doUnAuthorized() {
    }

    @Override // com.xiaomi.smarthome.network.NetworkDepApi
    public String getFcmToken() {
        return null;
    }

    @Override // com.xiaomi.smarthome.network.NetworkDepApi
    public String getPushId() {
        return null;
    }

    @Override // com.xiaomi.smarthome.network.NetworkDepApi
    public void installCommonOnce() {
    }

    @Override // com.xiaomi.smarthome.network.NetworkDepApi
    public void log401AfterRefreshToken(String str) {
    }

    @Override // com.xiaomi.smarthome.network.NetworkDepApi
    public void log401Exp(String str) {
    }

    @Override // com.xiaomi.smarthome.network.NetworkDepApi
    public void postCatchedException(Throwable th) {
    }

    @Override // com.xiaomi.smarthome.network.NetworkDepApi
    public void refreshServiceToken(String str, String str2, boolean z, String str3, NetCallback<Bundle, Error> netCallback) {
    }

    @Override // com.xiaomi.smarthome.network.NetworkDepApi
    public void statCuserId() {
    }
}
