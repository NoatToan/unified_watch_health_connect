package com.huawei.devicesdk.reconnect;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes4.dex */
public interface BleReconnectScanCallback {
    void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr);
}
