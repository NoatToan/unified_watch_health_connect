package org.apache.commons.lang3.function;

import java.lang.Throwable;

/* JADX INFO: loaded from: classes3.dex */
@FunctionalInterface
public interface FailableIntBinaryOperator<E extends Throwable> {
    int applyAsInt(int i14, int i15);
}
