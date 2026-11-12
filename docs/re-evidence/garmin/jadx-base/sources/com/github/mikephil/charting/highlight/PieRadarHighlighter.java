package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.charts.PieRadarChartBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public abstract class PieRadarHighlighter<T extends PieRadarChartBase> implements IHighlighter {
    protected T mChart;
    protected List<Highlight> mHighlightBuffer = new ArrayList();

    public PieRadarHighlighter(T t7) {
        this.mChart = t7;
    }

    public abstract Highlight getClosestHighlight(int i14, float f14, float f15);

    @Override // com.github.mikephil.charting.highlight.IHighlighter
    public Highlight getHighlight(float f14, float f15) {
        if (this.mChart.distanceToCenter(f14, f15) > this.mChart.getRadius()) {
            return null;
        }
        float angleForPoint = this.mChart.getAngleForPoint(f14, f15);
        T t7 = this.mChart;
        if (t7 instanceof PieChart) {
            angleForPoint /= t7.getAnimator().getPhaseY();
        }
        int indexForAngle = this.mChart.getIndexForAngle(angleForPoint);
        if (indexForAngle < 0 || indexForAngle >= this.mChart.getData().getMaxEntryCountSet().getEntryCount()) {
            return null;
        }
        return getClosestHighlight(indexForAngle, f14, f15);
    }
}
