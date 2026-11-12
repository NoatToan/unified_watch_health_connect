package com.github.mikephil.chartingv2.charts;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.github.mikephil.chartingv2.animation.Easing;
import com.github.mikephil.chartingv2.components.Legend;
import com.github.mikephil.chartingv2.components.XAxis;
import com.github.mikephil.chartingv2.data.ChartData;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.interfaces.datasets.IDataSet;
import com.github.mikephil.chartingv2.listener.ChartTouchListener;
import com.github.mikephil.chartingv2.listener.PieRadarChartTouchListener;
import com.github.mikephil.chartingv2.utils.SelectionDetail;
import com.github.mikephil.chartingv2.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class PieRadarChartBase<T extends ChartData<? extends IDataSet<? extends Entry>>> extends Chart<T> {
    protected float mMinOffset;
    private float mRawRotationAngle;
    protected boolean mRotateEnabled;
    private float mRotationAngle;

    public PieRadarChartBase(Context context) {
        super(context);
        this.mRotationAngle = 270.0f;
        this.mRawRotationAngle = 270.0f;
        this.mRotateEnabled = true;
        this.mMinOffset = 0.0f;
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart
    public void calcMinMax() {
        this.mXAxis.mAxisRange = this.mData.getXVals().size() - 1;
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart
    public void calculateOffsets() {
        float requiredBaseOffset;
        float requiredBaseOffset2;
        float fMin;
        float fMin2;
        float fConvertDpToPixel;
        float fConvertDpToPixel2;
        Legend legend = this.mLegend;
        float requiredBaseOffset3 = 0.0f;
        if (legend == null || !legend.isEnabled()) {
            requiredBaseOffset = 0.0f;
            requiredBaseOffset2 = 0.0f;
            fMin = 0.0f;
        } else {
            float formToTextSpace = this.mLegend.getFormToTextSpace() + this.mLegend.getFormSize() + Math.min(this.mLegend.mNeededWidth, this.mLegend.getMaxSizePercent() * this.mViewPortHandler.getChartWidth());
            if (this.mLegend.getPosition() == Legend.LegendPosition.RIGHT_OF_CHART_CENTER) {
                fConvertDpToPixel = Utils.convertDpToPixel(13.0f) + formToTextSpace;
            } else {
                if (this.mLegend.getPosition() == Legend.LegendPosition.RIGHT_OF_CHART) {
                    fConvertDpToPixel = Utils.convertDpToPixel(8.0f) + formToTextSpace;
                    Legend legend2 = this.mLegend;
                    float f14 = legend2.mNeededHeight + legend2.mTextHeightMax;
                    PointF center = getCenter();
                    PointF pointF = new PointF((getWidth() - fConvertDpToPixel) + 15.0f, f14 + 15.0f);
                    float fDistanceToCenter = distanceToCenter(pointF.x, pointF.y);
                    PointF position = getPosition(center, getRadius(), getAngleForPoint(pointF.x, pointF.y));
                    float fDistanceToCenter2 = distanceToCenter(position.x, position.y);
                    float fConvertDpToPixel3 = fDistanceToCenter < fDistanceToCenter2 ? (fDistanceToCenter2 - fDistanceToCenter) + Utils.convertDpToPixel(5.0f) : 0.0f;
                    if (pointF.y < center.y || getHeight() - fConvertDpToPixel <= getWidth()) {
                        fConvertDpToPixel = fConvertDpToPixel3;
                    }
                } else {
                    if (this.mLegend.getPosition() == Legend.LegendPosition.LEFT_OF_CHART_CENTER) {
                        fConvertDpToPixel2 = Utils.convertDpToPixel(13.0f) + formToTextSpace;
                    } else if (this.mLegend.getPosition() == Legend.LegendPosition.LEFT_OF_CHART) {
                        fConvertDpToPixel2 = Utils.convertDpToPixel(8.0f) + formToTextSpace;
                        Legend legend3 = this.mLegend;
                        float f15 = legend3.mNeededHeight + legend3.mTextHeightMax;
                        PointF center2 = getCenter();
                        PointF pointF2 = new PointF(fConvertDpToPixel2 - 15.0f, f15 + 15.0f);
                        float fDistanceToCenter3 = distanceToCenter(pointF2.x, pointF2.y);
                        PointF position2 = getPosition(center2, getRadius(), getAngleForPoint(pointF2.x, pointF2.y));
                        float fDistanceToCenter4 = distanceToCenter(position2.x, position2.y);
                        float fConvertDpToPixel4 = fDistanceToCenter3 < fDistanceToCenter4 ? (fDistanceToCenter4 - fDistanceToCenter3) + Utils.convertDpToPixel(5.0f) : 0.0f;
                        if (pointF2.y < center2.y || getHeight() - fConvertDpToPixel2 <= getWidth()) {
                            fConvertDpToPixel2 = fConvertDpToPixel4;
                        }
                    } else if (this.mLegend.getPosition() == Legend.LegendPosition.BELOW_CHART_LEFT || this.mLegend.getPosition() == Legend.LegendPosition.BELOW_CHART_RIGHT || this.mLegend.getPosition() == Legend.LegendPosition.BELOW_CHART_CENTER) {
                        fMin = Math.min(this.mLegend.mNeededHeight + getRequiredLegendOffset(), this.mLegend.getMaxSizePercent() * this.mViewPortHandler.getChartHeight());
                        fMin2 = 0.0f;
                        fConvertDpToPixel = 0.0f;
                    } else {
                        if (this.mLegend.getPosition() == Legend.LegendPosition.ABOVE_CHART_LEFT || this.mLegend.getPosition() == Legend.LegendPosition.ABOVE_CHART_RIGHT || this.mLegend.getPosition() == Legend.LegendPosition.ABOVE_CHART_CENTER) {
                            fMin2 = Math.min(this.mLegend.mNeededHeight + getRequiredLegendOffset(), this.mLegend.getMaxSizePercent() * this.mViewPortHandler.getChartHeight());
                            fConvertDpToPixel = 0.0f;
                        } else {
                            fMin2 = 0.0f;
                            fConvertDpToPixel = 0.0f;
                        }
                        fMin = fConvertDpToPixel;
                    }
                    fMin2 = 0.0f;
                    fMin = 0.0f;
                    requiredBaseOffset3 = fConvertDpToPixel2;
                    fConvertDpToPixel = 0.0f;
                }
                requiredBaseOffset3 += getRequiredBaseOffset();
                requiredBaseOffset2 = fConvertDpToPixel + getRequiredBaseOffset();
                requiredBaseOffset = fMin2 + getRequiredBaseOffset();
            }
            fMin2 = 0.0f;
            fMin = 0.0f;
            requiredBaseOffset3 += getRequiredBaseOffset();
            requiredBaseOffset2 = fConvertDpToPixel + getRequiredBaseOffset();
            requiredBaseOffset = fMin2 + getRequiredBaseOffset();
        }
        float fConvertDpToPixel5 = Utils.convertDpToPixel(this.mMinOffset);
        if (this instanceof RadarChart) {
            XAxis xAxis = ((RadarChart) this).getXAxis();
            if (xAxis.isEnabled() && xAxis.isDrawLabelsEnabled()) {
                fConvertDpToPixel5 = Math.max(fConvertDpToPixel5, xAxis.mLabelRotatedWidth);
            }
        }
        this.mViewPortHandler.restrainViewPort(Math.max(fConvertDpToPixel5, getExtraLeftOffset() + requiredBaseOffset3), Math.max(fConvertDpToPixel5, getExtraTopOffset() + requiredBaseOffset), Math.max(fConvertDpToPixel5, getExtraRightOffset() + requiredBaseOffset2), Math.max(fConvertDpToPixel5, Math.max(getRequiredBaseOffset(), getExtraBottomOffset() + fMin)));
    }

    @Override // android.view.View
    public void computeScroll() {
        ChartTouchListener chartTouchListener = this.mChartTouchListener;
        if (chartTouchListener instanceof PieRadarChartTouchListener) {
            ((PieRadarChartTouchListener) chartTouchListener).computeScroll();
        }
    }

    public float distanceToCenter(float f14, float f15) {
        PointF centerOffsets = getCenterOffsets();
        float f16 = centerOffsets.x;
        float f17 = f14 > f16 ? f14 - f16 : f16 - f14;
        float f18 = centerOffsets.y;
        return (float) Math.sqrt(Math.pow(f15 > f18 ? f15 - f18 : f18 - f15, 2.0d) + Math.pow(f17, 2.0d));
    }

    public float getAngleForPoint(float f14, float f15) {
        PointF centerOffsets = getCenterOffsets();
        double d14 = f14 - centerOffsets.x;
        double d15 = f15 - centerOffsets.y;
        float degrees = (float) Math.toDegrees(Math.acos(d15 / Math.sqrt((d15 * d15) + (d14 * d14))));
        if (f14 > centerOffsets.x) {
            degrees = 360.0f - degrees;
        }
        float f16 = degrees + 90.0f;
        return f16 > 360.0f ? f16 - 360.0f : f16;
    }

    public float getDiameter() {
        RectF contentRect = this.mViewPortHandler.getContentRect();
        return Math.min(contentRect.width(), contentRect.height());
    }

    public abstract int getIndexForAngle(float f14);

    public float getMinOffset() {
        return this.mMinOffset;
    }

    public PointF getPosition(PointF pointF, float f14, float f15) {
        double d14 = f14;
        double d15 = f15;
        return new PointF((float) ((Math.cos(Math.toRadians(d15)) * d14) + ((double) pointF.x)), (float) ((Math.sin(Math.toRadians(d15)) * d14) + ((double) pointF.y)));
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

    public List<SelectionDetail> getSelectionDetailsAtIndex(int i14) {
        ArrayList arrayList = new ArrayList();
        for (int i15 = 0; i15 < this.mData.getDataSetCount(); i15++) {
            IDataSet dataSetByIndex = this.mData.getDataSetByIndex(i15);
            float yValForXIndex = dataSetByIndex.getYValForXIndex(i14);
            if (yValForXIndex != Float.NaN) {
                arrayList.add(new SelectionDetail(yValForXIndex, i15, dataSetByIndex));
            }
        }
        return arrayList;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.ChartInterface
    public float getYChartMax() {
        return 0.0f;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.dataprovider.ChartInterface
    public float getYChartMin() {
        return 0.0f;
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart
    public void init() {
        super.init();
        this.mChartTouchListener = new PieRadarChartTouchListener(this);
    }

    public boolean isRotationEnabled() {
        return this.mRotateEnabled;
    }

    @Override // com.github.mikephil.chartingv2.charts.Chart
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
    public void spin(int i14, float f14, float f15, Easing.EasingOption easingOption) {
        setRotationAngle(f14);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "rotationAngle", f14, f15);
        objectAnimatorOfFloat.setDuration(i14);
        objectAnimatorOfFloat.setInterpolator(Easing.getEasingFunctionFromOption(easingOption));
        objectAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.github.mikephil.chartingv2.charts.PieRadarChartBase.1
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
}
