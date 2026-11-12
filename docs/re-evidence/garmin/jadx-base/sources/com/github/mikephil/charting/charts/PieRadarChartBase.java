package com.github.mikephil.charting.charts;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.github.mikephil.charting.animation.Easing;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.components.XAxis;
import com.github.mikephil.charting.data.ChartData;
import com.github.mikephil.charting.data.Entry;
import com.github.mikephil.charting.interfaces.datasets.IDataSet;
import com.github.mikephil.charting.listener.ChartTouchListener;
import com.github.mikephil.charting.listener.PieRadarChartTouchListener;
import com.github.mikephil.charting.utils.MPPointF;
import com.github.mikephil.charting.utils.Utils;

/* JADX INFO: loaded from: classes13.dex */
public abstract class PieRadarChartBase<T extends ChartData<? extends IDataSet<? extends Entry>>> extends Chart<T> {
    protected float mMinOffset;
    private float mRawRotationAngle;
    protected boolean mRotateEnabled;
    private float mRotationAngle;

    /* JADX INFO: renamed from: com.github.mikephil.charting.charts.PieRadarChartBase$2, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation;
        static final /* synthetic */ int[] $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment;

        static {
            int[] iArr = new int[Legend.LegendOrientation.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation = iArr;
            try {
                iArr[Legend.LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[Legend.LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Legend.LegendHorizontalAlignment.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment = iArr2;
            try {
                iArr2[Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[Legend.LegendVerticalAlignment.values().length];
            $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment = iArr3;
            try {
                iArr3[Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public PieRadarChartBase(Context context) {
        super(context);
        this.mRotationAngle = 270.0f;
        this.mRawRotationAngle = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void calcMinMax() {
    }

    /* JADX WARN: Code duplicated, block: B:19:0x007d  */
    /* JADX WARN: Code duplicated, block: B:55:0x0147  */
    @Override // com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        float requiredBaseOffset;
        float requiredBaseOffset2;
        float requiredBaseOffset3;
        float fConvertDpToPixel;
        float fMin;
        float fMin2;
        float f14;
        float fMin3;
        Legend legend = this.mLegend;
        float requiredBaseOffset4 = 0.0f;
        if (legend == null || !legend.isEnabled() || this.mLegend.isDrawInsideEnabled()) {
            requiredBaseOffset = 0.0f;
            requiredBaseOffset2 = 0.0f;
            requiredBaseOffset3 = 0.0f;
        } else {
            float fMin4 = Math.min(this.mLegend.mNeededWidth, this.mLegend.getMaxSizePercent() * this.mViewPortHandler.getChartWidth());
            int i14 = AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendOrientation[this.mLegend.getOrientation().ordinal()];
            if (i14 == 1) {
                if (this.mLegend.getHorizontalAlignment() != Legend.LegendHorizontalAlignment.LEFT && this.mLegend.getHorizontalAlignment() != Legend.LegendHorizontalAlignment.RIGHT) {
                    fConvertDpToPixel = 0.0f;
                } else if (this.mLegend.getVerticalAlignment() == Legend.LegendVerticalAlignment.CENTER) {
                    fConvertDpToPixel = Utils.convertDpToPixel(13.0f) + fMin4;
                } else {
                    fConvertDpToPixel = Utils.convertDpToPixel(8.0f) + fMin4;
                    Legend legend2 = this.mLegend;
                    float f15 = legend2.mNeededHeight + legend2.mTextHeightMax;
                    MPPointF center = getCenter();
                    float width = this.mLegend.getHorizontalAlignment() == Legend.LegendHorizontalAlignment.RIGHT ? (getWidth() - fConvertDpToPixel) + 15.0f : fConvertDpToPixel - 15.0f;
                    float f16 = f15 + 15.0f;
                    float fDistanceToCenter = distanceToCenter(width, f16);
                    MPPointF position = getPosition(center, getRadius(), getAngleForPoint(width, f16));
                    float fDistanceToCenter2 = distanceToCenter(position.f52828x, position.f52829y);
                    float fConvertDpToPixel2 = Utils.convertDpToPixel(5.0f);
                    if (f16 < center.f52829y || getHeight() - fConvertDpToPixel <= getWidth()) {
                        fConvertDpToPixel = fDistanceToCenter < fDistanceToCenter2 ? (fDistanceToCenter2 - fDistanceToCenter) + fConvertDpToPixel2 : 0.0f;
                    }
                    MPPointF.recycleInstance(center);
                    MPPointF.recycleInstance(position);
                }
                int i15 = AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendHorizontalAlignment[this.mLegend.getHorizontalAlignment().ordinal()];
                if (i15 == 1) {
                    fMin = 0.0f;
                    fMin2 = 0.0f;
                    requiredBaseOffset4 = fConvertDpToPixel;
                    fConvertDpToPixel = 0.0f;
                } else if (i15 == 2) {
                    fMin = 0.0f;
                    fMin2 = 0.0f;
                } else if (i15 == 3) {
                    int i16 = AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[this.mLegend.getVerticalAlignment().ordinal()];
                    if (i16 != 1) {
                        if (i16 != 2) {
                            fMin = 0.0f;
                            fConvertDpToPixel = 0.0f;
                        } else {
                            fMin = Math.min(this.mLegend.mNeededHeight, this.mLegend.getMaxSizePercent() * this.mViewPortHandler.getChartHeight());
                            fConvertDpToPixel = 0.0f;
                        }
                        fMin2 = fConvertDpToPixel;
                    } else {
                        fMin2 = Math.min(this.mLegend.mNeededHeight, this.mLegend.getMaxSizePercent() * this.mViewPortHandler.getChartHeight());
                        fMin = 0.0f;
                        fConvertDpToPixel = 0.0f;
                    }
                } else {
                    fMin = 0.0f;
                    fConvertDpToPixel = 0.0f;
                    fMin2 = fConvertDpToPixel;
                }
                float f17 = fMin2;
                f14 = fMin;
                fMin3 = f17;
            } else if (i14 == 2 && (this.mLegend.getVerticalAlignment() == Legend.LegendVerticalAlignment.TOP || this.mLegend.getVerticalAlignment() == Legend.LegendVerticalAlignment.BOTTOM)) {
                fMin3 = Math.min(this.mLegend.mNeededHeight + getRequiredLegendOffset(), this.mLegend.getMaxSizePercent() * this.mViewPortHandler.getChartHeight());
                int i17 = AnonymousClass2.$SwitchMap$com$github$mikephil$charting$components$Legend$LegendVerticalAlignment[this.mLegend.getVerticalAlignment().ordinal()];
                if (i17 == 1) {
                    fConvertDpToPixel = 0.0f;
                    f14 = fConvertDpToPixel;
                } else if (i17 != 2) {
                    fMin3 = 0.0f;
                    fConvertDpToPixel = 0.0f;
                    f14 = fConvertDpToPixel;
                } else {
                    f14 = fMin3;
                    fMin3 = 0.0f;
                    fConvertDpToPixel = 0.0f;
                }
            } else {
                fMin3 = 0.0f;
                fConvertDpToPixel = 0.0f;
                f14 = fConvertDpToPixel;
            }
            requiredBaseOffset4 += getRequiredBaseOffset();
            requiredBaseOffset2 = fConvertDpToPixel + getRequiredBaseOffset();
            requiredBaseOffset = fMin3 + getRequiredBaseOffset();
            requiredBaseOffset3 = f14 + getRequiredBaseOffset();
        }
        float fConvertDpToPixel3 = Utils.convertDpToPixel(this.mMinOffset);
        if (this instanceof RadarChart) {
            XAxis xAxis = getXAxis();
            if (xAxis.isEnabled() && xAxis.isDrawLabelsEnabled()) {
                fConvertDpToPixel3 = Math.max(fConvertDpToPixel3, xAxis.mLabelRotatedWidth);
            }
        }
        this.mViewPortHandler.restrainViewPort(Math.max(fConvertDpToPixel3, getExtraLeftOffset() + requiredBaseOffset4), Math.max(fConvertDpToPixel3, getExtraTopOffset() + requiredBaseOffset), Math.max(fConvertDpToPixel3, getExtraRightOffset() + requiredBaseOffset2), Math.max(fConvertDpToPixel3, Math.max(getRequiredBaseOffset(), getExtraBottomOffset() + requiredBaseOffset3)));
    }

    @Override // android.view.View
    public void computeScroll() {
        ChartTouchListener chartTouchListener = this.mChartTouchListener;
        if (chartTouchListener instanceof PieRadarChartTouchListener) {
            ((PieRadarChartTouchListener) chartTouchListener).computeScroll();
        }
    }

    public float distanceToCenter(float f14, float f15) {
        MPPointF centerOffsets = getCenterOffsets();
        float f16 = centerOffsets.f52828x;
        float f17 = f14 > f16 ? f14 - f16 : f16 - f14;
        float f18 = centerOffsets.f52829y;
        float fSqrt = (float) Math.sqrt(Math.pow(f15 > f18 ? f15 - f18 : f18 - f15, 2.0d) + Math.pow(f17, 2.0d));
        MPPointF.recycleInstance(centerOffsets);
        return fSqrt;
    }

    public float getAngleForPoint(float f14, float f15) {
        MPPointF centerOffsets = getCenterOffsets();
        double d14 = f14 - centerOffsets.f52828x;
        double d15 = f15 - centerOffsets.f52829y;
        float degrees = (float) Math.toDegrees(Math.acos(d15 / Math.sqrt((d15 * d15) + (d14 * d14))));
        if (f14 > centerOffsets.f52828x) {
            degrees = 360.0f - degrees;
        }
        float f16 = degrees + 90.0f;
        if (f16 > 360.0f) {
            f16 -= 360.0f;
        }
        MPPointF.recycleInstance(centerOffsets);
        return f16;
    }

    public float getDiameter() {
        RectF contentRect = this.mViewPortHandler.getContentRect();
        contentRect.left = getExtraLeftOffset() + contentRect.left;
        contentRect.top = getExtraTopOffset() + contentRect.top;
        contentRect.right -= getExtraRightOffset();
        contentRect.bottom -= getExtraBottomOffset();
        return Math.min(contentRect.width(), contentRect.height());
    }

    public abstract int getIndexForAngle(float f14);

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public int getMaxVisibleCount() {
        return this.mData.getEntryCount();
    }

    public float getMinOffset() {
        return this.mMinOffset;
    }

    public void getPosition(MPPointF mPPointF, float f14, float f15, MPPointF mPPointF2) {
        double d14 = f14;
        double d15 = f15;
        mPPointF2.f52828x = (float) ((Math.cos(Math.toRadians(d15)) * d14) + ((double) mPPointF.f52828x));
        mPPointF2.f52829y = (float) ((Math.sin(Math.toRadians(d15)) * d14) + ((double) mPPointF.f52829y));
    }

    public abstract float getRadius();

    public float getRawRotationAngle() {
        return this.mRawRotationAngle;
    }

    public abstract float getRequiredBaseOffset();

    public abstract float getRequiredLegendOffset();

    public float getRotationAngle() {
        return this.mRotationAngle;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMax() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public float getYChartMin() {
        return 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void init() {
        super.init();
        this.mChartTouchListener = new PieRadarChartTouchListener(this);
    }

    public boolean isRotationEnabled() {
        return this.mRotateEnabled;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void notifyDataSetChanged() {
        if (this.mData == null) {
            return;
        }
        calcMinMax();
        if (this.mLegend != null) {
            this.mLegendRenderer.computeLegend(this.mData);
        }
        calculateOffsets();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ChartTouchListener chartTouchListener;
        return (!this.mTouchEnabled || (chartTouchListener = this.mChartTouchListener) == null) ? super.onTouchEvent(motionEvent) : chartTouchListener.onTouch(this, motionEvent);
    }

    public void setMinOffset(float f14) {
        this.mMinOffset = f14;
    }

    public void setRotationAngle(float f14) {
        this.mRawRotationAngle = f14;
        this.mRotationAngle = Utils.getNormalizedAngle(f14);
    }

    public void setRotationEnabled(boolean z14) {
        this.mRotateEnabled = z14;
    }

    @SuppressLint({"NewApi"})
    public void spin(int i14, float f14, float f15, Easing.EasingFunction easingFunction) {
        setRotationAngle(f14);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "rotationAngle", f14, f15);
        objectAnimatorOfFloat.setDuration(i14);
        objectAnimatorOfFloat.setInterpolator(easingFunction);
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.github.mikephil.charting.charts.PieRadarChartBase.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                PieRadarChartBase.this.postInvalidate();
            }
        });
        objectAnimatorOfFloat.start();
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mRotationAngle = 270.0f;
        this.mRawRotationAngle = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet, int i14) {
        super(context, attributeSet, i14);
        this.mRotationAngle = 270.0f;
        this.mRawRotationAngle = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    public MPPointF getPosition(MPPointF mPPointF, float f14, float f15) {
        MPPointF mPPointF2 = MPPointF.getInstance(0.0f, 0.0f);
        getPosition(mPPointF, f14, f15, mPPointF2);
        return mPPointF2;
    }
}
