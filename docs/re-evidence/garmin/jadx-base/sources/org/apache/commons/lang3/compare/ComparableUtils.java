package org.apache.commons.lang3.compare;

import java.util.function.Predicate;

/* JADX INFO: loaded from: classes3.dex */
public class ComparableUtils {

    public static class ComparableCheckBuilder<A extends Comparable<A>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final A f133454a;

        private ComparableCheckBuilder(A a14) {
            this.f133454a = a14;
        }

        private boolean betweenOrdered(A a14, A a15) {
            return greaterThanOrEqualTo(a14) && lessThanOrEqualTo(a15);
        }

        private boolean betweenOrderedExclusive(A a14, A a15) {
            return greaterThan(a14) && lessThan(a15);
        }

        public boolean between(A a14, A a15) {
            return betweenOrdered(a14, a15) || betweenOrdered(a15, a14);
        }

        public boolean betweenExclusive(A a14, A a15) {
            return betweenOrderedExclusive(a14, a15) || betweenOrderedExclusive(a15, a14);
        }

        public boolean equalTo(A a14) {
            return this.f133454a.compareTo(a14) == 0;
        }

        public boolean greaterThan(A a14) {
            return this.f133454a.compareTo(a14) > 0;
        }

        public boolean greaterThanOrEqualTo(A a14) {
            return this.f133454a.compareTo(a14) >= 0;
        }

        public boolean lessThan(A a14) {
            return this.f133454a.compareTo(a14) < 0;
        }

        public boolean lessThanOrEqualTo(A a14) {
            return this.f133454a.compareTo(a14) <= 0;
        }
    }

    private ComparableUtils() {
    }

    public static <A extends Comparable<A>> Predicate<A> between(A a14, A a15) {
        return new b(a14, a15, 0);
    }

    public static <A extends Comparable<A>> Predicate<A> betweenExclusive(A a14, A a15) {
        return new b(a14, a15, 1);
    }

    public static <A extends Comparable<A>> Predicate<A> ge(A a14) {
        return new a(a14, 0);
    }

    public static <A extends Comparable<A>> Predicate<A> gt(A a14) {
        return new a(a14, 1);
    }

    public static <A extends Comparable<A>> ComparableCheckBuilder<A> is(A a14) {
        return new ComparableCheckBuilder<>(a14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$between$0(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return is(comparable3).between(comparable, comparable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$betweenExclusive$1(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return is(comparable3).betweenExclusive(comparable, comparable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$ge$2(Comparable comparable, Comparable comparable2) {
        return is(comparable2).greaterThanOrEqualTo(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$gt$3(Comparable comparable, Comparable comparable2) {
        return is(comparable2).greaterThan(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$le$4(Comparable comparable, Comparable comparable2) {
        return is(comparable2).lessThanOrEqualTo(comparable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$lt$5(Comparable comparable, Comparable comparable2) {
        return is(comparable2).lessThan(comparable);
    }

    public static <A extends Comparable<A>> Predicate<A> le(A a14) {
        return new a(a14, 3);
    }

    public static <A extends Comparable<A>> Predicate<A> lt(A a14) {
        return new a(a14, 2);
    }
}
