package com.xiaomi.smarthome.library.bluetooth.connect.request;

import android.bluetooth.BluetoothGattDescriptor;
import com.xiaomi.smarthome.library.bluetooth.connect.BleResponser;
import com.xiaomi.smarthome.library.bluetooth.connect.listener.WriteDescriptorListener;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class BleIndicationRequest extends BleRequest implements WriteDescriptorListener {
    public BleIndicationRequest(UUID uuid, UUID uuid2, BleResponser bleResponser) {
        super(bleResponser);
        this.mServiceUUID = uuid;
        this.mCharacterUUID = uuid2;
    }

    private void openIndication() {
        if (setCharacteristicIndication(this.mServiceUUID, this.mCharacterUUID, true)) {
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
            openIndication();
        } else if (currentStatus != 19) {
            onRequestCompleted(-1);
        } else {
            openIndication();
        }
    }
}
