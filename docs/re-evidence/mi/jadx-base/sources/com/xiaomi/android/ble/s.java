package com.xiaomi.android.ble;

import android.bluetooth.BluetoothDevice;
import defpackage.b89;
import defpackage.dpo;
import defpackage.fhd;
import defpackage.yuh;

/* JADX INFO: loaded from: classes7.dex */
public final class s extends y<yuh> {
    public final int n;
    public final int o;
    public final int p;

    public void A(BluetoothDevice bluetoothDevice, int i, int i2) {
        T t = this.m;
        if (t != 0) {
            ((yuh) t).a(bluetoothDevice, i, i2);
        }
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public s s(d dVar) {
        super.s(dVar);
        return this;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public s d(dpo dpoVar) {
        super.d(dpoVar);
        return this;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public s f(b89 b89Var) {
        super.f(b89Var);
        return this;
    }

    public int w() {
        return this.p;
    }

    public int x() {
        return this.o;
    }

    public int y() {
        return this.n;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public s g(fhd fhdVar) {
        super.g(fhdVar);
        return this;
    }
}
