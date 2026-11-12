package androidx.core.view;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class c0 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f6407a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f6408b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f6409c;

    private c0(View view2, Runnable runnable) {
        this.f6407a = view2;
        this.f6408b = view2.getViewTreeObserver();
        this.f6409c = runnable;
    }

    public static void a(View view2, Runnable runnable) {
        if (view2 == null) {
            j20.x.l("view == null");
            return;
        }
        c0 c0Var = new c0(view2, runnable);
        view2.getViewTreeObserver().addOnPreDrawListener(c0Var);
        view2.addOnAttachStateChangeListener(c0Var);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        boolean zIsAlive = this.f6408b.isAlive();
        View view2 = this.f6407a;
        if (zIsAlive) {
            this.f6408b.removeOnPreDrawListener(this);
        } else {
            view2.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view2.removeOnAttachStateChangeListener(this);
        this.f6409c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view2) {
        this.f6408b = view2.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view2) {
        boolean zIsAlive = this.f6408b.isAlive();
        View view3 = this.f6407a;
        if (zIsAlive) {
            this.f6408b.removeOnPreDrawListener(this);
        } else {
            view3.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        view3.removeOnAttachStateChangeListener(this);
    }
}
