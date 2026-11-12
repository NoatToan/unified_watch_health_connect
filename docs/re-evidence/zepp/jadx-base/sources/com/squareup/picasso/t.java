package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes18.dex */
final class t extends a<Target> {
    public t(Picasso picasso, Target target, Request request, int i, int i2, Drawable drawable, String str, Object obj, int i3) {
        super(picasso, target, request, i, i2, i3, drawable, str, obj, false);
    }

    @Override // com.squareup.picasso.a
    public void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        if (bitmap == null) {
            throw new AssertionError(String.format("Attempted to complete action with no result!\n%s", this));
        }
        Target targetK = k();
        if (targetK != null) {
            targetK.onBitmapLoaded(bitmap, loadedFrom);
            if (bitmap.isRecycled()) {
                throw new IllegalStateException("Target callback must not recycle bitmap!");
            }
        }
    }

    @Override // com.squareup.picasso.a
    public void c() {
        Target targetK = k();
        if (targetK != null) {
            if (this.g != 0) {
                targetK.onBitmapFailed(this.a.e.getResources().getDrawable(this.g));
            } else {
                targetK.onBitmapFailed(this.h);
            }
        }
    }
}
