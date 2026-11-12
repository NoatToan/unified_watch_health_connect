package defpackage;

import android.bluetooth.BluetoothDevice;
import no.nordicsemi.android.ble.data.Data;

/* JADX INFO: loaded from: classes3.dex */
public class knq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public an5 f24028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bb3 f24029b;
    public int c = 0;

    public knq(bb3 bb3Var) {
        this.f24029b = bb3Var;
    }

    public knq b() {
        this.f24028a = null;
        return this;
    }

    public boolean d(byte[] bArr) {
        return true;
    }

    public void e(final BluetoothDevice bluetoothDevice, byte[] bArr) {
        final an5 an5Var = this.f24028a;
        if (an5Var == null) {
            return;
        }
        final Data data = new Data(bArr);
        this.f24029b.post(new Runnable() { // from class: jnq
            @Override // java.lang.Runnable
            public final void run() {
                an5Var.a(bluetoothDevice, data);
            }
        });
    }

    public knq f(an5 an5Var) {
        this.f24028a = an5Var;
        return this;
    }
}
