package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanRecord;
import android.bluetooth.le.ScanResult;
import android.os.Handler;
import android.os.HandlerThread;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback;
import com.huawei.hwbtsdk.btdatatype.datatype.BluetoothDeviceNode;
import health.compact.a.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class lnf extends ScanCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HandlerThread f40486a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BtDeviceDiscoverCallback f40487c;
    private Handler e;

    public lnf(BtDeviceDiscoverCallback btDeviceDiscoverCallback) {
        this.f40487c = null;
        this.f40486a = null;
        this.e = null;
        if (btDeviceDiscoverCallback != null) {
            this.f40487c = btDeviceDiscoverCallback;
        }
        HandlerThread handlerThread = new HandlerThread("LeScanCallback");
        this.f40486a = handlerThread;
        handlerThread.start();
        this.e = new Handler(this.f40486a.getLooper());
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanResult(int i, ScanResult scanResult) {
        super.onScanResult(i, scanResult);
        d(scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord());
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onBatchScanResults(List<ScanResult> list) {
        super.onBatchScanResults(list);
        LogUtil.b("LeScanCallback", "onBatchScanResults");
        for (ScanResult scanResult : list) {
            if (scanResult != null) {
                d(scanResult.getDevice(), scanResult.getRssi(), scanResult.getScanRecord());
            }
        }
    }

    @Override // android.bluetooth.le.ScanCallback
    public void onScanFailed(int i) {
        LogUtil.d("LeScanCallback", "onScanFailed:", Integer.valueOf(i));
        super.onScanFailed(i);
    }

    private void d(final BluetoothDevice bluetoothDevice, final int i, final ScanRecord scanRecord) {
        if (this.f40487c == null || bluetoothDevice == null) {
            LogUtil.e("LeScanCallback", "reportDeviceScanResult mDiscoveryCallback or device is null.");
            return;
        }
        try {
            LogUtil.b("LeScanCallback", "onLeScan found device :", bluetoothDevice.getName());
        } catch (SecurityException unused) {
            LogUtil.d("LeScanCallback", "get device name when reportDeviceScanResult failed with SecurityException");
        }
        if (this.f40486a == null) {
            LogUtil.e("LeScanCallback", "mHandlerThread is dead");
        } else {
            this.e.post(new Runnable() { // from class: lnf.2
                @Override // java.lang.Runnable
                public void run() {
                    BluetoothDeviceNode bluetoothDeviceNode = new BluetoothDeviceNode();
                    lmv lmvVarD = lnk.d().d(lnf.this.c(scanRecord));
                    if (lmvVarD != null) {
                        bluetoothDeviceNode.setRecordName(lmvVarD.c());
                        bluetoothDeviceNode.setDeviceType(lmvVarD.e());
                    }
                    bluetoothDeviceNode.setBtDevice(bluetoothDevice);
                    lnf.this.f40487c.onDeviceDiscovered(bluetoothDeviceNode, i, lnf.this.c(scanRecord));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public byte[] c(ScanRecord scanRecord) {
        if (scanRecord == null) {
            return null;
        }
        return scanRecord.getBytes();
    }

    public void d() {
        HandlerThread handlerThread = this.f40486a;
        if (handlerThread == null || handlerThread.getLooper() == null) {
            return;
        }
        LogUtil.b("LeScanCallback", "Enter quitHandlerThread.");
        this.f40486a.getLooper().quit();
        this.f40486a = null;
    }
}
