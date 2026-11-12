package com.xiaomi.smarthome.library.bluetooth.search;

import android.bluetooth.BluetoothAdapter;
import com.xiaomi.smarthome.library.bluetooth.search.classic.BluetoothClassicSearcher;
import com.xiaomi.smarthome.library.bluetooth.search.le.BluetoothLESearcher;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
public class BluetoothSearcher {
    protected BluetoothAdapter mBluetoothAdapter;
    protected BluetoothSearchResponse mSearchResponse;
    protected UUID[] mServiceUUIDs;

    public static BluetoothSearcher newInstance(int i) {
        if (i == 1) {
            return BluetoothClassicSearcher.getInstance();
        }
        if (i == 2) {
            return BluetoothLESearcher.getInstance();
        }
        throw new IllegalStateException(String.format("unknown search type %d", Integer.valueOf(i)));
    }

    private void notifySearchCanceled() {
        BluetoothSearchResponse bluetoothSearchResponse = this.mSearchResponse;
        if (bluetoothSearchResponse != null) {
            bluetoothSearchResponse.onSearchCanceled();
        }
    }

    private void notifySearchStarted() {
        BluetoothSearchResponse bluetoothSearchResponse = this.mSearchResponse;
        if (bluetoothSearchResponse != null) {
            bluetoothSearchResponse.onSearchStarted();
        }
    }

    private void notifySearchStopped() {
        BluetoothSearchResponse bluetoothSearchResponse = this.mSearchResponse;
        if (bluetoothSearchResponse != null) {
            bluetoothSearchResponse.onSearchStopped();
        }
    }

    public void cancelScanBluetooth() {
        notifySearchCanceled();
        this.mSearchResponse = null;
    }

    public void notifyDeviceFounded(BluetoothSearchResult bluetoothSearchResult) {
        BluetoothSearchResponse bluetoothSearchResponse = this.mSearchResponse;
        if (bluetoothSearchResponse != null) {
            bluetoothSearchResponse.onDeviceFounded(bluetoothSearchResult);
        }
    }

    public void startScanBluetooth(BluetoothSearchResponse bluetoothSearchResponse) {
        startScanBluetooth(null, bluetoothSearchResponse);
    }

    public void stopScanBluetooth() {
        notifySearchStopped();
        this.mSearchResponse = null;
    }

    public void startScanBluetooth(UUID[] uuidArr, BluetoothSearchResponse bluetoothSearchResponse) {
        this.mServiceUUIDs = uuidArr;
        this.mSearchResponse = bluetoothSearchResponse;
        notifySearchStarted();
    }
}
