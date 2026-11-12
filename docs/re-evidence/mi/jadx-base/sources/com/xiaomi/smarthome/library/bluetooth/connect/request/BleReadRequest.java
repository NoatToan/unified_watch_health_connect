package com.xiaomi.smarthome.library.bluetooth.connect.request;

import android.bluetooth.BluetoothGattCharacteristic;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleResponser;
import com.xiaomi.smarthome.library.bluetooth.connect.listener.ReadCharacterListener;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class BleReadRequest extends BleRequest implements ReadCharacterListener {
    public BleReadRequest(UUID uuid, UUID uuid2, BleResponser bleResponser) {
        super(bleResponser);
        this.mServiceUUID = uuid;
        this.mCharacterUUID = uuid2;
    }

    private void startRead() {
        if (readCharacteristic(this.mServiceUUID, this.mCharacterUUID)) {
            startRequestTiming();
        } else {
            onRequestCompleted(-1);
        }
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.listener.ReadCharacterListener
    public void onCharacteristicRead(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, byte[] bArr) {
        stopRequestTiming();
        if (i != 0) {
            onRequestCompleted(-1);
        } else {
            putByteArray(BluetoothConstants.KEY_BYTES, bArr);
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
            startRead();
        } else if (currentStatus != 19) {
            onRequestCompleted(-1);
        } else {
            startRead();
        }
    }
}
