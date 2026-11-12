package com.xiaomi.smarthome.library.bluetooth;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public interface IBleSecureConnectResponse {
    void onAuthResponse(int i, Bundle bundle);

    void onBindResponse(int i, Bundle bundle);

    void onConnectResponse(int i, Bundle bundle);

    void onLastResponse(int i, Bundle bundle);
}
