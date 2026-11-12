package com.xiaomi.android.ble;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.IntRange;
import defpackage.b89;
import defpackage.dpo;
import defpackage.fhd;
import defpackage.pzk;

/* JADX INFO: loaded from: classes7.dex */
public final class u extends y<pzk> {
    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public u d(dpo dpoVar) {
        super.d(dpoVar);
        return this;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public u f(b89 b89Var) {
        super.f(b89Var);
        return this;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public u g(fhd fhdVar) {
        super.g(fhdVar);
        return this;
    }

    public void x(BluetoothDevice bluetoothDevice, @IntRange(from = -128, to = 20) int i) {
        T t = this.m;
        if (t != 0) {
            ((pzk) t).a(bluetoothDevice, i);
        }
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public u s(d dVar) {
        super.s(dVar);
        return this;
    }
}
