package wi;

import com.bumptech.glide.load.engine.GlideException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes7.dex */
public class l<R> implements rj.a.d {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final c f185394y = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f185395a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rj.d.b f185396b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p.a f185397c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final k7.e<l<?>> f185398d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final c f185399e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final m f185400f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final zi.a f185401g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final zi.a f185402h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zi.a f185403i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final AtomicInteger f185404j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public n f185405k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f185406l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f185407m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public u<?> f185408n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public ui.a f185409o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f185410p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public GlideException f185411q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f185412r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public p<?> f185413t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public h<R> f185414v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public volatile boolean f185415w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f185416x;

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mj.i f185417a;

        public a(mj.i iVar) {
            this.f185417a = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            mj.j jVar = (mj.j) this.f185417a;
            jVar.f119041a.a();
            synchronized (jVar.f119042b) {
                synchronized (l.this) {
                    try {
                        if (l.this.f185395a.f185423a.contains(new d(this.f185417a, qj.e.f144969b))) {
                            l lVar = l.this;
                            mj.i iVar = this.f185417a;
                            lVar.getClass();
                            try {
                                ((mj.j) iVar).i(lVar.f185411q, 5);
                            } catch (Throwable th3) {
                                throw new wi.b(th3);
                            }
                        }
                        l.this.c();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mj.i f185419a;

        public b(mj.i iVar) {
            this.f185419a = iVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            mj.j jVar = (mj.j) this.f185419a;
            jVar.f119041a.a();
            synchronized (jVar.f119042b) {
                synchronized (l.this) {
                    try {
                        if (l.this.f185395a.f185423a.contains(new d(this.f185419a, qj.e.f144969b))) {
                            l.this.f185413t.c();
                            l lVar = l.this;
                            mj.i iVar = this.f185419a;
                            lVar.getClass();
                            try {
                                ((mj.j) iVar).k(lVar.f185413t, lVar.f185409o, lVar.f185416x);
                                l.this.h(this.f185419a);
                            } catch (Throwable th3) {
                                throw new wi.b(th3);
                            }
                        }
                        l.this.c();
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
        }
    }

    public static class c {
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final mj.i f185421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f185422b;

        public d(mj.i iVar, Executor executor) {
            this.f185421a = iVar;
            this.f185422b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.f185421a.equals(((d) obj).f185421a);
            }
            return false;
        }

        public final int hashCode() {
            return this.f185421a.hashCode();
        }
    }

    public l(zi.a aVar, zi.a aVar2, zi.a aVar3, zi.a aVar4, m mVar, p.a aVar5, k7.e<l<?>> eVar, c cVar) {
        this.f185395a = new e();
        this.f185396b = new rj.d.b();
        this.f185404j = new AtomicInteger();
        this.f185401g = aVar;
        this.f185402h = aVar2;
        this.f185403i = aVar4;
        this.f185400f = mVar;
        this.f185397c = aVar5;
        this.f185398d = eVar;
        this.f185399e = cVar;
    }

    public final synchronized void a(mj.j jVar, Executor executor) {
        try {
            this.f185396b.a();
            this.f185395a.f185423a.add(new d(jVar, executor));
            if (this.f185410p) {
                d(1);
                executor.execute(new b(jVar));
            } else if (this.f185412r) {
                d(1);
                executor.execute(new a(jVar));
            } else {
                qj.l.a(!this.f185415w, "Cannot add callbacks to a cancelled EngineJob");
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public final void b() {
        if (f()) {
            return;
        }
        this.f185415w = true;
        h<R> hVar = this.f185414v;
        hVar.I = true;
        f fVar = hVar.E;
        if (fVar != null) {
            fVar.cancel();
        }
        m mVar = this.f185400f;
        n nVar = this.f185405k;
        k kVar = (k) mVar;
        synchronized (kVar) {
            r rVar = kVar.f185369a;
            rVar.getClass();
            HashMap map = rVar.f185440a;
            if (equals(map.get(nVar))) {
                map.remove(nVar);
            }
        }
    }

    public final void c() {
        p<?> pVar;
        synchronized (this) {
            try {
                this.f185396b.a();
                qj.l.a(f(), "Not yet complete!");
                int iDecrementAndGet = this.f185404j.decrementAndGet();
                qj.l.a(iDecrementAndGet >= 0, "Can't decrement below 0");
                if (iDecrementAndGet == 0) {
                    pVar = this.f185413t;
                    g();
                } else {
                    pVar = null;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (pVar != null) {
            pVar.d();
        }
    }

    public final synchronized void d(int i14) {
        p<?> pVar;
        qj.l.a(f(), "Not yet complete!");
        if (this.f185404j.getAndAdd(i14) == 0 && (pVar = this.f185413t) != null) {
            pVar.c();
        }
    }

    @Override // rj.a.d
    public final rj.d.b e() {
        return this.f185396b;
    }

    public final boolean f() {
        return this.f185412r || this.f185410p || this.f185415w;
    }

    public final synchronized void g() {
        boolean zA;
        if (this.f185405k == null) {
            throw new IllegalArgumentException();
        }
        this.f185395a.f185423a.clear();
        this.f185405k = null;
        this.f185413t = null;
        this.f185408n = null;
        this.f185412r = false;
        this.f185415w = false;
        this.f185410p = false;
        this.f185416x = false;
        h<R> hVar = this.f185414v;
        h.e eVar = hVar.f185319g;
        synchronized (eVar) {
            eVar.f185345a = true;
            zA = eVar.a();
        }
        if (zA) {
            hVar.k();
        }
        this.f185414v = null;
        this.f185411q = null;
        this.f185409o = null;
        this.f185398d.a(this);
    }

    public final synchronized void h(mj.i iVar) {
        try {
            this.f185396b.a();
            this.f185395a.f185423a.remove(new d(iVar, qj.e.f144969b));
            if (this.f185395a.f185423a.isEmpty()) {
                b();
                if (this.f185410p || this.f185412r) {
                    if (this.f185404j.get() == 0) {
                        g();
                    }
                }
            }
        } catch (Throwable th3) {
            throw th3;
        }
    }

    public static final class e implements Iterable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List<d> f185423a;

        public e() {
            this(new ArrayList(2));
        }

        @Override // java.lang.Iterable
        public final Iterator<d> iterator() {
            return this.f185423a.iterator();
        }

        public e(List<d> list) {
            this.f185423a = list;
        }
    }

    public l(zi.a aVar, zi.a aVar2, zi.a aVar3, zi.a aVar4, m mVar, p.a aVar5, k7.e<l<?>> eVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, eVar, f185394y);
    }
}
