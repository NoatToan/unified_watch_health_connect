package com.github.mikephil.charting.charts;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
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

/* JADX INFO: loaded from: classes2.dex */
public abstract class PieRadarChartBase<T extends ChartData<? extends IDataSet<? extends Entry>>> extends Chart<T> {
    private float k;
    private float l;
    public float mMinOffset;
    public boolean mRotateEnabled;

    public class a implements ValueAnimator.AnimatorUpdateListener {
        public a() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            PieRadarChartBase.this.postInvalidate();
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;
        public static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[Legend.LegendOrientation.values().length];
            c = iArr;
            try {
                iArr[Legend.LegendOrientation.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[Legend.LegendOrientation.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[Legend.LegendHorizontalAlignment.values().length];
            b = iArr2;
            try {
                iArr2[Legend.LegendHorizontalAlignment.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[Legend.LegendHorizontalAlignment.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[Legend.LegendHorizontalAlignment.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            int[] iArr3 = new int[Legend.LegendVerticalAlignment.values().length];
            a = iArr3;
            try {
                iArr3[Legend.LegendVerticalAlignment.TOP.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[Legend.LegendVerticalAlignment.BOTTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public PieRadarChartBase(Context context) {
        super(context);
        this.k = 270.0f;
        this.l = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void calcMinMax() {
    }

    @Override // com.github.mikephil.charting.charts.Chart
    public void calculateOffsets() {
        float requiredBaseOffset;
        float requiredBaseOffset2;
        float requiredBaseOffset3;
        float fConvertDpToPixel;
        float fMin;
        float f;
        float f2;
        Legend legend = this.mLegend;
        float requiredBaseOffset4 = 0.0f;
        if (legend == null || !legend.isEnabled() || this.mLegend.isDrawInsideEnabled()) {
            requiredBaseOffset = 0.0f;
            requiredBaseOffset2 = 0.0f;
            requiredBaseOffset3 = 0.0f;
        } else {
            float fMin2 = Math.min(this.mLegend.mNeededWidth, this.mViewPortHandler.getChartWidth() * this.mLegend.getMaxSizePercent());
            int i = b.c[this.mLegend.getOrientation().ordinal()];
            if (i != 1) {
                if (i == 2 && (this.mLegend.getVerticalAlignment() == Legend.LegendVerticalAlignment.TOP || this.mLegend.getVerticalAlignment() == Legend.LegendVerticalAlignment.BOTTOM)) {
                    fMin = Math.min(this.mLegend.mNeededHeight + getRequiredLegendOffset(), this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent());
                    int i2 = b.a[this.mLegend.getVerticalAlignment().ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            f = fMin;
                            fConvertDpToPixel = 0.0f;
                        }
                        f2 = 0.0f;
                    } else {
                        f2 = fMin;
                        fConvertDpToPixel = 0.0f;
                        f = 0.0f;
                    }
                    requiredBaseOffset4 += getRequiredBaseOffset();
                    requiredBaseOffset = fConvertDpToPixel + getRequiredBaseOffset();
                    requiredBaseOffset3 = f2 + getRequiredBaseOffset();
                    requiredBaseOffset2 = f + getRequiredBaseOffset();
                }
                fConvertDpToPixel = 0.0f;
                f = 0.0f;
                f2 = 0.0f;
                requiredBaseOffset4 += getRequiredBaseOffset();
                requiredBaseOffset = fConvertDpToPixel + getRequiredBaseOffset();
                requiredBaseOffset3 = f2 + getRequiredBaseOffset();
                requiredBaseOffset2 = f + getRequiredBaseOffset();
            } else {
                if (this.mLegend.getHorizontalAlignment() != Legend.LegendHorizontalAlignment.LEFT && this.mLegend.getHorizontalAlignment() != Legend.LegendHorizontalAlignment.RIGHT) {
                    fConvertDpToPixel = 0.0f;
                } else if (this.mLegend.getVerticalAlignment() == Legend.LegendVerticalAlignment.CENTER) {
                    fConvertDpToPixel = fMin2 + Utils.convertDpToPixel(13.0f);
                } else {
                    fConvertDpToPixel = fMin2 + Utils.convertDpToPixel(8.0f);
                    Legend legend2 = this.mLegend;
                    float f3 = legend2.mNeededHeight + legend2.mTextHeightMax;
                    MPPointF center = getCenter();
                    float width = this.mLegend.getHorizontalAlignment() == Legend.LegendHorizontalAlignment.RIGHT ? (getWidth() - fConvertDpToPixel) + 15.0f : fConvertDpToPixel - 15.0f;
                    float f4 = f3 + 15.0f;
                    float fDistanceToCenter = distanceToCenter(width, f4);
                    MPPointF position = getPosition(center, getRadius(), getAngleForPoint(width, f4));
                    float fDistanceToCenter2 = distanceToCenter(position.x, position.y);
                    float fConvertDpToPixel2 = Utils.convertDpToPixel(5.0f);
                    if (f4 < center.y || getHeight() - fConvertDpToPixel <= getWidth()) {
                        fConvertDpToPixel = fDistanceToCenter < fDistanceToCenter2 ? fConvertDpToPixel2 + (fDistanceToCenter2 - fDistanceToCenter) : 0.0f;
                    }
                    MPPointF.recycleInstance(center);
                    MPPointF.recycleInstance(position);
                }
                int i3 = b.b[this.mLegend.getHorizontalAlignment().ordinal()];
                if (i3 != 1) {
                    if (i3 == 2) {
                        f = 0.0f;
                    } else if (i3 == 3) {
                        int i4 = b.a[this.mLegend.getVerticalAlignment().ordinal()];
                        if (i4 == 1) {
                            fMin = Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent());
                            f2 = fMin;
                            fConvertDpToPixel = 0.0f;
                            f = 0.0f;
                            requiredBaseOffset4 += getRequiredBaseOffset();
                            requiredBaseOffset = fConvertDpToPixel + getRequiredBaseOffset();
                            requiredBaseOffset3 = f2 + getRequiredBaseOffset();
                            requiredBaseOffset2 = f + getRequiredBaseOffset();
                        } else if (i4 == 2) {
                            fMin = Math.min(this.mLegend.mNeededHeight, this.mViewPortHandler.getChartHeight() * this.mLegend.getMaxSizePercent());
                            f = fMin;
                            fConvertDpToPixel = 0.0f;
                        }
                    }
                    f2 = 0.0f;
                    requiredBaseOffset4 += getRequiredBaseOffset();
                    requiredBaseOffset = fConvertDpToPixel + getRequiredBaseOffset();
                    requiredBaseOffset3 = f2 + getRequiredBaseOffset();
                    requiredBaseOffset2 = f + getRequiredBaseOffset();
                } else {
                    requiredBaseOffset4 = fConvertDpToPixel;
                }
                fConvertDpToPixel = 0.0f;
                f = 0.0f;
                f2 = 0.0f;
                requiredBaseOffset4 += getRequiredBaseOffset();
                requiredBaseOffset = fConvertDpToPixel + getRequiredBaseOffset();
                requiredBaseOffset3 = f2 + getRequiredBaseOffset();
                requiredBaseOffset2 = f + getRequiredBaseOffset();
            }
        }
        float fConvertDpToPixel3 = Utils.convertDpToPixel(this.mMinOffset);
        if (this instanceof RadarChart) {
            XAxis xAxis = getXAxis();
            if (xAxis.isEnabled() && xAxis.isDrawLabelsEnabled()) {
                fConvertDpToPixel3 = Math.max(fConvertDpToPixel3, xAxis.mLabelRotatedWidth);
            }
        }
        float extraTopOffset = requiredBaseOffset3 + getExtraTopOffset();
        float extraRightOffset = requiredBaseOffset + getExtraRightOffset();
        float extraBottomOffset = requiredBaseOffset2 + getExtraBottomOffset();
        float fMax = Math.max(fConvertDpToPixel3, requiredBaseOffset4 + getExtraLeftOffset());
        float fMax2 = Math.max(fConvertDpToPixel3, extraTopOffset);
        float fMax3 = Math.max(fConvertDpToPixel3, extraRightOffset);
        float fMax4 = Math.max(fConvertDpToPixel3, Math.max(getRequiredBaseOffset(), extraBottomOffset));
        this.mViewPortHandler.restrainViewPort(fMax, fMax2, fMax3, fMax4);
        if (this.mLogEnabled) {
            Log.i(Chart.LOG_TAG, "offsetLeft: " + fMax + ", offsetTop: " + fMax2 + ", offsetRight: " + fMax3 + ", offsetBottom: " + fMax4);
        }
    }

    @Override // android.view.View
    public void computeScroll() {
        ChartTouchListener chartTouchListener = this.mChartTouchListener;
        if (chartTouchListener instanceof PieRadarChartTouchListener) {
            ((PieRadarChartTouchListener) chartTouchListener).computeScroll();
        }
    }

    public float distanceToCenter(float f, float f2) {
        MPPointF centerOffsets = getCenterOffsets();
        float f3 = centerOffsets.x;
        float f4 = f > f3 ? f - f3 : f3 - f;
        float f5 = centerOffsets.y;
        float fSqrt = (float) Math.sqrt(Math.pow(f4, 2.0d) + Math.pow(f2 > f5 ? f2 - f5 : f5 - f2, 2.0d));
        MPPointF.recycleInstance(centerOffsets);
        return fSqrt;
    }

    public float getAngleForPoint(float f, float f2) {
        MPPointF centerOffsets = getCenterOffsets();
        double d = f - centerOffsets.x;
        double d2 = f2 - centerOffsets.y;
        float degrees = (float) Math.toDegrees(Math.acos(d2 / Math.sqrt((d * d) + (d2 * d2))));
        if (f > centerOffsets.x) {
            degrees = 360.0f - degrees;
        }
        float f3 = degrees + 90.0f;
        if (f3 > 360.0f) {
            f3 -= 360.0f;
        }
        MPPointF.recycleInstance(centerOffsets);
        return f3;
    }

    public float getDiameter() {
        RectF contentRect = this.mViewPortHandler.getContentRect();
        contentRect.left += getExtraLeftOffset();
        contentRect.top += getExtraTopOffset();
        contentRect.right -= getExtraRightOffset();
        contentRect.bottom -= getExtraBottomOffset();
        return Math.min(contentRect.width(), contentRect.height());
    }

    public abstract int getIndexForAngle(float f);

    @Override // com.github.mikephil.charting.interfaces.dataprovider.ChartInterface
    public int getMaxVisibleCount() {
        return this.mData.getEntryCount();
    }

    public float getMinOffset() {
        return this.mMinOffset;
    }

    public MPPointF getPosition(MPPointF mPPointF, float f, float f2) {
        MPPointF mPPointF2 = MPPointF.getInstance(0.0f, 0.0f);
        getPosition(mPPointF, f, f2, mPPointF2);
        return mPPointF2;
    }

    public abstract float getRadius();

    public float getRawRotationAngle() {
        return this.l;
    }

    public abstract float getRequiredBaseOffset();

    public abstract float getRequiredLegendOffset();

    public float getRotationAngle() {
        return this.k;
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

    public void setMinOffset(float f) {
        this.mMinOffset = f;
    }

    public void setRotationAngle(float f) {
        this.l = f;
        this.k = Utils.getNormalizedAngle(f);
    }

    public void setRotationEnabled(boolean z) {
        this.mRotateEnabled = z;
    }

    @SuppressLint({"NewApi"})
    public void spin(int i, float f, float f2, Easing.EasingFunction easingFunction) {
        setRotationAngle(f);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "rotationAngle", f, f2);
        objectAnimatorOfFloat.setDuration(i);
        objectAnimatorOfFloat.setInterpolator(easingFunction);
        objectAnimatorOfFloat.addUpdateListener(new a());
        objectAnimatorOfFloat.start();
    }

    public void getPosition(MPPointF mPPointF, float f, float f2, MPPointF mPPointF2) {
        double d = f;
        double d2 = f2;
        mPPointF2.x = (float) (((double) mPPointF.x) + (Math.cos(Math.toRadians(d2)) * d));
        mPPointF2.y = (float) (((double) mPPointF.y) + (d * Math.sin(Math.toRadians(d2))));
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.k = 270.0f;
        this.l = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    public PieRadarChartBase(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = 270.0f;
        this.l = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }
}
