package com.github.mikephil.chartingv2.utils;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.View;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class ViewPortHandler {
    protected final Matrix mMatrixTouch = new Matrix();
    protected RectF mContentRect = new RectF();
    protected float mChartWidth = 0.0f;
    protected float mChartHeight = 0.0f;
    private float mMinScaleY = 1.0f;
    private float mMaxScaleY = Float.MAX_VALUE;
    private float mMinScaleX = 1.0f;
    private float mMaxScaleX = Float.MAX_VALUE;
    private float mScaleX = 1.0f;
    private float mScaleY = 1.0f;
    private float mTransX = 0.0f;
    private float mTransY = 0.0f;
    private float mTransOffsetX = 0.0f;
    private float mTransOffsetY = 0.0f;
    protected final float[] matrixBuffer = new float[9];

    public boolean canZoomInMoreX() {
        return this.mScaleX < this.mMaxScaleX;
    }

    public boolean canZoomInMoreY() {
        return this.mScaleY < this.mMaxScaleY;
    }

    public boolean canZoomOutMoreX() {
        return this.mScaleX > this.mMinScaleX;
    }

    public boolean canZoomOutMoreY() {
        return this.mScaleY > this.mMinScaleY;
    }

    public void centerViewPort(float[] fArr, View view2) {
        Matrix matrix = new Matrix();
        matrix.set(this.mMatrixTouch);
        matrix.postTranslate(-(fArr[0] - offsetLeft()), -(fArr[1] - offsetTop()));
        refresh(matrix, view2, true);
    }

    public float contentBottom() {
        return this.mContentRect.bottom;
    }

    public float contentHeight() {
        return this.mContentRect.height();
    }

    public float contentLeft() {
        return this.mContentRect.left;
    }

    public float contentRight() {
        return this.mContentRect.right;
    }

    public float contentTop() {
        return this.mContentRect.top;
    }

    public float contentWidth() {
        return this.mContentRect.width();
    }

    public Matrix fitScreen() {
        this.mMinScaleX = 1.0f;
        this.mMinScaleY = 1.0f;
        Matrix matrix = new Matrix();
        matrix.set(this.mMatrixTouch);
        float[] fArr = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        matrix.getValues(fArr);
        matrix.setValues(fArr);
        return matrix;
    }

    public float getChartHeight() {
        return this.mChartHeight;
    }

    public float getChartWidth() {
        return this.mChartWidth;
    }

    public PointF getContentCenter() {
        return new PointF(this.mContentRect.centerX(), this.mContentRect.centerY());
    }

    public RectF getContentRect() {
        return this.mContentRect;
    }

    public Matrix getMatrixTouch() {
        return this.mMatrixTouch;
    }

    public float getMaxScaleX() {
        return this.mMaxScaleX;
    }

    public float getMaxScaleY() {
        return this.mMaxScaleY;
    }

    public float getMinScaleX() {
        return this.mMinScaleX;
    }

    public float getMinScaleY() {
        return this.mMinScaleY;
    }

    public float getScaleX() {
        return this.mScaleX;
    }

    public float getScaleY() {
        return this.mScaleY;
    }

    public float getTransX() {
        return this.mTransX;
    }

    public float getTransY() {
        return this.mTransY;
    }

    public boolean hasChartDimens() {
        return this.mChartHeight > 0.0f && this.mChartWidth > 0.0f;
    }

    public boolean hasNoDragOffset() {
        return this.mTransOffsetX <= 0.0f && this.mTransOffsetY <= 0.0f;
    }

    public boolean isFullyZoomedOut() {
        return isFullyZoomedOutX() && isFullyZoomedOutY();
    }

    public boolean isFullyZoomedOutX() {
        float f14 = this.mScaleX;
        float f15 = this.mMinScaleX;
        return f14 <= f15 && f15 <= 1.0f;
    }

    public boolean isFullyZoomedOutY() {
        float f14 = this.mScaleY;
        float f15 = this.mMinScaleY;
        return f14 <= f15 && f15 <= 1.0f;
    }

    public boolean isInBounds(float f14, float f15) {
        return isInBoundsX(f14) && isInBoundsY(f15);
    }

    public boolean isInBoundsBottom(float f14) {
        return this.mContentRect.bottom >= ((float) ((int) (f14 * 100.0f))) / 100.0f;
    }

    public boolean isInBoundsLeft(float f14) {
        return this.mContentRect.left <= f14;
    }

    public boolean isInBoundsRight(float f14) {
        return this.mContentRect.right >= ((float) ((int) (f14 * 100.0f))) / 100.0f;
    }

    public boolean isInBoundsTop(float f14) {
        return this.mContentRect.top <= f14;
    }

    public boolean isInBoundsX(float f14) {
        return isInBoundsLeft(f14) && isInBoundsRight(f14);
    }

    public boolean isInBoundsY(float f14) {
        return isInBoundsTop(f14) && isInBoundsBottom(f14);
    }

    public void limitTransAndScale(Matrix matrix, RectF rectF) {
        float fWidth;
        float fHeight;
        matrix.getValues(this.matrixBuffer);
        float[] fArr = this.matrixBuffer;
        float f14 = fArr[2];
        float f15 = fArr[0];
        float f16 = fArr[5];
        float f17 = fArr[4];
        this.mScaleX = Math.min(Math.max(this.mMinScaleX, f15), this.mMaxScaleX);
        this.mScaleY = Math.min(Math.max(this.mMinScaleY, f17), this.mMaxScaleY);
        if (rectF != null) {
            fWidth = rectF.width();
            fHeight = rectF.height();
        } else {
            fWidth = 0.0f;
            fHeight = 0.0f;
        }
        this.mTransX = Math.min(Math.max(f14, ((this.mScaleX - 1.0f) * (-fWidth)) - this.mTransOffsetX), this.mTransOffsetX);
        float fMax = Math.max(Math.min(f16, ((this.mScaleY - 1.0f) * fHeight) + this.mTransOffsetY), -this.mTransOffsetY);
        this.mTransY = fMax;
        float[] fArr2 = this.matrixBuffer;
        fArr2[2] = this.mTransX;
        fArr2[0] = this.mScaleX;
        fArr2[5] = fMax;
        fArr2[4] = this.mScaleY;
        matrix.setValues(fArr2);
    }

    public float offsetBottom() {
        return this.mChartHeight - this.mContentRect.bottom;
    }

    public float offsetLeft() {
        return this.mContentRect.left;
    }

    public float offsetRight() {
        return this.mChartWidth - this.mContentRect.right;
    }

    public float offsetTop() {
        return this.mContentRect.top;
    }

    public Matrix refresh(Matrix matrix, View view2, boolean z14) {
        this.mMatrixTouch.set(matrix);
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
        if (z14) {
            view2.invalidate();
        }
        matrix.set(this.mMatrixTouch);
        return matrix;
    }

    public void restrainViewPort(float f14, float f15, float f16, float f17) {
        this.mContentRect.set(f14, f15, this.mChartWidth - f16, this.mChartHeight - f17);
    }

    public void setChartDimens(float f14, float f15) {
        float fOffsetLeft = offsetLeft();
        float fOffsetTop = offsetTop();
        float fOffsetRight = offsetRight();
        float fOffsetBottom = offsetBottom();
        this.mChartHeight = f15;
        this.mChartWidth = f14;
        restrainViewPort(fOffsetLeft, fOffsetTop, fOffsetRight, fOffsetBottom);
    }

    public void setDragOffsetX(float f14) {
        this.mTransOffsetX = Utils.convertDpToPixel(f14);
    }

    public void setDragOffsetY(float f14) {
        this.mTransOffsetY = Utils.convertDpToPixel(f14);
    }

    public void setMaximumScaleX(float f14) {
        this.mMaxScaleX = f14;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public void setMaximumScaleY(float f14) {
        this.mMaxScaleY = f14;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public void setMinMaxScaleX(float f14, float f15) {
        if (f14 < 1.0f) {
            f14 = 1.0f;
        }
        this.mMinScaleX = f14;
        this.mMaxScaleX = f15;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public void setMinimumScaleX(float f14) {
        if (f14 < 1.0f) {
            f14 = 1.0f;
        }
        this.mMinScaleX = f14;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public void setMinimumScaleY(float f14) {
        if (f14 < 1.0f) {
            f14 = 1.0f;
        }
        this.mMinScaleY = f14;
        limitTransAndScale(this.mMatrixTouch, this.mContentRect);
    }

    public Matrix setZoom(float f14, float f15) {
        Matrix matrix = new Matrix();
        matrix.set(this.mMatrixTouch);
        matrix.setScale(f14, f15);
        return matrix;
    }

    public Matrix translate(float[] fArr) {
        Matrix matrix = new Matrix();
        matrix.set(this.mMatrixTouch);
        matrix.postTranslate(-(fArr[0] - offsetLeft()), -(fArr[1] - offsetTop()));
        return matrix;
    }

    public Matrix zoom(float f14, float f15) {
        Matrix matrix = new Matrix();
        matrix.set(this.mMatrixTouch);
        matrix.postScale(f14, f15);
        return matrix;
    }

    public Matrix zoomIn(float f14, float f15) {
        Matrix matrix = new Matrix();
        matrix.set(this.mMatrixTouch);
        matrix.postScale(1.4f, 1.4f, f14, f15);
        return matrix;
    }

    public Matrix zoomOut(float f14, float f15) {
        Matrix matrix = new Matrix();
        matrix.set(this.mMatrixTouch);
        matrix.postScale(0.7f, 0.7f, f14, f15);
        return matrix;
    }

    public Matrix setZoom(float f14, float f15, float f16, float f17) {
        Matrix matrix = new Matrix();
        matrix.set(this.mMatrixTouch);
        matrix.setScale(f14, f15, f16, f17);
        return matrix;
    }

    public Matrix zoom(float f14, float f15, float f16, float f17) {
        Matrix matrix = new Matrix();
        matrix.set(this.mMatrixTouch);
        matrix.postScale(f14, f15, f16, f17);
        return matrix;
    }
}
