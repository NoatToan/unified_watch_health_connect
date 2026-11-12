package com.xiaomi.smarthome.library.bluetooth.connect.request;

import android.bluetooth.BluetoothGattCharacteristic;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.smarthome.library.bluetooth.connect.BleResponser;
import com.xiaomi.smarthome.library.bluetooth.connect.listener.WriteCharacterListener;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class BleBatchWriteRequest extends BleRequest implements WriteCharacterListener {
    private static final int DELAY = 2;
    static final int MSG_WRITE = 1;
    Handler batchHandler;
    private int currentDelay;
    private List<byte[]> dataBytes;
    private int dataSize;
    private int totalWriteNum;

    public BleBatchWriteRequest(UUID uuid, UUID uuid2, List<byte[]> list, BleResponser bleResponser) {
        super(bleResponser);
        this.currentDelay = 2;
        this.totalWriteNum = 1;
        this.batchHandler = new Handler(Looper.myLooper()) { // from class: com.xiaomi.smarthome.library.bluetooth.connect.request.BleBatchWriteRequest.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (message.what == 1) {
                    BleBatchWriteRequest.access$008(BleBatchWriteRequest.this);
                    if (BleBatchWriteRequest.this.totalWriteNum < BleBatchWriteRequest.this.dataSize * 2) {
                        BleBatchWriteRequest.this.startWrite();
                        return;
                    }
                    BleBatchWriteRequest.this.batchHandler.removeCallbacksAndMessages(null);
                    BluetoothLog.formatLog("batchHandler ,try write more time ,stop try", new Object[0]);
                    BleBatchWriteRequest.this.stopRequestTiming();
                    BleBatchWriteRequest.this.onRequestCompleted(0);
                }
            }
        };
        this.mServiceUUID = uuid;
        this.mCharacterUUID = uuid2;
        this.dataBytes = list;
        this.dataSize = list.size();
    }

    public static /* synthetic */ int access$008(BleBatchWriteRequest bleBatchWriteRequest) {
        int i = bleBatchWriteRequest.totalWriteNum;
        bleBatchWriteRequest.totalWriteNum = i + 1;
        return i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean startWrite() {
        List<byte[]> list = this.dataBytes;
        if (list == null || list.isEmpty()) {
            onRequestCompleted(0);
            stopRequestTiming();
            return false;
        }
        if (!writeCharacteristic(this.mServiceUUID, this.mCharacterUUID, this.dataBytes.get(0))) {
            BluetoothLog.d("OTARequest write fail,add delay time to " + this.currentDelay);
            return true;
        }
        this.dataBytes.remove(0);
        BluetoothLog.d("OTARequest write success,add delay time to " + this.currentDelay);
        return true;
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.listener.WriteCharacterListener
    public void onCharacteristicWrite(BluetoothGattCharacteristic bluetoothGattCharacteristic, int i, byte[] bArr) {
        BluetoothLog.d("BleBatchWriteRequest onCharacteristicWrite status=" + i);
        int i2 = this.totalWriteNum + 1;
        this.totalWriteNum = i2;
        if (i2 < this.dataSize * 2) {
            startWrite();
        } else {
            onRequestCompleted(0);
            stopRequestTiming();
        }
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.connect.request.BleRequest
    public void processRequest() {
        int currentStatus = getCurrentStatus();
        if (currentStatus != 2 && currentStatus != 19) {
            onRequestCompleted(-1);
        } else if (startWrite()) {
            startRequestTiming();
        }
    }
}
