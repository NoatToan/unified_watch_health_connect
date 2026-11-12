package com.xiaomi.hm.health.bt.scan;

/* JADX INFO: loaded from: classes20.dex */
public interface IBleScanCallback {
    void onScanError(BleScanOption option);

    void onScanStart(BleScanOption option);

    void onScanStop(BleScanOption option);

    void onScanedDevice(AdvData data, BleScanOption option);
}
