package com.google.firebase.perf.util;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes2.dex */
public class PreDrawListener implements ViewTreeObserver.OnPreDrawListener {
    private final Runnable callbackBoQ;
    private final Runnable callbackFoQ;

    @SuppressLint({"ThreadPoolCreation"})
    private final Handler mainThreadHandler = new Handler(Looper.getMainLooper());
    private final AtomicReference<View> viewReference;

    private PreDrawListener(View view2, Runnable runnable, Runnable runnable2) {
        this.viewReference = new AtomicReference<>(view2);
        this.callbackBoQ = runnable;
        this.callbackFoQ = runnable2;
    }

    public static void registerForNextDraw(View view2, Runnable runnable, Runnable runnable2) {
        view2.getViewTreeObserver().addOnPreDrawListener(new PreDrawListener(view2, runnable, runnable2));
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        View andSet = this.viewReference.getAndSet(null);
        if (andSet == null) {
            return true;
        }
        andSet.getViewTreeObserver().removeOnPreDrawListener(this);
        this.mainThreadHandler.post(this.callbackBoQ);
        this.mainThreadHandler.postAtFrontOfQueue(this.callbackFoQ);
        return true;
    }
}
