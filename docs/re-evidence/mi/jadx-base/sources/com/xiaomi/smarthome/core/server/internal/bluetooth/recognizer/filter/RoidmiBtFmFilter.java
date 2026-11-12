package com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter;

import com.xiaomi.smarthome.ble_core.R;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResult;
import com.xiaomi.smarthome.library.common.util.StringUtil;

/* JADX INFO: loaded from: classes10.dex */
public class RoidmiBtFmFilter extends BluetoothDeviceFilter {
    private static final String NAME = StringUtil.getString(BluetoothService.getAppContext(), R.string.roidmi_car_bluetooth_player);

    private RoidmiBtFmFilter() {
    }

    public static RoidmiBtFmFilter newInstance() {
        return new RoidmiBtFmFilter();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter.IBluetoothFilter
    public boolean filter(BluetoothSearchResult bluetoothSearchResult) {
        return NAME.equalsIgnoreCase(bluetoothSearchResult.getName());
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter.IBluetoothFilter
    public String getModel() {
        return "roidmi.btfm.v1";
    }
}
