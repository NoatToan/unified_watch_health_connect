package com.google.android.material.shape;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import com.google.android.material.canvas.CanvasCompat;

/* JADX INFO: loaded from: classes14.dex */
public abstract class ShapeableDelegate {
    ShapeAppearanceModel shapeAppearanceModel;
    boolean forceCompatClippingEnabled = false;
    boolean offsetZeroCornerEdgeBoundsEnabled = false;
    RectF maskBounds = new RectF();
    final Path shapePath = new Path();

    public static ShapeableDelegate create(View view2) {
        return Build.VERSION.SDK_INT >= 33 ? new ShapeableDelegateV33(view2) : new ShapeableDelegateV22(view2);
    }

    private boolean isMaskBoundsValid() {
        RectF rectF = this.maskBounds;
        return rectF.left <= rectF.right && rectF.top <= rectF.bottom;
    }

    private void updateShapePath() {
        if (!isMaskBoundsValid() || this.shapeAppearanceModel == null) {
            return;
        }
        ShapeAppearancePathProvider.getInstance().calculatePath(this.shapeAppearanceModel, 1.0f, this.maskBounds, this.shapePath);
    }

    public abstract void invalidateClippingMethod(View view2);

    public boolean isForceCompatClippingEnabled() {
        return this.forceCompatClippingEnabled;
    }

    public void maybeClip(Canvas canvas, CanvasCompat.CanvasOperation canvasOperation) {
        if (!shouldUseCompatClipping() || this.shapePath.isEmpty()) {
            canvasOperation.run(canvas);
            return;
        }
        canvas.save();
        canvas.clipPath(this.shapePath);
        canvasOperation.run(canvas);
        canvas.restore();
    }

    public void onMaskChanged(View view2, RectF rectF) {
        this.maskBounds = rectF;
        updateShapePath();
        invalidateClippingMethod(view2);
    }

    public void onShapeAppearanceChanged(View view2, ShapeAppearanceModel shapeAppearanceModel) {
        this.shapeAppearanceModel = shapeAppearanceModel;
        updateShapePath();
        invalidateClippingMethod(view2);
    }

    public void setForceCompatClippingEnabled(View view2, boolean z14) {
        if (z14 != this.forceCompatClippingEnabled) {
            this.forceCompatClippingEnabled = z14;
            invalidateClippingMethod(view2);
        }
    }

    public void setOffsetZeroCornerEdgeBoundsEnabled(View view2, boolean z14) {
        this.offsetZeroCornerEdgeBoundsEnabled = z14;
        invalidateClippingMethod(view2);
    }

    public abstract boolean shouldUseCompatClipping();
}
