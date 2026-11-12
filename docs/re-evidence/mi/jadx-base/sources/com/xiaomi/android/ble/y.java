package com.xiaomi.android.ble;

import android.bluetooth.BluetoothGattCharacteristic;

/* JADX INFO: loaded from: classes7.dex */
public abstract class y<T> extends x {
    public T m;

    public y(v.a aVar) {
        super(aVar);
    }

    public y<T> t(T t) {
        this.m = t;
        return this;
    }

    public y(v.a aVar, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(aVar, bluetoothGattCharacteristic);
    }
}
