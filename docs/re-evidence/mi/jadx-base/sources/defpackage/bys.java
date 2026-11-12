package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.model.WeightAdvData;
import com.xiaomi.hm.health.bt.model.WeightSyncResult;
import com.xiaomi.hm.health.bt.profile.weight.IOFMeasurementCallback;
import com.xiaomi.hm.health.bt.scan.IBleScanCallback;
import java.util.Calendar;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes3.dex */
public class bys extends n1t implements kis.a {
    public vws P;
    public HMCallback<WeightAdvData> Q;
    public f5t R;
    public IBleScanCallback S;
    public int T;

    public class a extends kft {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ HMCallback f4735b;

        public a(HMCallback hMCallback) {
            this.f4735b = hMCallback;
        }

        @Override // defpackage.kft
        public void a() {
            super.a();
            this.f4735b.onStart();
        }

        @Override // defpackage.kft
        public void b(Object obj) {
            super.b(obj);
            WeightSyncResult weightSyncResult = (WeightSyncResult) obj;
            boolean z = weightSyncResult != null && weightSyncResult.isValid();
            if (z) {
                bys.this.T = weightSyncResult.rebootCount;
                String address = bys.this.L() != null ? bys.this.L().getAddress() : "";
                if (bys.this.w != null) {
                    weightSyncResult.setDeviceId(bys.this.w.G(), address);
                }
            }
            this.f4735b.onData(weightSyncResult);
            this.f4735b.onFinish(z);
        }
    }

    public class b implements IBleScanCallback {
        public b() {
        }

        @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
        public void onScanError(f5t f5tVar) {
        }

        @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
        public void onScanStart(f5t f5tVar) {
        }

        @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
        public void onScanStop(f5t f5tVar) {
        }

        @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
        public void onScanedDevice(gdt gdtVar, f5t f5tVar) {
            WeightAdvData weightAdvData = gdtVar.n;
            if (weightAdvData != null) {
                bys.this.m(weightAdvData);
            }
        }
    }

    public bys(Context context, BluetoothDevice bluetoothDevice) {
        super(context, new n1t.e(bluetoothDevice, true));
        this.P = null;
        this.Q = null;
        this.R = null;
        this.S = new b();
        this.T = -1;
    }

    @Override // defpackage.n1t, defpackage.kd
    public void G() {
        super.G();
        h1();
        n1(null);
    }

    @Override // defpackage.n1t
    public boolean G0(Calendar calendar) {
        Calendar calendar2 = Calendar.getInstance(xk.f39201a.a(0));
        calendar2.setTimeInMillis(calendar.getTimeInMillis());
        return super.G0(calendar2);
    }

    @Override // defpackage.n1t, defpackage.kd
    public sd Q() {
        return sd.WEIGHT;
    }

    public boolean e1() {
        return V() && ((kis) this.u).D1();
    }

    public final void f1() {
        h1();
        this.R = new f5t.b().b(-1).c(this.S).d(this.t.a()).g();
        h3t.H().l(this.R);
    }

    public boolean g1() {
        return V() && this.P.E1();
    }

    public void h1() {
        if (this.R != null) {
            h3t.H().y(this.R);
            this.R = null;
        }
    }

    @Override // defpackage.n1t
    public void j0() {
        super.j0();
        h1();
    }

    public void j1(long j, HMCallback<WeightSyncResult> hMCallback) {
        k1(a1(), j, hMCallback);
    }

    public void k1(yus yusVar, long j, HMCallback<WeightSyncResult> hMCallback) {
        synchronized (this.f27453r) {
            try {
                if (I(hMCallback)) {
                    return;
                }
                Future future = this.x;
                if (future != null && !future.isDone()) {
                    t5t.d("HMBaseBleDevice", "startSyncData return as syncing now!!!");
                } else {
                    t5t.m("HMBaseBleDevice", "start sync data...");
                    this.x = E(new s1t(yusVar, j, new a(hMCallback)));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.n1t
    public void l0() {
        super.l0();
        if (R() || !tet.m()) {
            return;
        }
        f1();
    }

    public boolean l1(IOFMeasurementCallback iOFMeasurementCallback, boolean z) {
        return V() && this.P.B1(iOFMeasurementCallback, z);
    }

    @Override // kis.a
    public void m(WeightAdvData weightAdvData) {
        synchronized (this) {
            try {
                if (this.Q != null) {
                    if (this.w != null) {
                        weightAdvData.setDeviceId(this.w.G());
                    }
                    this.Q.sendOnDataMessage(weightAdvData);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean m1(kf kfVar) {
        return V() && this.P.A1(kfVar.a());
    }

    public void n1(HMCallback<WeightAdvData> hMCallback) {
        synchronized (this) {
            this.Q = hMCallback;
        }
    }

    public boolean o1(boolean z) {
        return V() && this.P.F1(z);
    }

    @Override // defpackage.n1t
    public yus q0(Context context, BluetoothDevice bluetoothDevice) {
        vws vwsVar = new vws(context, bluetoothDevice, this);
        this.P = vwsVar;
        vwsVar.y1(this);
        return this.P;
    }

    @Override // defpackage.n1t, defpackage.kd
    public void x(boolean z) {
        super.x(z);
        if (z) {
            return;
        }
        f1();
    }

    public bys(Context context, String str) {
        this(context, tet.e(str));
    }
}
