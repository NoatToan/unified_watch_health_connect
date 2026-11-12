package com.google.common.collect;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;

/* JADX INFO: loaded from: classes3.dex */
@Beta
@GwtIncompatible
public final class Interners {

    public static class InternerBuilder {
        private final MapMaker a;
        private boolean b;

        public <E> Interner<E> build() {
            if (!this.b) {
                this.a.weakKeys();
            }
            return new c(this.a);
        }

        public InternerBuilder concurrencyLevel(int i) {
            this.a.concurrencyLevel(i);
            return this;
        }

        public InternerBuilder strong() {
            this.b = true;
            return this;
        }

        @GwtIncompatible("java.lang.ref.WeakReference")
        public InternerBuilder weak() {
            this.b = false;
            return this;
        }

        private InternerBuilder() {
            this.a = new MapMaker();
            this.b = true;
        }
    }

    public static class b<E> implements Function<E, E> {
        private final Interner<E> a;

        public b(Interner<E> interner) {
            this.a = interner;
        }

        @Override // com.google.common.base.Function
        public E apply(E e) {
            return this.a.intern(e);
        }

        @Override // com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    @VisibleForTesting
    public static final class c<E> implements Interner<E> {

        @VisibleForTesting
        public final q1<E, MapMaker.a, ?, ?> a;

        @Override // com.google.common.collect.Interner
        public E intern(E e) {
            E e2;
            do {
                q1.j jVarH = this.a.h(e);
                if (jVarH != null && (e2 = (E) jVarH.getKey()) != null) {
                    return e2;
                }
            } while (this.a.putIfAbsent(e, MapMaker.a.VALUE) != null);
            return e;
        }

        private c(MapMaker mapMaker) {
            this.a = q1.g(mapMaker.f(Equivalence.equals()));
        }
    }

    private Interners() {
    }

    public static <E> Function<E, E> asFunction(Interner<E> interner) {
        return new b((Interner) Preconditions.checkNotNull(interner));
    }

    public static InternerBuilder newBuilder() {
        return new InternerBuilder();
    }

    public static <E> Interner<E> newStrongInterner() {
        return newBuilder().strong().build();
    }

    @GwtIncompatible("java.lang.ref.WeakReference")
    public static <E> Interner<E> newWeakInterner() {
        return newBuilder().weak().build();
    }
}
