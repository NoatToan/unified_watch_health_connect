package com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer;

import android.text.TextUtils;
import com.xiaomi.smarthome.core.server.internal.bluetooth.BluetoothService;
import com.xiaomi.smarthome.core.server.internal.bluetooth.model.BluetoothCache;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResult;

/* JADX INFO: loaded from: classes10.dex */
public class BluetoothCacheRecognizer implements IBluetoothRecognizer {
    private BluetoothCacheRecognizer() {
    }

    public static BluetoothCacheRecognizer newInstance() {
        return new BluetoothCacheRecognizer();
    }

    @Override // com.xiaomi.smarthome.core.server.internal.bluetooth.recognizer.IBluetoothRecognizer
    public BluetoothRecognizeResult recognize(BluetoothSearchResult bluetoothSearchResult) {
        if (BluetoothService.getBleCoreProvider().isInternationalServer() || BluetoothCache.getPropType(bluetoothSearchResult.getAddress()) == 1) {
            return null;
        }
        String propModel = BluetoothCache.getPropModel(bluetoothSearchResult.getAddress());
        BluetoothRecognizeResult bluetoothRecognizeResult = !TextUtils.isEmpty(propModel) ? new BluetoothRecognizeResult(propModel) : null;
        if (TextUtils.equals(propModel, "ninebot.balscooter.v1") && TextUtils.equals(bluetoothSearchResult.getName(), " ")) {
            return null;
        }
        return bluetoothRecognizeResult;
    }
}
