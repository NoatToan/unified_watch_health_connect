package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableDoubleBinaryOperator<E extends Throwable> {
    double applyAsDouble(double d14, double d15);
}
