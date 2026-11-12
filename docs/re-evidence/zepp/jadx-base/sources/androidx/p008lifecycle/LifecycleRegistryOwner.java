package androidx.p008lifecycle;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public interface LifecycleRegistryOwner extends LifecycleOwner {
    @Override // androidx.p008lifecycle.LifecycleOwner
    @NonNull
    LifecycleRegistry getLifecycle();
}
