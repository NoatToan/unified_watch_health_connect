package com.google.android.gms.fitness.request;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.fitness.data.BleDevice;

/* JADX INFO: loaded from: classes3.dex */
@Deprecated
public abstract class BleScanCallback {
    public abstract void onDeviceFound(@RecentlyNonNull BleDevice bleDevice);

    public abstract void onScanStopped();
}
