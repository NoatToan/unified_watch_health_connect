package com.google.firebase.perf.util;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class FirstDrawDoneListener implements ViewTreeObserver.OnDrawListener {
    private final Runnable callback;

    @SuppressLint({"ThreadPoolCreation"})
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());
    private final AtomicReference<View> viewReference;

    /* JADX INFO: renamed from: com.google.firebase.perf.util.FirstDrawDoneListener$1, reason: invalid class name */
    public class AnonymousClass1 implements View.OnAttachStateChangeListener {
        public AnonymousClass1() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view2) {
            view2.getViewTreeObserver().addOnDrawListener(FirstDrawDoneListener.this);
            view2.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view2) {
            view2.removeOnAttachStateChangeListener(this);
        }
    }

    private FirstDrawDoneListener(View view2, Runnable runnable) {
        this.viewReference = new AtomicReference<>(view2);
        this.callback = runnable;
    }

    private static boolean isAliveAndAttached(View view2) {
        return view2.getViewTreeObserver().isAlive() && view2.isAttachedToWindow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onDraw$0(View view2) {
        view2.getViewTreeObserver().removeOnDrawListener(this);
    }

    public static void registerForNextDraw(View view2, Runnable runnable) {
        view2.getViewTreeObserver().addOnDrawListener(new FirstDrawDoneListener(view2, runnable));
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        View andSet = this.viewReference.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new a(0, this, andSet));
        this.mainThreadHandler.postAtFrontOfQueue(this.callback);
    }
}
