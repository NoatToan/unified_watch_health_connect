package b0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.q2;
import com.google.auto.value.AutoValue;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes.dex */
public final class g1 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Range<Integer> f13904q = q2.f5715a;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f13905a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Size f13906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b0 f13907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Range<Integer> f13908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final androidx.camera.core.impl.l0 f13909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final androidx.concurrent.futures.b.d f13912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final androidx.concurrent.futures.b.a<Surface> f13913i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final androidx.concurrent.futures.b.d f13914j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final androidx.concurrent.futures.b.a<Void> f13915k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final androidx.concurrent.futures.b.a<Void> f13916l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b f13917m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public j f13918n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public h f13919o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Executor f13920p;

    public class a implements l0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ androidx.concurrent.futures.b.a f13921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ListenableFuture f13922b;

        public a(g1 g1Var, androidx.concurrent.futures.b.a aVar, ListenableFuture listenableFuture) {
            this.f13921a = aVar;
            this.f13922b = listenableFuture;
        }

        @Override // l0.c
        public final void onFailure(Throwable th3) {
            if (th3 instanceof e) {
                k7.h.f(this.f13922b.cancel(false), null);
            } else {
                k7.h.f(this.f13921a.b(null), null);
            }
        }

        @Override // l0.c
        public final void onSuccess(Void r14) {
            k7.h.f(this.f13921a.b(null), null);
        }
    }

    public class b extends DeferrableSurface {
        public b(Size size, int i14) {
            super(size, i14);
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public final ListenableFuture<Surface> e() {
            return g1.this.f13912h;
        }
    }

    public class c implements l0.c<Surface> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ListenableFuture f13924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.concurrent.futures.b.a f13925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f13926c;

        public c(g1 g1Var, ListenableFuture listenableFuture, androidx.concurrent.futures.b.a aVar, String str) {
            this.f13924a = listenableFuture;
            this.f13925b = aVar;
            this.f13926c = str;
        }

        @Override // l0.c
        public final void onFailure(Throwable th3) {
            boolean z14 = th3 instanceof CancellationException;
            androidx.concurrent.futures.b.a aVar = this.f13925b;
            if (!z14) {
                aVar.b(null);
            } else {
                k7.h.f(aVar.d(new e(am.j.o(this.f13926c, " cancelled.", new StringBuilder()), th3)), null);
            }
        }

        @Override // l0.c
        public final void onSuccess(Surface surface) {
            l0.j.g(this.f13924a, this.f13925b);
        }
    }

    public class d implements l0.c<Void> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k7.b f13927a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Surface f13928b;

        public d(g1 g1Var, k7.b bVar, Surface surface) {
            this.f13927a = bVar;
            this.f13928b = surface;
        }

        @Override // l0.c
        public final void onFailure(Throwable th3) {
            k7.h.f(th3 instanceof e, "Camera surface session should only fail with request cancellation. Instead failed due to:\n" + th3);
            this.f13927a.accept(new i(1, this.f13928b));
        }

        @Override // l0.c
        public final void onSuccess(Void r14) {
            this.f13927a.accept(new i(0, this.f13928b));
        }
    }

    public static final class e extends RuntimeException {
        public e(String str, Throwable th3) {
            super(str, th3);
        }
    }

    @AutoValue
    public static abstract class f {
        public abstract int a();

        public abstract Surface b();
    }

    @AutoValue
    public static abstract class g {
        public abstract Rect a();

        public abstract int b();

        public abstract Matrix c();

        public abstract int d();

        public abstract boolean e();

        public abstract boolean f();
    }

    public interface h {
        void l(g gVar);
    }

    public g1(Size size, androidx.camera.core.impl.l0 l0Var, boolean z14, b0 b0Var, int i14, Range<Integer> range, Runnable runnable) {
        this.f13905a = new Object();
        this.f13906b = size;
        this.f13909e = l0Var;
        this.f13910f = z14;
        k7.h.b(b0Var.b(), "SurfaceRequest's DynamicRange must always be fully specified.");
        this.f13907c = b0Var;
        this.f13911g = i14;
        this.f13908d = range;
        String str = "SurfaceRequest[size: " + size + ", id: " + hashCode() + "]";
        AtomicReference atomicReference = new AtomicReference(null);
        androidx.concurrent.futures.b.a aVar = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
        aVar.f6080b = dVar;
        aVar.f6079a = v.h.class;
        try {
            atomicReference.set(aVar);
            aVar.f6079a = str.concat("-cancellation");
        } catch (Exception e4) {
            dVar.a(e4);
        }
        androidx.concurrent.futures.b.a<Void> aVar2 = (androidx.concurrent.futures.b.a) atomicReference.get();
        aVar2.getClass();
        this.f13916l = aVar2;
        AtomicReference atomicReference2 = new AtomicReference(null);
        androidx.concurrent.futures.b.a aVar3 = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar2 = new androidx.concurrent.futures.b.d<>(aVar3);
        aVar3.f6080b = dVar2;
        aVar3.f6079a = v.h.class;
        try {
            atomicReference2.set(aVar3);
            aVar3.f6079a = str.concat("-status");
        } catch (Exception e14) {
            dVar2.a(e14);
        }
        this.f13914j = dVar2;
        l0.j.a(dVar2, new a(this, aVar2, dVar), k0.b.a());
        androidx.concurrent.futures.b.a aVar4 = (androidx.concurrent.futures.b.a) atomicReference2.get();
        aVar4.getClass();
        AtomicReference atomicReference3 = new AtomicReference(null);
        androidx.concurrent.futures.b.a aVar5 = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar3 = new androidx.concurrent.futures.b.d<>(aVar5);
        aVar5.f6080b = dVar3;
        aVar5.f6079a = v.h.class;
        try {
            atomicReference3.set(aVar5);
            aVar5.f6079a = str.concat("-Surface");
        } catch (Exception e15) {
            dVar3.a(e15);
        }
        this.f13912h = dVar3;
        androidx.concurrent.futures.b.a<Surface> aVar6 = (androidx.concurrent.futures.b.a) atomicReference3.get();
        aVar6.getClass();
        this.f13913i = aVar6;
        b bVar = new b(size, 34);
        this.f13917m = bVar;
        ListenableFuture listenableFutureF = l0.j.f(bVar.f5471e);
        l0.j.a(dVar3, new c(this, listenableFutureF, aVar4, str), k0.b.a());
        listenableFutureF.addListener(new e1(this, 0), k0.b.a());
        k0.c cVarA = k0.b.a();
        AtomicReference atomicReference4 = new AtomicReference(null);
        androidx.concurrent.futures.b.a aVar7 = new androidx.concurrent.futures.b.a();
        androidx.concurrent.futures.b.d<T> dVar4 = new androidx.concurrent.futures.b.d<>(aVar7);
        aVar7.f6080b = dVar4;
        aVar7.f6079a = v.h.class;
        try {
            atomicReference4.set(aVar7);
            aVar7.f6079a = "SurfaceRequest-surface-recreation(" + hashCode() + ")";
        } catch (Exception e16) {
            dVar4.a(e16);
        }
        l0.j.a(dVar4, new h1(this, runnable), cVarA);
        androidx.concurrent.futures.b.a<Void> aVar8 = (androidx.concurrent.futures.b.a) atomicReference4.get();
        aVar8.getClass();
        this.f13915k = aVar8;
    }

    public final boolean a() {
        return this.f13912h.f6084b.isDone();
    }

    public final void b(final Surface surface, Executor executor, final k7.b<f> bVar) {
        if (!surface.isValid()) {
            final int i14 = 0;
            executor.execute(new Runnable() { // from class: b0.f1
                @Override // java.lang.Runnable
                public final void run() {
                    int i15 = i14;
                    Surface surface2 = surface;
                    k7.b bVar2 = bVar;
                    switch (i15) {
                        case 0:
                            Range<Integer> range = g1.f13904q;
                            bVar2.accept(new i(2, surface2));
                            break;
                        case 1:
                            Range<Integer> range2 = g1.f13904q;
                            bVar2.accept(new i(3, surface2));
                            break;
                        default:
                            Range<Integer> range3 = g1.f13904q;
                            bVar2.accept(new i(4, surface2));
                            break;
                    }
                }
            });
            return;
        }
        if (!this.f13913i.b(surface)) {
            androidx.concurrent.futures.b.d dVar = this.f13912h;
            if (!dVar.f6084b.isCancelled()) {
                k7.h.f(dVar.f6084b.isDone(), null);
                try {
                    dVar.get();
                    final int i15 = 1;
                    executor.execute(new Runnable() { // from class: b0.f1
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i16 = i15;
                            Surface surface2 = surface;
                            k7.b bVar2 = bVar;
                            switch (i16) {
                                case 0:
                                    Range<Integer> range = g1.f13904q;
                                    bVar2.accept(new i(2, surface2));
                                    break;
                                case 1:
                                    Range<Integer> range2 = g1.f13904q;
                                    bVar2.accept(new i(3, surface2));
                                    break;
                                default:
                                    Range<Integer> range3 = g1.f13904q;
                                    bVar2.accept(new i(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                } catch (InterruptedException | ExecutionException unused) {
                    final int i16 = 2;
                    executor.execute(new Runnable() { // from class: b0.f1
                        @Override // java.lang.Runnable
                        public final void run() {
                            int i17 = i16;
                            Surface surface2 = surface;
                            k7.b bVar2 = bVar;
                            switch (i17) {
                                case 0:
                                    Range<Integer> range = g1.f13904q;
                                    bVar2.accept(new i(2, surface2));
                                    break;
                                case 1:
                                    Range<Integer> range2 = g1.f13904q;
                                    bVar2.accept(new i(3, surface2));
                                    break;
                                default:
                                    Range<Integer> range3 = g1.f13904q;
                                    bVar2.accept(new i(4, surface2));
                                    break;
                            }
                        }
                    });
                    return;
                }
            }
        }
        l0.j.a(this.f13914j, new d(this, bVar, surface), executor);
    }

    public final void c(Executor executor, h hVar) {
        j jVar;
        synchronized (this.f13905a) {
            this.f13919o = hVar;
            this.f13920p = executor;
            jVar = this.f13918n;
        }
        if (jVar != null) {
            executor.execute(new ab.j(23, hVar, jVar));
        }
    }

    public final boolean d() {
        return this.f13913i.d(new DeferrableSurface.SurfaceUnavailableException("Surface request will not complete."));
    }

    public g1(Size size, androidx.camera.core.impl.l0 l0Var, b0 b0Var, Range<Integer> range, Runnable runnable) {
        this(size, l0Var, true, b0Var, 0, range, runnable);
    }

    public g1(Size size, androidx.camera.core.impl.l0 l0Var, Runnable runnable) {
        this(size, l0Var, b0.f13854d, f13904q, runnable);
    }
}
