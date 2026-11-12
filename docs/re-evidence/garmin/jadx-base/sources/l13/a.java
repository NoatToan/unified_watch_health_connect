package l13;

import g13.j;
import g13.k;
import java.util.concurrent.Callable;
import q03.q;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q f108326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final q f108327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final q f108328c;

    /* JADX INFO: renamed from: l13.a$a, reason: collision with other inner class name */
    public static final class C2082a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g13.b f108329a = new g13.b();
    }

    public static final class b implements Callable<q> {
        @Override // java.util.concurrent.Callable
        public final q call() {
            return C2082a.f108329a;
        }
    }

    public static final class c implements Callable<q> {
        @Override // java.util.concurrent.Callable
        public final q call() {
            return d.f108330a;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g13.c f108330a = new g13.c();
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g13.d f108331a = new g13.d();
    }

    public static final class f implements Callable<q> {
        @Override // java.util.concurrent.Callable
        public final q call() {
            return e.f108331a;
        }
    }

    public static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f108332a = new j();
    }

    public static final class h implements Callable<q> {
        @Override // java.util.concurrent.Callable
        public final q call() {
            return g.f108332a;
        }
    }

    static {
        h hVar = new h();
        int i14 = w03.b.f181178a;
        k13.a.a(hVar);
        f108326a = k13.a.a(new b());
        f108327b = k13.a.a(new c());
        int i15 = k.f74998b;
        f108328c = k13.a.a(new f());
    }

    private a() {
        throw new IllegalStateException("No instances!");
    }
}
