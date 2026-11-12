package com.xiaomi.hm.health.bt.sdk;

/* JADX INFO: loaded from: classes11.dex */
public interface IDeviceBaseCallback {
    void onConnectionStateChange(int i, int i2, int i3);

    String onGetSignData(String str, String str2);

    void onStepChanged(int i);
}
