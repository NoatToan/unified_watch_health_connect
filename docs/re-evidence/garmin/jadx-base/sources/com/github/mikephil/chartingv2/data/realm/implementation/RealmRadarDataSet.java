package com.github.mikephil.chartingv2.data.realm.implementation;

import com.github.mikephil.chartingv2.data.realm.base.RealmLineRadarDataSet;
import com.github.mikephil.chartingv2.interfaces.datasets.IRadarDataSet;
import io.realm.RealmObject;
import io.realm.RealmResults;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public class RealmRadarDataSet<T extends RealmObject> extends RealmLineRadarDataSet<T> implements IRadarDataSet {
    protected boolean mDrawHighlightCircleEnabled;
    protected int mHighlightCircleFillColor;
    protected float mHighlightCircleInnerRadius;
    protected float mHighlightCircleOuterRadius;
    protected int mHighlightCircleStrokeAlpha;
    protected int mHighlightCircleStrokeColor;
    protected float mHighlightCircleStrokeWidth;

    public RealmRadarDataSet(RealmResults<T> realmResults, String str) {
        super(realmResults, str);
        this.mDrawHighlightCircleEnabled = false;
        this.mHighlightCircleFillColor = -1;
        this.mHighlightCircleStrokeColor = 1122867;
        this.mHighlightCircleStrokeAlpha = 76;
        this.mHighlightCircleInnerRadius = 3.0f;
        this.mHighlightCircleOuterRadius = 4.0f;
        this.mHighlightCircleStrokeWidth = 2.0f;
        build(this.results);
        calcMinMax(0, this.results.size());
    }

    @Override // com.github.mikephil.chartingv2.data.realm.base.RealmLineRadarDataSet, com.github.mikephil.chartingv2.data.realm.base.RealmBaseDataSet
    public void build(RealmResults<T> realmResults) {
        super.build(realmResults);
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IRadarDataSet
    public int getHighlightCircleFillColor() {
        return this.mHighlightCircleFillColor;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IRadarDataSet
    public float getHighlightCircleInnerRadius() {
        return this.mHighlightCircleInnerRadius;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IRadarDataSet
    public float getHighlightCircleOuterRadius() {
        return this.mHighlightCircleOuterRadius;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IRadarDataSet
    public int getHighlightCircleStrokeAlpha() {
        return this.mHighlightCircleStrokeAlpha;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IRadarDataSet
    public int getHighlightCircleStrokeColor() {
        return this.mHighlightCircleStrokeColor;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IRadarDataSet
    public float getHighlightCircleStrokeWidth() {
        return this.mHighlightCircleStrokeWidth;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IRadarDataSet
    public boolean isDrawHighlightCircleEnabled() {
        return this.mDrawHighlightCircleEnabled;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.IRadarDataSet
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

    public RealmRadarDataSet(RealmResults<T> realmResults, String str, String str2) {
        super(realmResults, str, str2);
        this.mDrawHighlightCircleEnabled = false;
        this.mHighlightCircleFillColor = -1;
        this.mHighlightCircleStrokeColor = 1122867;
        this.mHighlightCircleStrokeAlpha = 76;
        this.mHighlightCircleInnerRadius = 3.0f;
        this.mHighlightCircleOuterRadius = 4.0f;
        this.mHighlightCircleStrokeWidth = 2.0f;
        build(this.results);
        calcMinMax(0, this.results.size());
    }
}
