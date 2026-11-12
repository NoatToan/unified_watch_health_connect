package com.yalantis.ucrop.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.yalantis.ucrop.R;
import com.yalantis.ucrop.callback.OverlayViewChangeListener;
import com.yalantis.ucrop.util.RectUtils;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
public class OverlayView extends View {
    public static final boolean DEFAULT_CIRCLE_DIMMED_LAYER = false;
    public static final int DEFAULT_CROP_GRID_COLUMN_COUNT = 2;
    public static final int DEFAULT_CROP_GRID_ROW_COUNT = 2;
    public static final int DEFAULT_FREESTYLE_CROP_MODE = 0;
    public static final boolean DEFAULT_SHOW_CROP_FRAME = true;
    public static final boolean DEFAULT_SHOW_CROP_GRID = true;
    public static final int FREESTYLE_CROP_MODE_DISABLE = 0;
    public static final int FREESTYLE_CROP_MODE_ENABLE = 1;
    public static final int FREESTYLE_CROP_MODE_ENABLE_WITH_PASS_THROUGH = 2;
    private OverlayViewChangeListener mCallback;
    private boolean mCircleDimmedLayer;
    private Path mCircularPath;
    private Paint mCropFrameCornersPaint;
    private Paint mCropFramePaint;
    protected float[] mCropGridCenter;
    private int mCropGridColumnCount;
    protected float[] mCropGridCorners;
    private Paint mCropGridPaint;
    private int mCropGridRowCount;
    private int mCropRectCornerTouchAreaLineLength;
    private int mCropRectMinSize;
    private final RectF mCropViewRect;
    private int mCurrentTouchCornerIndex;
    private int mDimmedColor;
    private Paint mDimmedStrokePaint;
    private int mFreestyleCropMode;
    private float[] mGridPoints;
    private float mPreviousTouchX;
    private float mPreviousTouchY;
    private boolean mShouldSetupCropBounds;
    private boolean mShowCropFrame;
    private boolean mShowCropGrid;
    private float mTargetAspectRatio;
    private final RectF mTempRect;
    protected int mThisHeight;
    protected int mThisWidth;
    private int mTouchPointThreshold;

    @Retention(RetentionPolicy.SOURCE)
    public @interface FreestyleMode {
    }

    public OverlayView(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.mCropViewRect = new RectF();
        this.mTempRect = new RectF();
        this.mGridPoints = null;
        this.mCircularPath = new Path();
        this.mDimmedStrokePaint = new Paint(1);
        this.mCropGridPaint = new Paint(1);
        this.mCropFramePaint = new Paint(1);
        this.mCropFrameCornersPaint = new Paint(1);
        this.mFreestyleCropMode = 0;
        this.mPreviousTouchX = -1.0f;
        this.mPreviousTouchY = -1.0f;
        this.mCurrentTouchCornerIndex = -1;
        this.mTouchPointThreshold = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_threshold);
        this.mCropRectMinSize = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_min_size);
        this.mCropRectCornerTouchAreaLineLength = getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_rect_corner_touch_area_line_length);
        init();
    }

    private int getCurrentTouchIndex(float f14, float f15) {
        double d14 = this.mTouchPointThreshold;
        int i14 = -1;
        for (int i15 = 0; i15 < 8; i15 += 2) {
            double dSqrt = Math.sqrt(Math.pow(f15 - this.mCropGridCorners[i15 + 1], 2.0d) + Math.pow(f14 - this.mCropGridCorners[i15], 2.0d));
            if (dSqrt < d14) {
                i14 = i15 / 2;
                d14 = dSqrt;
            }
        }
        if (this.mFreestyleCropMode == 1 && i14 < 0 && this.mCropViewRect.contains(f14, f15)) {
            return 4;
        }
        return i14;
    }

    private void initCropFrameStyle(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.ucrop_UCropView_ucrop_frame_stroke_size, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_frame_stoke_width));
        int color = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_frame_color, getResources().getColor(R.color.ucrop_color_default_crop_frame));
        this.mCropFramePaint.setStrokeWidth(dimensionPixelSize);
        this.mCropFramePaint.setColor(color);
        Paint paint = this.mCropFramePaint;
        Paint.Style style = Paint.Style.STROKE;
        paint.setStyle(style);
        this.mCropFrameCornersPaint.setStrokeWidth(dimensionPixelSize * 3);
        this.mCropFrameCornersPaint.setColor(color);
        this.mCropFrameCornersPaint.setStyle(style);
    }

    private void initCropGridStyle(TypedArray typedArray) {
        int dimensionPixelSize = typedArray.getDimensionPixelSize(R.styleable.ucrop_UCropView_ucrop_grid_stroke_size, getResources().getDimensionPixelSize(R.dimen.ucrop_default_crop_grid_stoke_width));
        int color = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_grid_color, getResources().getColor(R.color.ucrop_color_default_crop_grid));
        this.mCropGridPaint.setStrokeWidth(dimensionPixelSize);
        this.mCropGridPaint.setColor(color);
        this.mCropGridRowCount = typedArray.getInt(R.styleable.ucrop_UCropView_ucrop_grid_row_count, 2);
        this.mCropGridColumnCount = typedArray.getInt(R.styleable.ucrop_UCropView_ucrop_grid_column_count, 2);
    }

    private void updateCropViewRect(float f14, float f15) {
        this.mTempRect.set(this.mCropViewRect);
        int i14 = this.mCurrentTouchCornerIndex;
        if (i14 == 0) {
            RectF rectF = this.mTempRect;
            RectF rectF2 = this.mCropViewRect;
            rectF.set(f14, f15, rectF2.right, rectF2.bottom);
        } else if (i14 == 1) {
            RectF rectF3 = this.mTempRect;
            RectF rectF4 = this.mCropViewRect;
            rectF3.set(rectF4.left, f15, f14, rectF4.bottom);
        } else if (i14 == 2) {
            RectF rectF5 = this.mTempRect;
            RectF rectF6 = this.mCropViewRect;
            rectF5.set(rectF6.left, rectF6.top, f14, f15);
        } else if (i14 == 3) {
            RectF rectF7 = this.mTempRect;
            RectF rectF8 = this.mCropViewRect;
            rectF7.set(f14, rectF8.top, rectF8.right, f15);
        } else if (i14 == 4) {
            this.mTempRect.offset(f14 - this.mPreviousTouchX, f15 - this.mPreviousTouchY);
            if (this.mTempRect.left <= getLeft() || this.mTempRect.top <= getTop() || this.mTempRect.right >= getRight() || this.mTempRect.bottom >= getBottom()) {
                return;
            }
            this.mCropViewRect.set(this.mTempRect);
            updateGridPoints();
            postInvalidate();
            return;
        }
        boolean z14 = this.mTempRect.height() >= ((float) this.mCropRectMinSize);
        boolean z15 = this.mTempRect.width() >= ((float) this.mCropRectMinSize);
        RectF rectF9 = this.mCropViewRect;
        rectF9.set(z15 ? this.mTempRect.left : rectF9.left, z14 ? this.mTempRect.top : rectF9.top, z15 ? this.mTempRect.right : rectF9.right, z14 ? this.mTempRect.bottom : rectF9.bottom);
        if (z14 || z15) {
            updateGridPoints();
            postInvalidate();
        }
    }

    private void updateGridPoints() {
        this.mCropGridCorners = RectUtils.getCornersFromRect(this.mCropViewRect);
        this.mCropGridCenter = RectUtils.getCenterFromRect(this.mCropViewRect);
        this.mGridPoints = null;
        this.mCircularPath.reset();
        this.mCircularPath.addCircle(this.mCropViewRect.centerX(), this.mCropViewRect.centerY(), Math.min(this.mCropViewRect.width(), this.mCropViewRect.height()) / 2.0f, Path.Direction.CW);
    }

    public void drawCropGrid(Canvas canvas) {
        if (this.mShowCropGrid) {
            if (this.mGridPoints == null && !this.mCropViewRect.isEmpty()) {
                this.mGridPoints = new float[(this.mCropGridColumnCount * 4) + (this.mCropGridRowCount * 4)];
                int i14 = 0;
                for (int i15 = 0; i15 < this.mCropGridRowCount; i15++) {
                    float[] fArr = this.mGridPoints;
                    RectF rectF = this.mCropViewRect;
                    fArr[i14] = rectF.left;
                    float f14 = i15 + 1.0f;
                    float fHeight = (f14 / (this.mCropGridRowCount + 1)) * rectF.height();
                    RectF rectF2 = this.mCropViewRect;
                    fArr[i14 + 1] = fHeight + rectF2.top;
                    float[] fArr2 = this.mGridPoints;
                    int i16 = i14 + 3;
                    fArr2[i14 + 2] = rectF2.right;
                    i14 += 4;
                    fArr2[i16] = ((f14 / (this.mCropGridRowCount + 1)) * rectF2.height()) + this.mCropViewRect.top;
                }
                for (int i17 = 0; i17 < this.mCropGridColumnCount; i17++) {
                    float[] fArr3 = this.mGridPoints;
                    float f15 = i17 + 1.0f;
                    float fWidth = (f15 / (this.mCropGridColumnCount + 1)) * this.mCropViewRect.width();
                    RectF rectF3 = this.mCropViewRect;
                    fArr3[i14] = fWidth + rectF3.left;
                    float[] fArr4 = this.mGridPoints;
                    fArr4[i14 + 1] = rectF3.top;
                    int i18 = i14 + 3;
                    float fWidth2 = (f15 / (this.mCropGridColumnCount + 1)) * rectF3.width();
                    RectF rectF4 = this.mCropViewRect;
                    fArr4[i14 + 2] = fWidth2 + rectF4.left;
                    i14 += 4;
                    this.mGridPoints[i18] = rectF4.bottom;
                }
            }
            float[] fArr5 = this.mGridPoints;
            if (fArr5 != null) {
                canvas.drawLines(fArr5, this.mCropGridPaint);
            }
        }
        if (this.mShowCropFrame) {
            canvas.drawRect(this.mCropViewRect, this.mCropFramePaint);
        }
        if (this.mFreestyleCropMode != 0) {
            canvas.save();
            this.mTempRect.set(this.mCropViewRect);
            RectF rectF5 = this.mTempRect;
            int i19 = this.mCropRectCornerTouchAreaLineLength;
            rectF5.inset(i19, -i19);
            RectF rectF6 = this.mTempRect;
            Region.Op op3 = Region.Op.DIFFERENCE;
            canvas.clipRect(rectF6, op3);
            this.mTempRect.set(this.mCropViewRect);
            RectF rectF7 = this.mTempRect;
            int i24 = this.mCropRectCornerTouchAreaLineLength;
            rectF7.inset(-i24, i24);
            canvas.clipRect(this.mTempRect, op3);
            canvas.drawRect(this.mCropViewRect, this.mCropFrameCornersPaint);
            canvas.restore();
        }
    }

    public void drawDimmedLayer(Canvas canvas) {
        canvas.save();
        if (this.mCircleDimmedLayer) {
            canvas.clipPath(this.mCircularPath, Region.Op.DIFFERENCE);
        } else {
            canvas.clipRect(this.mCropViewRect, Region.Op.DIFFERENCE);
        }
        canvas.drawColor(this.mDimmedColor);
        canvas.restore();
        if (this.mCircleDimmedLayer) {
            canvas.drawCircle(this.mCropViewRect.centerX(), this.mCropViewRect.centerY(), Math.min(this.mCropViewRect.width(), this.mCropViewRect.height()) / 2.0f, this.mDimmedStrokePaint);
        }
    }

    public RectF getCropViewRect() {
        return this.mCropViewRect;
    }

    public int getFreestyleCropMode() {
        return this.mFreestyleCropMode;
    }

    public OverlayViewChangeListener getOverlayViewChangeListener() {
        return this.mCallback;
    }

    public void init() {
    }

    @Deprecated
    public boolean isFreestyleCropEnabled() {
        return this.mFreestyleCropMode == 1;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        drawDimmedLayer(canvas);
        drawCropGrid(canvas);
    }

    @Override // android.view.View
    public void onLayout(boolean z14, int i14, int i15, int i16, int i17) {
        super.onLayout(z14, i14, i15, i16, i17);
        if (z14) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            this.mThisWidth = width - paddingLeft;
            this.mThisHeight = height - paddingTop;
            if (this.mShouldSetupCropBounds) {
                this.mShouldSetupCropBounds = false;
                setTargetAspectRatio(this.mTargetAspectRatio);
            }
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.mCropViewRect.isEmpty() && this.mFreestyleCropMode != 0) {
            float x14 = motionEvent.getX();
            float y14 = motionEvent.getY();
            if ((motionEvent.getAction() & 255) == 0) {
                int currentTouchIndex = getCurrentTouchIndex(x14, y14);
                this.mCurrentTouchCornerIndex = currentTouchIndex;
                boolean z14 = currentTouchIndex != -1;
                if (!z14) {
                    this.mPreviousTouchX = -1.0f;
                    this.mPreviousTouchY = -1.0f;
                    return z14;
                }
                if (this.mPreviousTouchX < 0.0f) {
                    this.mPreviousTouchX = x14;
                    this.mPreviousTouchY = y14;
                }
                return z14;
            }
            if ((motionEvent.getAction() & 255) == 2 && motionEvent.getPointerCount() == 1 && this.mCurrentTouchCornerIndex != -1) {
                float fMin = Math.min(Math.max(x14, getPaddingLeft()), getWidth() - getPaddingRight());
                float fMin2 = Math.min(Math.max(y14, getPaddingTop()), getHeight() - getPaddingBottom());
                updateCropViewRect(fMin, fMin2);
                this.mPreviousTouchX = fMin;
                this.mPreviousTouchY = fMin2;
                return true;
            }
            if ((motionEvent.getAction() & 255) == 1) {
                this.mPreviousTouchX = -1.0f;
                this.mPreviousTouchY = -1.0f;
                this.mCurrentTouchCornerIndex = -1;
                OverlayViewChangeListener overlayViewChangeListener = this.mCallback;
                if (overlayViewChangeListener != null) {
                    overlayViewChangeListener.onCropRectUpdated(this.mCropViewRect);
                }
            }
        }
        return false;
    }

    public void processStyledAttributes(TypedArray typedArray) {
        this.mCircleDimmedLayer = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_circle_dimmed_layer, false);
        int color = typedArray.getColor(R.styleable.ucrop_UCropView_ucrop_dimmed_color, getResources().getColor(R.color.ucrop_color_default_dimmed));
        this.mDimmedColor = color;
        this.mDimmedStrokePaint.setColor(color);
        this.mDimmedStrokePaint.setStyle(Paint.Style.STROKE);
        this.mDimmedStrokePaint.setStrokeWidth(1.0f);
        initCropFrameStyle(typedArray);
        this.mShowCropFrame = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_show_frame, true);
        initCropGridStyle(typedArray);
        this.mShowCropGrid = typedArray.getBoolean(R.styleable.ucrop_UCropView_ucrop_show_grid, true);
    }

    public void setCircleDimmedLayer(boolean z14) {
        this.mCircleDimmedLayer = z14;
    }

    public void setCropFrameColor(int i14) {
        this.mCropFramePaint.setColor(i14);
    }

    public void setCropFrameStrokeWidth(int i14) {
        this.mCropFramePaint.setStrokeWidth(i14);
    }

    public void setCropGridColor(int i14) {
        this.mCropGridPaint.setColor(i14);
    }

    public void setCropGridColumnCount(int i14) {
        this.mCropGridColumnCount = i14;
        this.mGridPoints = null;
    }

    public void setCropGridRowCount(int i14) {
        this.mCropGridRowCount = i14;
        this.mGridPoints = null;
    }

    public void setCropGridStrokeWidth(int i14) {
        this.mCropGridPaint.setStrokeWidth(i14);
    }

    public void setDimmedColor(int i14) {
        this.mDimmedColor = i14;
    }

    @Deprecated
    public void setFreestyleCropEnabled(boolean z14) {
        this.mFreestyleCropMode = z14 ? 1 : 0;
    }

    public void setFreestyleCropMode(int i14) {
        this.mFreestyleCropMode = i14;
        postInvalidate();
    }

    public void setOverlayViewChangeListener(OverlayViewChangeListener overlayViewChangeListener) {
        this.mCallback = overlayViewChangeListener;
    }

    public void setShowCropFrame(boolean z14) {
        this.mShowCropFrame = z14;
    }

    public void setShowCropGrid(boolean z14) {
        this.mShowCropGrid = z14;
    }

    public void setTargetAspectRatio(float f14) {
        this.mTargetAspectRatio = f14;
        if (this.mThisWidth <= 0) {
            this.mShouldSetupCropBounds = true;
        } else {
            setupCropBounds();
            postInvalidate();
        }
    }

    public void setupCropBounds() {
        int i14 = this.mThisWidth;
        float f14 = this.mTargetAspectRatio;
        int i15 = (int) (i14 / f14);
        int i16 = this.mThisHeight;
        RectF rectF = this.mCropViewRect;
        if (i15 > i16) {
            int i17 = (int) (i16 * f14);
            int i18 = (i14 - i17) / 2;
            rectF.set(getPaddingLeft() + i18, getPaddingTop(), getPaddingLeft() + i17 + i18, getPaddingTop() + this.mThisHeight);
        } else {
            int i19 = (i16 - i15) / 2;
            rectF.set(getPaddingLeft(), getPaddingTop() + i19, getPaddingLeft() + this.mThisWidth, getPaddingTop() + i15 + i19);
        }
        OverlayViewChangeListener overlayViewChangeListener = this.mCallback;
        if (overlayViewChangeListener != null) {
            overlayViewChangeListener.onCropRectUpdated(this.mCropViewRect);
        }
        updateGridPoints();
    }

    public OverlayView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public OverlayView(Context context) {
        this(context, null);
    }
}
