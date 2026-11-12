package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.Log;
import androidx.annotation.GuardedBy;
import com.bumptech.glide.Priority;
import com.bumptech.glide.b;
import com.bumptech.glide.c;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestCoordinator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
public final class oem<R> implements zmk, zem, rqk {
    public static final boolean E = Log.isLoggable("GlideRequest", 2);

    @GuardedBy("requestLock")
    public int A;

    @GuardedBy("requestLock")
    public int B;

    @GuardedBy("requestLock")
    public boolean C;
    public RuntimeException D;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f29080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f29081b;
    public final ado c;
    public final Object d;
    public final pok<R> e;
    public final RequestCoordinator f;
    public final Context g;
    public final c h;
    public final Object i;
    public final Class<R> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final nb2<?> f29082k;
    public final int l;
    public final int m;
    public final Priority n;
    public final e0p<R> o;
    public final List<pok<R>> p;
    public final xzp<? super R> q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Executor f29083r;

    @GuardedBy("requestLock")
    public kqk<R> s;

    @GuardedBy("requestLock")
    public ob8.d t;

    @GuardedBy("requestLock")
    public long u;
    public volatile ob8 v;

    @GuardedBy("requestLock")
    public a w;

    @GuardedBy("requestLock")
    public Drawable x;

    @GuardedBy("requestLock")
    public Drawable y;

    @GuardedBy("requestLock")
    public Drawable z;

    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    public oem(Context context, c cVar, Object obj, Object obj2, Class<R> cls, nb2<?> nb2Var, int i, int i2, Priority priority, e0p<R> e0pVar, pok<R> pokVar, List<pok<R>> list, RequestCoordinator requestCoordinator, ob8 ob8Var, xzp<? super R> xzpVar, Executor executor) {
        this.f29081b = E ? String.valueOf(super.hashCode()) : null;
        this.c = ado.a();
        this.d = obj;
        this.g = context;
        this.h = cVar;
        this.i = obj2;
        this.j = cls;
        this.f29082k = nb2Var;
        this.l = i;
        this.m = i2;
        this.n = priority;
        this.o = e0pVar;
        this.e = pokVar;
        this.p = list;
        this.f = requestCoordinator;
        this.v = ob8Var;
        this.q = xzpVar;
        this.f29083r = executor;
        this.w = a.PENDING;
        if (this.D == null && cVar.g().a(b.c.class)) {
            this.D = new RuntimeException("Glide request origin trace");
        }
    }

    public static int u(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * i);
    }

    public static <R> oem<R> x(Context context, c cVar, Object obj, Object obj2, Class<R> cls, nb2<?> nb2Var, int i, int i2, Priority priority, e0p<R> e0pVar, pok<R> pokVar, List<pok<R>> list, RequestCoordinator requestCoordinator, ob8 ob8Var, xzp<? super R> xzpVar, Executor executor) {
        return new oem<>(context, cVar, obj, obj2, cls, nb2Var, i, i2, priority, e0pVar, pokVar, list, requestCoordinator, ob8Var, xzpVar, executor);
    }

    @GuardedBy("requestLock")
    public final void A() {
        if (k()) {
            Drawable drawableP = this.i == null ? p() : null;
            if (drawableP == null) {
                drawableP = o();
            }
            if (drawableP == null) {
                drawableP = q();
            }
            this.o.g(drawableP);
        }
    }

    @Override // defpackage.zmk
    public boolean a() {
        boolean z;
        synchronized (this.d) {
            z = this.w == a.COMPLETE;
        }
        return z;
    }

    @Override // defpackage.rqk
    public void b(GlideException glideException) {
        y(glideException, 5);
    }

    @Override // defpackage.zmk
    public void begin() {
        synchronized (this.d) {
            try {
                i();
                this.c.c();
                this.u = epe.b();
                Object obj = this.i;
                if (obj == null) {
                    if (ulq.u(this.l, this.m)) {
                        this.A = this.l;
                        this.B = this.m;
                    }
                    y(new GlideException("Received null model"), p() == null ? 5 : 3);
                    return;
                }
                a aVar = this.w;
                a aVar2 = a.RUNNING;
                if (aVar == aVar2) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    c(this.s, DataSource.MEMORY_CACHE, false);
                    return;
                }
                n(obj);
                this.f29080a = d0b.b("GlideRequest");
                a aVar3 = a.WAITING_FOR_SIZE;
                this.w = aVar3;
                if (ulq.u(this.l, this.m)) {
                    d(this.l, this.m);
                } else {
                    this.o.d(this);
                }
                a aVar4 = this.w;
                if ((aVar4 == aVar2 || aVar4 == aVar3) && k()) {
                    this.o.e(q());
                }
                if (E) {
                    t("finished run method in " + epe.a(this.u));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.rqk
    public void c(kqk<?> kqkVar, DataSource dataSource, boolean z) {
        this.c.c();
        kqk<?> kqkVar2 = null;
        try {
            synchronized (this.d) {
                try {
                    this.t = null;
                    if (kqkVar == null) {
                        b(new GlideException("Expected to receive a Resource<R> with an object of " + this.j + " inside, but instead got null."));
                        return;
                    }
                    Object obj = kqkVar.get();
                    try {
                        if (obj != null && this.j.isAssignableFrom(obj.getClass())) {
                            if (l()) {
                                z(kqkVar, obj, dataSource, z);
                                return;
                            }
                            this.s = null;
                            this.w = a.COMPLETE;
                            d0b.f("GlideRequest", this.f29080a);
                            this.v.l(kqkVar);
                            return;
                        }
                        this.s = null;
                        StringBuilder sb = new StringBuilder();
                        sb.append("Expected to receive an object of ");
                        sb.append(this.j);
                        sb.append(" but instead got ");
                        sb.append(obj != null ? obj.getClass() : "");
                        sb.append("{");
                        sb.append(obj);
                        sb.append("} inside Resource{");
                        sb.append(kqkVar);
                        sb.append("}.");
                        sb.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                        b(new GlideException(sb.toString()));
                        this.v.l(kqkVar);
                    } catch (Throwable th) {
                        kqkVar2 = kqkVar;
                        th = th;
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (Throwable th3) {
            if (kqkVar2 != null) {
                this.v.l(kqkVar2);
            }
            throw th3;
        }
    }

    @Override // defpackage.zmk
    public void clear() {
        synchronized (this.d) {
            try {
                i();
                this.c.c();
                a aVar = this.w;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                m();
                kqk<R> kqkVar = this.s;
                if (kqkVar != null) {
                    this.s = null;
                } else {
                    kqkVar = null;
                }
                if (j()) {
                    this.o.b(q());
                }
                d0b.f("GlideRequest", this.f29080a);
                this.w = aVar2;
                if (kqkVar != null) {
                    this.v.l(kqkVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.zem
    public void d(int i, int i2) throws Throwable {
        Object obj;
        this.c.c();
        Object obj2 = this.d;
        synchronized (obj2) {
            try {
                try {
                    boolean z = E;
                    if (z) {
                        t("Got onSizeReady in " + epe.a(this.u));
                    }
                    if (this.w == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        this.w = aVar;
                        float fX = this.f29082k.x();
                        this.A = u(i, fX);
                        this.B = u(i2, fX);
                        if (z) {
                            t("finished setup for calling load in " + epe.a(this.u));
                        }
                        obj = obj2;
                        try {
                            this.t = this.v.g(this.h, this.i, this.f29082k.w(), this.A, this.B, this.f29082k.v(), this.j, this.n, this.f29082k.h(), this.f29082k.z(), this.f29082k.L(), this.f29082k.H(), this.f29082k.p(), this.f29082k.F(), this.f29082k.B(), this.f29082k.A(), this.f29082k.n(), this, this.f29083r);
                            if (this.w != aVar) {
                                this.t = null;
                            }
                            if (z) {
                                t("finished onSizeReady in " + epe.a(this.u));
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                obj = obj2;
            }
        }
    }

    @Override // defpackage.zmk
    public boolean e() {
        boolean z;
        synchronized (this.d) {
            z = this.w == a.CLEARED;
        }
        return z;
    }

    @Override // defpackage.zmk
    public boolean f() {
        boolean z;
        synchronized (this.d) {
            z = this.w == a.COMPLETE;
        }
        return z;
    }

    @Override // defpackage.zmk
    public boolean g(zmk zmkVar) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        nb2<?> nb2Var;
        Priority priority;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        nb2<?> nb2Var2;
        Priority priority2;
        int size2;
        if (!(zmkVar instanceof oem)) {
            return false;
        }
        synchronized (this.d) {
            try {
                i = this.l;
                i2 = this.m;
                obj = this.i;
                cls = this.j;
                nb2Var = this.f29082k;
                priority = this.n;
                List<pok<R>> list = this.p;
                size = list != null ? list.size() : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
        oem oemVar = (oem) zmkVar;
        synchronized (oemVar.d) {
            try {
                i3 = oemVar.l;
                i4 = oemVar.m;
                obj2 = oemVar.i;
                cls2 = oemVar.j;
                nb2Var2 = oemVar.f29082k;
                priority2 = oemVar.n;
                List<pok<R>> list2 = oemVar.p;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i == i3 && i2 == i4 && ulq.d(obj, obj2) && cls.equals(cls2) && ulq.c(nb2Var, nb2Var2) && priority == priority2 && size == size2;
    }

    @Override // defpackage.rqk
    public Object h() {
        this.c.c();
        return this.d;
    }

    @GuardedBy("requestLock")
    public final void i() {
        if (this.C) {
            throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
        }
    }

    @Override // defpackage.zmk
    public boolean isRunning() {
        boolean z;
        synchronized (this.d) {
            try {
                a aVar = this.w;
                z = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @GuardedBy("requestLock")
    public final boolean j() {
        RequestCoordinator requestCoordinator = this.f;
        return requestCoordinator == null || requestCoordinator.h(this);
    }

    @GuardedBy("requestLock")
    public final boolean k() {
        RequestCoordinator requestCoordinator = this.f;
        return requestCoordinator == null || requestCoordinator.c(this);
    }

    @GuardedBy("requestLock")
    public final boolean l() {
        RequestCoordinator requestCoordinator = this.f;
        return requestCoordinator == null || requestCoordinator.d(this);
    }

    @GuardedBy("requestLock")
    public final void m() {
        i();
        this.c.c();
        this.o.c(this);
        ob8.d dVar = this.t;
        if (dVar != null) {
            dVar.a();
            this.t = null;
        }
    }

    public final void n(Object obj) {
        List<pok<R>> list = this.p;
        if (list == null) {
            return;
        }
        for (pok<R> pokVar : list) {
            if (pokVar instanceof fj8) {
                ((fj8) pokVar).c(obj);
            }
        }
    }

    @GuardedBy("requestLock")
    public final Drawable o() {
        if (this.x == null) {
            Drawable drawableJ = this.f29082k.j();
            this.x = drawableJ;
            if (drawableJ == null && this.f29082k.i() > 0) {
                this.x = s(this.f29082k.i());
            }
        }
        return this.x;
    }

    @GuardedBy("requestLock")
    public final Drawable p() {
        if (this.z == null) {
            Drawable drawableK = this.f29082k.k();
            this.z = drawableK;
            if (drawableK == null && this.f29082k.l() > 0) {
                this.z = s(this.f29082k.l());
            }
        }
        return this.z;
    }

    @Override // defpackage.zmk
    public void pause() {
        synchronized (this.d) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @GuardedBy("requestLock")
    public final Drawable q() {
        if (this.y == null) {
            Drawable drawableS = this.f29082k.s();
            this.y = drawableS;
            if (drawableS == null && this.f29082k.t() > 0) {
                this.y = s(this.f29082k.t());
            }
        }
        return this.y;
    }

    @GuardedBy("requestLock")
    public final boolean r() {
        RequestCoordinator requestCoordinator = this.f;
        return requestCoordinator == null || !requestCoordinator.getRoot().a();
    }

    @GuardedBy("requestLock")
    public final Drawable s(int i) {
        return l47.a(this.g, i, this.f29082k.y() != null ? this.f29082k.y() : this.g.getTheme());
    }

    public final void t(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.f29081b);
    }

    public String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.d) {
            obj = this.i;
            cls = this.j;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }

    @GuardedBy("requestLock")
    public final void v() {
        RequestCoordinator requestCoordinator = this.f;
        if (requestCoordinator != null) {
            requestCoordinator.i(this);
        }
    }

    @GuardedBy("requestLock")
    public final void w() {
        RequestCoordinator requestCoordinator = this.f;
        if (requestCoordinator != null) {
            requestCoordinator.b(this);
        }
    }

    public final void y(GlideException glideException, int i) {
        boolean zA;
        this.c.c();
        synchronized (this.d) {
            try {
                glideException.setOrigin(this.D);
                int iH = this.h.h();
                if (iH <= i) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Load failed for [");
                    sb.append(this.i);
                    sb.append("] with dimensions [");
                    sb.append(this.A);
                    sb.append("x");
                    sb.append(this.B);
                    sb.append("]");
                    if (iH <= 4) {
                        glideException.logRootCauses("Glide");
                    }
                }
                this.t = null;
                this.w = a.FAILED;
                v();
                boolean z = true;
                this.C = true;
                try {
                    List<pok<R>> list = this.p;
                    if (list != null) {
                        Iterator<pok<R>> it = list.iterator();
                        zA = false;
                        while (it.hasNext()) {
                            zA |= it.next().a(glideException, this.i, this.o, r());
                        }
                    } else {
                        zA = false;
                    }
                    pok<R> pokVar = this.e;
                    if (pokVar == null || !pokVar.a(glideException, this.i, this.o, r())) {
                        z = false;
                    }
                    if (!(zA | z)) {
                        A();
                    }
                    this.C = false;
                    d0b.f("GlideRequest", this.f29080a);
                } catch (Throwable th) {
                    this.C = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @GuardedBy("requestLock")
    public final void z(kqk<R> kqkVar, R r2, DataSource dataSource, boolean z) {
        boolean zD;
        boolean zR = r();
        this.w = a.COMPLETE;
        this.s = kqkVar;
        if (this.h.h() <= 3) {
            StringBuilder sb = new StringBuilder();
            sb.append("Finished loading ");
            sb.append(r2.getClass().getSimpleName());
            sb.append(" from ");
            sb.append(dataSource);
            sb.append(" for ");
            sb.append(this.i);
            sb.append(" with size [");
            sb.append(this.A);
            sb.append("x");
            sb.append(this.B);
            sb.append("] in ");
            sb.append(epe.a(this.u));
            sb.append(" ms");
        }
        w();
        boolean z2 = true;
        this.C = true;
        try {
            List<pok<R>> list = this.p;
            if (list != null) {
                zD = false;
                for (pok<R> pokVar : list) {
                    boolean zB = zD | pokVar.b(r2, this.i, this.o, dataSource, zR);
                    zD = pokVar instanceof fj8 ? ((fj8) pokVar).d(r2, this.i, this.o, dataSource, zR, z) | zB : zB;
                }
            } else {
                zD = false;
            }
            pok<R> pokVar2 = this.e;
            if (pokVar2 == null || !pokVar2.b(r2, this.i, this.o, dataSource, zR)) {
                z2 = false;
            }
            if (!(zD | z2)) {
                this.o.a(r2, this.q.a(dataSource, zR));
            }
            this.C = false;
            d0b.f("GlideRequest", this.f29080a);
        } catch (Throwable th) {
            this.C = false;
            throw th;
        }
    }
}
