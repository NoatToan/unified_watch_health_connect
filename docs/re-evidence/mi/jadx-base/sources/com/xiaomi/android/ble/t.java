package com.xiaomi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import com.xiaomi.android.ble.data.Data;
import defpackage.b89;
import defpackage.bn5;
import defpackage.dpo;
import defpackage.fhd;

/* JADX INFO: loaded from: classes7.dex */
public final class t extends y<bn5> {
    public int n;

    public t(v.a aVar, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(aVar, bluetoothGattCharacteristic);
        this.n = 0;
    }

    public t A(bn5 bn5Var) {
        super.t(bn5Var);
        return this;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public t d(dpo dpoVar) {
        super.d(dpoVar);
        return this;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public t f(b89 b89Var) {
        super.f(b89Var);
        return this;
    }

    public boolean w() {
        return this.n > 0;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public t g(fhd fhdVar) {
        super.g(fhdVar);
        return this;
    }

    public void y(BluetoothDevice bluetoothDevice, byte[] bArr) {
        bn5 bn5Var = (bn5) this.m;
        if (bn5Var == null) {
            return;
        }
        bn5Var.a(bluetoothDevice, new Data(bArr));
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public t s(d dVar) {
        super.s(dVar);
        return this;
    }
}
