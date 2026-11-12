package com.xiaomi.smarthome.library.bluetooth.connect.request;

import android.bluetooth.BluetoothGattDescriptor;
import com.xiaomi.smarthome.library.bluetooth.connect.listener.WriteDescriptorListener;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class BleUnnotifyRequest extends BleRequest implements WriteDescriptorListener {
    public BleUnnotifyRequest(UUID uuid, UUID uuid2) {
        super(null);
        this.mServiceUUID = uuid;
        this.mCharacterUUID = uuid2;
    }

    private void closeNotify() {
        if (setCharacteristicNotification(this.mServiceUUID, this.mCharacterUUID, false)) {
            startRequestTiming();
        } else {
            onRequestCompleted(-1);
        }
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.listener.WriteDescriptorListener
    public void onDescriptorWrite(BluetoothGattDescriptor bluetoothGattDescriptor, int i) {
        stopRequestTiming();
        if (i == 0) {
            onRequestCompleted(0);
        } else {
            onRequestCompleted(-1);
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
            closeNotify();
        } else if (currentStatus != 19) {
            onRequestCompleted(-1);
        } else {
            closeNotify();
        }
    }
}
