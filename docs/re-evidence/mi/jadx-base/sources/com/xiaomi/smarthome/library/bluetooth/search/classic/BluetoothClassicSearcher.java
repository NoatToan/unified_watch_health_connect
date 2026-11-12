package com.xiaomi.smarthome.library.bluetooth.search.classic;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.xiaomi.smarthome.dddcommon.Infrastruction;
import com.xiaomi.smarthome.frame.log.BluetoothMyLogger;
import com.xiaomi.smarthome.library.bluetooth.BluetoothContextManager;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResponse;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearchResult;
import com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearcher;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothPermissionUtil;
import com.xiaomi.smarthome.library.bluetooth.utils.BluetoothUtils;
import java.util.UUID;
import kotlin.jvm.internal.ShortCompanionObject;

/* JADX INFO: loaded from: classes2.dex */
@Infrastruction
public class BluetoothClassicSearcher extends BluetoothSearcher {
    private BluetoothSearchReceiver mReceiver;

    public static class BluetoothClassicSearcherHolder {
        private static BluetoothClassicSearcher instance = new BluetoothClassicSearcher();

        private BluetoothClassicSearcherHolder() {
        }
    }

    public class BluetoothSearchReceiver extends BroadcastReceiver {
        private BluetoothSearchReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent.getAction().equals("android.bluetooth.device.action.FOUND")) {
                BluetoothSearchResult bluetoothSearchResult = new BluetoothSearchResult((BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE"), intent.getShortExtra("android.bluetooth.device.extra.RSSI", ShortCompanionObject.MIN_VALUE), null);
                bluetoothSearchResult.setClassicDevice();
                BluetoothClassicSearcher.this.notifyDeviceFounded(bluetoothSearchResult);
            }
        }
    }

    public static BluetoothClassicSearcher getInstance() {
        return BluetoothClassicSearcherHolder.instance;
    }

    private void registerReceiver() {
        if (this.mReceiver == null) {
            this.mReceiver = new BluetoothSearchReceiver();
            BluetoothContextManager.getContext().registerReceiver(this.mReceiver, new IntentFilter("android.bluetooth.device.action.FOUND"));
        }
    }

    private void unregisterReceiver() {
        if (this.mReceiver != null) {
            BluetoothContextManager.getContext().unregisterReceiver(this.mReceiver);
            this.mReceiver = null;
        }
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearcher
    public void cancelScanBluetooth() {
        unregisterReceiver();
        if (!BluetoothPermissionUtil.checkBluetoothPermission(BluetoothContextManager.getContext())) {
            BluetoothMyLogger.d("BluetoothClassicSearcher cancelScanBluetooth fail, Android 12+ no bluetooth permission!!!");
        } else if (this.mBluetoothAdapter.isDiscovering()) {
            this.mBluetoothAdapter.cancelDiscovery();
        }
        super.cancelScanBluetooth();
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearcher
    public void startScanBluetooth(UUID[] uuidArr, BluetoothSearchResponse bluetoothSearchResponse) {
        super.startScanBluetooth(uuidArr, bluetoothSearchResponse);
        registerReceiver();
        if (!BluetoothPermissionUtil.checkBluetoothPermission(BluetoothContextManager.getContext())) {
            BluetoothMyLogger.d("BluetoothClassicSearcher startScanBluetooth fail, Android 12+ no bluetooth permission!!!");
            return;
        }
        if (this.mBluetoothAdapter.isDiscovering()) {
            this.mBluetoothAdapter.cancelDiscovery();
        }
        this.mBluetoothAdapter.startDiscovery();
    }

    @Override // com.xiaomi.smarthome.library.bluetooth.search.BluetoothSearcher
    public void stopScanBluetooth() {
        unregisterReceiver();
        if (!BluetoothPermissionUtil.checkBluetoothPermission(BluetoothContextManager.getContext())) {
            BluetoothMyLogger.d("BluetoothClassicSearcher stopScanBluetooth fail, Android 12+ no bluetooth permission!!!");
        } else if (this.mBluetoothAdapter.isDiscovering()) {
            this.mBluetoothAdapter.cancelDiscovery();
        }
        super.stopScanBluetooth();
    }

    private BluetoothClassicSearcher() {
        this.mBluetoothAdapter = BluetoothUtils.getBluetoothAdapter();
    }
}
