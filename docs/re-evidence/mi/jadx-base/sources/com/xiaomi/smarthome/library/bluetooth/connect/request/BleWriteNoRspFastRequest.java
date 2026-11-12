package com.xiaomi.smarthome.library.bluetooth.connect.request;

import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Intent;
import com.xiaomi.smarthome.library.bluetooth.BluetoothConstants;
import com.xiaomi.smarthome.library.bluetooth.connect.BleResponser;
import com.xiaomi.smarthome.library.bluetooth.connect.listener.WriteCharacterListener;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import com.xiaomi.smarthome.library.log.LogType;
import com.xiaomi.smarthome.library.log.MiJiaLog;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class BleWriteNoRspFastRequest extends BleRequest implements IFastSchedule, WriteCharacterListener {
    public BleWriteNoRspFastRequest(UUID uuid, UUID uuid2, byte[] bArr, BleResponser bleResponser) {
        super(bleResponser);
        this.mServiceUUID = uuid;
        this.mCharacterUUID = uuid2;
        this.mBytes = bArr;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.listener.WriteCharacterListener
    public void onCharacteristicWrite(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, byte[] bArr) {
        stopRequestTiming();
        if (i == 0) {
            onRequestCompleted(0);
        } else {
            if (i != -99) {
                onRequestCompleted(-1);
                return;
            }
            onRequestCompleted(-99);
            BluetoothUtils.sendBroadcast(new Intent(BluetoothConstants.ACTION_BLE_HALF_OPEN_LIMITED));
            MiJiaLog.writeLogOnAll(LogType.BLUETOOTH, "onCharacteristicWrite", "status: -99, half open limited");
        }
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.request.BleRequest
    public void processRequest() {
        if (writeCharacteristicWithNoRsp(this.mServiceUUID, this.mCharacterUUID, this.mBytes)) {
            startRequestTiming();
        } else {
            onRequestCompleted(-1);
        }
    }
}
