package com.huami.components.devicestatus;

/* JADX INFO: loaded from: classes6.dex */
public interface DeviceStatusListener {
    void onConnected(int i);

    void onConnecting(int i);

    void onConnectingTimeout(int i);

    void onDisconnected(int i);

    void onStartSyncAGPS(int i);

    void onStartSyncData(int i);

    void onStopSyncAGPS(int i, boolean z);

    void onStopSyncData(int i, boolean z);

    void onSynchronizingAGPS(int i, int i2);

    void onSynchronizingData(int i, int i2);
}
