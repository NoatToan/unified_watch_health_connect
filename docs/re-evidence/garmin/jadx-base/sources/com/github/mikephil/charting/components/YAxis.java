package com.github.mikephil.charting.components;

import android.graphics.Paint;
import com.github.mikephil.charting.utils.Utils;

/* JADX INFO: loaded from: classes13.dex */
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
        this.mMinWidth = 0.0f;
        this.mMaxWidth = Float.POSITIVE_INFINITY;
        this.mAxisDependency = AxisDependency.LEFT;
        this.mYOffset = 0.0f;
    }

    @Override // com.github.mikephil.charting.components.AxisBase
    public void calculate(float f14, float f15) {
        float spaceBottom;
        float spaceTop;
        if (Math.abs(f15 - f14) == 0.0f) {
            f15 += 1.0f;
            f14 -= 1.0f;
        }
        float fAbs = Math.abs(f15 - f14);
        if (this.mCustomAxisMin) {
            spaceBottom = this.mAxisMinimum;
        } else {
            spaceBottom = f14 - (getSpaceBottom() * (fAbs / 100.0f));
        }
        this.mAxisMinimum = spaceBottom;
        if (this.mCustomAxisMax) {
            spaceTop = this.mAxisMaximum;
        } else {
            spaceTop = (getSpaceTop() * (fAbs / 100.0f)) + f15;
        }
        this.mAxisMaximum = spaceTop;
        this.mAxisRange = Math.abs(this.mAxisMinimum - spaceTop);
    }

    public AxisDependency getAxisDependency() {
        return this.mAxisDependency;
    }

    public YAxisLabelPosition getLabelPosition() {
        return this.mPosition;
    }

    public float getMaxWidth() {
        return this.mMaxWidth;
    }

    public float getMinWidth() {
        return this.mMinWidth;
    }

    public float getRequiredHeightSpace(Paint paint) {
        paint.setTextSize(this.mTextSize);
        return (getYOffset() * 2.0f) + Utils.calcTextHeight(paint, getLongestLabel());
    }

    public float getRequiredWidthSpace(Paint paint) {
        paint.setTextSize(this.mTextSize);
        float xOffset = (getXOffset() * 2.0f) + Utils.calcTextWidth(paint, getLongestLabel());
        float minWidth = getMinWidth();
        float maxWidth = getMaxWidth();
        if (minWidth > 0.0f) {
            minWidth = Utils.convertDpToPixel(minWidth);
        }
        if (maxWidth > 0.0f && maxWidth != Float.POSITIVE_INFINITY) {
            maxWidth = Utils.convertDpToPixel(maxWidth);
        }
        if (maxWidth <= 0.0d) {
            maxWidth = xOffset;
        }
        return Math.max(minWidth, Math.min(xOffset, maxWidth));
    }

    public float getSpaceBottom() {
        return this.mSpacePercentBottom;
    }

    public float getSpaceTop() {
        return this.mSpacePercentTop;
    }

    public int getZeroLineColor() {
        return this.mZeroLineColor;
    }

    public float getZeroLineWidth() {
        return this.mZeroLineWidth;
    }

    public boolean isDrawBottomYLabelEntryEnabled() {
        return this.mDrawBottomYLabelEntry;
    }

    public boolean isDrawTopYLabelEntryEnabled() {
        return this.mDrawTopYLabelEntry;
    }

    public boolean isDrawZeroLineEnabled() {
        return this.mDrawZeroLine;
    }

    public boolean isInverted() {
        return this.mInverted;
    }

    @Deprecated
    public boolean isUseAutoScaleMaxRestriction() {
        return this.mUseAutoScaleRestrictionMax;
    }

    @Deprecated
    public boolean isUseAutoScaleMinRestriction() {
        return this.mUseAutoScaleRestrictionMin;
    }

    public boolean needsOffset() {
        return isEnabled() && isDrawLabelsEnabled() && getLabelPosition() == YAxisLabelPosition.OUTSIDE_CHART;
    }

    public void setDrawTopYLabelEntry(boolean z14) {
        this.mDrawTopYLabelEntry = z14;
    }

    public void setDrawZeroLine(boolean z14) {
        this.mDrawZeroLine = z14;
    }

    public void setInverted(boolean z14) {
        this.mInverted = z14;
    }

    public void setMaxWidth(float f14) {
        this.mMaxWidth = f14;
    }

    public void setMinWidth(float f14) {
        this.mMinWidth = f14;
    }

    public void setPosition(YAxisLabelPosition yAxisLabelPosition) {
        this.mPosition = yAxisLabelPosition;
    }

    public void setSpaceBottom(float f14) {
        this.mSpacePercentBottom = f14;
    }

    public void setSpaceTop(float f14) {
        this.mSpacePercentTop = f14;
    }

    @Deprecated
    public void setStartAtZero(boolean z14) {
        if (z14) {
            setAxisMinimum(0.0f);
        } else {
            resetAxisMinimum();
        }
    }

    @Deprecated
    public void setUseAutoScaleMaxRestriction(boolean z14) {
        this.mUseAutoScaleRestrictionMax = z14;
    }

    @Deprecated
    public void setUseAutoScaleMinRestriction(boolean z14) {
        this.mUseAutoScaleRestrictionMin = z14;
    }

    public void setZeroLineColor(int i14) {
        this.mZeroLineColor = i14;
    }

    public void setZeroLineWidth(float f14) {
        this.mZeroLineWidth = Utils.convertDpToPixel(f14);
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
        this.mMinWidth = 0.0f;
        this.mMaxWidth = Float.POSITIVE_INFINITY;
        this.mAxisDependency = axisDependency;
        this.mYOffset = 0.0f;
    }
}
