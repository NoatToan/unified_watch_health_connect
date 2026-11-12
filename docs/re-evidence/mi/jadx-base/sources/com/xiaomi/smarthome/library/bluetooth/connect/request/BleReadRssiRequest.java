package com.xiaomi.smarthome.library.bluetooth.connect.request;

import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleResponser;
import com.xiaomi.smarthome.library.bluetooth.connect.listener.ReadRssiListener;

/* JADX INFO: loaded from: classes2.dex */
public class BleReadRssiRequest extends BleRequest implements ReadRssiListener {
    public BleReadRssiRequest(BleResponser bleResponser) {
        super(bleResponser);
    }

    private void startReadRssi() {
        if (readRemoteRssi()) {
            startRequestTiming();
        } else {
            onRequestCompleted(-1);
        }
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.listener.ReadRssiListener
    public void onReadRemoteRssi(int i, int i2) {
        stopRequestTiming();
        if (i2 != 0) {
            onRequestCompleted(-1);
        } else {
            putIntExtra(BluetoothConstants.KEY_RSSI, i);
            onRequestCompleted(0);
        }
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.request.BleRequest
    public void processRequest() {
        int currentStatus = getCurrentStatus();
        if (currentStatus == 0) {
            onRequestCompleted(-1);
            return;
        }
        if (currentStatus == 2) {
            startReadRssi();
        } else if (currentStatus != 19) {
            onRequestCompleted(-1);
        } else {
            startReadRssi();
        }
    }
}
