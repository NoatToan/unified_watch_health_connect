package com.xiaomi.android.ble;

import android.bluetooth.BluetoothDevice;
import com.xiaomi.android.ble.data.Data;
import defpackage.b89;
import defpackage.bn5;
import defpackage.dpo;
import defpackage.fhd;

/* JADX INFO: loaded from: classes7.dex */
public class c0 extends b0<bn5> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public v f11116r;
    public int s;
    public int t;

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public c0 g(fhd fhdVar) {
        super.g(fhdVar);
        return this;
    }

    public boolean B() {
        return this.s != -123455;
    }

    public boolean C() {
        return this.s == -123456;
    }

    public void D(BluetoothDevice bluetoothDevice, byte[] bArr) {
        bn5 bn5Var = (bn5) this.q;
        if (bn5Var == null) {
            return;
        }
        bn5Var.a(bluetoothDevice, new Data(bArr));
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public c0 s(d dVar) {
        super.v(dVar);
        return this;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public c0 d(dpo dpoVar) {
        super.d(dpoVar);
        return this;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public c0 f(b89 b89Var) {
        super.f(b89Var);
        return this;
    }

    public v y() {
        return this.f11116r;
    }

    public boolean z() {
        return this.t > 0;
    }
}
