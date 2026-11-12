package v;

import android.annotation.SuppressLint;
import android.content.Context;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.CameraAccessExceptionCompat;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraOutputConfigNullPointerQuirk;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import androidx.camera.core.CameraUnavailableException;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.a3;
import androidx.camera.core.impl.b3;
import androidx.camera.core.impl.c3;
import androidx.camera.core.impl.t2;
import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.perf.util.Constants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class s implements androidx.camera.core.impl.l0 {
    public boolean A;
    public boolean B;
    public boolean C;
    public w1 D;
    public final e1 E;
    public final c2.a F;
    public final b2 H0;
    public final HashSet I;
    public final f I0;
    public androidx.camera.core.impl.e0 P;
    public final Object T;
    public androidx.camera.core.impl.n2 X;
    public boolean Y;
    public final g1 Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a3 f174006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.camera2.internal.compat.q f174007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k0.h f174008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k0.d f174009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile g f174010e = g.INITIALIZED;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.camera.core.impl.t1<androidx.camera.core.impl.l0.a> f174011f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final u0 f174012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final l f174013h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final h f174014i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final w f174015j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CameraDevice f174016k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final w.d f174017k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f174018l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d1 f174019m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicInteger f174020n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ListenableFuture<Void> f174021o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public androidx.concurrent.futures.b.a<Void> f174022p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final LinkedHashMap f174023q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f174024r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f174025t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final c0.a f174026v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final androidx.camera.core.impl.s0 f174027w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final b0.y f174028x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f174029y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final boolean f174030z;

    public class a implements v.f {
        public a(s sVar) {
        }

        @Override // v.f
        public final boolean a(int i14, int i15) {
            return CamcorderProfile.hasProfile(i14, i15);
        }

        @Override // v.f
        public final CamcorderProfile b(int i14, int i15) {
            return CamcorderProfile.get(i14, i15);
        }
    }

    public class b implements l0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ d1 f174031a;

        public b(d1 d1Var) {
            this.f174031a = d1Var;
        }

        @Override // l0.c
        public final void onFailure(Throwable th3) {
            androidx.camera.core.impl.l2 next;
            boolean z14 = th3 instanceof DeferrableSurface.SurfaceClosedException;
            s sVar = s.this;
            if (!z14) {
                if (th3 instanceof CancellationException) {
                    sVar.toString();
                    return;
                }
                g gVar = sVar.f174010e;
                g gVar2 = g.OPENED;
                if (gVar == gVar2) {
                    s.this.E(gVar2, new b0.e(4, th3), true);
                }
                Objects.toString(s.this);
                s sVar2 = s.this;
                if (sVar2.f174019m == this.f174031a) {
                    sVar2.C();
                    return;
                }
                return;
            }
            DeferrableSurface deferrableSurface = ((DeferrableSurface.SurfaceClosedException) th3).getDeferrableSurface();
            Iterator<androidx.camera.core.impl.l2> it = sVar.f174006a.c().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!next.b().contains(deferrableSurface));
            if (next != null) {
                s sVar3 = s.this;
                sVar3.getClass();
                k0.d dVarD = k0.b.d();
                androidx.camera.core.impl.l2.d dVar = next.f5607f;
                if (dVar != null) {
                    new Throwable();
                    sVar3.toString();
                    dVarD.execute(new r0.h(20, dVar, next));
                }
            }
        }

        @Override // l0.c
        public final void onSuccess(Void r14) {
            if (((z.a) s.this.f174026v).b() == 2 && s.this.f174010e == g.OPENED) {
                s.this.D(g.CONFIGURED);
            }
        }
    }

    public final class c extends CameraManager.AvailabilityCallback implements androidx.camera.core.impl.s0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f174033a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f174034b = true;

        public c(String str) {
            this.f174033a = str;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraAvailable(String str) {
            if (this.f174033a.equals(str)) {
                this.f174034b = true;
                if (s.this.f174010e == g.PENDING_OPEN || s.this.f174010e == g.OPENING_WITH_ERROR) {
                    s.this.I(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public final void onCameraUnavailable(String str) {
            if (this.f174033a.equals(str)) {
                this.f174034b = false;
            }
        }
    }

    public final class d implements androidx.camera.core.impl.s0.b {
        public d() {
        }
    }

    public final class e implements CameraControlInternal.b {
        public e() {
        }
    }

    public enum g {
        RELEASED,
        RELEASING,
        INITIALIZED,
        PENDING_OPEN,
        OPENING_WITH_ERROR,
        CLOSING,
        REOPENING_QUIRK,
        REOPENING,
        OPENING,
        OPENED,
        CONFIGURED
    }

    public final class h extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f174055a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f174056b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f174057c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ScheduledFuture<?> f174058d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a f174059e;

        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f174061a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f174062b = -1;

            public a(long j8) {
                this.f174061a = j8;
            }

            public final int a() {
                if (!h.this.c()) {
                    return Constants.FROZEN_FRAME_TIME;
                }
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.f174062b == -1) {
                    this.f174062b = jUptimeMillis;
                }
                long j8 = jUptimeMillis - this.f174062b;
                if (j8 <= 120000) {
                    return 1000;
                }
                return j8 <= 300000 ? 2000 : 4000;
            }

            public final int b() {
                boolean zC = h.this.c();
                long j8 = this.f174061a;
                if (zC) {
                    if (j8 > 0) {
                        return Math.min((int) j8, 1800000);
                    }
                    return 1800000;
                }
                if (j8 > 0) {
                    return Math.min((int) j8, 10000);
                }
                return 10000;
            }
        }

        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Executor f174064a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f174065b = false;

            public b(Executor executor) {
                this.f174064a = executor;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f174064a.execute(new po.g(this, 29));
            }
        }

        public h(Executor executor, ScheduledExecutorService scheduledExecutorService, long j8) {
            this.f174055a = executor;
            this.f174056b = scheduledExecutorService;
            this.f174059e = new a(j8);
        }

        public final boolean a() {
            if (this.f174058d == null) {
                return false;
            }
            Objects.toString(this.f174057c);
            s.this.toString();
            this.f174057c.f174065b = true;
            this.f174057c = null;
            this.f174058d.cancel(false);
            this.f174058d = null;
            return true;
        }

        public final void b() {
            k7.h.f(this.f174057c == null, null);
            k7.h.f(this.f174058d == null, null);
            a aVar = this.f174059e;
            aVar.getClass();
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (aVar.f174062b == -1) {
                aVar.f174062b = jUptimeMillis;
            }
            long j8 = jUptimeMillis - aVar.f174062b;
            long jB = aVar.b();
            s sVar = s.this;
            if (j8 >= jB) {
                aVar.f174062b = -1L;
                aVar.b();
                sVar.E(g.PENDING_OPEN, null, false);
            } else {
                this.f174057c = new b(this.f174055a);
                aVar.a();
                Objects.toString(this.f174057c);
                boolean z14 = sVar.Y;
                sVar.toString();
                this.f174058d = this.f174056b.schedule(this.f174057c, aVar.a(), TimeUnit.MILLISECONDS);
            }
        }

        public final boolean c() {
            s sVar = s.this;
            if (!sVar.Y) {
                return false;
            }
            int i14 = sVar.f174018l;
            return i14 == 1 || i14 == 2;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onClosed(CameraDevice cameraDevice) {
            s.this.toString();
            k7.h.f(s.this.f174016k == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int iOrdinal = s.this.f174010e.ordinal();
            if (iOrdinal == 1 || iOrdinal == 5) {
                k7.h.f(s.this.f174023q.isEmpty(), null);
                s.this.s();
                return;
            }
            if (iOrdinal != 6 && iOrdinal != 7) {
                androidx.room.a0.s(s.this.f174010e, "Camera closed while in state: ");
                return;
            }
            s sVar = s.this;
            int i14 = sVar.f174018l;
            if (i14 == 0) {
                sVar.I(false);
                return;
            }
            "Camera closed due to error: ".concat(s.v(i14));
            sVar.toString();
            b();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onDisconnected(CameraDevice cameraDevice) {
            s.this.toString();
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onError(CameraDevice cameraDevice, int i14) {
            s sVar = s.this;
            sVar.f174016k = cameraDevice;
            sVar.f174018l = i14;
            f fVar = sVar.I0;
            s.this.toString();
            fVar.a();
            int iOrdinal = s.this.f174010e.ordinal();
            if (iOrdinal != 1) {
                switch (iOrdinal) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        cameraDevice.getId();
                        s.this.f174010e.name();
                        k7.h.f(s.this.f174010e == g.OPENING || s.this.f174010e == g.OPENED || s.this.f174010e == g.CONFIGURED || s.this.f174010e == g.REOPENING || s.this.f174010e == g.REOPENING_QUIRK, "Attempt to handle open error from non open state: " + s.this.f174010e);
                        int i15 = 3;
                        if (i14 == 1 || i14 == 2 || i14 == 4) {
                            cameraDevice.getId();
                            s sVar2 = s.this;
                            k7.h.f(sVar2.f174018l != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
                            if (i14 == 1) {
                                i15 = 2;
                            } else if (i14 == 2) {
                                i15 = 1;
                            }
                            sVar2.E(g.REOPENING, new b0.e(i15, null), true);
                            sVar2.r();
                        } else {
                            cameraDevice.getId();
                            s.this.E(g.CLOSING, new b0.e(i14 == 3 ? 5 : 6, null), true);
                            s.this.r();
                        }
                        break;
                    default:
                        androidx.room.a0.s(s.this.f174010e, "onError() should not be possible from state: ");
                        break;
                }
                return;
            }
            cameraDevice.getId();
            s.this.f174010e.name();
            s.this.r();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public final void onOpened(CameraDevice cameraDevice) {
            s.this.toString();
            s sVar = s.this;
            sVar.f174016k = cameraDevice;
            sVar.f174018l = 0;
            this.f174059e.f174062b = -1L;
            int iOrdinal = sVar.f174010e.ordinal();
            if (iOrdinal == 1 || iOrdinal == 5) {
                k7.h.f(s.this.f174023q.isEmpty(), null);
                s.this.f174016k.close();
                s.this.f174016k = null;
            } else {
                if (iOrdinal != 6 && iOrdinal != 7 && iOrdinal != 8) {
                    androidx.room.a0.s(s.this.f174010e, "onOpened() should not be possible from state: ");
                    return;
                }
                s.this.D(g.OPENED);
                androidx.camera.core.impl.s0 s0Var = s.this.f174027w;
                String id3 = cameraDevice.getId();
                s sVar2 = s.this;
                if (s0Var.f(id3, ((z.a) sVar2.f174026v).c(sVar2.f174016k.getId()))) {
                    s.this.B();
                }
            }
        }
    }

    @AutoValue
    public static abstract class i {
        public abstract List<c3.b> a();

        public abstract androidx.camera.core.impl.l2 b();

        public abstract androidx.camera.core.impl.q2 c();

        public abstract Size d();

        public abstract b3<?> e();

        public abstract String f();

        public abstract Class<?> g();
    }

    @SuppressLint({"NullAnnotationGroup"})
    public s(Context context, androidx.camera.camera2.internal.compat.q qVar, String str, w wVar, c0.a aVar, androidx.camera.core.impl.s0 s0Var, Executor executor, Handler handler, g1 g1Var, long j8, b0.y yVar) throws CameraUnavailableException {
        androidx.camera.core.impl.t1<androidx.camera.core.impl.l0.a> t1Var = new androidx.camera.core.impl.t1<>();
        this.f174011f = t1Var;
        this.f174018l = 0;
        this.f174020n = new AtomicInteger(0);
        this.f174023q = new LinkedHashMap();
        this.f174024r = 0;
        this.A = false;
        this.B = false;
        this.C = true;
        this.I = new HashSet();
        this.P = androidx.camera.core.impl.g0.f5557a;
        this.T = new Object();
        this.Y = false;
        this.I0 = new f(this, null);
        this.f174007b = qVar;
        this.f174026v = aVar;
        this.f174027w = s0Var;
        k0.d dVar = new k0.d(handler);
        this.f174009d = dVar;
        k0.h hVar = new k0.h(executor);
        this.f174008c = hVar;
        this.f174014i = new h(hVar, dVar, j8);
        this.f174006a = new a3(str);
        t1Var.f5753a.j(androidx.camera.core.impl.t1.a.a(androidx.camera.core.impl.l0.a.CLOSED));
        u0 u0Var = new u0(s0Var);
        this.f174012g = u0Var;
        e1 e1Var = new e1(hVar);
        this.E = e1Var;
        this.Z = g1Var;
        this.f174028x = yVar;
        try {
            androidx.camera.camera2.internal.compat.h hVarB = qVar.b(str);
            l lVar = new l(hVarB, dVar, hVar, new e(), wVar.f174103j);
            this.f174013h = lVar;
            this.f174015j = wVar;
            wVar.y(lVar);
            wVar.f174101h.q(u0Var.f174087b);
            this.f174017k0 = w.d.a(hVarB);
            this.f174019m = z();
            this.F = new c2.a(hVar, dVar, handler, e1Var, wVar.f174103j, x.c.f188202a);
            androidx.camera.core.impl.i2 i2Var = wVar.f174103j;
            this.f174029y = i2Var.a(LegacyCameraOutputConfigNullPointerQuirk.class) || i2Var.a(CaptureSessionStuckWhenCreatingBeforeClosingCameraQuirk.class);
            this.f174030z = wVar.f174103j.a(LegacyCameraSurfaceCleanupQuirk.class);
            c cVar = new c(str);
            this.f174025t = cVar;
            d dVar2 = new d();
            synchronized (s0Var.f5740b) {
                k7.h.f(!s0Var.f5743e.containsKey(this), "Camera is already registered: " + this);
                s0Var.f5743e.put(this, new androidx.camera.core.impl.s0.a(null, hVar, dVar2, cVar));
            }
            qVar.f5368a.c(hVar, cVar);
            this.H0 = new b2(context, str, qVar, new a(this), e0.a.f61818b);
        } catch (CameraAccessExceptionCompat e4) {
            throw v0.a(e4);
        }
    }

    public static String v(int i14) {
        if (i14 == 0) {
            return "ERROR_NONE";
        }
        if (i14 == 1) {
            return "ERROR_CAMERA_IN_USE";
        }
        if (i14 == 2) {
            return "ERROR_MAX_CAMERAS_IN_USE";
        }
        if (i14 == 3) {
            return "ERROR_CAMERA_DISABLED";
        }
        if (i14 != 4) {
            return i14 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE";
        }
        return "ERROR_CAMERA_DEVICE";
    }

    public static String w(w1 w1Var) {
        StringBuilder sb3 = new StringBuilder("MeteringRepeating");
        w1Var.getClass();
        sb3.append(w1Var.hashCode());
        return sb3.toString();
    }

    public static String x(b0.i1 i1Var) {
        return i1Var.g() + i1Var.hashCode();
    }

    @SuppressLint({"MissingPermission"})
    public final void A(boolean z14) {
        if (!z14) {
            this.f174014i.f174059e.f174062b = -1L;
        }
        this.f174014i.a();
        this.I0.a();
        toString();
        D(g.OPENING);
        try {
            androidx.camera.camera2.internal.compat.q qVar = this.f174007b;
            qVar.f5368a.a(this.f174015j.f174094a, this.f174008c, t());
        } catch (CameraAccessExceptionCompat e4) {
            e4.getMessage();
            toString();
            if (e4.getReason() == 10001) {
                E(g.INITIALIZED, new b0.e(7, e4), true);
                return;
            }
            f fVar = this.I0;
            g gVar = s.this.f174010e;
            g gVar2 = g.OPENING;
            s sVar = s.this;
            if (gVar != gVar2) {
                sVar.toString();
                return;
            }
            sVar.toString();
            fVar.a();
            fVar.f174038a = fVar.new a();
        } catch (SecurityException e14) {
            e14.getMessage();
            toString();
            D(g.REOPENING);
            this.f174014i.b();
        } catch (RuntimeException unused) {
            toString();
            E(g.OPENING_WITH_ERROR, new b0.e(6, null), true);
        }
    }

    public final void B() {
        k7.h.f(this.f174010e == g.OPENED, null);
        androidx.camera.core.impl.l2.h hVarB = this.f174006a.b();
        if (!hVarB.c()) {
            toString();
            return;
        }
        if (!this.f174027w.f(this.f174016k.getId(), ((z.a) this.f174026v).c(this.f174016k.getId()))) {
            ((z.a) this.f174026v).b();
            toString();
            return;
        }
        HashMap map = new HashMap();
        Collection<androidx.camera.core.impl.l2> collectionC = this.f174006a.c();
        Collection<b3<?>> collectionD = this.f174006a.d();
        androidx.camera.core.impl.h hVar = a2.f173669b;
        collectionC.getClass();
        collectionD.getClass();
        ArrayList arrayList = new ArrayList(collectionD);
        for (androidx.camera.core.impl.l2 l2Var : collectionC) {
            if (!l2Var.f5608g.f5814b.b(hVar) || l2Var.b().size() == 1) {
                if (l2Var.f5608g.f5814b.b(hVar)) {
                    int i14 = 0;
                    for (androidx.camera.core.impl.l2 l2Var2 : collectionC) {
                        if (((b3) arrayList.get(i14)).y() == c3.b.METERING_REPEATING) {
                            List<DeferrableSurface> listB = l2Var2.b();
                            listB.getClass();
                            k7.h.f(!listB.isEmpty(), "MeteringRepeating should contain a surface");
                            map.put(l2Var2.b().get(0), 1L);
                        } else if (l2Var2.f5608g.f5814b.b(hVar)) {
                            List<DeferrableSurface> listB2 = l2Var2.b();
                            listB2.getClass();
                            if (!listB2.isEmpty()) {
                                DeferrableSurface deferrableSurface = l2Var2.b().get(0);
                                Object objE = l2Var2.f5608g.f5814b.e(hVar);
                                objE.getClass();
                                map.put(deferrableSurface, objE);
                            }
                        }
                        i14++;
                    }
                    break;
                }
            } else {
                p005kotlin.jvm.internal.x0 x0Var = p005kotlin.jvm.internal.x0.f105818a;
                String.format("SessionConfig has stream use case but also contains %d surfaces, abort populateSurfaceToStreamUseCaseMapping().", Arrays.copyOf(new Object[]{Integer.valueOf(l2Var.b().size())}, 1));
            }
            this.f174019m.a(map);
            d1 d1Var = this.f174019m;
            androidx.camera.core.impl.l2 l2VarB = hVarB.b();
            CameraDevice cameraDevice = this.f174016k;
            cameraDevice.getClass();
            c2.a aVar = this.F;
            l0.j.a(d1Var.d(l2VarB, cameraDevice, new g2(aVar.f173753e, aVar.f173754f, aVar.f173752d, aVar.f173749a, aVar.f173750b, aVar.f173751c)), new b(d1Var), this.f174008c);
        }
        map.toString();
        this.f174019m.a(map);
        d1 d1Var2 = this.f174019m;
        androidx.camera.core.impl.l2 l2VarB2 = hVarB.b();
        CameraDevice cameraDevice2 = this.f174016k;
        cameraDevice2.getClass();
        c2.a aVar2 = this.F;
        l0.j.a(d1Var2.d(l2VarB2, cameraDevice2, new g2(aVar2.f173753e, aVar2.f173754f, aVar2.f173752d, aVar2.f173749a, aVar2.f173750b, aVar2.f173751c)), new b(d1Var2), this.f174008c);
    }

    public final void C() {
        k7.h.f(this.f174019m != null, null);
        toString();
        d1 d1Var = this.f174019m;
        androidx.camera.core.impl.l2 l2VarE = d1Var.e();
        List<androidx.camera.core.impl.v0> listH = d1Var.h();
        d1 d1VarZ = z();
        this.f174019m = d1VarZ;
        d1VarZ.f(l2VarE);
        this.f174019m.b(listH);
        if (this.f174010e.ordinal() != 9) {
            Objects.toString(this.f174010e);
            d1Var.c();
            toString();
        } else if (this.f174029y && d1Var.c()) {
            toString();
            D(g.REOPENING_QUIRK);
        }
        if (this.f174030z && d1Var.c()) {
            toString();
            this.A = true;
        }
        d1Var.close();
        ListenableFuture listenableFutureRelease = d1Var.release();
        this.f174010e.name();
        toString();
        this.f174023q.put(d1Var, listenableFutureRelease);
        l0.j.a(listenableFutureRelease, new u(this, d1Var), k0.b.a());
    }

    public final void D(g gVar) {
        E(gVar, null, true);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x00f3  */
    public final void E(g gVar, b0.e eVar, boolean z14) {
        androidx.camera.core.impl.l0.a aVar;
        androidx.camera.core.impl.l0.a aVar2;
        androidx.camera.core.impl.s0.a aVarB;
        Objects.toString(this.f174010e);
        Objects.toString(gVar);
        toString();
        if (ce.a.b()) {
            ce.a.c(gVar.ordinal(), "CX:C2State[" + this + "]");
            if (eVar != null) {
                this.f174024r++;
            }
            if (this.f174024r > 0) {
                ce.a.c(eVar != null ? eVar.f13873a : 0, "CX:C2StateErrorCode[" + this + "]");
            }
        }
        this.f174010e = gVar;
        switch (gVar) {
            case RELEASED:
                aVar = androidx.camera.core.impl.l0.a.RELEASED;
                break;
            case RELEASING:
                aVar = androidx.camera.core.impl.l0.a.RELEASING;
                break;
            case INITIALIZED:
                aVar = androidx.camera.core.impl.l0.a.CLOSED;
                break;
            case PENDING_OPEN:
                aVar = androidx.camera.core.impl.l0.a.PENDING_OPEN;
                break;
            case OPENING_WITH_ERROR:
            case CLOSING:
            case REOPENING_QUIRK:
                aVar = androidx.camera.core.impl.l0.a.CLOSING;
                break;
            case REOPENING:
            case OPENING:
                aVar = androidx.camera.core.impl.l0.a.OPENING;
                break;
            case OPENED:
                aVar = androidx.camera.core.impl.l0.a.OPEN;
                break;
            case CONFIGURED:
                aVar = androidx.camera.core.impl.l0.a.CONFIGURED;
                break;
            default:
                com.google.firebase.messaging.l.n(gVar, "Unknown state: ");
                return;
        }
        androidx.camera.core.impl.s0 s0Var = this.f174027w;
        synchronized (s0Var.f5740b) {
            try {
                int i14 = s0Var.f5744f;
                androidx.camera.core.impl.l0.a aVar3 = androidx.camera.core.impl.l0.a.RELEASED;
                HashMap map = s0Var.f5743e;
                HashMap map2 = null;
                if (aVar == aVar3) {
                    androidx.camera.core.impl.s0.a aVar4 = (androidx.camera.core.impl.s0.a) map.remove(this);
                    if (aVar4 != null) {
                        s0Var.c();
                        aVar2 = aVar4.f5745a;
                    } else {
                        aVar2 = null;
                    }
                } else {
                    androidx.camera.core.impl.s0.a aVar5 = (androidx.camera.core.impl.s0.a) map.get(this);
                    k7.h.e(aVar5, "Cannot update state of camera which has not yet been registered. Register with CameraStateRegistry.registerCamera()");
                    androidx.camera.core.impl.l0.a aVar6 = aVar5.f5745a;
                    aVar5.f5745a = aVar;
                    androidx.camera.core.impl.l0.a aVar7 = androidx.camera.core.impl.l0.a.OPENING;
                    if (aVar == aVar7) {
                        k7.h.f((aVar != null && aVar.f5600a) || aVar6 == aVar7, "Cannot mark camera as opening until camera was successful at calling CameraStateRegistry.tryOpenCamera()");
                    }
                    if (aVar6 != aVar) {
                        androidx.camera.core.impl.s0.d(this, aVar);
                        s0Var.c();
                    }
                    aVar2 = aVar6;
                }
                if (aVar2 != aVar) {
                    if (((z.a) s0Var.f5742d).b() == 2 && aVar == androidx.camera.core.impl.l0.a.CONFIGURED) {
                        String strC = ((z.a) s0Var.f5742d).c(c().q());
                        if (strC != null) {
                            aVarB = s0Var.b(strC);
                        } else {
                            aVarB = null;
                        }
                    } else {
                        aVarB = null;
                    }
                    if (i14 < 1 && s0Var.f5744f > 0) {
                        map2 = new HashMap();
                        for (Map.Entry entry : s0Var.f5743e.entrySet()) {
                            if (((androidx.camera.core.impl.s0.a) entry.getValue()).f5745a == androidx.camera.core.impl.l0.a.PENDING_OPEN) {
                                map2.put((b0.k) entry.getKey(), (androidx.camera.core.impl.s0.a) entry.getValue());
                            }
                        }
                    } else if (aVar == androidx.camera.core.impl.l0.a.PENDING_OPEN && s0Var.f5744f > 0) {
                        map2 = new HashMap();
                        map2.put(this, (androidx.camera.core.impl.s0.a) s0Var.f5743e.get(this));
                    }
                    if (map2 != null && !z14) {
                        map2.remove(this);
                    }
                    if (map2 != null) {
                        for (androidx.camera.core.impl.s0.a aVar8 : map2.values()) {
                            aVar8.getClass();
                            try {
                                Executor executor = aVar8.f5746b;
                                androidx.camera.core.impl.s0.c cVar = aVar8.f5748d;
                                Objects.requireNonNull(cVar);
                                executor.execute(new a0.c(cVar, 5));
                            } catch (RejectedExecutionException unused) {
                            }
                        }
                    }
                    if (aVarB != null) {
                        try {
                            Executor executor2 = aVarB.f5746b;
                            androidx.camera.core.impl.s0.b bVar = aVarB.f5747c;
                            Objects.requireNonNull(bVar);
                            executor2.execute(new a0.c(bVar, 6));
                        } catch (RejectedExecutionException unused2) {
                        }
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        this.f174011f.f5753a.j(androidx.camera.core.impl.t1.a.a(aVar));
        this.f174012g.a(aVar, eVar);
    }

    public final ArrayList F(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b0.i1 i1Var = (b0.i1) it.next();
            boolean z14 = this.C;
            String strX = x(i1Var);
            Class<?> cls = i1Var.getClass();
            androidx.camera.core.impl.l2 l2Var = z14 ? i1Var.f13977p : i1Var.f13978q;
            b3<?> b3Var = i1Var.f13969h;
            androidx.camera.core.impl.q2 q2Var = i1Var.f13970i;
            arrayList2.add(new v.c(strX, cls, l2Var, b3Var, q2Var != null ? q2Var.f() : null, i1Var.f13970i, i1Var.c() != null ? v0.d.K(i1Var) : null));
        }
        return arrayList2;
    }

    public final void G(ArrayList arrayList) throws Exception {
        Size sizeD;
        boolean zIsEmpty = this.f174006a.c().isEmpty();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        Rational rational = null;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            i iVar = (i) it.next();
            if (!this.f174006a.e(iVar.f())) {
                a3 a3Var = this.f174006a;
                String strF = iVar.f();
                androidx.camera.core.impl.l2 l2VarB = iVar.b();
                b3<?> b3VarE = iVar.e();
                androidx.camera.core.impl.q2 q2VarC = iVar.c();
                List<c3.b> listA = iVar.a();
                LinkedHashMap linkedHashMap = a3Var.f5492a;
                a3.a aVar = (a3.a) linkedHashMap.get(strF);
                if (aVar == null) {
                    aVar = new a3.a(l2VarB, b3VarE, q2VarC, listA);
                    linkedHashMap.put(strF, aVar);
                }
                aVar.f5497e = true;
                a3Var.f(strF, l2VarB, b3VarE, q2VarC, listA);
                arrayList2.add(iVar.f());
                if (iVar.g() == b0.w0.class && (sizeD = iVar.d()) != null) {
                    rational = new Rational(sizeD.getWidth(), sizeD.getHeight());
                }
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        TextUtils.join(", ", arrayList2);
        toString();
        if (zIsEmpty) {
            this.f174013h.y(true);
            l lVar = this.f174013h;
            synchronized (lVar.f173880d) {
                lVar.f173893q++;
            }
        }
        q();
        L();
        K();
        J();
        C();
        g gVar = this.f174010e;
        g gVar2 = g.OPENED;
        if (gVar == gVar2) {
            B();
        } else {
            int iOrdinal = this.f174010e.ordinal();
            if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                H(false);
            } else if (iOrdinal != 5) {
                Objects.toString(this.f174010e);
                toString();
            } else {
                D(g.REOPENING);
                if (!this.f174023q.isEmpty() && !this.B && this.f174018l == 0) {
                    k7.h.f(this.f174016k != null, "Camera Device should be open if session close is not complete");
                    D(gVar2);
                    B();
                }
            }
        }
        if (rational != null) {
            this.f174013h.f173884h.f173952e = rational;
        }
    }

    public final void H(boolean z14) {
        toString();
        if (this.f174027w.e(this)) {
            A(z14);
        } else {
            toString();
            D(g.PENDING_OPEN);
        }
    }

    public final void I(boolean z14) {
        toString();
        if (this.f174025t.f174034b && this.f174027w.e(this)) {
            A(z14);
        } else {
            toString();
            D(g.PENDING_OPEN);
        }
    }

    public final void J() {
        androidx.camera.core.impl.l2.h hVarA = this.f174006a.a();
        boolean zC = hVarA.c();
        l lVar = this.f174013h;
        if (!zC) {
            lVar.f173902z = 1;
            lVar.f173884h.f173961n = 1;
            lVar.f173891o.f173633h = 1;
            this.f174019m.f(lVar.s());
            return;
        }
        int i14 = hVarA.b().f5608g.f5815c;
        lVar.f173902z = i14;
        lVar.f173884h.f173961n = i14;
        lVar.f173891o.f173633h = i14;
        hVarA.a(lVar.s());
        this.f174019m.f(hVarA.b());
    }

    public final void K() {
        if (v1.a(this.f174015j.f174095b)) {
            androidx.camera.core.impl.l2.h hVarA = this.f174006a.a();
            if (hVarA.c()) {
                int iIntValue = ((Integer) hVarA.b().f5608g.a().getUpper()).intValue();
                l lVar = this.f174013h;
                if (iIntValue > 30) {
                    lVar.z(true);
                } else {
                    lVar.z(false);
                }
            }
        }
    }

    public final void L() throws Exception {
        Iterator<b3<?>> it = this.f174006a.d().iterator();
        boolean zN = false;
        while (it.hasNext()) {
            zN |= it.next().n();
        }
        s2 s2Var = this.f174013h.f173889m;
        if (s2Var.f174072d != zN && zN) {
            q0.d dVar = s2Var.f174071c;
            while (!dVar.c()) {
                dVar.a().close();
            }
        }
        s2Var.f174072d = zN;
    }

    @Override // androidx.camera.core.impl.l0
    public final androidx.camera.core.impl.k0 c() {
        return this.f174015j;
    }

    @Override // b0.i1.c
    public final void d(b0.i1 i1Var) {
        this.f174008c.execute(new q(this, x(i1Var), this.C ? i1Var.f13977p : i1Var.f13978q, i1Var.f13969h, i1Var.f13970i, i1Var.c() == null ? null : v0.d.K(i1Var), 0));
    }

    @Override // androidx.camera.core.impl.l0
    public final void f(androidx.camera.core.impl.e0 e0Var) {
        if (e0Var == null) {
            e0Var = androidx.camera.core.impl.g0.f5557a;
        }
        androidx.camera.core.impl.n2 n2VarT = e0Var.t();
        this.P = e0Var;
        synchronized (this.T) {
            this.X = n2VarT;
        }
    }

    @Override // androidx.camera.core.impl.l0
    public final void g(boolean z14) {
        this.C = z14;
    }

    @Override // androidx.camera.core.impl.l0
    public final androidx.camera.core.impl.z1<androidx.camera.core.impl.l0.a> getCameraState() {
        return this.f174011f;
    }

    @Override // androidx.camera.core.impl.l0
    public final androidx.camera.core.impl.e0 h() {
        return this.P;
    }

    @Override // androidx.camera.core.impl.l0
    public final void i(Collection<b0.i1> collection) {
        l lVar = this.f174013h;
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        synchronized (lVar.f173880d) {
            lVar.f173893q++;
        }
        ArrayList<b0.i1> arrayList2 = new ArrayList(arrayList);
        HashSet hashSet = this.I;
        for (b0.i1 i1Var : arrayList2) {
            String strX = x(i1Var);
            if (!hashSet.contains(strX)) {
                hashSet.add(strX);
                i1Var.v();
                i1Var.t();
            }
        }
        try {
            this.f174008c.execute(new r(this, new ArrayList(F(arrayList)), 0));
        } catch (RejectedExecutionException unused) {
            toString();
            lVar.q();
        }
    }

    @Override // b0.i1.c
    public final void k(b0.i1 i1Var) {
        this.f174008c.execute(new q(this, x(i1Var), this.C ? i1Var.f13977p : i1Var.f13978q, i1Var.f13969h, i1Var.f13970i, i1Var.c() == null ? null : v0.d.K(i1Var), 1));
    }

    @Override // b0.i1.c
    public final void l(b0.i1 i1Var) {
        i1Var.getClass();
        this.f174008c.execute(new q(this, x(i1Var), this.C ? i1Var.f13977p : i1Var.f13978q, i1Var.f13969h, i1Var.f13970i, i1Var.c() == null ? null : v0.d.K(i1Var), 2));
    }

    @Override // b0.i1.c
    public final void m(b0.i1 i1Var) {
        this.f174008c.execute(new r0.h(19, this, x(i1Var)));
    }

    @Override // androidx.camera.core.impl.l0
    public final CameraControlInternal n() {
        return this.f174013h;
    }

    @Override // androidx.camera.core.impl.l0
    public final void o(boolean z14) {
        this.f174008c.execute(new a0.a(this, z14, 14));
    }

    @Override // androidx.camera.core.impl.l0
    public final void onRemoved() {
        this.f174008c.execute(new o(this, 0));
    }

    @Override // androidx.camera.core.impl.l0
    public final void p(Collection<b0.i1> collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(F(arrayList));
        for (b0.i1 i1Var : new ArrayList(arrayList)) {
            String strX = x(i1Var);
            HashSet hashSet = this.I;
            if (hashSet.contains(strX)) {
                i1Var.w();
                hashSet.remove(strX);
            }
        }
        this.f174008c.execute(new r(this, arrayList2, 1));
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0126  */
    public final void q() {
        a3 a3Var = this.f174006a;
        androidx.camera.core.impl.l2.h hVarB = a3Var.b();
        LinkedHashMap linkedHashMap = a3Var.f5492a;
        androidx.camera.core.impl.l2 l2VarB = hVarB.b();
        int size = Collections.unmodifiableList(l2VarB.f5608g.f5813a).size();
        int size2 = l2VarB.b().size();
        w1 w1Var = this.D;
        boolean z14 = false;
        if (w1Var == null ? false : a3Var.e(w(w1Var))) {
            boolean z15 = size != 1 || size2 == 1;
            if (z15 || y(this.D)) {
                if (this.D != null) {
                    StringBuilder sb3 = new StringBuilder("MeteringRepeating");
                    this.D.getClass();
                    sb3.append(this.D.hashCode());
                    String string = sb3.toString();
                    if (linkedHashMap.containsKey(string)) {
                        a3.a aVar = (a3.a) linkedHashMap.get(string);
                        aVar.f5497e = false;
                        if (!aVar.f5498f) {
                            linkedHashMap.remove(string);
                        }
                    }
                    StringBuilder sb4 = new StringBuilder("MeteringRepeating");
                    this.D.getClass();
                    sb4.append(this.D.hashCode());
                    String string2 = sb4.toString();
                    if (linkedHashMap.containsKey(string2)) {
                        a3.a aVar2 = (a3.a) linkedHashMap.get(string2);
                        aVar2.f5498f = false;
                        if (!aVar2.f5497e) {
                            linkedHashMap.remove(string2);
                        }
                    }
                    w1 w1Var2 = this.D;
                    androidx.camera.core.impl.p1 p1Var = w1Var2.f174106a;
                    if (p1Var != null) {
                        p1Var.a();
                    }
                    w1Var2.f174106a = null;
                    this.D = null;
                }
                if (z15) {
                    z14 = true;
                }
            } else {
                z14 = true;
            }
        } else if (size != 0 || size2 <= 0) {
            z14 = true;
        } else {
            if (this.D == null) {
                this.D = new w1(this.f174015j.f174095b, this.Z, new n(this, 2));
            }
            if (!y(this.D)) {
                w1 w1Var3 = this.D;
                if (w1Var3 != null) {
                    String strW = w(w1Var3);
                    w1 w1Var4 = this.D;
                    androidx.camera.core.impl.l2 l2Var = w1Var4.f174107b;
                    w1.b bVar = w1Var4.f174108c;
                    c3.b bVar2 = c3.b.METERING_REPEATING;
                    List<c3.b> listSingletonList = Collections.singletonList(bVar2);
                    LinkedHashMap linkedHashMap2 = a3Var.f5492a;
                    a3.a aVar3 = (a3.a) linkedHashMap2.get(strW);
                    if (aVar3 == null) {
                        aVar3 = new a3.a(l2Var, bVar, null, listSingletonList);
                        linkedHashMap2.put(strW, aVar3);
                    }
                    aVar3.f5497e = true;
                    a3Var.f(strW, l2Var, bVar, null, listSingletonList);
                    w1 w1Var5 = this.D;
                    androidx.camera.core.impl.l2 l2Var2 = w1Var5.f174107b;
                    w1.b bVar3 = w1Var5.f174108c;
                    List listSingletonList2 = Collections.singletonList(bVar2);
                    LinkedHashMap linkedHashMap3 = a3Var.f5492a;
                    a3.a aVar4 = (a3.a) linkedHashMap3.get(strW);
                    if (aVar4 == null) {
                        aVar4 = new a3.a(l2Var2, bVar3, null, listSingletonList2);
                        linkedHashMap3.put(strW, aVar4);
                    }
                    aVar4.f5498f = true;
                }
                z14 = true;
            }
        }
        this.f174013h.f173899w = z14;
    }

    public final void r() {
        k7.h.f(this.f174010e == g.CLOSING || this.f174010e == g.RELEASING || (this.f174010e == g.REOPENING && this.f174018l != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f174010e + " (error: " + v(this.f174018l) + ")");
        C();
        this.f174019m.g();
    }

    @Override // androidx.camera.core.impl.l0
    public final ListenableFuture<Void> release() {
        return androidx.concurrent.futures.b.a(new n(this, 0));
    }

    public final void s() {
        k7.h.f(this.f174010e == g.RELEASING || this.f174010e == g.CLOSING, null);
        k7.h.f(this.f174023q.isEmpty(), null);
        if (!this.A) {
            u();
            return;
        }
        if (this.B) {
            toString();
            return;
        }
        if (!this.f174025t.f174034b) {
            this.A = false;
            u();
            toString();
        } else {
            toString();
            androidx.concurrent.futures.b.d dVarA = androidx.concurrent.futures.b.a(new n(this, 1));
            this.B = true;
            dVarA.addListener(new o(this, 1), this.f174008c);
        }
    }

    public final CameraDevice.StateCallback t() {
        ArrayList arrayList = new ArrayList(this.f174006a.b().b().f5604c);
        arrayList.add(this.E.f173781f);
        arrayList.add(this.f174014i);
        return r0.a(arrayList);
    }

    public final String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f174015j.f174094a);
    }

    public final void u() {
        k7.h.f(this.f174010e == g.RELEASING || this.f174010e == g.CLOSING, null);
        k7.h.f(this.f174023q.isEmpty(), null);
        this.f174016k = null;
        if (this.f174010e == g.CLOSING) {
            D(g.INITIALIZED);
            return;
        }
        this.f174007b.f5368a.e(this.f174025t);
        D(g.RELEASED);
        androidx.concurrent.futures.b.a<Void> aVar = this.f174022p;
        if (aVar != null) {
            aVar.b(null);
            this.f174022p = null;
        }
    }

    public final boolean y(w1 w1Var) {
        int i14;
        HashMap map;
        w1Var.getClass();
        ArrayList arrayList = new ArrayList();
        synchronized (this.T) {
            try {
                i14 = ((z.a) this.f174026v).b() == 2 ? 1 : 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        a3 a3Var = this.f174006a;
        a3Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry : a3Var.f5492a.entrySet()) {
            if (((a3.a) entry.getValue()).f5497e) {
                arrayList2.add((a3.a) entry.getValue());
            }
        }
        try {
            for (a3.a aVar : Collections.unmodifiableCollection(arrayList2)) {
                List<c3.b> list = aVar.f5496d;
                if (list == null || list.get(0) != c3.b.METERING_REPEATING) {
                    if (aVar.f5495c == null || aVar.f5496d == null) {
                        aVar.toString();
                    }
                    androidx.camera.core.impl.l2 l2Var = aVar.f5493a;
                    b3<?> b3Var = aVar.f5494b;
                    for (DeferrableSurface deferrableSurface : l2Var.b()) {
                        b2 b2Var = this.H0;
                        int iZ = b3Var.z();
                        Size size = deferrableSurface.f5474h;
                        androidx.camera.core.impl.r2 r2VarX = b3Var.x();
                        androidx.camera.core.impl.r rVarL = b2Var.l(iZ);
                        t2.c cVar = t2.c.CAPTURE_SESSION_TABLES;
                        t2.f5758e.getClass();
                        arrayList.add(new androidx.camera.core.impl.f(t2.a.b(iZ, size, rVarL, i14, cVar, r2VarX), b3Var.z(), deferrableSurface.f5474h, aVar.f5495c.b(), aVar.f5496d, aVar.f5495c.d(), aVar.f5495c.g(), aVar.f5495c.c(), b3Var.v()));
                    }
                }
            }
            this.H0.j(i14, arrayList, map, false, false, false);
            toString();
            b0.y yVar = this.f174028x;
            return (yVar == null || ((Boolean) yVar.N.f(b0.y.Z, Boolean.TRUE)).booleanValue()) ? false : true;
        } catch (IllegalArgumentException unused) {
            toString();
        }
        map = new HashMap();
        map.put(w1Var.f174108c, Collections.singletonList(w1Var.f174109d));
    }

    public final d1 z() {
        synchronized (this.T) {
            try {
                b0.y yVar = this.f174028x;
                a0.f fVar = null;
                if (yVar != null) {
                    androidx.camera.core.impl.h hVar = a0.g.f32a;
                    fVar = (a0.f) yVar.N.f(a0.g.f32a, null);
                }
                a0.f fVar2 = fVar;
                if (this.X == null) {
                    return new c1(this.f174017k0, this.f174015j.f174103j, fVar2);
                }
                return new y1(this.X, this.f174015j, this.f174017k0, this.f174008c, this.f174009d, fVar2);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f174038a;

        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ScheduledFuture<?> f174040a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AtomicBoolean f174041b = new AtomicBoolean(false);

            public a() {
                this.f174040a = s.this.f174009d.schedule(new v(this, 0), 2000L, TimeUnit.MILLISECONDS);
            }
        }

        private f() {
            this.f174038a = null;
        }

        public final void a() {
            a aVar = this.f174038a;
            if (aVar != null) {
                aVar.f174041b.set(true);
                aVar.f174040a.cancel(true);
            }
            this.f174038a = null;
        }

        public /* synthetic */ f(s sVar, a aVar) {
            this();
        }
    }
}
