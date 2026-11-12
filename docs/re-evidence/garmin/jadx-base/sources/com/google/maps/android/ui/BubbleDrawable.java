package com.google.maps.android.ui;

import a7.b;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.google.maps.android.R;

/* JADX INFO: loaded from: classes2.dex */
class BubbleDrawable extends Drawable {
    private int mColor = -1;
    private final Drawable mMask;
    private final Drawable mShadow;

    public BubbleDrawable(Context context) {
        this.mMask = b.getDrawable(context, R.drawable.amu_bubble_mask);
        this.mShadow = b.getDrawable(context, R.drawable.amu_bubble_shadow);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.mMask.draw(canvas);
        canvas.drawColor(this.mColor, PorterDuff.Mode.SRC_IN);
        this.mShadow.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(Rect rect) {
        return this.mMask.getPadding(rect);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i14) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i14, int i15, int i16, int i17) {
        this.mMask.setBounds(i14, i15, i16, i17);
        this.mShadow.setBounds(i14, i15, i16, i17);
    }

    public void setColor(int i14) {
        this.mColor = i14;
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        throw new UnsupportedOperationException();
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(Rect rect) {
        this.mMask.setBounds(rect);
        this.mShadow.setBounds(rect);
    }
}
