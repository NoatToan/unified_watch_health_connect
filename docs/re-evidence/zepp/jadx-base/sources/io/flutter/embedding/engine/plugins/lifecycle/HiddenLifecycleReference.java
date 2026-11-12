package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.p008lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes22.dex */
@Keep
public class HiddenLifecycleReference {

    @NonNull
    private final Lifecycle lifecycle;

    public HiddenLifecycleReference(@NonNull Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    @NonNull
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }
}
