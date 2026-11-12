package com.xiaomi.smarthome.library.bluetooth.search;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public abstract class BluetoothSearchTask {
    private static final int MSG_SEARCH_TIMEOUT = 34;
    private BluetoothSearcher mBluetoothSearcher;
    private Handler mHandler;
    private int searchDuration;
    private int searchType;
    private UUID[] uuids;

    public BluetoothSearchTask(int i) {
        this(i, 10000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public BluetoothSearcher getBluetoothSearcher() {
        if (this.mBluetoothSearcher == null) {
            this.mBluetoothSearcher = BluetoothSearcher.newInstance(this.searchType);
        }
        return this.mBluetoothSearcher;
    }

    private void sendMessageDelayed(int i, int i2) {
        if (this.mHandler == null) {
            this.mHandler = new Handler(Looper.myLooper()) { // from class: com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchTask.1
                @Override // android.os.Handler
                public void handleMessage(Message message) {
                    if (message.what != 34) {
                        return;
                    }
                    BluetoothSearchTask.this.getBluetoothSearcher().stopScanBluetooth();
                }
            };
        }
        this.mHandler.sendMessageDelayed(this.mHandler.obtainMessage(i), i2);
    }

    public void cancel() {
        this.mHandler.removeCallbacksAndMessages(null);
        getBluetoothSearcher().cancelScanBluetooth();
    }

    public int getSearchDuration() {
        return this.searchDuration;
    }

    public int getSearchType() {
        return this.searchType;
    }

    public UUID[] getSearchUUIDs() {
        return this.uuids;
    }

    public boolean isBluetoothClassicSearch() {
        return this.searchType == 1;
    }

    public boolean isBluetoothLeSearch() {
        return this.searchType == 2;
    }

    public void setSearchDuration(int i) {
        this.searchDuration = i;
    }

    public void setSearchType(int i) {
        this.searchType = i;
    }

    public void setSearchUUIDs(UUID[] uuidArr) {
        this.uuids = uuidArr;
    }

    public void start(BluetoothSearchResponse bluetoothSearchResponse) {
        getBluetoothSearcher().startScanBluetooth(this.uuids, bluetoothSearchResponse);
        sendMessageDelayed(34, this.searchDuration);
    }

    public String toString() {
        String str;
        if (isBluetoothLeSearch()) {
            str = "Ble";
        } else {
            str = isBluetoothClassicSearch() ? "classic" : "unknown";
        }
        int i = this.searchDuration;
        return i >= 1000 ? String.format("%s search (%ds)", str, Integer.valueOf(i / 1000)) : String.format("%s search (%.1fs)", str, Double.valueOf((((double) i) * 1.0d) / 1000.0d));
    }

    public BluetoothSearchTask(int i, int i2) {
        setSearchType(i);
        setSearchDuration(i2);
    }
}
