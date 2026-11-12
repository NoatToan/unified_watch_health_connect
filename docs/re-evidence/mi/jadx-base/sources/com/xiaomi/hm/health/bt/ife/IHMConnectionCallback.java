package com.xiaomi.hm.health.bt.ife;

import android.bluetooth.BluetoothDevice;
import defpackage.sd;
import defpackage.wt;

/* JADX INFO: loaded from: classes11.dex */
public interface IHMConnectionCallback {
    void onConnectionStatusChanged(BluetoothDevice bluetoothDevice, sd sdVar, wt wtVar);
}
