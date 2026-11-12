package wi;

import android.os.SystemClock;
import android.util.Log;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes7.dex */
public class k implements m, p.a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final boolean f185368i = Log.isLoggable("Engine", 2);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f185369a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o f185370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yi.h f185371c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f185372d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f185373e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f185374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f185375g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wi.a f185376h;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final h.d f185377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final rj.a.c f185378b = rj.a.a(150, new C3439a());

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f185379c;

        /* JADX INFO: renamed from: wi.k$a$a, reason: collision with other inner class name */
        public class C3439a implements rj.a.b<h<?>> {
            public C3439a() {
            }

            @Override // rj.a.b
            public final h<?> b() {
                a aVar = a.this;
                return new h<>(aVar.f185377a, aVar.f185378b);
            }
        }

        public a(h.d dVar) {
            this.f185377a = dVar;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final zi.a f185381a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final zi.a f185382b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final zi.a f185383c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final zi.a f185384d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final m f185385e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final p.a f185386f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final rj.a.c f185387g = rj.a.a(150, new a());

        public class a implements rj.a.b<l<?>> {
            public a() {
            }

            @Override // rj.a.b
            public final l<?> b() {
                b bVar = b.this;
                return new l<>(bVar.f185381a, bVar.f185382b, bVar.f185383c, bVar.f185384d, bVar.f185385e, bVar.f185386f, bVar.f185387g);
            }
        }

        public b(zi.a aVar, zi.a aVar2, zi.a aVar3, zi.a aVar4, m mVar, p.a aVar5) {
            this.f185381a = aVar;
            this.f185382b = aVar2;
            this.f185383c = aVar3;
            this.f185384d = aVar4;
            this.f185385e = mVar;
            this.f185386f = aVar5;
        }
    }

    public static class c implements h.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final yi.a.InterfaceC3695a f185389a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile yi.a f185390b;

        public c(yi.a.InterfaceC3695a interfaceC3695a) {
            this.f185389a = interfaceC3695a;
        }

        public final yi.a a() {
            if (this.f185390b == null) {
                synchronized (this) {
                    try {
                        if (this.f185390b == null) {
                            yi.d dVar = (yi.d) this.f185389a;
                            File fileA = dVar.f197293b.a();
                            yi.e eVar = null;
                            if (fileA != null && (fileA.isDirectory() || fileA.mkdirs())) {
                                eVar = new yi.e(fileA, dVar.f197292a);
                            }
                            this.f185390b = eVar;
                        }
                        if (this.f185390b == null) {
                            this.f185390b = new yi.b();
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            return this.f185390b;
        }
    }

    public class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l<?> f185391a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final mj.i f185392b;

        public d(mj.i iVar, l<?> lVar) {
            this.f185392b = iVar;
            this.f185391a = lVar;
        }
    }

    public k(yi.h hVar, yi.a.InterfaceC3695a interfaceC3695a, zi.a aVar, zi.a aVar2, zi.a aVar3, zi.a aVar4, r rVar, o oVar, wi.a aVar5, b bVar, a aVar6, x xVar, boolean z14) {
        this.f185371c = hVar;
        c cVar = new c(interfaceC3695a);
        this.f185374f = cVar;
        wi.a aVar7 = aVar5 == null ? new wi.a(z14) : aVar5;
        this.f185376h = aVar7;
        synchronized (this) {
            synchronized (aVar7) {
                aVar7.f185275e = this;
            }
        }
        this.f185370b = oVar == null ? new o() : oVar;
        this.f185369a = rVar == null ? new r() : rVar;
        this.f185372d = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f185375g = aVar6 == null ? new a(cVar) : aVar6;
        this.f185373e = xVar == null ? new x() : xVar;
        ((yi.g) hVar).f197304d = this;
    }

    public static void e(u uVar) {
        if (uVar instanceof p) {
            ((p) uVar).d();
        } else {
            vb.h.s("Cannot release anything but an EngineResource");
        }
    }

    @Override // wi.p.a
    public final void a(ui.e eVar, p<?> pVar) {
        wi.a aVar = this.f185376h;
        synchronized (aVar) {
            wi.a.c cVar = (wi.a.c) aVar.f185273c.remove(eVar);
            if (cVar != null) {
                cVar.f185280c = null;
                cVar.clear();
            }
        }
        if (pVar.f185433a) {
            ((yi.g) this.f185371c).d(eVar, pVar);
        } else {
            this.f185373e.a(pVar, false);
        }
    }

    public final d b(com.bumptech.glide.d dVar, Object obj, ui.e eVar, int i14, int i15, Class cls, Class cls2, com.bumptech.glide.g gVar, j jVar, qj.b bVar, boolean z14, boolean z15, ui.h hVar, boolean z16, boolean z17, mj.j jVar2, Executor executor) {
        long jElapsedRealtimeNanos;
        if (f185368i) {
            int i16 = qj.h.f144972a;
            jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
        } else {
            jElapsedRealtimeNanos = 0;
        }
        this.f185370b.getClass();
        n nVar = new n(obj, eVar, i14, i15, bVar, cls, cls2, hVar);
        synchronized (this) {
            try {
                p<?> pVarC = c(nVar, z16, jElapsedRealtimeNanos);
                if (pVarC == null) {
                    return f(dVar, obj, eVar, i14, i15, cls, cls2, gVar, jVar, bVar, z14, z15, hVar, z16, z17, jVar2, executor, nVar, jElapsedRealtimeNanos);
                }
                jVar2.k(pVarC, ui.a.MEMORY_CACHE, false);
                return null;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0095 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final p<?> c(n nVar, boolean z14, long j8) throws Throwable {
        Throwable th3;
        p<?> pVar;
        Object obj;
        k kVar;
        n nVar2;
        p<?> pVar2;
        if (z14) {
            wi.a aVar = this.f185376h;
            synchronized (aVar) {
                try {
                    wi.a.c cVar = (wi.a.c) aVar.f185273c.get(nVar);
                    if (cVar == null) {
                        pVar = null;
                    } else {
                        pVar = cVar.get();
                        if (pVar == null) {
                            try {
                                aVar.b(cVar);
                            } catch (Throwable th4) {
                                th3 = th4;
                                while (true) {
                                    try {
                                        throw th3;
                                    } catch (Throwable th5) {
                                        th3 = th5;
                                    }
                                    th3 = th5;
                                }
                            }
                        }
                    }
                    if (pVar != null) {
                        pVar.c();
                    }
                    if (pVar != null) {
                        if (f185368i) {
                            int i14 = qj.h.f144972a;
                            SystemClock.elapsedRealtimeNanos();
                            Objects.toString(nVar);
                        }
                        return pVar;
                    }
                    yi.g gVar = (yi.g) this.f185371c;
                    synchronized (gVar) {
                        try {
                            qj.i.a aVar2 = (qj.i.a) gVar.f144973a.remove(nVar);
                            if (aVar2 == null) {
                                obj = null;
                            } else {
                                gVar.f144975c -= (long) aVar2.f144977b;
                                obj = aVar2.f144976a;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            while (true) {
                                throw th;
                            }
                        }
                    }
                    u uVar = (u) obj;
                    if (uVar == null) {
                        kVar = this;
                        nVar2 = nVar;
                        pVar2 = null;
                    } else if (uVar instanceof p) {
                        pVar2 = (p) uVar;
                        kVar = this;
                        nVar2 = nVar;
                    } else {
                        kVar = this;
                        nVar2 = nVar;
                        pVar2 = new p<>(uVar, true, true, nVar2, kVar);
                    }
                    if (pVar2 != null) {
                        pVar2.c();
                        kVar.f185376h.a(nVar2, pVar2);
                    }
                    if (pVar2 != null) {
                        if (f185368i) {
                            int i15 = qj.h.f144972a;
                            SystemClock.elapsedRealtimeNanos();
                            Objects.toString(nVar2);
                        }
                        return pVar2;
                    }
                } catch (Throwable th7) {
                    th3 = th7;
                }
            }
        }
        return null;
    }

    public final synchronized void d(l<?> lVar, ui.e eVar, p<?> pVar) {
        if (pVar != null) {
            try {
                if (pVar.f185433a) {
                    this.f185376h.a(eVar, pVar);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        r rVar = this.f185369a;
        rVar.getClass();
        lVar.getClass();
        HashMap map = rVar.f185440a;
        if (lVar.equals(map.get(eVar))) {
            map.remove(eVar);
        }
    }

    public final d f(com.bumptech.glide.d dVar, Object obj, ui.e eVar, int i14, int i15, Class cls, Class cls2, com.bumptech.glide.g gVar, j jVar, Map map, boolean z14, boolean z15, ui.h hVar, boolean z16, boolean z17, mj.j jVar2, Executor executor, n nVar, long j8) {
        Executor executor2;
        l lVar = (l) this.f185369a.f185440a.get(nVar);
        if (lVar != null) {
            lVar.a(jVar2, executor);
            if (f185368i) {
                int i16 = qj.h.f144972a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(nVar);
            }
            return new d(jVar2, lVar);
        }
        l lVar2 = (l) this.f185372d.f185387g.acquire();
        synchronized (lVar2) {
            lVar2.f185405k = nVar;
            lVar2.f185406l = z16;
            lVar2.f185407m = z17;
        }
        a aVar = this.f185375g;
        h<R> hVar2 = (h) aVar.f185378b.acquire();
        int i17 = aVar.f185379c;
        aVar.f185379c = i17 + 1;
        g<R> gVar2 = hVar2.f185313a;
        h.d dVar2 = hVar2.f185316d;
        gVar2.f185297c = dVar;
        gVar2.f185298d = obj;
        gVar2.f185308n = eVar;
        gVar2.f185299e = i14;
        gVar2.f185300f = i15;
        gVar2.f185310p = jVar;
        gVar2.f185301g = cls;
        gVar2.f185302h = dVar2;
        gVar2.f185305k = cls2;
        gVar2.f185309o = gVar;
        gVar2.f185303i = hVar;
        gVar2.f185304j = map;
        gVar2.f185311q = z14;
        gVar2.f185312r = z15;
        hVar2.f185320h = dVar;
        hVar2.f185321i = eVar;
        hVar2.f185322j = gVar;
        hVar2.f185323k = nVar;
        hVar2.f185324l = i14;
        hVar2.f185325m = i15;
        hVar2.f185326n = jVar;
        hVar2.f185327o = hVar;
        hVar2.f185328p = lVar2;
        hVar2.f185329q = i17;
        hVar2.f185331t = h.f.INITIALIZE;
        hVar2.f185332v = obj;
        hVar2.f185333w = dVar.f28484h;
        hVar2.f185334x = (Supplier) hVar.c(h.T);
        r rVar = this.f185369a;
        rVar.getClass();
        rVar.f185440a.put(nVar, lVar2);
        lVar2.a(jVar2, executor);
        synchronized (lVar2) {
            lVar2.f185414v = hVar2;
            h.g gVarI = hVar2.i(h.g.INITIALIZE);
            if (gVarI == h.g.RESOURCE_CACHE || gVarI == h.g.DATA_CACHE) {
                executor2 = lVar2.f185401g;
            } else {
                executor2 = lVar2.f185407m ? lVar2.f185403i : lVar2.f185402h;
            }
            executor2.execute(hVar2);
        }
        if (f185368i) {
            int i18 = qj.h.f144972a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(nVar);
        }
        return new d(jVar2, lVar2);
    }

    public k(yi.h hVar, yi.a.InterfaceC3695a interfaceC3695a, zi.a aVar, zi.a aVar2, zi.a aVar3, zi.a aVar4, boolean z14) {
        this(hVar, interfaceC3695a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z14);
    }
}
