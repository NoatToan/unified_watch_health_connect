package com.google.android.material.drawable;

import android.graphics.drawable.Drawable;
import k.a;

/* JADX INFO: loaded from: classes14.dex */
public class ScaledDrawableWrapper extends a {
    private final int height;
    private final int width;

    public ScaledDrawableWrapper(Drawable drawable, int i14, int i15) {
        super(drawable);
        this.width = i14;
        this.height = i15;
    }

    @Override // k.a, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.height;
    }

    @Override // k.a, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.width;
    }
}
