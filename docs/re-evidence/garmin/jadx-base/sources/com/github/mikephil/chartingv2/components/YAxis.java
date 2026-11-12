package com.github.mikephil.chartingv2.components;

import android.graphics.Paint;
import com.github.mikephil.chartingv2.formatter.DefaultValueFormatter;
import com.github.mikephil.chartingv2.formatter.DefaultYAxisValueFormatter;
import com.github.mikephil.chartingv2.formatter.YAxisValueFormatter;
import com.github.mikephil.chartingv2.utils.Utils;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class YAxis extends AxisBase {
    private AxisDependency mAxisDependency;
    public int mDecimals;
    private boolean mDrawTopYLabelEntry;
    protected boolean mDrawZeroLine;
    public float[] mEntries;
    public int mEntryCount;
    protected boolean mForceLabels;
    protected float mGranularity;
    protected boolean mGranularityEnabled;
    protected boolean mInverted;
    private int mLabelCount;
    protected float mMaxWidth;
    protected float mMinWidth;
    private YAxisLabelPosition mPosition;
    protected boolean mShowOnlyMinMax;
    protected float mSpacePercentBottom;
    protected float mSpacePercentTop;
    protected YAxisValueFormatter mYAxisValueFormatter;
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
        this.mEntries = new float[0];
        this.mLabelCount = 6;
        this.mDrawTopYLabelEntry = true;
        this.mShowOnlyMinMax = false;
        this.mInverted = false;
        this.mForceLabels = false;
        this.mDrawZeroLine = false;
        this.mZeroLineColor = -7829368;
        this.mZeroLineWidth = 1.0f;
        this.mSpacePercentTop = 10.0f;
        this.mSpacePercentBottom = 10.0f;
        this.mPosition = YAxisLabelPosition.OUTSIDE_CHART;
        this.mMinWidth = 0.0f;
        this.mMaxWidth = Float.POSITIVE_INFINITY;
        this.mGranularityEnabled = true;
        this.mGranularity = 1.0f;
        this.mAxisDependency = AxisDependency.LEFT;
        this.mYOffset = 0.0f;
    }

    public void calcMinMax(float f14, float f15) {
        if (this.mCustomAxisMin) {
            f14 = this.mAxisMinimum;
        }
        if (this.mCustomAxisMax) {
            f15 = this.mAxisMaximum;
        }
        float fAbs = Math.abs(f15 - f14);
        if (fAbs == 0.0f) {
            f15 += 1.0f;
            f14 -= 1.0f;
        }
        if (!this.mCustomAxisMin) {
            this.mAxisMinimum = f14 - (getSpaceBottom() * (fAbs / 100.0f));
        }
        if (!this.mCustomAxisMax) {
            this.mAxisMaximum = (getSpaceTop() * (fAbs / 100.0f)) + f15;
        }
        this.mAxisRange = Math.abs(this.mAxisMaximum - this.mAxisMinimum);
    }

    public AxisDependency getAxisDependency() {
        return this.mAxisDependency;
    }

    public String getFormattedLabel(int i14) {
        return (i14 < 0 || i14 >= this.mEntries.length) ? "" : getValueFormatter().getFormattedValue(this.mEntries[i14], this);
    }

    public float getGranularity() {
        return this.mGranularity;
    }

    public int getLabelCount() {
        return this.mLabelCount;
    }

    public YAxisLabelPosition getLabelPosition() {
        return this.mPosition;
    }

    @Override // com.github.mikephil.chartingv2.components.AxisBase
    public String getLongestLabel() {
        String str = "";
        for (int i14 = 0; i14 < this.mEntries.length; i14++) {
            String formattedLabel = getFormattedLabel(i14);
            if (str.length() < formattedLabel.length()) {
                str = formattedLabel;
            }
        }
        return str;
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

    public YAxisValueFormatter getValueFormatter() {
        if (this.mYAxisValueFormatter == null) {
            this.mYAxisValueFormatter = new DefaultYAxisValueFormatter(this.mDecimals);
        }
        return this.mYAxisValueFormatter;
    }

    public int getZeroLineColor() {
        return this.mZeroLineColor;
    }

    public float getZeroLineWidth() {
        return this.mZeroLineWidth;
    }

    public boolean isDrawTopYLabelEntryEnabled() {
        return this.mDrawTopYLabelEntry;
    }

    public boolean isDrawZeroLineEnabled() {
        return this.mDrawZeroLine;
    }

    public boolean isForceLabelsEnabled() {
        return this.mForceLabels;
    }

    public boolean isGranularityEnabled() {
        return this.mGranularityEnabled;
    }

    public boolean isInverted() {
        return this.mInverted;
    }

    public boolean isShowOnlyMinMaxEnabled() {
        return this.mShowOnlyMinMax;
    }

    public boolean needsDefaultFormatter() {
        YAxisValueFormatter yAxisValueFormatter = this.mYAxisValueFormatter;
        return yAxisValueFormatter == null || (yAxisValueFormatter instanceof DefaultValueFormatter);
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

    public void setGranularity(float f14) {
        this.mGranularity = f14;
    }

    public void setGranularityEnabled(boolean z14) {
        this.mGranularityEnabled = true;
    }

    public void setInverted(boolean z14) {
        this.mInverted = z14;
    }

    public void setLabelCount(int i14, boolean z14) {
        if (i14 > 25) {
            i14 = 25;
        }
        if (i14 < 2) {
            i14 = 2;
        }
        this.mLabelCount = i14;
        this.mForceLabels = z14;
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

    public void setShowOnlyMinMax(boolean z14) {
        this.mShowOnlyMinMax = z14;
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
            setAxisMinValue(0.0f);
        } else {
            resetAxisMinValue();
        }
    }

    public void setValueFormatter(YAxisValueFormatter yAxisValueFormatter) {
        if (yAxisValueFormatter == null) {
            this.mYAxisValueFormatter = new DefaultYAxisValueFormatter(this.mDecimals);
        } else {
            this.mYAxisValueFormatter = yAxisValueFormatter;
        }
    }

    public void setZeroLineColor(int i14) {
        this.mZeroLineColor = i14;
    }

    public void setZeroLineWidth(float f14) {
        this.mZeroLineWidth = Utils.convertDpToPixel(f14);
    }

    public YAxis(AxisDependency axisDependency) {
        this.mEntries = new float[0];
        this.mLabelCount = 6;
        this.mDrawTopYLabelEntry = true;
        this.mShowOnlyMinMax = false;
        this.mInverted = false;
        this.mForceLabels = false;
        this.mDrawZeroLine = false;
        this.mZeroLineColor = -7829368;
        this.mZeroLineWidth = 1.0f;
        this.mSpacePercentTop = 10.0f;
        this.mSpacePercentBottom = 10.0f;
        this.mPosition = YAxisLabelPosition.OUTSIDE_CHART;
        this.mMinWidth = 0.0f;
        this.mMaxWidth = Float.POSITIVE_INFINITY;
        this.mGranularityEnabled = true;
        this.mGranularity = 1.0f;
        this.mAxisDependency = axisDependency;
        this.mYOffset = 0.0f;
    }
}
