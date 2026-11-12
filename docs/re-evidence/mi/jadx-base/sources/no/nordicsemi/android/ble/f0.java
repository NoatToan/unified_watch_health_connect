package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import defpackage.a89;
import defpackage.an5;
import defpackage.cpo;
import defpackage.ehd;
import defpackage.mok;
import no.nordicsemi.android.ble.data.Data;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 extends a<an5> {
    public int v;

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public f0 i(cpo cpoVar) {
        super.i(cpoVar);
        return this;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public f0 k(a89 a89Var) {
        super.k(a89Var);
        return this;
    }

    public boolean M() {
        return this.v > 0;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public f0 l(ehd ehdVar) {
        super.l(ehdVar);
        return this;
    }

    public boolean P(byte[] bArr) {
        return true;
    }

    public void Q(final BluetoothDevice bluetoothDevice, byte[] bArr) {
        final an5 an5Var = (an5) this.s;
        if (an5Var == null) {
            return;
        }
        final Data data = new Data(bArr);
        this.f28159b.post(new Runnable() { // from class: s3r
            @Override // java.lang.Runnable
            public final void run() {
                an5Var.a(bluetoothDevice, data);
            }
        });
    }

    @Override // no.nordicsemi.android.ble.d0
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public f0 D(mok mokVar) {
        super.D(mokVar);
        return this;
    }
}
