package org.apache.commons.lang3.function;

import a73.s0;
import a73.t0;
import java.lang.Throwable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public interface FailableLongUnaryOperator<E extends Throwable> {
    public static final FailableLongUnaryOperator NOP = new s0(1);

    static <E extends Throwable> FailableLongUnaryOperator<E> identity() {
        return new s0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default long lambda$andThen$2(FailableLongUnaryOperator failableLongUnaryOperator, long j8) {
        return failableLongUnaryOperator.applyAsLong(applyAsLong(j8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default long lambda$compose$3(FailableLongUnaryOperator failableLongUnaryOperator, long j8) {
        return applyAsLong(failableLongUnaryOperator.applyAsLong(j8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ long lambda$identity$1(long j8) {
        return j8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ long lambda$static$0(long j8) {
        return 0L;
    }

    static <E extends Throwable> FailableLongUnaryOperator<E> nop() {
        return NOP;
    }

    default FailableLongUnaryOperator<E> andThen(FailableLongUnaryOperator<E> failableLongUnaryOperator) {
        Objects.requireNonNull(failableLongUnaryOperator);
        return new t0(this, failableLongUnaryOperator, 0);
    }

    long applyAsLong(long j8);

    default FailableLongUnaryOperator<E> compose(FailableLongUnaryOperator<E> failableLongUnaryOperator) {
        Objects.requireNonNull(failableLongUnaryOperator);
        return new t0(this, failableLongUnaryOperator, 1);
    }
}
