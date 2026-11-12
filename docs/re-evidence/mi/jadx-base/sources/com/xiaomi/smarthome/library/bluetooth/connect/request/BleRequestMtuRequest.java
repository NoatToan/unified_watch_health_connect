package com.xiaomi.smarthome.library.bluetooth.connect.request;

import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleResponser;
import com.xiaomi.smarthome.library.bluetooth.connect.listener.RequestMtuListener;

/* JADX INFO: loaded from: classes2.dex */
public class BleRequestMtuRequest extends BleRequest implements RequestMtuListener {
    private int mtu;

    public BleRequestMtuRequest(int i, BleResponser bleResponser) {
        super(bleResponser);
        this.mtu = i;
    }

    private void startRequestMtu(int i) {
        if (requestMtu(i)) {
            startRequestTiming();
        } else {
            onRequestCompleted(-1);
        }
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.listener.RequestMtuListener
    public void onMtuChanged(int i, int i2) {
        stopRequestTiming();
        if (i2 != 0) {
            onRequestCompleted(-1);
        } else {
            putIntExtra(BluetoothConstants.KEY_MTU, i);
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
            startRequestMtu(this.mtu);
        } else if (currentStatus != 19) {
            onRequestCompleted(-1);
        } else {
            startRequestMtu(this.mtu);
        }
    }
}
