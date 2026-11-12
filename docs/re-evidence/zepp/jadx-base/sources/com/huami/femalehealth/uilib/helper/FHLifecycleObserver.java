package com.huami.femalehealth.uilib.helper;

import androidx.p008lifecycle.Lifecycle;
import androidx.p008lifecycle.LifecycleObserver;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.OnLifecycleEvent;
import com.huami.watch.transport.httpsupport.cacher.DataCacher;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0017J\u0018\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0017¨\u0006\u000e"}, d2 = {"Lcom/huami/femalehealth/uilib/helper/FHLifecycleObserver;", "Landroidx/lifecycle/LifecycleObserver;", "Landroidx/lifecycle/LifecycleOwner;", DataCacher.o, "", "onCreate", "onResume", "onStart", "onPause", "onStop", "onDestroy", "Landroidx/lifecycle/Lifecycle$Event;", "event", "onLifecycleChanged", "uilib_release"}, k = 1, mv = {1, 5, 1})
public interface FHLifecycleObserver extends LifecycleObserver {

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public static final class DefaultImpls {
        @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
        public static void onCreate(@NotNull FHLifecycleObserver fHLifecycleObserver, @NotNull LifecycleOwner lifecycleOwner) {
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
        public static void onDestroy(@NotNull FHLifecycleObserver fHLifecycleObserver, @NotNull LifecycleOwner lifecycleOwner) {
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
        public static void onLifecycleChanged(@NotNull FHLifecycleObserver fHLifecycleObserver, @NotNull LifecycleOwner lifecycleOwner, @NotNull Lifecycle.Event event) {
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
        public static void onPause(@NotNull FHLifecycleObserver fHLifecycleObserver, @NotNull LifecycleOwner lifecycleOwner) {
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
        public static void onResume(@NotNull FHLifecycleObserver fHLifecycleObserver, @NotNull LifecycleOwner lifecycleOwner) {
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_START)
        public static void onStart(@NotNull FHLifecycleObserver fHLifecycleObserver, @NotNull LifecycleOwner lifecycleOwner) {
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
        public static void onStop(@NotNull FHLifecycleObserver fHLifecycleObserver, @NotNull LifecycleOwner lifecycleOwner) {
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    void onCreate(@NotNull LifecycleOwner owner);

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    void onDestroy(@NotNull LifecycleOwner owner);

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    void onLifecycleChanged(@NotNull LifecycleOwner owner, @NotNull Lifecycle.Event event);

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    void onPause(@NotNull LifecycleOwner owner);

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    void onResume(@NotNull LifecycleOwner owner);

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    void onStart(@NotNull LifecycleOwner owner);

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    void onStop(@NotNull LifecycleOwner owner);
}
