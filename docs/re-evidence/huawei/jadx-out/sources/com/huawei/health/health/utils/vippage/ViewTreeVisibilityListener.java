package com.huawei.health.health.utils.vippage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.huawei.haf.handler.HandlerExecutor;
import defpackage.qsp;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes7.dex */
public class ViewTreeVisibilityListener implements ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<ViewTreeListenee> f7110b;
    private final WeakReference<View> d;

    public interface ViewTreeListenee {
        void biEvent();

        void checkVisibilityAndSetBiEvent();

        boolean hasSetBiEvent();
    }

    public ViewTreeVisibilityListener(View view, ViewTreeListenee viewTreeListenee) {
        this.f7110b = new WeakReference<>(viewTreeListenee);
        this.d = new WeakReference<>(view);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        ViewTreeListenee viewTreeListenee = this.f7110b.get();
        View view = this.d.get();
        if (viewTreeListenee == null || view == null) {
            return;
        }
        if (viewTreeListenee.hasSetBiEvent()) {
            qsp.b(view, this);
        } else {
            viewTreeListenee.checkVisibilityAndSetBiEvent();
        }
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public void onScrollChanged() {
        ViewTreeListenee viewTreeListenee = this.f7110b.get();
        View view = this.d.get();
        if (viewTreeListenee == null || view == null) {
            return;
        }
        if (viewTreeListenee.hasSetBiEvent()) {
            qsp.c(view, this);
        } else {
            viewTreeListenee.checkVisibilityAndSetBiEvent();
        }
    }

    public static boolean c(View view) {
        if (view == null || view.getVisibility() != 0) {
            return false;
        }
        return view.getLocalVisibleRect(new Rect());
    }

    public static void c(View view, ViewTreeVisibilityListener viewTreeVisibilityListener) {
        c(view, viewTreeVisibilityListener, 300L);
    }

    public static void c(final View view, final ViewTreeVisibilityListener viewTreeVisibilityListener, long j) {
        HandlerExecutor.c(new Runnable() { // from class: com.huawei.health.health.utils.vippage.ViewTreeVisibilityListener.3
            @Override // java.lang.Runnable
            public void run() {
                qsp.a(view, (ViewTreeObserver.OnGlobalLayoutListener) viewTreeVisibilityListener);
                qsp.a(view, (ViewTreeObserver.OnScrollChangedListener) viewTreeVisibilityListener);
            }
        }, j);
    }
}
