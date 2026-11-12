package com.github.mikephil.chartingv2.components;

import android.graphics.DashPathEffect;
import com.github.mikephil.chartingv2.utils.Utils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class AxisBase extends ComponentBase {
    protected List<LimitLine> mLimitLines;
    private int mGridColor = -7829368;
    private float mGridLineWidth = 1.0f;
    private int mAxisLineColor = -7829368;
    private float mAxisLineWidth = 1.0f;
    protected boolean mDrawGridLines = true;
    protected boolean mDrawAxisLine = true;
    protected boolean mDrawLabels = true;
    private DashPathEffect mGridDashPathEffect = null;
    protected boolean mDrawLimitLineBehindData = false;
    protected boolean mCustomAxisMin = false;
    protected boolean mCustomAxisMax = false;
    public float mAxisMaximum = 0.0f;
    public float mAxisMinimum = 0.0f;
    public float mAxisRange = 0.0f;

    public AxisBase() {
        this.mTextSize = Utils.convertDpToPixel(10.0f);
        this.mXOffset = Utils.convertDpToPixel(5.0f);
        this.mYOffset = Utils.convertDpToPixel(5.0f);
        this.mLimitLines = new ArrayList();
    }

    public void addLimitLine(LimitLine limitLine) {
        this.mLimitLines.add(limitLine);
        this.mLimitLines.size();
    }

    public void disableGridDashedLine() {
        this.mGridDashPathEffect = null;
    }

    public void enableGridDashedLine(float f14, float f15, float f16) {
        this.mGridDashPathEffect = new DashPathEffect(new float[]{f14, f15}, f16);
    }

    public int getAxisLineColor() {
        return this.mAxisLineColor;
    }

    public float getAxisLineWidth() {
        return this.mAxisLineWidth;
    }

    public float getAxisMaximum() {
        return this.mAxisMaximum;
    }

    public float getAxisMinimum() {
        return this.mAxisMinimum;
    }

    public int getGridColor() {
        return this.mGridColor;
    }

    public DashPathEffect getGridDashPathEffect() {
        return this.mGridDashPathEffect;
    }

    public float getGridLineWidth() {
        return this.mGridLineWidth;
    }

    public List<LimitLine> getLimitLines() {
        return this.mLimitLines;
    }

    public abstract String getLongestLabel();

    public boolean isAxisMaxCustom() {
        return this.mCustomAxisMax;
    }

    public boolean isAxisMinCustom() {
        return this.mCustomAxisMin;
    }

    public boolean isDrawAxisLineEnabled() {
        return this.mDrawAxisLine;
    }

    public boolean isDrawGridLinesEnabled() {
        return this.mDrawGridLines;
    }

    public boolean isDrawLabelsEnabled() {
        return this.mDrawLabels;
    }

    public boolean isDrawLimitLinesBehindDataEnabled() {
        return this.mDrawLimitLineBehindData;
    }

    public boolean isGridDashedLineEnabled() {
        return this.mGridDashPathEffect != null;
    }

    public void removeAllLimitLines() {
        this.mLimitLines.clear();
    }

    public void removeLimitLine(LimitLine limitLine) {
        this.mLimitLines.remove(limitLine);
    }

    public void resetAxisMaxValue() {
        this.mCustomAxisMax = false;
    }

    public void resetAxisMinValue() {
        this.mCustomAxisMin = false;
    }

    public void setAxisLineColor(int i14) {
        this.mAxisLineColor = i14;
    }

    public void setAxisLineWidth(float f14) {
        this.mAxisLineWidth = Utils.convertDpToPixel(f14);
    }

    public void setAxisMaxValue(float f14) {
        this.mCustomAxisMax = true;
        this.mAxisMaximum = f14;
    }

    public void setAxisMinValue(float f14) {
        this.mCustomAxisMin = true;
        this.mAxisMinimum = f14;
    }

    public void setDrawAxisLine(boolean z14) {
        this.mDrawAxisLine = z14;
    }

    public void setDrawGridLines(boolean z14) {
        this.mDrawGridLines = z14;
    }

    public void setDrawLabels(boolean z14) {
        this.mDrawLabels = z14;
    }

    public void setDrawLimitLinesBehindData(boolean z14) {
        this.mDrawLimitLineBehindData = z14;
    }

    public void setGridColor(int i14) {
        this.mGridColor = i14;
    }

    public void setGridLineWidth(float f14) {
        this.mGridLineWidth = Utils.convertDpToPixel(f14);
    }
}
