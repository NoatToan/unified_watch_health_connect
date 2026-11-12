package com.xiaomi.smarthome.library.bluetooth.search;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.xiaomi.smarthome.library.common.util.MessageHandlerThread;

/* JADX INFO: loaded from: classes2.dex */
public class BluetoothDeviceHandler {
    private static final int MSG_DEVICE_FOUNDED = 17;
    private Handler mDeviceHandler;
    private MessageHandlerThread mWorkerThread;

    public static class BluetoothDeviceHandlerHolder {
        private static BluetoothDeviceHandler instance = new BluetoothDeviceHandler();

        private BluetoothDeviceHandlerHolder() {
        }
    }

    public static BluetoothDeviceHandler getInstance() {
        return BluetoothDeviceHandlerHolder.instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processBluetoothDeviceMessage(Message message) {
        if (message.what != 17) {
            return;
        }
        processDeviceFounded((BluetoothSearchResult) message.getData().getParcelable("device"), (BluetoothSearchResponse) message.obj);
    }

    private void processDeviceFounded(BluetoothSearchResult bluetoothSearchResult, BluetoothSearchResponse bluetoothSearchResponse) {
        bluetoothSearchResult.setNameFromDevice();
        BluetoothSearchResponser.getInstance().notifyDeviceFounded(bluetoothSearchResult, bluetoothSearchResponse);
    }

    public void notifyDeviceFounded(BluetoothSearchResult bluetoothSearchResult, BluetoothSearchResponse bluetoothSearchResponse) {
        Message messageObtainMessage = this.mDeviceHandler.obtainMessage(17, bluetoothSearchResponse);
        Bundle bundle = new Bundle();
        bundle.putParcelable("device", bluetoothSearchResult);
        messageObtainMessage.setData(bundle);
        messageObtainMessage.sendToTarget();
    }

    private BluetoothDeviceHandler() {
        MessageHandlerThread messageHandlerThread = new MessageHandlerThread("BluetoothDeviceHandler");
        this.mWorkerThread = messageHandlerThread;
        messageHandlerThread.start();
        this.mDeviceHandler = new Handler(this.mWorkerThread.getLooper()) { // from class: com.xiaomi.smarthome.library.bluetooth.search.BluetoothDeviceHandler.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                BluetoothDeviceHandler.this.processBluetoothDeviceMessage(message);
            }
        };
    }
}
