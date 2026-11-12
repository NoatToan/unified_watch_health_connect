package org.apache.commons.lang3.function;

import a73.l0;
import a73.m0;
import java.lang.Throwable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public interface FailableIntUnaryOperator<E extends Throwable> {
    public static final FailableIntUnaryOperator NOP = new l0(0);

    static <E extends Throwable> FailableIntUnaryOperator<E> identity() {
        return new l0(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default int lambda$andThen$2(FailableIntUnaryOperator failableIntUnaryOperator, int i14) {
        return failableIntUnaryOperator.applyAsInt(applyAsInt(i14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default int lambda$compose$3(FailableIntUnaryOperator failableIntUnaryOperator, int i14) {
        return applyAsInt(failableIntUnaryOperator.applyAsInt(i14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ int lambda$identity$1(int i14) {
        return i14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ int lambda$static$0(int i14) {
        return 0;
    }

    static <E extends Throwable> FailableIntUnaryOperator<E> nop() {
        return NOP;
    }

    default FailableIntUnaryOperator<E> andThen(FailableIntUnaryOperator<E> failableIntUnaryOperator) {
        Objects.requireNonNull(failableIntUnaryOperator);
        return new m0(this, failableIntUnaryOperator, 1);
    }

    int applyAsInt(int i14);

    default FailableIntUnaryOperator<E> compose(FailableIntUnaryOperator<E> failableIntUnaryOperator) {
        Objects.requireNonNull(failableIntUnaryOperator);
        return new m0(this, failableIntUnaryOperator, 0);
    }
}
