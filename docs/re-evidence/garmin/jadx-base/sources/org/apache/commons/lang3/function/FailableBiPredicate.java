package org.apache.commons.lang3.function;

import a73.u;
import java.lang.Throwable;
import java.util.Objects;
import org.apache.commons.lang3.function.FailableBiPredicate;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableBiPredicate<T, U, E extends Throwable> {
    public static final FailableBiPredicate FALSE;
    public static final FailableBiPredicate TRUE;

    static {
        final int i14 = 0;
        FALSE = new FailableBiPredicate() { // from class: a73.v
            @Override // org.apache.commons.lang3.function.FailableBiPredicate
            public final boolean test(Object obj, Object obj2) {
                switch (i14) {
                    case 0:
                        return FailableBiPredicate.lambda$static$0(obj, obj2);
                    default:
                        return FailableBiPredicate.lambda$static$1(obj, obj2);
                }
            }
        };
        final int i15 = 1;
        TRUE = new FailableBiPredicate() { // from class: a73.v
            @Override // org.apache.commons.lang3.function.FailableBiPredicate
            public final boolean test(Object obj, Object obj2) {
                switch (i15) {
                    case 0:
                        return FailableBiPredicate.lambda$static$0(obj, obj2);
                    default:
                        return FailableBiPredicate.lambda$static$1(obj, obj2);
                }
            }
        };
    }

    static <T, U, E extends Throwable> FailableBiPredicate<T, U, E> falsePredicate() {
        return FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$and$2(FailableBiPredicate failableBiPredicate, Object obj, Object obj2) {
        return test(obj, obj2) && failableBiPredicate.test(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$negate$3(Object obj, Object obj2) {
        return !test(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* synthetic */ default boolean lambda$or$4(FailableBiPredicate failableBiPredicate, Object obj, Object obj2) {
        return test(obj, obj2) || failableBiPredicate.test(obj, obj2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$0(Object obj, Object obj2) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ boolean lambda$static$1(Object obj, Object obj2) {
        return true;
    }

    static <T, U, E extends Throwable> FailableBiPredicate<T, U, E> truePredicate() {
        return TRUE;
    }

    default FailableBiPredicate<T, U, E> and(FailableBiPredicate<? super T, ? super U, E> failableBiPredicate) {
        Objects.requireNonNull(failableBiPredicate);
        return new u(this, failableBiPredicate, 0);
    }

    default FailableBiPredicate<T, U, E> negate() {
        return new FailableBiPredicate() { // from class: a73.t
            @Override // org.apache.commons.lang3.function.FailableBiPredicate
            public final boolean test(Object obj, Object obj2) {
                return this.f1882a.lambda$negate$3(obj, obj2);
            }
        };
    }

    default FailableBiPredicate<T, U, E> or(FailableBiPredicate<? super T, ? super U, E> failableBiPredicate) {
        Objects.requireNonNull(failableBiPredicate);
        return new u(this, failableBiPredicate, 1);
    }

    boolean test(T t7, U u8);
}
