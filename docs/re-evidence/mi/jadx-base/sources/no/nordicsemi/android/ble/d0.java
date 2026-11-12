package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import defpackage.mok;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 extends x {
    public Runnable q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f28118r;

    public d0(x.a aVar) {
        super(aVar);
    }

    @Override // no.nordicsemi.android.ble.x
    public void A(final BluetoothDevice bluetoothDevice) {
        if (this.f28118r > 0) {
            Runnable runnable = new Runnable() { // from class: ofp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f29119a.o(bluetoothDevice);
                }
            };
            this.q = runnable;
            this.f28159b.postDelayed(runnable, this.f28118r);
        }
        super.A(bluetoothDevice);
    }

    @Override // no.nordicsemi.android.ble.x
    public boolean B(BluetoothDevice bluetoothDevice) {
        if (!this.p) {
            this.f28159b.a(this.q);
            this.q = null;
        }
        return super.B(bluetoothDevice);
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public d0 D(mok mokVar) {
        super.D(mokVar);
        return this;
    }

    @Override // no.nordicsemi.android.ble.x
    public final void j() {
        super.j();
    }

    public final /* synthetic */ void o(BluetoothDevice bluetoothDevice) {
        this.q = null;
        if (this.p) {
            return;
        }
        y(bluetoothDevice, -5);
        this.f28158a.c(this);
    }

    @Override // no.nordicsemi.android.ble.x
    public void y(BluetoothDevice bluetoothDevice, int i) {
        if (!this.p) {
            this.f28159b.a(this.q);
            this.q = null;
        }
        super.y(bluetoothDevice, i);
    }

    @Override // no.nordicsemi.android.ble.x
    public void z() {
        if (!this.p) {
            this.f28159b.a(this.q);
            this.q = null;
        }
        super.z();
    }
}
