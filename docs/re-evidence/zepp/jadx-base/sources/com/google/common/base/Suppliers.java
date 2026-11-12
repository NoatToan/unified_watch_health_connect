package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import java.io.Serializable;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.cybergarage.upnp.std.av.server.object.SearchCriteria;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
public final class Suppliers {

    @VisibleForTesting
    public static class a<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Supplier<T> a;
        public final long b;

        @NullableDecl
        public volatile transient T c;
        public volatile transient long d;

        public a(Supplier<T> supplier, long j, TimeUnit timeUnit) {
            this.a = (Supplier) Preconditions.checkNotNull(supplier);
            this.b = timeUnit.toNanos(j);
            Preconditions.checkArgument(j > 0, "duration (%s %s) must be > 0", j, timeUnit);
        }

        @Override // com.google.common.base.Supplier
        public T get() {
            long j = this.d;
            long jK = j.k();
            if (j == 0 || jK - j >= 0) {
                synchronized (this) {
                    if (j == this.d) {
                        T t = this.a.get();
                        this.c = t;
                        long j2 = jK + this.b;
                        if (j2 == 0) {
                            j2 = 1;
                        }
                        this.d = j2;
                        return t;
                    }
                }
            }
            return this.c;
        }

        public String toString() {
            return "Suppliers.memoizeWithExpiration(" + this.a + ", " + this.b + ", NANOS)";
        }
    }

    @VisibleForTesting
    public static class b<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Supplier<T> a;
        public volatile transient boolean b;

        @NullableDecl
        public transient T c;

        public b(Supplier<T> supplier) {
            this.a = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        public T get() {
            if (!this.b) {
                synchronized (this) {
                    if (!this.b) {
                        T t = this.a.get();
                        this.c = t;
                        this.b = true;
                        return t;
                    }
                }
            }
            return this.c;
        }

        public String toString() {
            Object obj;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (this.b) {
                obj = "<supplier that returned " + this.c + SearchCriteria.GT;
            } else {
                obj = this.a;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    @VisibleForTesting
    public static class c<T> implements Supplier<T> {
        public volatile Supplier<T> a;
        public volatile boolean b;

        @NullableDecl
        public T c;

        public c(Supplier<T> supplier) {
            this.a = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        public T get() {
            if (!this.b) {
                synchronized (this) {
                    if (!this.b) {
                        T t = this.a.get();
                        this.c = t;
                        this.b = true;
                        this.a = null;
                        return t;
                    }
                }
            }
            return this.c;
        }

        public String toString() {
            Object obj = this.a;
            StringBuilder sb = new StringBuilder();
            sb.append("Suppliers.memoize(");
            if (obj == null) {
                obj = "<supplier that returned " + this.c + SearchCriteria.GT;
            }
            sb.append(obj);
            sb.append(")");
            return sb.toString();
        }
    }

    public static class d<F, T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Function<? super F, T> a;
        public final Supplier<F> b;

        public d(Function<? super F, T> function, Supplier<F> supplier) {
            this.a = (Function) Preconditions.checkNotNull(function);
            this.b = (Supplier) Preconditions.checkNotNull(supplier);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && this.b.equals(dVar.b);
        }

        @Override // com.google.common.base.Supplier
        public T get() {
            return this.a.apply(this.b.get());
        }

        public int hashCode() {
            return Objects.hashCode(this.a, this.b);
        }

        public String toString() {
            return "Suppliers.compose(" + this.a + ", " + this.b + ")";
        }
    }

    public interface e<T> extends Function<Supplier<T>, T> {
    }

    public enum f implements e<Object> {
        INSTANCE;

        @Override // com.google.common.base.Function
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Object apply(Supplier<Object> supplier) {
            return supplier.get();
        }

        @Override // java.lang.Enum
        public String toString() {
            return "Suppliers.supplierFunction()";
        }
    }

    public static class g<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;

        @NullableDecl
        public final T a;

        public g(@NullableDecl T t) {
            this.a = t;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof g) {
                return Objects.equal(this.a, ((g) obj).a);
            }
            return false;
        }

        @Override // com.google.common.base.Supplier
        public T get() {
            return this.a;
        }

        public int hashCode() {
            return Objects.hashCode(this.a);
        }

        public String toString() {
            return "Suppliers.ofInstance(" + this.a + ")";
        }
    }

    public static class h<T> implements Supplier<T>, Serializable {
        private static final long serialVersionUID = 0;
        public final Supplier<T> a;

        public h(Supplier<T> supplier) {
            this.a = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        public T get() {
            T t;
            synchronized (this.a) {
                t = this.a.get();
            }
            return t;
        }

        public String toString() {
            return "Suppliers.synchronizedSupplier(" + this.a + ")";
        }
    }

    private Suppliers() {
    }

    public static <F, T> Supplier<T> compose(Function<? super F, T> function, Supplier<F> supplier) {
        return new d(function, supplier);
    }

    public static <T> Supplier<T> memoize(Supplier<T> supplier) {
        if ((supplier instanceof c) || (supplier instanceof b)) {
            return supplier;
        }
        return supplier instanceof Serializable ? new b(supplier) : new c(supplier);
    }

    public static <T> Supplier<T> memoizeWithExpiration(Supplier<T> supplier, long j, TimeUnit timeUnit) {
        return new a(supplier, j, timeUnit);
    }

    public static <T> Supplier<T> ofInstance(@NullableDecl T t) {
        return new g(t);
    }

    public static <T> Function<Supplier<T>, T> supplierFunction() {
        return f.INSTANCE;
    }

    public static <T> Supplier<T> synchronizedSupplier(Supplier<T> supplier) {
        return new h(supplier);
    }
}
