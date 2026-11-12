package com.airoha.android.lib.physical.ble;

import android.bluetooth.BluetoothGatt;

/* JADX INFO: loaded from: classes2.dex */
public class BleAction {
    public IBleAction mBleAction;
    public BluetoothGatt mBluetoothGatt;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    public BleAction(BluetoothGatt bluetoothGatt) {
        this.mBluetoothGatt = bluetoothGatt;
    }

    public void runOnThread() {
        new Thread(new a()).start();
    }
}
