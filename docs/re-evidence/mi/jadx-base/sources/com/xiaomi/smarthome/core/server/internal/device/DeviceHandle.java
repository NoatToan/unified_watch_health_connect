package com.xiaomi.smarthome.core.server.internal.device;

import com.xiaomi.smarthome.core.server.internal.NetHandle;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes10.dex */
public class DeviceHandle {
    private final WeakReference<NetHandle> mHandle;

    public DeviceHandle(NetHandle netHandle) {
        this.mHandle = new WeakReference<>(netHandle);
    }

    public void cancel() {
        NetHandle netHandle = this.mHandle.get();
        if (netHandle != null) {
            netHandle.cancel();
        }
    }
}
