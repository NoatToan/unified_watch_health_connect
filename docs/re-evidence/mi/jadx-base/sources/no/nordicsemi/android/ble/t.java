package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.IntRange;
import defpackage.a89;
import defpackage.cpo;
import defpackage.ehd;
import defpackage.m9g;
import defpackage.mok;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends b0<m9g> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f28155r;

    public t(x.a aVar, @IntRange(from = 23, to = 517) int i) {
        super(aVar);
        i = i < 23 ? 23 : i;
        this.f28155r = i > 517 ? 517 : i;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public t i(cpo cpoVar) {
        super.i(cpoVar);
        return this;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public t k(a89 a89Var) {
        super.k(a89Var);
        return this;
    }

    public int I() {
        return this.f28155r;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public t l(ehd ehdVar) {
        super.l(ehdVar);
        return this;
    }

    public final /* synthetic */ void K(BluetoothDevice bluetoothDevice, int i) {
        T t = this.q;
        if (t != 0) {
            ((m9g) t).a(bluetoothDevice, i);
        }
    }

    public void L(final BluetoothDevice bluetoothDevice, @IntRange(from = 23, to = 517) final int i) {
        this.f28159b.post(new Runnable() { // from class: o9g
            @Override // java.lang.Runnable
            public final void run() {
                this.f28894a.K(bluetoothDevice, i);
            }
        });
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public t D(mok mokVar) {
        super.D(mokVar);
        return this;
    }

    public t N(m9g m9gVar) {
        super.E(m9gVar);
        return this;
    }
}
