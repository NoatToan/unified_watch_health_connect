package com.xiaomi.smarthome.library.bluetooth.connect.listener;

import android.bluetooth.BluetoothGattCharacteristic;

/* JADX INFO: loaded from: classes2.dex */
public interface WriteCharacterListener extends GattResponseListener {
    void onCharacteristicWrite(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, byte[] bArr);
}
