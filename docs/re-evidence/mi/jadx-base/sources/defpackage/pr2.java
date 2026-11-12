package defpackage;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.IntRange;
import androidx.annotation.RequiresPermission;
import java.util.UUID;
import no.nordicsemi.android.ble.BleManagerHandler;
import no.nordicsemi.android.ble.g0;
import no.nordicsemi.android.ble.q;
import no.nordicsemi.android.ble.s;
import no.nordicsemi.android.ble.t;
import no.nordicsemi.android.ble.v;
import no.nordicsemi.android.ble.x;

/* JADX INFO: loaded from: classes3.dex */
public abstract class pr2 {
    public static final UUID e = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    public static final UUID f = UUID.fromString("0000180F-0000-1000-8000-00805f9b34fb");
    public static final UUID g = UUID.fromString("00002A19-0000-1000-8000-00805f9b34fb");
    public static final UUID h = UUID.fromString("00001801-0000-1000-8000-00805f9b34fb");
    public static final UUID i = UUID.fromString("00002A05-0000-1000-8000-00805f9b34fb");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f30670b;

    @Deprecated
    public qr2 c;
    public final BroadcastReceiver d;

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            BluetoothDevice bluetoothDevice = (BluetoothDevice) intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
            BluetoothDevice bluetoothDeviceB0 = pr2.this.f30670b.B0();
            if (bluetoothDeviceB0 == null || bluetoothDevice == null || !bluetoothDevice.getAddress().equals(bluetoothDeviceB0.getAddress())) {
                return;
            }
            int intExtra = intent.getIntExtra("android.bluetooth.device.extra.PAIRING_VARIANT", 0);
            pr2.this.D(3, "[Broadcast] Action received: android.bluetooth.device.action.PAIRING_REQUEST, pairing variant: " + blh.b(intExtra) + " (" + intExtra + ")");
            pr2.this.E(bluetoothDevice, intExtra);
        }
    }

    public static abstract class b extends BleManagerHandler {
        @Override // no.nordicsemi.android.ble.BleManagerHandler
        public /* bridge */ /* synthetic */ void S1() {
            super.S1();
        }
    }

    public pr2(Context context) {
        this(context, new Handler(Looper.getMainLooper()));
    }

    public final boolean A() {
        BluetoothDevice bluetoothDeviceB0 = this.f30670b.B0();
        return bluetoothDeviceB0 != null && bluetoothDeviceB0.getBondState() == 12;
    }

    public final /* synthetic */ void B(BluetoothDevice bluetoothDevice) {
        this.f30670b.b2();
    }

    public final /* synthetic */ void C(BluetoothDevice bluetoothDevice) {
        D(4, "Battery Level notifications enabled");
    }

    public abstract void D(int i2, String str);

    public void E(BluetoothDevice bluetoothDevice, int i2) {
    }

    public void F(@IntRange(from = 23, to = 517) int i2) {
        this.f30670b.X1(i2);
    }

    @Deprecated
    public void G() {
        x.v().D(this.f30670b).O(this.f30670b.A0()).j();
    }

    public v H(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return x.w(bluetoothGattCharacteristic).D(this.f30670b);
    }

    @RequiresPermission("android.permission.BLUETOOTH_ADMIN")
    public x I() {
        return x.C().D(this.f30670b);
    }

    public t J(@IntRange(from = 23, to = 517) int i2) {
        return x.u(i2).D(this.f30670b);
    }

    @Deprecated
    public void K(qr2 qr2Var) {
        this.c = qr2Var;
    }

    public knq L(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return this.f30670b.E0(bluetoothGattCharacteristic);
    }

    @Deprecated
    public boolean M() {
        return false;
    }

    public abstract boolean N();

    public g0 O(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return x.x(bluetoothGattCharacteristic, bArr).D(this.f30670b);
    }

    public void close() {
        try {
            this.f30669a.unregisterReceiver(this.d);
        } catch (Exception unused) {
        }
        this.f30670b.w0();
    }

    public BluetoothDevice h() {
        return this.f30670b.B0();
    }

    public final boolean isConnected() {
        return this.f30670b.j1();
    }

    public final q q(BluetoothDevice bluetoothDevice) {
        if (bluetoothDevice != null) {
            return x.f(bluetoothDevice).R(M()).D(this.f30670b);
        }
        throw new NullPointerException("Bluetooth device not specified");
    }

    @RequiresPermission("android.permission.BLUETOOTH_ADMIN")
    public x r() {
        return x.g().D(this.f30670b);
    }

    public g0 s(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return x.q(bluetoothGattCharacteristic).D(this.f30670b);
    }

    public final s t() {
        return x.h().D(this.f30670b);
    }

    @Deprecated
    public void u() {
        x.r().D(this.f30670b).H(new bi2() { // from class: nr2
            @Override // defpackage.bi2
            public final void a(BluetoothDevice bluetoothDevice) {
                this.f28278a.B(bluetoothDevice);
            }
        }).i(new cpo() { // from class: or2
            @Override // defpackage.cpo
            public final void a(BluetoothDevice bluetoothDevice) {
                this.f29408a.C(bluetoothDevice);
            }
        }).j();
    }

    public g0 v(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        return x.s(bluetoothGattCharacteristic).D(this.f30670b);
    }

    public final Context w() {
        return this.f30669a;
    }

    public abstract b x();

    @IntRange(from = 23, to = 517)
    public int y() {
        return this.f30670b.D0();
    }

    @IntRange(from = 0)
    public int z(boolean z) {
        return z ? 1600 : 300;
    }

    public pr2(Context context, Handler handler) {
        a aVar = new a();
        this.d = aVar;
        this.f30669a = context;
        b bVarX = x();
        this.f30670b = bVarX;
        bVarX.F0(this, handler);
        context.registerReceiver(aVar, new IntentFilter("android.bluetooth.device.action.PAIRING_REQUEST"));
    }
}
