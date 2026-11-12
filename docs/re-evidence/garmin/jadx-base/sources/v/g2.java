package v;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.quirk.CaptureSessionStuckQuirk;
import androidx.camera.camera2.internal.compat.quirk.IncorrectCaptureStateQuirk;
import androidx.camera.core.impl.DeferrableSurface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class g2 extends e2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ScheduledExecutorService f173817o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f173818p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f173819q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public l0.n f173820r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y.h f173821s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y.g f173822t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final y.o f173823u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final y.q f173824v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final AtomicBoolean f173825w;

    public g2(androidx.camera.core.impl.i2 i2Var, androidx.camera.core.impl.i2 i2Var2, e1 e1Var, Executor executor, ScheduledExecutorService scheduledExecutorService, Handler handler) {
        super(e1Var, executor, scheduledExecutorService, handler);
        this.f173818p = new Object();
        this.f173825w = new AtomicBoolean(false);
        this.f173821s = new y.h(i2Var, i2Var2);
        this.f173823u = new y.o(i2Var.a(CaptureSessionStuckQuirk.class) || i2Var.a(IncorrectCaptureStateQuirk.class));
        this.f173822t = new y.g(i2Var2);
        this.f173824v = new y.q(i2Var2);
        this.f173817o = scheduledExecutorService;
    }

    public static ListenableFuture y(g2 g2Var, CameraDevice cameraDevice, w.n nVar, List list) {
        if (g2Var.f173824v.f192959a) {
            Iterator it = g2Var.f173785b.a().iterator();
            while (it.hasNext()) {
                ((c2) it.next()).close();
            }
        }
        g2Var.toString();
        return super.u(cameraDevice, nVar, list);
    }

    public static void z(g2 g2Var) {
        g2Var.toString();
        super.close();
    }

    @Override // v.e2, v.c2
    public final void close() {
        if (!this.f173825w.compareAndSet(false, true)) {
            toString();
            return;
        }
        if (this.f173824v.f192959a) {
            try {
                toString();
                k7.h.e(this.f173790g, "Need to call openCaptureSession before using this API.");
                this.f173790g.f5345a.f5346a.abortCaptures();
            } catch (Exception e4) {
                e4.toString();
                toString();
            }
        }
        toString();
        this.f173823u.b().addListener(new b0(this, 6), this.f173787d);
    }

    @Override // v.e2, v.c2
    public final void e(int i14) {
        if (i14 == 5) {
            synchronized (this.f173818p) {
                try {
                    if (t() && this.f173819q != null) {
                        toString();
                        Iterator it = this.f173819q.iterator();
                        while (it.hasNext()) {
                            ((DeferrableSurface) it.next()).a();
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    @Override // v.e2, v.c2
    public final int f(List<CaptureRequest> list, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.f(list, this.f173823u.a(captureCallback));
    }

    @Override // v.e2, v.c2
    public final ListenableFuture<Void> h() {
        ListenableFuture<Void> listenableFutureB = this.f173823u.b();
        l0.j.a aVar = l0.j.f107810a;
        return androidx.concurrent.futures.b.a(new com.google.android.datatransport.runtime.scheduling.jobscheduling.a(listenableFutureB, this.f173817o, 1500L, 7));
    }

    @Override // v.e2, v.c2
    public final void i() {
        v();
        this.f173823u.c();
    }

    @Override // v.e2, v.c2
    public final int j(CaptureRequest captureRequest, CameraCaptureSession.CaptureCallback captureCallback) {
        return super.j(captureRequest, this.f173823u.a(captureCallback));
    }

    @Override // v.e2, v.c2.b
    public final void m(c2 c2Var) {
        synchronized (this.f173818p) {
            this.f173821s.a(this.f173819q);
        }
        toString();
        super.m(c2Var);
    }

    @Override // v.e2, v.c2.b
    public final void o(c2 c2Var) {
        ArrayList arrayList;
        c2 c2Var2;
        c2 c2Var3;
        toString();
        y.g gVar = this.f173822t;
        e1 e1Var = this.f173785b;
        synchronized (e1Var.f173777b) {
            arrayList = new ArrayList(e1Var.f173780e);
        }
        ArrayList arrayListA = e1Var.a();
        if (gVar.f192943a != null) {
            LinkedHashSet<c2> linkedHashSet = new LinkedHashSet();
            Iterator it = arrayList.iterator();
            while (it.hasNext() && (c2Var3 = (c2) it.next()) != c2Var) {
                linkedHashSet.add(c2Var3);
            }
            for (c2 c2Var4 : linkedHashSet) {
                c2Var4.g().n(c2Var4);
            }
        }
        super.o(c2Var);
        if (gVar.f192943a != null) {
            LinkedHashSet<c2> linkedHashSet2 = new LinkedHashSet();
            Iterator it3 = arrayListA.iterator();
            while (it3.hasNext() && (c2Var2 = (c2) it3.next()) != c2Var) {
                linkedHashSet2.add(c2Var2);
            }
            for (c2 c2Var5 : linkedHashSet2) {
                c2Var5.g().m(c2Var5);
            }
        }
    }

    @Override // v.e2
    public final ListenableFuture<Void> u(CameraDevice cameraDevice, w.n nVar, List<DeferrableSurface> list) throws Throwable {
        Throwable th3;
        synchronized (this.f173818p) {
            try {
                try {
                    ArrayList arrayListA = this.f173785b.a();
                    ArrayList arrayList = new ArrayList();
                    Iterator it = arrayListA.iterator();
                    while (it.hasNext()) {
                        try {
                            arrayList.add(((c2) it.next()).h());
                        } catch (Throwable th4) {
                            th3 = th4;
                            throw th3;
                        }
                    }
                    l0.n nVarI = l0.j.i(arrayList);
                    this.f173820r = nVarI;
                    return l0.j.f(l0.j.j(l0.d.a(nVarI), new bm.h0(this, cameraDevice, nVar, list, 6), this.f173787d));
                } catch (Throwable th5) {
                    th = th5;
                    th3 = th;
                    throw th3;
                }
            } catch (Throwable th6) {
                th = th6;
                th3 = th;
                throw th3;
            }
        }
    }

    @Override // v.e2
    public final ListenableFuture w(ArrayList arrayList) {
        ListenableFuture listenableFutureW;
        synchronized (this.f173818p) {
            this.f173819q = arrayList;
            listenableFutureW = super.w(arrayList);
        }
        return listenableFutureW;
    }

    @Override // v.e2
    public final boolean x() {
        boolean zX;
        synchronized (this.f173818p) {
            try {
                if (t()) {
                    this.f173821s.a(this.f173819q);
                } else {
                    l0.n nVar = this.f173820r;
                    if (nVar != null) {
                        nVar.cancel(true);
                    }
                }
                zX = super.x();
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return zX;
    }
}
