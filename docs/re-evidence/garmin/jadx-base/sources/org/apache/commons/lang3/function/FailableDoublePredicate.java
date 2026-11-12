package org.apache.commons.lang3.function;

import a73.z;
import java.lang.Throwable;
import java.util.Objects;
import org.apache.commons.lang3.function.FailableDoublePredicate;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableDoublePredicate<E extends Throwable> {
    public static final FailableDoublePredicate FALSE;
    public static final FailableDoublePredicate TRUE;

    static {
        final int i14 = 0;
        FALSE = new FailableDoublePredicate() { // from class: a73.b0
            @Override // org.apache.commons.lang3.function.FailableDoublePredicate
            public final boolean test(double d14) {
                switch (i14) {
                    case 0:
                        return FailableDoublePredicate.lambda$static$0(d14);
                    default:
                        return FailableDoublePredicate.lambda$static$1(d14);
                }
            }
        };
        final int i15 = 1;
        TRUE = new FailableDoublePredicate() { // from class: a73.b0
            @Override // org.apache.commons.lang3.function.FailableDoublePredicate
            public final boolean test(double d14) {
                switch (i15) {
                    case 0:
                        return FailableDoublePredicate.lambda$static$0(d14);
                    default:
                        return FailableDoublePredicate.lambda$static$1(d14);
                }
            }
        };
    }

    static <E extends Throwable> FailableDoublePredicate<E> falsePredicate() {
        return FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean lambda$and$2(FailableDoublePredicate failableDoublePredicate, double d14) {
        return test(d14) && failableDoublePredicate.test(d14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean lambda$negate$3(double d14) {
        return !test(d14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean lambda$or$4(FailableDoublePredicate failableDoublePredicate, double d14) {
        return test(d14) || failableDoublePredicate.test(d14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$0(double d14) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$1(double d14) {
        return true;
    }

    static <E extends Throwable> FailableDoublePredicate<E> truePredicate() {
        return TRUE;
    }

    default FailableDoublePredicate<E> and(FailableDoublePredicate<E> failableDoublePredicate) {
        Objects.requireNonNull(failableDoublePredicate);
        return new z(this, failableDoublePredicate, 1);
    }

    default FailableDoublePredicate<E> negate() {
        return new FailableDoublePredicate() { // from class: a73.a0
            @Override // org.apache.commons.lang3.function.FailableDoublePredicate
            public final boolean test(double d14) {
                return this.f1816a.lambda$negate$3(d14);
            }
        };
    }

    default FailableDoublePredicate<E> or(FailableDoublePredicate<E> failableDoublePredicate) {
        Objects.requireNonNull(failableDoublePredicate);
        return new z(this, failableDoublePredicate, 0);
    }

    boolean test(double d14);
}
