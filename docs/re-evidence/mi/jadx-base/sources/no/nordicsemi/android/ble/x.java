package no.nordicsemi.android.ble;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.os.ConditionVariable;
import androidx.annotation.IntRange;
import defpackage.a89;
import defpackage.bb3;
import defpackage.bi2;
import defpackage.cpo;
import defpackage.ehd;
import defpackage.mok;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public mok f28158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public bb3 f28159b;
    public final ConditionVariable c;
    public final a d;
    public final BluetoothGattCharacteristic e;
    public final BluetoothGattDescriptor f;
    public bi2 g;
    public cpo h;
    public a89 i;
    public ehd j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public bi2 f28160k;
    public cpo l;
    public a89 m;
    public boolean n;
    public boolean o;
    public boolean p;

    public enum a {
        SET,
        CONNECT,
        DISCONNECT,
        CREATE_BOND,
        ENSURE_BOND,
        REMOVE_BOND,
        WRITE,
        NOTIFY,
        INDICATE,
        READ,
        WRITE_DESCRIPTOR,
        READ_DESCRIPTOR,
        BEGIN_RELIABLE_WRITE,
        EXECUTE_RELIABLE_WRITE,
        ABORT_RELIABLE_WRITE,
        ENABLE_NOTIFICATIONS,
        ENABLE_INDICATIONS,
        DISABLE_NOTIFICATIONS,
        DISABLE_INDICATIONS,
        WAIT_FOR_NOTIFICATION,
        WAIT_FOR_INDICATION,
        WAIT_FOR_READ,
        WAIT_FOR_WRITE,
        WAIT_FOR_CONDITION,
        SET_VALUE,
        SET_DESCRIPTOR_VALUE,
        READ_BATTERY_LEVEL,
        ENABLE_BATTERY_LEVEL_NOTIFICATIONS,
        DISABLE_BATTERY_LEVEL_NOTIFICATIONS,
        ENABLE_SERVICE_CHANGED_INDICATIONS,
        REQUEST_MTU,
        REQUEST_CONNECTION_PRIORITY,
        SET_PREFERRED_PHY,
        READ_PHY,
        READ_RSSI,
        REFRESH_CACHE,
        SLEEP
    }

    public x(a aVar) {
        this.d = aVar;
        this.e = null;
        this.f = null;
        this.c = new ConditionVariable(true);
    }

    @Deprecated
    public static a0 C() {
        return new a0(a.REMOVE_BOND);
    }

    public static q f(BluetoothDevice bluetoothDevice) {
        return new q(a.CONNECT, bluetoothDevice);
    }

    @Deprecated
    public static a0 g() {
        return new a0(a.CREATE_BOND);
    }

    public static s h() {
        return new s(a.DISCONNECT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o(BluetoothDevice bluetoothDevice) {
        bi2 bi2Var = this.g;
        if (bi2Var != null) {
            bi2Var.a(bluetoothDevice);
        }
    }

    @Deprecated
    public static g0 q(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return new g0(a.DISABLE_NOTIFICATIONS, bluetoothGattCharacteristic);
    }

    @Deprecated
    public static g0 r() {
        return new g0(a.ENABLE_BATTERY_LEVEL_NOTIFICATIONS);
    }

    @Deprecated
    public static g0 s(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return new g0(a.ENABLE_NOTIFICATIONS, bluetoothGattCharacteristic);
    }

    public static g0 t() {
        return new g0(a.ENABLE_SERVICE_CHANGED_INDICATIONS);
    }

    @Deprecated
    public static t u(@IntRange(from = 23, to = 517) int i) {
        return new t(a.REQUEST_MTU, i);
    }

    @Deprecated
    public static v v() {
        return new v(a.READ_BATTERY_LEVEL);
    }

    @Deprecated
    public static v w(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return new v(a.READ, bluetoothGattCharacteristic);
    }

    @Deprecated
    public static g0 x(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return new g0(a.WRITE, bluetoothGattCharacteristic, bArr, 0, bArr != null ? bArr.length : 0, bluetoothGattCharacteristic != null ? bluetoothGattCharacteristic.getWriteType() : 2);
    }

    public void A(final BluetoothDevice bluetoothDevice) {
        if (this.o) {
            return;
        }
        this.o = true;
        bi2 bi2Var = this.f28160k;
        if (bi2Var != null) {
            bi2Var.a(bluetoothDevice);
        }
        this.f28159b.post(new Runnable() { // from class: wmk
            @Override // java.lang.Runnable
            public final void run() {
                this.f38132a.o(bluetoothDevice);
            }
        });
    }

    public boolean B(final BluetoothDevice bluetoothDevice) {
        if (this.p) {
            return false;
        }
        this.p = true;
        cpo cpoVar = this.l;
        if (cpoVar != null) {
            cpoVar.a(bluetoothDevice);
        }
        this.f28159b.post(new Runnable() { // from class: vmk
            @Override // java.lang.Runnable
            public final void run() {
                this.f37032a.p(bluetoothDevice);
            }
        });
        return true;
    }

    public x D(mok mokVar) {
        this.f28158a = mokVar;
        if (this.f28159b == null) {
            this.f28159b = mokVar;
        }
        return this;
    }

    public x e(bi2 bi2Var) {
        this.g = bi2Var;
        return this;
    }

    public x i(cpo cpoVar) {
        this.h = cpoVar;
        return this;
    }

    public void j() {
        this.f28158a.b(this);
    }

    public x k(a89 a89Var) {
        this.i = a89Var;
        return this;
    }

    public x l(ehd ehdVar) {
        this.j = ehdVar;
        return this;
    }

    public final /* synthetic */ void m(BluetoothDevice bluetoothDevice, int i) {
        a89 a89Var = this.i;
        if (a89Var != null) {
            a89Var.a(bluetoothDevice, i);
        }
    }

    public final /* synthetic */ void n() {
        ehd ehdVar = this.j;
        if (ehdVar != null) {
            ehdVar.b();
        }
    }

    public final /* synthetic */ void p(BluetoothDevice bluetoothDevice) {
        cpo cpoVar = this.h;
        if (cpoVar != null) {
            cpoVar.a(bluetoothDevice);
        }
    }

    public void y(final BluetoothDevice bluetoothDevice, final int i) {
        if (this.p) {
            return;
        }
        this.p = true;
        a89 a89Var = this.m;
        if (a89Var != null) {
            a89Var.a(bluetoothDevice, i);
        }
        this.f28159b.post(new Runnable() { // from class: umk
            @Override // java.lang.Runnable
            public final void run() {
                this.f35936a.m(bluetoothDevice, i);
            }
        });
    }

    public void z() {
        if (this.p) {
            return;
        }
        this.p = true;
        this.f28159b.post(new Runnable() { // from class: xmk
            @Override // java.lang.Runnable
            public final void run() {
                this.f39271a.n();
            }
        });
    }

    public x(a aVar, BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        this.d = aVar;
        this.e = bluetoothGattCharacteristic;
        this.f = null;
        this.c = new ConditionVariable(true);
    }
}
