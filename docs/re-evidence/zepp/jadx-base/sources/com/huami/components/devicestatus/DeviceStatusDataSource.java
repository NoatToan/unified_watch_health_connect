package com.huami.components.devicestatus;

/* JADX INFO: loaded from: classes6.dex */
public interface DeviceStatusDataSource {
    int getSyncAGPSProgress();

    int getSyncDataProgress();

    boolean hasBoundExpectedDevice();

    boolean isConnectedExpectedDevice();

    boolean isExpectedDeviceType(int i);

    boolean isSyncFailed();

    void startSyncData();
}
