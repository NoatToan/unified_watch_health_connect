package com.airoha.android.lib.physical.ble;

import android.bluetooth.BluetoothGatt;

/* JADX INFO: loaded from: classes2.dex */
public class BleActionSetMtu extends BleAction {
    private static final int a = 273;

    public class a implements IBleAction {
        public a() {
        }

        @Override // com.airoha.android.lib.physical.ble.IBleAction
        public void exec() {
            BleActionSetMtu.this.mBluetoothGatt.requestMtu(273);
        }
    }

    public BleActionSetMtu(BluetoothGatt bluetoothGatt) {
        super(bluetoothGatt);
        this.mBleAction = new a();
    }
}
