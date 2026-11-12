package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import androidx.annotation.IntRange;
import defpackage.a83;
import defpackage.a89;
import defpackage.ao5;
import defpackage.bi2;
import defpackage.cpo;
import defpackage.dw5;
import defpackage.ehd;
import defpackage.hp5;
import defpackage.mok;
import java.util.Arrays;
import no.nordicsemi.android.ble.data.Data;

/* JADX INFO: loaded from: classes3.dex */
public final class g0 extends b0<ao5> {
    public static final hp5 y = new dw5();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public hp5 f28127r;
    public final byte[] s;
    public final int t;
    public byte[] u;
    public byte[] v;
    public int w;
    public boolean x;

    public g0(x.a aVar) {
        this(aVar, null);
    }

    public g0 H(bi2 bi2Var) {
        super.e(bi2Var);
        return this;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public g0 i(cpo cpoVar) {
        super.i(cpoVar);
        return this;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public g0 k(a89 a89Var) {
        super.k(a89Var);
        return this;
    }

    public byte[] K(@IntRange(from = 23, to = 517) int i) {
        byte[] bArr;
        hp5 hp5Var = this.f28127r;
        if (hp5Var == null || (bArr = this.s) == null) {
            this.x = true;
            byte[] bArr2 = this.s;
            this.u = bArr2;
            return bArr2;
        }
        int i2 = this.t != 4 ? i - 3 : i - 12;
        byte[] bArrA = this.v;
        if (bArrA == null) {
            bArrA = hp5Var.a(bArr, this.w, i2);
        }
        if (bArrA != null) {
            this.v = this.f28127r.a(this.s, this.w + 1, i2);
        }
        if (this.v == null) {
            this.x = true;
        }
        this.u = bArrA;
        return bArrA;
    }

    public int L() {
        return this.t;
    }

    public boolean M() {
        return !this.x;
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public g0 l(ehd ehdVar) {
        super.l(ehdVar);
        return this;
    }

    public final /* synthetic */ void O(BluetoothDevice bluetoothDevice, byte[] bArr) {
    }

    public final /* synthetic */ void P(BluetoothDevice bluetoothDevice) {
        T t = this.q;
        if (t != 0) {
            ((ao5) t).a(bluetoothDevice, new Data(this.s));
        }
    }

    public boolean Q(final BluetoothDevice bluetoothDevice, final byte[] bArr) {
        this.f28159b.post(new Runnable() { // from class: cpr
            @Override // java.lang.Runnable
            public final void run() {
                this.f14604a.O(bluetoothDevice, bArr);
            }
        });
        this.w++;
        if (this.x) {
            this.f28159b.post(new Runnable() { // from class: dpr
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15794a.P(bluetoothDevice);
                }
            });
        }
        return Arrays.equals(bArr, this.u);
    }

    @Override // no.nordicsemi.android.ble.x
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public g0 D(mok mokVar) {
        super.D(mokVar);
        return this;
    }

    public g0(x.a aVar, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        super(aVar, bluetoothGattCharacteristic);
        this.w = 0;
        this.s = null;
        this.t = 0;
        this.x = true;
    }

    public g0(x.a aVar, BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, @IntRange(from = 0) int i, @IntRange(from = 0) int i2, int i3) {
        super(aVar, bluetoothGattCharacteristic);
        this.w = 0;
        this.x = false;
        this.s = a83.a(bArr, i, i2);
        this.t = i3;
    }
}
