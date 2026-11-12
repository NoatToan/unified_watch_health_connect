package com.xiaomi.android.ble;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.IntRange;
import defpackage.b89;
import defpackage.dpo;
import defpackage.fhd;
import defpackage.n9g;

/* JADX INFO: loaded from: classes7.dex */
public final class r extends y<n9g> {
    public final int n;

    public r(v.a aVar, @IntRange(from = 23, to = 517) int i) {
        super(aVar);
        i = i < 23 ? 23 : i;
        this.n = i > 517 ? 517 : i;
    }

    public r A(n9g n9gVar) {
        super.t(n9gVar);
        return this;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public r d(dpo dpoVar) {
        super.d(dpoVar);
        return this;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public r f(b89 b89Var) {
        super.f(b89Var);
        return this;
    }

    public int w() {
        return this.n;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public r g(fhd fhdVar) {
        super.g(fhdVar);
        return this;
    }

    public void y(BluetoothDevice bluetoothDevice, @IntRange(from = 23, to = 517) int i) {
        T t = this.m;
        if (t != 0) {
            ((n9g) t).a(bluetoothDevice, i);
        }
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public r s(d dVar) {
        super.s(dVar);
        return this;
    }
}
