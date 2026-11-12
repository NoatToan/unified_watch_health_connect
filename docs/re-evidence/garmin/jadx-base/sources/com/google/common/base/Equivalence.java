package com.google.common.base;

import am.j;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.ForOverride;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class Equivalence<T> {

    public static final class Equals extends Equivalence<Object> implements Serializable {
        static final Equals INSTANCE = new Equals();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return INSTANCE;
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

    public static final class EquivalentToPredicate<T> implements Predicate<T>, Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<T> equivalence;
        private final T target;

        public EquivalentToPredicate(Equivalence<T> equivalence, T t7) {
            this.equivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.target = t7;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(T t7) {
            return this.equivalence.equivalent(t7, this.target);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof EquivalentToPredicate) {
                EquivalentToPredicate equivalentToPredicate = (EquivalentToPredicate) obj;
                if (this.equivalence.equals(equivalentToPredicate.equivalence) && Objects.equal(this.target, equivalentToPredicate.target)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.equivalence, this.target);
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.equivalence);
            sb3.append(".equivalentTo(");
            return j.k(this.target, ")", sb3);
        }
    }

    public static final class Identity extends Equivalence<Object> implements Serializable {
        static final Identity INSTANCE = new Identity();
        private static final long serialVersionUID = 1;

        private Object readResolve() {
            return INSTANCE;
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

    public static final class Wrapper<T> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Equivalence<? super T> equivalence;

        @ParametricNullness
        private final T reference;

        private Wrapper(Equivalence<? super T> equivalence, @ParametricNullness T t7) {
            this.equivalence = (Equivalence) Preconditions.checkNotNull(equivalence);
            this.reference = t7;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Wrapper)) {
                return false;
            }
            Wrapper wrapper = (Wrapper) obj;
            if (this.equivalence.equals(wrapper.equivalence)) {
                return this.equivalence.equivalent(this.reference, wrapper.reference);
            }
            return false;
        }

        @ParametricNullness
        public T get() {
            return this.reference;
        }

        public int hashCode() {
            return this.equivalence.hash(this.reference);
        }

        public String toString() {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.equivalence);
            sb3.append(".wrap(");
            return j.k(this.reference, ")", sb3);
        }
    }

    public static Equivalence<Object> equals() {
        return Equals.INSTANCE;
    }

    public static Equivalence<Object> identity() {
        return Identity.INSTANCE;
    }

    @ForOverride
    public abstract boolean doEquivalent(T t7, T t14);

    @ForOverride
    public abstract int doHash(T t7);

    public final boolean equivalent(T t7, T t14) {
        if (t7 == t14) {
            return true;
        }
        if (t7 == null || t14 == null) {
            return false;
        }
        return doEquivalent(t7, t14);
    }

    public final Predicate<T> equivalentTo(T t7) {
        return new EquivalentToPredicate(this, t7);
    }

    public final int hash(T t7) {
        if (t7 == null) {
            return 0;
        }
        return doHash(t7);
    }

    public final <F> Equivalence<F> onResultOf(Function<? super F, ? extends T> function) {
        return new FunctionalEquivalence(function, this);
    }

    @GwtCompatible(serializable = true)
    public final <S extends T> Equivalence<Iterable<S>> pairwise() {
        return new PairwiseEquivalence(this);
    }

    public final <S extends T> Wrapper<S> wrap(@ParametricNullness S s8) {
        return new Wrapper<>(s8);
    }
}
