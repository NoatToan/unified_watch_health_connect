package v;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraConstrainedHighSpeedCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class e2 extends c2.b implements c2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e1 f173785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f173786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Executor f173787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f173788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public h2 f173789f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public androidx.camera.camera2.internal.compat.a f173790g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public androidx.concurrent.futures.b.d f173791h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.concurrent.futures.b.a<Void> f173792i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public l0.d f173793j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f173784a = new Object();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public List<DeferrableSurface> f173794k = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f173795l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f173796m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f173797n = false;

    public class a implements l0.c<Void> {
        public a() {
        }

        @Override // l0.c
        public final void onFailure(Throwable th3) {
            c2 c2Var;
            e2 e2Var = e2.this;
            e2Var.i();
            e1 e1Var = e2Var.f173785b;
            Iterator it = e1Var.b().iterator();
            while (it.hasNext() && (c2Var = (c2) it.next()) != e2Var) {
                c2Var.i();
            }
            synchronized (e1Var.f173777b) {
                e1Var.f173780e.remove(e2Var);
            }
        }

        @Override // l0.c
        public final /* bridge */ /* synthetic */ void onSuccess(Void r14) {
        }
    }

    public e2(e1 e1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        this.f173785b = e1Var;
        this.f173786c = handler;
        this.f173787d = executor;
        this.f173788e = scheduledExecutorService;
    }

    @Override // v.c2
    public final void a() throws CameraAccessException {
        k7.h.e(this.f173790g, "Need to call openCaptureSession before using this API.");
        this.f173790g.f5345a.f5346a.stopRepeating();
    }

    @Override // v.c2
    public final int b(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        k7.h.e(this.f173790g, "Need to call openCaptureSession before using this API.");
        return this.f173790g.f5345a.f5346a.setRepeatingBurstRequests(list, this.f173787d, captureCallback);
    }

    @Override // v.c2
    public final androidx.camera.camera2.internal.compat.a c() {
        this.f173790g.getClass();
        return this.f173790g;
    }

    @Override // v.c2
    public void close() {
        k7.h.e(this.f173790g, "Need to call openCaptureSession before using this API.");
        e1 e1Var = this.f173785b;
        synchronized (e1Var.f173777b) {
            e1Var.f173779d.add(this);
        }
        this.f173790g.f5345a.f5346a.close();
        this.f173787d.execute(new b0(this, 5));
    }

    @Override // v.c2
    public final List<CaptureRequest> d(CaptureRequest captureRequest) {
        androidx.camera.camera2.internal.compat.a aVar = this.f173790g;
        aVar.getClass();
        CameraCaptureSession cameraCaptureSession = aVar.f5345a.f5346a;
        return cameraCaptureSession instanceof CameraConstrainedHighSpeedCaptureSession ? ((CameraConstrainedHighSpeedCaptureSession) cameraCaptureSession).createHighSpeedRequestList(captureRequest) : Collections.EMPTY_LIST;
    }

    @Override // v.c2
    public void e(int i14) {
    }

    @Override // v.c2
    public int f(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        k7.h.e(this.f173790g, "Need to call openCaptureSession before using this API.");
        return this.f173790g.f5345a.f5346a.captureBurstRequests(list, this.f173787d, captureCallback);
    }

    @Override // v.c2
    public final e2 g() {
        return this;
    }

    @Override // v.c2
    public final CameraDevice getDevice() {
        this.f173790g.getClass();
        return this.f173790g.f5345a.f5346a.getDevice();
    }

    @Override // v.c2
    public ListenableFuture<Void> h() {
        l0.j.a aVar = l0.j.f107810a;
        return l0.m.c.f107817b;
    }

    @Override // v.c2
    public void i() {
        v();
    }

    @Override // v.c2
    public int j(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        k7.h.e(this.f173790g, "Need to call openCaptureSession before using this API.");
        return this.f173790g.f5345a.f5346a.setSingleRepeatingRequest(captureRequest, this.f173787d, captureCallback);
    }

    @Override // v.c2.b
    public final void k(c2 c2Var) {
        Objects.requireNonNull(this.f173789f);
        this.f173789f.k(c2Var);
    }

    @Override // v.c2.b
    public final void l(c2 c2Var) {
        Objects.requireNonNull(this.f173789f);
        this.f173789f.l(c2Var);
    }

    @Override // v.c2.b
    public void m(c2 c2Var) {
        androidx.concurrent.futures.b.d dVar;
        synchronized (this.f173784a) {
            try {
                if (this.f173795l) {
                    dVar = null;
                } else {
                    this.f173795l = true;
                    k7.h.e(this.f173791h, "Need to call openCaptureSession before using this API.");
                    dVar = this.f173791h;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        i();
        if (dVar != null) {
            dVar.addListener(new d2(this, c2Var, 0), k0.b.a());
        }
    }

    @Override // v.c2.b
    public final void n(c2 c2Var) {
        c2 c2Var2;
        Objects.requireNonNull(this.f173789f);
        i();
        e1 e1Var = this.f173785b;
        Iterator it = e1Var.b().iterator();
        while (it.hasNext() && (c2Var2 = (c2) it.next()) != this) {
            c2Var2.i();
        }
        synchronized (e1Var.f173777b) {
            e1Var.f173780e.remove(this);
        }
        this.f173789f.n(c2Var);
    }

    @Override // v.c2.b
    public void o(c2 c2Var) {
        c2 c2Var2;
        Objects.requireNonNull(this.f173789f);
        e1 e1Var = this.f173785b;
        synchronized (e1Var.f173777b) {
            e1Var.f173778c.add(this);
            e1Var.f173780e.remove(this);
        }
        Iterator it = e1Var.b().iterator();
        while (it.hasNext() && (c2Var2 = (c2) it.next()) != this) {
            c2Var2.i();
        }
        this.f173789f.o(c2Var);
    }

    @Override // v.c2.b
    public final void p(c2 c2Var) {
        Objects.requireNonNull(this.f173789f);
        this.f173789f.p(c2Var);
    }

    @Override // v.c2.b
    public final void q(c2 c2Var) {
        androidx.concurrent.futures.b.d dVar;
        synchronized (this.f173784a) {
            try {
                if (this.f173797n) {
                    dVar = null;
                } else {
                    this.f173797n = true;
                    k7.h.e(this.f173791h, "Need to call openCaptureSession before using this API.");
                    dVar = this.f173791h;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (dVar != null) {
            dVar.addListener(new d2(this, c2Var, 1), k0.b.a());
        }
    }

    @Override // v.c2.b
    public final void r(c2 c2Var, Surface surface) {
        Objects.requireNonNull(this.f173789f);
        this.f173789f.r(c2Var, surface);
    }

    public final void s(CameraCaptureSession cameraCaptureSession) {
        if (this.f173790g == null) {
            this.f173790g = androidx.camera.camera2.internal.compat.a.a(cameraCaptureSession, this.f173786c);
        }
    }

    public final boolean t() {
        boolean z14;
        synchronized (this.f173784a) {
            z14 = this.f173791h != null;
        }
        return z14;
    }

    public ListenableFuture<Void> u(CameraDevice cameraDevice, w.n nVar, List<DeferrableSurface> list) throws Throwable {
        Throwable th3;
        synchronized (this.f173784a) {
            try {
                if (!this.f173796m) {
                    e1 e1Var = this.f173785b;
                    synchronized (e1Var.f173777b) {
                        try {
                            try {
                                e1Var.f173780e.add(this);
                            } catch (Throwable th4) {
                                th = th4;
                                while (true) {
                                    try {
                                        throw th;
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                }
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    }
                    androidx.concurrent.futures.b.d dVarA = androidx.concurrent.futures.b.a(new bm.h0(this, list, androidx.camera.camera2.internal.compat.k.a(cameraDevice, this.f173786c), nVar, 5));
                    this.f173791h = dVarA;
                    l0.j.a(dVarA, new a(), k0.b.a());
                    return l0.j.f(this.f173791h);
                }
                try {
                    CancellationException cancellationException = new CancellationException("Opener is disabled");
                    l0.j.a aVar = l0.j.f107810a;
                    return new l0.m.a(cancellationException);
                } catch (Throwable th7) {
                    th3 = th7;
                }
            } catch (Throwable th8) {
                th = th8;
            }
            th3 = th;
            throw th3;
        }
    }

    public final void v() {
        synchronized (this.f173784a) {
            try {
                List<DeferrableSurface> list = this.f173794k;
                if (list != null) {
                    androidx.camera.core.impl.c1.a(list);
                    this.f173794k = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public ListenableFuture w(ArrayList arrayList) {
        synchronized (this.f173784a) {
            try {
                if (this.f173796m) {
                    CancellationException cancellationException = new CancellationException("Opener is disabled");
                    l0.j.a aVar = l0.j.f107810a;
                    return new l0.m.a(cancellationException);
                }
                l0.b bVarJ = l0.j.j(l0.d.a(androidx.camera.core.impl.c1.c(arrayList, this.f173787d, this.f173788e)), new o62.b0(21, this, arrayList), this.f173787d);
                this.f173793j = bVarJ;
                return l0.j.f(bVarJ);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public boolean x() {
        boolean z14;
        l0.d dVar = null;
        try {
            synchronized (this.f173784a) {
                try {
                    if (!this.f173796m) {
                        l0.d dVar2 = this.f173793j;
                        dVar = dVar2 != null ? dVar2 : null;
                        this.f173796m = true;
                    }
                    z14 = !t();
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            if (dVar != null) {
                dVar.cancel(true);
            }
            return z14;
        } catch (Throwable th4) {
            if (dVar != null) {
                dVar.cancel(true);
            }
            throw th4;
        }
    }
}
