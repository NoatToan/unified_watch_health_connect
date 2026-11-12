package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes14.dex */
public class ClippableRoundedCornerLayout extends FrameLayout {
    private float cornerRadius;
    private Path path;

    public ClippableRoundedCornerLayout(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (this.path == null) {
            super.dispatchDraw(canvas);
            return;
        }
        int iSave = canvas.save();
        canvas.clipPath(this.path);
        super.dispatchDraw(canvas);
        canvas.restoreToCount(iSave);
    }

    public float getCornerRadius() {
        return this.cornerRadius;
    }

    public void resetClipBoundsAndCornerRadius() {
        this.path = null;
        this.cornerRadius = 0.0f;
        invalidate();
    }

    public void updateClipBoundsAndCornerRadius(RectF rectF, float f14) {
        if (this.path == null) {
            this.path = new Path();
        }
        this.cornerRadius = f14;
        this.path.reset();
        this.path.addRoundRect(rectF, f14, f14, Path.Direction.CW);
        this.path.close();
        invalidate();
    }

    public void updateCornerRadius(float f14) {
        updateClipBoundsAndCornerRadius(getLeft(), getTop(), getRight(), getBottom(), f14);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ClippableRoundedCornerLayout(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
    }

    public void updateClipBoundsAndCornerRadius(float f14, float f15, float f16, float f17, float f18) {
        updateClipBoundsAndCornerRadius(new RectF(f14, f15, f16, f17), f18);
    }

    public void updateClipBoundsAndCornerRadius(Rect rect, float f14) {
        updateClipBoundsAndCornerRadius(rect.left, rect.top, rect.right, rect.bottom, f14);
    }
}
