package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableDoubleSupplier<E extends Throwable> {
    double getAsDouble();
}
