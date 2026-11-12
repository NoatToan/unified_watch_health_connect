package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import com.xiaomi.wearable.hm.BroadcastsKt;
import io.sentry.SentryLevel;
import io.sentry.SentryOptions;
import io.sentry.android.replay.OnRootViewsChangedListener;
import io.sentry.android.replay.WindowsKt;
import io.sentry.android.replay.util.d;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0014B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0006\u0010\u0011\u001a\u00020\rJ\f\u0010\u0012\u001a\u00020\r*\u00020\nH\u0002J\f\u0010\u0013\u001a\u00020\r*\u00020\nH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0007\u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t`\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lio/sentry/android/replay/gestures/GestureRecorder;", "Lio/sentry/android/replay/OnRootViewsChangedListener;", "options", "Lio/sentry/SentryOptions;", "touchRecorderCallback", "Lio/sentry/android/replay/gestures/TouchRecorderCallback;", "(Lio/sentry/SentryOptions;Lio/sentry/android/replay/gestures/TouchRecorderCallback;)V", "rootViews", "Ljava/util/ArrayList;", "Ljava/lang/ref/WeakReference;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "onRootViewsChanged", "", "root", "added", "", BroadcastsKt.SILENT_PUSHING_STOP, "startGestureTracking", "stopGestureTracking", "SentryReplayGestureRecorder", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nGestureRecorder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GestureRecorder.kt\nio/sentry/android/replay/gestures/GestureRecorder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n1855#2,2:87\n*S KotlinDebug\n*F\n+ 1 GestureRecorder.kt\nio/sentry/android/replay/gestures/GestureRecorder\n*L\n32#1:87,2\n*E\n"})
public final class GestureRecorder implements OnRootViewsChangedListener {
    public static final int $stable = 8;

    @NotNull
    private final SentryOptions options;

    @NotNull
    private final ArrayList<WeakReference<View>> rootViews;

    @NotNull
    private final TouchRecorderCallback touchRecorderCallback;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0011"}, d2 = {"Lio/sentry/android/replay/gestures/GestureRecorder$SentryReplayGestureRecorder;", "Lio/sentry/android/replay/util/d;", "Landroid/view/MotionEvent;", "event", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lio/sentry/SentryOptions;", "options", "Lio/sentry/SentryOptions;", "Lio/sentry/android/replay/gestures/TouchRecorderCallback;", "touchRecorderCallback", "Lio/sentry/android/replay/gestures/TouchRecorderCallback;", "Landroid/view/Window$Callback;", "delegate", "<init>", "(Lio/sentry/SentryOptions;Lio/sentry/android/replay/gestures/TouchRecorderCallback;Landroid/view/Window$Callback;)V", "sentry-android-replay_release"}, k = 1, mv = {1, 8, 0})
    public static final class SentryReplayGestureRecorder extends d {

        @NotNull
        private final SentryOptions options;

        @Nullable
        private final TouchRecorderCallback touchRecorderCallback;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SentryReplayGestureRecorder(@NotNull SentryOptions options, @Nullable TouchRecorderCallback touchRecorderCallback, @Nullable Window.Callback callback) {
            super(callback);
            Intrinsics.checkNotNullParameter(options, "options");
            this.options = options;
            this.touchRecorderCallback = touchRecorderCallback;
        }

        @Override // io.sentry.android.replay.util.d, android.view.Window.Callback
        public boolean dispatchTouchEvent(@Nullable MotionEvent event) {
            if (event != null) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(event);
                Intrinsics.checkNotNullExpressionValue(motionEventObtainNoHistory, "obtainNoHistory(event)");
                try {
                    TouchRecorderCallback touchRecorderCallback = this.touchRecorderCallback;
                    if (touchRecorderCallback != null) {
                        touchRecorderCallback.onTouchEvent(motionEventObtainNoHistory);
                    }
                } catch (Throwable th) {
                    try {
                        this.options.getLogger().a(SentryLevel.ERROR, "Error dispatching touch event", th);
                    } finally {
                        motionEventObtainNoHistory.recycle();
                    }
                }
            }
            return super.dispatchTouchEvent(event);
        }
    }

    public GestureRecorder(@NotNull SentryOptions options, @NotNull TouchRecorderCallback touchRecorderCallback) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(touchRecorderCallback, "touchRecorderCallback");
        this.options = options;
        this.touchRecorderCallback = touchRecorderCallback;
        this.rootViews = new ArrayList<>();
    }

    private final void startGestureTracking(View view) {
        Window phoneWindow = WindowsKt.getPhoneWindow(view);
        if (phoneWindow == null) {
            this.options.getLogger().c(SentryLevel.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
            return;
        }
        Window.Callback callback = phoneWindow.getCallback();
        if (callback instanceof SentryReplayGestureRecorder) {
            return;
        }
        phoneWindow.setCallback(new SentryReplayGestureRecorder(this.options, this.touchRecorderCallback, callback));
    }

    private final void stopGestureTracking(View view) {
        Window phoneWindow = WindowsKt.getPhoneWindow(view);
        if (phoneWindow == null) {
            this.options.getLogger().c(SentryLevel.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
        } else if (phoneWindow.getCallback() instanceof SentryReplayGestureRecorder) {
            Window.Callback callback = phoneWindow.getCallback();
            Intrinsics.checkNotNull(callback, "null cannot be cast to non-null type io.sentry.android.replay.gestures.GestureRecorder.SentryReplayGestureRecorder");
            phoneWindow.setCallback(((SentryReplayGestureRecorder) callback).delegate);
        }
    }

    @Override // io.sentry.android.replay.OnRootViewsChangedListener
    public void onRootViewsChanged(@NotNull final View root, boolean added) {
        Intrinsics.checkNotNullParameter(root, "root");
        if (added) {
            this.rootViews.add(new WeakReference<>(root));
            startGestureTracking(root);
        } else {
            stopGestureTracking(root);
            CollectionsKt__MutableCollectionsKt.removeAll((List) this.rootViews, (Function1) new Function1<WeakReference<View>, Boolean>() { // from class: io.sentry.android.replay.gestures.GestureRecorder.onRootViewsChanged.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                @NotNull
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Boolean invoke2(@NotNull WeakReference<View> it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(Intrinsics.areEqual(it.get(), root));
                }
            });
        }
    }

    public final void stop() {
        Iterator<T> it = this.rootViews.iterator();
        while (it.hasNext()) {
            View view = (View) ((WeakReference) it.next()).get();
            if (view != null) {
                Intrinsics.checkNotNullExpressionValue(view, "get()");
                stopGestureTracking(view);
            }
        }
        this.rootViews.clear();
    }
}
