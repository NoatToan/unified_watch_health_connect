package defpackage;

import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.Looper;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.ife.IHMConnectionCallback;
import com.xiaomi.hm.health.bt.profile.auth.HMAuthState;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public abstract class kd implements dts, h4, as {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f23732b;
    public BluetoothDevice c;
    public IHMConnectionCallback j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public dts f23733k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConcurrentLinkedQueue<mh> f23731a = new ConcurrentLinkedQueue<>();
    public ReentrantLock d = new ReentrantLock();
    public final Handler e = new Handler(Looper.getMainLooper());
    public AtomicBoolean f = new AtomicBoolean(true);
    public AtomicBoolean g = new AtomicBoolean(true);
    public boolean h = true;
    public xct i = null;
    public HMCallback<ubt> l = null;
    public ExecutorService m = k8t.g("HMBaseDevice", 10);
    public ExecutorService n = k8t.b("HMBaseDevice");
    public final i7 o = new i7(new ybt() { // from class: w3t
    });
    public BroadcastReceiver p = new a();
    public final Map<String, Object> q = new HashMap();

    public class a extends BroadcastReceiver {
        public a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            t5t.d("HMBaseDevice", "action:" + action);
            if ("android.bluetooth.adapter.action.STATE_CHANGED".equals(action)) {
                int intExtra = intent.getIntExtra("android.bluetooth.adapter.extra.STATE", Integer.MIN_VALUE);
                t5t.d("HMBaseDevice", "state:" + kd.this.D(intExtra));
                if (intExtra != 10) {
                    if (intExtra == 12) {
                        kd.this.X();
                        return;
                    } else if (intExtra != 13) {
                        return;
                    }
                }
                kd.this.W();
            }
        }
    }

    public class b implements SyncDataCallback<List<GpsRecord>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ HMCallback f23735a;

        public b(HMCallback hMCallback) {
            this.f23735a = hMCallback;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(List<GpsRecord> list) {
            this.f23735a.onData(list);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
        public void onFinish(@NotNull HMDeviceError hMDeviceError) {
            this.f23735a.onFinish(hMDeviceError.isErrorNone());
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
        public void onProgress(@NotNull Progress progress) {
            this.f23735a.onProgress(progress);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
        public void onStart() {
            this.f23735a.onStart();
        }
    }

    public kd(Context context, BluetoothDevice bluetoothDevice) {
        this.f23732b = context;
        this.c = bluetoothDevice;
        this.f.getAndSet(tet.m());
    }

    public void A(ubt ubtVar) {
        HMCallback<ubt> hMCallback = this.l;
        if (hMCallback != null) {
            hMCallback.sendOnDataMessage(ubtVar);
        }
    }

    public void B(boolean z) {
        this.h = z;
    }

    public boolean C(BluetoothDevice bluetoothDevice, sd sdVar, wt wtVar) {
        return false;
    }

    public final String D(int i) {
        if (i == Integer.MIN_VALUE) {
            return "STATE_ERROR";
        }
        switch (i) {
            case 10:
                return "STATE_OFF";
            case 11:
                return "STATE_TURNING_ON";
            case 12:
                return "STATE_ON";
            case 13:
                return "STATE_TURNING_OFF";
            default:
                return "STATE Unknown:" + i;
        }
    }

    public Future E(Runnable runnable) {
        t5t.d("HMBaseDevice", "submitOnDeviceOnlyThread:" + runnable.getClass().getName());
        return this.m.submit(runnable);
    }

    public <T extends com.huami.bluetooth.profile.channel.module.a> boolean F(@NotNull Class<T> cls) {
        return false;
    }

    public void G() {
        this.d.lock();
        try {
            try {
                ad.f888a.a(this);
                if (this.p != null && this.g.compareAndSet(false, true)) {
                    this.f23732b.unregisterReceiver(this.p);
                    this.p = null;
                }
                this.f23733k = null;
                this.j = null;
            } catch (Exception e) {
                t5t.d("HMBaseDevice", e.getLocalizedMessage());
            }
        } finally {
            this.d.unlock();
        }
    }

    public boolean H(int i) {
        Feature featureA;
        g4s g4sVarO = O();
        return (g4sVarO == null || (featureA = g4sVarO.A()) == null || !featureA.hasSw(i)) ? false : true;
    }

    public boolean I(HMCallback hMCallback) {
        if (U()) {
            return false;
        }
        if (hMCallback == null) {
            return true;
        }
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(false);
        return true;
    }

    public xct J() {
        return this.i;
    }

    public void K(HMCallback<ubt> hMCallback) {
        this.l = hMCallback;
    }

    public BluetoothDevice L() {
        return this.c;
    }

    public Context M() {
        return this.f23732b;
    }

    public Feature N() {
        g4s g4sVarO = O();
        return g4sVarO == null ? new Feature() : g4sVarO.A();
    }

    public abstract g4s O();

    public qd P() {
        g4s g4sVarO = O();
        return g4sVarO == null ? qd.v : g4sVarO.I();
    }

    public abstract sd Q();

    public boolean R() {
        return this.g.get();
    }

    public boolean S() {
        return this.h;
    }

    public boolean T() {
        return this.f.get();
    }

    public boolean U() {
        return V();
    }

    public abstract boolean V();

    public void W() {
        this.f.getAndSet(false);
    }

    public void X() {
        this.f.getAndSet(true);
    }

    public void Y() {
        this.m.shutdown();
        this.n.shutdown();
    }

    @Override // defpackage.h4
    public boolean a(int i) {
        return false;
    }

    @Override // defpackage.h4
    public g4 b() {
        return null;
    }

    @Override // defpackage.as
    public boolean c() {
        return V();
    }

    @Override // defpackage.h4
    public e4 i() {
        return null;
    }

    public <T> T n(Class<T> cls) {
        return null;
    }

    @Override // defpackage.dts
    public void onAuthentication(HMAuthState hMAuthState) {
        dts dtsVar = this.f23733k;
        if (dtsVar != null) {
            dtsVar.onAuthentication(hMAuthState);
        }
    }

    @Override // defpackage.dts
    public byte[] onGetSignData(byte[] bArr, byte[] bArr2, int i) {
        dts dtsVar = this.f23733k;
        if (dtsVar != null) {
            return dtsVar.onGetSignData(bArr, bArr2, i);
        }
        return null;
    }

    public void p(BluetoothDevice bluetoothDevice, sd sdVar, wt wtVar) {
        IHMConnectionCallback iHMConnectionCallback = this.j;
        if (iHMConnectionCallback != null) {
            iHMConnectionCallback.onConnectionStatusChanged(bluetoothDevice, sdVar, wtVar);
        }
    }

    public void q(IHMConnectionCallback iHMConnectionCallback) {
        this.j = iHMConnectionCallback;
    }

    public void r(dts dtsVar) {
        this.f23733k = dtsVar;
    }

    public void s(Runnable runnable) {
        this.n.execute(runnable);
    }

    @Deprecated
    public void t(Calendar calendar, HMCallback<List<GpsRecord>> hMCallback) {
        u(calendar, new b(hMCallback));
    }

    public void u(Calendar calendar, SyncDataCallback<List<GpsRecord>> syncDataCallback) {
        syncDataCallback.onStart();
        syncDataCallback.onFinish(new HMDeviceError(3));
    }

    public void v(mh mhVar) {
        this.f23731a.add(mhVar);
    }

    public void w(xct xctVar) {
        this.i = xctVar;
    }

    public void x(boolean z) {
        this.d.lock();
        try {
            try {
                this.g.set(false);
                this.f.getAndSet(tet.m());
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.bluetooth.adapter.action.STATE_CHANGED");
                this.f23732b.registerReceiver(this.p, intentFilter);
            } catch (Exception e) {
                t5t.d("HMBaseDevice", e.getLocalizedMessage());
            }
        } finally {
            this.d.unlock();
        }
    }

    public <T extends com.huami.bluetooth.profile.channel.module.a> T y(Class<T> cls) {
        return (T) f4.c.a(this).a(cls);
    }

    public void z(Runnable runnable) {
        t5t.d("HMBaseDevice", "runOnDeviceOnlyThread:" + runnable.getClass().getName());
        this.m.execute(runnable);
    }
}
