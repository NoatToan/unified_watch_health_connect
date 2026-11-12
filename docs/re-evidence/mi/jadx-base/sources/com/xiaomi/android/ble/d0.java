package com.xiaomi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import androidx.annotation.IntRange;
import com.xiaomi.android.ble.data.Data;
import defpackage.b89;
import defpackage.bo5;
import defpackage.dpo;
import defpackage.ew5;
import defpackage.fhd;
import defpackage.ip5;
import java.util.Arrays;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends y<bo5> {
    public static final ip5 u = new ew5();
    public ip5 n;
    public final byte[] o;
    public final int p;
    public byte[] q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public byte[] f11126r;
    public int s;
    public boolean t;

    public d0(v.a aVar) {
        this(aVar, null);
    }

    public static byte[] u(byte[] bArr, @IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        if (bArr == null || i > bArr.length) {
            return null;
        }
        int iMin = Math.min(bArr.length - i, i2);
        byte[] bArr2 = new byte[iMin];
        System.arraycopy(bArr, i, bArr2, 0, iMin);
        return bArr2;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public d0 g(fhd fhdVar) {
        super.g(fhdVar);
        return this;
    }

    public boolean B(BluetoothDevice bluetoothDevice, byte[] bArr) {
        T t;
        this.s++;
        if (this.t && (t = this.m) != 0) {
            ((bo5) t).a(bluetoothDevice, new Data(this.o));
        }
        return Arrays.equals(bArr, this.q);
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public d0 s(d dVar) {
        super.s(dVar);
        return this;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
    public d0 d(dpo dpoVar) {
        super.d(dpoVar);
        return this;
    }

    @Override // com.xiaomi.android.ble.v
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public d0 f(b89 b89Var) {
        super.f(b89Var);
        return this;
    }

    public byte[] x(@IntRange(from = 23, to = 517) int i) {
        byte[] bArr;
        ip5 ip5Var = this.n;
        if (ip5Var == null || (bArr = this.o) == null) {
            this.t = true;
            byte[] bArr2 = this.o;
            this.q = bArr2;
            return bArr2;
        }
        int i2 = this.p != 4 ? i - 3 : i - 12;
        byte[] bArrA = this.f11126r;
        if (bArrA == null) {
            bArrA = ip5Var.a(bArr, this.s, i2);
        }
        if (bArrA != null) {
            this.f11126r = this.n.a(this.o, this.s + 1, i2);
        }
        if (this.f11126r == null) {
            this.t = true;
        }
        this.q = bArrA;
        return bArrA;
    }

    public int y() {
        return this.p;
    }

    public boolean z() {
        return !this.t;
    }

    public d0(v.a aVar, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(aVar, bluetoothGattCharacteristic);
        this.s = 0;
        this.o = null;
        this.p = 0;
        this.t = true;
    }

    public d0(v.a aVar, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, int i3) {
        super(aVar, bluetoothGattCharacteristic);
        this.s = 0;
        this.t = false;
        this.o = u(bArr, i, i2);
        this.p = i3;
    }
}
