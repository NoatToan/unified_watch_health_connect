package com.xiaomi.smarthome.library.bluetooth.search;

import android.os.Handler;
import android.os.Message;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import com.xiaomi.smarthome.library.common.util.MessageHandlerThread;

/* JADX INFO: loaded from: classes2.dex */
public class BluetoothSearchHelper {
    private static final int MSG_CANCEL_SEARCH = 32;
    private static final int MSG_START_SEARCH = 16;
    private Handler mBluetoothSearchHandler;
    private BluetoothSearchRequest mCurrentRequest;
    private MessageHandlerThread mWorkerThread;

    public static class BluetoothSearchManagerHolder {
        private static BluetoothSearchHelper instance = new BluetoothSearchHelper();

        private BluetoothSearchManagerHolder() {
        }
    }

    public class BluetoothSearchResponseWrapper implements BluetoothSearchResponse {
        private BluetoothSearchResponse mResponse;

        @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
        public void onSearchCanceled() {
            BluetoothSearchHelper.this.mCurrentRequest = null;
            BluetoothLog.v("Bluetooth search cancel");
            BluetoothSearchResponser.getInstance().notifySearchCanceled(this.mResponse);
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
        public void onSearchStarted() {
            BluetoothLog.v("Bluetooth search start");
            BluetoothSearchResponser.getInstance().notifySearchStarted(this.mResponse);
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
        public void onSearchStopped() {
            BluetoothSearchHelper.this.mCurrentRequest = null;
            BluetoothLog.v("Bluetooth search stop");
            BluetoothSearchResponser.getInstance().notifySearchStopped(this.mResponse);
        }

        private BluetoothSearchResponseWrapper(BluetoothSearchResponse bluetoothSearchResponse) {
            this.mResponse = bluetoothSearchResponse;
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
        public void onDeviceFounded(BluetoothSearchResult bluetoothSearchResult) {
            BluetoothDeviceHandler.getInstance().notifyDeviceFounded(bluetoothSearchResult, this.mResponse);
        }
    }

    public static BluetoothSearchHelper getInstance() {
        return BluetoothSearchManagerHolder.instance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processCancelSearch(BluetoothSearchRequest bluetoothSearchRequest) {
        BluetoothSearchRequest bluetoothSearchRequest2 = this.mCurrentRequest;
        if (bluetoothSearchRequest2 == null) {
            if (bluetoothSearchRequest != null) {
                bluetoothSearchRequest.cancel();
            }
        } else if (bluetoothSearchRequest2 == bluetoothSearchRequest || bluetoothSearchRequest == null) {
            bluetoothSearchRequest2.cancel();
            this.mCurrentRequest = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void processStartSearch(BluetoothSearchRequest bluetoothSearchRequest) {
        BluetoothSearchRequest bluetoothSearchRequest2 = this.mCurrentRequest;
        if (bluetoothSearchRequest2 == null) {
            this.mCurrentRequest = bluetoothSearchRequest;
            bluetoothSearchRequest.start();
        } else {
            bluetoothSearchRequest2.cancel();
            this.mCurrentRequest = bluetoothSearchRequest;
            bluetoothSearchRequest.start();
        }
    }

    public void cancelSearch(BluetoothSearchRequest bluetoothSearchRequest) {
        this.mBluetoothSearchHandler.obtainMessage(32, bluetoothSearchRequest).sendToTarget();
    }

    public boolean isSearching() {
        return this.mCurrentRequest != null;
    }

    public void startSearch(BluetoothSearchRequest bluetoothSearchRequest, BluetoothSearchResponse bluetoothSearchResponse) {
        if (bluetoothSearchRequest == null || bluetoothSearchResponse == null) {
            return;
        }
        bluetoothSearchRequest.setSearchResponse(new BluetoothSearchResponseWrapper(bluetoothSearchResponse));
        if (BluetoothUtils.isBluetoothEnabledInKuailian()) {
            this.mBluetoothSearchHandler.obtainMessage(16, bluetoothSearchRequest).sendToTarget();
        } else {
            cancelSearch(bluetoothSearchRequest);
        }
    }

    private BluetoothSearchHelper() {
        MessageHandlerThread messageHandlerThread = new MessageHandlerThread("BluetoothSearch");
        this.mWorkerThread = messageHandlerThread;
        messageHandlerThread.start();
        this.mBluetoothSearchHandler = new Handler(this.mWorkerThread.getLooper()) { // from class: com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchHelper.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                BluetoothSearchRequest bluetoothSearchRequest = (BluetoothSearchRequest) message.obj;
                int i = message.what;
                if (i == 16) {
                    BluetoothSearchHelper.this.processStartSearch(bluetoothSearchRequest);
                } else {
                    if (i != 32) {
                        return;
                    }
                    BluetoothSearchHelper.this.processCancelSearch(bluetoothSearchRequest);
                }
            }
        };
    }
}
