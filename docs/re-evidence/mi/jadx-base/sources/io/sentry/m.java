package io.sentry;

import defpackage.a5n;
import defpackage.ae8;
import defpackage.c8c;
import defpackage.cy6;
import defpackage.dm1;
import defpackage.idi;
import defpackage.lvo;
import defpackage.qyc;
import defpackage.tw3;
import defpackage.wzc;
import defpackage.xxc;
import io.sentry.protocol.Contexts;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
public final class m implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public SentryLevel f21738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public wzc f21739b;

    @Nullable
    public String c;

    @Nullable
    public io.sentry.protocol.y d;

    @Nullable
    public String e;

    @Nullable
    public io.sentry.protocol.k f;

    @NotNull
    public List<String> g;

    @NotNull
    public final Queue<io.sentry.a> h;

    @NotNull
    public Map<String, String> i;

    @NotNull
    public Map<String, Object> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    public List<ae8> f21740k;

    @NotNull
    public final SentryOptions l;

    @Nullable
    public volatile Session m;

    @NotNull
    public final Object n;

    @NotNull
    public final Object o;

    @NotNull
    public final Object p;

    @NotNull
    public Contexts q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    public List<dm1> f21741r;

    @NotNull
    public idi s;

    @NotNull
    public io.sentry.protocol.p t;

    @ApiStatus.Internal
    public interface a {
        void a(@NotNull idi idiVar);
    }

    public interface b {
        void a(@Nullable Session session);
    }

    @ApiStatus.Internal
    public interface c {
        void a(@Nullable wzc wzcVar);
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        public final Session f21742a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        public final Session f21743b;

        public d(@NotNull Session session, @Nullable Session session2) {
            this.f21743b = session;
            this.f21742a = session2;
        }

        @NotNull
        public Session a() {
            return this.f21743b;
        }

        @Nullable
        public Session b() {
            return this.f21742a;
        }
    }

    public m(@NotNull SentryOptions sentryOptions) {
        this.g = new ArrayList();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.f21740k = new CopyOnWriteArrayList();
        this.n = new Object();
        this.o = new Object();
        this.p = new Object();
        this.q = new Contexts();
        this.f21741r = new CopyOnWriteArrayList();
        this.t = io.sentry.protocol.p.f21803b;
        SentryOptions sentryOptions2 = (SentryOptions) io.sentry.util.p.c(sentryOptions, "SentryOptions is required.");
        this.l = sentryOptions2;
        this.h = B(sentryOptions2.getMaxBreadcrumbs());
        this.s = new idi();
    }

    public void A() {
        this.h.clear();
        Iterator<xxc> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().d(this.h);
        }
    }

    @NotNull
    public final Queue<io.sentry.a> B(int i) {
        return i > 0 ? lvo.g(new tw3(i)) : lvo.g(new cy6());
    }

    @Nullable
    public final io.sentry.a C(@NotNull SentryOptions.a aVar, @NotNull io.sentry.a aVar2, @NotNull c8c c8cVar) {
        try {
            return aVar.a(aVar2, c8cVar);
        } catch (Throwable th) {
            this.l.getLogger().a(SentryLevel.ERROR, "The BeforeBreadcrumbCallback callback threw an exception. Exception details will be added to the breadcrumb.", th);
            if (th.getMessage() == null) {
                return aVar2;
            }
            aVar2.n("sentry:message", th.getMessage());
            return aVar2;
        }
    }

    @Override // io.sentry.e
    public void a(@NotNull String str, @NotNull String str2) {
        this.i.put(str, str2);
        for (xxc xxcVar : this.l.getScopeObservers()) {
            xxcVar.a(str, str2);
            xxcVar.b(this.i);
        }
    }

    @Override // io.sentry.e
    @ApiStatus.Internal
    @NotNull
    public Queue<io.sentry.a> b() {
        return this.h;
    }

    @Override // io.sentry.e
    public void c(@NotNull io.sentry.protocol.p pVar) {
        this.t = pVar;
        Iterator<xxc> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().c(pVar);
        }
    }

    @Override // io.sentry.e
    public void clear() {
        this.f21738a = null;
        this.d = null;
        this.f = null;
        this.e = null;
        this.g.clear();
        A();
        this.i.clear();
        this.j.clear();
        this.f21740k.clear();
        h();
        z();
    }

    @Override // io.sentry.e
    @ApiStatus.Internal
    @Nullable
    public Session d(@NotNull b bVar) {
        Session sessionClone;
        synchronized (this.n) {
            try {
                bVar.a(this.m);
                sessionClone = this.m != null ? this.m.clone() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        return sessionClone;
    }

    @Override // io.sentry.e
    @ApiStatus.Internal
    @NotNull
    public Map<String, String> e() {
        return io.sentry.util.b.c(this.i);
    }

    @Override // io.sentry.e
    @NotNull
    public Contexts f() {
        return this.q;
    }

    @Override // io.sentry.e
    @Nullable
    public io.sentry.protocol.y g() {
        return this.d;
    }

    @Override // io.sentry.e
    @ApiStatus.Internal
    @NotNull
    public Map<String, Object> getExtras() {
        return this.j;
    }

    @Override // io.sentry.e
    @Nullable
    public SentryLevel getLevel() {
        return this.f21738a;
    }

    @Override // io.sentry.e
    @Nullable
    public io.sentry.protocol.k getRequest() {
        return this.f;
    }

    @Override // io.sentry.e
    @Nullable
    public qyc getSpan() {
        a5n a5nVarP;
        wzc wzcVar = this.f21739b;
        return (wzcVar == null || (a5nVarP = wzcVar.p()) == null) ? wzcVar : a5nVarP;
    }

    @Override // io.sentry.e
    public void h() {
        synchronized (this.o) {
            this.f21739b = null;
        }
        this.c = null;
        for (xxc xxcVar : this.l.getScopeObservers()) {
            xxcVar.g(null);
            xxcVar.f(null, this);
        }
    }

    @Override // io.sentry.e
    @ApiStatus.Internal
    @Nullable
    public Session i() {
        return this.m;
    }

    @Override // io.sentry.e
    @Nullable
    public wzc j() {
        return this.f21739b;
    }

    @Override // io.sentry.e
    @ApiStatus.Internal
    @Nullable
    public d k() {
        d dVar;
        synchronized (this.n) {
            try {
                if (this.m != null) {
                    this.m.c();
                }
                Session session = this.m;
                dVar = null;
                if (this.l.getRelease() != null) {
                    this.m = new Session(this.l.getDistinctId(), this.d, this.l.getEnvironment(), this.l.getRelease());
                    dVar = new d(this.m.clone(), session != null ? session.clone() : null);
                } else {
                    this.l.getLogger().c(SentryLevel.WARNING, "Release is not set on SentryOptions. Session could not be started", new Object[0]);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return dVar;
    }

    @Override // io.sentry.e
    @NotNull
    public io.sentry.protocol.p l() {
        return this.t;
    }

    @Override // io.sentry.e
    @ApiStatus.Internal
    public void m(@Nullable String str) {
        this.e = str;
        Contexts contextsF = f();
        io.sentry.protocol.a app = contextsF.getApp();
        if (app == null) {
            app = new io.sentry.protocol.a();
            contextsF.setApp(app);
        }
        if (str == null) {
            app.u(null);
        } else {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(str);
            app.u(arrayList);
        }
        Iterator<xxc> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().e(contextsF);
        }
    }

    @Override // io.sentry.e
    @ApiStatus.Internal
    @Nullable
    public Session n() {
        Session session;
        synchronized (this.n) {
            try {
                session = null;
                if (this.m != null) {
                    this.m.c();
                    Session sessionClone = this.m.clone();
                    this.m = null;
                    session = sessionClone;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return session;
    }

    @Override // io.sentry.e
    public void o(@NotNull io.sentry.a aVar, @Nullable c8c c8cVar) {
        if (aVar == null) {
            return;
        }
        if (c8cVar == null) {
            c8cVar = new c8c();
        }
        SentryOptions.a beforeBreadcrumb = this.l.getBeforeBreadcrumb();
        if (beforeBreadcrumb != null) {
            aVar = C(beforeBreadcrumb, aVar, c8cVar);
        }
        if (aVar == null) {
            this.l.getLogger().c(SentryLevel.INFO, "Breadcrumb was dropped by beforeBreadcrumb", new Object[0]);
            return;
        }
        this.h.add(aVar);
        for (xxc xxcVar : this.l.getScopeObservers()) {
            xxcVar.m(aVar);
            xxcVar.d(this.h);
        }
    }

    @Override // io.sentry.e
    public void p(@Nullable wzc wzcVar) {
        synchronized (this.o) {
            try {
                this.f21739b = wzcVar;
                for (xxc xxcVar : this.l.getScopeObservers()) {
                    if (wzcVar != null) {
                        xxcVar.g(wzcVar.getName());
                        xxcVar.f(wzcVar.d(), this);
                    } else {
                        xxcVar.g(null);
                        xxcVar.f(null, this);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // io.sentry.e
    @ApiStatus.Internal
    @NotNull
    public List<ae8> q() {
        return this.f21740k;
    }

    @Override // io.sentry.e
    @ApiStatus.Internal
    @Nullable
    public String r() {
        return this.e;
    }

    @Override // io.sentry.e
    @ApiStatus.Internal
    @NotNull
    public List<String> s() {
        return this.g;
    }

    @Override // io.sentry.e
    @Nullable
    public String t() {
        wzc wzcVar = this.f21739b;
        return wzcVar != null ? wzcVar.getName() : this.c;
    }

    @Override // io.sentry.e
    @ApiStatus.Internal
    public void u(@NotNull idi idiVar) {
        this.s = idiVar;
        v vVarH = idiVar.h();
        Iterator<xxc> it = this.l.getScopeObservers().iterator();
        while (it.hasNext()) {
            it.next().f(vVarH, this);
        }
    }

    @Override // io.sentry.e
    @ApiStatus.Internal
    @NotNull
    public idi v() {
        return this.s;
    }

    @Override // io.sentry.e
    @ApiStatus.Internal
    @NotNull
    public List<dm1> w() {
        return new CopyOnWriteArrayList(this.f21741r);
    }

    @Override // io.sentry.e
    @ApiStatus.Internal
    @NotNull
    public idi x(@NotNull a aVar) {
        idi idiVar;
        synchronized (this.p) {
            aVar.a(this.s);
            idiVar = new idi(this.s);
        }
        return idiVar;
    }

    @Override // io.sentry.e
    @ApiStatus.Internal
    public void y(@NotNull c cVar) {
        synchronized (this.o) {
            cVar.a(this.f21739b);
        }
    }

    public void z() {
        this.f21741r.clear();
    }

    @Override // io.sentry.e
    @NotNull
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public e m881clone() {
        return new m(this);
    }

    public m(@NotNull m mVar) {
        this.g = new ArrayList();
        this.i = new ConcurrentHashMap();
        this.j = new ConcurrentHashMap();
        this.f21740k = new CopyOnWriteArrayList();
        this.n = new Object();
        this.o = new Object();
        this.p = new Object();
        this.q = new Contexts();
        this.f21741r = new CopyOnWriteArrayList();
        this.t = io.sentry.protocol.p.f21803b;
        this.f21739b = mVar.f21739b;
        this.c = mVar.c;
        this.m = mVar.m;
        this.l = mVar.l;
        this.f21738a = mVar.f21738a;
        io.sentry.protocol.y yVar = mVar.d;
        this.d = yVar != null ? new io.sentry.protocol.y(yVar) : null;
        this.e = mVar.e;
        this.t = mVar.t;
        io.sentry.protocol.k kVar = mVar.f;
        this.f = kVar != null ? new io.sentry.protocol.k(kVar) : null;
        this.g = new ArrayList(mVar.g);
        this.f21740k = new CopyOnWriteArrayList(mVar.f21740k);
        io.sentry.a[] aVarArr = (io.sentry.a[]) mVar.h.toArray(new io.sentry.a[0]);
        Queue<io.sentry.a> queueB = B(mVar.l.getMaxBreadcrumbs());
        for (io.sentry.a aVar : aVarArr) {
            queueB.add(new io.sentry.a(aVar));
        }
        this.h = queueB;
        Map<String, String> map = mVar.i;
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry != null) {
                concurrentHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        this.i = concurrentHashMap;
        Map<String, Object> map2 = mVar.j;
        ConcurrentHashMap concurrentHashMap2 = new ConcurrentHashMap();
        for (Map.Entry<String, Object> entry2 : map2.entrySet()) {
            if (entry2 != null) {
                concurrentHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        this.j = concurrentHashMap2;
        this.q = new Contexts(mVar.q);
        this.f21741r = new CopyOnWriteArrayList(mVar.f21741r);
        this.s = new idi(mVar.s);
    }
}
