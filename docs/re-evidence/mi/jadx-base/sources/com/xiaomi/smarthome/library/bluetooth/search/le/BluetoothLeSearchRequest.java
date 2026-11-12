package com.xiaomi.smarthome.library.bluetooth.search.le;

import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchRequest;

/* JADX INFO: loaded from: classes2.dex */
public class BluetoothLeSearchRequest extends BluetoothSearchRequest {
    private BluetoothLeSearchRequest() {
    }

    public static BluetoothSearchRequest newInstance() {
        return new BluetoothSearchRequest.Builder().searchBluetoothLeDevice().build();
    }

    public static BluetoothSearchRequest newInstance(int i) {
        return new BluetoothSearchRequest.Builder().searchBluetoothLeDevice(i).build();
    }
}
