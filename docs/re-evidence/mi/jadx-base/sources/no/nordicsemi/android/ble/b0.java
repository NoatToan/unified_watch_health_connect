package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothGattCharacteristic;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b0<T> extends a0 {
    public T q;

    public b0(x.a aVar) {
        super(aVar);
    }

    public b0<T> E(T t) {
        this.q = t;
        return this;
    }

    public b0(x.a aVar, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(aVar, bluetoothGattCharacteristic);
    }
}
