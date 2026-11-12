package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;

/* JADX INFO: loaded from: classes14.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public interface FutureCallback<V> {
    void onFailure(Throwable th3);

    void onSuccess(@ParametricNullness V v14);
}
