package com.huawei.hwbtsdk.btdatatype.callback;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes10.dex */
public interface BtDevicePairCallback {
    void onDevicePairNone(BluetoothDevice bluetoothDevice);

    void onDevicePaired(BluetoothDevice bluetoothDevice);

    void onDevicePairing(BluetoothDevice bluetoothDevice);
}
