package com.huawei.health.manager.reconnect;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes2.dex */
public interface BleReconnectScanCallback {
    void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr);
}
