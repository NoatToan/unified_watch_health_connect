package org.apache.commons.lang3.function;

import a73.c0;
import a73.d0;
import java.lang.Throwable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public interface FailableDoubleUnaryOperator<E extends Throwable> {
    public static final FailableDoubleUnaryOperator NOP = new c0(1);

    static <E extends Throwable> FailableDoubleUnaryOperator<E> identity() {
        return new c0(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default double lambda$andThen$2(FailableDoubleUnaryOperator failableDoubleUnaryOperator, double d14) {
        return failableDoubleUnaryOperator.applyAsDouble(applyAsDouble(d14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* synthetic */ default double lambda$compose$3(FailableDoubleUnaryOperator failableDoubleUnaryOperator, double d14) {
        return applyAsDouble(failableDoubleUnaryOperator.applyAsDouble(d14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ double lambda$identity$1(double d14) {
        return d14;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static /* synthetic */ double lambda$static$0(double d14) {
        return 0.0d;
    }

    static <E extends Throwable> FailableDoubleUnaryOperator<E> nop() {
        return NOP;
    }

    default FailableDoubleUnaryOperator<E> andThen(FailableDoubleUnaryOperator<E> failableDoubleUnaryOperator) {
        Objects.requireNonNull(failableDoubleUnaryOperator);
        return new d0(this, failableDoubleUnaryOperator, 1);
    }

    double applyAsDouble(double d14);

    default FailableDoubleUnaryOperator<E> compose(FailableDoubleUnaryOperator<E> failableDoubleUnaryOperator) {
        Objects.requireNonNull(failableDoubleUnaryOperator);
        return new d0(this, failableDoubleUnaryOperator, 0);
    }
}
