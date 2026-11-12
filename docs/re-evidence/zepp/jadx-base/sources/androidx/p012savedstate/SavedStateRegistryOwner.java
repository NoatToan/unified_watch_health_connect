package androidx.p012savedstate;

import androidx.annotation.NonNull;
import androidx.p008lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public interface SavedStateRegistryOwner extends LifecycleOwner {
    @NonNull
    SavedStateRegistry getSavedStateRegistry();
}
