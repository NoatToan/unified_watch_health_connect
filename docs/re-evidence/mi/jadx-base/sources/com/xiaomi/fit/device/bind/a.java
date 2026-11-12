package com.xiaomi.fit.device.bind;

import com.xiaomi.wearable.core.DeviceInfo;
import com.xiaomi.wearable.core.WearApiTask;
import defpackage.kj2;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a {
    protected WearApiTask mApiTask;
    protected kj2 mCallback;
    private volatile boolean mCancelled;
    protected final DeviceInfo mDeviceInfo;
    protected final String mUserId;

    public a(DeviceInfo deviceInfo) {
        this.mUserId = deviceInfo.getUserId();
        this.mDeviceInfo = deviceInfo;
    }

    public void cancel() {
        this.mCancelled = true;
        WearApiTask wearApiTask = this.mApiTask;
        if (wearApiTask != null) {
            wearApiTask.cancel();
            this.mApiTask = null;
        }
    }

    public final boolean isCancelled() {
        return this.mCancelled;
    }

    public void start(kj2 kj2Var) {
        this.mCallback = kj2Var;
    }
}
