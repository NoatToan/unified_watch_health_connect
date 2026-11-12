package com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer;

import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter.BalanceCarFilter;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter.IBluetoothFilter;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter.RoidmiBtFmFilter;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter.RoidmiBtFmV2Filter;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter.RoidmiBtFmV3Filter;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter.SoundBoxFilter;
import com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.filter.YeelightFilter;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResult;

/* JADX INFO: loaded from: classes10.dex */
public class BluetoothFilterRecognizer implements IBluetoothRecognizer {
    private static final IBluetoothFilter[] BLUETOOTH_FILTERS = {YeelightFilter.newInstance(), RoidmiBtFmFilter.newInstance(), RoidmiBtFmV2Filter.newInstance(), RoidmiBtFmV3Filter.newInstance(), BalanceCarFilter.newInstance(), SoundBoxFilter.newInstance()};

    private BluetoothFilterRecognizer() {
    }

    public static BluetoothFilterRecognizer newInstance() {
        return new BluetoothFilterRecognizer();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.IBluetoothRecognizer
    public BluetoothRecognizeResult recognize(BluetoothSearchResult bluetoothSearchResult) {
        for (IBluetoothFilter iBluetoothFilter : BLUETOOTH_FILTERS) {
            if (!iBluetoothFilter.shouldDisable() && iBluetoothFilter.filter(bluetoothSearchResult)) {
                return new BluetoothRecognizeResult(iBluetoothFilter.getModel());
            }
        }
        return null;
    }
}
