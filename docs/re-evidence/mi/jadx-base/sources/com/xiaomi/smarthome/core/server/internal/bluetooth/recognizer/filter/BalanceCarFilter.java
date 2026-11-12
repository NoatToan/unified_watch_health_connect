package com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter;

import android.text.TextUtils;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResult;

/* JADX INFO: loaded from: classes10.dex */
public class BalanceCarFilter extends BluetoothDeviceFilter {
    private String[] prefixs = {" "};

    private BalanceCarFilter() {
    }

    public static BalanceCarFilter newInstance() {
        return new BalanceCarFilter();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter.IBluetoothFilter
    public boolean filter(BluetoothSearchResult bluetoothSearchResult) {
        String name = bluetoothSearchResult.getName();
        if (TextUtils.isEmpty(name)) {
            return false;
        }
        for (String str : this.prefixs) {
            if (name.startsWith(str) && name.length() > 1) {
                return true;
            }
        }
        return false;
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter.IBluetoothFilter
    public String getModel() {
        return "ninebot.balscooter.v1";
    }
}
