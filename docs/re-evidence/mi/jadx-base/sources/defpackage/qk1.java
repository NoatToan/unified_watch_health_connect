package defpackage;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes.dex */
public class qk1 {
    public static void f(boolean z, final String str, final Object... objArr) throws Throwable {
        g(z, new Supplier() { // from class: kk1
            @Override // java.util.function.Supplier
            public final Object get() {
                return qk1.j(str, objArr);
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public static <X extends Throwable> void g(boolean z, Supplier<X> supplier) throws Throwable {
        if (z) {
            throw supplier.get();
        }
    }

    public static void h(boolean z, final String str, final Object... objArr) throws Throwable {
        i(z, new Supplier() { // from class: lk1
            @Override // java.util.function.Supplier
            public final Object get() {
                return qk1.k(str, objArr);
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public static <X extends Throwable> void i(boolean z, Supplier<? extends X> supplier) throws Throwable {
        if (!z) {
            throw supplier.get();
        }
    }

    public static /* synthetic */ IllegalArgumentException j(String str, Object[] objArr) {
        return new IllegalArgumentException(tt3.y(str, objArr));
    }

    public static /* synthetic */ IllegalArgumentException k(String str, Object[] objArr) {
        return new IllegalArgumentException(tt3.y(str, objArr));
    }

    public static /* synthetic */ IllegalArgumentException l(String str, Object[] objArr) {
        return new IllegalArgumentException(tt3.y(str, objArr));
    }

    public static /* synthetic */ IllegalArgumentException m(String str, Object[] objArr) {
        return new IllegalArgumentException(tt3.y(str, objArr));
    }

    public static /* synthetic */ IllegalArgumentException n(String str, Object[] objArr) {
        return new IllegalArgumentException(tt3.y(str, objArr));
    }

    public static <T extends CharSequence> T o(T t) throws IllegalArgumentException {
        return (T) p(t, "[Assertion failed] - this String argument must have text; it must not be null, empty, or blank", new Object[0]);
    }

    public static <T extends CharSequence> T p(T t, final String str, final Object... objArr) throws IllegalArgumentException {
        return (T) q(t, new Supplier() { // from class: nk1
            @Override // java.util.function.Supplier
            public final Object get() {
                return qk1.l(str, objArr);
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public static <T extends CharSequence, X extends Throwable> T q(T t, Supplier<X> supplier) throws Throwable {
        if (tt3.F(t)) {
            throw supplier.get();
        }
        return t;
    }

    public static <T extends CharSequence> T r(T t, final String str, final Object... objArr) throws IllegalArgumentException {
        return (T) s(t, new Supplier() { // from class: mk1
            @Override // java.util.function.Supplier
            public final Object get() {
                return qk1.m(str, objArr);
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public static <T extends CharSequence, X extends Throwable> T s(T t, Supplier<X> supplier) throws Throwable {
        if (tt3.G(t)) {
            throw supplier.get();
        }
        return t;
    }

    public static <T> T t(T t) throws IllegalArgumentException {
        return (T) u(t, "[Assertion failed] - this argument is required; it must not be null", new Object[0]);
    }

    public static <T> T u(T t, final String str, final Object... objArr) throws IllegalArgumentException {
        return (T) v(t, new Supplier() { // from class: ok1
            @Override // java.util.function.Supplier
            public final Object get() {
                return qk1.n(str, objArr);
            }
        });
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Throwable */
    public static <T, X extends Throwable> T v(T t, Supplier<X> supplier) throws Throwable {
        if (t != null) {
            return t;
        }
        throw supplier.get();
    }
}
