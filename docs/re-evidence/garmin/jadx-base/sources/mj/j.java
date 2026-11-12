package mj;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import qj.m;
import wi.u;

/* JADX INFO: loaded from: classes7.dex */
public final class j<R> implements d, nj.g, i {
    public static final boolean B = Log.isLoggable("GlideRequest", 2);
    public final RuntimeException A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final rj.d.b f119041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f119042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g<R> f119043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f119044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Context f119045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.bumptech.glide.d f119046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Object f119047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Class<R> f119048h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final mj.a<?> f119049i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f119050j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f119051k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.bumptech.glide.g f119052l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final nj.h<R> f119053m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final List<g<R>> f119054n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final oj.b<? super R> f119055o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Executor f119056p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public u<R> f119057q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public wi.k.d f119058r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile wi.k f119059s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public a f119060t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Drawable f119061u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Drawable f119062v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Drawable f119063w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f119064x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f119065y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f119066z;

    public enum a {
        PENDING,
        RUNNING,
        WAITING_FOR_SIZE,
        COMPLETE,
        FAILED,
        CLEARED
    }

    private j(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class<R> cls, mj.a<?> aVar, int i14, int i15, com.bumptech.glide.g gVar, nj.h<R> hVar, g<R> gVar2, List<g<R>> list, e eVar, wi.k kVar, oj.b<? super R> bVar, Executor executor) {
        if (B) {
            String.valueOf(hashCode());
        }
        this.f119041a = new rj.d.b();
        this.f119042b = obj;
        this.f119045e = context;
        this.f119046f = dVar;
        this.f119047g = obj2;
        this.f119048h = cls;
        this.f119049i = aVar;
        this.f119050j = i14;
        this.f119051k = i15;
        this.f119052l = gVar;
        this.f119053m = hVar;
        this.f119043c = gVar2;
        this.f119054n = list;
        this.f119044d = eVar;
        this.f119059s = kVar;
        this.f119055o = bVar;
        this.f119056p = executor;
        this.f119060t = a.PENDING;
        if (this.A == null && dVar.f28484h.f28487a.containsKey(com.bumptech.glide.c.C0435c.class)) {
            this.A = new RuntimeException("Glide request origin trace");
        }
    }

    public static j h(Context context, com.bumptech.glide.d dVar, Object obj, Object obj2, Class cls, mj.a aVar, int i14, int i15, com.bumptech.glide.g gVar, nj.h hVar, g gVar2, ArrayList arrayList, e eVar, wi.k kVar, oj.b bVar, Executor executor) {
        return new j(context, dVar, obj, obj2, cls, aVar, i14, i15, gVar, hVar, gVar2, arrayList, eVar, kVar, bVar, executor);
    }

    @Override // mj.d
    public final boolean a() {
        boolean z14;
        synchronized (this.f119042b) {
            z14 = this.f119060t == a.COMPLETE;
        }
        return z14;
    }

    @Override // mj.d
    public final boolean b() {
        boolean z14;
        synchronized (this.f119042b) {
            z14 = this.f119060t == a.CLEARED;
        }
        return z14;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // nj.g
    public final void c(int i14, int i15) throws Throwable {
        Object obj;
        j<R> jVar = this;
        int iRound = i14;
        jVar.f119041a.a();
        Object obj2 = jVar.f119042b;
        synchronized (obj2) {
            try {
                try {
                    boolean z14 = B;
                    if (z14) {
                        int i16 = qj.h.f144972a;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (jVar.f119060t == a.WAITING_FOR_SIZE) {
                        a aVar = a.RUNNING;
                        jVar.f119060t = aVar;
                        float f14 = jVar.f119049i.f118995b;
                        if (iRound != Integer.MIN_VALUE) {
                            iRound = Math.round(iRound * f14);
                        }
                        jVar.f119064x = iRound;
                        jVar.f119065y = i15 == Integer.MIN_VALUE ? i15 : Math.round(f14 * i15);
                        if (z14) {
                            int i17 = qj.h.f144972a;
                            SystemClock.elapsedRealtimeNanos();
                        }
                        wi.k kVar = jVar.f119059s;
                        try {
                            com.bumptech.glide.d dVar = jVar.f119046f;
                            Object obj3 = jVar.f119047g;
                            mj.a<?> aVar2 = jVar.f119049i;
                            try {
                                ui.e eVar = aVar2.f119005l;
                                int i18 = jVar.f119064x;
                                try {
                                    int i19 = jVar.f119065y;
                                    Class<?> cls = aVar2.f119010q;
                                    try {
                                        Class<R> cls2 = jVar.f119048h;
                                        com.bumptech.glide.g gVar = jVar.f119052l;
                                        try {
                                            wi.j jVar2 = aVar2.f118996c;
                                            qj.b bVar = aVar2.f119009p;
                                            try {
                                                boolean z15 = aVar2.f119006m;
                                                boolean z16 = aVar2.f119014w;
                                                try {
                                                    ui.h hVar = aVar2.f119008o;
                                                    boolean z17 = aVar2.f119002i;
                                                    boolean z18 = aVar2.f119015x;
                                                    Executor executor = jVar.f119056p;
                                                    Object obj4 = obj2;
                                                    try {
                                                        jVar.f119058r = kVar.b(dVar, obj3, eVar, i18, i19, cls, cls2, gVar, jVar2, bVar, z15, z16, hVar, z17, z18, jVar, executor);
                                                        if (jVar.f119060t != aVar) {
                                                            jVar.f119058r = null;
                                                        }
                                                        if (z14) {
                                                            int i24 = qj.h.f144972a;
                                                            SystemClock.elapsedRealtimeNanos();
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        obj = obj4;
                                                        throw th;
                                                    }
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    obj = obj2;
                                                }
                                            } catch (Throwable th5) {
                                                th = th5;
                                                obj = obj2;
                                            }
                                        } catch (Throwable th6) {
                                            th = th6;
                                            obj = obj2;
                                        }
                                    } catch (Throwable th7) {
                                        th = th7;
                                        obj = obj2;
                                    }
                                } catch (Throwable th8) {
                                    th = th8;
                                    obj = obj2;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                obj = obj2;
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            obj = obj2;
                        }
                    }
                } catch (Throwable th11) {
                    th = th11;
                    obj = jVar;
                }
            } catch (Throwable th12) {
                th = th12;
                obj = obj2;
            }
        }
    }

    @Override // mj.d
    public final void clear() {
        synchronized (this.f119042b) {
            try {
                if (this.f119066z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f119041a.a();
                a aVar = this.f119060t;
                a aVar2 = a.CLEARED;
                if (aVar == aVar2) {
                    return;
                }
                e();
                u<R> uVar = this.f119057q;
                if (uVar != null) {
                    this.f119057q = null;
                } else {
                    uVar = null;
                }
                e eVar = this.f119044d;
                if (eVar == null || eVar.h(this)) {
                    this.f119053m.a(f());
                }
                this.f119060t = aVar2;
                if (uVar != null) {
                    this.f119059s.getClass();
                    wi.k.e(uVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // mj.d
    public final boolean d(d dVar) {
        int i14;
        int i15;
        Object obj;
        Class<R> cls;
        mj.a<?> aVar;
        com.bumptech.glide.g gVar;
        int size;
        int i16;
        int i17;
        Object obj2;
        Class<R> cls2;
        mj.a<?> aVar2;
        com.bumptech.glide.g gVar2;
        int size2;
        boolean zA;
        boolean zG;
        if (!(dVar instanceof j)) {
            return false;
        }
        synchronized (this.f119042b) {
            try {
                i14 = this.f119050j;
                i15 = this.f119051k;
                obj = this.f119047g;
                cls = this.f119048h;
                aVar = this.f119049i;
                gVar = this.f119052l;
                List<g<R>> list = this.f119054n;
                size = list != null ? list.size() : 0;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        j jVar = (j) dVar;
        synchronized (jVar.f119042b) {
            try {
                i16 = jVar.f119050j;
                i17 = jVar.f119051k;
                obj2 = jVar.f119047g;
                cls2 = jVar.f119048h;
                aVar2 = jVar.f119049i;
                gVar2 = jVar.f119052l;
                List<g<R>> list2 = jVar.f119054n;
                size2 = list2 != null ? list2.size() : 0;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (i14 != i16 || i15 != i17) {
            return false;
        }
        char[] cArr = m.f144982a;
        if (obj == null) {
            zA = obj2 == null;
        } else {
            zA = obj instanceof aj.m ? ((aj.m) obj).a() : obj.equals(obj2);
        }
        if (!zA || !cls.equals(cls2)) {
            return false;
        }
        if (aVar == null) {
            zG = aVar2 == null;
        } else {
            zG = aVar.g(aVar2);
        }
        return zG && gVar == gVar2 && size == size2;
    }

    public final void e() {
        if (this.f119066z) {
            vb.h.z("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            return;
        }
        this.f119041a.a();
        this.f119053m.e(this);
        wi.k.d dVar = this.f119058r;
        if (dVar != null) {
            synchronized (wi.k.this) {
                dVar.f185391a.h(dVar.f185392b);
            }
            this.f119058r = null;
        }
    }

    public final Drawable f() {
        int i14;
        if (this.f119062v == null) {
            mj.a<?> aVar = this.f119049i;
            Drawable drawable = aVar.f119000g;
            this.f119062v = drawable;
            if (drawable == null && (i14 = aVar.f119001h) > 0) {
                Resources.Theme theme = aVar.f119012t;
                Context context = this.f119045e;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.f119062v = fj.b.a(context, context, i14, theme);
            }
        }
        return this.f119062v;
    }

    @Override // mj.d
    public final void g() {
        synchronized (this.f119042b) {
            try {
                if (this.f119066z) {
                    throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
                }
                this.f119041a.a();
                int i14 = qj.h.f144972a;
                SystemClock.elapsedRealtimeNanos();
                if (this.f119047g == null) {
                    if (m.i(this.f119050j, this.f119051k)) {
                        this.f119064x = this.f119050j;
                        this.f119065y = this.f119051k;
                    }
                    if (this.f119063w == null) {
                        this.f119049i.getClass();
                        this.f119063w = null;
                    }
                    i(new GlideException("Received null model"), this.f119063w == null ? 5 : 3);
                    return;
                }
                a aVar = this.f119060t;
                if (aVar == a.RUNNING) {
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                if (aVar == a.COMPLETE) {
                    k(this.f119057q, ui.a.MEMORY_CACHE, false);
                    return;
                }
                List<g<R>> list = this.f119054n;
                if (list != null) {
                    for (g<R> gVar : list) {
                    }
                }
                a aVar2 = a.WAITING_FOR_SIZE;
                this.f119060t = aVar2;
                if (m.i(this.f119050j, this.f119051k)) {
                    c(this.f119050j, this.f119051k);
                } else {
                    this.f119053m.b(this);
                }
                a aVar3 = this.f119060t;
                if (aVar3 == a.RUNNING || aVar3 == aVar2) {
                    e eVar = this.f119044d;
                    if (eVar == null || eVar.e(this)) {
                        this.f119053m.h(f());
                    }
                }
                if (B) {
                    SystemClock.elapsedRealtimeNanos();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x007d  */
    public final void i(GlideException glideException, int i14) {
        boolean zD;
        boolean z14;
        int i15;
        this.f119041a.a();
        synchronized (this.f119042b) {
            try {
                glideException.setOrigin(this.A);
                int i16 = this.f119046f.f28485i;
                if (i16 <= i14) {
                    Objects.toString(this.f119047g);
                    if (i16 <= 4) {
                        glideException.logRootCauses("Glide");
                    }
                }
                Drawable drawableF = null;
                this.f119058r = null;
                this.f119060t = a.FAILED;
                e eVar = this.f119044d;
                if (eVar != null) {
                    eVar.i(this);
                }
                boolean z15 = true;
                this.f119066z = true;
                try {
                    List<g<R>> list = this.f119054n;
                    if (list != null) {
                        zD = false;
                        for (g<R> gVar : list) {
                            nj.h<R> hVar = this.f119053m;
                            e eVar2 = this.f119044d;
                            if (eVar2 != null) {
                                eVar2.getRoot().a();
                            }
                            zD |= gVar.d(glideException, hVar);
                        }
                    } else {
                        zD = false;
                    }
                    g<R> gVar2 = this.f119043c;
                    if (gVar2 != null) {
                        nj.h<R> hVar2 = this.f119053m;
                        e eVar3 = this.f119044d;
                        if (eVar3 != null) {
                            eVar3.getRoot().a();
                        }
                        if (gVar2.d(glideException, hVar2)) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                    } else {
                        z14 = false;
                    }
                    if (!(z14 | zD)) {
                        e eVar4 = this.f119044d;
                        if (eVar4 != null && !eVar4.e(this)) {
                            z15 = false;
                        }
                        if (z15) {
                            if (this.f119047g == null) {
                                if (this.f119063w == null) {
                                    this.f119049i.getClass();
                                    this.f119063w = null;
                                }
                                drawableF = this.f119063w;
                            }
                            if (drawableF == null) {
                                if (this.f119061u == null) {
                                    mj.a<?> aVar = this.f119049i;
                                    Drawable drawable = aVar.f118998e;
                                    this.f119061u = drawable;
                                    if (drawable == null && (i15 = aVar.f118999f) > 0) {
                                        Context context = this.f119045e;
                                        Resources.Theme theme = aVar.f119012t;
                                        if (theme == null) {
                                            theme = context.getTheme();
                                        }
                                        this.f119061u = fj.b.a(context, context, i15, theme);
                                    }
                                }
                                drawableF = this.f119061u;
                            }
                            if (drawableF == null) {
                                drawableF = f();
                            }
                            this.f119053m.c(drawableF);
                        }
                    }
                    this.f119066z = false;
                } catch (Throwable th3) {
                    this.f119066z = false;
                    throw th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // mj.d
    public final boolean isComplete() {
        boolean z14;
        synchronized (this.f119042b) {
            z14 = this.f119060t == a.COMPLETE;
        }
        return z14;
    }

    @Override // mj.d
    public final boolean isRunning() {
        boolean z14;
        synchronized (this.f119042b) {
            try {
                a aVar = this.f119060t;
                z14 = aVar == a.RUNNING || aVar == a.WAITING_FOR_SIZE;
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return z14;
    }

    public final void j(u<R> uVar, R r14, ui.a aVar, boolean z14) {
        boolean zA;
        e eVar = this.f119044d;
        if (eVar != null) {
            eVar.getRoot().a();
        }
        this.f119060t = a.COMPLETE;
        this.f119057q = uVar;
        int i14 = this.f119046f.f28485i;
        Object obj = this.f119047g;
        if (i14 <= 3) {
            Objects.toString(aVar);
            Objects.toString(obj);
            int i15 = qj.h.f144972a;
            SystemClock.elapsedRealtimeNanos();
        }
        if (eVar != null) {
            eVar.c(this);
        }
        this.f119066z = true;
        try {
            List<g<R>> list = this.f119054n;
            if (list != null) {
                zA = false;
                for (g<R> gVar : list) {
                    gVar.g(r14, obj, aVar);
                    if (gVar instanceof c) {
                        zA |= ((c) gVar).a();
                    }
                }
            } else {
                zA = false;
            }
            g<R> gVar2 = this.f119043c;
            if (gVar2 != null) {
                gVar2.g(r14, obj, aVar);
            }
            if (!zA) {
                ((oj.a.C2514a) this.f119055o).getClass();
                oj.a.C2514a c2514a = oj.a.f132271a;
                this.f119053m.f(r14);
            }
        } finally {
            this.f119066z = false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(u<?> uVar, ui.a aVar, boolean z14) {
        this.f119041a.a();
        u<?> uVar2 = null;
        try {
            synchronized (this.f119042b) {
                try {
                    this.f119058r = null;
                    if (uVar == null) {
                        i(new GlideException("Expected to receive a Resource<R> with an object of " + this.f119048h + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj = uVar.get();
                    try {
                        if (obj == null || !this.f119048h.isAssignableFrom(obj.getClass())) {
                            this.f119057q = null;
                            StringBuilder sb3 = new StringBuilder("Expected to receive an object of ");
                            sb3.append(this.f119048h);
                            sb3.append(" but instead got ");
                            sb3.append(obj != null ? obj.getClass() : "");
                            sb3.append("{");
                            sb3.append(obj);
                            sb3.append("} inside Resource{");
                            sb3.append(uVar);
                            sb3.append("}.");
                            sb3.append(obj != null ? "" : " To indicate failure return a null Resource object, rather than a Resource object containing null data.");
                            i(new GlideException(sb3.toString()), 5);
                        } else {
                            e eVar = this.f119044d;
                            if (eVar == null || eVar.f(this)) {
                                j(uVar, obj, aVar, z14);
                                return;
                            } else {
                                this.f119057q = null;
                                this.f119060t = a.COMPLETE;
                            }
                        }
                        this.f119059s.getClass();
                        wi.k.e(uVar);
                    } catch (Throwable th3) {
                        uVar2 = uVar;
                        th = th3;
                        throw th;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            if (uVar2 != null) {
                this.f119059s.getClass();
                wi.k.e(uVar2);
            }
            throw th5;
        }
    }

    @Override // mj.d
    public final void pause() {
        synchronized (this.f119042b) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.f119042b) {
            obj = this.f119047g;
            cls = this.f119048h;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
