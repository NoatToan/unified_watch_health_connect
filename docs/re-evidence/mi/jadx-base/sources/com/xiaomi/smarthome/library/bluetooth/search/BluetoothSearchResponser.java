package com.xiaomi.smarthome.library.bluetooth.search;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;

/* JADX INFO: loaded from: classes2.dex */
public class BluetoothSearchResponser {
    private static final int MSG_SEARCH_CANCEL = 80;
    private static final int MSG_SEARCH_FOUND = 112;
    private static final int MSG_SEARCH_START = 64;
    private static final int MSG_SEARCH_STOP = 96;
    private final Handler mResponseHandler;

    public static class BluetoothSearchResponserHolder {
        private static BluetoothSearchResponser instance = new BluetoothSearchResponser();

        private BluetoothSearchResponserHolder() {
        }
    }

    public static BluetoothSearchResponser getInstance() {
        return BluetoothSearchResponserHolder.instance;
    }

    public void notifyDeviceFounded(BluetoothSearchResult bluetoothSearchResult, BluetoothSearchResponse bluetoothSearchResponse) {
        Message messageObtainMessage = this.mResponseHandler.obtainMessage(112, bluetoothSearchResponse);
        messageObtainMessage.getData().putParcelable("device", bluetoothSearchResult);
        messageObtainMessage.sendToTarget();
    }

    public void notifySearchCanceled(BluetoothSearchResponse bluetoothSearchResponse) {
        this.mResponseHandler.obtainMessage(80, bluetoothSearchResponse).sendToTarget();
    }

    public void notifySearchStarted(BluetoothSearchResponse bluetoothSearchResponse) {
        this.mResponseHandler.obtainMessage(64, bluetoothSearchResponse).sendToTarget();
    }

    public void notifySearchStopped(BluetoothSearchResponse bluetoothSearchResponse) {
        this.mResponseHandler.obtainMessage(96, bluetoothSearchResponse).sendToTarget();
    }

    private BluetoothSearchResponser() {
        this.mResponseHandler = new Handler(Looper.getMainLooper()) { // from class: com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResponser.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                BluetoothSearchResponse bluetoothSearchResponse = (BluetoothSearchResponse) message.obj;
                int i = message.what;
                if (i == 64) {
                    bluetoothSearchResponse.onSearchStarted();
                    return;
                }
                if (i == 80) {
                    bluetoothSearchResponse.onSearchCanceled();
                    return;
                }
                if (i == 96) {
                    bluetoothSearchResponse.onSearchStopped();
                } else {
                    if (i != 112) {
                        return;
                    }
                    BluetoothSearchResult bluetoothSearchResult = (BluetoothSearchResult) message.getData().getParcelable("device");
                    if (BluetoothLog.isShowSearchLog()) {
                        BluetoothLog.v(String.format("%s device founded: %s", BluetoothUtils.getType(bluetoothSearchResult.getDeviceType()), bluetoothSearchResult.toString()));
                    }
                    bluetoothSearchResponse.onDeviceFounded(bluetoothSearchResult);
                }
            }
        };
    }
}
