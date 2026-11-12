package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import health.compact.a.util.LogUtil;

/* JADX INFO: loaded from: classes7.dex */
public class esk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static esk f33414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BluetoothAdapter f33415b;

    private esk() {
    }

    public static esk b() {
        if (f33414a == null) {
            f33414a = new esk();
        }
        return f33414a;
    }

    public int b(Context context) {
        if (this.f33415b == null) {
            LogUtil.a("BluetoothHelper", "getBluetoothEnabledStatus init bluetoothAdapter is null");
            BluetoothManager bluetoothManager = context.getSystemService("bluetooth") instanceof BluetoothManager ? (BluetoothManager) context.getSystemService("bluetooth") : null;
            if (bluetoothManager == null) {
                LogUtil.d("BluetoothHelper", "getBluetoothEnabledStatus no BT Manager in this phone");
                return 0;
            }
            this.f33415b = bluetoothManager.getAdapter();
        }
        BluetoothAdapter bluetoothAdapter = this.f33415b;
        if (bluetoothAdapter == null) {
            LogUtil.d("BluetoothHelper", "getBluetoothEnabledStatus no BT in this phone");
            return 0;
        }
        if (bluetoothAdapter.isEnabled()) {
            return 1;
        }
        LogUtil.a("BluetoothHelper", "getBluetoothEnabledStatus is no enabled");
        return 2;
    }

    public void c() {
        f33414a = null;
    }
}
