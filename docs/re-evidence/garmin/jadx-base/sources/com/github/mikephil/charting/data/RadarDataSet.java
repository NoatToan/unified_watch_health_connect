package com.github.mikephil.charting.data;

import com.github.mikephil.charting.interfaces.datasets.IRadarDataSet;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class RadarDataSet extends LineRadarDataSet<RadarEntry> implements IRadarDataSet {
    protected boolean mDrawHighlightCircleEnabled;
    protected int mHighlightCircleFillColor;
    protected float mHighlightCircleInnerRadius;
    protected float mHighlightCircleOuterRadius;
    protected int mHighlightCircleStrokeAlpha;
    protected int mHighlightCircleStrokeColor;
    protected float mHighlightCircleStrokeWidth;

    public RadarDataSet(List<RadarEntry> list, String str) {
        super(list, str);
        this.mDrawHighlightCircleEnabled = false;
        this.mHighlightCircleFillColor = -1;
        this.mHighlightCircleStrokeColor = 1122867;
        this.mHighlightCircleStrokeAlpha = 76;
        this.mHighlightCircleInnerRadius = 3.0f;
        this.mHighlightCircleOuterRadius = 4.0f;
        this.mHighlightCircleStrokeWidth = 2.0f;
    }

    @Override // com.github.mikephil.charting.data.DataSet
    public DataSet<RadarEntry> copy() {
        ArrayList arrayList = new ArrayList();
        for (int i14 = 0; i14 < this.mValues.size(); i14++) {
            arrayList.add(((RadarEntry) this.mValues.get(i14)).copy());
        }
        RadarDataSet radarDataSet = new RadarDataSet(arrayList, getLabel());
        copy(radarDataSet);
        return radarDataSet;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public int getHighlightCircleFillColor() {
        return this.mHighlightCircleFillColor;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public float getHighlightCircleInnerRadius() {
        return this.mHighlightCircleInnerRadius;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public float getHighlightCircleOuterRadius() {
        return this.mHighlightCircleOuterRadius;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public int getHighlightCircleStrokeAlpha() {
        return this.mHighlightCircleStrokeAlpha;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public int getHighlightCircleStrokeColor() {
        return this.mHighlightCircleStrokeColor;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public float getHighlightCircleStrokeWidth() {
        return this.mHighlightCircleStrokeWidth;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public boolean isDrawHighlightCircleEnabled() {
        return this.mDrawHighlightCircleEnabled;
    }

    @Override // com.github.mikephil.charting.interfaces.datasets.IRadarDataSet
    public void setDrawHighlightCircleEnabled(boolean z14) {
        this.mDrawHighlightCircleEnabled = z14;
    }

    public void setHighlightCircleFillColor(int i14) {
        this.mHighlightCircleFillColor = i14;
    }

    public void setHighlightCircleInnerRadius(float f14) {
        this.mHighlightCircleInnerRadius = f14;
    }

    public void setHighlightCircleOuterRadius(float f14) {
        this.mHighlightCircleOuterRadius = f14;
    }

    public void setHighlightCircleStrokeAlpha(int i14) {
        this.mHighlightCircleStrokeAlpha = i14;
    }

    public void setHighlightCircleStrokeColor(int i14) {
        this.mHighlightCircleStrokeColor = i14;
    }

    public void setHighlightCircleStrokeWidth(float f14) {
        this.mHighlightCircleStrokeWidth = f14;
    }

    public void copy(RadarDataSet radarDataSet) {
        super.copy((LineRadarDataSet) radarDataSet);
        radarDataSet.mDrawHighlightCircleEnabled = this.mDrawHighlightCircleEnabled;
        radarDataSet.mHighlightCircleFillColor = this.mHighlightCircleFillColor;
        radarDataSet.mHighlightCircleInnerRadius = this.mHighlightCircleInnerRadius;
        radarDataSet.mHighlightCircleStrokeAlpha = this.mHighlightCircleStrokeAlpha;
        radarDataSet.mHighlightCircleStrokeColor = this.mHighlightCircleStrokeColor;
        radarDataSet.mHighlightCircleStrokeWidth = this.mHighlightCircleStrokeWidth;
    }
}
