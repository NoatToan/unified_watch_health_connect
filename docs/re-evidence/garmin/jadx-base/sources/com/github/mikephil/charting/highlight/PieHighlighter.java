package com.github.mikephil.charting.highlight;

import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.interfaces.datasets.IPieDataSet;

/* JADX INFO: loaded from: classes13.dex */
public class PieHighlighter extends PieRadarHighlighter<PieChart> {
    public PieHighlighter(PieChart pieChart) {
        super(pieChart);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.mikephil.charting.highlight.PieRadarHighlighter
    public Highlight getClosestHighlight(int i14, float f14, float f15) {
        IPieDataSet dataSet = ((PieData) ((PieChart) this.mChart).getData()).getDataSet();
        return new Highlight(i14, dataSet.getEntryForIndex(i14).getY(), f14, f15, 0, dataSet.getAxisDependency());
    }
}
