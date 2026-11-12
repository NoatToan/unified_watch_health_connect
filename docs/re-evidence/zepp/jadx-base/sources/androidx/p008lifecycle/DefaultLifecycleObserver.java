package androidx.p008lifecycle;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public interface DefaultLifecycleObserver extends FullLifecycleObserver {
    @Override // androidx.p008lifecycle.FullLifecycleObserver
    void onCreate(@NonNull LifecycleOwner lifecycleOwner);

    @Override // androidx.p008lifecycle.FullLifecycleObserver
    void onDestroy(@NonNull LifecycleOwner lifecycleOwner);

    @Override // androidx.p008lifecycle.FullLifecycleObserver
    void onPause(@NonNull LifecycleOwner lifecycleOwner);

    @Override // androidx.p008lifecycle.FullLifecycleObserver
    void onResume(@NonNull LifecycleOwner lifecycleOwner);

    @Override // androidx.p008lifecycle.FullLifecycleObserver
    void onStart(@NonNull LifecycleOwner lifecycleOwner);

    @Override // androidx.p008lifecycle.FullLifecycleObserver
    void onStop(@NonNull LifecycleOwner lifecycleOwner);
}
