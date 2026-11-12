package com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter;

import com.xiaomi.smarthome.ble_core.R;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResult;
import com.xiaomi.smarthome.library.common.util.StringUtil;

/* JADX INFO: loaded from: classes10.dex */
public class RoidmiBtFmV3Filter extends BluetoothDeviceFilter {
    private static final String NAME = StringUtil.getString(BluetoothService.getAppContext(), R.string.roidmi_car_bluetooth_player_v3);

    private RoidmiBtFmV3Filter() {
    }

    public static RoidmiBtFmV3Filter newInstance() {
        return new RoidmiBtFmV3Filter();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter.IBluetoothFilter
    public boolean filter(BluetoothSearchResult bluetoothSearchResult) {
        return NAME.equalsIgnoreCase(bluetoothSearchResult.getName());
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter.IBluetoothFilter
    public String getModel() {
        return "roidmi.btfm.m1";
    }
}
