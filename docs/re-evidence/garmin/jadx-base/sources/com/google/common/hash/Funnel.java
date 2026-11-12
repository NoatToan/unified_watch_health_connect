package com.google.common.hash;

import com.google.common.annotations.Beta;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
@DoNotMock("Implement with a lambda")
@Beta
@ElementTypesAreNonnullByDefault
public interface Funnel<T> extends Serializable {
    void funnel(@ParametricNullness T t7, PrimitiveSink primitiveSink);
}
