package com.xiaomi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.os.Handler;
import defpackage.nfp;

/* JADX INFO: loaded from: classes7.dex */
public abstract class a0 extends v {
    public nfp m;
    public Runnable n;
    public Handler o;
    public long p;

    public a0(v.a aVar) {
        super(aVar);
    }

    @Override // com.xiaomi.android.ble.v
    public final void e() {
        super.e();
    }

    @Override // com.xiaomi.android.ble.v
    public void n(BluetoothDevice bluetoothDevice, int i) {
        if (!this.l) {
            this.o.removeCallbacks(this.n);
            this.n = null;
        }
        super.n(bluetoothDevice, i);
    }

    @Override // com.xiaomi.android.ble.v
    public void o() {
        if (!this.l) {
            this.o.removeCallbacks(this.n);
            this.n = null;
        }
        super.o();
    }

    @Override // com.xiaomi.android.ble.v
    public void p(final BluetoothDevice bluetoothDevice) {
        if (this.p > 0) {
            Runnable runnable = new Runnable() { // from class: pfp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f30357a.u(bluetoothDevice);
                }
            };
            this.n = runnable;
            this.o.postDelayed(runnable, this.p);
        }
        super.p(bluetoothDevice);
    }

    @Override // com.xiaomi.android.ble.v
    public void q(BluetoothDevice bluetoothDevice) {
        if (!this.l) {
            this.o.removeCallbacks(this.n);
            this.n = null;
        }
        super.q(bluetoothDevice);
    }

    public final /* synthetic */ void u(BluetoothDevice bluetoothDevice) {
        this.n = null;
        if (this.l) {
            return;
        }
        n(bluetoothDevice, -5);
        this.m.q(this);
    }

    public a0 v(d dVar) {
        super.s(dVar);
        this.o = dVar.c;
        this.m = dVar;
        return this;
    }
}
