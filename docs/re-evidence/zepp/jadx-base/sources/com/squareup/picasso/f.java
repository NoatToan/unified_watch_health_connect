package com.squareup.picasso;

import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes18.dex */
class f implements ViewTreeObserver.OnPreDrawListener {
    public final RequestCreator a;
    public final WeakReference<ImageView> b;
    public Callback c;

    public f(RequestCreator requestCreator, ImageView imageView) {
        this(requestCreator, imageView, null);
    }

    public void a() {
        this.c = null;
        ImageView imageView = this.b.get();
        if (imageView == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        ImageView imageView = this.b.get();
        if (imageView == null) {
            return true;
        }
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (!viewTreeObserver.isAlive()) {
            return true;
        }
        int width = imageView.getWidth();
        int height = imageView.getHeight();
        if (width > 0 && height > 0) {
            viewTreeObserver.removeOnPreDrawListener(this);
            this.a.d().resize(width, height).into(imageView, this.c);
        }
        return true;
    }

    public f(RequestCreator requestCreator, ImageView imageView, Callback callback) {
        this.a = requestCreator;
        this.b = new WeakReference<>(imageView);
        this.c = callback;
        imageView.getViewTreeObserver().addOnPreDrawListener(this);
    }
}
