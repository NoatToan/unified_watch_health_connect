package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.careforeyou.library.bt.scanner.BluetoothLeScannerCompat;

/* JADX INFO: loaded from: classes4.dex */
public class vj extends BluetoothLeScannerCompat {
    private BluetoothAdapter.LeScanCallback e = new BluetoothAdapter.LeScanCallback() { // from class: vj.2
        @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
        public void onLeScan(final BluetoothDevice bluetoothDevice, final int i, final byte[] bArr) {
            if (bluetoothDevice == null || bluetoothDevice.getAddress() == null) {
                return;
            }
            wc.b(new Runnable() { // from class: vj.2.4
                @Override // java.lang.Runnable
                public void run() {
                    synchronized (this) {
                        vj.this.handleBroadcastInfo(bluetoothDevice, i, bArr);
                    }
                }
            });
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BluetoothAdapter f51187b = BluetoothAdapter.getDefaultAdapter();

    @Override // com.careforeyou.library.bt.scanner.BluetoothLeScannerCompat
    public boolean startLeScanInternal() {
        BluetoothAdapter bluetoothAdapter = this.f51187b;
        if (bluetoothAdapter != null) {
            return bluetoothAdapter.startLeScan(this.e);
        }
        return false;
    }

    @Override // com.careforeyou.library.bt.scanner.BluetoothLeScannerCompat
    public void stopLeScanInternal() {
        try {
            BluetoothAdapter bluetoothAdapter = this.f51187b;
            if (bluetoothAdapter != null) {
                bluetoothAdapter.stopLeScan(this.e);
            }
        } catch (Exception e) {
            wf.b("CsBtUtil_v11", e.getMessage());
        }
    }
}
