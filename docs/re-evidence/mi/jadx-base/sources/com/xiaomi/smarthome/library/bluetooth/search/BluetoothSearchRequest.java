package com.xiaomi.smarthome.library.bluetooth.search;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.xiaomi.smarthome.library.bluetooth.search.classic.BluetoothClassicSearchTask;
import com.xiaomi.smarthome.library.bluetooth.search.le.BluetoothLeSearchTask;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class BluetoothSearchRequest {
    private static final int MSG_START_SEARCH = 17;
    private static final int SCAN_INTERVAL = 100;
    private BluetoothSearchTask mCurrentTask;
    private Handler mHandler;
    private BluetoothSearchResponse mOuterResponse;
    private List<BluetoothSearchTask> mSearchTaskList = new ArrayList();

    public class BluetoothSearchTaskResponse implements BluetoothSearchResponse {
        BluetoothSearchTask task;

        public BluetoothSearchTaskResponse(BluetoothSearchTask bluetoothSearchTask) {
            this.task = bluetoothSearchTask;
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
        public void onSearchCanceled() {
            BluetoothLog.v(String.format("%s onSearchCanceled", this.task.toString()));
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
        public void onSearchStarted() {
            BluetoothLog.v(String.format("%s onSearchStarted", this.task.toString()));
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
        public void onSearchStopped() {
            BluetoothLog.v(String.format("%s onSearchStopped", this.task.toString()));
            BluetoothSearchRequest.this.sendMessageDelayed(17, 100);
        }

        @Override // com.xiaomi.smarthome.library.bluetooth.search.BtSearchResponse
        public void onDeviceFounded(BluetoothSearchResult bluetoothSearchResult) {
            BluetoothSearchRequest.this.notifyDeviceFounded(bluetoothSearchResult);
        }
    }

    public static class Builder {
        private BluetoothSearchResponse searchResponse;
        private List<BluetoothSearchTask> searchTaskList = new ArrayList();

        private void addSearchTask(BluetoothSearchTask bluetoothSearchTask) {
            if (bluetoothSearchTask instanceof BluetoothLeSearchTask) {
                if (BluetoothUtils.isBleSupported()) {
                    this.searchTaskList.add(bluetoothSearchTask);
                }
            } else if (bluetoothSearchTask instanceof BluetoothClassicSearchTask) {
                this.searchTaskList.add(bluetoothSearchTask);
            }
        }

        public BluetoothSearchRequest build() {
            BluetoothSearchRequest bluetoothSearchRequest = new BluetoothSearchRequest();
            bluetoothSearchRequest.addSearchTasks(this.searchTaskList);
            bluetoothSearchRequest.setSearchResponse(this.searchResponse);
            return bluetoothSearchRequest;
        }

        public Builder searchBluetoothClassicDevice(int i) {
            BluetoothClassicSearchTask bluetoothClassicSearchTask = new BluetoothClassicSearchTask();
            bluetoothClassicSearchTask.setSearchDuration(i);
            addSearchTask(bluetoothClassicSearchTask);
            return this;
        }

        public Builder searchBluetoothLeDevice() {
            searchBluetoothLeDevice(10000, (UUID[]) null);
            return this;
        }

        public Builder setSearchResponse(BluetoothSearchResponse bluetoothSearchResponse) {
            this.searchResponse = bluetoothSearchResponse;
            return this;
        }

        public Builder searchBluetoothLeDevice(int i) {
            return searchBluetoothLeDevice(i, (UUID[]) null);
        }

        public Builder searchBluetoothLeDevice(int i, UUID[] uuidArr) {
            BluetoothLeSearchTask bluetoothLeSearchTask = new BluetoothLeSearchTask();
            bluetoothLeSearchTask.setSearchDuration(i);
            bluetoothLeSearchTask.setSearchUUIDs(uuidArr);
            addSearchTask(bluetoothLeSearchTask);
            return this;
        }

        public Builder searchBluetoothClassicDevice(int i, int i2) {
            for (int i3 = 0; i3 < i2; i3++) {
                searchBluetoothClassicDevice(i);
            }
            return this;
        }

        public Builder searchBluetoothLeDevice(int i, int i2) {
            return searchBluetoothLeDevice(i, i2, null);
        }

        public Builder searchBluetoothLeDevice(int i, int i2, UUID[] uuidArr) {
            for (int i3 = 0; i3 < i2; i3++) {
                searchBluetoothLeDevice(i, uuidArr);
            }
            return this;
        }
    }

    private void notifyBondedBluetoothClassicDevices() {
        BluetoothLog.v(String.format("scan for bonded classic devices", new Object[0]));
        Iterator<BluetoothSearchResult> it = BluetoothUtils.getBondedBluetoothClassicDevices().iterator();
        while (it.hasNext()) {
            notifyDeviceFounded(it.next());
        }
    }

    private void notifyConnectedBluetoothDevices() {
        boolean z = false;
        boolean z2 = false;
        boolean z3 = true;
        for (BluetoothSearchTask bluetoothSearchTask : this.mSearchTaskList) {
            if (bluetoothSearchTask.isBluetoothLeSearch()) {
                if (bluetoothSearchTask.getSearchUUIDs() == null || bluetoothSearchTask.getSearchUUIDs().length == 0) {
                    z3 = false;
                }
                z = true;
            } else {
                if (!bluetoothSearchTask.isBluetoothClassicSearch()) {
                    throw new IllegalArgumentException("unknown search task type!");
                }
                z2 = true;
            }
        }
        if (z && !z3) {
            notifyConnectedBluetoothLeDevices();
        }
        if (z2) {
            notifyBondedBluetoothClassicDevices();
        }
    }

    private void notifyConnectedBluetoothLeDevices() {
        BluetoothLog.v(String.format("scan for connected le devices", new Object[0]));
        Iterator<BluetoothSearchResult> it = BluetoothUtils.getConnectedBluetoothLeDevices().iterator();
        while (it.hasNext()) {
            notifyDeviceFounded(it.next());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyDeviceFounded(BluetoothSearchResult bluetoothSearchResult) {
        BluetoothSearchResponse bluetoothSearchResponse = this.mOuterResponse;
        if (bluetoothSearchResponse != null) {
            bluetoothSearchResponse.onDeviceFounded(bluetoothSearchResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void scheduleNewSearchTask() {
        if (this.mSearchTaskList.size() > 0) {
            BluetoothSearchTask bluetoothSearchTaskRemove = this.mSearchTaskList.remove(0);
            this.mCurrentTask = bluetoothSearchTaskRemove;
            bluetoothSearchTaskRemove.start(new BluetoothSearchTaskResponse(bluetoothSearchTaskRemove));
        } else {
            this.mCurrentTask = null;
            BluetoothSearchResponse bluetoothSearchResponse = this.mOuterResponse;
            if (bluetoothSearchResponse != null) {
                bluetoothSearchResponse.onSearchStopped();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendMessageDelayed(int i, int i2) {
        if (this.mHandler == null) {
            this.mHandler = new Handler(Looper.myLooper()) { // from class: com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchRequest.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    if (message.what != 17) {
                        return;
                    }
                    BluetoothSearchRequest.this.scheduleNewSearchTask();
                }
            };
        }
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(i), i2);
    }

    public void addSearchTasks(List<BluetoothSearchTask> list) {
        this.mSearchTaskList.clear();
        this.mSearchTaskList.addAll(list);
    }

    public void cancel() {
        BluetoothSearchTask bluetoothSearchTask = this.mCurrentTask;
        if (bluetoothSearchTask != null) {
            bluetoothSearchTask.cancel();
            this.mCurrentTask = null;
        }
        this.mSearchTaskList.clear();
        BluetoothSearchResponse bluetoothSearchResponse = this.mOuterResponse;
        if (bluetoothSearchResponse != null) {
            bluetoothSearchResponse.onSearchCanceled();
        }
        this.mOuterResponse = null;
    }

    public void setSearchResponse(BluetoothSearchResponse bluetoothSearchResponse) {
        this.mOuterResponse = bluetoothSearchResponse;
    }

    public void start() {
        BluetoothSearchResponse bluetoothSearchResponse = this.mOuterResponse;
        if (bluetoothSearchResponse != null) {
            bluetoothSearchResponse.onSearchStarted();
        }
        notifyConnectedBluetoothDevices();
        sendMessageDelayed(17, 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        Iterator<BluetoothSearchTask> it = this.mSearchTaskList.iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString() + ", ");
        }
        return sb.toString();
    }
}
