package org.apache.commons.lang3.function;

import a73.p0;
import java.lang.Throwable;
import java.util.Objects;
import org.apache.commons.lang3.function.FailableLongPredicate;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableLongPredicate<E extends Throwable> {
    public static final FailableLongPredicate FALSE;
    public static final FailableLongPredicate TRUE;

    static {
        final int i14 = 0;
        FALSE = new FailableLongPredicate() { // from class: a73.r0
            @Override // org.apache.commons.lang3.function.FailableLongPredicate
            public final boolean test(long j8) {
                switch (i14) {
                    case 0:
                        return FailableLongPredicate.lambda$static$0(j8);
                    default:
                        return FailableLongPredicate.lambda$static$1(j8);
                }
            }
        };
        final int i15 = 1;
        TRUE = new FailableLongPredicate() { // from class: a73.r0
            @Override // org.apache.commons.lang3.function.FailableLongPredicate
            public final boolean test(long j8) {
                switch (i15) {
                    case 0:
                        return FailableLongPredicate.lambda$static$0(j8);
                    default:
                        return FailableLongPredicate.lambda$static$1(j8);
                }
            }
        };
    }

    static <E extends Throwable> FailableLongPredicate<E> falsePredicate() {
        return FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean lambda$and$2(FailableLongPredicate failableLongPredicate, long j8) {
        return test(j8) && failableLongPredicate.test(j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean lambda$negate$3(long j8) {
        return !test(j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean lambda$or$4(FailableLongPredicate failableLongPredicate, long j8) {
        return test(j8) || failableLongPredicate.test(j8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$0(long j8) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$1(long j8) {
        return true;
    }

    static <E extends Throwable> FailableLongPredicate<E> truePredicate() {
        return TRUE;
    }

    default FailableLongPredicate<E> and(FailableLongPredicate<E> failableLongPredicate) {
        Objects.requireNonNull(failableLongPredicate);
        return new p0(this, failableLongPredicate, 0);
    }

    default FailableLongPredicate<E> negate() {
        return new FailableLongPredicate() { // from class: a73.q0
            @Override // org.apache.commons.lang3.function.FailableLongPredicate
            public final boolean test(long j8) {
                return this.f1877a.lambda$negate$3(j8);
            }
        };
    }

    default FailableLongPredicate<E> or(FailableLongPredicate<E> failableLongPredicate) {
        Objects.requireNonNull(failableLongPredicate);
        return new p0(this, failableLongPredicate, 1);
    }

    boolean test(long j8);
}
