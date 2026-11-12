package com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter;

import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResult;

/* JADX INFO: loaded from: classes10.dex */
public class SoundBoxFilter extends BluetoothDeviceFilter {
    private static final String[] NAME = {"Music Alarm Clock", "Mi Music Alarm Clock"};

    private SoundBoxFilter() {
    }

    public static SoundBoxFilter newInstance() {
        return new SoundBoxFilter();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter.IBluetoothFilter
    public boolean filter(BluetoothSearchResult bluetoothSearchResult) {
        for (String str : NAME) {
            if (str.equals(bluetoothSearchResult.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter.IBluetoothFilter
    public String getModel() {
        return "onemore.soundbox.sm001";
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter.BluetoothDeviceFilter, com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter.IBluetoothFilter
    public boolean shouldDisable() {
        return false;
    }
}
