package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes18.dex */
class k extends a<ImageView> {
    public Callback m;

    public k(Picasso picasso, ImageView imageView, Request request, int i, int i2, int i3, Drawable drawable, String str, Object obj, Callback callback, boolean z) {
        super(picasso, imageView, request, i, i2, i3, drawable, str, obj, z);
        this.m = callback;
    }

    @Override // com.squareup.picasso.a
    public void a() {
        super.a();
        if (this.m != null) {
            this.m = null;
        }
    }

    @Override // com.squareup.picasso.a
    public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        ImageView imageView = (ImageView) this.c.get();
        if (imageView == null) {
            return;
        }
        Picasso picasso = this.a;
        o.c(imageView, picasso.e, bitmap, loadedFrom, this.d, picasso.m);
        Callback callback = this.m;
        if (callback != null) {
            callback.onSuccess();
        }
    }

    @Override // com.squareup.picasso.a
    public void c() {
        ImageView imageView = (ImageView) this.c.get();
        if (imageView == null) {
            return;
        }
        int i = this.g;
        if (i != 0) {
            imageView.setImageResource(i);
        } else {
            Drawable drawable = this.h;
            if (drawable != null) {
                imageView.setImageDrawable(drawable);
            }
        }
        Callback callback = this.m;
        if (callback != null) {
            callback.onError();
        }
    }
}
