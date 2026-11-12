package com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter;

import android.text.TextUtils;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResult;

/* JADX INFO: loaded from: classes10.dex */
public class YeelightFilter extends BluetoothDeviceFilter {
    private static final String[] DEVICE_NAME_FILTERS = {"4e20", "0248", "012f"};
    private static final String YEELIGHT_NAME = "XMCTD_";

    private YeelightFilter() {
    }

    public static YeelightFilter newInstance() {
        return new YeelightFilter();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter.IBluetoothFilter
    public boolean filter(BluetoothSearchResult bluetoothSearchResult) {
        String name = bluetoothSearchResult.getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        String lowerCase = name.toLowerCase();
        for (String str : DEVICE_NAME_FILTERS) {
            if (lowerCase.contains(str)) {
                return false;
            }
        }
        return name.contains(YEELIGHT_NAME);
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter.IBluetoothFilter
    public String getModel() {
        return "yeelink.light.ble1";
    }
}
