package com.xiaomi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.ConditionVariable;
import androidx.annotation.IntRange;
import defpackage.b89;
import defpackage.dpo;
import defpackage.fhd;

/* JADX INFO: loaded from: classes7.dex */
public abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f11167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConditionVariable f11168b;
    public final a c;
    public final BluetoothGattCharacteristic d;
    public final BluetoothGattDescriptor e;
    public dpo f;
    public b89 g;
    public fhd h;
    public dpo i;
    public b89 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f11169k;
    public boolean l;

    public enum a {
        SET,
        CONNECT,
        DISCONNECT,
        CREATE_BOND,
        REMOVE_BOND,
        WRITE,
        READ,
        WRITE_DESCRIPTOR,
        READ_DESCRIPTOR,
        ENABLE_NOTIFICATIONS,
        ENABLE_INDICATIONS,
        DISABLE_NOTIFICATIONS,
        DISABLE_INDICATIONS,
        WAIT_FOR_NOTIFICATION,
        WAIT_FOR_INDICATION,
        ENABLE_SERVICE_CHANGED_INDICATIONS,
        REQUEST_MTU,
        REQUEST_CONNECTION_PRIORITY,
        SET_PREFERRED_PHY,
        READ_PHY,
        READ_RSSI,
        REFRESH_CACHE,
        SLEEP
    }

    public v(a aVar) {
        this.c = aVar;
        this.d = null;
        this.e = null;
        this.f11168b = new ConditionVariable(true);
    }

    public static com.xiaomi.android.ble.a a(BluetoothDevice bluetoothDevice, boolean z) {
        return new com.xiaomi.android.ble.a(a.CONNECT, bluetoothDevice, z);
    }

    @Deprecated
    public static x b() {
        return new x(a.CREATE_BOND);
    }

    public static c c() {
        return new c(a.DISCONNECT);
    }

    @Deprecated
    public static d0 h(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return new d0(a.DISABLE_NOTIFICATIONS, bluetoothGattCharacteristic);
    }

    @Deprecated
    public static d0 i(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return new d0(a.ENABLE_NOTIFICATIONS, bluetoothGattCharacteristic);
    }

    public static d0 j() {
        return new d0(a.ENABLE_SERVICE_CHANGED_INDICATIONS);
    }

    @Deprecated
    public static r k(@IntRange(from = 23, to = 517) int i) {
        return new r(a.REQUEST_MTU, i);
    }

    @Deprecated
    public static t l(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return new t(a.READ, bluetoothGattCharacteristic);
    }

    @Deprecated
    public static d0 m(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return new d0(a.WRITE, bluetoothGattCharacteristic, bArr, 0, bArr != null ? bArr.length : 0, bluetoothGattCharacteristic != null ? bluetoothGattCharacteristic.getWriteType() : 2);
    }

    @Deprecated
    public static x r() {
        return new x(a.REMOVE_BOND);
    }

    public v d(dpo dpoVar) {
        this.f = dpoVar;
        return this;
    }

    public void e() {
        this.f11167a.B0(this);
    }

    public v f(b89 b89Var) {
        this.g = b89Var;
        return this;
    }

    public v g(fhd fhdVar) {
        this.h = fhdVar;
        return this;
    }

    public void n(BluetoothDevice bluetoothDevice, int i) {
        if (this.l) {
            return;
        }
        this.l = true;
        b89 b89Var = this.g;
        if (b89Var != null) {
            b89Var.a(bluetoothDevice, i);
        }
        b89 b89Var2 = this.j;
        if (b89Var2 != null) {
            b89Var2.a(bluetoothDevice, i);
        }
    }

    public void o() {
        if (this.l) {
            return;
        }
        this.l = true;
        fhd fhdVar = this.h;
        if (fhdVar != null) {
            fhdVar.b();
        }
    }

    public void p(BluetoothDevice bluetoothDevice) {
    }

    public void q(BluetoothDevice bluetoothDevice) {
        if (this.l) {
            return;
        }
        this.l = true;
        dpo dpoVar = this.f;
        if (dpoVar != null) {
            dpoVar.a(bluetoothDevice);
        }
        dpo dpoVar2 = this.i;
        if (dpoVar2 != null) {
            dpoVar2.a(bluetoothDevice);
        }
    }

    public v s(d dVar) {
        this.f11167a = dVar;
        return this;
    }

    public v(a aVar, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.c = aVar;
        this.d = bluetoothGattCharacteristic;
        this.e = null;
        this.f11168b = new ConditionVariable(true);
    }
}
