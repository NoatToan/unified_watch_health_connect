package com.xiaomi.smarthome.core.server.internal.bluetooth.security;

import android.os.Bundle;

/* JADX INFO: loaded from: classes10.dex */
public interface IBleDeviceLauncher {
    String getDeviceMac();

    int getDeviceProductId();

    byte[] getDeviceToken();

    void notifyAuthProcess(int i, Bundle bundle);

    void notifyConnectProcess(int i, Bundle bundle);
}
