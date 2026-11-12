package r0;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.impl.DeferrableSurface;
import androidx.camera.core.impl.a1;
import androidx.camera.core.impl.l0;
import androidx.camera.core.impl.q2;
import b0.g1;
import ch.qos.logback.core.CoreConstants;
import com.google.common.util.concurrent.ListenableFuture;
import j0.u;
import j0.v;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f148743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Matrix f148744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f148745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Rect f148746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f148747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f148748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q2 f148749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f148750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f148751i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public g1 f148753k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public a f148754l;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f148752j = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final HashSet f148755m = new HashSet();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f148756n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ArrayList f148757o = new ArrayList();

    public static class a extends DeferrableSurface {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final androidx.concurrent.futures.b.d f148758n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final androidx.concurrent.futures.b.a<Surface> f148759o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public DeferrableSurface f148760p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public p f148761q;

        public a(Size size, int i14) {
            super(size, i14);
            androidx.concurrent.futures.b.a<Surface> aVar = new androidx.concurrent.futures.b.a<>();
            androidx.concurrent.futures.b.d<T> dVar = new androidx.concurrent.futures.b.d<>(aVar);
            aVar.f6080b = dVar;
            aVar.f6079a = v.h.class;
            try {
                this.f148759o = aVar;
                aVar.f6079a = "SettableFuture hashCode: " + hashCode();
            } catch (Exception e4) {
                dVar.a(e4);
            }
            this.f148758n = dVar;
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public final void a() {
            super.a();
            u.c(new m(this, 2));
        }

        @Override // androidx.camera.core.impl.DeferrableSurface
        public final ListenableFuture<Surface> e() {
            return this.f148758n;
        }

        public final boolean f(DeferrableSurface deferrableSurface, Runnable runnable) {
            boolean z14;
            Size size = this.f5474h;
            u.a();
            deferrableSurface.getClass();
            int i14 = deferrableSurface.f5475i;
            Size size2 = deferrableSurface.f5474h;
            DeferrableSurface deferrableSurface2 = this.f148760p;
            if (deferrableSurface2 == deferrableSurface) {
                return false;
            }
            k7.h.f(deferrableSurface2 == null, "A different provider has been set. To change the provider, call SurfaceEdge#invalidate before calling SurfaceEdge#setProvider");
            k7.h.b(size.equals(size2), "The provider's size(" + size + ") must match the parent(" + size2 + ")");
            int i15 = this.f5475i;
            k7.h.b(i15 == i14, am.j.g(i15, i14, "The provider's format(", ") must match the parent(", ")"));
            synchronized (this.f5467a) {
                z14 = this.f5469c;
            }
            k7.h.f(!z14, "The parent is closed. Call SurfaceEdge#invalidate() before setting a new provider.");
            this.f148760p = deferrableSurface;
            l0.j.g(deferrableSurface.c(), this.f148759o);
            deferrableSurface.d();
            l0.j.f(this.f5471e).addListener(new a1(deferrableSurface, 2), k0.b.a());
            l0.j.f(deferrableSurface.f5473g).addListener(runnable, k0.b.d());
            return true;
        }
    }

    public o(int i14, int i15, q2 q2Var, Matrix matrix, boolean z14, Rect rect, int i16, int i17, boolean z15) {
        this.f148748f = i14;
        this.f148743a = i15;
        this.f148749g = q2Var;
        this.f148744b = matrix;
        this.f148745c = z14;
        this.f148746d = rect;
        this.f148751i = i16;
        this.f148750h = i17;
        this.f148747e = z15;
        this.f148754l = new a(q2Var.f(), i15);
    }

    public final void a(Runnable runnable) {
        u.a();
        b();
        this.f148755m.add(runnable);
    }

    public final void b() {
        k7.h.f(!this.f148756n, "Edge is already closed.");
    }

    public final void c() {
        u.a();
        this.f148754l.a();
        this.f148756n = true;
        this.f148757o.clear();
        this.f148755m.clear();
    }

    public final g1 d(l0 l0Var, boolean z14) {
        u.a();
        b();
        q2 q2Var = this.f148749g;
        g1 g1Var = new g1(q2Var.f(), l0Var, z14, q2Var.b(), q2Var.g(), q2Var.c(), new n(this, 0));
        try {
            g1.b bVar = g1Var.f13917m;
            a aVar = this.f148754l;
            Objects.requireNonNull(aVar);
            if (aVar.f(bVar, new m(aVar, 0))) {
                l0.j.f(aVar.f5471e).addListener(new a1(bVar, 1), k0.b.a());
            }
            this.f148753k = g1Var;
            f();
            return g1Var;
        } catch (DeferrableSurface.SurfaceClosedException e4) {
            throw new AssertionError("Surface is somehow already closed", e4);
        } catch (RuntimeException e14) {
            g1Var.d();
            throw e14;
        }
    }

    public final void e() {
        boolean z14;
        u.a();
        b();
        a aVar = this.f148754l;
        aVar.getClass();
        u.a();
        if (aVar.f148760p == null) {
            synchronized (aVar.f5467a) {
                z14 = aVar.f5469c;
            }
            if (!z14) {
                return;
            }
        }
        this.f148752j = false;
        this.f148754l.a();
        this.f148754l = new a(this.f148749g.f(), this.f148743a);
        Iterator it = this.f148755m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void f() {
        g1.h hVar;
        Executor executor;
        u.a();
        b0.j jVar = new b0.j(this.f148746d, this.f148751i, this.f148750h, this.f148745c, this.f148744b, this.f148747e);
        g1 g1Var = this.f148753k;
        if (g1Var != null) {
            synchronized (g1Var.f13905a) {
                g1Var.f13918n = jVar;
                hVar = g1Var.f13919o;
                executor = g1Var.f13920p;
            }
            if (hVar != null && executor != null) {
                executor.execute(new ab.j(22, hVar, jVar));
            }
        }
        Iterator it = this.f148757o.iterator();
        while (it.hasNext()) {
            ((k7.b) it.next()).accept(jVar);
        }
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("SurfaceEdge{targets=");
        sb3.append(this.f148748f);
        sb3.append(", format=");
        sb3.append(this.f148743a);
        sb3.append(", resolution=");
        sb3.append(this.f148749g.f());
        sb3.append(", cropRect=");
        sb3.append(this.f148746d);
        sb3.append(", rotationDegrees=");
        sb3.append(this.f148751i);
        sb3.append(", mirroring=");
        sb3.append(this.f148747e);
        sb3.append(", sensorToBufferTransform= ");
        Matrix matrix = this.f148744b;
        sb3.append(matrix);
        sb3.append(", rotationInTransform= ");
        sb3.append(v.b(matrix));
        sb3.append(", isMirrorInTransform= ");
        sb3.append(v.f(matrix));
        sb3.append(", isClosed=");
        return am.j.t(sb3, this.f148756n, CoreConstants.CURLY_RIGHT);
    }
}
