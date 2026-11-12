package io.sentry.android.core.internal.util;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.android.core.r0;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public class k implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public final Handler f21516a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public final AtomicReference<View> f21517b;

    @NotNull
    public final Runnable c;

    public class a implements View.OnAttachStateChangeListener {
        public a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            view.getViewTreeObserver().addOnDrawListener(k.this);
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    public k(@NotNull View view, @NotNull Runnable runnable) {
        this.f21517b = new AtomicReference<>(view);
        this.c = runnable;
    }

    public static boolean c(@NotNull View view) {
        return view.getViewTreeObserver().isAlive() && view.isAttachedToWindow();
    }

    public static /* synthetic */ void e(Window window, Window.Callback callback, Runnable runnable, r0 r0Var) {
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null) {
            window.setCallback(callback);
            g(viewPeekDecorView, runnable, r0Var);
        }
    }

    public static void f(@NotNull Activity activity, @NotNull final Runnable runnable, @NotNull final r0 r0Var) {
        final Window window = activity.getWindow();
        if (window != null) {
            View viewPeekDecorView = window.peekDecorView();
            if (viewPeekDecorView != null) {
                g(viewPeekDecorView, runnable, r0Var);
            } else {
                final Window.Callback callback = window.getCallback();
                window.setCallback(new io.sentry.android.core.performance.f(callback != null ? callback : new io.sentry.android.core.internal.gestures.b(), new Runnable() { // from class: io.sentry.android.core.internal.util.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.e(window, callback, runnable, r0Var);
                    }
                }));
            }
        }
    }

    public static void g(@NotNull View view, @NotNull Runnable runnable, @NotNull r0 r0Var) {
        k kVar = new k(view, runnable);
        if (r0Var.d() >= 26 || c(view)) {
            view.getViewTreeObserver().addOnDrawListener(kVar);
        } else {
            view.addOnAttachStateChangeListener(kVar.new a());
        }
    }

    public final /* synthetic */ void d(View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        final View andSet = this.f21517b.getAndSet(null);
        if (andSet == null) {
            return;
        }
        andSet.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: io.sentry.android.core.internal.util.j
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f21514a.d(andSet);
            }
        });
        this.f21516a.postAtFrontOfQueue(this.c);
    }
}
