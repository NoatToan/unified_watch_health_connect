package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public abstract class DeferrableSurface {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final Size f5464k = new Size(0, 0);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final AtomicInteger f5465l = new AtomicInteger(0);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final AtomicInteger f5466m = new AtomicInteger(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f5467a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f5468b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f5469c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.concurrent.futures.b.a<Void> f5470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.concurrent.futures.b.d f5471e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.concurrent.futures.b.a<Void> f5472f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final androidx.concurrent.futures.b.d f5473g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Size f5474h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f5475i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Class<?> f5476j;

    public static final class SurfaceClosedException extends Exception {
        DeferrableSurface mDeferrableSurface;

        public SurfaceClosedException(String str, DeferrableSurface deferrableSurface) {
            super(str);
            this.mDeferrableSurface = deferrableSurface;
        }

        public DeferrableSurface getDeferrableSurface() {
            return this.mDeferrableSurface;
        }
    }

    public static final class SurfaceUnavailableException extends Exception {
        public SurfaceUnavailableException(String str) {
            super(str);
        }
    }

    public DeferrableSurface(Size size, int i14) {
        this.f5467a = new Object();
        this.f5468b = 0;
        this.f5469c = false;
        this.f5474h = size;
        this.f5475i = i14;
        androidx.concurrent.futures.b.a<Void> aVar = new androidx.concurrent.futures.b.a<>();
        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
        aVar.f6080b = dVar;
        aVar.f6079a = v.h.class;
        try {
            synchronized (this.f5467a) {
                this.f5470d = aVar;
            }
            aVar.f6079a = "DeferrableSurface-termination(" + this + ")";
        } catch (Exception e4) {
            dVar.a(e4);
        }
        this.f5471e = dVar;
        androidx.concurrent.futures.b.a<Void> aVar2 = new androidx.concurrent.futures.b.a<>();
        androidx.concurrent.futures.b.d<T> dVar2 = new androidx.concurrent.futures.b.d<>(aVar2);
        aVar2.f6080b = dVar2;
        aVar2.f6079a = v.h.class;
        try {
            synchronized (this.f5467a) {
                this.f5472f = aVar2;
            }
            aVar2.f6079a = "DeferrableSurface-close(" + this + ")";
        } catch (Exception e14) {
            dVar2.a(e14);
        }
        this.f5473g = dVar2;
        if (b0.t0.a(3, "DeferrableSurface")) {
            f5466m.incrementAndGet();
            f5465l.get();
            toString();
            dVar.addListener(new a1(Log.getStackTraceString(new Exception()), this), k0.b.a());
        }
    }

    public void a() {
        androidx.concurrent.futures.b.a<Void> aVar;
        synchronized (this.f5467a) {
            try {
                if (this.f5469c) {
                    aVar = null;
                } else {
                    this.f5469c = true;
                    this.f5472f.b(null);
                    if (this.f5468b == 0) {
                        aVar = this.f5470d;
                        this.f5470d = null;
                    } else {
                        aVar = null;
                    }
                    if (b0.t0.a(3, "DeferrableSurface")) {
                        toString();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (aVar != null) {
            aVar.b(null);
        }
    }

    public final void b() {
        androidx.concurrent.futures.b.a<Void> aVar;
        synchronized (this.f5467a) {
            try {
                int i14 = this.f5468b;
                if (i14 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i15 = i14 - 1;
                this.f5468b = i15;
                if (i15 == 0 && this.f5469c) {
                    aVar = this.f5470d;
                    this.f5470d = null;
                } else {
                    aVar = null;
                }
                if (b0.t0.a(3, "DeferrableSurface")) {
                    toString();
                    if (this.f5468b == 0) {
                        f5466m.get();
                        f5465l.decrementAndGet();
                        toString();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (aVar != null) {
            aVar.b(null);
        }
    }

    public final ListenableFuture<Surface> c() {
        synchronized (this.f5467a) {
            try {
                if (!this.f5469c) {
                    return e();
                }
                SurfaceClosedException surfaceClosedException = new SurfaceClosedException("DeferrableSurface already closed.", this);
                l0.j.a aVar = l0.j.f107810a;
                return new l0.m.a(surfaceClosedException);
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void d() {
        synchronized (this.f5467a) {
            try {
                int i14 = this.f5468b;
                if (i14 == 0 && this.f5469c) {
                    throw new SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.f5468b = i14 + 1;
                if (b0.t0.a(3, "DeferrableSurface")) {
                    if (this.f5468b == 1) {
                        f5466m.get();
                        f5465l.incrementAndGet();
                        toString();
                    }
                    toString();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public abstract ListenableFuture<Surface> e();

    public DeferrableSurface() {
        this(f5464k, 0);
    }
}
