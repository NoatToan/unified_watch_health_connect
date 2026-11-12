package com.xiaomi.smarthome.library.bluetooth.search.le;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.xiaomi.smarthome.dddcommon.Infrastruction;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BluetoothContextManager;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResponse;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResult;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearcher;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothLog;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothPermissionUtil;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@Infrastruction
public class BluetoothLESearcher extends BluetoothSearcher {
    private final BluetoothAdapter.LeScanCallback mLeScanCallback;

    public static class BluetoothLESearcherHolder {
        private static BluetoothLESearcher instance = new BluetoothLESearcher();

        private BluetoothLESearcherHolder() {
        }
    }

    public static BluetoothLESearcher getInstance() {
        return BluetoothLESearcherHolder.instance;
    }

    @TargetApi(18)
    private void stopLeScan() {
        try {
            if (this.mBluetoothAdapter != null) {
                if (BluetoothPermissionUtil.checkBluetoothPermission(BluetoothContextManager.getContext())) {
                    this.mBluetoothAdapter.stopLeScan(this.mLeScanCallback);
                } else {
                    BluetoothMyLogger.d("BluetoothLESearcher stopLeScan fail, Android 12+ no bluetooth permission!!!");
                }
            }
        } catch (Throwable th) {
            BluetoothLog.e(th);
        }
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearcher
    public void cancelScanBluetooth() {
        stopLeScan();
        super.cancelScanBluetooth();
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearcher
    @TargetApi(18)
    public void startScanBluetooth(UUID[] uuidArr, BluetoothSearchResponse bluetoothSearchResponse) {
        super.startScanBluetooth(uuidArr, bluetoothSearchResponse);
        try {
            if (BluetoothPermissionUtil.checkBluetoothPermission(BluetoothContextManager.getContext())) {
                this.mBluetoothAdapter.startLeScan(uuidArr, this.mLeScanCallback);
            } else {
                BluetoothMyLogger.d("BluetoothLESearcher startScanBluetooth fail, Android 12+ no bluetooth permission!!!");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearcher
    public void stopScanBluetooth() {
        stopLeScan();
        super.stopScanBluetooth();
    }

    private BluetoothLESearcher() {
        this.mLeScanCallback = new BluetoothAdapter.LeScanCallback() { // from class: com.xiaomi.smarthome.library.bluetooth.search.le.BluetoothLESearcher.1
            @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
            public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
                BluetoothSearchResult bluetoothSearchResult = new BluetoothSearchResult(bluetoothDevice, i, bArr);
                bluetoothSearchResult.setBleDevice();
                BluetoothLESearcher.this.notifyDeviceFounded(bluetoothSearchResult);
            }
        };
        this.mBluetoothAdapter = BluetoothUtils.getBluetoothAdapter();
    }
}
