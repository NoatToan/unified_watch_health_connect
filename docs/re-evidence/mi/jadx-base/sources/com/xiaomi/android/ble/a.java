package com.xiaomi.android.ble;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.IntRange;
import defpackage.b89;
import defpackage.dpo;
import defpackage.fhd;

/* JADX INFO: loaded from: classes7.dex */
public class a extends a0 {
    public BluetoothDevice q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f11115r;

    @IntRange(from = 0)
    public int s;

    @IntRange(from = 0)
    public int t;

    @IntRange(from = 0)
    public int u;
    public boolean v;
    public final boolean w;

    public a(v.a aVar, BluetoothDevice bluetoothDevice, boolean z) {
        super(aVar);
        this.s = 0;
        this.t = 0;
        this.u = 0;
        this.v = false;
        this.q = bluetoothDevice;
        this.w = z;
        this.f11115r = 1;
    }

    @IntRange(from = 0)
    public int A() {
        return this.u;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public a g(fhd fhdVar) {
        super.g(fhdVar);
        return this;
    }

    public boolean C() {
        int i = this.s;
        this.s = i + 1;
        return i == 0;
    }

    public boolean D() {
        return this.w;
    }

    public a E(@IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        this.t = i;
        this.u = i2;
        return this;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public a s(d dVar) {
        super.v(dVar);
        return this;
    }

    public boolean G() {
        return this.v;
    }

    public a H(boolean z) {
        this.v = z;
        return this;
    }

    public boolean w() {
        int i = this.t;
        if (i <= 0) {
            return false;
        }
        this.t = i - 1;
        return true;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public a d(dpo dpoVar) {
        super.d(dpoVar);
        return this;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public a f(b89 b89Var) {
        super.f(b89Var);
        return this;
    }

    public BluetoothDevice z() {
        return this.q;
    }
}
