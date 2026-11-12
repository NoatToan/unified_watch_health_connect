package org.apache.commons.lang3.function;

import a73.i0;
import java.lang.Throwable;
import java.util.Objects;
import org.apache.commons.lang3.function.FailableIntPredicate;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableIntPredicate<E extends Throwable> {
    public static final FailableIntPredicate FALSE;
    public static final FailableIntPredicate TRUE;

    static {
        final int i14 = 0;
        FALSE = new FailableIntPredicate() { // from class: a73.j0
            @Override // org.apache.commons.lang3.function.FailableIntPredicate
            public final boolean test(int i15) {
                switch (i14) {
                    case 0:
                        return FailableIntPredicate.lambda$static$0(i15);
                    default:
                        return FailableIntPredicate.lambda$static$1(i15);
                }
            }
        };
        final int i15 = 1;
        TRUE = new FailableIntPredicate() { // from class: a73.j0
            @Override // org.apache.commons.lang3.function.FailableIntPredicate
            public final boolean test(int i16) {
                switch (i15) {
                    case 0:
                        return FailableIntPredicate.lambda$static$0(i16);
                    default:
                        return FailableIntPredicate.lambda$static$1(i16);
                }
            }
        };
    }

    static <E extends Throwable> FailableIntPredicate<E> falsePredicate() {
        return FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean lambda$and$2(FailableIntPredicate failableIntPredicate, int i14) {
        return test(i14) && failableIntPredicate.test(i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean lambda$negate$3(int i14) {
        return !test(i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default boolean lambda$or$4(FailableIntPredicate failableIntPredicate, int i14) {
        return test(i14) || failableIntPredicate.test(i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$0(int i14) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$1(int i14) {
        return true;
    }

    static <E extends Throwable> FailableIntPredicate<E> truePredicate() {
        return TRUE;
    }

    default FailableIntPredicate<E> and(FailableIntPredicate<E> failableIntPredicate) {
        Objects.requireNonNull(failableIntPredicate);
        return new i0(this, failableIntPredicate, 0);
    }

    default FailableIntPredicate<E> negate() {
        return new FailableIntPredicate() { // from class: a73.k0
            @Override // org.apache.commons.lang3.function.FailableIntPredicate
            public final boolean test(int i14) {
                return this.f1855a.lambda$negate$3(i14);
            }
        };
    }

    default FailableIntPredicate<E> or(FailableIntPredicate<E> failableIntPredicate) {
        Objects.requireNonNull(failableIntPredicate);
        return new i0(this, failableIntPredicate, 1);
    }

    boolean test(int i14);
}
