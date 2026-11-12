package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.IntRange;
import defpackage.a89;
import defpackage.cpo;
import defpackage.ehd;
import defpackage.mok;

/* JADX INFO: loaded from: classes3.dex */
public class q extends d0 {
    public final BluetoothDevice s;
    public int t;

    @IntRange(from = 0)
    public int u;

    @IntRange(from = 0)
    public int v;

    @IntRange(from = 0)
    public int w;
    public boolean x;

    public q(x.a aVar, BluetoothDevice bluetoothDevice) {
        super(aVar);
        this.u = 0;
        this.v = 0;
        this.w = 0;
        this.x = false;
        this.s = bluetoothDevice;
        this.t = 1;
    }

    public boolean G() {
        int i = this.v;
        if (i <= 0) {
            return false;
        }
        this.v = i - 1;
        return true;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public q i(cpo cpoVar) {
        super.i(cpoVar);
        return this;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public q k(a89 a89Var) {
        super.k(a89Var);
        return this;
    }

    public BluetoothDevice J() {
        return this.s;
    }

    public int K() {
        return this.t;
    }

    @IntRange(from = 0)
    public int L() {
        return this.w;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
    public q l(ehd ehdVar) {
        super.l(ehdVar);
        return this;
    }

    public boolean N() {
        int i = this.u;
        this.u = i + 1;
        return i == 0;
    }

    public q O(@IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        this.v = i;
        this.w = i2;
        return this;
    }

    @Override // no.nordicsemi.android.ble.d0
    /* JADX INFO: renamed from: P, reason: merged with bridge method [inline-methods] */
    public q D(mok mokVar) {
        super.D(mokVar);
        return this;
    }

    public boolean Q() {
        return this.x;
    }

    public q R(boolean z) {
        this.x = z;
        return this;
    }
}
