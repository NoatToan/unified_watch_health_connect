package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes2.dex */
public final class ofl {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final hfl f29110a = t5l.h(new h());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final hfl f29111b = t5l.e(new b());
    public static final hfl c = t5l.f(new c());
    public static final hfl d = nwp.f();
    public static final hfl e = t5l.g(new f());

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final hfl f29112a = new bb4();
    }

    public static final class b implements Callable<hfl> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public hfl call() throws Exception {
            return a.f29112a;
        }
    }

    public static final class c implements Callable<hfl> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public hfl call() throws Exception {
            return d.f29113a;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final hfl f29113a = new bid();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final hfl f29114a = new llg();
    }

    public static final class f implements Callable<hfl> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public hfl call() throws Exception {
            return e.f29114a;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final hfl f29115a = new qem();
    }

    public static final class h implements Callable<hfl> {
        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public hfl call() throws Exception {
            return g.f29115a;
        }
    }

    public static hfl a() {
        return t5l.o(f29111b);
    }

    public static hfl b(Executor executor) {
        return new zf8(executor, false);
    }

    public static hfl c() {
        return t5l.q(c);
    }

    public static hfl d() {
        return t5l.s(f29110a);
    }
}
