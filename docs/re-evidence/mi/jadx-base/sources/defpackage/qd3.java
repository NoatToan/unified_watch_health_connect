package defpackage;

import android.annotation.SuppressLint;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.core.CameraState;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.q;
import androidx.camera.core.o;
import androidx.camera.core.s;
import com.autonavi.amap.mapcore.tools.GlMapUtil;
import com.xiaomi.fitness.device.manager.provider.DeviceModelExtKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class qd3 implements CameraInternal {
    public boolean A;
    public final hz6 B;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f31384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ih3 f31385b;
    public final Executor c;
    public final ScheduledExecutorService d;
    public volatile f e = f.INITIALIZED;
    public final jie<CameraInternal.State> f;
    public final yh3 g;
    public final dd3 h;
    public final g i;
    public final ud3 j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CameraDevice f31386k;
    public int l;
    public mk3 m;
    public final AtomicInteger n;
    public cb3.a<Void> o;
    public final Map<mk3, lhe<Void>> p;
    public final d q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final androidx.camera.core.impl.d f31387r;
    public final Set<lk3> s;
    public ytf t;
    public final pk3 u;
    public final ivo.a v;
    public final Set<String> w;
    public androidx.camera.core.impl.c x;
    public final Object y;

    @GuardedBy("mLock")
    public syl z;

    public class a implements jua<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ mk3 f31388a;

        public a(mk3 mk3Var) {
            this.f31388a = mk3Var;
        }

        @Override // defpackage.jua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r2) {
            CameraDevice cameraDevice;
            qd3.this.p.remove(this.f31388a);
            int i = c.f31391a[qd3.this.e.ordinal()];
            if (i != 3) {
                if (i != 6) {
                    if (i != 7) {
                        return;
                    }
                } else if (qd3.this.l == 0) {
                    return;
                }
            }
            if (!qd3.this.K() || (cameraDevice = qd3.this.f31386k) == null) {
                return;
            }
            ud1.a(cameraDevice);
            qd3.this.f31386k = null;
        }

        @Override // defpackage.jua
        public void onFailure(Throwable th) {
        }
    }

    public class b implements jua<Void> {
        public b() {
        }

        @Override // defpackage.jua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r1) {
        }

        @Override // defpackage.jua
        public void onFailure(Throwable th) {
            if (th instanceof DeferrableSurface.SurfaceClosedException) {
                SessionConfig sessionConfigF = qd3.this.F(((DeferrableSurface.SurfaceClosedException) th).getDeferrableSurface());
                if (sessionConfigF != null) {
                    qd3.this.b0(sessionConfigF);
                    return;
                }
                return;
            }
            if (th instanceof CancellationException) {
                qd3.this.D("Unable to configure camera cancelled");
                return;
            }
            f fVar = qd3.this.e;
            f fVar2 = f.OPENED;
            if (fVar == fVar2) {
                qd3.this.h0(fVar2, CameraState.a.b(4, th));
            }
            if (th instanceof CameraAccessException) {
                qd3.this.D("Unable to configure camera due to " + th.getMessage());
                return;
            }
            if (th instanceof TimeoutException) {
                zpe.c("Camera2CameraImpl", "Unable to configure camera " + qd3.this.j.a() + ", timeout!");
            }
        }
    }

    public static /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31391a;

        static {
            int[] iArr = new int[f.values().length];
            f31391a = iArr;
            try {
                iArr[f.INITIALIZED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31391a[f.PENDING_OPEN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31391a[f.CLOSING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31391a[f.OPENED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31391a[f.OPENING.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31391a[f.REOPENING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f31391a[f.RELEASING.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f31391a[f.RELEASED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public final class d extends CameraManager.AvailabilityCallback implements androidx.camera.core.impl.d.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f31392a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f31393b = true;

        public d(String str) {
            this.f31392a = str;
        }

        @Override // androidx.camera.core.impl.d.b
        public void a() {
            if (qd3.this.e == f.PENDING_OPEN) {
                qd3.this.o0(false);
            }
        }

        public boolean b() {
            return this.f31393b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (this.f31392a.equals(str)) {
                this.f31393b = true;
                if (qd3.this.e == f.PENDING_OPEN) {
                    qd3.this.o0(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.f31392a.equals(str)) {
                this.f31393b = false;
            }
        }
    }

    public final class e implements CameraControlInternal.b {
        public e() {
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.b
        public void a(List<androidx.camera.core.impl.e> list) {
            qd3.this.j0((List) g6i.g(list));
        }

        @Override // androidx.camera.core.impl.CameraControlInternal.b
        public void b() {
            qd3.this.p0();
        }
    }

    public enum f {
        INITIALIZED,
        PENDING_OPEN,
        OPENING,
        OPENED,
        CLOSING,
        REOPENING,
        RELEASING,
        RELEASED
    }

    @RequiresApi(21)
    public final class g extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f31397a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f31398b;
        public b c;
        public ScheduledFuture<?> d;
        public final a e = new a();

        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public long f31399a = -1;

            public a() {
            }

            public boolean a() {
                if (b() < d()) {
                    return true;
                }
                e();
                return false;
            }

            public long b() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.f31399a == -1) {
                    this.f31399a = jUptimeMillis;
                }
                return jUptimeMillis - this.f31399a;
            }

            public int c() {
                if (!g.this.f()) {
                    return 700;
                }
                long jB = b();
                if (jB <= 120000) {
                    return 1000;
                }
                return jB <= 300000 ? 2000 : 4000;
            }

            public int d() {
                if (g.this.f()) {
                    return DeviceModelExtKt.BATTERY_UPDATE_INTERVAL;
                }
                return 10000;
            }

            public void e() {
                this.f31399a = -1L;
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Executor f31401a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f31402b = false;

            public b(Executor executor) {
                this.f31401a = executor;
            }

            public void b() {
                this.f31402b = true;
            }

            public final /* synthetic */ void c() {
                if (this.f31402b) {
                    return;
                }
                g6i.i(qd3.this.e == f.REOPENING);
                if (g.this.f()) {
                    qd3.this.n0(true);
                } else {
                    qd3.this.o0(true);
                }
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f31401a.execute(new Runnable() { // from class: rd3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32431a.c();
                    }
                });
            }
        }

        public g(Executor executor, ScheduledExecutorService scheduledExecutorService) {
            this.f31397a = executor;
            this.f31398b = scheduledExecutorService;
        }

        public boolean a() {
            if (this.d == null) {
                return false;
            }
            qd3.this.D("Cancelling scheduled re-open: " + this.c);
            this.c.b();
            this.c = null;
            this.d.cancel(false);
            this.d = null;
            return true;
        }

        public final void b(CameraDevice cameraDevice, int i) {
            g6i.j(qd3.this.e == f.OPENING || qd3.this.e == f.OPENED || qd3.this.e == f.REOPENING, "Attempt to handle open error from non open state: " + qd3.this.e);
            if (i == 1 || i == 2 || i == 4) {
                zpe.a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), qd3.H(i)));
                c(i);
                return;
            }
            zpe.c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + qd3.H(i) + " closing camera.");
            qd3.this.h0(f.CLOSING, CameraState.a.a(i == 3 ? 5 : 6));
            qd3.this.z(false);
        }

        public final void c(int i) {
            int i2 = 1;
            g6i.j(qd3.this.l != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i == 1) {
                i2 = 2;
            } else if (i != 2) {
                i2 = 3;
            }
            qd3.this.h0(f.REOPENING, CameraState.a.a(i2));
            qd3.this.z(false);
        }

        public void d() {
            this.e.e();
        }

        public void e() {
            g6i.i(this.c == null);
            g6i.i(this.d == null);
            if (!this.e.a()) {
                zpe.c("Camera2CameraImpl", "Camera reopening attempted for " + this.e.d() + "ms without success.");
                qd3.this.i0(f.PENDING_OPEN, null, false);
                return;
            }
            this.c = new b(this.f31397a);
            qd3.this.D("Attempting camera re-open in " + this.e.c() + "ms: " + this.c + " activeResuming = " + qd3.this.A);
            this.d = this.f31398b.schedule(this.c, (long) this.e.c(), TimeUnit.MILLISECONDS);
        }

        public boolean f() {
            int i;
            qd3 qd3Var = qd3.this;
            return qd3Var.A && ((i = qd3Var.l) == 1 || i == 2);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            qd3.this.D("CameraDevice.onClosed()");
            g6i.j(qd3.this.f31386k == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int i = c.f31391a[qd3.this.e.ordinal()];
            if (i != 3) {
                if (i == 6) {
                    qd3 qd3Var = qd3.this;
                    if (qd3Var.l == 0) {
                        qd3Var.o0(false);
                        return;
                    }
                    qd3Var.D("Camera closed due to error: " + qd3.H(qd3.this.l));
                    e();
                    return;
                }
                if (i != 7) {
                    throw new IllegalStateException("Camera closed while in state: " + qd3.this.e);
                }
            }
            g6i.i(qd3.this.K());
            qd3.this.G();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            qd3.this.D("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i) {
            qd3 qd3Var = qd3.this;
            qd3Var.f31386k = cameraDevice;
            qd3Var.l = i;
            int i2 = c.f31391a[qd3Var.e.ordinal()];
            if (i2 != 3) {
                if (i2 == 4 || i2 == 5 || i2 == 6) {
                    zpe.a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), qd3.H(i), qd3.this.e.name()));
                    b(cameraDevice, i);
                    return;
                } else if (i2 != 7) {
                    throw new IllegalStateException("onError() should not be possible from state: " + qd3.this.e);
                }
            }
            zpe.c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), qd3.H(i), qd3.this.e.name()));
            qd3.this.z(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            qd3.this.D("CameraDevice.onOpened()");
            qd3 qd3Var = qd3.this;
            qd3Var.f31386k = cameraDevice;
            qd3Var.l = 0;
            d();
            int i = c.f31391a[qd3.this.e.ordinal()];
            if (i != 3) {
                if (i == 5 || i == 6) {
                    qd3.this.g0(f.OPENED);
                    qd3.this.Z();
                    return;
                } else if (i != 7) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + qd3.this.e);
                }
            }
            g6i.i(qd3.this.K());
            qd3.this.f31386k.close();
            qd3.this.f31386k = null;
        }
    }

    public static abstract class h {
        public static h a(String str, Class<?> cls, SessionConfig sessionConfig, Size size) {
            return new us1(str, cls, sessionConfig, size);
        }

        public static h b(s sVar) {
            return a(qd3.I(sVar), sVar.getClass(), sVar.l(), sVar.c());
        }

        public abstract SessionConfig c();

        public abstract Size d();

        public abstract String e();

        public abstract Class<?> f();
    }

    public qd3(ih3 ih3Var, String str, ud3 ud3Var, androidx.camera.core.impl.d dVar, Executor executor, Handler handler, hz6 hz6Var) throws CameraUnavailableException {
        jie<CameraInternal.State> jieVar = new jie<>();
        this.f = jieVar;
        this.l = 0;
        this.n = new AtomicInteger(0);
        this.p = new LinkedHashMap();
        this.s = new HashSet();
        this.w = new HashSet();
        this.y = new Object();
        this.A = false;
        this.f31385b = ih3Var;
        this.f31387r = dVar;
        ScheduledExecutorService scheduledExecutorServiceE = li3.e(handler);
        this.d = scheduledExecutorServiceE;
        Executor executorF = li3.f(executor);
        this.c = executorF;
        this.i = new g(executorF, scheduledExecutorServiceE);
        this.f31384a = new q(str);
        jieVar.g(CameraInternal.State.CLOSED);
        yh3 yh3Var = new yh3(dVar);
        this.g = yh3Var;
        pk3 pk3Var = new pk3(executorF);
        this.u = pk3Var;
        this.B = hz6Var;
        this.m = V();
        try {
            dd3 dd3Var = new dd3(ih3Var.c(str), scheduledExecutorServiceE, executorF, new e(), ud3Var.f());
            this.h = dd3Var;
            this.j = ud3Var;
            ud3Var.k(dd3Var);
            ud3Var.n(yh3Var.a());
            this.v = new ivo.a(executorF, scheduledExecutorServiceE, handler, pk3Var, ud3Var.f(), za6.b());
            d dVar2 = new d(str);
            this.q = dVar2;
            dVar.e(this, executorF, dVar2);
            ih3Var.f(executorF, dVar2);
        } catch (CameraAccessExceptionCompat e2) {
            throw bi3.a(e2);
        }
    }

    public static String H(int i) {
        if (i == 0) {
            return "ERROR_NONE";
        }
        if (i == 1) {
            return "ERROR_CAMERA_IN_USE";
        }
        if (i == 2) {
            return "ERROR_MAX_CAMERAS_IN_USE";
        }
        if (i == 3) {
            return "ERROR_CAMERA_DISABLED";
        }
        if (i != 4) {
            return i != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE";
        }
        return "ERROR_CAMERA_DEVICE";
    }

    public static String I(s sVar) {
        return sVar.j() + sVar.hashCode();
    }

    public static /* synthetic */ void M(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    public static /* synthetic */ void T(SessionConfig.c cVar, SessionConfig sessionConfig) {
        cVar.a(sessionConfig, SessionConfig.SessionError.SESSION_ERROR_SURFACE_NEEDS_RESET);
    }

    public final void A() {
        D("Closing camera.");
        int i = c.f31391a[this.e.ordinal()];
        if (i == 2) {
            g6i.i(this.f31386k == null);
            g0(f.INITIALIZED);
            return;
        }
        if (i == 4) {
            g0(f.CLOSING);
            z(false);
            return;
        }
        if (i != 5 && i != 6) {
            D("close() ignored due to being in state: " + this.e);
            return;
        }
        boolean zA = this.i.a();
        g0(f.CLOSING);
        if (zA) {
            g6i.i(K());
            G();
        }
    }

    public final void B(boolean z) {
        final lk3 lk3Var = new lk3();
        this.s.add(lk3Var);
        f0(z);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(GlMapUtil.DEVICE_DISPLAY_DPI_XXHIGH, 480);
        final Surface surface = new Surface(surfaceTexture);
        final Runnable runnable = new Runnable() { // from class: hd3
            @Override // java.lang.Runnable
            public final void run() {
                qd3.M(surface, surfaceTexture);
            }
        };
        SessionConfig.b bVar = new SessionConfig.b();
        final n6d n6dVar = new n6d(surface);
        bVar.h(n6dVar);
        bVar.s(1);
        D("Start configAndClose.");
        lk3Var.a(bVar.m(), (CameraDevice) g6i.g(this.f31386k), this.v.a()).addListener(new Runnable() { // from class: id3
            @Override // java.lang.Runnable
            public final void run() {
                this.f21013a.N(lk3Var, n6dVar, runnable);
            }
        }, this.c);
    }

    public final CameraDevice.StateCallback C() {
        ArrayList arrayList = new ArrayList(this.f31384a.e().b().b());
        arrayList.add(this.u.c());
        arrayList.add(this.i);
        return ug3.a(arrayList);
    }

    public void D(String str) {
        E(str, null);
    }

    public final void E(String str, Throwable th) {
        zpe.b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th);
    }

    public SessionConfig F(DeferrableSurface deferrableSurface) {
        for (SessionConfig sessionConfig : this.f31384a.f()) {
            if (sessionConfig.j().contains(deferrableSurface)) {
                return sessionConfig;
            }
        }
        return null;
    }

    public void G() {
        g6i.i(this.e == f.RELEASING || this.e == f.CLOSING);
        g6i.i(this.p.isEmpty());
        this.f31386k = null;
        if (this.e == f.CLOSING) {
            g0(f.INITIALIZED);
            return;
        }
        this.f31385b.g(this.q);
        g0(f.RELEASED);
        cb3.a<Void> aVar = this.o;
        if (aVar != null) {
            aVar.c(null);
            this.o = null;
        }
    }

    public final boolean J() {
        return ((ud3) c()).j() == 2;
    }

    public boolean K() {
        return this.p.isEmpty() && this.s.isEmpty();
    }

    public final /* synthetic */ void L(List list) {
        try {
            l0(list);
        } finally {
            this.h.v();
        }
    }

    public final /* synthetic */ void P(String str, SessionConfig sessionConfig) {
        D("Use case " + str + " ACTIVE");
        this.f31384a.m(str, sessionConfig);
        this.f31384a.q(str, sessionConfig);
        p0();
    }

    public final /* synthetic */ void Q(String str) {
        D("Use case " + str + " INACTIVE");
        this.f31384a.p(str);
        p0();
    }

    public final /* synthetic */ void R(String str, SessionConfig sessionConfig) {
        D("Use case " + str + " RESET");
        this.f31384a.q(str, sessionConfig);
        f0(false);
        p0();
        if (this.e == f.OPENED) {
            Z();
        }
    }

    public final /* synthetic */ void S(String str, SessionConfig sessionConfig) {
        D("Use case " + str + " UPDATED");
        this.f31384a.q(str, sessionConfig);
        p0();
    }

    public final /* synthetic */ void U(boolean z) {
        this.A = z;
        if (z && this.e == f.PENDING_OPEN) {
            n0(false);
        }
    }

    public final mk3 V() {
        synchronized (this.y) {
            try {
                if (this.z == null) {
                    return new lk3();
                }
                return new qai(this.z, this.j, this.c, this.d);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void W(List<s> list) {
        for (s sVar : list) {
            String strI = I(sVar);
            if (!this.w.contains(strI)) {
                this.w.add(strI);
                sVar.C();
            }
        }
    }

    public final void X(List<s> list) {
        for (s sVar : list) {
            String strI = I(sVar);
            if (this.w.contains(strI)) {
                sVar.D();
                this.w.remove(strI);
            }
        }
    }

    @SuppressLint({"MissingPermission"})
    public final void Y(boolean z) {
        if (!z) {
            this.i.d();
        }
        this.i.a();
        D("Opening camera.");
        g0(f.OPENING);
        try {
            this.f31385b.e(this.j.a(), this.c, C());
        } catch (CameraAccessExceptionCompat e2) {
            D("Unable to open camera due to " + e2.getMessage());
            if (e2.getReason() != 10001) {
                return;
            }
            h0(f.INITIALIZED, CameraState.a.b(7, e2));
        } catch (SecurityException e3) {
            D("Unable to open camera due to " + e3.getMessage());
            g0(f.REOPENING);
            this.i.e();
        }
    }

    public void Z() {
        g6i.i(this.e == f.OPENED);
        SessionConfig.e eVarE = this.f31384a.e();
        if (eVarE.d()) {
            oua.b(this.m.a(eVarE.b(), (CameraDevice) g6i.g(this.f31386k), this.v.a()), new b(), this.c);
        } else {
            D("Unable to create capture session due to conflicting configurations");
        }
    }

    public final void a0() {
        int i = c.f31391a[this.e.ordinal()];
        if (i == 1 || i == 2) {
            n0(false);
            return;
        }
        if (i != 3) {
            D("open() ignored due to being in state: " + this.e);
            return;
        }
        g0(f.REOPENING);
        if (K() || this.l != 0) {
            return;
        }
        g6i.j(this.f31386k != null, "Camera Device should be open if session close is not complete");
        g0(f.OPENED);
        Z();
    }

    @Override // androidx.camera.core.s.d
    public void b(s sVar) {
        g6i.g(sVar);
        final String strI = I(sVar);
        final SessionConfig sessionConfigL = sVar.l();
        this.c.execute(new Runnable() { // from class: kd3
            @Override // java.lang.Runnable
            public final void run() {
                this.f23738a.S(strI, sessionConfigL);
            }
        });
    }

    public void b0(final SessionConfig sessionConfig) {
        ScheduledExecutorService scheduledExecutorServiceD = li3.d();
        List<SessionConfig.c> listC = sessionConfig.c();
        if (listC.isEmpty()) {
            return;
        }
        final SessionConfig.c cVar = listC.get(0);
        E("Posting surface closed", new Throwable());
        scheduledExecutorServiceD.execute(new Runnable() { // from class: nd3
            @Override // java.lang.Runnable
            public final void run() {
                qd3.T(cVar, sessionConfig);
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public dh3 c() {
        return this.j;
    }

    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void N(lk3 lk3Var, DeferrableSurface deferrableSurface, Runnable runnable) {
        this.s.remove(lk3Var);
        lhe<Void> lheVarD0 = d0(lk3Var, false);
        deferrableSurface.c();
        oua.n(Arrays.asList(lheVarD0, deferrableSurface.i())).addListener(runnable, li3.a());
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void d(androidx.camera.core.impl.c cVar) {
        if (cVar == null) {
            cVar = zf3.a();
        }
        syl sylVarJ = cVar.J(null);
        this.x = cVar;
        synchronized (this.y) {
            this.z = sylVarJ;
        }
        g().a(cVar.t().booleanValue());
    }

    public lhe<Void> d0(mk3 mk3Var, boolean z) {
        mk3Var.close();
        lhe<Void> lheVarB = mk3Var.b(z);
        D("Releasing session in state " + this.e.name());
        this.p.put(mk3Var, lheVarB);
        oua.b(lheVarB, new a(mk3Var), li3.a());
        return lheVarB;
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public m4h<CameraInternal.State> e() {
        return this.f;
    }

    public final void e0() {
        if (this.t != null) {
            this.f31384a.o(this.t.c() + this.t.hashCode());
            this.f31384a.p(this.t.c() + this.t.hashCode());
            this.t.b();
            this.t = null;
        }
    }

    @Override // androidx.camera.core.s.d
    public void f(s sVar) {
        g6i.g(sVar);
        final String strI = I(sVar);
        final SessionConfig sessionConfigL = sVar.l();
        this.c.execute(new Runnable() { // from class: md3
            @Override // java.lang.Runnable
            public final void run() {
                this.f26030a.P(strI, sessionConfigL);
            }
        });
    }

    public void f0(boolean z) {
        g6i.i(this.m != null);
        D("Resetting Capture Session");
        mk3 mk3Var = this.m;
        SessionConfig sessionConfigC = mk3Var.c();
        List<androidx.camera.core.impl.e> listG = mk3Var.g();
        mk3 mk3VarV = V();
        this.m = mk3VarV;
        mk3VarV.d(sessionConfigC);
        this.m.e(listG);
        d0(mk3Var, z);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public CameraControlInternal g() {
        return this.h;
    }

    public void g0(f fVar) {
        h0(fVar, null);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void h(final boolean z) {
        this.c.execute(new Runnable() { // from class: pd3
            @Override // java.lang.Runnable
            public final void run() {
                this.f30280a.U(z);
            }
        });
    }

    public void h0(f fVar, CameraState.a aVar) {
        i0(fVar, aVar, true);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void i(Collection<s> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.h.I();
        W(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(k0(arrayList));
        try {
            this.c.execute(new Runnable() { // from class: jd3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22661a.L(arrayList2);
                }
            });
        } catch (RejectedExecutionException e2) {
            E("Unable to attach use cases.", e2);
            this.h.v();
        }
    }

    public void i0(f fVar, CameraState.a aVar, boolean z) {
        CameraInternal.State state;
        D("Transitioning camera internal state: " + this.e + " --> " + fVar);
        this.e = fVar;
        switch (c.f31391a[fVar.ordinal()]) {
            case 1:
                state = CameraInternal.State.CLOSED;
                break;
            case 2:
                state = CameraInternal.State.PENDING_OPEN;
                break;
            case 3:
                state = CameraInternal.State.CLOSING;
                break;
            case 4:
                state = CameraInternal.State.OPEN;
                break;
            case 5:
            case 6:
                state = CameraInternal.State.OPENING;
                break;
            case 7:
                state = CameraInternal.State.RELEASING;
                break;
            case 8:
                state = CameraInternal.State.RELEASED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + fVar);
        }
        this.f31387r.c(this, state, z);
        this.f.g(state);
        this.g.c(state, aVar);
    }

    @Override // androidx.camera.core.impl.CameraInternal
    public void j(Collection<s> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(k0(arrayList));
        X(new ArrayList(arrayList));
        this.c.execute(new Runnable() { // from class: od3
            @Override // java.lang.Runnable
            public final void run() {
                this.f29028a.O(arrayList2);
            }
        });
    }

    public void j0(List<androidx.camera.core.impl.e> list) {
        ArrayList arrayList = new ArrayList();
        for (androidx.camera.core.impl.e eVar : list) {
            androidx.camera.core.impl.e.a aVarK = androidx.camera.core.impl.e.a.k(eVar);
            if (eVar.g() == 5 && eVar.c() != null) {
                aVarK.n(eVar.c());
            }
            if (!eVar.e().isEmpty() || !eVar.h() || y(aVarK)) {
                arrayList.add(aVarK.h());
            }
        }
        D("Issue capture request");
        this.m.e(arrayList);
    }

    @Override // androidx.camera.core.s.d
    public void k(s sVar) {
        g6i.g(sVar);
        final String strI = I(sVar);
        final SessionConfig sessionConfigL = sVar.l();
        this.c.execute(new Runnable() { // from class: gd3
            @Override // java.lang.Runnable
            public final void run() {
                this.f18846a.R(strI, sessionConfigL);
            }
        });
    }

    public final Collection<h> k0(Collection<s> collection) {
        ArrayList arrayList = new ArrayList();
        Iterator<s> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(h.b(it.next()));
        }
        return arrayList;
    }

    @Override // androidx.camera.core.s.d
    public void l(s sVar) {
        g6i.g(sVar);
        final String strI = I(sVar);
        this.c.execute(new Runnable() { // from class: ld3
            @Override // java.lang.Runnable
            public final void run() {
                this.f24923a.Q(strI);
            }
        });
    }

    public final void l0(Collection<h> collection) {
        Size sizeD;
        boolean zIsEmpty = this.f31384a.f().isEmpty();
        ArrayList arrayList = new ArrayList();
        Rational rational = null;
        for (h hVar : collection) {
            if (!this.f31384a.i(hVar.e())) {
                this.f31384a.n(hVar.e(), hVar.c());
                arrayList.add(hVar.e());
                if (hVar.f() == o.class && (sizeD = hVar.d()) != null) {
                    rational = new Rational(sizeD.getWidth(), sizeD.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        D("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (zIsEmpty) {
            this.h.a0(true);
            this.h.I();
        }
        x();
        p0();
        f0(false);
        if (this.e == f.OPENED) {
            Z();
        } else {
            a0();
        }
        if (rational != null) {
            this.h.b0(rational);
        }
    }

    /* JADX INFO: renamed from: m0, reason: merged with bridge method [inline-methods] */
    public final void O(Collection<h> collection) {
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (h hVar : collection) {
            if (this.f31384a.i(hVar.e())) {
                this.f31384a.l(hVar.e());
                arrayList.add(hVar.e());
                if (hVar.f() == o.class) {
                    z = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        D("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z) {
            this.h.b0(null);
        }
        x();
        if (this.f31384a.f().isEmpty()) {
            this.h.v();
            f0(false);
            this.h.a0(false);
            this.m = V();
            A();
            return;
        }
        p0();
        f0(false);
        if (this.e == f.OPENED) {
            Z();
        }
    }

    public void n0(boolean z) {
        D("Attempting to force open the camera.");
        if (this.f31387r.f(this)) {
            Y(z);
        } else {
            D("No cameras available. Waiting for available camera before opening camera.");
            g0(f.PENDING_OPEN);
        }
    }

    public void o0(boolean z) {
        D("Attempting to open the camera.");
        if (this.q.b() && this.f31387r.f(this)) {
            Y(z);
        } else {
            D("No cameras available. Waiting for available camera before opening camera.");
            g0(f.PENDING_OPEN);
        }
    }

    public void p0() {
        SessionConfig.e eVarC = this.f31384a.c();
        if (!eVarC.d()) {
            this.h.Z();
            this.m.d(this.h.z());
            return;
        }
        this.h.c0(eVarC.b().k());
        eVarC.a(this.h.z());
        this.m.d(eVarC.b());
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.j.a());
    }

    public final void w() {
        if (this.t != null) {
            this.f31384a.n(this.t.c() + this.t.hashCode(), this.t.e());
            this.f31384a.m(this.t.c() + this.t.hashCode(), this.t.e());
        }
    }

    public final void x() {
        SessionConfig sessionConfigB = this.f31384a.e().b();
        androidx.camera.core.impl.e eVarG = sessionConfigB.g();
        int size = eVarG.e().size();
        int size2 = sessionConfigB.j().size();
        if (sessionConfigB.j().isEmpty()) {
            return;
        }
        if (eVarG.e().isEmpty()) {
            if (this.t == null) {
                this.t = new ytf(this.j.h(), this.B);
            }
            w();
        } else {
            if (size2 == 1 && size == 1) {
                e0();
                return;
            }
            if (size >= 2) {
                e0();
                return;
            }
            zpe.a("Camera2CameraImpl", "mMeteringRepeating is ATTACHED, SessionConfig Surfaces: " + size2 + ", CaptureConfig Surfaces: " + size);
        }
    }

    public final boolean y(androidx.camera.core.impl.e.a aVar) {
        if (!aVar.l().isEmpty()) {
            zpe.k("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        Iterator<SessionConfig> it = this.f31384a.d().iterator();
        while (it.hasNext()) {
            List<DeferrableSurface> listE = it.next().g().e();
            if (!listE.isEmpty()) {
                Iterator<DeferrableSurface> it2 = listE.iterator();
                while (it2.hasNext()) {
                    aVar.f(it2.next());
                }
            }
        }
        if (!aVar.l().isEmpty()) {
            return true;
        }
        zpe.k("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    public void z(boolean z) {
        g6i.j(this.e == f.CLOSING || this.e == f.RELEASING || (this.e == f.REOPENING && this.l != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.e + " (error: " + H(this.l) + ")");
        if (Build.VERSION.SDK_INT < 29 && J() && this.l == 0) {
            B(z);
        } else {
            f0(z);
        }
        this.m.f();
    }
}
