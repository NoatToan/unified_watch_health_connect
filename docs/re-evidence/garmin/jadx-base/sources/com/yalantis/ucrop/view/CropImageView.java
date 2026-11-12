package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.AsyncTask;
import android.util.AttributeSet;
import com.yalantis.ucrop.R;
import com.yalantis.ucrop.callback.BitmapCropCallback;
import com.yalantis.ucrop.callback.CropBoundsChangeListener;
import com.yalantis.ucrop.model.CropParameters;
import com.yalantis.ucrop.model.ImageState;
import com.yalantis.ucrop.task.BitmapCropTask;
import com.yalantis.ucrop.util.CubicEasing;
import com.yalantis.ucrop.util.RectUtils;
import hb.a;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import vb.h;

/* JADX INFO: loaded from: classes3.dex */
public class CropImageView extends TransformImageView {
    public static final float DEFAULT_ASPECT_RATIO = 0.0f;
    public static final int DEFAULT_IMAGE_TO_CROP_BOUNDS_ANIM_DURATION = 500;
    public static final int DEFAULT_MAX_BITMAP_SIZE = 0;
    public static final float DEFAULT_MAX_SCALE_MULTIPLIER = 10.0f;
    public static final float SOURCE_IMAGE_ASPECT_RATIO = 0.0f;
    private CropBoundsChangeListener mCropBoundsChangeListener;
    private final RectF mCropRect;
    private long mImageToWrapCropBoundsAnimDuration;
    private int mMaxResultImageSizeX;
    private int mMaxResultImageSizeY;
    private float mMaxScale;
    private float mMaxScaleMultiplier;
    private float mMinScale;
    private float mTargetAspectRatio;
    private final Matrix mTempMatrix;
    private Runnable mWrapCropBoundsRunnable;
    private Runnable mZoomImageToPositionRunnable;

    public static class WrapCropBoundsRunnable implements Runnable {
        private final float mCenterDiffX;
        private final float mCenterDiffY;
        private final WeakReference<CropImageView> mCropImageView;
        private final float mDeltaScale;
        private final long mDurationMs;
        private final float mOldScale;
        private final float mOldX;
        private final float mOldY;
        private final long mStartTime = System.currentTimeMillis();
        private final boolean mWillBeImageInBoundsAfterTranslate;

        public WrapCropBoundsRunnable(CropImageView cropImageView, long j8, float f14, float f15, float f16, float f17, float f18, float f19, boolean z14) {
            this.mCropImageView = new WeakReference<>(cropImageView);
            this.mDurationMs = j8;
            this.mOldX = f14;
            this.mOldY = f15;
            this.mCenterDiffX = f16;
            this.mCenterDiffY = f17;
            this.mOldScale = f18;
            this.mDeltaScale = f19;
            this.mWillBeImageInBoundsAfterTranslate = z14;
        }

        @Override // java.lang.Runnable
        public void run() {
            CropImageView cropImageView = this.mCropImageView.get();
            if (cropImageView == null) {
                return;
            }
            float fMin = Math.min(this.mDurationMs, System.currentTimeMillis() - this.mStartTime);
            float fEaseOut = CubicEasing.easeOut(fMin, 0.0f, this.mCenterDiffX, this.mDurationMs);
            float fEaseOut2 = CubicEasing.easeOut(fMin, 0.0f, this.mCenterDiffY, this.mDurationMs);
            float fEaseInOut = CubicEasing.easeInOut(fMin, 0.0f, this.mDeltaScale, this.mDurationMs);
            if (fMin < this.mDurationMs) {
                float[] fArr = cropImageView.mCurrentImageCenter;
                cropImageView.postTranslate(fEaseOut - (fArr[0] - this.mOldX), fEaseOut2 - (fArr[1] - this.mOldY));
                if (!this.mWillBeImageInBoundsAfterTranslate) {
                    cropImageView.zoomInImage(this.mOldScale + fEaseInOut, cropImageView.mCropRect.centerX(), cropImageView.mCropRect.centerY());
                }
                if (cropImageView.isImageWrapCropBounds()) {
                    return;
                }
                cropImageView.post(this);
            }
        }
    }

    public static class ZoomImageToPosition implements Runnable {
        private final WeakReference<CropImageView> mCropImageView;
        private final float mDeltaScale;
        private final float mDestX;
        private final float mDestY;
        private final long mDurationMs;
        private final float mOldScale;
        private final long mStartTime = System.currentTimeMillis();

        public ZoomImageToPosition(CropImageView cropImageView, long j8, float f14, float f15, float f16, float f17) {
            this.mCropImageView = new WeakReference<>(cropImageView);
            this.mDurationMs = j8;
            this.mOldScale = f14;
            this.mDeltaScale = f15;
            this.mDestX = f16;
            this.mDestY = f17;
        }

        @Override // java.lang.Runnable
        public void run() {
            CropImageView cropImageView = this.mCropImageView.get();
            if (cropImageView == null) {
                return;
            }
            float fMin = Math.min(this.mDurationMs, System.currentTimeMillis() - this.mStartTime);
            float fEaseInOut = CubicEasing.easeInOut(fMin, 0.0f, this.mDeltaScale, this.mDurationMs);
            if (fMin >= this.mDurationMs) {
                cropImageView.setImageToWrapCropBounds();
            } else {
                cropImageView.zoomInImage(this.mOldScale + fEaseInOut, this.mDestX, this.mDestY);
                cropImageView.post(this);
            }
        }
    }

    public CropImageView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.mCropRect = new RectF();
        this.mTempMatrix = new Matrix();
        this.mMaxScaleMultiplier = 10.0f;
        this.mZoomImageToPositionRunnable = null;
        this.mMaxResultImageSizeX = 0;
        this.mMaxResultImageSizeY = 0;
        this.mImageToWrapCropBoundsAnimDuration = 500L;
    }

    private float[] calculateImageIndents() {
        this.mTempMatrix.reset();
        this.mTempMatrix.setRotate(-getCurrentAngle());
        float[] fArr = this.mCurrentImageCorners;
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        float[] cornersFromRect = RectUtils.getCornersFromRect(this.mCropRect);
        this.mTempMatrix.mapPoints(fArrCopyOf);
        this.mTempMatrix.mapPoints(cornersFromRect);
        RectF rectFTrapToRect = RectUtils.trapToRect(fArrCopyOf);
        RectF rectFTrapToRect2 = RectUtils.trapToRect(cornersFromRect);
        float f14 = rectFTrapToRect.left - rectFTrapToRect2.left;
        float f15 = rectFTrapToRect.top - rectFTrapToRect2.top;
        float f16 = rectFTrapToRect.right - rectFTrapToRect2.right;
        float f17 = rectFTrapToRect.bottom - rectFTrapToRect2.bottom;
        if (f14 <= 0.0f) {
            f14 = 0.0f;
        }
        if (f15 <= 0.0f) {
            f15 = 0.0f;
        }
        if (f16 >= 0.0f) {
            f16 = 0.0f;
        }
        if (f17 >= 0.0f) {
            f17 = 0.0f;
        }
        float[] fArr2 = {f14, f15, f16, f17};
        this.mTempMatrix.reset();
        this.mTempMatrix.setRotate(getCurrentAngle());
        this.mTempMatrix.mapPoints(fArr2);
        return fArr2;
    }

    private void calculateImageScaleBounds(float f14, float f15) {
        float fMin = Math.min(Math.min(this.mCropRect.width() / f14, this.mCropRect.width() / f15), Math.min(this.mCropRect.height() / f15, this.mCropRect.height() / f14));
        this.mMinScale = fMin;
        this.mMaxScale = fMin * this.mMaxScaleMultiplier;
    }

    private void setupInitialImagePosition(float f14, float f15) {
        float fWidth = this.mCropRect.width();
        float fHeight = this.mCropRect.height();
        float fMax = Math.max(this.mCropRect.width() / f14, this.mCropRect.height() / f15);
        float fC = a.c(f14, fMax, fWidth, 2.0f);
        RectF rectF = this.mCropRect;
        float f16 = fC + rectF.left;
        float fC2 = a.c(f15, fMax, fHeight, 2.0f) + rectF.top;
        this.mCurrentImageMatrix.reset();
        this.mCurrentImageMatrix.postScale(fMax, fMax);
        this.mCurrentImageMatrix.postTranslate(f16, fC2);
        setImageMatrix(this.mCurrentImageMatrix);
    }

    public void cancelAllAnimations() {
        removeCallbacks(this.mWrapCropBoundsRunnable);
        removeCallbacks(this.mZoomImageToPositionRunnable);
    }

    public void cropAndSaveImage(Bitmap.CompressFormat compressFormat, int i14, BitmapCropCallback bitmapCropCallback) {
        cancelAllAnimations();
        setImageToWrapCropBounds(false);
        new BitmapCropTask(getContext(), getViewBitmap(), new ImageState(this.mCropRect, RectUtils.trapToRect(this.mCurrentImageCorners), getCurrentScale(), getCurrentAngle()), new CropParameters(this.mMaxResultImageSizeX, this.mMaxResultImageSizeY, compressFormat, i14, getImageInputPath(), getImageOutputPath(), getExifInfo()), bitmapCropCallback).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public CropBoundsChangeListener getCropBoundsChangeListener() {
        return this.mCropBoundsChangeListener;
    }

    public float getMaxScale() {
        return this.mMaxScale;
    }

    public float getMinScale() {
        return this.mMinScale;
    }

    public float getTargetAspectRatio() {
        return this.mTargetAspectRatio;
    }

    public boolean isImageWrapCropBounds(float[] fArr) {
        this.mTempMatrix.reset();
        this.mTempMatrix.setRotate(-getCurrentAngle());
        float[] fArrCopyOf = Arrays.copyOf(fArr, fArr.length);
        this.mTempMatrix.mapPoints(fArrCopyOf);
        float[] cornersFromRect = RectUtils.getCornersFromRect(this.mCropRect);
        this.mTempMatrix.mapPoints(cornersFromRect);
        return RectUtils.trapToRect(fArrCopyOf).contains(RectUtils.trapToRect(cornersFromRect));
    }

    @Override // com.yalantis.ucrop.view.TransformImageView
    public void onImageLaidOut() {
        super.onImageLaidOut();
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        float intrinsicWidth = drawable.getIntrinsicWidth();
        float intrinsicHeight = drawable.getIntrinsicHeight();
        if (this.mTargetAspectRatio == 0.0f) {
            this.mTargetAspectRatio = intrinsicWidth / intrinsicHeight;
        }
        int i14 = this.mThisWidth;
        float f14 = this.mTargetAspectRatio;
        int i15 = (int) (i14 / f14);
        int i16 = this.mThisHeight;
        RectF rectF = this.mCropRect;
        if (i15 > i16) {
            int i17 = (int) (i16 * f14);
            int i18 = (i14 - i17) / 2;
            rectF.set(i18, 0.0f, i17 + i18, i16);
        } else {
            int i19 = (i16 - i15) / 2;
            rectF.set(0.0f, i19, i14, i15 + i19);
        }
        calculateImageScaleBounds(intrinsicWidth, intrinsicHeight);
        setupInitialImagePosition(intrinsicWidth, intrinsicHeight);
        CropBoundsChangeListener cropBoundsChangeListener = this.mCropBoundsChangeListener;
        if (cropBoundsChangeListener != null) {
            cropBoundsChangeListener.onCropAspectRatioChanged(this.mTargetAspectRatio);
        }
        TransformImageView.TransformImageListener transformImageListener = this.mTransformImageListener;
        if (transformImageListener != null) {
            transformImageListener.onScale(getCurrentScale());
            this.mTransformImageListener.onRotate(getCurrentAngle());
        }
    }

    public void postRotate(float f14) {
        postRotate(f14, this.mCropRect.centerX(), this.mCropRect.centerY());
    }

    @Override // com.yalantis.ucrop.view.TransformImageView
    public void postScale(float f14, float f15, float f16) {
        if (f14 > 1.0f && getCurrentScale() * f14 <= getMaxScale()) {
            super.postScale(f14, f15, f16);
        } else {
            if (f14 >= 1.0f || getCurrentScale() * f14 < getMinScale()) {
                return;
            }
            super.postScale(f14, f15, f16);
        }
    }

    public void processStyledAttributes(TypedArray typedArray) {
        float fAbs = Math.abs(typedArray.getFloat(R.styleable.ucrop_UCropView_ucrop_aspect_ratio_x, 0.0f));
        float fAbs2 = Math.abs(typedArray.getFloat(R.styleable.ucrop_UCropView_ucrop_aspect_ratio_y, 0.0f));
        if (fAbs == 0.0f || fAbs2 == 0.0f) {
            this.mTargetAspectRatio = 0.0f;
        } else {
            this.mTargetAspectRatio = fAbs / fAbs2;
        }
    }

    public void setCropBoundsChangeListener(CropBoundsChangeListener cropBoundsChangeListener) {
        this.mCropBoundsChangeListener = cropBoundsChangeListener;
    }

    public void setCropRect(RectF rectF) {
        this.mTargetAspectRatio = rectF.width() / rectF.height();
        this.mCropRect.set(rectF.left - getPaddingLeft(), rectF.top - getPaddingTop(), rectF.right - getPaddingRight(), rectF.bottom - getPaddingBottom());
        calculateImageScaleBounds();
        setImageToWrapCropBounds();
    }

    public void setImageToWrapCropBounds(boolean z14) {
        float f14;
        float fMax;
        if (!this.mBitmapLaidOut || isImageWrapCropBounds()) {
            return;
        }
        float[] fArr = this.mCurrentImageCenter;
        float f15 = fArr[0];
        float f16 = fArr[1];
        float currentScale = getCurrentScale();
        float fCenterX = this.mCropRect.centerX() - f15;
        float fCenterY = this.mCropRect.centerY() - f16;
        this.mTempMatrix.reset();
        this.mTempMatrix.setTranslate(fCenterX, fCenterY);
        float[] fArr2 = this.mCurrentImageCorners;
        float[] fArrCopyOf = Arrays.copyOf(fArr2, fArr2.length);
        this.mTempMatrix.mapPoints(fArrCopyOf);
        boolean zIsImageWrapCropBounds = isImageWrapCropBounds(fArrCopyOf);
        if (zIsImageWrapCropBounds) {
            float[] fArrCalculateImageIndents = calculateImageIndents();
            float f17 = -(fArrCalculateImageIndents[0] + fArrCalculateImageIndents[2]);
            fCenterY = -(fArrCalculateImageIndents[1] + fArrCalculateImageIndents[3]);
            fMax = 0.0f;
            f14 = f17;
        } else {
            RectF rectF = new RectF(this.mCropRect);
            this.mTempMatrix.reset();
            this.mTempMatrix.setRotate(getCurrentAngle());
            this.mTempMatrix.mapRect(rectF);
            float[] rectSidesFromCorners = RectUtils.getRectSidesFromCorners(this.mCurrentImageCorners);
            f14 = fCenterX;
            fMax = (Math.max(rectF.width() / rectSidesFromCorners[0], rectF.height() / rectSidesFromCorners[1]) * currentScale) - currentScale;
        }
        float f18 = fCenterY;
        if (z14) {
            WrapCropBoundsRunnable wrapCropBoundsRunnable = new WrapCropBoundsRunnable(this, this.mImageToWrapCropBoundsAnimDuration, f15, f16, f14, f18, currentScale, fMax, zIsImageWrapCropBounds);
            this.mWrapCropBoundsRunnable = wrapCropBoundsRunnable;
            post(wrapCropBoundsRunnable);
        } else {
            postTranslate(f14, f18);
            if (zIsImageWrapCropBounds) {
                return;
            }
            zoomInImage(currentScale + fMax, this.mCropRect.centerX(), this.mCropRect.centerY());
        }
    }

    public void setImageToWrapCropBoundsAnimDuration(long j8) {
        if (j8 > 0) {
            this.mImageToWrapCropBoundsAnimDuration = j8;
        } else {
            h.s("Animation duration cannot be negative value.");
        }
    }

    public void setMaxResultImageSizeX(int i14) {
        this.mMaxResultImageSizeX = i14;
    }

    public void setMaxResultImageSizeY(int i14) {
        this.mMaxResultImageSizeY = i14;
    }

    public void setMaxScaleMultiplier(float f14) {
        this.mMaxScaleMultiplier = f14;
    }

    public void setTargetAspectRatio(float f14) {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            this.mTargetAspectRatio = f14;
            return;
        }
        if (f14 == 0.0f) {
            this.mTargetAspectRatio = drawable.getIntrinsicWidth() / drawable.getIntrinsicHeight();
        } else {
            this.mTargetAspectRatio = f14;
        }
        CropBoundsChangeListener cropBoundsChangeListener = this.mCropBoundsChangeListener;
        if (cropBoundsChangeListener != null) {
            cropBoundsChangeListener.onCropAspectRatioChanged(this.mTargetAspectRatio);
        }
    }

    public void zoomImageToPosition(float f14, float f15, float f16, long j8) {
        if (f14 > getMaxScale()) {
            f14 = getMaxScale();
        }
        float currentScale = getCurrentScale();
        ZoomImageToPosition zoomImageToPosition = new ZoomImageToPosition(this, j8, currentScale, f14 - currentScale, f15, f16);
        this.mZoomImageToPositionRunnable = zoomImageToPosition;
        post(zoomImageToPosition);
    }

    public void zoomInImage(float f14, float f15, float f16) {
        if (f14 <= getMaxScale()) {
            postScale(f14 / getCurrentScale(), f15, f16);
        }
    }

    public void zoomOutImage(float f14, float f15, float f16) {
        if (f14 >= getMinScale()) {
            postScale(f14 / getCurrentScale(), f15, f16);
        }
    }

    public void zoomInImage(float f14) {
        zoomInImage(f14, this.mCropRect.centerX(), this.mCropRect.centerY());
    }

    public void zoomOutImage(float f14) {
        zoomOutImage(f14, this.mCropRect.centerX(), this.mCropRect.centerY());
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CropImageView(Context context) {
        this(context, null);
    }

    private void calculateImageScaleBounds() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        calculateImageScaleBounds(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
    }

    public boolean isImageWrapCropBounds() {
        return isImageWrapCropBounds(this.mCurrentImageCorners);
    }

    public void setImageToWrapCropBounds() {
        setImageToWrapCropBounds(true);
    }
}
