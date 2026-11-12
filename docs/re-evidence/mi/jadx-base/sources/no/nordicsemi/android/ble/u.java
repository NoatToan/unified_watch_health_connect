package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import defpackage.a89;
import defpackage.cpo;
import defpackage.ehd;
import defpackage.mok;
import defpackage.xuh;

/* JADX INFO: loaded from: classes3.dex */
public final class u extends b0<xuh> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int f28156r;
    public final int s;
    public final int t;

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public u i(cpo cpoVar) {
        super.i(cpoVar);
        return this;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public u k(a89 a89Var) {
        super.k(a89Var);
        return this;
    }

    public int I() {
        return this.t;
    }

    public int J() {
        return this.s;
    }

    public int K() {
        return this.f28156r;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public u l(ehd ehdVar) {
        super.l(ehdVar);
        return this;
    }

    public final /* synthetic */ void M(BluetoothDevice bluetoothDevice, int i, int i2) {
        T t = this.q;
        if (t != 0) {
            ((xuh) t).a(bluetoothDevice, i, i2);
        }
    }

    public void N(final BluetoothDevice bluetoothDevice, final int i, final int i2) {
        this.f28159b.post(new Runnable() { // from class: zuh
            @Override // java.lang.Runnable
            public final void run() {
                this.f41689a.M(bluetoothDevice, i, i2);
            }
        });
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public u D(mok mokVar) {
        super.D(mokVar);
        return this;
    }
}
