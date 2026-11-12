package com.xiaomi.smarthome.library.bluetooth.connect;

import android.os.Bundle;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleConnectResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleReadResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleReadRssiResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleRequestMtuResponse;
import com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse;

/* JADX INFO: loaded from: classes2.dex */
public class BleResponser implements BleResponse<Bundle> {
    public BleResponse mResponse;

    private BleResponser(BleResponse bleResponse) {
        this.mResponse = bleResponse;
    }

    public static BleResponser newInstance(BleResponse bleResponse) {
        return new BleResponser(bleResponse);
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.response.BleResponse
    public void onResponse(int i, Bundle bundle) {
        BleResponse bleResponse = this.mResponse;
        if (bleResponse == null) {
            return;
        }
        if (bleResponse instanceof BleConnectResponse) {
            bleResponse.onResponse(i, bundle);
            return;
        }
        if (bleResponse instanceof BleReadResponse) {
            bleResponse.onResponse(i, bundle != null ? bundle.getByteArray(BluetoothConstants.KEY_BYTES) : null);
            return;
        }
        if (bleResponse instanceof BleReadRssiResponse) {
            bleResponse.onResponse(i, Integer.valueOf(bundle != null ? bundle.getInt(BluetoothConstants.KEY_RSSI) : 0));
        } else if (bleResponse instanceof BleRequestMtuResponse) {
            bleResponse.onResponse(i, Integer.valueOf(bundle != null ? bundle.getInt(BluetoothConstants.KEY_MTU) : 23));
        } else {
            bleResponse.onResponse(i, null);
        }
    }
}
