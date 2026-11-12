package com.huami.watch.companion.event;

import android.bluetooth.BluetoothDevice;

/* JADX INFO: loaded from: classes16.dex */
public class BluetoothPairingConfirmEvent {
    public BluetoothDevice mDevice;
    public int mPairingKey;
    public int mPairingVariant;

    public BluetoothPairingConfirmEvent(BluetoothDevice bluetoothDevice, int i, int i2) {
        this.mDevice = bluetoothDevice;
        this.mPairingVariant = i;
        this.mPairingKey = i2;
    }
}
