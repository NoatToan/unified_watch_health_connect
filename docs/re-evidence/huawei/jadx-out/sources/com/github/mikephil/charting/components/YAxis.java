package com.github.mikephil.charting.components;

import android.graphics.Paint;
import com.github.mikephil.charting.utils.Utils;

/* JADX INFO: loaded from: classes4.dex */
public class YAxis extends AxisBase {
    private AxisDependency mAxisDependency;
    private boolean mDrawBottomYLabelEntry;
    private boolean mDrawTopYLabelEntry;
    protected boolean mDrawZeroLine;
    protected boolean mInverted;
    protected float mMaxWidth;
    protected float mMinWidth;
    private YAxisLabelPosition mPosition;
    protected float mSpacePercentBottom;
    protected float mSpacePercentTop;
    private boolean mUseAutoScaleRestrictionMax;
    private boolean mUseAutoScaleRestrictionMin;
    private float mXLabelOffset;
    protected int mZeroLineColor;
    protected float mZeroLineWidth;

    public enum AxisDependency {
        LEFT,
        RIGHT
    }

    public enum YAxisLabelPosition {
        OUTSIDE_CHART,
        INSIDE_CHART
    }

    public YAxis() {
        this.mDrawBottomYLabelEntry = true;
        this.mDrawTopYLabelEntry = true;
        this.mInverted = false;
        this.mDrawZeroLine = false;
        this.mUseAutoScaleRestrictionMin = false;
        this.mUseAutoScaleRestrictionMax = false;
        this.mZeroLineColor = -7829368;
        this.mZeroLineWidth = 1.0f;
        this.mSpacePercentTop = 10.0f;
        this.mSpacePercentBottom = 10.0f;
        this.mPosition = YAxisLabelPosition.OUTSIDE_CHART;
        this.mXLabelOffset = 0.0f;
        this.mMinWidth = 0.0f;
        this.mMaxWidth = Float.POSITIVE_INFINITY;
        this.mAxisDependency = AxisDependency.LEFT;
        this.mYOffset = 0.0f;
    }

    public YAxis(AxisDependency axisDependency) {
        this.mDrawBottomYLabelEntry = true;
        this.mDrawTopYLabelEntry = true;
        this.mInverted = false;
        this.mDrawZeroLine = false;
        this.mUseAutoScaleRestrictionMin = false;
        this.mUseAutoScaleRestrictionMax = false;
        this.mZeroLineColor = -7829368;
        this.mZeroLineWidth = 1.0f;
        this.mSpacePercentTop = 10.0f;
        this.mSpacePercentBottom = 10.0f;
        this.mPosition = YAxisLabelPosition.OUTSIDE_CHART;
        this.mXLabelOffset = 0.0f;
        this.mMinWidth = 0.0f;
        this.mMaxWidth = Float.POSITIVE_INFINITY;
        this.mAxisDependency = axisDependency;
        this.mYOffset = 0.0f;
    }

    public AxisDependency getAxisDependency() {
        return this.mAxisDependency;
    }

    public float getMinWidth() {
        return this.mMinWidth;
    }

    public void setMinWidth(float f) {
        this.mMinWidth = f;
    }

    public float getMaxWidth() {
        return this.mMaxWidth;
    }

    public void setMaxWidth(float f) {
        this.mMaxWidth = f;
    }

    public YAxisLabelPosition getLabelPosition() {
        return this.mPosition;
    }

    public void setPosition(YAxisLabelPosition yAxisLabelPosition) {
        this.mPosition = yAxisLabelPosition;
    }

    public float getLabelXOffset() {
        return this.mXLabelOffset;
    }

    public void setLabelXOffset(float f) {
        this.mXLabelOffset = f;
    }

    public boolean isDrawTopYLabelEntryEnabled() {
        return this.mDrawTopYLabelEntry;
    }

    public boolean isDrawBottomYLabelEntryEnabled() {
        return this.mDrawBottomYLabelEntry;
    }

    public void setDrawTopYLabelEntry(boolean z) {
        this.mDrawTopYLabelEntry = z;
    }

    public void setInverted(boolean z) {
        this.mInverted = z;
    }

    public boolean isInverted() {
        return this.mInverted;
    }

    @Deprecated
    public void setStartAtZero(boolean z) {
        if (z) {
            setAxisMinimum(0.0f);
        } else {
            resetAxisMinimum();
        }
    }

    public void setSpaceTop(float f) {
        this.mSpacePercentTop = f;
    }

    public float getSpaceTop() {
        return this.mSpacePercentTop;
    }

    public void setSpaceBottom(float f) {
        this.mSpacePercentBottom = f;
    }

    public float getSpaceBottom() {
        return this.mSpacePercentBottom;
    }

    public boolean isDrawZeroLineEnabled() {
        return this.mDrawZeroLine;
    }

    public void setDrawZeroLine(boolean z) {
        this.mDrawZeroLine = z;
    }

    public int getZeroLineColor() {
        return this.mZeroLineColor;
    }

    public void setZeroLineColor(int i) {
        this.mZeroLineColor = i;
    }

    public float getZeroLineWidth() {
        return this.mZeroLineWidth;
    }

    public void setZeroLineWidth(float f) {
        this.mZeroLineWidth = Utils.convertDpToPixel(f);
    }

    public float getRequiredWidthSpace(Paint paint) {
        paint.setTextSize(this.mTextSize);
        float fCalcTextWidth = Utils.calcTextWidth(paint, getLongestLabel()) + (getXOffset() * 2.0f);
        float minWidth = getMinWidth();
        float maxWidth = getMaxWidth();
        if (minWidth > 0.0f) {
            minWidth = Utils.convertDpToPixel(minWidth);
        }
        if (maxWidth > 0.0f && maxWidth != Float.POSITIVE_INFINITY) {
            maxWidth = Utils.convertDpToPixel(maxWidth);
        }
        if (maxWidth <= 0.0d) {
            maxWidth = fCalcTextWidth;
        }
        return Math.max(minWidth, Math.min(fCalcTextWidth, maxWidth));
    }

    public float getRequiredHeightSpace(Paint paint) {
        paint.setTextSize(this.mTextSize);
        return Utils.calcTextHeight(paint, getLongestLabel()) + (getYOffset() * 2.0f);
    }

    public boolean needsOffset() {
        return isEnabled() && isDrawLabelsEnabled() && getLabelPosition() == YAxisLabelPosition.OUTSIDE_CHART;
    }

    @Deprecated
    public boolean isUseAutoScaleMinRestriction() {
        return this.mUseAutoScaleRestrictionMin;
    }

    @Deprecated
    public void setUseAutoScaleMinRestriction(boolean z) {
        this.mUseAutoScaleRestrictionMin = z;
    }

    @Deprecated
    public boolean isUseAutoScaleMaxRestriction() {
        return this.mUseAutoScaleRestrictionMax;
    }

    @Deprecated
    public void setUseAutoScaleMaxRestriction(boolean z) {
        this.mUseAutoScaleRestrictionMax = z;
    }

    @Override // com.github.mikephil.charting.components.AxisBase
    public void calculate(float f, float f2) {
        if (f <= f2) {
            f2 = f;
            f = f2;
        } else if (!this.mCustomAxisMax || !this.mCustomAxisMin) {
            if (this.mCustomAxisMax) {
                f = f2 < 0.0f ? f2 * 1.5f : f2 * 0.5f;
            } else if (this.mCustomAxisMin) {
                f2 = f;
                f = f < 0.0f ? 0.5f * f : f * 1.5f;
            }
            f2 = f;
            f = f2;
        }
        if (Math.abs(f - f2) == 0.0f) {
            f += 1.0f;
            f2 -= 1.0f;
        }
        float fAbs = Math.abs(f - f2);
        this.mAxisMinimum = this.mCustomAxisMin ? this.mAxisMinimum : f2 - ((fAbs / 100.0f) * getSpaceBottom());
        this.mAxisMaximum = this.mCustomAxisMax ? this.mAxisMaximum : f + ((fAbs / 100.0f) * getSpaceTop());
        this.mAxisRange = Math.abs(this.mAxisMinimum - this.mAxisMaximum);
    }
}
