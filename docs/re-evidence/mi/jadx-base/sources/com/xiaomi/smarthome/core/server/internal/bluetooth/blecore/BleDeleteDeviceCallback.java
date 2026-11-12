package com.xiaomi.smarthome.core.server.internal.bluetooth.blecore;

import android.os.Bundle;

/* JADX INFO: loaded from: classes10.dex */
public interface BleDeleteDeviceCallback {
    void onFailure(Bundle bundle);

    void onSuccess(Bundle bundle);
}
