package com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter;

import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;

/* JADX INFO: loaded from: classes10.dex */
public abstract class BluetoothDeviceFilter implements IBluetoothFilter {
    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter.IBluetoothFilter
    public boolean shouldDisable() {
        return BluetoothService.getBleCoreProvider().isInternationalServer();
    }
}
