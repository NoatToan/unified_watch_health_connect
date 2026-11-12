package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.hwbtsdk.btdatatype.callback.BtDeviceDiscoverCallback;
import com.huawei.hwbtsdk.btdatatype.datatype.BluetoothDeviceNode;
import health.compact.a.LogUtil;

/* JADX INFO: loaded from: classes10.dex */
public class lms implements BluetoothAdapter.LeScanCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BtDeviceDiscoverCallback f40463b;

    public lms(BtDeviceDiscoverCallback btDeviceDiscoverCallback) {
        this.f40463b = null;
        if (btDeviceDiscoverCallback != null) {
            this.f40463b = btDeviceDiscoverCallback;
        }
    }

    @Override // android.bluetooth.BluetoothAdapter.LeScanCallback
    public void onLeScan(BluetoothDevice bluetoothDevice, int i, byte[] bArr) {
        if (this.f40463b == null || bluetoothDevice == null) {
            return;
        }
        try {
            LogUtil.b("BLEScanCallback", "onLeScan found device:", bluetoothDevice.getName());
            BluetoothDeviceNode bluetoothDeviceNode = new BluetoothDeviceNode();
            lmv lmvVarD = lnk.d().d(bArr);
            if (lmvVarD != null) {
                bluetoothDeviceNode.setRecordName(lmvVarD.c());
                bluetoothDeviceNode.setDeviceType(lmvVarD.e());
            }
            bluetoothDeviceNode.setBtDevice(bluetoothDevice);
            this.f40463b.onDeviceDiscovered(bluetoothDeviceNode, i, bArr);
        } catch (SecurityException e) {
            LogUtil.d("BLEScanCallback", "onLeScan SecurityException:", ExceptionUtils.c(e));
        }
    }
}
