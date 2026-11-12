package com.xiaomi.hm.health.bt.ife;

import android.bluetooth.BluetoothDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.Status;

/* JADX INFO: loaded from: classes19.dex */
public interface IHMConnectionCallback {
    void onConnectionStatusChanged(BluetoothDevice device, HMDeviceType type, Status status);
}
