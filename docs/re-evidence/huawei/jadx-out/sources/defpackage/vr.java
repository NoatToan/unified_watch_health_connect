package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import com.careforeyou.library.bt.scanner.BluetoothLeScannerCompat;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class vr extends BluetoothLeScannerCompat {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ScanCallback f51499a = new ScanCallback() { // from class: vr.3
        @Override // android.bluetooth.le.ScanCallback
        public void onScanResult(int i, final ScanResult scanResult) {
            super.onScanResult(i, scanResult);
            final BluetoothDevice device = scanResult.getDevice();
            if (device.getAddress() == null) {
                return;
            }
            wc.b(new Runnable() { // from class: vr.3.5
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (this) {
                        vr.this.handleBroadcastInfo(device, scanResult.getRssi(), scanResult.getScanRecord().getBytes());
                    }
                }
            });
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onBatchScanResults(List<ScanResult> list) {
            super.onBatchScanResults(list);
            for (final ScanResult scanResult : list) {
                final BluetoothDevice device = scanResult.getDevice();
                if (device.getAddress() == null) {
                    return;
                } else {
                    wc.b(new Runnable() { // from class: vr.3.3
                        @Override // java.lang.Runnable
                        public void run() {
                            synchronized (this) {
                                vr.this.handleBroadcastInfo(device, scanResult.getRssi(), scanResult.getScanRecord().getBytes());
                            }
                        }
                    });
                }
            }
        }

        @Override // android.bluetooth.le.ScanCallback
        public void onScanFailed(int i) {
            super.onScanFailed(i);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BluetoothAdapter f51500b = BluetoothAdapter.getDefaultAdapter();

    @Override // com.careforeyou.library.bt.scanner.BluetoothLeScannerCompat
    public boolean startLeScanInternal() {
        BluetoothLeScanner bluetoothLeScanner;
        ScanSettings.Builder builder = new ScanSettings.Builder();
        builder.setScanMode(2);
        BluetoothAdapter bluetoothAdapter = this.f51500b;
        if (bluetoothAdapter == null || (bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner()) == null) {
            return false;
        }
        wf.e("CsBtUtil_v11", "localBluetoothLeScanner.startScan ");
        bluetoothLeScanner.startScan((List<ScanFilter>) null, builder.build(), this.f51499a);
        return true;
    }

    @Override // com.careforeyou.library.bt.scanner.BluetoothLeScannerCompat
    public void stopLeScanInternal() {
        BluetoothLeScanner bluetoothLeScanner;
        try {
            BluetoothAdapter bluetoothAdapter = this.f51500b;
            if (bluetoothAdapter == null || (bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner()) == null) {
                return;
            }
            bluetoothLeScanner.stopScan(this.f51499a);
        } catch (Exception e) {
            wf.b("CsBtUtil_v11", e.getMessage());
        }
    }
}
