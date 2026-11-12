package androidx.camera.core;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.annotation.GuardedBy;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.camera.core.impl.CameraInternal;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.r;
import androidx.core.util.Consumer;
import defpackage.cb3;
import defpackage.g6i;
import defpackage.jua;
import defpackage.lhe;
import defpackage.li3;
import defpackage.oua;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1804a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f1805b;
    public final boolean c;
    public final CameraInternal d;
    public final lhe<Surface> e;
    public final cb3.a<Surface> f;
    public final lhe<Void> g;
    public final cb3.a<Void> h;
    public final DeferrableSurface i;

    @GuardedBy("mLock")
    public g j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @GuardedBy("mLock")
    public h f1806k;

    @GuardedBy("mLock")
    public Executor l;

    public class a implements jua<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ cb3.a f1807a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ lhe f1808b;

        public a(cb3.a aVar, lhe lheVar) {
            this.f1807a = aVar;
            this.f1808b = lheVar;
        }

        @Override // defpackage.jua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r2) {
            g6i.i(this.f1807a.c(null));
        }

        @Override // defpackage.jua
        public void onFailure(Throwable th) {
            if (th instanceof e) {
                g6i.i(this.f1808b.cancel(false));
            } else {
                g6i.i(this.f1807a.c(null));
            }
        }
    }

    public class b extends DeferrableSurface {
        public b(Size size, int i) {
            super(size, i);
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public lhe<Surface> n() {
            return r.this.e;
        }
    }

    public class c implements jua<Surface> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lhe f1809a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ cb3.a f1810b;
        public final /* synthetic */ String c;

        public c(lhe lheVar, cb3.a aVar, String str) {
            this.f1809a = lheVar;
            this.f1810b = aVar;
            this.c = str;
        }

        @Override // defpackage.jua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Surface surface) {
            oua.k(this.f1809a, this.f1810b);
        }

        @Override // defpackage.jua
        public void onFailure(Throwable th) {
            if (!(th instanceof CancellationException)) {
                this.f1810b.c(null);
                return;
            }
            g6i.i(this.f1810b.f(new e(this.c + " cancelled.", th)));
        }
    }

    public class d implements jua<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Consumer f1811a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Surface f1812b;

        public d(Consumer consumer, Surface surface) {
            this.f1811a = consumer;
            this.f1812b = surface;
        }

        @Override // defpackage.jua
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(Void r3) {
            this.f1811a.accept(f.c(0, this.f1812b));
        }

        @Override // defpackage.jua
        public void onFailure(Throwable th) {
            g6i.j(th instanceof e, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th);
            this.f1811a.accept(f.c(1, this.f1812b));
        }
    }

    public static final class e extends RuntimeException {
        public e(String str, Throwable th) {
            super(str, th);
        }
    }

    public static abstract class f {
        public static f c(int i, Surface surface) {
            return new androidx.camera.core.d(i, surface);
        }

        public abstract int a();

        public abstract Surface b();
    }

    public static abstract class g {
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public static g d(Rect rect, int i, int i2) {
            return new androidx.camera.core.e(rect, i, i2);
        }

        public abstract Rect a();

        public abstract int b();

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public abstract int c();
    }

    public interface h {
        void a(g gVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public r(Size size, CameraInternal cameraInternal, boolean z) {
        this.f1805b = size;
        this.d = cameraInternal;
        this.c = z;
        final String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        final AtomicReference atomicReference = new AtomicReference(null);
        lhe lheVarA = cb3.a(new cb3.c() { // from class: eqo
            @Override // cb3.c
            public final Object a(cb3.a aVar) {
                return r.n(atomicReference, str, aVar);
            }
        });
        cb3.a<Void> aVar = (cb3.a) g6i.g((cb3.a) atomicReference.get());
        this.h = aVar;
        final AtomicReference atomicReference2 = new AtomicReference(null);
        lhe<Void> lheVarA2 = cb3.a(new cb3.c() { // from class: fqo
            @Override // cb3.c
            public final Object a(cb3.a aVar2) {
                return r.o(atomicReference2, str, aVar2);
            }
        });
        this.g = lheVarA2;
        oua.b(lheVarA2, new a(aVar, lheVarA), li3.a());
        cb3.a aVar2 = (cb3.a) g6i.g((cb3.a) atomicReference2.get());
        final AtomicReference atomicReference3 = new AtomicReference(null);
        lhe<Surface> lheVarA3 = cb3.a(new cb3.c() { // from class: gqo
            @Override // cb3.c
            public final Object a(cb3.a aVar3) {
                return r.p(atomicReference3, str, aVar3);
            }
        });
        this.e = lheVarA3;
        this.f = (cb3.a) g6i.g((cb3.a) atomicReference3.get());
        b bVar = new b(size, 34);
        this.i = bVar;
        lhe<Void> lheVarI = bVar.i();
        oua.b(lheVarA3, new c(lheVarI, aVar2, str), li3.a());
        lheVarI.addListener(new Runnable() { // from class: hqo
            @Override // java.lang.Runnable
            public final void run() {
                this.f20352a.q();
            }
        }, li3.a());
    }

    public static /* synthetic */ Object n(AtomicReference atomicReference, String str, cb3.a aVar) throws Exception {
        atomicReference.set(aVar);
        return str + "-cancellation";
    }

    public static /* synthetic */ Object o(AtomicReference atomicReference, String str, cb3.a aVar) throws Exception {
        atomicReference.set(aVar);
        return str + "-status";
    }

    public static /* synthetic */ Object p(AtomicReference atomicReference, String str, cb3.a aVar) throws Exception {
        atomicReference.set(aVar);
        return str + "-Surface";
    }

    public static /* synthetic */ void r(Consumer consumer, Surface surface) {
        consumer.accept(f.c(3, surface));
    }

    public static /* synthetic */ void s(Consumer consumer, Surface surface) {
        consumer.accept(f.c(4, surface));
    }

    @SuppressLint({"PairedRegistration"})
    public void i(Executor executor, Runnable runnable) {
        this.h.a(runnable, executor);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public CameraInternal j() {
        return this.d;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public DeferrableSurface k() {
        return this.i;
    }

    public Size l() {
        return this.f1805b;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean m() {
        return this.c;
    }

    public final /* synthetic */ void q() {
        this.e.cancel(true);
    }

    public void v(final Surface surface, Executor executor, final Consumer<f> consumer) {
        if (this.f.c(surface) || this.e.isCancelled()) {
            oua.b(this.g, new d(consumer, surface), executor);
            return;
        }
        g6i.i(this.e.isDone());
        try {
            this.e.get();
            executor.execute(new Runnable() { // from class: jqo
                @Override // java.lang.Runnable
                public final void run() {
                    r.r(consumer, surface);
                }
            });
        } catch (InterruptedException | ExecutionException unused) {
            executor.execute(new Runnable() { // from class: kqo
                @Override // java.lang.Runnable
                public final void run() {
                    r.s(consumer, surface);
                }
            });
        }
    }

    public void w(Executor executor, final h hVar) {
        final g gVar;
        synchronized (this.f1804a) {
            this.f1806k = hVar;
            this.l = executor;
            gVar = this.j;
        }
        if (gVar != null) {
            executor.execute(new Runnable() { // from class: iqo
                @Override // java.lang.Runnable
                public final void run() {
                    hVar.a(gVar);
                }
            });
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void x(final g gVar) {
        final h hVar;
        Executor executor;
        synchronized (this.f1804a) {
            this.j = gVar;
            hVar = this.f1806k;
            executor = this.l;
        }
        if (hVar == null || executor == null) {
            return;
        }
        executor.execute(new Runnable() { // from class: dqo
            @Override // java.lang.Runnable
            public final void run() {
                hVar.a(gVar);
            }
        });
    }

    public boolean y() {
        return this.f.f(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }
}
