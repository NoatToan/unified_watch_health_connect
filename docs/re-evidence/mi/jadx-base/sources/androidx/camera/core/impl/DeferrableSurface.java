package androidx.camera.core.impl;

import android.util.Log;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import defpackage.cb3;
import defpackage.lhe;
import defpackage.li3;
import defpackage.oua;
import defpackage.zpe;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public abstract class DeferrableSurface {
    public static final Size i = new Size(0, 0);
    public static final boolean j = zpe.f("DeferrableSurface");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final AtomicInteger f1713k = new AtomicInteger(0);
    public static final AtomicInteger l = new AtomicInteger(0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @GuardedBy("mLock")
    public int f1715b;

    @GuardedBy("mLock")
    public boolean c;

    @GuardedBy("mLock")
    public cb3.a<Void> d;
    public final lhe<Void> e;
    public final Size f;
    public final int g;
    public Class<?> h;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
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

    public DeferrableSurface() {
        this(i, 0);
    }

    public final void c() {
        cb3.a<Void> aVar;
        synchronized (this.f1714a) {
            try {
                if (this.c) {
                    aVar = null;
                } else {
                    this.c = true;
                    if (this.f1715b == 0) {
                        aVar = this.d;
                        this.d = null;
                    } else {
                        aVar = null;
                    }
                    if (zpe.f("DeferrableSurface")) {
                        zpe.a("DeferrableSurface", "surface closed,  useCount=" + this.f1715b + " closed=true " + this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public void d() {
        cb3.a<Void> aVar;
        synchronized (this.f1714a) {
            try {
                int i2 = this.f1715b;
                if (i2 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                int i3 = i2 - 1;
                this.f1715b = i3;
                if (i3 == 0 && this.c) {
                    aVar = this.d;
                    this.d = null;
                } else {
                    aVar = null;
                }
                if (zpe.f("DeferrableSurface")) {
                    zpe.a("DeferrableSurface", "use count-1,  useCount=" + this.f1715b + " closed=" + this.c + " " + this);
                    if (this.f1715b == 0) {
                        m("Surface no longer in use", l.get(), f1713k.decrementAndGet());
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (aVar != null) {
            aVar.c(null);
        }
    }

    public Class<?> e() {
        return this.h;
    }

    public Size f() {
        return this.f;
    }

    public int g() {
        return this.g;
    }

    public final lhe<Surface> h() {
        synchronized (this.f1714a) {
            try {
                if (this.c) {
                    return oua.f(new SurfaceClosedException("DeferrableSurface already closed.", this));
                }
                return n();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public lhe<Void> i() {
        return oua.j(this.e);
    }

    public void j() throws SurfaceClosedException {
        synchronized (this.f1714a) {
            try {
                int i2 = this.f1715b;
                if (i2 == 0 && this.c) {
                    throw new SurfaceClosedException("Cannot begin use on a closed surface.", this);
                }
                this.f1715b = i2 + 1;
                if (zpe.f("DeferrableSurface")) {
                    if (this.f1715b == 1) {
                        m("New surface in use", l.get(), f1713k.incrementAndGet());
                    }
                    zpe.a("DeferrableSurface", "use count+1, useCount=" + this.f1715b + " " + this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final /* synthetic */ Object k(cb3.a aVar) throws Exception {
        synchronized (this.f1714a) {
            this.d = aVar;
        }
        return "DeferrableSurface-termination(" + this + ")";
    }

    public final /* synthetic */ void l(String str) {
        try {
            this.e.get();
            m("Surface terminated", l.decrementAndGet(), f1713k.get());
        } catch (Exception e) {
            zpe.c("DeferrableSurface", "Unexpected surface termination for " + this + "\nStack Trace:\n" + str);
            synchronized (this.f1714a) {
                throw new IllegalArgumentException(String.format("DeferrableSurface %s [closed: %b, use_count: %s] terminated with unexpected exception.", this, Boolean.valueOf(this.c), Integer.valueOf(this.f1715b)), e);
            }
        }
    }

    public final void m(String str, int i2, int i3) {
        if (!j && zpe.f("DeferrableSurface")) {
            zpe.a("DeferrableSurface", "DeferrableSurface usage statistics may be inaccurate since debug logging was not enabled at static initialization time. App restart may be required to enable accurate usage statistics.");
        }
        zpe.a("DeferrableSurface", str + "[total_surfaces=" + i2 + ", used_surfaces=" + i3 + "](" + this + "}");
    }

    public abstract lhe<Surface> n();

    public void o(Class<?> cls) {
        this.h = cls;
    }

    public DeferrableSurface(Size size, int i2) {
        this.f1714a = new Object();
        this.f1715b = 0;
        this.c = false;
        this.f = size;
        this.g = i2;
        lhe<Void> lheVarA = cb3.a(new cb3.c() { // from class: dy5
            @Override // cb3.c
            public final Object a(cb3.a aVar) {
                return this.f16049a.k(aVar);
            }
        });
        this.e = lheVarA;
        if (zpe.f("DeferrableSurface")) {
            m("Surface created", l.incrementAndGet(), f1713k.get());
            final String stackTraceString = Log.getStackTraceString(new Exception());
            lheVarA.addListener(new Runnable() { // from class: ey5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17183a.l(stackTraceString);
                }
            }, li3.a());
        }
    }
}
