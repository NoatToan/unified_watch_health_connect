package com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter;

import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResult;

/* JADX INFO: loaded from: classes10.dex */
public interface IBluetoothFilter {
    boolean filter(BluetoothSearchResult bluetoothSearchResult);

    String getModel();

    boolean shouldDisable();
}
