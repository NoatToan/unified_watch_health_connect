package com.xiaomi.smarthome.library.bluetooth.connect.listener;

import com.xiaomi.smarthome.library.bluetooth.connect.BleGattProfile;

/* JADX INFO: loaded from: classes2.dex */
public interface ServiceDiscoverListener extends GattResponseListener {
    void onServicesDiscovered(int i, BleGattProfile bleGattProfile);
}
