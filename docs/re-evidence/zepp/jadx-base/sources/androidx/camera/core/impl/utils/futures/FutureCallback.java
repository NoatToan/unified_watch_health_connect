package androidx.camera.core.impl.utils.futures;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public interface FutureCallback<V> {
    void onFailure(Throwable t);

    void onSuccess(@Nullable V result);
}
