package defpackage;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.util.ArrayMap;
import android.util.Rational;
import android.util.Size;
import androidx.annotation.GuardedBy;
import androidx.annotation.OptIn;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraControl;
import androidx.camera.core.impl.CameraCaptureFailure;
import androidx.camera.core.impl.CameraControlInternal;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.e;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes.dex */
@OptIn(markerClass = {dj8.class})
@RequiresApi(21)
public class dd3 implements CameraControlInternal {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @VisibleForTesting
    public final b f15386b;
    public final Executor c;
    public final Object d = new Object();
    public final vf3 e;
    public final CameraControlInternal.b f;
    public final SessionConfig.b g;
    public final mz9 h;
    public final l1s i;
    public final tjp j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final xj8 f15387k;

    @VisibleForTesting
    public p1s l;
    public final oc3 m;
    public final zd3 n;

    @GuardedBy("mLock")
    public int o;
    public volatile boolean p;
    public volatile int q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final vu0 f15388r;
    public final sr1 s;
    public final AtomicLong t;
    public volatile lhe<Void> u;
    public int v;
    public long w;
    public final a x;

    @RequiresApi(21)
    public static final class a extends we3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Set<we3> f15389a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map<we3, Executor> f15390b = new ArrayMap();

        @Override // defpackage.we3
        public void a() {
            for (final we3 we3Var : this.f15389a) {
                try {
                    this.f15390b.get(we3Var).execute(new Runnable() { // from class: cd3
                        @Override // java.lang.Runnable
                        public final void run() {
                            we3Var.a();
                        }
                    });
                } catch (RejectedExecutionException e) {
                    zpe.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e);
                }
            }
        }

        @Override // defpackage.we3
        public void b(final ye3 ye3Var) {
            for (final we3 we3Var : this.f15389a) {
                try {
                    this.f15390b.get(we3Var).execute(new Runnable() { // from class: ad3
                        @Override // java.lang.Runnable
                        public final void run() {
                            we3Var.b(ye3Var);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    zpe.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e);
                }
            }
        }

        @Override // defpackage.we3
        public void c(final CameraCaptureFailure cameraCaptureFailure) {
            for (final we3 we3Var : this.f15389a) {
                try {
                    this.f15390b.get(we3Var).execute(new Runnable() { // from class: bd3
                        @Override // java.lang.Runnable
                        public final void run() {
                            we3Var.c(cameraCaptureFailure);
                        }
                    });
                } catch (RejectedExecutionException e) {
                    zpe.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e);
                }
            }
        }

        public void g(Executor executor, we3 we3Var) {
            this.f15389a.add(we3Var);
            this.f15390b.put(we3Var, executor);
        }

        public void k(we3 we3Var) {
            this.f15389a.remove(we3Var);
            this.f15390b.remove(we3Var);
        }
    }

    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set<c> f15391a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f15392b;

        public b(Executor executor) {
            this.f15392b = executor;
        }

        public void b(c cVar) {
            this.f15391a.add(cVar);
        }

        public final /* synthetic */ void c(TotalCaptureResult totalCaptureResult) {
            HashSet hashSet = new HashSet();
            for (c cVar : this.f15391a) {
                if (cVar.a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            this.f15391a.removeAll(hashSet);
        }

        public void d(c cVar) {
            this.f15391a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f15392b.execute(new Runnable() { // from class: ed3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16515a.c(totalCaptureResult);
                }
            });
        }
    }

    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    public dd3(vf3 vf3Var, ScheduledExecutorService scheduledExecutorService, Executor executor, CameraControlInternal.b bVar, lgi lgiVar) {
        SessionConfig.b bVar2 = new SessionConfig.b();
        this.g = bVar2;
        this.o = 0;
        this.p = false;
        this.q = 2;
        this.s = new sr1();
        this.t = new AtomicLong(0L);
        this.u = oua.h(null);
        this.v = 1;
        this.w = 0L;
        a aVar = new a();
        this.x = aVar;
        this.e = vf3Var;
        this.f = bVar;
        this.c = executor;
        b bVar3 = new b(executor);
        this.f15386b = bVar3;
        bVar2.s(this.v);
        bVar2.i(pj3.d(bVar3));
        bVar2.i(aVar);
        this.f15387k = new xj8(this, vf3Var, executor);
        this.h = new mz9(this, scheduledExecutorService, executor, lgiVar);
        this.i = new l1s(this, vf3Var, executor);
        this.j = new tjp(this, vf3Var, executor);
        this.l = new s1s(vf3Var);
        this.f15388r = new vu0(lgiVar);
        this.m = new oc3(this, executor);
        this.n = new zd3(this, vf3Var, lgiVar, executor);
        executor.execute(new Runnable() { // from class: xc3
            @Override // java.lang.Runnable
            public final void run() {
                this.f38962a.Q();
            }
        });
    }

    public static boolean L(TotalCaptureResult totalCaptureResult, long j) {
        Long l;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof uzo) && (l = (Long) ((uzo) tag).c("CameraControlSessionUpdateId")) != null && l.longValue() >= j;
    }

    public static /* synthetic */ void N() {
    }

    public static /* synthetic */ void P() {
    }

    public static /* synthetic */ boolean V(long j, cb3.a aVar, TotalCaptureResult totalCaptureResult) {
        if (!L(totalCaptureResult, j)) {
            return false;
        }
        aVar.c(null);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0070 A[LOOP:0: B:12:0x006a->B:14:0x0070, LOOP_END] */
    @VisibleForTesting
    public Config A() {
        int iA;
        pe3 pe3VarK;
        pe3.a aVar = new pe3.a();
        aVar.e(CaptureRequest.CONTROL_MODE, 1);
        this.h.b(aVar);
        this.f15388r.a(aVar);
        this.i.a(aVar);
        if (!this.p) {
            int i = this.q;
            if (i == 0) {
                iA = this.s.a(2);
            } else if (i == 1) {
                iA = 3;
            }
            aVar.e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(B(iA)));
            aVar.e(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(D(1)));
            this.f15387k.c(aVar);
            pe3VarK = this.m.k();
            for (Config.a<?> aVar2 : pe3VarK.h()) {
                aVar.a().o(aVar2, Config.OptionPriority.ALWAYS_OVERRIDE, pe3VarK.a(aVar2));
            }
            return aVar.c();
        }
        aVar.e(CaptureRequest.FLASH_MODE, 2);
        iA = 1;
        aVar.e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(B(iA)));
        aVar.e(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(D(1)));
        this.f15387k.c(aVar);
        pe3VarK = this.m.k();
        while (r2.hasNext()) {
            aVar.a().o(aVar2, Config.OptionPriority.ALWAYS_OVERRIDE, pe3VarK.a(aVar2));
        }
        return aVar.c();
    }

    public int B(int i) {
        int[] iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (K(i, iArr)) {
            return i;
        }
        return K(1, iArr) ? 1 : 0;
    }

    public int C(int i) {
        int[] iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (K(i, iArr)) {
            return i;
        }
        if (K(4, iArr)) {
            return 4;
        }
        return K(1, iArr) ? 1 : 0;
    }

    public final int D(int i) {
        int[] iArr = (int[]) this.e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (K(i, iArr)) {
            return i;
        }
        return K(1, iArr) ? 1 : 0;
    }

    public tjp E() {
        return this.j;
    }

    @VisibleForTesting
    public int F() {
        int i;
        synchronized (this.d) {
            i = this.o;
        }
        return i;
    }

    public l1s G() {
        return this.i;
    }

    public p1s H() {
        return this.l;
    }

    public void I() {
        synchronized (this.d) {
            this.o++;
        }
    }

    public final boolean J() {
        return F() > 0;
    }

    public final boolean K(int i, int[] iArr) {
        for (int i2 : iArr) {
            if (i == i2) {
                return true;
            }
        }
        return false;
    }

    public boolean M() {
        return this.p;
    }

    public final /* synthetic */ void O(Executor executor, we3 we3Var) {
        this.x.g(executor, we3Var);
    }

    public final /* synthetic */ void Q() {
        t(this.m.l());
    }

    public final /* synthetic */ void R(we3 we3Var) {
        this.x.k(we3Var);
    }

    public final /* synthetic */ lhe S(List list, int i, int i2, int i3, Void r5) throws Exception {
        return this.n.d(list, i, i2, i3);
    }

    public final /* synthetic */ void T(cb3.a aVar) {
        oua.k(h0(g0()), aVar);
    }

    public final /* synthetic */ Object U(final cb3.a aVar) throws Exception {
        this.c.execute(new Runnable() { // from class: yc3
            @Override // java.lang.Runnable
            public final void run() {
                this.f40031a.T(aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    public final /* synthetic */ Object W(final long j, final cb3.a aVar) throws Exception {
        t(new c() { // from class: pc3
            @Override // dd3.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return dd3.V(j, aVar, totalCaptureResult);
            }
        });
        return "waitForSessionUpdateId:" + j;
    }

    public void X(c cVar) {
        this.f15386b.d(cVar);
    }

    public void Y(final we3 we3Var) {
        this.c.execute(new Runnable() { // from class: rc3
            @Override // java.lang.Runnable
            public final void run() {
                this.f32398a.R(we3Var);
            }
        });
    }

    public void Z() {
        c0(1);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void a(boolean z) {
        this.l.a(z);
    }

    public void a0(boolean z) {
        this.h.l(z);
        this.i.f(z);
        this.j.j(z);
        this.f15387k.b(z);
        this.m.s(z);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void b(Size size, SessionConfig.b bVar) {
        this.l.b(size, bVar);
    }

    public void b0(Rational rational) {
        this.h.m(rational);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public lhe<List<Void>> c(final List<e> list, final int i, final int i2) {
        if (J()) {
            final int iX = x();
            return kua.a(this.u).e(new fl1() { // from class: sc3
                @Override // defpackage.fl1
                public final lhe apply(Object obj) {
                    return this.f33498a.S(list, i, iX, i2, (Void) obj);
                }
            }, this.c);
        }
        zpe.k("Camera2CameraControlImp", "Camera is not active.");
        return oua.f(new CameraControl.OperationCanceledException("Camera is not active."));
    }

    public void c0(int i) {
        this.v = i;
        this.h.n(i);
        this.n.c(this.v);
    }

    @Override // androidx.camera.core.CameraControl
    public lhe<Void> d(boolean z) {
        return !J() ? oua.f(new CameraControl.OperationCanceledException("Camera is not active.")) : oua.j(this.j.d(z));
    }

    public void d0(List<e> list) {
        this.f.a(list);
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void e(Config config) {
        this.m.g(hk3.a.e(config).d()).addListener(new Runnable() { // from class: uc3
            @Override // java.lang.Runnable
            public final void run() {
                dd3.N();
            }
        }, li3.a());
    }

    public void e0() {
        this.c.execute(new Runnable() { // from class: qc3
            @Override // java.lang.Runnable
            public final void run() {
                this.f31354a.g0();
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public Rect f() {
        return (Rect) g6i.g((Rect) this.e.a(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE));
    }

    public lhe<Void> f0() {
        return oua.j(cb3.a(new cb3.c() { // from class: vc3
            @Override // cb3.c
            public final Object a(cb3.a aVar) {
                return this.f36733a.U(aVar);
            }
        }));
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void g(int i) {
        if (!J()) {
            zpe.k("Camera2CameraControlImp", "Camera is not active.");
        } else {
            this.q = i;
            this.u = f0();
        }
    }

    public long g0() {
        this.w = this.t.getAndIncrement();
        this.f.b();
        return this.w;
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public Config h() {
        return this.m.k();
    }

    public final lhe<Void> h0(final long j) {
        return cb3.a(new cb3.c() { // from class: zc3
            @Override // cb3.c
            public final Object a(cb3.a aVar) {
                return this.f41112a.W(j, aVar);
            }
        });
    }

    @Override // androidx.camera.core.impl.CameraControlInternal
    public void i() {
        this.m.i().addListener(new Runnable() { // from class: wc3
            @Override // java.lang.Runnable
            public final void run() {
                dd3.P();
            }
        }, li3.a());
    }

    public void t(c cVar) {
        this.f15386b.b(cVar);
    }

    public void u(final Executor executor, final we3 we3Var) {
        this.c.execute(new Runnable() { // from class: tc3
            @Override // java.lang.Runnable
            public final void run() {
                this.f34556a.O(executor, we3Var);
            }
        });
    }

    public void v() {
        synchronized (this.d) {
            try {
                int i = this.o;
                if (i == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.o = i - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void w(boolean z) {
        this.p = z;
        if (!z) {
            e.a aVar = new e.a();
            aVar.p(this.v);
            aVar.q(true);
            pe3.a aVar2 = new pe3.a();
            aVar2.e(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(B(1)));
            aVar2.e(CaptureRequest.FLASH_MODE, 0);
            aVar.e(aVar2.c());
            d0(Collections.singletonList(aVar.h()));
        }
        g0();
    }

    public int x() {
        return this.q;
    }

    public mz9 y() {
        return this.h;
    }

    public SessionConfig z() {
        this.g.s(this.v);
        this.g.q(A());
        Object objN = this.m.k().N(null);
        if (objN != null && (objN instanceof Integer)) {
            this.g.l("Camera2CameraControl", objN);
        }
        this.g.l("CameraControlSessionUpdateId", Long.valueOf(this.w));
        return this.g.m();
    }
}
