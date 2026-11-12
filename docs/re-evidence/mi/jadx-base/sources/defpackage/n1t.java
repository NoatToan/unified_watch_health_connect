package defpackage;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.PowerManager;
import com.huami.bluetooth.profile.channel.module.battery.BatteryModule;
import com.huami.bluetooth.profile.channel.module.connect.ConnectModule;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.error.HMDeviceError;
import com.xiaomi.hm.health.bt.profile.gdsp.IHMDataCallback;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.GpsRecord;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.Progress;
import java.io.File;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Future;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@SuppressLint({"NewApi"})
public abstract class n1t extends kd implements zh.a, vvs, gh, rft, t6 {
    public static int N = 30000;
    public static int O = 120000;
    public volatile Handler A;
    public f5t B;
    public g2 C;
    public boolean D;
    public qd E;
    public volatile u4t F;
    public ycs G;
    public HMCallback<ycs> H;
    public i7t I;
    public bh J;
    public boolean K;
    public HandlerThread L;
    public int M;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f27453r;
    public final Object s;
    public e t;
    public yus u;
    public i1 v;
    public volatile g4s w;
    public Future x;
    public ubt y;
    public wt z;

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        public final /* synthetic */ String b(boolean z, Message message) {
            return "sendMessageAtTime result: " + z + "; message: " + message + "; thread status: " + n1t.this.L.getState();
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                n1t.this.M0((wt) message.obj);
                return;
            }
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    n1t.this.S0(((Boolean) message.obj).booleanValue());
                    return;
                }
                Object obj = message.obj;
                if (obj == null) {
                    t5t.d("HMBaseBleDevice", "ERROR:not accept null battery info");
                    return;
                }
                ubt ubtVarA = (ubt) obj;
                t5t.d("HMBaseBleDevice", "OnBattery Notify" + n1t.this.Q() + "," + n1t.this.F(BatteryModule.class) + ", " + n1t.this.hashCode());
                if (n1t.this.Q() != sd.WEIGHT && ubtVarA.a() == null && n1t.this.v != null) {
                    ubtVarA = n1t.this.v.a();
                }
                if (ubtVarA != null) {
                    n1t.this.y = ubtVarA;
                    n1t n1tVar = n1t.this;
                    n1tVar.A(n1tVar.y);
                    return;
                }
                return;
            }
            ad.f888a.a(n1t.this);
            eh ehVarA = n0.a(n1t.this.J(), n1t.this);
            int i2 = 7;
            AuthResult authResult = null;
            try {
                n1t.this.M0(wt.AUTH_START);
                n1t n1tVar2 = n1t.this;
                authResult = n1tVar2.s0(n1tVar2.J(), n1t.this);
                int originCode = authResult.getOriginCode();
                t5t.d("HMBaseBleDevice", "auth:" + originCode);
                if (authResult.getAuthError() instanceof eu) {
                    n1t n1tVar3 = n1t.this;
                    wt wtVar = wt.AUTH_PROTOCOL_SUCCESS;
                    n1tVar3.z = wtVar;
                    n1t.this.I0(wtVar);
                    boolean zG0 = n1t.this.G0(Calendar.getInstance());
                    t5t.d("HMBaseBleDevice", "setDateTime:" + zG0);
                    if (zG0) {
                        n1t n1tVar4 = n1t.this;
                        wt wtVar2 = wt.SET_TIME_SUCCESS;
                        n1tVar4.z = wtVar2;
                        n1t.this.I0(wtVar2);
                        n1t n1tVar5 = n1t.this;
                        n1tVar5.L0(n1tVar5.u);
                        n1t n1tVar6 = n1t.this;
                        n1tVar6.w = ehVarA.a(n1tVar6.u);
                        t5t.d("HMBaseBleDevice", "device info:" + n1t.this.w);
                        if (n1t.this.w == null) {
                            if (authResult.getAuthError() instanceof rm) {
                                authResult.a(y.GET_DEVICE_INFO_FAIL);
                            } else {
                                authResult.a(rn.GET_DEVICE_INFO_FAIL);
                            }
                            originCode = 9;
                        } else {
                            Set<qd> setF = ict.f();
                            qd qdVarI = n1t.this.w.I();
                            if (setF != null && !setF.isEmpty() && !setF.contains(qdVarI)) {
                                t5t.d("HMBaseBleDevice", "unSupport device source:" + qdVarI);
                                originCode = 7;
                            }
                        }
                    } else {
                        if (authResult.getAuthError() instanceof rm) {
                            authResult.a(y.SET_TIME_FAIL);
                        } else {
                            authResult.a(rn.SET_TIME_FAIL);
                        }
                        originCode = 8;
                    }
                }
                if (authResult.getAuthError() instanceof eu) {
                    n1t.this.e0();
                    n1t n1tVar7 = n1t.this;
                    wt wtVar3 = wt.GET_DEVICE_INFO_SUCCESS;
                    n1tVar7.z = wtVar3;
                    n1t.this.I0(wtVar3);
                }
                i2 = originCode;
            } catch (Exception e) {
                t5t.d("HMBaseBleDevice", "auth exception:" + e.getMessage());
                if (authResult == null) {
                    t5t.d("HMBaseBleDevice", "authResult is null!!!");
                    authResult = new AuthResult(4, y.AUTH_EXCEPTION);
                }
                if (authResult.getAuthError() instanceof rm) {
                    authResult.a(y.AUTH_EXCEPTION);
                } else {
                    authResult.a(rn.AUTH_EXCEPTION);
                }
            }
            authResult.a(i2);
            boolean z = authResult.getAuthError() instanceof eu;
            if (!z) {
                n1t.K0(n1t.this);
            }
            ehVarA.a(authResult, n1t.this);
            if (z) {
                n1t.this.f0();
            }
            if (z) {
                if (n1t.this.y != null) {
                    n1t n1tVar8 = n1t.this;
                    n1tVar8.A(n1tVar8.y);
                    return;
                }
                return;
            }
            t5t.d("HMBaseBleDevice", "disconnect by app!!!");
            yus yusVar = n1t.this.u;
            if (yusVar != null) {
                yusVar.j0();
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(final Message message, long j) {
            final boolean zSendMessageAtTime = super.sendMessageAtTime(message, j);
            if (!zSendMessageAtTime) {
                le.c("HMBaseBleDevice", new Function0() { // from class: m1t
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return this.f25660a.b(zSendMessageAtTime, message);
                    }
                });
            }
            return zSendMessageAtTime;
        }
    }

    public class b implements hh {
        public b() {
        }

        @Override // defpackage.hh
        public void a(@NotNull ConnectParam connectParam) {
            n1t.this.b0().b(connectParam.getMtu());
        }
    }

    public class d implements SyncDataCallback<List<? extends GpsRecord>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SyncDataCallback f27458a;

        public d(SyncDataCallback syncDataCallback) {
            this.f27458a = syncDataCallback;
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onData(List<? extends GpsRecord> list) {
            this.f27458a.onData(new ArrayList(list));
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
        public void onFinish(@NotNull HMDeviceError hMDeviceError) {
            this.f27458a.onFinish(hMDeviceError);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
        public void onProgress(@NotNull Progress progress) {
            this.f27458a.onProgress(progress);
        }

        @Override // com.xiaomi.hm.health.bt.profile.gdsp.gps.SyncDataCallback
        public void onStart() {
            this.f27458a.onStart();
        }
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BluetoothDevice f27460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f27461b;
        public boolean c = false;

        public e(BluetoothDevice bluetoothDevice, boolean z) {
            this.f27460a = bluetoothDevice;
            this.f27461b = z;
        }

        public String a() {
            return this.f27460a.getAddress();
        }

        public void b(boolean z) {
            this.c = z;
        }

        public BluetoothDevice c() {
            return this.f27460a;
        }

        public int d() {
            return tet.t(this.f27460a);
        }

        public boolean e() {
            return this.c;
        }

        public boolean f() {
            return !wbt.n && tet.t(this.f27460a) == 0;
        }

        public boolean g() {
            return this.f27461b;
        }
    }

    public n1t(Context context, e eVar) {
        super(context.getApplicationContext(), eVar.c());
        this.f27453r = new Object();
        this.s = new Object();
        this.u = null;
        this.v = null;
        this.w = null;
        this.x = null;
        this.y = null;
        this.z = wt.UNKNOWN;
        this.C = null;
        this.D = false;
        this.E = qd.v;
        this.F = new u4t();
        this.G = null;
        this.H = null;
        this.I = null;
        this.K = false;
        this.M = -1;
        this.t = eVar;
        this.J = new bh(this);
        HandlerThread handlerThread = new HandlerThread("HMBaseBleDevice");
        this.L = handlerThread;
        handlerThread.start();
        this.A = new a(this.L.getLooper());
        this.B = new f5t.b().c(this).f(false).d(this.t.a()).b(N).g();
    }

    public static /* synthetic */ cft K0(n1t n1tVar) {
        n1tVar.getClass();
        return null;
    }

    public static void U0(int i) {
        O = i;
    }

    public static /* synthetic */ String h0() {
        return "Base Profile is null while init channel";
    }

    public void A0(Calendar calendar, zos zosVar) {
        synchronized (this.f27453r) {
            try {
                if (!V()) {
                    t5t.d("HMBaseBleDevice", "startSyncData return as not connected!!!");
                    zosVar.a();
                    zosVar.a(new tdt(3));
                    return;
                }
                Future future = this.x;
                if (future != null && !future.isDone()) {
                    t5t.d("HMBaseBleDevice", "startSyncData return as syncing now!!!");
                    return;
                }
                Future futureJ0 = J0(calendar, new c(zosVar));
                this.x = futureJ0;
                if (futureJ0 == null) {
                    t5t.d("HMBaseBleDevice", "startSyncData return as null future!!!");
                    zosVar.a();
                    zosVar.a(new tdt(100));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.kd
    public void B(boolean z) {
        super.B(z);
        yus yusVar = this.u;
        if (yusVar != null) {
            yusVar.a(z);
        }
    }

    public void D0(xd xdVar, jys jysVar) {
        u0(39, 49, new HMCallback());
        z(new jht(this.u, xdVar, jysVar));
    }

    public final synchronized void E0(boolean z, gr grVar, boolean z2) {
        t5t.d("HMBaseBleDevice", "connect:" + this.t.a());
        if (!BluetoothAdapter.checkBluetoothAddress(this.t.a())) {
            t5t.d("HMBaseBleDevice", "return as invalid address~");
            return;
        }
        if (!T()) {
            t5t.d("HMBaseBleDevice", "return as has bluetooth off~");
            return;
        }
        if (R()) {
            t5t.d("HMBaseBleDevice", "return as has destroy~");
            return;
        }
        if (z2) {
            this.K = false;
            t5t.d("HMBaseBleDevice", "force scan device for profile~");
            this.B.b(N);
            h3t.H().l(this.B);
            P0(wt.SCANNING.a(grVar));
            return;
        }
        if (this.u != null) {
            t5t.d("HMBaseBleDevice", "return as profile not null!!!");
            return;
        }
        if (z || H0(this.t)) {
            t5t.d("HMBaseBleDevice", "Create profile for connect~");
            yus yusVarQ0 = q0(M(), this.t.c());
            this.u = yusVarQ0;
            yusVarQ0.a(S());
            this.u.f0();
        } else {
            t5t.d("HMBaseBleDevice", "Scan device for profile~");
            this.B.b(N);
            h3t.H().l(this.B);
            P0(wt.SCANNING.a(grVar));
        }
    }

    @Override // defpackage.kd
    public <T extends com.huami.bluetooth.profile.channel.module.a> boolean F(@NotNull Class<T> cls) {
        yus yusVar = this.u;
        if (yusVar != null) {
            return yusVar.q1(cls);
        }
        t5t.d("HMBaseBleDevice", "WARN: do not check support module while profile is null");
        return false;
    }

    public boolean F0(int i, int i2) {
        return true;
    }

    @Override // defpackage.kd
    public void G() {
        super.G();
        t5t.d("HMBaseBleDevice", "destroy:" + this);
        m0();
        Z0();
        Iterator<mh> it = this.f23731a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public boolean G0(Calendar calendar) {
        return U() && this.u.n1(calendar);
    }

    public final boolean H0(e eVar) {
        t5t.d("HMBaseBleDevice", "ble device type:" + eVar.d());
        if (tet.n(this.f23732b, eVar.a())) {
            t5t.d("HMBaseBleDevice", "connect direct as connected device~");
            return true;
        }
        if (eVar.e()) {
            t5t.d("HMBaseBleDevice", "connect direct as has scaned~");
            return true;
        }
        if (eVar.g() || eVar.f()) {
            return false;
        }
        t5t.d("HMBaseBleDevice", "connect direct as without scan and device type known~");
        return true;
    }

    public final boolean I0(wt wtVar) {
        return C(L(), Q(), wtVar);
    }

    public Future J0(Calendar calendar, zos zosVar) {
        return null;
    }

    public final void L0(yus yusVar) {
        this.D = false;
        SettingsModule settingsModule = (SettingsModule) y(SettingsModule.class);
        if (settingsModule == null) {
            t5t.d("HMBaseBleDevice", "settingsModule null");
            x0(yusVar);
            return;
        }
        settingsModule.resetSettingsImpl();
        if (p0(settingsModule) >= 2) {
            this.D = true;
            yusVar.m1(new cs(settingsModule, this));
        } else {
            settingsModule.initDefaultSettings();
            x0(yusVar);
        }
    }

    public void M0(wt wtVar) {
        t5t.d("HMBaseBleDevice", "handleStatusChanged:" + this.t.c() + "," + Q() + "," + wtVar);
        if (wtVar.b()) {
            I0(wtVar);
        }
        if (this.z == wtVar) {
            return;
        }
        this.z = wtVar;
        wt wtVar2 = wt.DISCONNECTED;
        if (wtVar == wtVar2) {
            l0();
        } else if (wtVar == wt.INIT_FAILED || wtVar == wt.GATT_CONNECT_FAILED || wtVar == wt.GATT_DISCONNECT || wtVar == wt.AUTH_FAILED || wtVar == wt.DISCOVERY_FAILED) {
            if (S()) {
                k0();
                n0();
            } else {
                I0(wtVar);
                l0();
                wtVar = wtVar2;
            }
        } else if (wtVar == wt.SCANNING || wtVar == wt.GATT_CONNECTING || wtVar == wt.GATT_CONNECTED || wtVar == wt.INIT_START || wtVar == wt.INIT_SUCCESS || wtVar == wt.DISCOVERY_START || wtVar == wt.DISCOVERY_SUCCESS || wtVar == wt.AUTH_START) {
            k0();
            n0();
        } else if (wtVar == wt.AUTH_SUCCESS) {
            m0();
            try {
                j0();
            } catch (Exception e2) {
                t5t.d("HMBaseBleDevice", "onDeviceConnected exception:" + e2.getMessage());
            }
        } else if (wtVar == wt.CONNECTING_TIMEOUT) {
            i0();
        }
        p(L(), Q(), wtVar);
    }

    @Override // defpackage.kd
    public g4s O() {
        return this.w;
    }

    @Override // defpackage.kd
    public qd P() {
        qd qdVarP = super.P();
        return qdVarP == qd.v ? this.E : qdVarP;
    }

    public void P0(wt wtVar) {
        if (this.A != null) {
            Message message = new Message();
            message.what = 0;
            message.obj = wtVar;
            try {
                this.A.sendMessage(message);
            } catch (Exception e2) {
                t5t.d("HMBaseBleDevice", "error:" + e2.getMessage());
            }
        }
    }

    @Override // defpackage.kd
    public abstract sd Q();

    public void Q0(final boolean z) {
        s(new Runnable() { // from class: k1t
            @Override // java.lang.Runnable
            public final void run() {
                this.f23348a.V0(z);
            }
        });
    }

    public void S0(boolean z) {
        yus yusVarA1 = a1();
        if (yusVarA1 == null) {
            le.b("HMBaseBleDevice", new Function0() { // from class: l1t
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return n1t.h0();
                }
            });
            P0(wt.INIT_FAILED);
            return;
        }
        boolean zD1 = yusVarA1.d1();
        boolean zE1 = yusVarA1.e1();
        if ((zE1 && !zD1) || (!zE1 && !z)) {
            P0(wt.INIT_FAILED);
            yusVarA1.j0();
            return;
        }
        P0(wt.INIT_SUCCESS);
        if (this.A != null) {
            try {
                this.A.sendEmptyMessage(1);
            } catch (Exception e2) {
                t5t.d("HMBaseBleDevice", "error:" + e2.getMessage());
            }
        }
    }

    @Override // defpackage.kd
    public boolean U() {
        boolean z;
        wt wtVar;
        synchronized (this.s) {
            try {
                z = this.u != null && ((wtVar = this.z) == wt.AUTH_SUCCESS || wtVar == wt.AUTH_PROTOCOL_SUCCESS || wtVar == wt.AUTH_SUCCESS_WITHOUT_DEVICE_INFO || wtVar == wt.SET_TIME_SUCCESS || wtVar == wt.GET_DEVICE_INFO_SUCCESS);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.kd
    public boolean V() {
        boolean z;
        wt wtVar;
        synchronized (this.s) {
            try {
                z = this.u != null && ((wtVar = this.z) == wt.AUTH_SUCCESS || wtVar == wt.AUTH_SUCCESS_WITHOUT_DEVICE_INFO);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    public final /* synthetic */ void V0(boolean z) {
        cq cqVarA;
        if (!V() || (cqVarA = yp.f40387a.a(this.u)) == null) {
            return;
        }
        if (z) {
            cqVarA.registerRealtimeStepCallback(this);
        } else {
            cqVarA.unregisterRealtimeStepCallback(this);
        }
    }

    @Override // defpackage.kd
    public void W() {
        super.W();
        Z0();
        P0(wt.DISCONNECTED);
        fct.a(0);
    }

    public void W0(HMCallback<ycs> hMCallback) {
        this.H = hMCallback;
    }

    @Override // defpackage.kd
    public void X() {
        super.X();
        E0(false, gr.NORMAL, false);
    }

    public synchronized void X0(boolean z) {
        t5t.d("HMBaseBleDevice", "reConnect:" + this.u);
        if (!BluetoothAdapter.checkBluetoothAddress(this.t.a())) {
            t5t.d("HMBaseBleDevice", "return as invalid address!!!");
            return;
        }
        if (R()) {
            t5t.d("HMBaseBleDevice", "return as destroy!!!");
            return;
        }
        if (!z && S()) {
            t5t.d("HMBaseBleDevice", "return as auto reconnect!!!");
            return;
        }
        if (!z && V()) {
            t5t.d("HMBaseBleDevice", "return as connected!!!");
            return;
        }
        yus yusVar = this.u;
        if (yusVar != null) {
            yusVar.h0();
            this.u = null;
        }
        yus yusVarQ0 = q0(M(), this.t.c());
        this.u = yusVarQ0;
        yusVarQ0.a(S());
        this.u.f0();
    }

    @Override // defpackage.kd
    public void Y() {
        super.Y();
        if (this.A != null) {
            try {
                this.A.removeCallbacksAndMessages(null);
                this.A = null;
            } catch (Exception e2) {
                t5t.d("HMBaseBleDevice", "error:" + e2.getMessage());
            }
        }
        yus yusVar = this.u;
        if (yusVar != null) {
            yusVar.o();
        }
        HandlerThread handlerThread = this.L;
        if (handlerThread != null) {
            handlerThread.quitSafely();
        }
    }

    public final void Y0() {
        yus yusVar = this.u;
        if (yusVar != null) {
            yusVar.u0();
            this.u.d0();
        }
    }

    public final synchronized void Z0() {
        try {
            t5t.d("HMBaseBleDevice", "disconnect:" + this.u);
            this.z = wt.UNKNOWN;
            h3t.H().y(this.B);
            this.t.b(false);
            yus yusVar = this.u;
            if (yusVar != null) {
                yusVar.h0();
                this.u = null;
            }
            i1 i1Var = this.v;
            if (i1Var != null) {
                i1Var.b(this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // defpackage.t6
    public boolean a(@NotNull gr grVar) {
        t5t.d("HMBaseBleDevice", "reconnectWithScan, reason: " + grVar);
        Y0();
        E0(false, grVar, true);
        return true;
    }

    public yus a1() {
        return this.u;
    }

    @Override // zh.a
    public void b(BluetoothDevice bluetoothDevice, int i) {
        i1 i1Var = this.v;
        if (i1Var != null) {
            i1Var.b(this);
        }
        wt wtVar = wt.GATT_CONNECT_FAILED;
        if (!I0(wtVar.a(i))) {
            P0(wtVar.a(i));
        }
        Iterator<mh> it = this.f23731a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
    }

    public sft b0() {
        yus yusVar = this.u;
        return yusVar != null ? yusVar.y0() : sft.a();
    }

    public ubt b1() {
        return this.y;
    }

    @Override // zh.a
    public void c(BluetoothDevice bluetoothDevice) {
        P0(wt.INIT_START);
    }

    public ycs c0() {
        return this.G;
    }

    public ob c1() {
        return new ob(this);
    }

    @Override // zh.a
    public void d(BluetoothDevice bluetoothDevice, int i) {
        P0(wt.DISCOVERY_FAILED.a(i));
    }

    public ycs d0() {
        cq cqVarA = yp.f40387a.a(this.u);
        if (cqVarA != null) {
            return cqVarA.getRealtimeStep();
        }
        return null;
    }

    public int d1() {
        return N().hasBase(4) ? 1 : 0;
    }

    @Override // zh.a
    public void e(BluetoothDevice bluetoothDevice, boolean z) {
        if (this.A == null) {
            t5t.d("HMBaseBleDevice", "ERROR:mHandler in is null");
            return;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 3;
        messageObtain.obj = Boolean.valueOf(z);
        try {
            this.A.sendMessage(messageObtain);
        } catch (Exception e2) {
            t5t.d("HMBaseBleDevice", "error:" + e2.getMessage());
        }
    }

    public final void e0() {
        i1 i1Var = this.v;
        if (i1Var != null) {
            i1Var.b(this);
        }
        i1 i1VarA = j1.f22316a.a(a1());
        this.v = i1VarA;
        if (i1VarA == null) {
            return;
        }
        this.y = i1VarA.a();
        t5t.d("HMBaseBleDevice", "battery info:" + this.y);
        this.v.a(this);
    }

    @Override // zh.a
    public void f(BluetoothDevice bluetoothDevice) {
        P0(wt.DISCOVERY_SUCCESS);
    }

    public void f0() {
    }

    @Override // zh.a
    public void g(BluetoothDevice bluetoothDevice, int i) {
        i1 i1Var = this.v;
        if (i1Var != null) {
            i1Var.b(this);
        }
        wt wtVar = wt.GATT_DISCONNECT;
        if (I0(wtVar.a(i))) {
            return;
        }
        P0(wtVar.a(i));
    }

    public boolean g0() {
        return this.D;
    }

    @Override // zh.a
    public void h(BluetoothDevice bluetoothDevice) {
        P0(wt.DISCOVERY_START);
    }

    @Override // defpackage.kd, defpackage.h4
    public e4 i() {
        yus yusVar = this.u;
        if (yusVar == null) {
            return null;
        }
        return yusVar.i();
    }

    public void i0() {
        t5t.d("HMBaseBleDevice", "onDeviceConnectTimeout:" + this.t.a());
        Iterator<mh> it = this.f23731a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // zh.a
    public void j(BluetoothDevice bluetoothDevice) {
        String str;
        boolean zN = tet.n(this.f23732b, bluetoothDevice.getAddress());
        boolean z = tet.t(bluetoothDevice) != 0;
        if (zN) {
            str = "connected";
        } else {
            str = z ? "known" : "none";
        }
        P0(wt.GATT_CONNECTING.a(str));
    }

    public void j0() {
        ConnectModule connectModule;
        t5t.d("HMBaseBleDevice", "onDeviceConnected:" + this.t.a());
        if (F(ConnectModule.class) && (connectModule = (ConnectModule) y(ConnectModule.class)) != null) {
            connectModule.registerConnectParamListener(new b());
        }
        Iterator<mh> it = this.f23731a.iterator();
        while (it.hasNext()) {
            it.next().f();
        }
        xb.f38931a.b();
    }

    @Override // defpackage.vvs
    public void k(ubt ubtVar) {
        t5t.d("HMBaseBleDevice", "onBatteryChanged:" + ubtVar + ",hash code:" + hashCode());
        if (ubtVar == null) {
            t5t.d("HMBaseBleDevice", "ERROR:battery in is null");
            return;
        }
        if (this.A == null) {
            t5t.d("HMBaseBleDevice", "ERROR:mHandler in is null");
            return;
        }
        Message message = new Message();
        message.what = 2;
        message.obj = ubtVar;
        try {
            this.A.sendMessage(message);
        } catch (Exception e2) {
            t5t.d("HMBaseBleDevice", "error:" + e2.getMessage());
        }
    }

    public void k0() {
        t5t.d("HMBaseBleDevice", "onDeviceConnecting:" + this.t.a());
        Iterator<mh> it = this.f23731a.iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    @Override // defpackage.rft
    public void l(ycs ycsVar) {
        this.G = ycsVar;
        t5t.m("HMBaseBleDevice", "onStepChanged:" + ycsVar);
        HMCallback<ycs> hMCallback = this.H;
        if (hMCallback != null) {
            hMCallback.sendOnDataMessage(ycsVar);
        }
    }

    public void l0() {
        t5t.d("HMBaseBleDevice", "onDeviceDisconnected:" + this.t.a());
        i1 i1Var = this.v;
        if (i1Var != null) {
            i1Var.b(this);
        }
        Iterator<mh> it = this.f23731a.iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    public final void m0() {
        if (this.A != null) {
            try {
                this.A.removeCallbacksAndMessages(wt.CONNECTING_TIMEOUT);
            } catch (Exception e2) {
                t5t.d("HMBaseBleDevice", "error:" + e2.getMessage());
            }
        }
    }

    public final void n0() {
        if (this.A != null) {
            Handler handler = this.A;
            wt wtVar = wt.CONNECTING_TIMEOUT;
            if (handler.hasMessages(0, wtVar)) {
                return;
            }
            Message message = new Message();
            message.what = 0;
            message.obj = wtVar;
            try {
                this.A.sendMessageDelayed(message, O);
            } catch (Exception unused) {
                t5t.d("HMBaseBleDevice", "mHandler is null in sendTimeoutMsgDelay!!!");
            }
        }
    }

    public final synchronized void o0() {
        t5t.d("RE_SCAN_TAG", "133等情况重新扫描，成功后触发连接: " + this.t.a());
        if (!BluetoothAdapter.checkBluetoothAddress(this.t.a())) {
            t5t.d("HMBaseBleDevice", "return as invalid address~");
            return;
        }
        if (!T()) {
            t5t.d("HMBaseBleDevice", "return as has bluetooth off~");
            return;
        }
        if (R()) {
            t5t.d("HMBaseBleDevice", "return as has destroy~");
            return;
        }
        yus yusVar = this.u;
        if (yusVar == null) {
            t5t.d("HMBaseBleDevice", "mProfile null~");
        } else {
            yusVar.f0();
        }
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public final void onScanError(f5t f5tVar) {
        t5t.d("HMBaseBleDevice", "onScanError:" + f5tVar);
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public final void onScanStart(f5t f5tVar) {
        t5t.d("HMBaseBleDevice", "onScanStart:" + f5tVar);
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public final void onScanStop(f5t f5tVar) {
        boolean zN = tet.n(this.f23732b, this.t.a());
        boolean z = (this.t.g() || this.t.f()) ? false : true;
        t5t.d("HMBaseBleDevice", "onScanStop:" + f5tVar + "connected: " + zN + ", knownType: " + z);
        if (this.u != null) {
            t5t.d("HMBaseBleDevice", "pauseConnectForScan: " + this.u.p0() + ", scanedDevice: " + this.K);
        }
        yus yusVar = this.u;
        if (yusVar == null || !yusVar.p0()) {
            E0(false, gr.NORMAL, false);
            return;
        }
        if (this.K) {
            return;
        }
        if (zN || z) {
            o0();
        } else {
            E0(false, gr.NORMAL, true);
        }
    }

    @Override // com.xiaomi.hm.health.bt.scan.IBleScanCallback
    public final void onScanedDevice(gdt gdtVar, f5t f5tVar) {
        t5t.d("HMBaseBleDevice", "onScanedDevice:" + gdtVar);
        if (gdtVar.f18871a.getAddress().equals(this.t.a())) {
            P0(wt.SCAN_SUCCESS.a(tet.o(gdtVar)));
            this.K = true;
            this.t.b(true);
            h3t.H().y(this.B);
            yus yusVar = this.u;
            if (yusVar == null || !yusVar.p0()) {
                E0(false, gr.NORMAL, false);
            } else {
                o0();
            }
        }
    }

    public final int p0(SettingsModule settingsModule) {
        Integer numQueryVersionSync = settingsModule.queryVersionSync();
        if (numQueryVersionSync == null) {
            return -1;
        }
        return numQueryVersionSync.intValue();
    }

    public abstract yus q0(Context context, BluetoothDevice bluetoothDevice);

    public AuthResult s0(xct xctVar, dts dtsVar) {
        return new AuthResult(0, sn.u);
    }

    @Override // defpackage.kd
    public void u(Calendar calendar, SyncDataCallback<List<GpsRecord>> syncDataCallback) {
        if (V()) {
            z(new ob(this).a(P(), calendar, new d(syncDataCallback)));
        } else {
            syncDataCallback.onStart();
            syncDataCallback.onFinish(new HMDeviceError(3));
        }
    }

    public void u0(final int i, final int i2, final HMCallback hMCallback) {
        if (I(hMCallback)) {
            return;
        }
        s(new Runnable() { // from class: j1t
            @Override // java.lang.Runnable
            public final void run() {
                this.f22341a.w0(hMCallback, i, i2);
            }
        });
    }

    public void v0(g4s g4sVar) {
        this.w = g4sVar;
    }

    public final /* synthetic */ void w0(HMCallback hMCallback, int i, int i2) {
        hMCallback.sendOnStartMessage();
        hMCallback.sendOnFinishMessage(F0(i, i2));
    }

    @Override // defpackage.kd
    public void x(boolean z) {
        super.x(z);
        t5t.d("HMBaseBleDevice", "create:" + z);
        E0(z, gr.NORMAL, false);
        Iterator<mh> it = this.f23731a.iterator();
        while (it.hasNext()) {
            it.next().a(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void x0(yus yusVar) {
        if (yusVar instanceof z8) {
            yusVar.m1(new ojs((z8) yusVar));
        }
    }

    public void y0(h2 h2Var) {
        g2 g2Var = this.C;
        if (g2Var != null) {
            g2Var.a(h2Var);
        }
    }

    public void z0(File file, IHMDataCallback<File> iHMDataCallback) {
        if (!V()) {
            iHMDataCallback.onStart();
            iHMDataCallback.onStop(file, new HMDeviceError(3));
            return;
        }
        if (N() == null) {
            iHMDataCallback.onStart();
            iHMDataCallback.onStop(file, new HMDeviceError(100));
            return;
        }
        a5<File> a5VarA = new ob(this).a(file, iHMDataCallback);
        this.I = a5VarA;
        if (a5VarA != null) {
            z(a5VarA);
        } else {
            iHMDataCallback.onStart();
            iHMDataCallback.onStop(file, new HMDeviceError(100));
        }
    }

    public class c implements zos {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public PowerManager.WakeLock f27456a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ zos f27457b;

        public c(zos zosVar) {
            this.f27457b = zosVar;
        }

        @Override // defpackage.zos
        public void a() {
            b();
            this.f27457b.a();
            n1t.this.F.b(new Progress());
        }

        public final void b() {
            PowerManager powerManager = (PowerManager) n1t.this.M().getSystemService("power");
            if (powerManager != null) {
                PowerManager.WakeLock wakeLockNewWakeLock = powerManager.newWakeLock(1, "mifit:IHMActivityDataCallback");
                this.f27456a = wakeLockNewWakeLock;
                wakeLockNewWakeLock.acquire(60000L);
            }
        }

        public final void c() {
            PowerManager.WakeLock wakeLock = this.f27456a;
            if (wakeLock != null) {
                wakeLock.release();
            }
        }

        @Override // defpackage.zos
        public void a(Progress progress) {
            this.f27457b.a(progress);
            n1t.this.F.b(progress);
        }

        @Override // defpackage.zos
        public void a(List<k3t> list) {
            this.f27457b.a(list);
        }

        @Override // defpackage.zos
        public void a(tdt tdtVar) {
            this.f27457b.a(tdtVar);
            n1t.this.F.b(null);
            n1t.this.F.a(tdtVar);
            c();
        }
    }

    @Override // zh.a
    public void a(BluetoothDevice bluetoothDevice) {
        P0(wt.GATT_CONNECTED);
    }

    @Override // defpackage.gh
    public void a(@NotNull f5t f5tVar) {
        boolean zF = this.t.f();
        boolean zN = tet.n(this.f23732b, this.t.a());
        t5t.d("HMBaseBleDevice", "isUnKnownType: " + zF + ", connected: " + zN);
        P0(wt.SCAN_FAIL.a(fr.a(zF, zN).getT()));
    }

    @Override // defpackage.kd, defpackage.h4
    public g4 b() {
        yus yusVar = this.u;
        if (yusVar == null) {
            return null;
        }
        return yusVar.b();
    }

    @Override // defpackage.kd, defpackage.h4
    public boolean a(int i) {
        yus yusVar = this.u;
        if (yusVar == null) {
            return false;
        }
        return yusVar.a(i);
    }
}
