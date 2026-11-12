package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import defpackage.a89;
import defpackage.an5;
import defpackage.cpo;
import defpackage.ehd;
import defpackage.mok;
import no.nordicsemi.android.ble.data.Data;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends b0<an5> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f28157r;

    public v(x.a aVar) {
        super(aVar);
        this.f28157r = 0;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public v i(cpo cpoVar) {
        super.i(cpoVar);
        return this;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public v k(a89 a89Var) {
        super.k(a89Var);
        return this;
    }

    public boolean I() {
        return this.f28157r > 0;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public v l(ehd ehdVar) {
        super.l(ehdVar);
        return this;
    }

    public boolean L(byte[] bArr) {
        return true;
    }

    public void M(final BluetoothDevice bluetoothDevice, byte[] bArr) {
        final an5 an5Var = (an5) this.q;
        if (an5Var == null) {
            return;
        }
        final Data data = new Data(bArr);
        this.f28159b.post(new Runnable() { // from class: cgj
            @Override // java.lang.Runnable
            public final void run() {
                an5Var.a(bluetoothDevice, data);
            }
        });
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public v D(mok mokVar) {
        super.D(mokVar);
        return this;
    }

    public v O(an5 an5Var) {
        super.E(an5Var);
        return this;
    }

    public v(x.a aVar, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(aVar, bluetoothGattCharacteristic);
        this.f28157r = 0;
    }
}
