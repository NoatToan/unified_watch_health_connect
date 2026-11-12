package com.github.mikephil.chartingv2.data.realm.base;

import android.graphics.DashPathEffect;
import com.github.mikephil.chartingv2.data.Entry;
import com.github.mikephil.chartingv2.interfaces.datasets.ILineScatterCandleRadarDataSet;
import com.github.mikephil.chartingv2.utils.Utils;
import io.realm.RealmObject;
import io.realm.RealmResults;

/* JADX INFO: loaded from: classes13.dex */
@Deprecated
public abstract class RealmLineScatterCandleRadarDataSet<T extends RealmObject, S extends Entry> extends RealmBarLineScatterCandleBubbleDataSet<T, S> implements ILineScatterCandleRadarDataSet<S> {
    protected boolean mDrawHorizontalHighlightIndicator;
    protected boolean mDrawVerticalHighlightIndicator;
    protected DashPathEffect mHighlightDashPathEffect;
    protected float mHighlightLineWidth;

    public RealmLineScatterCandleRadarDataSet(RealmResults<T> realmResults, String str) {
        super(realmResults, str);
        this.mDrawVerticalHighlightIndicator = true;
        this.mDrawHorizontalHighlightIndicator = true;
        this.mHighlightLineWidth = 0.5f;
        this.mHighlightDashPathEffect = null;
    }

    public void disableDashedHighlightLine() {
        this.mHighlightDashPathEffect = null;
    }

    public void enableDashedHighlightLine(float f14, float f15, float f16) {
        this.mHighlightDashPathEffect = new DashPathEffect(new float[]{f14, f15}, f16);
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineScatterCandleRadarDataSet
    public DashPathEffect getDashPathEffectHighlight() {
        return this.mHighlightDashPathEffect;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineScatterCandleRadarDataSet
    public float getHighlightLineWidth() {
        return this.mHighlightLineWidth;
    }

    public boolean isDashedHighlightLineEnabled() {
        return this.mHighlightDashPathEffect != null;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineScatterCandleRadarDataSet
    public boolean isHorizontalHighlightIndicatorEnabled() {
        return this.mDrawHorizontalHighlightIndicator;
    }

    @Override // com.github.mikephil.chartingv2.interfaces.datasets.ILineScatterCandleRadarDataSet
    public boolean isVerticalHighlightIndicatorEnabled() {
        return this.mDrawVerticalHighlightIndicator;
    }

    public void setDrawHighlightIndicators(boolean z14) {
        setDrawVerticalHighlightIndicator(z14);
        setDrawHorizontalHighlightIndicator(z14);
    }

    public void setDrawHorizontalHighlightIndicator(boolean z14) {
        this.mDrawHorizontalHighlightIndicator = z14;
    }

    public void setDrawVerticalHighlightIndicator(boolean z14) {
        this.mDrawVerticalHighlightIndicator = z14;
    }

    public void setHighlightLineWidth(float f14) {
        this.mHighlightLineWidth = Utils.convertDpToPixel(f14);
    }

    public RealmLineScatterCandleRadarDataSet(RealmResults<T> realmResults, String str, String str2) {
        super(realmResults, str, str2);
        this.mDrawVerticalHighlightIndicator = true;
        this.mDrawHorizontalHighlightIndicator = true;
        this.mHighlightLineWidth = 0.5f;
        this.mHighlightDashPathEffect = null;
    }
}
