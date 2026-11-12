package com.huawei.devicesdk.strategy;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import com.huawei.haf.common.exception.ExceptionUtils;
import defpackage.cjs;
import defpackage.cqp;
import health.compact.a.LogUtil;
import health.compact.a.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ScanStrategyBle extends ScanStrategy {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f5459c = false;
    private cjs d;
    private BluetoothScanInterface e;

    /* JADX INFO: loaded from: classes23.dex */
    interface BluetoothScanInterface {
        void startScan(BluetoothAdapter bluetoothAdapter);

        void stopScan(BluetoothAdapter bluetoothAdapter);
    }

    @Override // com.huawei.devicesdk.strategy.ScanStrategy
    public void init(cjs cjsVar) {
        if (cjsVar == null) {
            LogUtil.e("ScanStrategyBle", "init callback is null");
        }
        this.d = cjsVar;
        this.e = new b();
    }

    @Override // com.huawei.devicesdk.strategy.ScanStrategy
    public void scan() {
        ReleaseLogUtil.c("DEVMGR_ScanStrategyBle", "scan ble device.");
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            LogUtil.e("ScanStrategyBle", "scan bluetoothAdapter is invalid");
            d();
        } else {
            this.e.startScan(defaultAdapter);
        }
    }

    @Override // com.huawei.devicesdk.strategy.ScanStrategy
    public void stopScan(boolean z) {
        ReleaseLogUtil.c("DEVMGR_ScanStrategyBle", "stop scan device, scanFinish:", Boolean.valueOf(this.f5459c));
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter == null || !defaultAdapter.isEnabled()) {
            LogUtil.e("ScanStrategyBle", "bluetoothAdapter is invalid");
            return;
        }
        this.e.stopScan(defaultAdapter);
        if (!this.f5459c) {
            this.d.e(z);
        }
        this.f5459c = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        this.f5459c = true;
        if (this.d == null) {
            LogUtil.e("ScanStrategyBle", "mDeviceDiscoveryCallback is null");
            return;
        }
        cqp.a(100078, "", "", "");
        ReleaseLogUtil.c("DEVMGR_ScanStrategyBle", "mBleScanCallback onScanDeviceFailure ", 21);
        this.d.e(21, "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        if (bluetoothDevice == null) {
            LogUtil.e("ScanStrategyBle", "onDeviceDiscovered device or records parameter exception.");
            return;
        }
        cjs cjsVar = this.d;
        if (cjsVar == null) {
            LogUtil.e("ScanStrategyBle", "mDeviceDiscoveryCallback is null");
        } else {
            cjsVar.d(bluetoothDevice, i, bArr, 2);
        }
    }

    /* JADX INFO: loaded from: classes23.dex */
    class b implements BluetoothScanInterface {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private ScanCallback f5461c;

        b() {
            this.f5461c = new ScanCallback() { // from class: com.huawei.devicesdk.strategy.ScanStrategyBle.b.1
                @Override // android.bluetooth.le.ScanCallback
                public void onScanResult(int i, ScanResult scanResult) {
                    super.onScanResult(i, scanResult);
                    LogUtil.b("ScanStrategyBle", "onScanResult. type:", Integer.valueOf(i));
                    ScanStrategyBle.this.d(scanResult.getDevice(), scanResult.getRssi(), b.this.e(scanResult.getScanRecord()));
                }

                @Override // android.bluetooth.le.ScanCallback
                public void onBatchScanResults(List<ScanResult> list) {
                    super.onBatchScanResults(list);
                    LogUtil.b("ScanStrategyBle", "onBatchScanResults.");
                    for (ScanResult scanResult : list) {
                        ScanStrategyBle.this.d(scanResult.getDevice(), scanResult.getRssi(), b.this.e(scanResult.getScanRecord()));
                    }
                }

                @Override // android.bluetooth.le.ScanCallback
                public void onScanFailed(int i) {
                    cqp.a(100077, "", String.valueOf(i), "");
                    ReleaseLogUtil.c("DEVMGR_ScanStrategyBle", "mBleScanCallback scan device failed.", Integer.valueOf(i));
                    super.onScanFailed(i);
                    ScanStrategyBle.this.d();
                }
            };
        }

        @Override // com.huawei.devicesdk.strategy.ScanStrategyBle.BluetoothScanInterface
        public void startScan(BluetoothAdapter bluetoothAdapter) {
            BluetoothLeScanner bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner();
            if (bluetoothLeScanner == null) {
                LogUtil.e("ScanStrategyBle", "BluetoothLeScanner is null.");
                ScanStrategyBle.this.d();
                return;
            }
            ArrayList arrayList = new ArrayList(16);
            arrayList.add(new ScanFilter.Builder().build());
            ScanSettings scanSettingsBuild = new ScanSettings.Builder().setScanMode(2).build();
            LogUtil.b("ScanStrategyBle", "startScan ble device.");
            try {
                bluetoothLeScanner.startScan(arrayList, scanSettingsBuild, this.f5461c);
            } catch (SecurityException e) {
                LogUtil.d("ScanStrategyBle", "HighVersionBluetoothScanService startScan SecurityException ", ExceptionUtils.c(e));
            }
        }

        @Override // com.huawei.devicesdk.strategy.ScanStrategyBle.BluetoothScanInterface
        public void stopScan(BluetoothAdapter bluetoothAdapter) {
            BluetoothLeScanner bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner();
            if (bluetoothLeScanner == null) {
                LogUtil.e("ScanStrategyBle", "BluetoothLeScanner is null.");
                return;
            }
            try {
                bluetoothLeScanner.stopScan(this.f5461c);
            } catch (SecurityException e) {
                LogUtil.d("ScanStrategyBle", "HighVersionBluetoothScanService stopScan SecurityException ", ExceptionUtils.c(e));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] e(ScanRecord scanRecord) {
            return scanRecord == null ? new byte[0] : scanRecord.getBytes();
        }
    }
}
