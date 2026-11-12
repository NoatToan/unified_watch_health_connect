package org.koin.androidx.scope;

import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleOwner;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/LifecycleOwner;", "", "isActive", "koin-android_release"}, k = 2, mv = {1, 5, 1})
public final class LifecycleScopeDelegateKt {
    public static final boolean isActive(@NotNull LifecycleOwner lifecycleOwner) {
        return lifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED);
    }
}
