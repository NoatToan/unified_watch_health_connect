package defpackage;

/* JADX INFO: loaded from: classes4.dex */
public class cm8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static eqe f5479a = dm8.f();

    public static void A(Class<?> cls, String str, Object... objArr) {
        if (f5479a.c(5)) {
            f5479a.w(m(cls), l(str, objArr));
        }
    }

    public static void B(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (o(5)) {
            z(cls, l(str, objArr), th);
        }
    }

    public static void C(String str, String str2) {
        if (f5479a.c(5)) {
            f5479a.w(str, str2);
        }
    }

    public static void D(String str, String str2, Throwable th) {
        if (f5479a.c(5)) {
            f5479a.w(str, str2, th);
        }
    }

    public static void E(String str, String str2, Object... objArr) {
        if (f5479a.c(5)) {
            f5479a.w(str, l(str2, objArr));
        }
    }

    public static void F(String str, Throwable th, String str2, Object... objArr) {
        if (f5479a.c(5)) {
            f5479a.w(str, l(str2, objArr), th);
        }
    }

    public static void G(Class<?> cls, String str, Throwable th) {
        if (f5479a.c(6)) {
            f5479a.b(m(cls), str, th);
        }
    }

    public static void H(String str, String str2, Throwable th) {
        if (f5479a.c(6)) {
            f5479a.b(str, str2, th);
        }
    }

    public static void I(String str, String str2, Object... objArr) {
        if (f5479a.c(6)) {
            f5479a.a(str, l(str2, objArr));
        }
    }

    public static void a(Class<?> cls, String str, Object obj) {
        if (f5479a.c(3)) {
            f5479a.d(m(cls), l(str, obj));
        }
    }

    public static void b(String str, String str2) {
        if (f5479a.c(3)) {
            f5479a.d(str, str2);
        }
    }

    public static void c(String str, String str2, Object obj) {
        if (f5479a.c(3)) {
            f5479a.d(str, l(str2, obj));
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (f5479a.c(3)) {
            f5479a.d(str, str2, th);
        }
    }

    public static void e(Class<?> cls, String str) {
        if (f5479a.c(6)) {
            f5479a.e(m(cls), str);
        }
    }

    public static void f(Class<?> cls, String str, Throwable th) {
        if (f5479a.c(6)) {
            f5479a.e(m(cls), str, th);
        }
    }

    public static void g(Class<?> cls, String str, Object... objArr) {
        if (f5479a.c(6)) {
            f5479a.e(m(cls), l(str, objArr));
        }
    }

    public static void h(Class<?> cls, Throwable th, String str, Object... objArr) {
        if (f5479a.c(6)) {
            f5479a.e(m(cls), l(str, objArr), th);
        }
    }

    public static void i(String str, String str2) {
        if (f5479a.c(6)) {
            f5479a.e(str, str2);
        }
    }

    public static void j(String str, String str2, Throwable th) {
        if (f5479a.c(6)) {
            f5479a.e(str, str2, th);
        }
    }

    public static void k(String str, String str2, Object... objArr) {
        if (f5479a.c(6)) {
            f5479a.e(str, l(str2, objArr));
        }
    }

    public static String l(String str, Object... objArr) {
        return String.format(null, str, objArr);
    }

    public static String m(Class<?> cls) {
        return cls.getSimpleName();
    }

    public static void n(String str, String str2) {
        if (f5479a.c(4)) {
            f5479a.i(str, str2);
        }
    }

    public static boolean o(int i) {
        return f5479a.c(i);
    }

    public static void p(eqe eqeVar) {
        if (eqeVar == null) {
            throw new IllegalArgumentException();
        }
        f5479a = eqeVar;
    }

    public static void q(Class<?> cls, String str) {
        if (f5479a.c(2)) {
            f5479a.v(m(cls), str);
        }
    }

    public static void r(Class<?> cls, String str, Object obj) {
        if (f5479a.c(2)) {
            f5479a.v(m(cls), l(str, obj));
        }
    }

    public static void s(Class<?> cls, String str, Object obj, Object obj2) {
        if (f5479a.c(2)) {
            f5479a.v(m(cls), l(str, obj, obj2));
        }
    }

    public static void t(Class<?> cls, String str, Object obj, Object obj2, Object obj3) {
        if (o(2)) {
            q(cls, l(str, obj, obj2, obj3));
        }
    }

    public static void u(Class<?> cls, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (f5479a.c(2)) {
            f5479a.v(m(cls), l(str, obj, obj2, obj3, obj4));
        }
    }

    public static void v(Class<?> cls, String str, Object... objArr) {
        if (f5479a.c(2)) {
            f5479a.v(m(cls), l(str, objArr));
        }
    }

    public static void w(String str, String str2) {
        if (f5479a.c(2)) {
            f5479a.v(str, str2);
        }
    }

    public static void x(String str, String str2, Object... objArr) {
        if (f5479a.c(2)) {
            f5479a.v(str, l(str2, objArr));
        }
    }

    public static void y(Class<?> cls, String str) {
        if (f5479a.c(5)) {
            f5479a.w(m(cls), str);
        }
    }

    public static void z(Class<?> cls, String str, Throwable th) {
        if (f5479a.c(5)) {
            f5479a.w(m(cls), str, th);
        }
    }
}
