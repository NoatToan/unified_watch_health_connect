package com.xiaomi.hm.health.bt.sdk;

/* JADX INFO: loaded from: classes11.dex */
public abstract class IDeviceCallback implements IDeviceBaseCallback {
    public abstract void onConnectionStateChange(int i, int i2);

    @Override // com.xiaomi.hm.health.bt.sdk.IDeviceBaseCallback
    public final void onConnectionStateChange(int i, int i2, int i3) {
        onConnectionStateChange(i, i2);
    }
}
