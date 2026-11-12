package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.ForOverride;
import java.io.Serializable;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: loaded from: classes3.dex */
@GwtCompatible
public abstract class Equivalence<T> {

    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> a;

        @NullableDecl
        private final T b;

        public boolean equals(@NullableDecl Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj;
            if (this.a.equals(wrapper.a)) {
                return this.a.equivalent(this.b, wrapper.b);
            }
            return false;
        }

        @NullableDecl
        public T get() {
            return this.b;
        }

        public int hashCode() {
            return this.a.hash(this.b);
        }

        public String toString() {
            return this.a + ".wrap(" + this.b + ")";
        }

        private Wrapper(Equivalence<? super T> equivalence, @NullableDecl T t) {
            this.a = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.b = t;
        }
    }

    public static final class b extends Equivalence<Object> implements Serializable {
        public static final b a = new b();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return a;
        }

        @Override // com.google.common.base.Equivalence
        public boolean doEquivalent(Object obj, Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.google.common.base.Equivalence
        public int doHash(Object obj) {
            return obj.hashCode();
        }
    }

    public static final class c<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<T> a;

        @NullableDecl
        private final T b;

        public c(Equivalence<T> equivalence, @NullableDecl T t) {
            this.a = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.b = t;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@NullableDecl T t) {
            return this.a.equivalent(t, this.b);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@NullableDecl Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && Objects.equal(this.b, cVar.b);
        }

        public int hashCode() {
            return Objects.hashCode(this.a, this.b);
        }

        public String toString() {
            return this.a + ".equivalentTo(" + this.b + ")";
        }
    }

    public static final class d extends Equivalence<Object> implements Serializable {
        public static final d a = new d();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return a;
        }

        @Override // com.google.common.base.Equivalence
        public boolean doEquivalent(Object obj, Object obj2) {
            return false;
        }

        @Override // com.google.common.base.Equivalence
        public int doHash(Object obj) {
            return System.identityHashCode(obj);
        }
    }

    public static Equivalence<Object> equals() {
        return b.a;
    }

    public static Equivalence<Object> identity() {
        return d.a;
    }

    @ForOverride
    public abstract boolean doEquivalent(T t, T t2);

    @ForOverride
    public abstract int doHash(T t);

    public final boolean equivalent(@NullableDecl T t, @NullableDecl T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return doEquivalent(t, t2);
    }

    public final Predicate<T> equivalentTo(@NullableDecl T t) {
        return new c(this, t);
    }

    public final int hash(@NullableDecl T t) {
        if (t == null) {
            return 0;
        }
        return doHash(t);
    }

    public final <F> Equivalence<F> onResultOf(Function<F, ? extends T> function) {
        return new f(function, this);
    }

    @GwtCompatible(serializable = true)
    public final <S extends T> Equivalence<Iterable<S>> pairwise() {
        return new h(this);
    }

    public final <S extends T> Wrapper<S> wrap(@NullableDecl S s) {
        return new Wrapper<>(s);
    }
}
