package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableBooleanSupplier<E extends Throwable> {
    boolean getAsBoolean();
}
