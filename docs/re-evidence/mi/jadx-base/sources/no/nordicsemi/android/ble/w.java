package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.IntRange;
import defpackage.a89;
import defpackage.cpo;
import defpackage.ehd;
import defpackage.mok;
import defpackage.ozk;

/* JADX INFO: loaded from: classes3.dex */
public final class w extends b0<ozk> {
    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public w i(cpo cpoVar) {
        super.i(cpoVar);
        return this;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public w k(a89 a89Var) {
        super.k(a89Var);
        return this;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public w l(ehd ehdVar) {
        super.l(ehdVar);
        return this;
    }

    public final /* synthetic */ void J(BluetoothDevice bluetoothDevice, int i) {
        T t = this.q;
        if (t != 0) {
            ((ozk) t).a(bluetoothDevice, i);
        }
    }

    public void K(final BluetoothDevice bluetoothDevice, @IntRange(from = -128, to = 20) final int i) {
        this.f28159b.post(new Runnable() { // from class: dgj
            @Override // java.lang.Runnable
            public final void run() {
                this.f15513a.J(bluetoothDevice, i);
            }
        });
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public w D(mok mokVar) {
        super.D(mokVar);
        return this;
    }
}
