package defpackage;

import android.bluetooth.BluetoothDevice;
import com.xiaomi.android.ble.data.Data;

/* JADX INFO: loaded from: classes7.dex */
public class lnq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public bn5 f25251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f25252b = 0;

    public lnq a() {
        this.f25251a = null;
        return this;
    }

    public void b(BluetoothDevice bluetoothDevice, byte[] bArr) {
        bn5 bn5Var = this.f25251a;
        if (bn5Var == null) {
            return;
        }
        bn5Var.a(bluetoothDevice, new Data(bArr));
    }

    public lnq c(bn5 bn5Var) {
        this.f25251a = bn5Var;
        return this;
    }
}
