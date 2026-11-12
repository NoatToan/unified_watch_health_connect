package defpackage;

import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes3.dex */
public final class p5l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static volatile tc0<Throwable> f30027a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile zta<p4h.a, p4h.a> f30028b;
    public static volatile zta<xdm.a, xdm.a> c;
    public static volatile zta<aa4.c, aa4.c> d;
    public static volatile aua<p4h, p4h.a, p4h.a> e;
    public static volatile aua<xdm, xdm.a, xdm.a> f;
    public static volatile aua<aa4, aa4.c, aa4.c> g;
    public static volatile zta<ifl, ifl> h;
    public static volatile zta<sc0, sc0> i;
    public static volatile zta<koo, koo> j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static volatile zta<koo, koo> f30029k;
    public static volatile yta<? extends ScheduledExecutorService> l;
    public static volatile zta<Throwable, Throwable> m;
    public static volatile zta<Throwable, Throwable> n;
    public static volatile zta<Throwable, Throwable> o;
    public static volatile zta<p4h.b, p4h.b> p;
    public static volatile zta<p4h.b, p4h.b> q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static volatile zta<aa4.d, aa4.d> f30030r;

    public static class a implements zta<Throwable, Throwable> {
        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable call(Throwable th) {
            return s5l.c().g().c(th);
        }
    }

    public static class b implements zta<p4h.b, p4h.b> {
        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p4h.b call(p4h.b bVar) {
            return s5l.c().g().b(bVar);
        }
    }

    public static class c implements zta<Throwable, Throwable> {
        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable call(Throwable th) {
            return s5l.c().a().c(th);
        }
    }

    public static class d implements zta<aa4.d, aa4.d> {
        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public aa4.d call(aa4.d dVar) {
            return s5l.c().a().b(dVar);
        }
    }

    public static class e implements zta<p4h.a, p4h.a> {
        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p4h.a call(p4h.a aVar) {
            return s5l.c().d().a(aVar);
        }
    }

    public static class f implements zta<xdm.a, xdm.a> {
        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public xdm.a call(xdm.a aVar) {
            return s5l.c().g().a(aVar);
        }
    }

    public static class g implements zta<aa4.c, aa4.c> {
        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public aa4.c call(aa4.c cVar) {
            return s5l.c().a().a(cVar);
        }
    }

    public static class h implements tc0<Throwable> {
        @Override // defpackage.tc0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable th) {
            s5l.c().b().a(th);
        }
    }

    public static class i implements aua<p4h, p4h.a, p4h.a> {
        @Override // defpackage.aua
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p4h.a a(p4h p4hVar, p4h.a aVar) {
            return s5l.c().d().e(p4hVar, aVar);
        }
    }

    public static class j implements zta<koo, koo> {
        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public koo call(koo kooVar) {
            return s5l.c().d().d(kooVar);
        }
    }

    public static class k implements aua<xdm, xdm.a, xdm.a> {
        @Override // defpackage.aua
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public xdm.a a(xdm xdmVar, xdm.a aVar) {
            v5l v5lVarG = s5l.c().g();
            return v5lVarG == w5l.f() ? aVar : new gem(v5lVarG.e(xdmVar, new uem(aVar)));
        }
    }

    public static class l implements zta<koo, koo> {
        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public koo call(koo kooVar) {
            return s5l.c().g().d(kooVar);
        }
    }

    public static class m implements aua<aa4, aa4.c, aa4.c> {
        @Override // defpackage.aua
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public aa4.c a(aa4 aa4Var, aa4.c cVar) {
            return s5l.c().a().d(aa4Var, cVar);
        }
    }

    public static class n implements zta<sc0, sc0> {
        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public sc0 call(sc0 sc0Var) {
            return s5l.c().f().k(sc0Var);
        }
    }

    public static class o implements zta<Throwable, Throwable> {
        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Throwable call(Throwable th) {
            return s5l.c().d().c(th);
        }
    }

    public static class p implements zta<p4h.b, p4h.b> {
        @Override // defpackage.zta
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public p4h.b call(p4h.b bVar) {
            return s5l.c().d().b(bVar);
        }
    }

    static {
        b();
    }

    public static yta<? extends ScheduledExecutorService> a() {
        return l;
    }

    public static void b() {
        f30027a = new h();
        e = new i();
        j = new j();
        f = new k();
        f30029k = new l();
        g = new m();
        i = new n();
        m = new o();
        p = new p();
        n = new a();
        q = new b();
        o = new c();
        f30030r = new d();
        c();
    }

    public static void c() {
        f30028b = new e();
        c = new f();
        d = new g();
    }

    public static aa4.c d(aa4.c cVar) {
        zta<aa4.c, aa4.c> ztaVar = d;
        return ztaVar != null ? ztaVar.call(cVar) : cVar;
    }

    public static <T> p4h.a<T> e(p4h.a<T> aVar) {
        zta<p4h.a, p4h.a> ztaVar = f30028b;
        return ztaVar != null ? ztaVar.call(aVar) : aVar;
    }

    public static void f(Throwable th) {
        tc0<Throwable> tc0Var = f30027a;
        if (tc0Var != null) {
            try {
                tc0Var.call(th);
                return;
            } catch (Throwable th2) {
                System.err.println("The onError handler threw an Exception. It shouldn't. => " + th2.getMessage());
                th2.printStackTrace();
                m(th2);
            }
        }
        m(th);
    }

    public static ifl g(ifl iflVar) {
        zta<ifl, ifl> ztaVar = h;
        return ztaVar != null ? ztaVar.call(iflVar) : iflVar;
    }

    public static Throwable h(Throwable th) {
        zta<Throwable, Throwable> ztaVar = m;
        return ztaVar != null ? ztaVar.call(th) : th;
    }

    public static <T, R> p4h.b<R, T> i(p4h.b<R, T> bVar) {
        zta<p4h.b, p4h.b> ztaVar = p;
        return ztaVar != null ? ztaVar.call(bVar) : bVar;
    }

    public static koo j(koo kooVar) {
        zta<koo, koo> ztaVar = j;
        return ztaVar != null ? ztaVar.call(kooVar) : kooVar;
    }

    public static <T> p4h.a<T> k(p4h<T> p4hVar, p4h.a<T> aVar) {
        aua<p4h, p4h.a, p4h.a> auaVar = e;
        return auaVar != null ? auaVar.a(p4hVar, aVar) : aVar;
    }

    public static sc0 l(sc0 sc0Var) {
        zta<sc0, sc0> ztaVar = i;
        return ztaVar != null ? ztaVar.call(sc0Var) : sc0Var;
    }

    public static void m(Throwable th) {
        Thread threadCurrentThread = Thread.currentThread();
        threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th);
    }
}
