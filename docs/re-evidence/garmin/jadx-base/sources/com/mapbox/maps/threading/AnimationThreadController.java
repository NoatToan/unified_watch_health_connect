package com.mapbox.maps.threading;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.garmin.android.music.c;
import com.mapbox.maps.MapboxExperimental;
import com.mapbox.maps.MapboxLogger;
import e23.a;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\n\u0010\tJ\r\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b\u000b\u0010\u0003R$\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/mapbox/maps/threading/AnimationThreadController;", "", "<init>", "()V", "", "useBackgroundThread", "Lkotlin/Function0;", "function", "postOnMainThread", "(Le23/a;)V", "postOnAnimatorThread", "useMainThread", "", "<set-?>", "usingBackgroundThread", "Z", "getUsingBackgroundThread", "()Z", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "Landroid/os/HandlerThread;", "backgroundAnimationThread", "Landroid/os/HandlerThread;", "backgroundAnimationHandler", "", "TAG", "Ljava/lang/String;", "BACKGROUND_ANIMATION_THREAD_NAME", "sdk-base_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
@MapboxExperimental
public final class AnimationThreadController {
    private static final String BACKGROUND_ANIMATION_THREAD_NAME = "MapboxAnimThread";
    private static final String TAG = "AnimThreadController";
    private static Handler backgroundAnimationHandler;
    private static HandlerThread backgroundAnimationThread;
    private static volatile boolean usingBackgroundThread;
    public static final AnimationThreadController INSTANCE = new AnimationThreadController();
    private static final Handler mainHandler = new Handler(Looper.getMainLooper());

    private AnimationThreadController() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postOnAnimatorThread$lambda$3$lambda$2(a aVar) {
        aVar.getClass();
        aVar.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void postOnMainThread$lambda$1(a aVar) {
        aVar.getClass();
        aVar.invoke();
    }

    public final boolean getUsingBackgroundThread() {
        return usingBackgroundThread;
    }

    public final void postOnAnimatorThread(a<Unit> function) {
        function.getClass();
        if (!usingBackgroundThread) {
            postOnMainThread(function);
            return;
        }
        Looper looperMyLooper = Looper.myLooper();
        HandlerThread handlerThread = backgroundAnimationThread;
        if (s.g(looperMyLooper, handlerThread != null ? handlerThread.getLooper() : null)) {
            function.invoke();
            return;
        }
        Handler handler = backgroundAnimationHandler;
        if (handler != null) {
            handler.post(new c(function, 9));
        } else {
            MapboxLogger.logW(TAG, "useBackgroundThread was called but handler is null, animator event is skipped!");
        }
    }

    public final void postOnMainThread(a<Unit> function) {
        function.getClass();
        if (s.g(Looper.myLooper(), Looper.getMainLooper())) {
            function.invoke();
        } else {
            mainHandler.post(new c(function, 10));
        }
    }

    public final void useBackgroundThread() {
        if (usingBackgroundThread) {
            return;
        }
        usingBackgroundThread = true;
        HandlerThread handlerThread = backgroundAnimationThread;
        if (handlerThread != null) {
            handlerThread.quit();
        }
        HandlerThread handlerThread2 = new HandlerThread(BACKGROUND_ANIMATION_THREAD_NAME);
        handlerThread2.start();
        backgroundAnimationHandler = new Handler(handlerThread2.getLooper());
        backgroundAnimationThread = handlerThread2;
    }

    public final void useMainThread() {
        if (usingBackgroundThread) {
            Handler handler = backgroundAnimationHandler;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            HandlerThread handlerThread = backgroundAnimationThread;
            if (handlerThread != null) {
                handlerThread.quit();
            }
            usingBackgroundThread = false;
            backgroundAnimationThread = null;
            backgroundAnimationHandler = null;
        }
    }
}
