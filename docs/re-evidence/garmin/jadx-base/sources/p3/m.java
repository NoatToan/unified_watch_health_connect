package p3;

import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f135153a = a.f135154a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp3/m$a;", "", "<init>", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f135154a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C2565a f135155b = new C2565a();

        /* JADX INFO: renamed from: p3.m$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"p3/m$a$a", "", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class C2565a {
            public final String toString() {
                return "Empty";
            }
        }

        private a() {
        }

        public static C2565a a() {
            return f135155b;
        }
    }

    <T> T A(t<T> tVar);

    boolean B(Object obj);

    void C(int i14);

    /* JADX INFO: renamed from: D */
    boolean getT();

    o0 E(int i14);

    c<?> F();

    Object G(Object obj, Object obj2);

    void H();

    /* JADX INFO: renamed from: I */
    t13.g getS();

    void J(e23.a<Unit> aVar);

    void K(Object obj);

    void L(int i14);

    <T> void M(e23.a<? extends T> aVar);

    void N(int i14, Object obj);

    void O();

    default int P() {
        return Long.hashCode(getU());
    }

    void Q();

    void R();

    int a();

    void apply(e23.p pVar, Object obj);

    boolean b();

    void c();

    void d(Object obj);

    void e();

    void f();

    o0.b g();

    default boolean h(boolean z14) {
        return h(z14);
    }

    default boolean i(float f14) {
        return i(f14);
    }

    void j();

    default boolean k(int i14) {
        return k(i14);
    }

    default boolean l(long j8) {
        return l(j8);
    }

    default boolean m(double d14) {
        return m(d14);
    }

    boolean n(int i14, boolean z14);

    p2 o();

    void p();

    Object q();

    default boolean r(Object obj) {
        return B(obj);
    }

    void s(h1<?> h1Var, Object obj);

    void t(o2 o2Var);

    void u(boolean z14);

    /* JADX INFO: renamed from: v */
    long getU();

    void w(int i14);

    i2 x();

    void y();

    void z();
}
