package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: loaded from: classes.dex */
public final class pah implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f30167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f30168b;
    public final Runnable c;

    public pah(View view, Runnable runnable) {
        this.f30167a = view;
        this.f30168b = view.getViewTreeObserver();
        this.c = runnable;
    }

    public static pah a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        pah pahVar = new pah(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(pahVar);
        view.addOnAttachStateChangeListener(pahVar);
        return pahVar;
    }

    public void b() {
        if (this.f30168b.isAlive()) {
            this.f30168b.removeOnPreDrawListener(this);
        } else {
            this.f30167a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f30167a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f30168b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
