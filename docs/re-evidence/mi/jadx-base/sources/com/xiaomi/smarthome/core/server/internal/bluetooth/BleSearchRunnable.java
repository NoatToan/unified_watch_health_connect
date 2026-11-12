package com.xiaomi.smarthome.core.server.internal.bluetooth;

import android.os.Bundle;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BleSearchRunnable implements Runnable {
    protected int mCode;
    protected Bundle mData;

    public BleSearchRunnable(int i, Bundle bundle) {
        this.mCode = i;
        this.mData = bundle;
    }
}
