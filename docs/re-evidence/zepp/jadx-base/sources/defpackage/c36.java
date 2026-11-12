package defpackage;

import com.thanosfisherman.elvis.interfaces.Predicate;
import java.util.Objects;

/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class c36 {
    public static Predicate a(final Predicate _this, final Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new Predicate() { // from class: z26
            @Override // com.thanosfisherman.elvis.interfaces.Predicate
            public /* synthetic */ Predicate and(Predicate predicate2) {
                return c36.a(this, predicate2);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Predicate
            public /* synthetic */ Predicate negate() {
                return c36.b(this);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Predicate
            public /* synthetic */ Predicate or(Predicate predicate2) {
                return c36.c(this, predicate2);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Predicate
            public final boolean test(Object obj) {
                return c36.d(_this, predicate, obj);
            }
        };
    }

    public static Predicate b(final Predicate _this) {
        return new Predicate() { // from class: x26
            @Override // com.thanosfisherman.elvis.interfaces.Predicate
            public /* synthetic */ Predicate and(Predicate predicate) {
                return c36.a(this, predicate);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Predicate
            public /* synthetic */ Predicate negate() {
                return c36.b(this);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Predicate
            public /* synthetic */ Predicate or(Predicate predicate) {
                return c36.c(this, predicate);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Predicate
            public final boolean test(Object obj) {
                return c36.e(_this, obj);
            }
        };
    }

    public static Predicate c(final Predicate _this, final Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new Predicate() { // from class: y26
            @Override // com.thanosfisherman.elvis.interfaces.Predicate
            public /* synthetic */ Predicate and(Predicate predicate2) {
                return c36.a(this, predicate2);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Predicate
            public /* synthetic */ Predicate negate() {
                return c36.b(this);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Predicate
            public /* synthetic */ Predicate or(Predicate predicate2) {
                return c36.c(this, predicate2);
            }

            @Override // com.thanosfisherman.elvis.interfaces.Predicate
            public final boolean test(Object obj) {
                return c36.f(_this, predicate, obj);
            }
        };
    }

    public static /* synthetic */ boolean d(Predicate _this, Predicate predicate, Object obj) {
        return _this.test(obj) && predicate.test(obj);
    }

    public static /* synthetic */ boolean e(Predicate _this, Object obj) {
        return !_this.test(obj);
    }

    public static /* synthetic */ boolean f(Predicate _this, Predicate predicate, Object obj) {
        return _this.test(obj) || predicate.test(obj);
    }

    public static <T> Predicate<T> k(final Object obj) {
        return obj == null ? new Predicate() { // from class: b36
            public /* synthetic */ Predicate a(Predicate predicate) {
                return c36.a(this, predicate);
            }

            public /* synthetic */ Predicate b() {
                return c36.b(this);
            }

            public /* synthetic */ Predicate c(Predicate predicate) {
                return c36.c(this, predicate);
            }

            public final boolean d(Object obj2) {
                return w26.a(obj2);
            }
        } : new Predicate() { // from class: a36
            public /* synthetic */ Predicate a(Predicate predicate) {
                return c36.a(this, predicate);
            }

            public /* synthetic */ Predicate b() {
                return c36.b(this);
            }

            public /* synthetic */ Predicate c(Predicate predicate) {
                return c36.c(this, predicate);
            }

            public final boolean d(Object obj2) {
                return obj.equals(obj2);
            }
        };
    }
}
