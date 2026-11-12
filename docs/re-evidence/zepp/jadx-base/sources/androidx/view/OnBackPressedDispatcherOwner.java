package androidx.view;

import androidx.annotation.NonNull;
import androidx.p008lifecycle.LifecycleOwner;

/* JADX INFO: loaded from: classes.dex */
public interface OnBackPressedDispatcherOwner extends LifecycleOwner {
    @NonNull
    OnBackPressedDispatcher getOnBackPressedDispatcher();
}
