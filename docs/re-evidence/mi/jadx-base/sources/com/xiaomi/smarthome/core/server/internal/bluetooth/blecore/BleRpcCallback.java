package com.xiaomi.smarthome.core.server.internal.bluetooth.blecore;

/* JADX INFO: loaded from: classes10.dex */
public interface BleRpcCallback {
    void onFailure(int i);

    void onFailure(int i, Object obj);

    void onSuccess(String str);
}
