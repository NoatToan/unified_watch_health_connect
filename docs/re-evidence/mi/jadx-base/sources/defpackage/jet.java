package defpackage;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattDescriptor;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.xiaomi.fitness.devicesettings.huami.vibratemode.VibrateModeProgressBar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public class jet extends iss {
    public int A;
    public boolean B;
    public zh.a C;
    public long D;
    public final sft E;
    public final wet F;
    public int G;

    public jet(Context context, BluetoothDevice bluetoothDevice, zh.a aVar) {
        super(context, bluetoothDevice);
        this.A = 0;
        this.B = true;
        this.D = -1L;
        this.E = sft.a();
        this.F = new wet();
        this.G = 0;
        this.C = aVar;
    }

    public static /* synthetic */ void J0(AtomicBoolean atomicBoolean, qe qeVar, CountDownLatch countDownLatch, byte[] bArr) {
        if (atomicBoolean.getAndSet(true)) {
            return;
        }
        t5t.d("GattPeripheral", "notify:" + tet.x(bArr));
        qeVar.b(bArr);
        countDownLatch.countDown();
    }

    @Override // defpackage.iss
    public /* bridge */ /* synthetic */ void A(t6 t6Var) {
        super.A(t6Var);
    }

    public boolean A0() {
        t5t.d("GattPeripheral", "init");
        zh.a aVar = this.C;
        if (aVar != null) {
            aVar.c(m0());
        }
        if (!B0()) {
            t5t.l("=================================================");
            t5t.l("============= INITIALIZATION FAILED =============");
            t5t.l("=================================================");
            this.A = 2;
            zh.a aVar2 = this.C;
            if (aVar2 != null) {
                aVar2.e(m0(), false);
            }
            return false;
        }
        t5t.q("=================================================");
        t5t.q("============= INITIALIZATION SUCCESS ============");
        t5t.q("=================================================");
        this.A = 1;
        this.F.f(this, true);
        zh.a aVar3 = this.C;
        if (aVar3 != null) {
            aVar3.e(m0(), true);
        }
        return true;
    }

    public boolean B0() {
        throw null;
    }

    public boolean C0() {
        return this.F.i();
    }

    public boolean D0() {
        return true;
    }

    public boolean E0() {
        return true;
    }

    public final qe F0(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr, int i) {
        t5t.d("GattPeripheral", "cmd:" + tet.x(bArr));
        if (bluetoothGattCharacteristic == null) {
            return null;
        }
        final qe qeVar = new qe();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (!E(bluetoothGattCharacteristic, new zh.b() { // from class: iet
            @Override // zh.b
            public final void e(byte[] bArr2) {
                jet.J0(atomicBoolean, qeVar, countDownLatch, bArr2);
            }
        })) {
            return null;
        }
        if (R0(bluetoothGattCharacteristic, bArr)) {
            try {
                countDownLatch.await(i, TimeUnit.MILLISECONDS);
            } catch (Exception e) {
                t5t.d("GattPeripheral", "await exception:" + e.getMessage());
            }
        }
        a0(bluetoothGattCharacteristic);
        t5t.d("GattPeripheral", "result:" + qeVar);
        return qeVar;
    }

    public void G0(urs ursVar) {
        this.F.c(ursVar);
    }

    public void H0(Object obj) {
        if (obj == null) {
            return;
        }
        synchronized (obj) {
            obj.notify();
        }
    }

    public void I0(Object obj, int i) {
        if (obj == null) {
            return;
        }
        synchronized (obj) {
            try {
                obj.wait(i);
            } catch (Exception unused) {
            }
        }
    }

    public boolean K0(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    public final boolean L0(int i, t6 t6Var) {
        return i >= 2 && t6Var != null && wbt.d;
    }

    public boolean M0(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    @Override // defpackage.iss
    public /* bridge */ /* synthetic */ void N(boolean z) {
        super.N(z);
    }

    public final boolean N0(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        t5t.d("GattPeripheral", "cmd:" + tet.x(bArr));
        if (bluetoothGattCharacteristic == null) {
            return false;
        }
        boolean zR0 = R0(bluetoothGattCharacteristic, bArr);
        t5t.d("GattPeripheral", "result:" + zR0);
        return zR0;
    }

    public boolean O0(byte[] bArr, int i) {
        return this.F.g(bArr, i);
    }

    public final qe P0(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        return F0(bluetoothGattCharacteristic, bArr, 5000);
    }

    public byte[] Q0(BluetoothGattDescriptor bluetoothGattDescriptor) {
        if (bluetoothGattDescriptor == null) {
            return null;
        }
        if (wbt.m) {
            w0();
        }
        if (T(bluetoothGattDescriptor) == 0) {
            return bluetoothGattDescriptor.getValue();
        }
        return null;
    }

    public boolean R0(BluetoothGattCharacteristic bluetoothGattCharacteristic, byte[] bArr) {
        if (bluetoothGattCharacteristic == null || bArr == null) {
            return false;
        }
        if (wbt.m) {
            w0();
        }
        return O(bluetoothGattCharacteristic, bArr) == 0;
    }

    @Override // defpackage.iss
    public /* bridge */ /* synthetic */ void S(boolean z) {
        super.S(z);
    }

    @SuppressLint({"NewApi"})
    public byte[] S0(BluetoothGattCharacteristic bluetoothGattCharacteristic) {
        if (bluetoothGattCharacteristic == null) {
            return null;
        }
        if (wbt.m) {
            w0();
        }
        if (X(bluetoothGattCharacteristic) == 0) {
            return bluetoothGattCharacteristic.getValue();
        }
        return null;
    }

    @Override // defpackage.iss
    public /* bridge */ /* synthetic */ void W(boolean z) {
        super.W(z);
    }

    @Override // defpackage.iss
    /* JADX INFO: renamed from: Y */
    public void R(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("onGattConnectionFailed, connectFailCount: ");
        sb.append(this.G);
        sb.append(", autoReconnect: ");
        sb.append(this.B);
        sb.append(", bridge null: ");
        sb.append(this.t == null);
        sb.append(", support: ");
        sb.append(wbt.d);
        t5t.d("GattPeripheral", sb.toString());
        zh.a aVar = this.C;
        if (aVar != null) {
            aVar.b(m0(), i);
        }
        tet.i(this.d);
        if (i == 133 || i == 255) {
            this.G++;
        }
        if (!L0(this.G, this.t)) {
            v0();
        } else {
            x(gr.ALWAYS_133);
            this.G = 0;
        }
    }

    @Override // defpackage.iss
    /* JADX INFO: renamed from: Z */
    public void M(int i) {
        t5t.d("GattPeripheral", "onGattDisconnected");
        zh.a aVar = this.C;
        if (aVar != null) {
            aVar.g(m0(), i);
        }
        v0();
    }

    @Override // defpackage.zh
    public void a(boolean z) {
        this.B = z;
    }

    @Override // defpackage.iss
    /* JADX INFO: renamed from: c0 */
    public void V(int i) {
        zh.a aVar = this.C;
        if (aVar != null) {
            aVar.d(m0(), i);
        }
        k0();
    }

    @Override // defpackage.zh
    public Boolean d() {
        return Boolean.valueOf(this.B);
    }

    @Override // defpackage.iss
    @SuppressLint({"NewApi"})
    public final void g0() {
        y0().c();
        t5t.c("device:");
        t5t.c("         name: " + tet.f(m0()));
        t5t.c("      address: " + m0().getAddress());
        switch (m0().getBondState()) {
            case 10:
                t5t.c("   bond state: NONE");
                break;
            case 11:
                t5t.c("   bond state: BONDING");
                break;
            case 12:
                t5t.c("   bond state: BONDED");
                break;
        }
        int iT = tet.t(m0());
        if (iT == 0) {
            t5t.c("         type: UNKNOWN");
        } else if (iT == 1) {
            t5t.c("         type: CLASSIC");
        } else if (iT == 2) {
            t5t.c("         type: LE");
        } else if (iT == 3) {
            t5t.c("         type: DUAL");
        }
        zh.a aVar = this.C;
        if (aVar != null) {
            aVar.j(m0());
        }
        super.g0();
    }

    @Override // defpackage.iss
    public /* bridge */ /* synthetic */ void h0() {
        super.h0();
    }

    @Override // defpackage.iss
    public final void k0() {
        super.k0();
    }

    @Override // defpackage.iss
    @SuppressLint({"NewApi"})
    public void n() {
        t5t.d("GattPeripheral", "onGattServiceDiscovered");
        fct.a(0);
        zh.a aVar = this.C;
        if (aVar != null) {
            aVar.f(m0());
        }
        if (System.currentTimeMillis() - this.D < 500 && D0()) {
            t5t.d("GattPeripheral", "waiting for service discovery...");
            try {
                Thread.sleep(VibrateModeProgressBar.sLongToLong);
            } catch (Exception unused) {
            }
        }
        List listN0 = n0();
        if (listN0 != null && listN0.size() > 0) {
            Iterator it = listN0.iterator();
            while (it.hasNext()) {
                tet.k((BluetoothGattService) it.next());
            }
        }
        A0();
    }

    @Override // defpackage.iss
    public /* bridge */ /* synthetic */ List n0() {
        return super.n0();
    }

    @Override // defpackage.iss
    public /* bridge */ /* synthetic */ void o() {
        super.o();
    }

    @Override // defpackage.iss, android.bluetooth.BluetoothGattCallback
    public /* bridge */ /* synthetic */ void onMtuChanged(BluetoothGatt bluetoothGatt, int i, int i2) {
        super.onMtuChanged(bluetoothGatt, i, i2);
    }

    @Override // defpackage.iss, android.bluetooth.BluetoothGattCallback
    public /* bridge */ /* synthetic */ void onPhyUpdate(BluetoothGatt bluetoothGatt, int i, int i2, int i3) {
        super.onPhyUpdate(bluetoothGatt, i, i2, i3);
    }

    @Override // defpackage.iss
    public /* bridge */ /* synthetic */ boolean p0() {
        return super.p0();
    }

    @Override // defpackage.iss
    @SuppressLint({"NewApi"})
    public void t0() {
        t5t.d("GattPeripheral", "onGattConnected");
        fct.a(0);
        zh.a aVar = this.C;
        if (aVar != null) {
            aVar.a(m0());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            S(true);
        }
        this.D = System.currentTimeMillis();
        zh.a aVar2 = this.C;
        if (aVar2 != null) {
            aVar2.h(m0());
        }
        boolean zL0 = l0();
        t5t.d("GattPeripheral", "discoverServices return " + zL0);
        if (zL0) {
            return;
        }
        v0();
    }

    public void u0() {
        this.A = 0;
    }

    public final void v0() {
        u0();
        d0();
        int state = BluetoothAdapter.getDefaultAdapter().getState();
        t5t.E("BluetoothAdapter state:" + state);
        if (this.B) {
            if (state == 12 || state == 11) {
                try {
                    int i = wbt.o;
                    t5t.d("GattPeripheral", "Delay " + i + " second before reconnect...");
                    Thread.sleep((long) i);
                } catch (InterruptedException unused) {
                }
                if (this.u.get()) {
                    t5t.d("GattPeripheral", "isShutDowned");
                } else {
                    g0();
                }
            }
        }
    }

    public final void w0() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            t5t.l("不应该在主线程中调用蓝牙库读写方法，请迁移至子线程中！！");
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            if (stackTrace == null) {
                t5t.l("elements is null!");
                return;
            }
            if (stackTrace.length == 0) {
                t5t.l("elements is empty!");
                return;
            }
            for (StackTraceElement stackTraceElement : stackTrace) {
                t5t.l(stackTraceElement.toString());
            }
        }
    }

    public yet x0() {
        return null;
    }

    public sft y0() {
        return this.E;
    }

    public int z0() {
        return this.F.b();
    }
}
